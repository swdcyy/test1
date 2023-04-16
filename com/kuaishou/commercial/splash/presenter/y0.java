package com.kuaishou.commercial.splash.presenter.y0;
import com.kuaishou.commercial.splash.presenter.n0;
import com.kuaishou.commercial.splash.presenter.x0;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.commercial.splash.presenter.r0;
import com.kuaishou.commercial.splash.presenter.r0$a;
import android.view.View;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import im8.f;
import gz.s;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import androidx.core.content.ContextCompat;
import com.kuaishou.android.model.ads.SplashInfo$SplashPlayableInfo;
import com.kuaishou.android.model.ads.SplashInfo$PlayableLineInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kuaishou.commercial.splash.view.SplashLineView;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import ekd.k1;
import bz.a;
import android.view.GestureDetector;
import yx.j0;
import com.kuaishou.commercial.splash.SplashUtils;
import yy.x0;
import io.reactivex.subjects.PublishSubject;
import com.kwai.framework.player.core.b;
import tkd.b;
import tkd.d;
import nl9.h0;
import wl9.x;

public class y0 extends n0	// class@001614
{
    public View L;
    public SplashLineView M;
    public View$OnTouchListener N;
    public g0 O;
    public boolean P;
    public SplashInfo$SplashPlayableInfo Q;
    public f R;
    public PublishSubject S;
    public f T;
    public Runnable U;

    public void y0(){
       super();
       this.U = new x0(this);
    }
    public int P8(Boolean p0){
       p0 = PatchProxy.applyOneRefs(p0, this, y0.class, "15");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       n0 tA = this.A;
       if (!tA instanceof r0 || tA.R == null) {
          return 0;
       }
       tA.R.run();
       return 2;
    }
    public View R8(View p0){
       y0 tL = this.L;
       if (tL instanceof ScaleHelpView) {
          return tL;
       }
       return p0;
    }
    public void S8(){
       String obj;
       int i1;
       y0 oy0 = y0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy0, "3")) {
          return;
       }
       if (this.R.get() != null) {
          s os = this.R.get();
          this.A = os;
          r0 v = os.V;
          this.Q = v;
          if (v != null && (!PatchProxy.applyVoid(objArray, this, oy0, "4") && this.Q != null)) {
             int i = n.c(this.getContext(), 4.00f);
             int color = ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f06060a);
             SplashInfo$SplashPlayableInfo mPlayableLin = this.Q.mPlayableLineInfo;
             if (mPlayableLin != null && mPlayableLin.mLineWidth > null) {
                i = n.c(this.getContext(), (float)mPlayableLin.mLineWidth);
             }
             if (mPlayableLin != null && !TextUtils.x(mPlayableLin.mLineColorHex)) {
                SplashInfo$PlayableLineInfo mLineColorHe = mPlayableLin.mLineColorHex;
                if (PatchProxy.isSupport(oy0)) {
                   obj = PatchProxy.applyTwoRefs(mLineColorHe, Integer.valueOf(color), this, oy0, "5");
                   if (obj != PatchProxyResult.class) {
                      i1 = obj.intValue();
                   label_0086 :
                      color = i1;
                   }
                }
                if (!TextUtils.x(mLineColorHe)) {
                   obj = "#";
                   if (!mLineColorHe.startsWith(obj)) {
                      mLineColorHe = obj+mLineColorHe;
                   }
                   i1 = TextUtils.J(mLineColorHe, color);
                   goto label_0086 ;
                }
             }
          label_00aa :
             this.M.b(color, i);
             k1.r(this.U, TimeUnit.SECONDS.toMillis((long)this.Q.mDrawLineBeginTime));
          }
       }
       return;
    }
    public void Y8(int p0){
       y0 oy0 = y0.class;
       if (PatchProxy.isSupport(oy0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy0, "8")) {
          return;
       }
       super.Y8(p0);
       this.j9();
       return;
    }
    public void Z8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y0.class, "6")) {
          return;
       }
       super.Z8(p0);
       if (this.Q != null && p0.a == 3) {
          this.e9();
       }
       return;
    }
    public void b9(int p0){
       y0 oy0 = y0.class;
       if (PatchProxy.isSupport(oy0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy0, "9")) {
          return;
       }
       super.b9(p0);
       this.j9();
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, y0.class, "13")) {
          return;
       }
       super.d9();
       y0 tL = this.L;
       if (tL instanceof ScaleHelpView) {
          y0 tO = this.O;
          if (tO != null) {
             tL.j(tO);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y0.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.L = p0.findViewById(0x7f0a2a96);
       this.M = p0.findViewById(0x7f0a17a3);
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, y0.class, "10")) {
          return;
       }
       if (this.M != null) {
          Object[] objArray = new Object[0];
          j0.f("SplashTouchControl", "delayDisplayFinish hasLine:"+this.P, objArray);
       }
       if (this.M != null && this.P != null) {
          this.h9();
       }
       return;
    }
    public final void h9(){
       if (PatchProxy.applyVoid(null, this, y0.class, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "SplashTouchControl";
       j0.f(str, "onPlayableSplashScrolled", objArray);
       if (SplashUtils.z(this.C)) {
          return;
       }
       SplashUtils.O(this.C);
       x0 ox0 = this.r.get();
       if (ox0 != null) {
          ox0.u(7, this.D, this.E);
       }
       n0 tA = this.A;
       if (tA == null) {
          return;
       }else {
          Object[] objArray1 = new Object[i];
          j0.f(str, "onPlayableSplashScrolled mCanShowSurpriseOnSplash:"+tA.W, objArray1);
          if (tA.W != null) {
             this.S.onNext(Boolean.TRUE);
             y0 tT = this.T;
             if (tT != null && tT.get() != null) {
                this.T.get().pause();
             }
          }else if(tA.R != null){
             if (d.a(-536296199).m30()) {
                tA.R.b = true;
             }
             tA.R.run();
          }
          this.s.onNext(new a(2));
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "1")) {
          return;
       }
       super.j8();
       this.R = this.x8("SPLASH_VIDEO_TYPE_PARAM");
       this.S = this.r8("SPLASH_SURPRISED_SHOW_EVENT");
       this.T = this.w8("SPLASH_VIDEO_PLAYER");
       return;
    }
    public final void j9(){
       if (PatchProxy.applyVoid(null, this, y0.class, "7")) {
          return;
       }
       if (this.Q != null) {
          k1.m(this.U);
       }
       return;
    }
    public void onEventMainThread(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y0.class, "14")) {
          return;
       }
       super.onEventMainThread(p0);
       this.e9();
       return;
    }
}
