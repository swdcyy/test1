package com.yxcorp.gifshow.v3.editor.template.PicTemplatePageParamBuilderPresenter$TemplateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PicTemplatePageParamBuilderPresenter$TemplateType extends Enum	// class@0012fb
{
    public final int type;
    public static final PicTemplatePageParamBuilderPresenter$TemplateType[] $VALUES;
    public static final PicTemplatePageParamBuilderPresenter$TemplateType ATLAS;
    public static final PicTemplatePageParamBuilderPresenter$TemplateType LONG_PIC;
    public static final PicTemplatePageParamBuilderPresenter$TemplateType SINGLE_PIC;

    static {
       PicTemplatePageParamBuilderPresenter$TemplateType templateType1;
       PicTemplatePageParamBuilderPresenter$TemplateType[] templateType = new PicTemplatePageParamBuilderPresenter$TemplateType[]{templateType1,templateType1,templateType1};
       templateType1 = new PicTemplatePageParamBuilderPresenter$TemplateType("SINGLE_PIC", 0, 0);
       PicTemplatePageParamBuilderPresenter$TemplateType.SINGLE_PIC = templateType1;
       templateType1 = new PicTemplatePageParamBuilderPresenter$TemplateType("ATLAS", 1, 1);
       PicTemplatePageParamBuilderPresenter$TemplateType.ATLAS = templateType1;
       templateType1 = new PicTemplatePageParamBuilderPresenter$TemplateType("LONG_PIC", 2, 2);
       PicTemplatePageParamBuilderPresenter$TemplateType.LONG_PIC = templateType1;
       PicTemplatePageParamBuilderPresenter$TemplateType.$VALUES = templateType;
    }
    public void PicTemplatePageParamBuilderPresenter$TemplateType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static PicTemplatePageParamBuilderPresenter$TemplateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PicTemplatePageParamBuilderPresenter$TemplateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PicTemplatePageParamBuilderPresenter$TemplateType.class, p0);
    }
    public static PicTemplatePageParamBuilderPresenter$TemplateType[] values(){
       Object obj = PatchProxy.apply(null, null, PicTemplatePageParamBuilderPresenter$TemplateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PicTemplatePageParamBuilderPresenter$TemplateType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
