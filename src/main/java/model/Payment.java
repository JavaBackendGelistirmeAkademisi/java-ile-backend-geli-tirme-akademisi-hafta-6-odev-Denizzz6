package model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
    @Entity
    @Table(name = "payment")
    @Getter
    @Setter
    public class Payment{
        @NotNull(message = "ödeme türü boş bırakılamaz")
        private String type;

        @NotNull(message = "isim boş bırakılamaz")
        private String name;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotNull(message = "miktar boş bırakılamaz.")
        private int amount;

        @NotNull(message = "açıklama boş bırakılamaz.")
        private String note;

        public @NotNull(message = "ödeme türü boş bırakılamaz") String getType() {
            return type;
        }

        public void setType(@NotNull(message = "ödeme türü boş bırakılamaz") String type) {
            this.type = type;
        }

        public @NotNull(message = "isim boş bırakılamaz") String getName() {
            return name;
        }

        public void setName(@NotNull(message = "isim boş bırakılamaz") String name) {
            this.name = name;
        }

        @NotNull(message = "id boş bırakılamaz.")
        public int getId() {
            return id;
        }

        public void setId(@NotNull(message = "id boş bırakılamaz.") int id) {
            this.id = id;
        }

        @NotNull(message = "miktar boş bırakılamaz.")
        public int getAmount() {
            return amount;
        }

        public void setAmount(@NotNull(message = "miktar boş bırakılamaz.") int amount) {
            this.amount = amount;
        }

        public @NotNull(message = "açıklama boş bırakılamaz.") String getNote() {
            return note;
        }

        public void setNote(@NotNull(message = "açıklama boş bırakılamaz.") String note) {
            this.note = note;
        }
    }

