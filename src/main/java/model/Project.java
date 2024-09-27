package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

        @NotNull(message = "proje idsi boş olamaz.")
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

