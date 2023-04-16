package f12.i;
import f12.d;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Object;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import e12.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.liveslide.a$a;
import com.kuaishou.live.core.basic.liveslide.a;
import c51.b;
import com.kuaishou.live.core.basic.liveslide.b$a;
import com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.liveslide.b$b;
import com.kuaishou.live.core.basic.liveslide.b;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.util.Objects;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import b51.d;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import d12.d;
import java.lang.Integer;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Number;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import wg3.b;
import java.util.List;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import android.app.Activity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import android.view.View;
import g12.b;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import z41.b;
import z41.a;
import com.kuaishou.live.basic.liveslide.a;
import cw6.b;
import java.lang.RuntimeException;
import androidx.viewpager.widget.ViewPager$i;
import kp3.e;
import f12.g;
import f12.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import pp.a;
import java.lang.StringBuilder;
import q87.c;
import c51.i;
import c51.d;
import c51.h;
import bw6.a;
import fw6.b;
import ge5.d;
import g12.a;
import androidx.fragment.app.Fragment;
import pw6.a;
import f12.o;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import f12.c;

public class i implements d	// class@002839
{
    public a a;
    public d b;
    public boolean c;
    public long d;
    public LiveBizParam e;
    public static final boolean f;

    static {
       i.f = a.t().u("SOURCE_LIVE").d("enableIsFragmentOnScreenMethodV2", false);
    }
    public void i(){
       super();
    }
    public boolean A(){
       return this.e.mIsActivityClosedBySwipeOut;
    }
    public void B(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "31")) {
          return;
       }
       this.a.j().g(p0);
       return;
    }
    public boolean C(DetailSlidePlayFragment p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       i = this.a.h().a();
       boolean i1 = (i.f)? p0.Bh(): p0.mh();
       i1 = (i == i1)? true: false;
       return i1;
    }
    public void D(boolean p0){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "28")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       b$b uob1 = b$b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, uob1, "20")) {
          i = uob.a();
          if (i > 0) {
             uob.a.a.q().I((i - 1), p0);
          }
       }
       return;
    }
    public boolean E(){
       return true;
    }
    public boolean F(){
       return false;
    }
    public void G(boolean p0){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "27")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       b$b uob1 = b$b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, uob1, "19")) {
          i = uob.a();
          if (i < (uob.a.a().b() - 1)) {
             uob.a.a.q().I((i + 1), p0);
          }
       }
       return;
    }
    public Object H(){
       return this.b.c;
    }
    public void I(int p0,boolean p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, oi, "16")) {
          return;
       }
       this.a.h().d(p0, p1);
       return;
    }
    public int J(DetailSlidePlayFragment p0,LiveStreamFeed p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       return this.a.j().c(p1);
    }
    public boolean K(){
       return this.c;
    }
    public void L(SlidePlayConfig p0,String p1,int p2){
    }
    public void M(LiveStreamFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       this.a.j().f(this.a.h().a(), p0);
       return;
    }
    public LiveStreamFeed N(){
       int i;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, i.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i = this.a.h().a();
       if (i < 0 || i >= this.a.j().a().size()) {
          return objArray;
       }
       return this.a.j().a().get(this.a.h().a());
    }
    public void O(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "30")) {
          return;
       }
       this.a.j().e(p0);
       return;
    }
    public int P(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.j().c(p0);
    }
    public LiveSlidePlayEnterParam Q(LiveSlidePlayEnterParam$b p0,LiveBizParam p1,Activity p2,LiveStreamFeedWrapper p3){
       p1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, i.class, "26");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return p0.i(this.getDataList()).a();
    }
    public View R(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oi, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.e.a();
    }
    public void S(Activity p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "23")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p1, uob, b$b.class, "14")) {
          uob.a.e().q().S(p1);
       }
       return;
    }
    public void b(){
       a.a(this);
    }
    public int c(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, i.class, "11");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == null) {
          throw new RuntimeException("method \"LiveSlideContainerImpl#getItemEnterType\" cannot be called, probably because the activity has been destroyed!");
       }
       b$b uob = obj.h();
       Objects.requireNonNull(uob);
       Object obj1 = PatchProxy.apply(objArray, uob, b$b.class, "6");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(!uob.c()){
          i = -1;
       }else {
          i = uob.a.e().o().e0();
       }
       int i1 = 1;
       if (i != i1) {
          i1 = 2;
          if (i != i1) {
             return 0;
          }
       }
       return i1;
    }
    public void d(boolean p0,int p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, oi, "13")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       b$b uob1 = b$b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), uob, uob1, "9")) {
          uob.a.e().q().c0(p0, p1);
       }
       return;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, i.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.j().b();
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "19")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p0, uob, b$b.class, "17")) {
          d uod = uob.a.e();
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(p0, uod, d.class, "3")) {
             uod.p.remove(p0);
          }
       }
       return;
    }
    public int getCurrentPosition(){
       Object obj = PatchProxy.apply(null, this, i.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.h().a();
    }
    public List getDataList(){
       Object obj = PatchProxy.apply(null, this, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j().a();
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "18")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p0, uob, b$b.class, "16")) {
          d uod = uob.a.e();
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidOneRefs(p0, uod, d.class, "2")) {
             uod.p.add(p0);
          }
       }
       return;
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, i.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.f())? true: false;
       return b;
    }
    public e l(){
       Object obj = PatchProxy.apply(null, this, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k0.b(this.b, g.a, h.a).orNull();
    }
    public void m(int p0,List p1,String p2){
       int i;
       int i1;
       i oi1;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, i.class, "32")) {
          return;
       }
       i = this.a.h().a();
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       Object[] obj = PatchProxy.apply(null, uob, b$b.class, "3");
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else if(!uob.c()){
          i1 = -1;
       }else {
          i1 = uob.a.e().o().k0();
       }
       i = (i >= (i1 - 1))? -1: p0;
       int i2 = 0;
       obj = new Object[i2];
       a.C().w(oi.getCanonicalName(), "addItems targetPosition = "+p0+" realTargetPosition = "+i+" reason = "+p2, obj);
       a$a uoa1 = this.a.j();
       Objects.requireNonNull(uoa1);
       b$a uoa2 = b$a.class;
       if (!PatchProxy.isSupport(uoa2) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p1, uoa1, uoa2, "18")) {
          if (i == -1) {
             oi1 = uoa1.a.e().p();
             Objects.requireNonNull(oi1);
             i2 = PatchProxy.applyOneRefs(p1, oi1, i.class, "5");
             if (i2 != patchProxyRe) {
                i2.booleanValue();
             }else {
                oi1.b.b(p1);
             }
          }else {
             b uob1 = uoa1.a.e().o().b0(i);
             if (uob1 == null) {
                objArray = new Object[i2];
                a.C().w(uoa.getCanonicalName(), "addItems exception, targetModel == null", objArray);
             }else {
                int i3 = uoa1.a.h().a();
                b uob2 = uoa1.a.e().o().b0(i3);
                if (uob2 == null) {
                   objArray = new Object[i2];
                   a.C().w(uoa.getCanonicalName(), "addItems exception, currentModel == null", objArray);
                }else {
                   i oi2 = uoa1.a.e().p();
                   Objects.requireNonNull(oi2);
                   Object obj1 = PatchProxy.applyOneRefs(uob1, oi2, i.class, "21");
                   int i4 = (obj1 != patchProxyRe)? obj1.intValue(): oi2.b.h(uob1);
                   if (i <= i3) {
                      obj = new Object[i2];
                      a.C().w(uoa.getCanonicalName(), "addItems: add before current item, keep current photo not change", obj);
                      i oi3 = uoa1.a.e().p();
                      Objects.requireNonNull(oi3);
                      if (PatchProxy.isSupport(i.class)) {
                         Object obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i4), p1, oi3, i.class, "22");
                         if (obj2 != patchProxyRe) {
                            obj2.booleanValue();
                         label_0189 :
                            uoa1.a.e().o().C0(uoa1.a(), uob2, -1, i2);
                         }
                      }
                      oi3.b.o(i4, p1);
                      goto label_0189 ;
                   }else {
                      objArray = new Object[i2];
                      a.C().w(uoa.getCanonicalName(), "addItems: add after current item, keep current photo not change", objArray);
                      oi1 = uoa1.a.e().p();
                      Objects.requireNonNull(oi1);
                      if (PatchProxy.isSupport(i.class)) {
                         objArray = PatchProxy.applyTwoRefs(Integer.valueOf(i), p1, oi1, i.class, "6");
                         if (objArray != patchProxyRe) {
                            objArray.booleanValue();
                         }
                      }
                      oi1.b.e(i, p1);
                   }
                }
             }
          }
       }
       return;
    }
    public d p(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d.b();
    }
    public int q(int p0){
       return p0;
    }
    public void r(LiveStreamFeed p0){
       String str = "9";
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, str)) {
          return;
       }
       a$a uoa = this.a.j();
       Objects.requireNonNull(uoa);
       Object obj = PatchProxy.applyOneRefs(p0, uoa, b$a.class, "10");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else {
          i oi = uoa.a.e().p();
          Objects.requireNonNull(oi);
          Object obj1 = PatchProxy.applyOneRefs(p0, oi, i.class, str);
          if (obj1 != PatchProxyResult.class) {
             obj1.booleanValue();
          }else {
             oi.b.s(p0);
          }
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, i.class, "25")) {
          return;
       }
       this.a.h().e(false);
       return;
    }
    public Fragment t(){
       a obj = PatchProxy.apply(null, this, i.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.h().b();
       if (obj instanceof o) {
          return obj.a();
       }
       return null;
    }
    public void u(int p0,boolean p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, oi, "17")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       b$b uob1 = b$b.class;
       if (!PatchProxy.isSupport(uob1) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), uob, uob1, "10") && uob.c())) {
          uob.a.e().q().J(uob.a.e().o().U(p0), p1);
       }
       return;
    }
    public void v(List p0,LiveStreamFeed p1,String p2){
       c.a(this, p0, p1, p2);
    }
    public void w(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "12")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       b$b uob1 = b$b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, uob1, "8")) {
          uob.a.e().q().setEnabled(p0);
       }
       return;
    }
    public long x(){
       return this.d;
    }
    public int y(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.j().c(p0);
    }
    public void z(Activity p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "24")) {
          return;
       }
       b$b uob = this.a.h();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p1, uob, b$b.class, "15")) {
          uob.a.e().q().b0(p1);
       }
       return;
    }
}
