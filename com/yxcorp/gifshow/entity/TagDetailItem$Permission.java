package com.yxcorp.gifshow.entity.TagDetailItem$Permission;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TagDetailItem$Permission extends Enum	// class@000d79
{
    public String permission;
    public static final TagDetailItem$Permission[] $VALUES;
    public static final TagDetailItem$Permission EDIT;
    public static final TagDetailItem$Permission TOP;
    public static final TagDetailItem$Permission UNPICK;
    public static final TagDetailItem$Permission UNTOP;

    static {
       TagDetailItem$Permission permission = new TagDetailItem$Permission("TOP", 0, "TOP");
       TagDetailItem$Permission.TOP = permission;
       TagDetailItem$Permission permission1 = new TagDetailItem$Permission("UNTOP", 1, "UNTOP");
       TagDetailItem$Permission.UNTOP = permission1;
       TagDetailItem$Permission permission2 = new TagDetailItem$Permission("UNPICK", 2, "UNPICK");
       TagDetailItem$Permission.UNPICK = permission2;
       TagDetailItem$Permission permission3 = new TagDetailItem$Permission("EDIT", 3, "EDIT");
       TagDetailItem$Permission.EDIT = permission3;
       TagDetailItem$Permission[] permissionAr = new TagDetailItem$Permission[]{permission,permission1,permission2,permission3};
       TagDetailItem$Permission.$VALUES = permissionAr;
    }
    public void TagDetailItem$Permission(String p0,int p1,String p2){
       super(p0, p1);
       this.permission = p2;
    }
    public static TagDetailItem$Permission valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TagDetailItem$Permission.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TagDetailItem$Permission.class, p0);
    }
    public static TagDetailItem$Permission[] values(){
       Object obj = PatchProxy.apply(null, null, TagDetailItem$Permission.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TagDetailItem$Permission.$VALUES.clone();
    }
    public String getPermission(){
       return this.permission;
    }
}
