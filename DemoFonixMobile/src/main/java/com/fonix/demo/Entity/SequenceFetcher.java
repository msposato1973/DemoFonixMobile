package com.fonix.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "sequence", sequenceName = "mySequence")
public class SequenceFetcher
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    private long id;

    public long getId() {
        return id;
    }

    public static long getNext(EntityManager em) {
        SequenceFetcher sf = new SequenceFetcher();
        em.persist(sf);
        em.flush();
        return sf.getId();
    }
}