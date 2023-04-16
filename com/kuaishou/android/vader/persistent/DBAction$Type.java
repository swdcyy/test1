package com.kuaishou.android.vader.persistent.DBAction$Type;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DBAction$Type extends Enum	// class@000716
{
    public static final DBAction$Type[] $VALUES;
    public static final DBAction$Type Add;
    public static final DBAction$Type Delete;
    public static final DBAction$Type Sentinel;

    static {
       DBAction$Type type = new DBAction$Type("Add", 0);
       DBAction$Type.Add = type;
       DBAction$Type type1 = new DBAction$Type("Delete", 1);
       DBAction$Type.Delete = type1;
       DBAction$Type type2 = new DBAction$Type("Sentinel", 2);
       DBAction$Type.Sentinel = type2;
       DBAction$Type[] typeArray = new DBAction$Type[]{type,type1,type2};
       DBAction$Type.$VALUES = typeArray;
    }
    public void DBAction$Type(String p0,int p1){
       super(p0, p1);
    }
    public static DBAction$Type valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DBAction$Type.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DBAction$Type.class, p0);
    }
    public static DBAction$Type[] values(){
       Object obj = PatchProxy.apply(null, null, DBAction$Type.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DBAction$Type.$VALUES.clone();
    }
}
