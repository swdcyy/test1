package cad.d;
import ucd.n;
import nfd.y0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nfd.o3;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.TemplateText;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import x6d.e;
import com.yxcorp.plugin.search.b;
import nfd.l0;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import lnc.a1;
import androidx.core.graphics.drawable.a;
import android.widget.ImageView;
import nfd.t0;
import com.yxcorp.plugin.search.utils.j0;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import android.text.SpannableStringBuilder;
import java.lang.Integer;
import sy5.a;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import nfd.q1;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.plugin.search.utils.k;
import ekd.m1;
import cad.b;
import android.view.View$OnClickListener;
import cad.c;

public class d extends n	// class@000513
{
    public BaseFragment p;
    public SearchItem q;
    public View r;
    public View s;
    public View t;
    public TextView u;
    public ImageView v;
    public boolean w;

    public void d(){
       super();
       this.w = y0.j();
    }
    public void E8(){
       int colorInt;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "6")) {
          return;
       }
       o3.H(this.r, 8);
       SearchItem mKBoxItem = this.q.mKBoxItem;
       if (mKBoxItem != null) {
          KBoxItem mBottomJumpI = mKBoxItem.mBottomJumpInfo;
          if (mBottomJumpI != null && !mBottomJumpI.isTextEmpty()) {
             if (this.getActivity() instanceof e) {
                b uob = this.getActivity().C();
                if (uob != null && (uob.t != null && l0.c(this.q.mKBoxItem.mBottomJumpInfo.mKwaiLinkUrl))) {
                   return;
                }
             }
             this.W8(0);
             o3.H(this.r, 0);
             colorInt = this.q.mKBoxItem.mBottomJumpInfo.getColorInt(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f061641));
             this.u.setTextColor(colorInt);
             this.u.setText(this.V8());
             Drawable uDrawable = a1.f(R.drawable.arg_RES_7f08054c);
             a.n(uDrawable, colorInt);
             this.v.setImageDrawable(uDrawable);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "7")) {
          uod = this.r;
          int t = t0.t;
          colorInt = (this.w != null)? t0.m: t0.q;
          j0.I(uod, t, colorInt, t, 0);
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, d.class, "5");
    }
    public final CharSequence V8(){
       SpannableStringBuilder obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = o3.Q(this.getContext(), true, this.q.mKBoxItem.mBottomJumpInfo.mCouponTextInfoList);
       if (obj == null) {
          return this.q.mKBoxItem.mBottomJumpInfo.mText;
       }
       obj.insert(0, this.q.mKBoxItem.mBottomJumpInfo.mText);
       return obj;
    }
    public final void W8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "4")) {
          return;
       }
       a uoa = a.k();
       String str = (this.V8() != null)? this.V8().toString(): null;
       uoa.e("button_name", str);
       q1.B(p0, this.p, this.q, "ALADDINSP_MORE_BUTTON", null, uoa.j(), null);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       SearchItem mKBoxItem = this.q.mKBoxItem;
       if (mKBoxItem != null) {
          KBoxItem mBottomJumpI = mKBoxItem.mBottomJumpInfo;
          if (mBottomJumpI != null && !TextUtils.x(mBottomJumpI.mKwaiLinkUrl)) {
             this.W8(1);
             k.c(this.getActivity(), this.q.mKBoxItem.mBottomJumpInfo.mKwaiLinkUrl);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a04aa);
       this.u = m1.f(p0, 0x7f0a04f8);
       this.v = m1.f(p0, 0x7f0a04a9);
       this.s = m1.f(p0, 0x7f0a08bd);
       this.t = m1.f(p0, 0x7f0a08be);
       d ts = this.s;
       int i = 0;
       int i1 = (this.w != null)? 0: 8;
       o3.H(ts, i1);
       ts = this.t;
       if (this.w == null) {
          i = 8;
       }
       o3.H(ts, i);
       this.P8(this.r, new b(this));
       this.P8(this.s, new c(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(SearchItem.class);
       this.p = this.r8("FRAGMENT");
       return;
    }
}
