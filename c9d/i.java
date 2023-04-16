package c9d.i;
import ucd.n;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.widget.RelativeLayout;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import nfd.t0;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.drawee.view.DraweeView;
import android.os.Handler;
import c9d.b;
import erd.o;
import brd.t;
import c9d.a;
import erd.g;
import crd.b;
import com.yxcorp.plugin.search.entity.RecommendResponse$CnyPopup;
import com.yxcorp.plugin.search.SearchPreferenceObject;
import x6d.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Long;
import android.widget.PopupWindow;
import android.graphics.drawable.ColorDrawable;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.Drawable;
import c9d.e;
import java.lang.Runnable;
import c9d.h;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ekd.m1;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.plugin.search.homepage.homev8.fragment.SearchBaseHomeFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i extends n	// class@00050a
{
    public ImageView A;
    public ImageView B;
    public KwaiImageView C;
    public KwaiImageView D;
    public View E;
    public View F;
    public LottieAnimationView G;
    public FrameLayout H;
    public RelativeLayout I;
    public LinearLayout J;
    public PopupWindow K;
    public boolean L;
    public String M;
    public boolean N;
    public boolean O;
    public Handler P;
    public int Q;
    public int R;
    public int S;
    public BaseFragment T;
    public boolean p;
    public t q;
    public ObjectAnimator r;
    public ObjectAnimator s;
    public ObjectAnimator t;
    public ObjectAnimator u;
    public ObjectAnimator v;
    public ObjectAnimator w;
    public ObjectAnimator x;
    public View y;
    public KwaiCDNImageView z;

    public void i(){
       super();
       this.p = true;
       this.L = true;
       this.M = "A";
       this.S = a1.e(47.00f);
    }
    public void E8(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       this.I = this.T.getParentFragment().getView().findViewById(0x7f0a37a6);
       i = n.z(this.getContext());
       this.R = i - (t0.o * 2);
       ViewGroup$LayoutParams layoutParams = this.H.getLayoutParams();
       layoutParams.width = i;
       layoutParams.height = (int)((float)this.R / 0x3f79890d) + t0.C;
       this.H.setLayoutParams(layoutParams);
       ViewGroup$LayoutParams layoutParams1 = this.C.getLayoutParams();
       i tR = this.R;
       layoutParams1.width = tR;
       layoutParams1.height = (int)((float)tR / 0x3f79890d);
       this.C.setLayoutParams(layoutParams1);
       layoutParams1 = this.D.getLayoutParams();
       tR = this.R;
       layoutParams1.width = tR;
       layoutParams1.height = (int)((float)tR / 0x3f79890d);
       layoutParams1 = this.G.getLayoutParams();
       tR = this.R;
       layoutParams1.width = tR;
       layoutParams1.height = (int)((float)tR / 0x3f79890d);
       this.G.setLayoutParams(layoutParams1);
       this.C.setAspectRatio(0x3f79890d);
       this.C.setAspectRatio(0x3f79890d);
       this.z.setVisibility(8);
       this.A.setVisibility(8);
       this.P = new Handler();
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          this.q.map(b.b).subscribe(new a(this));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, i.class, "10")) {
          return;
       }
       this.P.removeCallbacksAndMessages(null);
       return;
    }
    public void V8(RecommendResponse$CnyPopup p0){
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "8")) {
          return;
       }
       Type g = SearchPreferenceObject.G;
       SharedPreferences a = a.a;
       String str = a.getString("popupWindowShowCount", "null");
       HashMap hashMap = (str == null || str == "")? null: b.a(str, g);
       int intx = a.getInt("popupGuideShowCount", 0);
       if (hashMap == null) {
          hashMap = new HashMap();
       }
       String str1 = QCurrentUser.ME.getId()+p0.mPopTaskId;
       QCurrentUser.ME.getId();
       String str2 = DateUtils.y(System.currentTimeMillis());
       if (!str2.equals(a.j())) {
          a.v(str2);
          hashMap.clear();
       }
       Long longx = null;
       if (hashMap.containsKey(str1)) {
          longx = hashMap.get(str1).longValue();
       }
       if (longx - (long)p0.mPopShowCount < 0) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, oi, "9")) {
             this.z.setVisibility(0);
             this.A.setVisibility(0);
             PopupWindow popupWindow = new PopupWindow(this.E);
             this.K = popupWindow;
             popupWindow.setWidth(n.z(this.getContext()));
             this.K.setHeight(-1);
             this.K.setClippingEnabled(0);
             this.K.setOutsideTouchable(true);
             this.K.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f0601e7)));
             this.P.postDelayed(new e(this), 100);
             this.P.post(new h(this, p0));
          }
          hashMap.put(str1, Long.valueOf((longx + 1)));
          SharedPreferences$Editor uEditor = a.edit();
          uEditor.putString("popupWindowShowCount", b.e(hashMap));
          g.a(uEditor);
          if (!intx) {
             this.J.setVisibility(0);
             intx = intx + 1;
          }else {
             this.J.setVisibility(4);
          }
          uEditor = a.edit();
          uEditor.putInt("popupGuideShowCount", intx);
          g.a(uEditor);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       p0 = LayoutInflater.from(this.getContext()).inflate(R.layout.arg_RES_7f0d14a2, null);
       this.E = p0;
       this.y = m1.f(p0, 0x7f0a316f);
       this.z = m1.f(this.E, 0x7f0a34c4);
       this.A = m1.f(this.E, 0x7f0a3170);
       this.B = m1.f(this.E, 0x7f0a3176);
       this.C = m1.f(this.E, 0x7f0a317b);
       this.F = m1.f(this.E, 0x7f0a3183);
       this.D = m1.f(this.E, 0x7f0a317c);
       this.G = m1.f(this.E, 0x7f0a3178);
       this.J = m1.f(this.E, 0x7f0a3184);
       this.H = m1.f(this.E, 0x7f0a0492);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.r8("SEARCH_HOME_RECOMMEND_RESPONSE_OBSERVABLE");
       this.T = this.q8(SearchBaseHomeFragment.class);
       return;
    }
}
