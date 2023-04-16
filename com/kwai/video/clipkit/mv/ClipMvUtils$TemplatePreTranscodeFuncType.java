package com.kwai.video.clipkit.mv.ClipMvUtils$TemplatePreTranscodeFuncType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ClipMvUtils$TemplatePreTranscodeFuncType extends Enum	// class@001aa9
{
    public static final ClipMvUtils$TemplatePreTranscodeFuncType[] $VALUES;
    public static final ClipMvUtils$TemplatePreTranscodeFuncType FaceMagic;
    public static final ClipMvUtils$TemplatePreTranscodeFuncType InsertFrame;
    public static final ClipMvUtils$TemplatePreTranscodeFuncType Reverse;

    static {
       ClipMvUtils$TemplatePreTranscodeFuncType templatePreT = new ClipMvUtils$TemplatePreTranscodeFuncType("FaceMagic", 0);
       ClipMvUtils$TemplatePreTranscodeFuncType.FaceMagic = templatePreT;
       ClipMvUtils$TemplatePreTranscodeFuncType templatePreT1 = new ClipMvUtils$TemplatePreTranscodeFuncType("InsertFrame", 1);
       ClipMvUtils$TemplatePreTranscodeFuncType.InsertFrame = templatePreT1;
       ClipMvUtils$TemplatePreTranscodeFuncType templatePreT2 = new ClipMvUtils$TemplatePreTranscodeFuncType("Reverse", 2);
       ClipMvUtils$TemplatePreTranscodeFuncType.Reverse = templatePreT2;
       ClipMvUtils$TemplatePreTranscodeFuncType[] templatePreT3 = new ClipMvUtils$TemplatePreTranscodeFuncType[]{templatePreT,templatePreT1,templatePreT2};
       ClipMvUtils$TemplatePreTranscodeFuncType.$VALUES = templatePreT3;
    }
    public void ClipMvUtils$TemplatePreTranscodeFuncType(String p0,int p1){
       super(p0, p1);
    }
    public static ClipMvUtils$TemplatePreTranscodeFuncType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipMvUtils$TemplatePreTranscodeFuncType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ClipMvUtils$TemplatePreTranscodeFuncType.class, p0);
    }
    public static ClipMvUtils$TemplatePreTranscodeFuncType[] values(){
       Object obj = PatchProxy.apply(null, null, ClipMvUtils$TemplatePreTranscodeFuncType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipMvUtils$TemplatePreTranscodeFuncType.$VALUES.clone();
    }
}
