package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$c;
import com.yxcorp.gifshow.util.ARecyclerAdapter$d;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import voc.c0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateListViewBinder$c$a;
import android.view.View$OnClickListener;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.l;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateState$e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateItemShowAction;
import xvc.b;
import ci0.a;

public final class PicTemplateListViewBinder$c extends ARecyclerAdapter$d	// class@001394
{
    public final KwaiImageView b;
    public final View c;
    public final ProgressBar d;
    public final TextView e;
    public final TextView f;
    public final PicTemplateListViewBinder g;

    public void PicTemplateListViewBinder$c(PicTemplateListViewBinder p0,ViewGroup p1){
       a.p(p1, "parent");
       this.g = p0;
       super(p1, 0x7f0d1148);
       KwaiImageView kwaiImageVie = this.a(R.id.icon);
       this.b = kwaiImageVie;
       this.c = this.a(0x7f0a382a);
       this.d = this.a(0x7f0a32de);
       TextView textView = this.a(R.id.pic_template_label);
       this.e = textView;
       TextView textView1 = this.a(R.id.template_id);
       this.f = textView1;
       RecyclerView$ViewHolder titemView = this.itemView;
       a.o(titemView, "itemView");
       new c0().g(titemView);
       this.itemView.setOnClickListener(new PicTemplateListViewBinder$c$a(this));
       kwaiImageVie.getHierarchy().F(new ColorDrawable(a1.a(R.color.arg_RES_7f06203b)));
       textView.setText(R.string.arg_RES_7f103c69);
       boolean b = false;
       kwaiImageVie = (a.a().c() && l.c("KEY_ENABLE_RENDER_PICTURE_TEMPLATE_ID", b))? 1: 0;
       if (!kwaiImageVie) {
          b = 8;
       }
       textView1.setVisibility(b);
       return;
    }
    public void c(int p0,Object p1,Object p2){
       int this;
       PicTemplateListViewBinder$c tc;
       if (!PatchProxy.isSupport(PicTemplateListViewBinder$c.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, PicTemplateListViewBinder$c.class, "1")) {
          a.p(p1, "data");
          p0 = p2 instanceof PicTemplateState$e;
          PicTemplateState$e uoe = (!p0)? null: p2;
          int i = 4;
          this = 0;
          if (!uoe || uoe.h() != p1.h()) {
             tc = this.c;
             int i1 = (p1.h() ^ 0x01)? 4: 0;
             tc.setVisibility(i1);
             RecyclerView$ViewHolder titemView = this.itemView;
             a.o(titemView, "itemView");
             titemView.setSelected(p1.h());
          }
          uoe = (!p0)? null: p2;
          if (!uoe || uoe.e() != p1.e()) {
             tc = this.d;
             if (!(p1.e() ^ 0x01)) {
                i = 0;
             }
             tc.setVisibility(i);
          }
          uoe = (!p0)? null: p2;
          if (!uoe || uoe.d() - p1.d()) {
             this.d.setProgress((int)(p1.d() * (float)100));
          }
          uoe = (!p0)? null: p2;
          List list = (uoe)? uoe.c(): null;
          if (a.g(list, p1.c()) ^ 0x01) {
             this.b.P(p1.c());
          }
          if (!p0) {
             p2 = null;
          }
          if (p2 == null || p2.g() != p1.g()) {
             PicTemplateListViewBinder$c te = this.e;
             if (!p1.g()) {
                this = 8;
             }
             te.setVisibility(this);
          }
          this.f.setText(p1.b().getPicTemplateInfo().getId());
       }
       return;
    }
    public void d(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateListViewBinder$c.class, "2")) {
       }else {
          a.p(p0, "data");
          this.g.D(new PicTemplateItemShowAction(p0));
       }
       return;
    }
}
