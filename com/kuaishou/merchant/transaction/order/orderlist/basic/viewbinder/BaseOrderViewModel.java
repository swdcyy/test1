package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel;
import sk0.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yk4.i;
import java.util.HashMap;
import java.util.HashSet;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel$1;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseOrderViewModel$2;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import com.kuaishou.ksmvvm.command.KSCommand;
import yk4.j;
import yk4.p;
import yk4.m;
import pk0.a;
import com.kuaishou.ksmvvm.command.b;
import com.kuaishou.ksmvvm.command.a;
import yk4.l;
import yk4.q;
import yk4.k;
import yk4.o;
import yk4.n;
import yk4.r;
import pk0.b;
import com.kuaishou.merchant.transaction.base.detail.guesslike.GuessLikePhotoListHolder;
import zc4.a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.OrderListGuessLikeBackwardCardFrequencyControlModel;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.model.BaseOrderUIModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.o5;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantGuessLikeResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import xk4.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import ed4.d;
import ed4.a;
import qvb.n0;
import java.util.Iterator;
import brd.t;
import androidx.lifecycle.LiveData;
import ll4.b;
import ll4.a;
import java.util.Map;
import cjd.e;
import erd.o;
import la6.a;

public abstract class BaseOrderViewModel extends a	// class@00085e
{
    public boolean b;
    public i c;
    public GuessLikePhotoListHolder d;
    public HashMap e;
    public int f;
    public a g;
    public long h;
    public int i;
    public a j;
    public BaseOrderUIModel k;
    public boolean l;
    public OrderListGuessLikeBackwardCardFrequencyControlModel m;
    public boolean n;
    public Set o;
    public LinkedList p;
    public LifecycleObserver q;
    public MutableLiveData r;
    public MutableLiveData s;
    public KSCommand t;
    public KSCommand u;
    public KSCommand v;
    public KSCommand w;
    public static String x = "merchantOrderListGuessLikeBackwardCardFrequencyControl";

