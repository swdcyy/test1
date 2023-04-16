package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$PresentType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorSmartClipThemeConfig$PresentType extends Enum	// class@000907
{
    public final int value;
    public static final EditorSmartClipThemeConfig$PresentType[] $VALUES;
    public static final EditorSmartClipThemeConfig$PresentType Loop;
    public static final EditorSmartClipThemeConfig$PresentType OnceFixedStart;
    public static final EditorSmartClipThemeConfig$PresentType OnceRandomStart;

    static {
       EditorSmartClipThemeConfig$PresentType presentType = new EditorSmartClipThemeConfig$PresentType("Loop", 0, 0);
       EditorSmartClipThemeConfig$PresentType.Loop = presentType;
       EditorSmartClipThemeConfig$PresentType presentType1 = new EditorSmartClipThemeConfig$PresentType("OnceRandomStart", 1, 1);
       EditorSmartClipThemeConfig$PresentType.OnceRandomStart = presentType1;
       EditorSmartClipThemeConfig$PresentType presentType2 = new EditorSmartClipThemeConfig$PresentType("OnceFixedStart", 2, 2);
       EditorSmartClipThemeConfig$PresentType.OnceFixedStart = presentType2;
       EditorSmartClipThemeConfig$PresentType[] presentTypeA = new EditorSmartClipThemeConfig$PresentType[]{presentType,presentType1,presentType2};
       EditorSmartClipThemeConfig$PresentType.$VALUES = presentTypeA;
    }
    public void EditorSmartClipThemeConfig$PresentType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EditorSmartClipThemeConfig$PresentType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSmartClipThemeConfig$PresentType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorSmartClipThemeConfig$PresentType.class, p0);
    }
    public static EditorSmartClipThemeConfig$PresentType[] values(){
       Object obj = PatchProxy.apply(null, null, EditorSmartClipThemeConfig$PresentType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSmartClipThemeConfig$PresentType.$VALUES.clone();
    }
}
