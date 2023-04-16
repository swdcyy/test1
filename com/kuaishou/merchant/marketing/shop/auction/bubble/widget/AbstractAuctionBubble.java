package com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble;
import ml8.d;
import f14.g;
import android.content.Context;
import com.kuaishou.merchant.marketing.shop.auction.bubble.widget.AbstractAuctionBubble$AuctionSuspendStatus;
import ot3.o0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ot3.o0$a;
import java.lang.Boolean;
import com.kuaishou.merchant.basic.util.o;
import java.lang.Long;
import java.lang.CharSequence;
import com.lsjwzh.widget.text.FastTextView;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.marketing.shop.MerchantMarketingShopLogBiz;
import p74.a;
import o74.a;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.merchant.api.core.model.Commodity;
import crd.b;
import lnc.b9;
import com.yxcorp.utility.f;
import brd.t;
import z84.a;
import erd.g;
import android.view.View$OnClickListener;
import ekd.m1;
import android.text.TextPaint;
import android.graphics.Typeface;
import ot3.p0;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import z84.b;

public abstract class AbstractAuctionBubble extends g implements d	// class@001b84
{
    public List A;
    public TextView B;
    public long C;
    public long D;
    public String E;
    public String F;
    public b G;
    public boolean H;
    public AbstractAuctionBubble$AuctionSuspendStatus I;
    public boolean J;
    public Runnable K;
    public Activity L;
    public FastTextView p;
    public View q;
    public TextView r;
    public TextView s;
    public TextView t;
    public KwaiImageView u;
    public SelectShapeLinearLayout v;
    public int w;
    public int x;
    public int y;
    public int z;

