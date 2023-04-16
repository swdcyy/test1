package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$b;
import com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import voc.c0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateAssetIndicatorViewBinder$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import android.widget.ImageView;
import java.io.File;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class PicTemplateAssetIndicatorViewBinder$b extends ARecyclerAdapter$d	// class@001389
{
    public final KwaiImageView b;
    public final PicTemplateAssetIndicatorViewBinder c;

    public void PicTemplateAssetIndicatorViewBinder$b(PicTemplateAssetIndicatorViewBinder p0,ViewGroup p1){
       a.p(p1, "parent");
       this.c = p0;
       super(p1, 0x7f0d1147);
       this.b = this.a(0x7f0a3082);
       RecyclerView$ViewHolder titemView = this.itemView;
       a.o(titemView, "itemView");
       new c0().g(titemView);
       RecyclerView$ViewHolder titemView1 = this.itemView;
       a.o(titemView1, "itemView");
       titemView1.setLayoutParams(new ViewGroup$LayoutParams(p0.i, p0.i));
       this.itemView.setOnClickListener(new PicTemplateAssetIndicatorViewBinder$b$a(this));
    }
    public void c(int p0,Object p1,Object p2){
       if (!PatchProxy.isSupport(PicTemplateAssetIndicatorViewBinder$b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, PicTemplateAssetIndicatorViewBinder$b.class, "1")) {
          a.p(p1, "data");
          p0 = p2 instanceof PicTemplateState$b;
          File uFile = null;
          PicTemplateState$b uob = (!p0)? uFile: p2;
          if (!uob || uob.f() != p1.f()) {
             boolean b = p1.f();
             if (!PatchProxy.isSupport(PicTemplateAssetIndicatorViewBinder$b.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, PicTemplateAssetIndicatorViewBinder$b.class, "2")) {
                if (b) {
                   this.b.setAlpha(0x3f800000);
                }else {
                   this.b.setAlpha(0.30f);
                }
             }
          }
          if (!p0) {
             p2 = uFile;
          }
          if (p2 != null) {
             uFile = p2.c();
          }
          if ((a.g(uFile, p1.c()) ^ 0x01) && !PatchProxy.applyVoidOneRefs(p1, this, PicTemplateAssetIndicatorViewBinder$b.class, "3")) {
             this.b.v(p1.c(), this.c.i, this.c.i);
          }
       }
    label_008e :
       return;
    }
}
