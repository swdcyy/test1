package com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorDelegate$ShowLoggerType extends Enum	// class@000d96
{
    public int mPageType;
    public static final EditorDelegate$ShowLoggerType[] $VALUES;
    public static final EditorDelegate$ShowLoggerType BUILT_MUSIC;
    public static final EditorDelegate$ShowLoggerType FILTER;
    public static final EditorDelegate$ShowLoggerType FILTER_EFFECT;
    public static final EditorDelegate$ShowLoggerType MAGIC_FINGER;
    public static final EditorDelegate$ShowLoggerType MAKEUP;
    public static final EditorDelegate$ShowLoggerType PRETTIFY;
    public static final EditorDelegate$ShowLoggerType THEME;
    public static final EditorDelegate$ShowLoggerType TIME_EFFECT;

    static {
       EditorDelegate$ShowLoggerType showLoggerTy = new EditorDelegate$ShowLoggerType("FILTER", 0, 2);
       EditorDelegate$ShowLoggerType.FILTER = showLoggerTy;
       EditorDelegate$ShowLoggerType showLoggerTy1 = new EditorDelegate$ShowLoggerType("MAKEUP", 1, 22);
       EditorDelegate$ShowLoggerType.MAKEUP = showLoggerTy1;
       EditorDelegate$ShowLoggerType showLoggerTy2 = new EditorDelegate$ShowLoggerType("TIME_EFFECT", 2, 4);
       EditorDelegate$ShowLoggerType.TIME_EFFECT = showLoggerTy2;
       EditorDelegate$ShowLoggerType showLoggerTy3 = new EditorDelegate$ShowLoggerType("FILTER_EFFECT", 3, 4);
       EditorDelegate$ShowLoggerType.FILTER_EFFECT = showLoggerTy3;
       EditorDelegate$ShowLoggerType showLoggerTy4 = new EditorDelegate$ShowLoggerType("BUILT_MUSIC", 4, 3);
       EditorDelegate$ShowLoggerType.BUILT_MUSIC = showLoggerTy4;
       EditorDelegate$ShowLoggerType showLoggerTy5 = new EditorDelegate$ShowLoggerType("THEME", 5, 12);
       EditorDelegate$ShowLoggerType.THEME = showLoggerTy5;
       EditorDelegate$ShowLoggerType showLoggerTy6 = new EditorDelegate$ShowLoggerType("MAGIC_FINGER", 6, 11);
       EditorDelegate$ShowLoggerType.MAGIC_FINGER = showLoggerTy6;
       EditorDelegate$ShowLoggerType showLoggerTy7 = new EditorDelegate$ShowLoggerType("PRETTIFY", 7, 18);
       EditorDelegate$ShowLoggerType.PRETTIFY = showLoggerTy7;
       EditorDelegate$ShowLoggerType[] showLoggerTy8 = new EditorDelegate$ShowLoggerType[]{showLoggerTy,showLoggerTy1,showLoggerTy2,showLoggerTy3,showLoggerTy4,showLoggerTy5,showLoggerTy6,showLoggerTy7};
       EditorDelegate$ShowLoggerType.$VALUES = showLoggerTy8;
    }
    public void EditorDelegate$ShowLoggerType(String p0,int p1,int p2){
       super(p0, p1);
       this.mPageType = p2;
    }
    public static EditorDelegate$ShowLoggerType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorDelegate$ShowLoggerType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorDelegate$ShowLoggerType.class, p0);
    }
    public static EditorDelegate$ShowLoggerType[] values(){
       Object obj = PatchProxy.apply(null, null, EditorDelegate$ShowLoggerType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorDelegate$ShowLoggerType.$VALUES.clone();
    }
}
