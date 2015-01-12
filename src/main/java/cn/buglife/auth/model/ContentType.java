package cn.buglife.auth.model;

/**
 * Created by CrazyHarry on 2015/1/13.
 */
public class ContentType extends BaseModel {
    private String name;
    private String appLabel;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
