package com.yxcorp.gifshow.component.postlistcomponent.action.InsertActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class InsertActionType extends Enum	// class@0011c1
{
    public static final InsertActionType[] $VALUES;
    public static final InsertActionType HEAD;
    public static final InsertActionType MIDDLE;
    public static final InsertActionType TAIL;

    static {
       InsertActionType insertAction1;
       InsertActionType[] insertAction = new InsertActionType[]{insertAction1,insertAction1,insertAction1};
       insertAction1 = new InsertActionType("HEAD", 0);
       InsertActionType.HEAD = insertAction1;
       insertAction1 = new InsertActionType("MIDDLE", 1);
       InsertActionType.MIDDLE = insertAction1;
       insertAction1 = new InsertActionType("TAIL", 2);
       InsertActionType.TAIL = insertAction1;
       InsertActionType.$VALUES = insertAction;
    }
    public void InsertActionType(String p0,int p1){
       super(p0, p1);
    }
    public static InsertActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InsertActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InsertActionType.class, p0);
    }
    public static InsertActionType[] values(){
       Object obj = PatchProxy.apply(null, null, InsertActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InsertActionType.$VALUES.clone();
    }
}
