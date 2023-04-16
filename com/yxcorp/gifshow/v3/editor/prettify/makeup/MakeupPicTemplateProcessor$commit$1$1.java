package com.yxcorp.gifshow.v3.editor.prettify.makeup.MakeupPicTemplateProcessor$commit$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.prettify.makeup.m;
import java.lang.String;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import f1c.c2;

public final class MakeupPicTemplateProcessor$commit$1$1 extends Lambda implements l	// class@00118a
{
    public final m $models;

    public void MakeupPicTemplateProcessor$commit$1$1(m p0){
       this.$models = p0;
       super(1);
    }
    public final a invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MakeupPicTemplateProcessor$commit$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       MakeupSuite makeupSuite = this.$models.h(p0);
       a uoa = (makeupSuite != null)? c2.c(makeupSuite, false, true): null;
       return uoa;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
