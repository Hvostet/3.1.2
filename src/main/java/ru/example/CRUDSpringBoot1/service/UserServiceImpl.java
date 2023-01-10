package ru.example.CRUDSpringBoot1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.CRUDSpringBoot1.dao.UserDAO;
import ru.example.CRUDSpringBoot1.entity.User;

import javax.transaction.Transactional;
import java.util.List;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public void updateUser(int id, User user) {
        user.setId(id);
        userDAO.updateUser(user);
    }


    @Override
    @Transactional
    public void removeUser(User user) {
        userDAO.removeUser(user);
    }


}
