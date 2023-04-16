package com.kwai.video.ksmemorykit.EditorSmartClipResourceRule;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorSmartClipResourceRule extends Enum	// class@0008f5
{
    public static final EditorSmartClipResourceRule[] $VALUES;

    static {
       EditorSmartClipResourceRule[] uEditorSmart = new EditorSmartClipResourceRule[0];
       EditorSmartClipResourceRule.$VALUES = uEditorSmart;
    }
    public void EditorSmartClipResourceRule(String p0,int p1){
       super(p0, p1);
    }
    public static EditorSmartClipResourceRule valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSmartClipResourceRule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorSmartClipResourceRule.class, p0);
    }
    public static EditorSmartClipResourceRule[] values(){
       Object obj = PatchProxy.apply(null, null, EditorSmartClipResourceRule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSmartClipResourceRule.$VALUES.clone();
    }
}
