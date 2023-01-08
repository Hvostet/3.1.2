package ru.example.CRUDSpringBoot1.dao;



import ru.example.CRUDSpringBoot1.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public void saveUser(User user);

    User getUser(int id);
    public void updateUser(User user);

    public void removeUser(User user);
}
