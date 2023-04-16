package com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class DynamicTabConfig$Status extends Enum	// class@00085c
{
    public static final DynamicTabConfig$Status[] $VALUES;
    public static final DynamicTabConfig$Status ADD;
    public static final DynamicTabConfig$Status CHANGE;
    public static final DynamicTabConfig$Status REMOVE;
    public static final DynamicTabConfig$Status UNCHANGED;

    static {
       DynamicTabConfig$Status status = new DynamicTabConfig$Status("ADD", 0);
       DynamicTabConfig$Status.ADD = status;
       DynamicTabConfig$Status status1 = new DynamicTabConfig$Status("REMOVE", 1);
       DynamicTabConfig$Status.REMOVE = status1;
       DynamicTabConfig$Status status2 = new DynamicTabConfig$Status("CHANGE", 2);
       DynamicTabConfig$Status.CHANGE = status2;
       DynamicTabConfig$Status status3 = new DynamicTabConfig$Status("UNCHANGED", 3);
       DynamicTabConfig$Status.UNCHANGED = status3;
       DynamicTabConfig$Status[] statusArray = new DynamicTabConfig$Status[]{status,status1,status2,status3};
       DynamicTabConfig$Status.$VALUES = statusArray;
    }
    public void DynamicTabConfig$Status(String p0,int p1){
       super(p0, p1);
    }
    public static DynamicTabConfig$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DynamicTabConfig$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DynamicTabConfig$Status.class, p0);
    }
    public static DynamicTabConfig$Status[] values(){
       Object obj = PatchProxy.apply(null, null, DynamicTabConfig$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DynamicTabConfig$Status.$VALUES.clone();
    }
}
