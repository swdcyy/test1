package com.yxcorp.gifshow.v3.EditorManager$StartEditorConfig;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorManager$StartEditorConfig extends Enum	// class@000d1d
{
    public final EditorItemFunc mEditorItemFunc;
    public final String mStartParam;
    public static final EditorManager$StartEditorConfig[] $VALUES;
    public static final EditorManager$StartEditorConfig COVER_VIDEO;
    public static final EditorManager$StartEditorConfig EFFECT_V2;
    public static final EditorManager$StartEditorConfig STICKER;
    public static final EditorManager$StartEditorConfig STYLE;

    static {
       EditorManager$StartEditorConfig startEditorC = new EditorManager$StartEditorConfig("COVER_VIDEO", 0, EditorItemFunc.COVER_VIDEO, "EDIT_STATR_COVER");
       EditorManager$StartEditorConfig.COVER_VIDEO = startEditorC;
       EditorManager$StartEditorConfig startEditorC1 = new EditorManager$StartEditorConfig("STICKER", 1, EditorItemFunc.DECORATION, "EDIT_STATR_STICKER");
       EditorManager$StartEditorConfig.STICKER = startEditorC1;
       EditorManager$StartEditorConfig startEditorC2 = new EditorManager$StartEditorConfig("STYLE", 2, EditorItemFunc.STYLE, "EDIT_STATR_STYLE");
       EditorManager$StartEditorConfig.STYLE = startEditorC2;
       EditorManager$StartEditorConfig startEditorC3 = new EditorManager$StartEditorConfig("EFFECT_V2", 3, EditorItemFunc.EFFECT_V2, "EDIT_STATR_EFFECT");
       EditorManager$StartEditorConfig.EFFECT_V2 = startEditorC3;
       EditorManager$StartEditorConfig[] startEditorC4 = new EditorManager$StartEditorConfig[]{startEditorC,startEditorC1,startEditorC2,startEditorC3};
       EditorManager$StartEditorConfig.$VALUES = startEditorC4;
    }
    public void EditorManager$StartEditorConfig(String p0,int p1,EditorItemFunc p2,String p3){
       super(p0, p1);
       this.mEditorItemFunc = p2;
       this.mStartParam = p3;
    }
    public static EditorManager$StartEditorConfig valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorManager$StartEditorConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorManager$StartEditorConfig.class, p0);
    }
    public static EditorManager$StartEditorConfig[] values(){
       Object obj = PatchProxy.apply(null, null, EditorManager$StartEditorConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorManager$StartEditorConfig.$VALUES.clone();
    }
}
