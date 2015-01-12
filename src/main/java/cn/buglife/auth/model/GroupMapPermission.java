package cn.buglife.auth.model;

/**
 * Created by CrazyHarry on 2015/1/13.
 */
public class GroupMapPermission extends  BaseModel{
    private Group group;
    private Permission permission;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
