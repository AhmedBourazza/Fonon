package org.system.fonon.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "Posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post implements Serializable {

    @Id
    private String id;

    @Field("postTitle")
    @JsonProperty("postTitle")
    private String postTitle;

    @Field("postDescription")
    @JsonProperty("postDescription")
    private String postDescription;

    @Field("userUsername")
    @JsonProperty("userUsername")
    private String userUsername;
}
