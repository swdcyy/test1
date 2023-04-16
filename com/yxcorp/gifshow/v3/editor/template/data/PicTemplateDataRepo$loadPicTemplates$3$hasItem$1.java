package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateDataRepo$loadPicTemplates$3$hasItem$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;

public final class PicTemplateDataRepo$loadPicTemplates$3$hasItem$1 extends Lambda implements l	// class@00132e
{
    public final PicTemplate $import;

    public void PicTemplateDataRepo$loadPicTemplates$3$hasItem$1(PicTemplate p0){
       this.$import = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(PicTemplate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateDataRepo$loadPicTemplates$3$hasItem$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return a.g(p0.getPicTemplateInfo().getId(), this.$import.getPicTemplateInfo().getId());
    }
}
