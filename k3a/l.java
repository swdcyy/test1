package k3a.l;
import j3a.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import j3a.b$a;
import j3a.a;
import k3a.j;
import com.yxcorp.gifshow.detail.player.panel.elements.CollectDislikeElementView$bind$1;
import android.view.View$OnClickListener;
import k3a.k;
import i2b.a;
import android.text.TextPaint;

public final class l implements b	// class@002bce
{
    public ViewGroup a;
    public ViewGroup b;
    public ImageView c;
    public TextView d;
    public TextView e;

    public void l(){
       super();
    }
    public final void a(boolean p0){
       l ta;
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "4")) {
          return;
       }
       String str = "mCollectIv";
       String str1 = "mCollectLayout";
       if (p0) {
          ta = this.a;
          if (ta == null) {
             a.S(str1);
          }
          ta.setBackground(a1.f(R.drawable.arg_RES_7f081ad9));
          ta = this.c;
          if (ta == null) {
             a.S(str);
          }
          ta.setImageDrawable(a1.f(R.drawable.arg_RES_7f081ad4));
          ta = this.d;
          if (ta == null) {
             a.S("mCollectTv");
          }
          ta.setText(a1.p(R.string.arg_RES_7f1014be));
          ta = this.d;
          if (ta == null) {
             a.S("mCollectTv");
          }
          ta.setTextColor(a1.a(R.color.arg_RES_7f0606f4));
       }else {
          ta = this.a;
          if (ta == null) {
             a.S(str1);
          }
          ta.setBackground(a1.f(R.drawable.arg_RES_7f081ad2));
          ta = this.c;
          if (ta == null) {
             a.S(str);
          }
          ta.setImageDrawable(a1.f(R.drawable.arg_RES_7f081ad3));
          ta = this.d;
          if (ta == null) {
             a.S("mCollectTv");
          }
          ta.setText(a1.p(R.string.arg_RES_7f100729));
          ta = this.d;
          if (ta == null) {
             a.S("mCollectTv");
          }
          ta.setTextColor(a1.a(R.color.arg_RES_7f0620c7));
       }
       return;
    }
    public View b(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return b$a.a(this, p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "3")) {
       }else {
          a.p(p0, "element");
          this.a(p0.e);
          l ta = this.a;
          if (ta == null) {
             a.S("mCollectLayout");
          }
          CollectDislikeElementView$bind$1 uobind$1 = new CollectDislikeElementView$bind$1(this, p0, false, 500);
          ta.setOnClickListener(v7);
          l tb = this.b;
          if (tb == null) {
             a.S("mDislikeLayout");
          }
          tb.setOnClickListener(new k(p0, false, 500));
       }
       return;
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       View view = a.i(p0, R.layout.arg_RES_7f0d1164);
       a.o(view, "KwaiLayoutInflater.infla¡­_element_collect_dislike\)");
       return view;
    }
    public void k(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       a.p(p0, "view");
       view = p0.findViewById(R.id.ll_collect);
       a.o(view, "view.findViewById\(R.id.ll_collect\)");
       this.a = view;
       view = p0.findViewById(R.id.ll_dislike);
       a.o(view, "view.findViewById\(R.id.ll_dislike\)");
       this.b = view;
       view = p0.findViewById(R.id.iv_collect);
       a.o(view, "view.findViewById\(R.id.iv_collect\)");
       this.c = view;
       view = p0.findViewById(R.id.tv_collect);
       a.o(view, "view.findViewById\(R.id.tv_collect\)");
       this.d = view;
       p0 = p0.findViewById(R.id.tv_dislike);
       a.o(p0, "view.findViewById\(R.id.tv_dislike\)");
       this.e = p0;
       l td = this.d;
       if (td == null) {
          a.S("mCollectTv");
       }
       TextPaint paint = td.getPaint();
       a.o(paint, "mCollectTv.paint");
       paint.setFakeBoldText(true);
       td = this.e;
       if (td == null) {
          a.S("mDislikeTv");
       }
       paint = td.getPaint();
       a.o(paint, "mDislikeTv.paint");
       paint.setFakeBoldText(true);
       return;
    }
}
