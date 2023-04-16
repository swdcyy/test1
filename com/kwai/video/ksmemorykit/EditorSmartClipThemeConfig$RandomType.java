package com.kwai.video.ksmemorykit.EditorSmartClipThemeConfig$RandomType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorSmartClipThemeConfig$RandomType extends Enum	// class@000908
{
    public final int value;
    public static final EditorSmartClipThemeConfig$RandomType[] $VALUES;
    public static final EditorSmartClipThemeConfig$RandomType ALL;
    public static final EditorSmartClipThemeConfig$RandomType AVOID_DUPLICATE;
    public static final EditorSmartClipThemeConfig$RandomType FOLLOW_LIST;

    static {
       EditorSmartClipThemeConfig$RandomType randomType = new EditorSmartClipThemeConfig$RandomType("ALL", 0, 0);
       EditorSmartClipThemeConfig$RandomType.ALL = randomType;
       EditorSmartClipThemeConfig$RandomType randomType1 = new EditorSmartClipThemeConfig$RandomType("AVOID_DUPLICATE", 1, 1);
       EditorSmartClipThemeConfig$RandomType.AVOID_DUPLICATE = randomType1;
       EditorSmartClipThemeConfig$RandomType randomType2 = new EditorSmartClipThemeConfig$RandomType("FOLLOW_LIST", 2, 2);
       EditorSmartClipThemeConfig$RandomType.FOLLOW_LIST = randomType2;
       EditorSmartClipThemeConfig$RandomType[] randomTypeAr = new EditorSmartClipThemeConfig$RandomType[]{randomType,randomType1,randomType2};
       EditorSmartClipThemeConfig$RandomType.$VALUES = randomTypeAr;
    }
    public void EditorSmartClipThemeConfig$RandomType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EditorSmartClipThemeConfig$RandomType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSmartClipThemeConfig$RandomType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorSmartClipThemeConfig$RandomType.class, p0);
    }
    public static EditorSmartClipThemeConfig$RandomType[] values(){
       Object obj = PatchProxy.apply(null, null, EditorSmartClipThemeConfig$RandomType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSmartClipThemeConfig$RandomType.$VALUES.clone();
    }
}
