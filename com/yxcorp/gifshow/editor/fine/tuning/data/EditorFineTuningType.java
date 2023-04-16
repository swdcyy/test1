package com.yxcorp.gifshow.editor.fine.tuning.data.EditorFineTuningType;
import java.lang.Enum;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorFineTuningType extends Enum	// class@001ba0
{
    public final String typeLoggerName;
    public static final EditorFineTuningType[] $VALUES;
    public static final EditorFineTuningType BRIGHTNESS_TYPE;
    public static final EditorFineTuningType CLARITY_TYPE;
    public static final EditorFineTuningType COLOR_TEMPERATURE_TYPE;
    public static final EditorFineTuningType CONTRAST_TYPE;
    public static final EditorFineTuningType SATURATION_TYPE;
    public static final EditorFineTuningType SHARPEN_TYPE;

    static {
       EditorFineTuningType uEditorFineT1;
       EditorFineTuningType[] uEditorFineT = new EditorFineTuningType[]{uEditorFineT1,uEditorFineT1,uEditorFineT1,uEditorFineT1,uEditorFineT1,uEditorFineT1};
       uEditorFineT1 = new EditorFineTuningType("BRIGHTNESS_TYPE", 0, "light");
       EditorFineTuningType.BRIGHTNESS_TYPE = uEditorFineT1;
       uEditorFineT1 = new EditorFineTuningType("CONTRAST_TYPE", 1, "contrast");
       EditorFineTuningType.CONTRAST_TYPE = uEditorFineT1;
       uEditorFineT1 = new EditorFineTuningType("SATURATION_TYPE", 2, "saturation");
       EditorFineTuningType.SATURATION_TYPE = uEditorFineT1;
       uEditorFineT1 = new EditorFineTuningType("SHARPEN_TYPE", 3, "sharpening");
       EditorFineTuningType.SHARPEN_TYPE = uEditorFineT1;
       uEditorFineT1 = new EditorFineTuningType("COLOR_TEMPERATURE_TYPE", 4, "temperature");
       EditorFineTuningType.COLOR_TEMPERATURE_TYPE = uEditorFineT1;
       uEditorFineT1 = new EditorFineTuningType("CLARITY_TYPE", 5, "clarity");
       EditorFineTuningType.CLARITY_TYPE = uEditorFineT1;
       EditorFineTuningType.$VALUES = uEditorFineT;
    }
    public void EditorFineTuningType(String p0,int p1,String p2){
       super(p0, p1);
       this.typeLoggerName = p2;
    }
    public void EditorFineTuningType(String p0,int p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p2 = "";
       }
       super(p0, p1, p2);
       return;
    }
    public static EditorFineTuningType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorFineTuningType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorFineTuningType.class, p0);
    }
    public static EditorFineTuningType[] values(){
       Object obj = PatchProxy.apply(null, null, EditorFineTuningType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorFineTuningType.$VALUES.clone();
    }
    public final String getTypeLoggerName(){
       return this.typeLoggerName;
    }
}
