package com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult$TemplateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EditorSdk2MvCreationResult$TemplateType extends Enum	// class@001abf
{
    public static final EditorSdk2MvCreationResult$TemplateType[] $VALUES;
    public static final EditorSdk2MvCreationResult$TemplateType TEMPLATE_TYPE_AICUT;
    public static final EditorSdk2MvCreationResult$TemplateType TEMPLATE_TYPE_ANNUAL_ALBUM;
    public static final EditorSdk2MvCreationResult$TemplateType TEMPLATE_TYPE_MV;
    public static final EditorSdk2MvCreationResult$TemplateType TEMPLATE_TYPE_NEW_SPARK;
    public static final EditorSdk2MvCreationResult$TemplateType TEMPLATE_TYPE_SPARK;

    static {
       EditorSdk2MvCreationResult$TemplateType templateType = new EditorSdk2MvCreationResult$TemplateType("TEMPLATE_TYPE_MV", 0);
       EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_MV = templateType;
       EditorSdk2MvCreationResult$TemplateType templateType1 = new EditorSdk2MvCreationResult$TemplateType("TEMPLATE_TYPE_AICUT", 1);
       EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_AICUT = templateType1;
       EditorSdk2MvCreationResult$TemplateType templateType2 = new EditorSdk2MvCreationResult$TemplateType("TEMPLATE_TYPE_SPARK", 2);
       EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_SPARK = templateType2;
       EditorSdk2MvCreationResult$TemplateType templateType3 = new EditorSdk2MvCreationResult$TemplateType("TEMPLATE_TYPE_NEW_SPARK", 3);
       EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_NEW_SPARK = templateType3;
       EditorSdk2MvCreationResult$TemplateType templateType4 = new EditorSdk2MvCreationResult$TemplateType("TEMPLATE_TYPE_ANNUAL_ALBUM", 4);
       EditorSdk2MvCreationResult$TemplateType.TEMPLATE_TYPE_ANNUAL_ALBUM = templateType4;
       EditorSdk2MvCreationResult$TemplateType[] templateType5 = new EditorSdk2MvCreationResult$TemplateType[]{templateType,templateType1,templateType2,templateType3,templateType4};
       EditorSdk2MvCreationResult$TemplateType.$VALUES = templateType5;
    }
    public void EditorSdk2MvCreationResult$TemplateType(String p0,int p1){
       super(p0, p1);
    }
    public static EditorSdk2MvCreationResult$TemplateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditorSdk2MvCreationResult$TemplateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditorSdk2MvCreationResult$TemplateType.class, p0);
    }
    public static EditorSdk2MvCreationResult$TemplateType[] values(){
       Object obj = PatchProxy.apply(null, null, EditorSdk2MvCreationResult$TemplateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditorSdk2MvCreationResult$TemplateType.$VALUES.clone();
    }
}
