package com.hari.Defect.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(schema = "classidb", name = "classi")
public class Classi  implements Serializable {

    @Id
    String classiId;

    public String getClassiId() {
        return classiId;
    }

    public void setClassiId(String classiId) {
        this.classiId = classiId;
    }

    public String getClassiName() {
        return classiName;
    }

    public void setClassiName(String classiName) {
        this.classiName = classiName;
    }

    String classiName;

}
