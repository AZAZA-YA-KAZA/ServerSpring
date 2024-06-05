package org.example.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Table(name = "messa")
@Entity(name = "messa")
public class whoi {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "man")
    private Integer man;
    @Column(name = "prog")
    private Integer prog;
    @Column(name = "nick")
    private String nick;

    public whoi(Integer id, String nick, Integer man, Integer prog) {
        this.id = id;
        this.nick = nick;
        this.man = man;
        this.prog = prog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMan() {
        return man;
    }

    public void setMan(Integer man) {
        this.man = man;
    }

    public Integer getProg() {
        return prog;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setProg(Integer prog) {
        this.prog = prog;
    }
}
