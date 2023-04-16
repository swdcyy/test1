package ez8.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Integer;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import bz8.n;

public final class d extends PresenterV2	// class@00226f
{
    public PhotoAdvertisement$HeaderData p;
    public KwaiImageView q;
    public TextView r;
    public SelectShapeTextView s;
    public SelectShapeTextView t;
    public TextView u;

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          uod = this.q;
          if (uod == null) {
             a.S("mIvIcon");
          }
          d tp = this.p;
          if (tp == null) {
             a.S("mHeaderData");
          }
          uod.L(tp.mIconUrl);
          uod = this.r;
          if (uod == null) {
             a.S("mTvTitle");
          }
          tp = this.p;
          if (tp == null) {
             a.S("mHeaderData");
          }
          uod.setText(tp.mTitle);
          int i = 0;
          tp = this.s;
          if (tp == null) {
             a.S("mTvLabel1");
          }
          this.P8(i, tp);
          i = 1;
          tp = this.t;
          if (tp == null) {
             a.S("mTvLabel2");
          }
          this.P8(i, tp);
          uod = this.u;
          if (uod == null) {
             a.S("mTvDesc");
          }
          tp = this.p;
          if (tp == null) {
             a.S("mHeaderData");
          }
          uod.setText(tp.mDesc);
       }
       return;
    }
    public final void P8(int p0,TextView p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "5")) {
          return;
       }
       uod = this.p;
       if (uod == null) {
          a.S("mHeaderData");
       }
       PhotoAdvertisement$HeaderData mLabels = uod.mLabels;
       PhotoAdvertisement$HalfLandingHeaderLabel halfLandingH = (mLabels != null)? CollectionsKt___CollectionsKt.F2(mLabels, p0): null;
       if (halfLandingH == null) {
          p1.setVisibility(8);
       }else {
          p1.setVisibility(0);
          p1.setText(halfLandingH.mText);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.iv_icon);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.iv_icon\)");
       this.q = view;
       view = m1.f(p0, R.id.tv_title);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.tv_title\)");
       this.r = view;
       view = m1.f(p0, R.id.tv_label1);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.tv_label1\)");
       this.s = view;
       view = m1.f(p0, R.id.tv_label2);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.tv_label2\)");
       this.t = view;
       p0 = m1.f(p0, R.id.tv_desc);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.tv_desc\)");
       this.u = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Object obj = this.q8(n.class);
       a.o(obj, "inject\(HalfLandingItem::class.java\)");
       this.p = obj.a();
       return;
    }
}
