package gqa.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gqa.k$a;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.StringBuilder;
import java.text.DecimalFormat;
import java.lang.Float;
import java.lang.CharSequence;
import gqa.k$b;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import gqa.e;

public final class k extends PresenterV2	// class@002b70
{
    public e p;
    public QPhoto q;
    public String r;
    public View s;
    public KwaiImageView t;
    public TextView u;
    public TextView v;
    public TextView w;

    public void k(){
       super();
    }
    public static final TextView P8(k p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("tagView");
       }
       return p0;
    }
    public static final TextView R8(k p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("titleTv");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       k ts = this.s;
       String str = "dialogRootView";
       if (ts == null) {
          a.S(str);
       }
       ts.post(new k$a(this));
       ts = this.t;
       if (ts == null) {
          a.S("coverImg");
       }
       k tq = this.q;
       a.m(tq);
       ts.U(tq.getCoverThumbnailUrls());
       ts = this.q;
       a.m(ts);
       PhotoMeta photoMeta = ts.getPhotoMeta();
       if (photoMeta != null) {
          String str1 = (photoMeta.mViewCount > 0x2710)? new DecimalFormat("0.0").format(Float.valueOf(((float)photoMeta.mViewCount / 10000.00f)))+"Íò": photoMeta.mViewCount;
          tq = this.w;
          if (tq == null) {
             a.S("viewCountTv");
          }
          tq.setText(str1+"´Î²¥·Å");
       }
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       ts.setOnClickListener(new k$b(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       View view = m1.f(p0, R.id.guide_bar_root);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.guide_bar_root\)");
       this.s = view;
       view = m1.f(p0, R.id.photo_iv);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.photo_iv\)");
       this.t = view;
       view = m1.f(p0, R.id.photo_title);
       a.o(view, "ViewBindUtils.bindWidget¡­otView, R.id.photo_title\)");
       this.u = view;
       view = m1.f(p0, R.id.photo_tag);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.photo_tag\)");
       this.v = view;
       p0 = m1.f(p0, R.id.photo_view_count);
       a.o(p0, "ViewBindUtils.bindWidget¡­w, R.id.photo_view_count\)");
       this.w = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.p = this.r8("guide_dialog");
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(String.class);
       return;
    }
}
