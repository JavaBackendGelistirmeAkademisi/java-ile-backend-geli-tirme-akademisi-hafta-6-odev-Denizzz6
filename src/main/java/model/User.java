package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;


    @Entity
    @Table(name = "user")
    @Getter
    @Setter
    public class User{
        @NotNull(message = "İsim boş bırakılamaz.")
        private String name;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotNull(message = "kullanıcı rolü boş bırakılamaz.")
        private String role;

        @Column(unique = true)
        @NotNull(message = "Email boş bırakılamaz.")
        private String email;

        public @NotNull(message = "İsim boş bırakılamaz.") String getName() {
            return name;
        }

        public void setName(@NotNull(message = "İsim boş bırakılamaz.") String name) {
            this.name = name;
        }

        @NotNull(message = "id boş bırakılamaz.")
        public int getId() {
            return id;
        }

        public void setId(@NotNull(message = "id boş bırakılamaz.") int id) {
            this.id = id;
        }

        public @NotNull(message = "kullanıcı rolü boş bırakılamaz.") String getRole() {
            return role;
        }

        public void setRole(@NotNull(message = "kullanıcı rolü boş bırakılamaz.") String role) {
            this.role = role;
        }

        public @NotNull(message = "Email boş bırakılamaz.") String getEmail() {
            return email;
        }

        public void setEmail(@NotNull(message = "Email boş bırakılamaz.") String email) {
            this.email = email;
        }
    }

