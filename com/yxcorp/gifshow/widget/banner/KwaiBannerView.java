package com.yxcorp.gifshow.widget.banner.KwaiBannerView;
import com.yxcorp.gifshow.widget.banner.LoopBannerView;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$c;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$a;
import com.yxcorp.utility.n;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$d;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$e;
import android.view.ViewGroup;
import java.lang.Integer;
import com.kwai.library.widget.viewpager.RecyclerViewPager;
import com.yxcorp.gifshow.relation.intimate.dialog.IntimateGuideBannerView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.widget.banner.KwaiBannerView$f;
import android.os.Handler;
import android.view.View;
import java.lang.Float;
import com.yxcorp.gifshow.widget.banner.FixedHeightAspectRatioRelativeLayout;

public class KwaiBannerView extends LoopBannerView	// class@001945
{
    public boolean A;
    public final long o;
    public final String p;
    public final KwaiBannerView$a q;
    public int r;
    public int s;
    public boolean t;
    public float u;
    public long v;
    public int w;
    public List x;
    public List y;
    public boolean z;
    public static final int B;
    public static final KwaiBannerView$c C;

    static {
       KwaiBannerView.C = new KwaiBannerView$c(null);
       KwaiBannerView.B = 0x3021;
    }
    public void KwaiBannerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void KwaiBannerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void KwaiBannerView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       long l = TimeUnit.SECONDS.toMillis(5);
       this.o = l;
       this.p = "TubeBannerView";
       this.q = new KwaiBannerView$a(this);
       this.r = n.c(p0, 11.00f);
       this.s = n.c(p0, 0);
       this.v = l;
       this.w = n.c(p0, 8.00f);
       this.x = new ArrayList();
       this.y = new ArrayList();
       this.z = true;
    }
    public void KwaiBannerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public RecyclerView$Adapter c(){
       Object obj = PatchProxy.apply(null, this, KwaiBannerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiBannerView$d(this);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, KwaiBannerView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.y.iterator();
       while (obj.hasNext()) {
          obj.next().dispatchTouchEvent(p0);
       }
       return super.dispatchTouchEvent(p0);
    }
    public void e(boolean p0){
       if (PatchProxy.isSupport(KwaiBannerView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiBannerView.class, "16")) {
          return;
       }
       if (p0) {
          this.n();
       }else {
          this.m();
       }
       return;
    }
    public void g(int p0,boolean p1){
       if (PatchProxy.isSupport(KwaiBannerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, KwaiBannerView.class, "20")) {
          return;
       }
       this.getMViewPager().z(p0, p1);
       if (!p1 && (this instanceof IntimateGuideBannerView ^ 0x01)) {
          this.getMViewPager().scrollBy(0, 0);
       }
       return;
    }
    public final boolean getMDisableAutoScroll(){
       return this.A;
    }
    public final void i(KwaiBannerView$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBannerView.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       if (!this.x.contains(p0)) {
          this.x.add(p0);
       }
       return;
    }
    public final void j(KwaiBannerView$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBannerView.class, "11")) {
          return;
       }
       a.p(p0, "listener");
       if (this.x.contains(p0)) {
          this.x.remove(p0);
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, KwaiBannerView.class, "2")) {
          return;
       }
       this.getMViewPager().setAdapter(this.c());
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, KwaiBannerView.class, "3")) {
          return;
       }
       this.q.sendEmptyMessageDelayed(KwaiBannerView.B, this.v);
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, KwaiBannerView.class, "7")) {
          return;
       }
       if (this.A != null) {
          return;
       }
       if (this.t == null) {
          this.t = true;
          if (!PatchProxy.applyVoid(null, this, KwaiBannerView.class, "9")) {
             this.l();
          }
       }
       return;
    }
    public final void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiBannerView.class, "6")) {
          return;
       }
       if (this.t != null) {
          this.t = false;
          if (!PatchProxy.applyVoid(objArray, this, KwaiBannerView.class, "8")) {
             this.q.removeMessages(KwaiBannerView.B);
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KwaiBannerView.class, "17")) {
          return;
       }
       super.onDetachedFromWindow();
       this.q.removeCallbacksAndMessages(null);
       return;
    }
    public void onWindowVisibilityChanged(int p0){
       if (PatchProxy.isSupport(KwaiBannerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiBannerView.class, "10")) {
          return;
       }
       super.onWindowVisibilityChanged(p0);
       if (this.z != null) {
          if (!p0) {
             this.m();
          }else {
             this.n();
          }
       }
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          iterator.next().onWindowVisibilityChanged(p0);
       }
       return;
    }
    public final void setAspectRatio(float p0){
       if (PatchProxy.isSupport(KwaiBannerView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, KwaiBannerView.class, "4")) {
          return;
       }
       this.u = p0;
       this.getMContainer().setAspectRadio(p0);
       return;
    }
    public void setBanner(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiBannerView.class, "5")) {
          return;
       }
       a.p(p0, "banners");
       this.q.removeMessages(KwaiBannerView.B);
       super.setBanner(p0);
       this.l();
       return;
    }
    public final void setLoopInterval(long p0){
       this.v = p0;
    }
    public final void setMDisableAutoScroll(boolean p0){
       this.A = p0;
    }
    public final void setPaddingHorizontal(int p0){
       this.r = p0;
    }
    public final void setRadius(int p0){
       this.w = p0;
    }
    public final void setUseAutoStart(boolean p0){
       this.z = p0;
    }
}
