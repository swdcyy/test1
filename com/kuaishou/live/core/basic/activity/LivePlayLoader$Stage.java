package com.kuaishou.live.core.basic.activity.LivePlayLoader$Stage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePlayLoader$Stage extends Enum	// class@001812
{
    public String mName;
    public static final LivePlayLoader$Stage[] $VALUES;
    public static final LivePlayLoader$Stage DID_SHOW;
    public static final LivePlayLoader$Stage PRE_CREATE;
    public static final LivePlayLoader$Stage WILL_SHOW;

    static {
       LivePlayLoader$Stage stage = new LivePlayLoader$Stage("PRE_CREATE", 0, "PRE_CREATE");
       LivePlayLoader$Stage.PRE_CREATE = stage;
       LivePlayLoader$Stage stage1 = new LivePlayLoader$Stage("WILL_SHOW", 1, "WILL_SHOW");
       LivePlayLoader$Stage.WILL_SHOW = stage1;
       LivePlayLoader$Stage stage2 = new LivePlayLoader$Stage("DID_SHOW", 2, "DID_SHOW");
       LivePlayLoader$Stage.DID_SHOW = stage2;
       LivePlayLoader$Stage[] stageArray = new LivePlayLoader$Stage[]{stage,stage1,stage2};
       LivePlayLoader$Stage.$VALUES = stageArray;
    }
    public void LivePlayLoader$Stage(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LivePlayLoader$Stage valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePlayLoader$Stage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePlayLoader$Stage.class, p0);
    }
    public static LivePlayLoader$Stage[] values(){
       Object obj = PatchProxy.apply(null, null, LivePlayLoader$Stage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePlayLoader$Stage.$VALUES.clone();
    }
    public String getName(){
       return this.mName;
    }
}
