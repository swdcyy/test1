package com.yxcorp.gifshow.v3.editor.music_v2.state.FloatButtonState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FloatButtonState extends Enum	// class@0010bf
{
    public static final FloatButtonState[] $VALUES;
    public static final FloatButtonState RECORD_CLOSED;
    public static final FloatButtonState RECORD_OPEN;
    public static final FloatButtonState VOICE_CLOSED;
    public static final FloatButtonState VOICE_OPEN;

    static {
       FloatButtonState uFloatButton1;
       FloatButtonState[] uFloatButton = new FloatButtonState[]{uFloatButton1,uFloatButton1,uFloatButton1,uFloatButton1};
       uFloatButton1 = new FloatButtonState("RECORD_OPEN", 0);
       FloatButtonState.RECORD_OPEN = uFloatButton1;
       uFloatButton1 = new FloatButtonState("RECORD_CLOSED", 1);
       FloatButtonState.RECORD_CLOSED = uFloatButton1;
       uFloatButton1 = new FloatButtonState("VOICE_OPEN", 2);
       FloatButtonState.VOICE_OPEN = uFloatButton1;
       uFloatButton1 = new FloatButtonState("VOICE_CLOSED", 3);
       FloatButtonState.VOICE_CLOSED = uFloatButton1;
       FloatButtonState.$VALUES = uFloatButton;
    }
    public void FloatButtonState(String p0,int p1){
       super(p0, p1);
    }
    public static FloatButtonState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FloatButtonState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(FloatButtonState.class, p0);
    }
    public static FloatButtonState[] values(){
       Object obj = PatchProxy.apply(null, null, FloatButtonState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FloatButtonState.$VALUES.clone();
    }
}
