package com.ee.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(path = "/user/{id}", produces = "application/json")
    public User getUser(@PathVariable("id") String userId) {
        return new User("paresh", "paresh@ee.com", "9888988786", "pune", "1234","yes");
    }

    public static class User {

        private String name;
        private String email;
        private String contact;
        private String address;
        private String primeMemberId;
        private String pickupRequested;

        public User(String name, String email, String contact, String address, String primeMemberId, String pickupRequested) {
            this.name = name;
            this.email = email;
            this.contact = contact;
            this.address = address;
            this.primeMemberId = primeMemberId;
            this.pickupRequested = pickupRequested;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getContact() {
            return contact;
        }

        public String getAddress() {
            return address;
        }

        public String getPrimeMemberId() {
            return primeMemberId;
        }

        public String getpickupRequested() {
            return pickupRequested;
        }
    }
}
