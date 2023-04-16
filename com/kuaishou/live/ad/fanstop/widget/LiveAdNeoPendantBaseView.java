package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import ml8.d;
import tl0.d;
import android.widget.FrameLayout;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import msd.a;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$f;
import erd.g;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$g;
import erd.o;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$h;
import t45.d;
import brd.z;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$i;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$j;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$k;
import erd.a;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$b;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$c;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$d;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$e;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$startCoolDownIfNeed$5;
import android.animation.AnimatorSet;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import yx.j0;
import android.widget.TextView;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import android.view.View;

public abstract class LiveAdNeoPendantBaseView extends FrameLayout implements d, d	// class@0009e4
{
    public TextView b;
    public b c;
    public b d;
    public int e;
    public HashMap f;
    public static final LiveAdNeoPendantBaseView$a g;

    static {
       LiveAdNeoPendantBaseView.g = new LiveAdNeoPendantBaseView$a(null);
    }
    public void LiveAdNeoPendantBaseView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveAdNeoPendantBaseView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveAdNeoPendantBaseView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void LiveAdNeoPendantBaseView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static void getMPendantType$commercial_live_release$annotations(){
    }
    public b a(long p0,l p1,a p2){
       if (PatchProxy.isSupport(LiveAdNeoPendantBaseView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, p2, this, LiveAdNeoPendantBaseView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "onTimeTick");
       a.p(p2, "complete");
       this.j();
       b uob = t.intervalRange(0, p0, 0, 1, TimeUnit.SECONDS).doOnNext(new LiveAdNeoPendantBaseView$f(p1, 1)).map(new LiveAdNeoPendantBaseView$g(p0)).map(new LiveAdNeoPendantBaseView$h(this)).observeOn(d.a).subscribe(new LiveAdNeoPendantBaseView$i(this), LiveAdNeoPendantBaseView$j.b, new LiveAdNeoPendantBaseView$k(p2));
       this.c = uob;
       a.o(uob, "Observable.intervalRange¡­ountDownDisposable = it }");
       return uob;
    }
    public b b(long p0,a p1){
       if (PatchProxy.isSupport(LiveAdNeoPendantBaseView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, this, LiveAdNeoPendantBaseView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "complete");
       this.j();
       this.setCoolDownBgImageResourceIfNeed$commercial_live_release(p0);
       boolean b = (p0 > 0)? true: false;
       b uob = t.intervalRange(0, p0, 0, 1, TimeUnit.SECONDS).map(new LiveAdNeoPendantBaseView$b(p0)).map(new LiveAdNeoPendantBaseView$c(this)).observeOn(d.a).subscribe(new LiveAdNeoPendantBaseView$d(this), new LiveAdNeoPendantBaseView$e(p1), new LiveAdNeoPendantBaseView$startCoolDownIfNeed$5(this, b, p1));
       this.d = uob;
       a.o(uob, "Observable.intervalRange¡­CoolDownDisposable = it }");
       return uob;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoPendantBaseView.class, "4")) {
          return;
       }
       LiveAdNeoPendantBaseView td = this.d;
       if (td != null) {
          td.dispose();
       }
       return;
    }
    public abstract AnimatorSet e(long p0,a p1);
    public final String f(int p0){
       String obj;
       if (PatchProxy.isSupport(LiveAdNeoPendantBaseView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveAdNeoPendantBaseView.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = p0 / 60;
       String str = String.valueOf((i % 60));
       char c = '0';
       if (str.length() < 2) {
          str = c+str;
       }
       obj = (p0 >= 3600)? String.valueOf((i / 60)): "";
       String str1 = String.valueOf((p0 % 60));
       if (str1.length() < 2) {
          str1 = c+str1;
       }
       str1 = (!TextUtils.isEmpty(obj))? obj+':'+str+':'+str1: str+':'+str1;
       return str1;
    }
    public abstract void g(boolean p0,long p1,a p2);
    public void g1(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoPendantBaseView.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("LiveAdNeoPendantBaseView", "stop count down", objArray);
       LiveAdNeoPendantBaseView tc = this.c;
       if (tc != null) {
          tc.dispose();
       }
       return;
    }
    public final TextView getMCountDownTextView$commercial_live_release(){
       return this.b;
    }
    public final int getMPendantType$commercial_live_release(){
       return this.e;
    }
    public abstract void h(BaseFeed p0);
    public abstract void i(BaseFeed p0,String p1);
    public abstract void j();
    public final void k(String p0,boolean p1){
       if (PatchProxy.isSupport(LiveAdNeoPendantBaseView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveAdNeoPendantBaseView.class, "8")) {
          return;
       }
       LiveAdNeoPendantBaseView tb = this.b;
       if (tb != null) {
          tb.setText(p0);
       }
       int i = 8;
       if (p1) {
          i = 9;
       }
       LiveAdNeoPendantBaseView tb1 = this.b;
       if (tb1 != null) {
          tb1.setTextSize(1, (float)i);
       }
       return;
    }
    public abstract void l(a p0);
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoPendantBaseView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       return;
    }
    public abstract void setCoolDownBgImageResourceIfNeed$commercial_live_release(long p0);
    public final void setMCountDownTextView$commercial_live_release(TextView p0){
       this.b = p0;
    }
    public final void setMPendantType$commercial_live_release(int p0){
       this.e = p0;
    }
    public final void setPendantType(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdNeoPendantBaseView.class, "7")) {
          return;
       }
       int i = (p0 != null)? p0.intValue(): 0;
       this.e = i;
       return;
    }
}
