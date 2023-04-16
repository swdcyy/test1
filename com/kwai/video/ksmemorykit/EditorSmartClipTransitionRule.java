package com.kwai.video.ksmemorykit.EditorSmartClipTransitionRule;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorSmartClipTransitionRule extends Enum	// class@00090a
{
    public static final EditorSmartClipTransitionRule[] $VALUES;

    static {
       EditorSmartClipTransitionRule[] uEditorSmart = new EditorSmartClipTransitionRule[0];
       EditorSmartClipTransitionRule.$VALUES = uEditorSmart;
    }
    public void EditorSmartClipTransitionRule(String p0,int p1){
       super(p0, p1);
    }
    public static EditorSmartClipTransitionRule valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSmartClipTransitionRule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorSmartClipTransitionRule.class, p0);
    }
    public static EditorSmartClipTransitionRule[] values(){
       Object obj = PatchProxy.apply(null, null, EditorSmartClipTransitionRule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSmartClipTransitionRule.$VALUES.clone();
    }
}
