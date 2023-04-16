package com.yxcorp.gifshow.base.livedata.UpdateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UpdateType extends Enum	// class@001c50
{
    public static final UpdateType[] $VALUES;
    public static final UpdateType ADD;
    public static final UpdateType ADD_ALL;
    public static final UpdateType CHANGE;
    public static final UpdateType CHANGE_ALL;
    public static final UpdateType REMOVE;
    public static final UpdateType REMOVE_AT;
    public static final UpdateType STATE_CHANGE;
    public static final UpdateType SWAP;

    static {
       UpdateType updateType;
       UpdateType[] updateTypeAr = new UpdateType[]{updateType,updateType,updateType,updateType,updateType,updateType,updateType,updateType};
       updateType = new UpdateType("ADD_ALL", 0);
       UpdateType.ADD_ALL = updateType;
       updateType = new UpdateType("ADD", 1);
       UpdateType.ADD = updateType;
       updateType = new UpdateType("REMOVE", 2);
       UpdateType.REMOVE = updateType;
       updateType = new UpdateType("CHANGE", 3);
       UpdateType.CHANGE = updateType;
       updateType = new UpdateType("CHANGE_ALL", 4);
       UpdateType.CHANGE_ALL = updateType;
       updateType = new UpdateType("REMOVE_AT", 5);
       UpdateType.REMOVE_AT = updateType;
       updateType = new UpdateType("SWAP", 6);
       UpdateType.SWAP = updateType;
       updateType = new UpdateType("STATE_CHANGE", 7);
       UpdateType.STATE_CHANGE = updateType;
       UpdateType.$VALUES = updateTypeAr;
    }
    public void UpdateType(String p0,int p1){
       super(p0, p1);
    }
    public static UpdateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UpdateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UpdateType.class, p0);
    }
    public static UpdateType[] values(){
       Object obj = PatchProxy.apply(null, null, UpdateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UpdateType.$VALUES.clone();
    }
}
