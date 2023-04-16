package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$$special$$inlined$apply$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder;
import android.view.ViewGroup;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class PicTemplateListViewBinder$$special$$inlined$apply$lambda$1 extends Lambda implements l	// class@00138c
{
    public final PicTemplateListViewBinder this$0;

    public void PicTemplateListViewBinder$$special$$inlined$apply$lambda$1(PicTemplateListViewBinder p0){
       this.this$0 = p0;
       super(1);
    }
    public final PicTemplateListViewBinder$d invoke(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, PicTemplateListViewBinder$$special$$inlined$apply$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       PatchProxy.onMethodExit(PicTemplateListViewBinder$$special$$inlined$apply$lambda$1.class, "1");
       return new PicTemplateListViewBinder$d(this.this$0, p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
