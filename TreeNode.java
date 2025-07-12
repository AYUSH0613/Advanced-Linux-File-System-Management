package LFMS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TreeNode {
    String name;
    char type;
    String cdate, mdate;
    int permission;
    TreeNode parent, firstChild, nextSibling;

    public TreeNode(String name, char type, TreeNode parent) {
        this.name = name;
        this.type = type;
        this.parent = parent;
        this.permission = 777;
        this.cdate = this.mdate = currentTime();
        this.firstChild = this.nextSibling = null;
    }

    private String currentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    public String getPermissionString() {
        return String.format("%03d", permission);
    }
}
