package f72.m;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.widget.ImageView;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.graphics.Typeface;
import ekd.d0;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import f72.h;
import f72.k;
import f72.i;
import f72.j;
import f72.l;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Long;
import com.yxcorp.gifshow.util.DateUtils;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.textview.AdjustSizeTextView;
import com.yxcorp.gifshow.image.KwaiImageView;

public class m extends c	// class@0028d1
{
    public AdjustSizeTextView p;
    public KwaiImageView q;
    public ViewGroup r;
    public QPhoto s;
    public LiveDoubleListParam t;
    public static String sLivePresenterClassName = "LiveDoubleListFeedBottomSummaryPresenter";

    public void m(){
       super();
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       this.p.setVisibility(8);
       this.q.setVisibility(8);
       String str = 1;
       if (!PatchProxy.applyVoid(objArray, this, om, "4") && this.t.mCardStyle == str) {
          this.p.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "5")) {
          m tt = this.t;
          if (tt.mSummaryContainerHeightDp > null && tt.mCardStyle != str) {
             ViewGroup$LayoutParams layoutParams = this.r.getLayoutParams();
             layoutParams.height = a1.e((float)this.t.mSummaryContainerHeightDp);
             this.r.setLayoutParams(layoutParams);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "6")) {
          CommonMeta uCommonMeta = r1.w0(this.s.mEntity);
          LiveDoubleListParam mSummaryMode = this.t.mSummaryMode;
          if (mSummaryMode != str) {
             if (mSummaryMode != 3) {
                this.R8(uCommonMeta);
             }else {
                this.P8(uCommonMeta);
             }
          }else if(PatchProxy.applyVoidOneRefs(uCommonMeta, this, om, "10")){
             if (uCommonMeta != null) {
                objArray = r1.G1(uCommonMeta);
             }
             if (!TextUtils.x(objArray)) {
                this.p.setVisibility(0);
                this.p.setText(objArray);
                this.p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f080a3a, 0, 0, 0);
             }else {
                this.P8(uCommonMeta);
             }
          }
       }
       return;
    }
    public final void P8(CommonMeta p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "8")) {
          return;
       }
       if (p0 != null) {
          CommonMeta mCoverCommon = p0.mCoverCommonTags;
          if (mCoverCommon != null && mCoverCommon.mAuthorRightSideTag != null) {
             this.p.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
             this.p.setText("");
             return;
          }
       }
       Object obj = PatchProxy.apply(null, this, om, "9");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): k0.e(this.s, h.a, k.a, i.a, j.a, l.a).or(Long.valueOf(0)).longValue();
       if (l > 0) {
          this.p.setText(String.valueOf(l));
          this.p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.arg_RES_7f080a33, 0, 0, 0);
          this.p.setVisibility(0);
       }else {
          this.R8(p0);
       }
       return;
    }
    public final void R8(CommonMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "7")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       CommonMeta mCreated = p0.mCreated;
       if (mCreated - null <= 0) {
          this.p.setVisibility(8);
       }else {
          this.p.setVisibility(0);
          if (TextUtils.x(p0.mShowTime)) {
             p0.mShowTime = DateUtils.w(this.getContext(), mCreated);
          }
          this.p.setText(p0.mShowTime);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1c95);
       this.q = m1.f(p0, 0x7f0a1c96);
       this.r = m1.f(p0, 0x7f0a1c97);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("LIVE_EXPLORE_PARAM");
       return;
    }
}
