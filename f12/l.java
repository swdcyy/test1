package f12.l;
import f12.d;
import java.lang.Object;
import java.util.ArrayList;
import f12.l$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.ref.WeakReference;
import id5.u;
import uw9.v3;
import jf5.a;
import e12.a;
import qvb.q;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import h3.a;
import uw6.a;
import java.lang.Integer;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import java.lang.StringBuilder;
import lw6.a;
import fx6.b;
import ex6.d;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import yw6.h;
import java.util.List;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$b;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import android.app.Activity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayActivity;
import androidx.viewpager.widget.ViewPager$i;
import cw6.b;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import f12.k;
import ok.o;
import f12.l$b;
import ok.h;
import com.google.common.collect.ImmutableList;
import kp3.e;
import va1.i0;
import f12.j;
import ge5.d;
import yw6.g;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import java.util.Iterator;

public class l implements d	// class@00283e
{
    public SlidePlayViewModel a;
    public WeakReference b;
    public final List c;
    public final ViewPager$i d;

    public void l(){
       super();
       this.c = new ArrayList();
       this.d = new l$a(this);
    }
    public boolean A(){
       Object obj = PatchProxy.apply(null, this, l.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.get() == null) {
          return false;
       }
       if (this.b.get() != null && (this.b.get() instanceof u && this.b.get().J1() instanceof a)) {
          return this.b.get().J1().U;
       }
       return false;
    }
    public void B(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "41")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.b(p0);
       }
       return;
    }
    public boolean C(DetailSlidePlayFragment p0){
       LivePlayFragment obj = PatchProxy.applyOneRefs(p0, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.a == null) {
          return b;
       }
       if (!p0 instanceof LivePlayFragment) {
          return b;
       }
       obj = p0;
       if (obj.Bh() == -1) {
          if (this.a.t() != p0) {
             b = false;
          }
          return b;
       }else if(this.E()){
          if (obj.Bh() != this.a.a0()) {
             b = false;
          }
          return b;
       }else if(obj.Bh() == this.a.j()){
          b = false;
       }
       return b;
    }
    public void D(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "37")) {
          return;
       }
       ol = this.a;
       if (ol != null) {
          ol.u(p0);
       }
       return;
    }
    public boolean E(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public boolean F(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, l.class, "38");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, SlidePlayViewModel.class, "182");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(obj.C0() instanceof a){
             b = obj.C0().U;
          }
       }
       return b;
    }
    public void G(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "36")) {
          return;
       }
       ol = this.a;
       if (ol != null) {
          ol.Y(p0);
       }
       return;
    }
    public Object H(){
       Object obj = PatchProxy.apply(null, this, l.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Object();
    }
    public void I(int p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ol, "16")) {
          return;
       }
       ol = this.a;
       if (ol != null && p0 >= 0) {
          ol.s2().I(this.q(p0), p1);
       }
       return;
    }
    public int J(DetailSlidePlayFragment p0,LiveStreamFeed p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.E()) {
          return p0.mh();
       }
       l ta = this.a;
       if (ta != null) {
          return ta.q(ta.M(new QPhoto(p1)));
       }
       return 0;
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, l.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b.get() instanceof LivePlayActivity) {
          return this.b.get().B;
       }
       return false;
    }
    public void L(SlidePlayConfig p0,String p1,int p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, l.class, "14")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.y1(p0, p1, p2);
       }
       return;
    }
    public void M(LiveStreamFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (this.E()) {
          this.a.o(new QPhoto(p0), true, "LiveSlideContainerLegacy");
       }else {
          l ta = this.a;
          QPhoto qPhoto = new QPhoto(p0);
          String str = "LiveSlideContainerLegacy";
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(SlidePlayViewModel.class) || !PatchProxy.applyVoidThreeRefs(qPhoto, Integer.valueOf(0), str, ta, SlidePlayViewModel.class, "113")) {
             a.b("SlidePlayViewModel", "updateCurrentFeed, photo = "+qPhoto.toString()+" sourceType = "+0+" reason = "+str);
             b uob = ta.Q0("kwai_data_source_service");
             if (uob != null) {
                b uob1 = b.class;
                if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(qPhoto, Integer.valueOf(0), uob, uob1, "46")) {
                   uob1 = uob.e;
                   if (uob1 != null) {
                      uob1.c();
                   }
                   uob.b.setDisableShowNoMoreTipsAtTop(0);
                   uob1 = uob.a;
                   Objects.requireNonNull(uob1);
                   h oh = h.class;
                   if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(qPhoto, Integer.valueOf(0), uob1, oh, "7")) {
                      StringBuilder str1 = "updateCurrentFeed... sourceType = "+0+" currentPhoto = ";
                      h j = uob1.j;
                      String str2 = (j == null)? "null": j.toString();
                      a.b("DataSourceManager", str1+str2+" updatePhoto = "+qPhoto.toString());
                      uob1.j = qPhoto;
                      uob1.g = 0;
                   }
                   uob = uob.e;
                   if (uob != null) {
                      uob.b();
                   }
                }
             }
          }
       }
       return;
    }
    public LiveStreamFeed N(){
       BaseFeed obj = PatchProxy.apply(null, this, l.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          return null;
       }
       int i = this.q(this.getCurrentPosition());
       List list = this.a();
       if (i < list.size() && i >= 0) {
          obj = list.get(i);
          if (obj instanceof LiveStreamFeed) {
             return obj;
          }
       }
       return null;
    }
    public void O(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "40")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.e(p0);
       }
       return;
    }
    public int P(LiveStreamFeed p0){
       l obj = PatchProxy.applyOneRefs(p0, this, l.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == null) {
          return -1;
       }
       return obj.q(obj.M(new QPhoto(p0)));
    }
    public LiveSlidePlayEnterParam Q(LiveSlidePlayEnterParam$b p0,LiveBizParam p1,Activity p2,LiveStreamFeedWrapper p3){
       p1 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, l.class, "35");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (this.E()) {
          return p0.i(this.getDataList()).a();
       }
       return null;
    }
    public View R(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       ol = this.b;
       if (ol != null && ol.get() != null) {
          if (p0 == 5) {
             return this.b.get().findViewById(0x7f0a25ba);
          }else if(p0 == 2){
             return this.b.get().findViewById(0x7f0a303c);
          }
       }
       return null;
    }
    public void S(Activity p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "26")) {
          return;
       }
       if (!p0 instanceof SlidePlayActivity) {
          return;
       }
       p0.addSlidePlayIgnoreView(p1);
       return;
    }
    public final List a(){
       List list;
       ArrayList obj = PatchProxy.apply(null, this, l.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          return new ArrayList();
       }
       obj = new ArrayList();
       if (this.E()) {
          list = this.a.I0();
       }
       return list;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          ta.g(this.d);
       }
       return;
    }
    public int c(){
       l obj = PatchProxy.apply(null, this, l.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? obj.c(): 0;
       return i;
    }
    public void d(boolean p0,int p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, ol, "11")) {
          return;
       }
       ol = this.a;
       if (ol == null) {
          return;
       }
       ol.d(p0, p1);
       return;
    }
    public int f(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, l.class, "24");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == null) {
          return 0;
       }
       a uoa = obj.C0();
       if (!uoa instanceof a) {
          return this.a.Q();
       }
       Objects.requireNonNull(uoa);
       Object obj1 = PatchProxy.apply(objArray, uoa, a.class, "6");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): uoa.k0() - uoa.Q0();
       return i;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "19")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public int getCurrentPosition(){
       l obj = PatchProxy.apply(null, this, l.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == null) {
          return -1;
       }
       return obj.j();
    }
    public List getDataList(){
       List obj = PatchProxy.apply(null, this, l.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          return new ArrayList();
       }
       obj = this.a();
       if (!q.f(obj)) {
          return m.s(obj).p(k.b).F(new l$b(this)).B();
       }
       return new ArrayList();
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "18")) {
          return;
       }
       this.c.add(p0);
       return;
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, l.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.f())? true: false;
       return b;
    }
    public e l(){
       l obj = PatchProxy.apply(null, this, l.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null || obj.get() == null) {
          return null;
       }
       return i0.c(this.b.get());
    }
    public void m(int p0,List p1,String p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, l.class, "42")) {
          return;
       }
       l ta = this.a;
       if (ta != null) {
          if (ta.a0() >= (this.a.Q() - 1)) {
             p0 = -1;
          }
          this.a.m(p0, m.s(p1).F(j.b).B(), p2);
       }
       return;
    }
    public d p(){
       l obj = PatchProxy.apply(null, this, l.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj != null && (obj.get() != null && this.b.get() instanceof u)) {
          return this.b.get().p();
       }
       return null;
    }
    public int q(int p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ol, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ol = this.a;
       if (ol == null) {
          return -1;
       }else {
          return ol.q(p0);
       }
    }
    public void r(LiveStreamFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (this.E()) {
          b uob = this.a.Q0("kwai_data_source_service");
          if (uob != null) {
             uob.l(new QPhoto(p0), true, uob.a());
          }
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, l.class, "34")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       if (this.E()) {
          this.a.d1(GrootViewPager.class).setEnablePullToRefresh(false);
       }
       return;
    }
    public Fragment t(){
       l obj = PatchProxy.apply(null, this, l.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          return obj.t();
       }
       obj = this.b;
       if (obj != null && obj.get() instanceof LivePlayActivity) {
          return this.b.get().v3();
       }
       return null;
    }
    public void u(int p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, ol, "17")) {
          return;
       }
       ol = this.a;
       if (ol != null && p0 >= 0) {
          ol.s2().J(p0, p1);
       }
       return;
    }
    public void v(List p0,LiveStreamFeed p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l.class, "7")) {
          return;
       }
       if (this.a != null && !q.f(p0)) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new QPhoto(iterator.next()));
          }
          if (p1 == null) {
             this.a.J(uArrayList, null, p2);
          }else {
             this.a.J(uArrayList, new QPhoto(p1), p2);
          }
       }
       return;
    }
    public void w(boolean p0){
       l ol = l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "10")) {
          return;
       }
       ol = this.a;
       if (ol == null) {
          return;
       }
       ol.s(p0);
       return;
    }
    public long x(){
       Object obj = PatchProxy.apply(null, this, l.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.b.get() instanceof LivePlayActivity) {
          return this.b.get().C;
       }
       return 0;
    }
    public int y(LiveStreamFeed p0){
       l obj = PatchProxy.applyOneRefs(p0, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       if (obj == null) {
          return -1;
       }
       return obj.M(new QPhoto(p0));
    }
    public void z(Activity p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, l.class, "27")) {
          return;
       }
       if (!p0 instanceof SlidePlayActivity) {
          return;
       }
       p0.removeSlidePlayIgnoreView(p1);
       return;
    }
}