    public void AbstractAuctionBubble(Context p0){
       int i;
       super(p0);
       this.C = 0;
       this.H = false;
       this.I = AbstractAuctionBubble$AuctionSuspendStatus.RESUME;
       o0 oo0 = o0.class;
       if (PatchProxy.isSupport(oo0)) {
          oo0 = PatchProxy.applyTwoRefs("auctionBubblePendant", Integer.valueOf(0x2b16), null, oo0, "6");
          if (oo0 != PatchProxyResult.class) {
             i = oo0.intValue();
          label_0038 :
             this.z(i);
             return;
          }
       }
       i = o0.a.a("auctionBubblePendant", 0x2b16);
       goto label_0038 ;
    }
    public abstract void D();
    public abstract void E();
    public int F(){
       Object obj = PatchProxy.apply(null, this, AbstractAuctionBubble.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.I()) {
          return 1;
       }
       if (this.J != null) {
          return 2;
       }
       return 1;
    }
    public int G(){
       return this.w;
    }
    public AbstractAuctionBubble$AuctionSuspendStatus H(){
       return this.I;
    }
    public boolean I(){
       Object obj = PatchProxy.apply(null, this, AbstractAuctionBubble.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = this.C - o.d();
       AbstractAuctionBubble tx = this.x;
       if (tx <= null) {
          tx = 10;
       }
       boolean b = (l - (long)(tx * 1000) <= 0)? true: false;
       return b;
    }
    public abstract void J();
    public abstract void K();
    public void L(){
    }
    public abstract void M();
    public abstract void N();
    public void O(long p0){
       AbstractAuctionBubble uAbstractAuc = AbstractAuctionBubble.class;
       if (PatchProxy.isSupport(uAbstractAuc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAbstractAuc, "20")) {
          return;
       }
       if (this.w == 4) {
          return;
       }
       if (p0 - false <= 0) {
          this.p.setText("00:00:0");
          this.L();
          return;
       }else if(this.I()){
          this.e0(3);
       }else {
          this.Q();
       }
       String str = o.c("", null, 1, p0);
       if (!TextUtils.n(this.p.getText(), str)) {
          this.p.setText(str);
       }
       return;
    }
    public abstract View P(Context p0);
    public abstract void Q();
    public void R(){
       if (PatchProxy.applyVoid(null, this, AbstractAuctionBubble.class, "11")) {
          return;
       }
       this.A(-1);
       g th = this.h;
       if (th != null) {
          k1.m(th);
       }
       a.s(MerchantMarketingShopLogBiz.AUCTION, "AbstractAuctionBubble", "removeDismissRunnable");
       return;
    }
    public void S(long p0){
       AbstractAuctionBubble uAbstractAuc = AbstractAuctionBubble.class;
       if (PatchProxy.isSupport(uAbstractAuc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAbstractAuc, "14")) {
          return;
       }
       this.X(p0);
       this.f0(AbstractAuctionBubble$AuctionSuspendStatus.RESUME);
       this.D();
       a.s(MerchantMarketingShopLogBiz.AUCTION, "AbstractAuctionBubble", "auction resumeCountDown endRemainTime:"+(p0 - o.d()));
       return;
    }
    public abstract void T(CharSequence p0,String p1);
    public abstract void U(List p0);
    public void V(boolean p0){
    }
    public abstract void W(Commodity p0);
    public void X(long p0){
       long l1;
       AbstractAuctionBubble uAbstractAuc = AbstractAuctionBubble.class;
       if (PatchProxy.isSupport(uAbstractAuc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAbstractAuc, "9")) {
          return;
       }
       long l = 0;
       if (!PatchProxy.isSupport(uAbstractAuc) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAbstractAuc, "10")) {
          if (PatchProxy.isSupport(uAbstractAuc)) {
             Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uAbstractAuc, "12");
             if (obj != PatchProxyResult.class) {
                l1 = obj.longValue();
             }else {
             label_0045 :
                l1 = p0 - o.d();
                MerchantMarketingShopLogBiz merchantMark = 0x2710;
                l1 = (l1 - l <= 0)? merchantMark: l1 + merchantMark;
             }
          }else {
             goto label_0045 ;
          }
          this.A(l1);
          a.s(MerchantMarketingShopLogBiz.AUCTION, "AbstractAuctionBubble", "setBubbleShowMillis:"+l1);
       }
       uAbstractAuc = this.C;
       if (!uAbstractAuc - p0) {
          this.D = uAbstractAuc;
          return;
       }else if(!uAbstractAuc - l){
          this.C = p0;
          this.D = p0;
       }
       this.D = this.C;
       this.C = p0;
       b9.a(this.G);
       this.G = f.d().b((this.C - o.d()), 100).subscribe(new a(this));
       return;
    }
    public void Y(List p0){
       this.A = p0;
    }
    public abstract void Z(View$OnClickListener p0);
    public void a0(int p0){
       this.y = p0;
    }
    public void b0(int p0){
       this.z = p0;
    }
    public View c(Context p0){
       FastTextView obj = PatchProxy.applyOneRefs(p0, this, AbstractAuctionBubble.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = this.P(p0);
       obj = m1.f(view, R.id.auction_count_down_tv);
       this.p = obj;
       obj.getPaint().setTypeface(p0.l());
       this.B = m1.f(view, 0x7f0a0289);
       View view1 = m1.f(view, R.id.anchor_auction_deal_container);
       this.q = view1;
       this.r = m1.f(view1, 0x7f0a068c);
       this.s = m1.f(this.q, 0x7f0a0689);
       TextView textView = m1.f(this.q, R.id.celebrate_price);
       this.t = textView;
       textView.setTypeface(p0.l());
       m1.f(this.q, R.id.celebrate_price_tag).setTypeface(p0.l());
       this.u = m1.f(this.q, 0x7f0a029d);
       this.v = m1.f(this.q, 0x7f0a02a4);
       this.doBindView(view);
       return view;
    }
    public void c0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractAuctionBubble.class, "15")) {
          return;
       }
       AbstractAuctionBubble tB = this.B;
       if (tB != null) {
          tB.setText(p0);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, AbstractAuctionBubble.class, "4")) {
          return;
       }
       this.H = true;
       super.d();
       return;
    }
    public abstract void d0(String p0);
    public void e0(int p0){
       AbstractAuctionBubble uAbstractAuc = AbstractAuctionBubble.class;
       if (PatchProxy.isSupport(uAbstractAuc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAbstractAuc, "6")) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 == 4) {
                   this.M();
                   if (!PatchProxy.applyVoid(null, this, uAbstractAuc, "7")) {
                      k1.m(this.K);
                      b uob = new b(this);
                      this.K = uob;
                      k1.r(uob, 0x3a98);
                      a.s(MerchantMarketingShopLogBiz.AUCTION, "AbstractAuctionBubble", "addAuctionDealBubbleDismissRunnable:delayTime15000");
                   }
                }
             }else {
                this.K();
             }
          }else {
             this.J();
          }
       }else {
          this.N();
       }
       this.w = p0;
       return;
    }
    public synchronized void f0(AbstractAuctionBubble$AuctionSuspendStatus p0){
       this.I = p0;
    }
    public void g0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractAuctionBubble.class, "16")) {
          return;
       }
       this.r.setText(p0);
       return;
    }
    public void h0(long p0){
       AbstractAuctionBubble uAbstractAuc = AbstractAuctionBubble.class;
       if (PatchProxy.isSupport(uAbstractAuc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uAbstractAuc, "13")) {
          return;
       }
       this.C = p0;
       this.R();
       b9.a(this.G);
       this.O((p0 - o.d()));
       this.f0(AbstractAuctionBubble$AuctionSuspendStatus.SUSPEND);
       this.E();
       a.s(MerchantMarketingShopLogBiz.AUCTION, "AbstractAuctionBubble", "auction suspendCountDown endRemainTime:"+(p0 - o.d()));
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, AbstractAuctionBubble.class, "5")) {
          return;
       }
       if (this.H != null) {
          super.r();
          k1.m(this.K);
       }
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, AbstractAuctionBubble.class, "3")) {
          return;
       }
       super.v();
       b9.a(this.G);
       return;
    }
}
