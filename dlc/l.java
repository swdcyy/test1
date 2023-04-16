package dlc.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import android.os.Looper;
import dlc.k;
import dlc.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import dlc.i;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import dlc.j;
import im8.f;
import com.yxcorp.gifshow.entity.TrendingInfo;
import tkc.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qvb.n0;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.TrendingTitleInfo;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout$a;
import com.kwai.component.photo.detail.slide.widget.SlidePlayTrendingBottomLayout;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.kwai.component.photo.detail.slide.widget.TrendingTextSwitcher;
import alc.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.view.View;
import ekd.m1;
import brd.y;
import tkc.f;

public class l extends PresenterV2	// class@002258
{
    public List A;
    public int B;
    public Handler C;
    public Runnable D;
    public boolean E;
    public e0 F;
    public final q G;
    public KwaiImageView p;
    public TrendingTextSwitcher q;
    public SlidePlayTrendingBottomLayout r;
    public i s;
    public t t;
    public y u;
    public f v;
    public f w;
    public f x;
    public f y;
    public t z;

    public void l(){
       super();
       this.C = new Handler(Looper.getMainLooper());
       this.D = new k(this);
       this.E = false;
       this.G = new l$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.s.h(this.G);
       g e = Functions.e;
       this.X7(this.t.subscribe(new i(this), e));
       this.X7(this.z.subscribe(new j(this), e));
       if (this.s.isEmpty()) {
          TrendingInfo trendingInfo = this.v.get();
          String str = this.s.k2();
          if (trendingInfo == null) {
             return;
          }
          if (TextUtils.x(trendingInfo.mTrendingType)) {
             trendingInfo.mTrendingType = str;
          }
          this.S8(trendingInfo);
          this.x.set(trendingInfo);
          this.W8(trendingInfo.mDesc);
          this.s.a();
          return;
       }else {
          this.R8();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       this.s.f(this.G);
       this.C.removeCallbacks(this.D);
       this.E = false;
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       this.r.getAdapter().n(this.s.h2());
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       if (this.s.isEmpty()) {
          return;
       }
       List items = this.s.getItems();
       this.A = items;
       this.q.setTexts(items);
       this.V8();
       if (q.f(this.A) && !q.f(this.A)) {
          this.C.removeCallbacks(this.D);
          this.C.postDelayed(this.D, 5000);
       }
       return;
    }
    public final void S8(TrendingInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "9")) {
          return;
       }
       if (this.E == null && p0 != null) {
          this.E = true;
          l tF = this.F;
          if (!PatchProxy.applyVoidTwoRefs(p0, tF, null, a.class, "6") && p0 != null) {
             u1.D0(null, tF, 6, a.b(p0), null, null);
          }
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, l.class, "11")) {
          return;
       }
       l tq = this.q;
       if (tq == null) {
          return;
       }
       TrendingInfo curTrendingI = tq.getCurTrendingInfo();
       if (curTrendingI == null) {
          return;
       }
       l tx = this.x;
       if (tx != null) {
          tx.set(curTrendingI);
       }
       this.W8(curTrendingI.mDesc);
       return;
    }
    public final void W8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "10")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.y.set(p0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a4074);
       this.r = m1.f(p0, 0x7f0a4067);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.s = this.r8("TRENDING_LIST_PAGE_LIST");
       this.t = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVABLE");
       this.u = this.r8("PLAY_HOT_TRENDING_INFO_CHANGE_OBSERVER");
       this.v = this.x8("CURRENT_PLAY_HOT_TRENDING_INFO");
       this.w = this.r8("TRENDING_FEED_PAGE_LIST");
       this.x = this.x8("MORE_TRENDING_BAR_SHOWING_INFO");
       this.y = this.x8("CURRENT_BOTTOM_BAR_SHOWING_TRENDING_DESC");
       this.z = this.r8("TRENDING_INFO_ITEM_CLICK_OBSERVABLE");
       this.F = this.q8(e0.class);
       return;
    }
}
