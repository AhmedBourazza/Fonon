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

import java.io.Serializable;

@Document(collection = "Picture")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Picture implements Serializable {


    @Id
    private String id;


    @Field("pictureData")
    @JsonProperty("pictureData")
    private Binary pictureData;

    @Field("postId")
    @JsonProperty("postId")
    private String postId;

}
