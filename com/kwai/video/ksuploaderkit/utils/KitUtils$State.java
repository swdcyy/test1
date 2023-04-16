package com.kwai.video.ksuploaderkit.utils.KitUtils$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KitUtils$State extends Enum	// class@0009df
{
    public static final KitUtils$State[] $VALUES;
    public static final KitUtils$State Finish;
    public static final KitUtils$State Init;
    public static final KitUtils$State Pause;
    public static final KitUtils$State Publish;
    public static final KitUtils$State Unknown;
    public static final KitUtils$State UploadCover;
    public static final KitUtils$State UploadFile;

    static {
       KitUtils$State state = new KitUtils$State("Unknown", 0);
       KitUtils$State.Unknown = state;
       KitUtils$State state1 = new KitUtils$State("Init", 1);
       KitUtils$State.Init = state1;
       KitUtils$State state2 = new KitUtils$State("UploadFile", 2);
       KitUtils$State.UploadFile = state2;
       KitUtils$State state3 = new KitUtils$State("UploadCover", 3);
       KitUtils$State.UploadCover = state3;
       KitUtils$State state4 = new KitUtils$State("Pause", 4);
       KitUtils$State.Pause = state4;
       KitUtils$State state5 = new KitUtils$State("Publish", 5);
       KitUtils$State.Publish = state5;
       KitUtils$State state6 = new KitUtils$State("Finish", 6);
       KitUtils$State.Finish = state6;
       KitUtils$State[] stateArray = new KitUtils$State[]{state,state1,state2,state3,state4,state5,state6};
       KitUtils$State.$VALUES = stateArray;
    }
    public void KitUtils$State(String p0,int p1){
       super(p0, p1);
    }
    public static KitUtils$State valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KitUtils$State.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KitUtils$State.class, p0);
    }
    public static KitUtils$State[] values(){
       Object obj = PatchProxy.apply(null, null, KitUtils$State.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KitUtils$State.$VALUES.clone();
    }
}
