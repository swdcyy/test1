package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$d;
import com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class PicTemplateListViewBinder$d extends ARecyclerAdapter$d	// class@001395
{
    public KwaiLoadingView b;
    public final PicTemplateListViewBinder c;

    public void PicTemplateListViewBinder$d(PicTemplateListViewBinder p0,ViewGroup p1){
       a.p(p1, "parent");
       this.c = p0;
       super(p1, 0x7f0d114a);
       this.b = this.a(0x7f0a2921);
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateListViewBinder$d.class, "1")) {
          return;
       }
       this.b.h();
       return;
    }
    public void e(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateListViewBinder$d.class, "2")) {
          return;
       }
       this.b.i();
       return;
    }
}
