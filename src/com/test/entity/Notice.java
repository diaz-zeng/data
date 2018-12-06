package com.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "G5_NOTICE")
public class Notice {

    @Id
    @SequenceGenerator(name = "G5_NOTICE_ID", sequenceName = "G5_NOTICE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "G5_NOTICE_ID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private Admin admin;

    @Column(nullable = false)
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
