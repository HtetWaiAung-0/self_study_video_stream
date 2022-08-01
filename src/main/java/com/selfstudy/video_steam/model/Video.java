package com.selfstudy.video_steam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Video {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column(unique = true)
   private String name;

   @Lob
   private byte[] data;

   public Video(String name, byte[] data) {
       this.name = name;
       this.data = data;
   }
}
