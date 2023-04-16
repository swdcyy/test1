package c44.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c44.a$a;
import nsd.u;
import c44.a$d;
import c44.a$c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.cart.onsale.audience.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.CommodityListGuestResponse;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c44.a$e;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.live.cart.onsale.audience.pendant.ginseng.GinsengPendantData;
import c44.d;
import android.view.View;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$r;
import qrd.l1;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Boolean;
import o34.b;
import kotlin.Pair;
import qrd.r0;
import java.util.Map;
import trd.t0;
import o34.f$a;
import o34.f$b;
import o34.f;
import c44.a$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import java.lang.Number;
import java.util.List;
import qvb.i;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.merchant.live.cart.onsale.audience.model.GoodsGroupTitleInfo;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.live.cart.onsale.audience.c;

public final class a extends PresenterV2	// class@0004aa
{
    public final RecyclerView$r A;
    public AppBarLayout B;
    public int C;
    public AppBarLayout$c D;
    public View p;
    public KwaiImageView q;
    public TextView r;
    public RecyclerView s;
    public c t;
    public i u;
    public a v;
    public LiveMerchantBaseContext w;
    public String x;
    public o y;
    public boolean z;
    public static final a$a E;

    static {
       a.E = new a$a(null);
    }
    public void a(){
       super();
       this.x = "ginseng";
       this.A = new a$d(this);
       this.D = new a$c(this);
    }
    public static final RecyclerView P8(a p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mListView");
       }
       return p0;
    }
    public void E8(){
       l1 a;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       a tv = this.v;
       String str = "mShopParam";
       if (tv == null) {
          a.S(str);
       }
       tv = tv.g;
       CommodityListGuestResponse mAnchorId = (tv != null)? tv.mAnchorId: objArray;
       a tv1 = this.v;
       if (tv1 == null) {
          a.S(str);
       }
       tv1 = tv1.g;
       CommodityListGuestResponse mItemListAre = (tv1 != null)? tv1.mItemListArea: objArray;
       this.z = q.f(mItemListAre) ^ 0x01;
       if (!TextUtils.x(mAnchorId)) {
          k1.s(new a$e(this, mAnchorId), this, 500);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          ComponentInfo uComponentIn = PatchProxy.apply(objArray, this, uoa, "8");
          if (uComponentIn != PatchProxyResult.class) {
          }else {
             uoa = this.v;
             if (uoa == null) {
                a.S(str);
             }
             uoa = uoa.g;
             CommodityListGuestResponse mPendantArea = (uoa != null)? uoa.mPendantArea: objArray;
             if (mPendantArea != null) {
                Iterator iterator = mPendantArea.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ComponentInfo uComponentIn1 = iterator.next();
                      if (TextUtils.n(uComponentIn1.getName(), "live_cart_float_pendant")) {
                         uComponentIn = uComponentIn1;
                      }
                   }
                }
             }
             uComponentIn = objArray;
          }
          if (uComponentIn != null) {
             tv = this.p;
             if (tv != null) {
                Object data = uComponentIn.getData();
                if (data instanceof GinsengPendantData) {
                   objArray = data;
                }
                if (objArray != null) {
                   this.x = objArray.getAnchorId();
                   k1.s(new d(objArray, tv, uComponentIn, this), this, Math.max(objArray.getDelayMs(), 500));
                }
                uoa = this.s;
                if (uoa == null) {
                   a.S("mListView");
                }
                uoa.addOnScrollListener(this.A);
                objArray = l1.a;
             }
             if (objArray == null) {
             label_00c8 :
                uoa = this.p;
                if (uoa != null) {
                   uoa.setVisibility(8);
                }
                a = l1.a;
             }
          }else {
             goto label_00c8 ;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       k1.n(this);
       a ts = this.s;
       if (ts == null) {
          a.S("mListView");
       }
       ts.removeOnScrollListener(this.A);
       ts = this.B;
       if (ts != null) {
          ts.o(this.D);
       }
       return;
    }
    public final boolean R8(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.x(p0)) {
          return b;
       }
       int i = this.S8(p0);
       if (i <= 0) {
          return b;
       }
       f$b uob = null;
       if (this.z != null) {
          obj = this.v;
          if (obj == null) {
             a.S("mShopParam");
          }
          obj = obj.m;
          if (obj != null) {
             Pair[] pairArray = new Pair[]{r0.a("id", p0),r0.a("snapTop", Boolean.TRUE)};
             a.m(p0);
             obj.b(new b(t0.j0(pairArray)), uob);
          }
       }else {
          a tB = this.B;
          if (tB != null) {
             tB.p(b, 1);
          }
          a$b uob1 = new a$b(this, i);
          if (i > 15) {
             a ts = this.s;
             if (ts == null) {
                a.S("mListView");
             }
             RecyclerView$LayoutManager layoutManage = ts.getLayoutManager();
             if (layoutManage instanceof LinearLayoutManager) {
                uob = layoutManage;
             }
             if (uob != null) {
                uob.scrollToPositionWithOffset((i - 5), b);
             }
             obj = this.s;
             if (obj == null) {
                a.S("mListView");
             }
             obj.post(uob1);
          }else {
             uob1.run();
          }
       }
       return 1;
    }
    public final int S8(String p0){
       Iterator iterator;
       Object obj1;
       int i1;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mPageList");
       }
       List items = obj.getItems();
       if (items != null) {
          int i = 0;
          if (this.z != null) {
             iterator = items.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (obj1 instanceof ComponentInfo && TextUtils.n(obj1.getId(), p0)) {
                   return i;
                }
                i = i1;
             }
          }else {
             iterator = items.iterator();
             while (iterator.hasNext()) {
                obj1 = iterator.next();
                i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                if (obj1 instanceof GoodsGroupTitleInfo && TextUtils.n(obj1.mAnchorId, p0)) {
                   return i;
                }
                i = i1;
             }
          }
       }
       return -1;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2fc9);
       this.q = m1.f(p0, 0x7f0a1318);
       this.r = m1.f(p0, 0x7f0a0945);
       return;
    }
    public void j8(){
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       this.w = this.r8("LIVE_BASE_CONTEXT");
       this.u = this.r8("PAGE_LIST");
       this.v = this.q8(a.class);
       this.s = this.q8(RecyclerView.class);
       this.t = this.r8("ADAPTER");
       a ts = this.s;
       if (ts == null) {
          a.S("mListView");
       }
       View rootView = ts.getRootView();
       rootView = (rootView != null)? rootView.findViewById(R.id.live_shop_container): objArray;
       if (rootView instanceof AppBarLayout) {
          objArray = rootView;
       }
       this.B = objArray;
       return;
    }
}