    public void BaseOrderViewModel(BaseFragment p0,i p1,HashMap p2){
       super();
       this.e = new HashMap();
       int i = 0;
       this.f = i;
       this.k = null;
       this.l = true;
       this.n = i;
       this.o = new HashSet();
       this.p = new BaseOrderViewModel$1(this);
       this.q = new BaseOrderViewModel$2(this);
       this.r = new MutableLiveData("");
       this.s = new MutableLiveData();
       this.t = new KSCommand(this, new j(this), new p(this), new m(this));
       this.u = new KSCommand(this, new l(this), new q(this), new m(this));
       this.v = new KSCommand(this, new k(this), new o(this), new n(this));
       this.w = new KSCommand(new r(this));
       this.d = new GuessLikePhotoListHolder();
       this.c = p1;
       if (p2 != null) {
          this.e = p2;
       }
       this.g = new a(p0);
       this.l = true;
       p0.getLifecycle().addObserver(this.q);
       OrderListGuessLikeBackwardCardFrequencyControlModel value = a.t().getValue(BaseOrderViewModel.x, OrderListGuessLikeBackwardCardFrequencyControlModel.class, new OrderListGuessLikeBackwardCardFrequencyControlModel());
       this.m = value;
       if (value.mExpiration - 0xbf800000 || value.mMinClickNum != -1) {
          i = true;
       }
       this.n = i;
       return;
    }
    public static void p0(BaseOrderViewModel p0,Throwable p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, BaseOrderViewModel.class, "29")) {
       }else {
          MerchantTransactionLogBiz oRDER = MerchantTransactionLogBiz.ORDER;
          StringBuilder str = "getGuessLikeError";
          String str1 = (p0.w0() >= 0)? ", tab is "+p0.w0(): "";
          a.l(oRDER, "BaseOrderViewModel", str+str1, p1);
       }
       return;
    }
    public final boolean A0(BaseOrderUIModel p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.a == 3) {
          b = true;
       }
       return b;
    }
    public boolean C0(){
       Object obj = PatchProxy.apply(null, this, BaseOrderViewModel.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (o5.b(this.e.get("isIndependent"), -1) != b) {
          b = false;
       }
       return b;
    }
    public void D0(MerchantGuessLikeResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseOrderViewModel.class, "26")) {
          return;
       }
       if (p0 == null || (p1 != null && !q.f(p0.mRecoItemList))) {
          if (!this.y0()) {
             p1.add(this.t0(p0.mGuessLikeTitleImage));
             this.f = 0;
          }
          for (int i = 0; i < p0.mRecoItemList.size(); i = i + 1) {
             a uoa = new a();
             MerchantRecommendInfoModel merchantReco = p0.mRecoItemList.get(i);
             int i1 = (merchantReco.mCardType == 2)? 6: 5;
             uoa.b = i1;
             uoa.c = merchantReco;
             uoa.e = this.g;
             uoa.f = this.d;
             BaseOrderViewModel tf = this.f;
             int i2 = tf + i;
             p0.mRecoItemList.get(i).mIndex = i2;
             int i3 = tf + i;
             this.d.addPhotoInfo(merchantReco, i3);
             p1.add(BaseOrderUIModel.g(uoa.b, uoa, 0));
          }
          this.f = this.f + p0.mRecoItemList.size();
       }
    label_007f :
       return;
    }
    public void E0(d p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseOrderViewModel.class, "27")) {
          return;
       }
       if (p0 == null || (p1 != null && !q.f(p0.cardList))) {
          if (!this.y0()) {
             p1.add(this.t0(""));
             this.f = 0;
          }
          for (int i = 0; i < p0.cardList.size(); i = i + 1) {
             a uoa = new a();
             a uoa1 = p0.cardList.get(i);
             uoa.b = this.x0(uoa1.cardType, uoa1.subType);
             uoa.c = uoa1;
             uoa.e = this.g;
             uoa.f = this.d;
             int i1 = this.f + i;
             p0.cardList.get(i).a = i1;
             p1.add(BaseOrderUIModel.g(uoa.b, uoa, 0));
          }
          this.f = this.f + p0.cardList.size();
       }
    label_0078 :
       return;
    }
    public void F0(boolean p0,boolean p1){
       BaseOrderViewModel uBaseOrderVi = BaseOrderViewModel.class;
       if (PatchProxy.isSupport(uBaseOrderVi) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uBaseOrderVi, "1")) {
          return;
       }
       this.b = p0;
       if (p1 && this.y0()) {
          this.b = false;
       }
       return;
    }
    public void G0(){
       if (PatchProxy.applyVoid(null, this, BaseOrderViewModel.class, "7")) {
          return;
       }
       List list = this.c.d1();
       if (q.f(list)) {
          return;
       }
       Iterator iterator = list.iterator();
       if (iterator.hasNext()) {
          BaseOrderUIModel uBaseOrderUI = iterator.next();
          if (uBaseOrderUI.a == 2) {
             list.remove(uBaseOrderUI);
          }
       }
       return;
    }
    public void q0(){
       BaseOrderUIModel uBaseOrderUI;
       BaseOrderUIModel uBaseOrderUI1;
       BaseOrderViewModel uBaseOrderVi = BaseOrderViewModel.class;
       if (PatchProxy.applyVoid(null, this, uBaseOrderVi, "4")) {
          return;
       }
       List list = this.c.d1();
       Iterator obj = PatchProxy.applyOneRefs(list, this, uBaseOrderVi, "5");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(q.f(list)){
          obj = list.iterator();
          do {
             if (obj.hasNext()) {
                uBaseOrderUI = obj.next();
                uBaseOrderUI1 = (uBaseOrderUI != null && uBaseOrderUI.a == 2)? 1: null;
             }
          } while (uBaseOrderUI1 || this.A0(uBaseOrderUI));
       }
       b = true;
       if (b) {
          list.add(this.v0(), BaseOrderUIModel.e(2));
       }
       return;
    }
    public final boolean r0(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BaseOrderViewModel uBaseOrderVi = BaseOrderViewModel.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, uBaseOrderVi, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c.d1();
       BaseOrderUIModel obj1 = PatchProxy.apply(objArray, this, uBaseOrderVi, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          List list = this.c.d1();
          if (!q.f(list) && !this.z0()) {
             obj1 = list.get((list.size() - true));
             boolean b1 = (obj1 != null && obj1.a == 100)? true: false;
             if (!b1) {
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj1 = iterator.next();
                      if (!this.A0(obj1)) {
                         if (obj1 != null) {
                            obj1 = obj1.a;
                            if (obj1 == 4 || obj1 == 5) {
                               b1 = true;
                            label_007f :
                               if (!b1) {
                                  continue ;
                               }
                            }
                         }
                         b1 = false;
                         goto label_007f ;
                      }
                      b = true;
                      break ;
                   }
                }
             }
          }
       label_0039 :
          b = false;
       }
       if (b) {
          obj.add(BaseOrderUIModel.e(100));
          return true;
       }else {
          return false;
       }
    }
    public t s0(){
       Object obj = PatchProxy.apply(null, this, BaseOrderViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().k(this.e, this.r.getValue(), 10).map(new e());
    }
    public BaseOrderUIModel t0(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, BaseOrderViewModel.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.c = p0;
       return BaseOrderUIModel.f(4, obj);
    }
    public t u0(){
       Object obj = PatchProxy.apply(null, this, BaseOrderViewModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a().e(this.e, this.r.getValue(), 10).map(new e());
    }
    public int v0(){
       return 0;
    }
    public int w0(){
       return -1;
    }
    public int x0(int p0,int p1){
       if (p0 == 1) {
          return 8;
       }
       if (p0 == 2) {
          return 10;
       }
       if (p0 == 3) {
          if (p1 == 1) {
             return 13;
          }
          return 11;
       }else if(p0 == 4){
          return 12;
       }else if(p0 == 98){
          return 22;
       }else {
          return 0;
       }
    }
    public final boolean y0(){
       List obj = PatchProxy.apply(null, this, BaseOrderViewModel.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c.d1();
       if (q.f(obj)) {
          return false;
       }
       Iterator iterator = obj.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (iterator.next().a()) {
             break ;
          }
       }
       return true;
    }
    public boolean z0(){
       Object obj = PatchProxy.apply(null, this, BaseOrderViewModel.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.r.getValue());
    }
}
