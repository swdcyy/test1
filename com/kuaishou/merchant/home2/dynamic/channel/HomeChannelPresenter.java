package com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$b;
import nsd.u;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$callback$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$livePlayCallback$2;
import java.util.HashMap;
import java.util.ArrayList;
import android.graphics.Rect;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$recentPageSelected$1;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$onScrollListener$2;
import com.kuaishou.merchant.home2.dynamic.channel.HomeChannelPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lx3.n;
import lx3.k;
import ekd.k1;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout$c;
import com.kuaishou.pagedy.container.widget.DynamicTabLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import usd.q;
import androidx.recyclerview.widget.RecyclerView$r;
import do4.n;
import android.view.View;
import mkc.b;
import mkc.c;
import android.widget.LinearLayout;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import xw3.c;
import com.kwai.sdk.switchconfig.a;
import b04.d;

public final class HomeChannelPresenter extends PresenterV2	// class@00173e
{
    public boolean A;
    public final p B;
    public final DynamicTabLayout$c C;
    public k p;
    public final p q;
    public final p r;
    public int s;
    public final HashMap t;
    public final ArrayList u;
    public DynamicTabLayout v;
    public final Rect w;
    public final List x;
    public final HomeChannelPresenter$recentPageSelected$1 y;
    public d z;
    public static final HomeChannelPresenter$b D;

    static {
       HomeChannelPresenter.D = new HomeChannelPresenter$b(null);
    }
    public void HomeChannelPresenter(){
       super();
       this.q = s.c(new HomeChannelPresenter$callback$2(this));
       this.r = s.c(new HomeChannelPresenter$livePlayCallback$2(this));
       this.s = Integer.MAX_VALUE;
       this.t = new HashMap();
       this.u = new ArrayList();
       this.w = new Rect();
       this.x = new ArrayList();
       this.y = new HomeChannelPresenter$recentPageSelected$1(this, 8, 0x3f400000, true);
       this.B = s.c(new HomeChannelPresenter$onScrollListener$2(this));
       this.C = new HomeChannelPresenter$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeChannelPresenter.class, "5")) {
          return;
       }
       HomeChannelPresenter tp = this.p;
       String str = "multiTabService";
       if (tp == null) {
          a.S(str);
       }
       tp.c(this.R8());
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       tp.c(this.S8());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeChannelPresenter.class, "6")) {
          return;
       }
       HomeChannelPresenter tp = this.p;
       String str = "multiTabService";
       if (tp == null) {
          a.S(str);
       }
       tp.d(this.R8());
       tp = this.p;
       if (tp == null) {
          a.S(str);
       }
       tp.d(this.S8());
       k1.n("HomeChannelPresenter");
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          DynamicTabLayout$c uoc = iterator.next();
          HomeChannelPresenter tv = this.v;
          if (tv == null || PatchProxy.applyVoidOneRefs(uoc, tv, DynamicTabLayout.class, "4")) {
             continue ;
          }
          tv.c.remove(uoc);
       }
       this.x.clear();
       return;
    }
    public final int[] P8(RecyclerView p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, HomeChannelPresenter.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       int[] ointArray = null;
       if (!layoutManage instanceof StaggeredGridLayoutManager) {
          layoutManage = ointArray;
       }
       obj = (layoutManage != null)? layoutManage.findFirstVisibleItemPositions(ointArray): ointArray;
       if (layoutManage != null) {
          ointArray = layoutManage.findLastVisibleItemPositions(ointArray);
       }
       int i = 0;
       if (obj != null) {
          int i1 = (!obj.length)? 1: 0;
          if (!i1 && ointArray != null) {
             i1 = (!ointArray.length)? 1: 0;
             if (!i1) {
                i1 = obj[i];
                int i2 = obj[(obj.length - 1)];
                int len = ointArray.length;
                for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                   int i4 = ointArray[i3];
                   i1 = Math.min(i1, i4);
                   i2 = q.n(i2, i4);
                }
                ointArray = new int[]{i1,i2};
                return ointArray;
             }
          }
       }
    label_005f :
       int[] ointArray1 = new int[i];
       return ointArray1;
    }
    public final n R8(){
       Object obj = PatchProxy.apply(null, this, HomeChannelPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final n S8(){
       Object obj = PatchProxy.apply(null, this, HomeChannelPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
    public final RecyclerView$r V8(){
       Object obj = PatchProxy.apply(null, this, HomeChannelPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final void W8(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeChannelPresenter.class, "17")) {
          return;
       }
       b[] uobArray = new b[]{b.d,b.i};
       c.d(p0.d(), uobArray);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, HomeChannelPresenter.class, "21")) {
          return;
       }
       HomeChannelPresenter tv = this.v;
       if (tv != null) {
          LinearLayout tabsContaine = tv.getTabsContainer();
          int i = 0;
          while (i < tabsContaine.getChildCount() && i < this.u.size()) {
             FeedChannelInfo uFeedChannel = this.u.get(i);
             if (tabsContaine.getChildAt(i).getLocalVisibleRect(this.w)) {
                Activity activity = this.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
                e.q0(activity).x0(uFeedChannel);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeChannelPresenter.class, "4")) {
          return;
       }
       this.p = this.r8("MERCHANT_HOME_MULTI_TAB_SERVICE");
       this.s = a.t().a("merchantHomeChannelOffScreenPageLimit", Integer.MAX_VALUE);
       this.z = d.J0(this.getActivity());
       return;
    }
}
