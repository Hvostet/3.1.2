package ru.example.CRUDSpringBoot1.service;



import ru.example.CRUDSpringBoot1.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);


    User getUser(int id);

    public void updateUser(int id, User user);

    public void removeUser(User user);

}
