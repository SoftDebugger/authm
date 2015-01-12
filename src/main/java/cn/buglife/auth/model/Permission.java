package cn.buglife.auth.model;

/**
 * Created by CrazyHarry on 2015/1/13.
 */
public class Permission extends BaseModel {
    private String mame;
    private int contentType;
    private String codeName;

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public int getContentType() {
        return contentType;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
}
