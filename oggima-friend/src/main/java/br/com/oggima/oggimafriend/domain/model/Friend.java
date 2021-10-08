package br.com.oggima.oggimafriend.domain.model;

import br.com.oggima.oggimafriend.domain.valueType.Email;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String name;

    private Date birthDate;

    @Embedded
    private Email email;

}
