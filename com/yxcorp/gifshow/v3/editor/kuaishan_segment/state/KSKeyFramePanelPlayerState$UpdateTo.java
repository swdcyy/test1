package com.yxcorp.gifshow.v3.editor.kuaishan_segment.state.KSKeyFramePanelPlayerState$UpdateTo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSKeyFramePanelPlayerState$UpdateTo extends Enum	// class@001023
{
    public static final KSKeyFramePanelPlayerState$UpdateTo[] $VALUES;
    public static final KSKeyFramePanelPlayerState$UpdateTo NONE;
    public static final KSKeyFramePanelPlayerState$UpdateTo PLAYER;
    public static final KSKeyFramePanelPlayerState$UpdateTo STATE_RECORD_ONLY;

    static {
       KSKeyFramePanelPlayerState$UpdateTo updateTo;
       KSKeyFramePanelPlayerState$UpdateTo[] updateToArra = new KSKeyFramePanelPlayerState$UpdateTo[]{updateTo,updateTo,updateTo};
       updateTo = new KSKeyFramePanelPlayerState$UpdateTo("NONE", 0);
       KSKeyFramePanelPlayerState$UpdateTo.NONE = updateTo;
       updateTo = new KSKeyFramePanelPlayerState$UpdateTo("STATE_RECORD_ONLY", 1);
       KSKeyFramePanelPlayerState$UpdateTo.STATE_RECORD_ONLY = updateTo;
       updateTo = new KSKeyFramePanelPlayerState$UpdateTo("PLAYER", 2);
       KSKeyFramePanelPlayerState$UpdateTo.PLAYER = updateTo;
       KSKeyFramePanelPlayerState$UpdateTo.$VALUES = updateToArra;
    }
    public void KSKeyFramePanelPlayerState$UpdateTo(String p0,int p1){
       super(p0, p1);
    }
    public static KSKeyFramePanelPlayerState$UpdateTo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSKeyFramePanelPlayerState$UpdateTo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSKeyFramePanelPlayerState$UpdateTo.class, p0);
    }
    public static KSKeyFramePanelPlayerState$UpdateTo[] values(){
       Object obj = PatchProxy.apply(null, null, KSKeyFramePanelPlayerState$UpdateTo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSKeyFramePanelPlayerState$UpdateTo.$VALUES.clone();
    }
}
