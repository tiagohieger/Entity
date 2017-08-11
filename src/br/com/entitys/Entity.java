package br.com.entitys;

import br.com.annotations.Column;
import br.com.annotations.Id;
import br.com.constants.HasId;
import br.com.constants.HasRegistrationDate;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@" + Entity.Columns.ID, scope = Entity.class)
public abstract class Entity implements Serializable, HasId, HasRegistrationDate {

    private static final long serialVersionUID = -5459623455250438946L;

    public static final String TABLE_NAME = null;

    public interface Columns {

        public static final String ID = "id";
        public static final String REGISTRATION_DATE = "registration_date";
    }

    @Id(name = Entity.Columns.ID)
    private Integer id;

    @Column(notNull = true, defaultValue = "now()", name = Entity.Columns.REGISTRATION_DATE)
    private Date registrationDate;

    public Entity() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Date getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Entity other = (Entity) obj;
        return Objects.equals(this.id, other.getId());
    }

    public static String fullColumn(final String table, final String column) {
        return table + "." + column;
    }

}
