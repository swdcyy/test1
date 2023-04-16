package kj9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kj9.b$a;
import jj9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kj9.d;
import com.kwai.component.feedstaggercard.model.CardStyle;
import ij9.a;
import com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oj9.e;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import java.util.List;
import kj9.c;
import com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView$a;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.channel.stagger.widget.HotChannelBannerIndicator;
import kj9.a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Number;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.graphics.Rect;
import java.lang.Integer;
import hlb.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;
import ekd.m1;
import o56.a;
import java.lang.CharSequence;

public class b extends PresenterV2	// class@002ca5
{
    public e p;
    public List q;
    public t r;
    public View s;
    public CustomBannerView t;
    public HotChannelBannerIndicator u;
    public d v;
    public CardStyle w;
    public Rect x;
    public final RecyclerView$o y;

    public void b(){
       super();
       this.y = new b$a(this);
       this.U7(new b());
    }
    public void E8(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          if (this.v == null) {
             d uod = new d(this.w);
             this.v = uod;
             this.t.setBannerAdapter(uod);
          }
          ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
          layoutParams.height = this.P8();
          layoutParams.topMargin = (this.w.isCornerCard == null)? 0: a1.d(0x7f07031b);
          if (this.w.isCornerCard == null) {
             b obj = PatchProxy.apply(objArray, this, uob, "14");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(q.f(this.p.F) && (!q.f(this.p.G) || !q.f(this.p.E))){
                b = true;
             }else {
                b = false;
             }
             if (!b) {
             label_008f :
                layoutParams.bottomMargin = 0;
             label_0098 :
                this.s.setLayoutParams(layoutParams);
                this.s.setVisibility(0);
                this.s.requestLayout();
                obj = this.q;
                if (!PatchProxy.applyVoidOneRefs(obj, this, uob, "8") && !q.f(obj)) {
                   if (!PatchProxy.applyVoidOneRefs(obj, this, uob, "9")) {
                      b tt = this.t;
                      if (tt != null) {
                         tt.setVisibility(0);
                         this.t.setList(obj);
                         this.t.y();
                         this.t.setAutoScroll(3000);
                         this.t.setOnBannerStateListener(new c(this));
                         if (!this.R8()) {
                            this.t.y();
                            this.t.addOnChildAttachStateChangeListener(this.y);
                         }else {
                            this.S8(0);
                         }
                      }
                   }
                   if (!PatchProxy.applyVoidOneRefs(obj, this, uob, "10") && this.u != null) {
                      if (obj.size() > 1) {
                         this.u.setVisibility(0);
                         this.u.setItemCount(obj.size());
                      }else {
                         this.u.setVisibility(8);
                      }
                   }
                }
             }
          }
          if (CardStyle.isV4Bottom(this.w.mBottomType)) {
             goto label_008f ;
          }else {
             layoutParams.bottomMargin = a1.d(0x7f07031b);
             goto label_0098 ;
          }
       }
    label_0127 :
       this.X7(this.r.subscribe(new a(this), Functions.e));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tt = this.t;
       if (tt != null) {
          tt.removeOnChildAttachStateChangeListener(this.y);
          tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(null, tt, CustomBannerView.class, "8")) {
             CustomBannerView c = tt.c;
             if (c != null) {
                c.cancel(false);
                tt.c = null;
             }
             c = tt.b;
             if (c != null) {
                c.shutdown();
                tt.b = null;
             }
          }
       }
       return;
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = n.k(this.getActivity());
       int i1 = (this.w.isCornerCard != null)? a1.d(0x7f07031b) * 2: 0;
       return (int)((float)(i - i1) * 0.37f);
    }
    public final boolean R8(){
       boolean b;
       Rect obj = PatchProxy.apply(null, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (this.t == null) {
          return b;
       }
       if (this.x == null) {
          this.x = new Rect(b, b, n.k(this.getActivity()), n.j(this.getActivity()));
       }
       obj = new Rect();
       this.t.getGlobalVisibleRect(obj);
       return obj.intersect(this.x);
    }
    public void S8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "13")) {
          return;
       }
       uob = this.q;
       if (uob == null || (p0 >= 0 && uob.size() > p0)) {
          a uoa = this.q.get(p0);
          if (!this.R8()) {
             return;
          }else if(uoa.a != null){
             return;
          }else {
             uoa.a = true;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CHANNEL_OPERATION_BANNER";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("banner_id", uoa.mId);
             jsonObject.a0("banner_index", Integer.valueOf((p0 + true)));
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.ksOrderInfoPackage = l0.a(uoa.mKsOrderId);
             u1.u0(3, uElementPack, uContentPack);
          }
       }
       return;
    }
    public void V8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "11")) {
          return;
       }
       uob = this.u;
       if (uob != null && (uob.getVisibility() || (p0 >= 0 && p0 < this.u.getChildCount()))) {
          this.u.setPageIndex(p0);
       }
    label_0030 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a03b8);
       if (a.d()) {
          b ts = this.s;
          if (ts != null) {
             ts.setContentDescription("banner");
          }
       }
       this.t = m1.f(p0, 0x7f0a03d2);
       this.u = m1.f(p0, 0x7f0a2f67);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("HOT_CHANNEL_COLUMN_PAGE_LIST");
       this.q = this.r8("HOT_CHANNEL_BANNERS");
       this.w = this.r8("HOT_CHANNEL_CARD_STYLE");
       this.r = this.r8("HOT_CHANNEL_COLUMN_WIDTH_CHANGE_EVENT");
       return;
    }
}
