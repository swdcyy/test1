package com.yxcorp.gifshow.listcomponent.layoutmanager.ViewLifeCycleHelper$STATUS;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ViewLifeCycleHelper$STATUS extends Enum	// class@001a76
{
    public static final ViewLifeCycleHelper$STATUS[] $VALUES;
    public static final ViewLifeCycleHelper$STATUS APPEARED;
    public static final ViewLifeCycleHelper$STATUS APPEARING;
    public static final ViewLifeCycleHelper$STATUS DISAPPEARED;
    public static final ViewLifeCycleHelper$STATUS DISAPPEARING;

    static {
       ViewLifeCycleHelper$STATUS sTATUS = new ViewLifeCycleHelper$STATUS("APPEARING", 0);
       ViewLifeCycleHelper$STATUS.APPEARING = sTATUS;
       ViewLifeCycleHelper$STATUS sTATUS1 = new ViewLifeCycleHelper$STATUS("APPEARED", 1);
       ViewLifeCycleHelper$STATUS.APPEARED = sTATUS1;
       ViewLifeCycleHelper$STATUS sTATUS2 = new ViewLifeCycleHelper$STATUS("DISAPPEARING", 2);
       ViewLifeCycleHelper$STATUS.DISAPPEARING = sTATUS2;
       ViewLifeCycleHelper$STATUS sTATUS3 = new ViewLifeCycleHelper$STATUS("DISAPPEARED", 3);
       ViewLifeCycleHelper$STATUS.DISAPPEARED = sTATUS3;
       ViewLifeCycleHelper$STATUS[] sTATUSArray = new ViewLifeCycleHelper$STATUS[]{sTATUS,sTATUS1,sTATUS2,sTATUS3};
       ViewLifeCycleHelper$STATUS.$VALUES = sTATUSArray;
    }
    public void ViewLifeCycleHelper$STATUS(String p0,int p1){
       super(p0, p1);
    }
    public static ViewLifeCycleHelper$STATUS valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ViewLifeCycleHelper$STATUS.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ViewLifeCycleHelper$STATUS.class, p0);
    }
    public static ViewLifeCycleHelper$STATUS[] values(){
       Object obj = PatchProxy.apply(null, null, ViewLifeCycleHelper$STATUS.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewLifeCycleHelper$STATUS.$VALUES.clone();
    }
}
