package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

    @Entity
    @Table(name = "project")
    @Getter
    @Setter
    public class Project{
        @NotNull(message = "proje adı boş olamaz.")
        private String name;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotNull(message = "açıklama boş olamaz.")
        private String note;

        public void setName(@NotNull(message = "proje adı boş olamaz.") String name) {
        }

        public void setId(@NotNull(message = "proje idsi boş olamaz.") int id) {
        }

        public void setNote(@NotNull(message = "açıklama boş olamaz.") String note) {
        }
    }

