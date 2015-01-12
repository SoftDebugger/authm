package cn.buglife.auth.model;

/**
 * Created by CrazyHarry on 2015/1/13.
 */
public class UserMapPermission extends BaseModel {
    private User user;
    private Permission permission;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
