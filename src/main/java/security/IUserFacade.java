/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import entity.User;
import java.util.List;

/**
 *
 * @author lam
 */
public interface IUserFacade {

    /*
    Return the Roles if users could be authenticated, otherwise null
     */
    List<String> authenticateUser(String userName, String password);

    public User deleteUser(String userName);
    
    IUser getPassword();
    
    IUser getUserName();
    
    IUser getUserByUserId(String id);
    
    IUser addUser(String userName, String password);
    
    public List<User> getUsers();
    
}
