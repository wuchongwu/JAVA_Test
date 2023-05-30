import java.util.List;

public class Entity {
    private String id;
    private String Name;
    private String parentId;
    private String code;
    private List<Entity> childList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<Entity> getChildList() {
        return childList;
    }

    public void setChildList(List<Entity> childList) {
        this.childList = childList;
    }
}

