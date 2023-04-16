package fod.c;
import pn9.a;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.MagicFaceDownloadProgressBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.widget.ProgressBar;
import nn9.b;
import mn9.a;
import java.util.Objects;
import bod.d;
import faa.a;
import q87.c;
import nuc.a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.component.postlistcomponent.state.ItemLoadingStatus;
import fod.b;
import java.lang.Enum;

public class c extends a	// class@000e52
{
    public final KwaiImageView f;
    public final ImageView g;
    public final MagicFaceDownloadProgressBar h;
    public final KwaiImageView i;
    public final boolean j;

    public void c(View p0,boolean p1){
       a.p(p0, "itemView");
       super(p0);
       this.j = p1;
       View view = p0.findViewById(R.id.icon);
       a.o(view, "itemView.findViewById\(R.id.icon\)");
       this.f = view;
       view = p0.findViewById(R.id.item_init_state_img);
       a.o(view, "itemView.findViewById\(R.id.item_init_state_img\)");
       this.g = view;
       this.h = p0.findViewById(0x7f0a1481);
       p0 = p0.findViewById(R.id.fl_selection);
       a.o(p0, "itemView.findViewById\(R.id.fl_selection\)");
       this.i = p0;
    }
    public int c(){
       return 0x7f0a1481;
    }
    public void e(View p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "4")) {
          return;
       }
       c th = this.h;
       a.o(th, "downloadProgressBar");
       th.setProgress(p1);
       return;
    }
    public void f(b p0,b p1){
       List list;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "1")) {
          return;
       }
       a.p(p1, "newState");
       a uoa = p1.g();
       Objects.requireNonNull(uoa, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.model.TextTemplateItem");
       c ti = this.i;
       int i = (p1.d())? 0: 8;
       ti.setVisibility(i);
       if (!PatchProxy.applyVoidOneRefs(uoa, this, uoc, "2")) {
          if (a.g(uoa.getId(), this.f.getTag())) {
             Object[] objArray = new Object[0];
             a.D().w("NormalTextTemplateItemVH", "updateImageIconIfNeeded id == tag, return", objArray);
          }else {
             this.f.setTag(uoa.getId());
             if (!q.f(uoa.k().a())) {
                list = uoa.k().a();
                a.m(list);
                this.f.P(list);
             }else if(!q.f(uoa.k().k())){
                list = uoa.k().k();
                a.m(list);
                this.f.P(list);
             }
          }
       }
       this.i(p1.e());
       return;
    }
    public final KwaiImageView h(){
       return this.f;
    }
    public final void i(ItemLoadingStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       a.p(p0, "itemLoadingStatus");
       int i = b.a[p0.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3) {
             if (i == 4) {
                this.g.setVisibility(8);
             }
          }else {
             this.g.setVisibility(8);
          }
       }else {
          this.g.setVisibility(0);
       }
       return;
    }
}
