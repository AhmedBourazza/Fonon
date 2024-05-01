package org.system.fonon.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.index.Indexed;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document(collection = "Users")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class User implements Serializable {
    @Id
    private String id;

    @Field("username")
    @JsonProperty("username")
    @Indexed(unique = true)
    private String username;

    @Field("firstName")
    @JsonProperty("firstName")
    private String firstName;

    @Field("lastName")
    @JsonProperty("lastName")
    private String lastName;

    private String email;
    private String password;
    private Date dateOfBirth;

    @Field("gender")
    @JsonProperty("gender")
    private String gender;

    @Field("phoneNumber")
    @JsonProperty("phoneNumber")
    private String phoneNumber;


    @Field("photoProfil")
    @JsonProperty("photoProfil")
    private Binary photoProfil;

    @Field("role")
    @JsonProperty("role")
    private String role;

    /*remarque pour moi : je peux ajouter ici une liste pour stocker les images,
    vu que j'utilise une bs no sql (mongo db) mais pour des raison d'optimisation j'ai decide
    de creer une collection toute entire .
    exemple : si je fais l'authentification, je suis besoin de charger l'utilisateur tout seul ,
    et non pas tous les images :)



    */
}
