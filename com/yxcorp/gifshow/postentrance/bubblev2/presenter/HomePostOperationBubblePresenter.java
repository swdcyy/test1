package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter;
import ozb.q;
import ozb.r;
import ozb.a;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$a;
import nsd.u;
import pr6.d;
import an6.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$defaultFilter$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import an6.l;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomePostOperationBubblePresenter$b;
import an6.e;
import an6.o;
import jzb.c;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import java.lang.System;
import java.lang.Boolean;
import an6.k$a;
import com.yxcorp.gifshow.postentrance.util.HomePostBubbleFrequencyControlUtils;
import java.util.List;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import com.yxcorp.gifshow.postentrance.util.b;

public class HomePostOperationBubblePresenter extends a implements q, r	// class@00102d
{
    public final int A;
    public long u;
    public boolean v;
    public boolean w;
    public final l x;
    public l y;
    public final d z;
    public static long B;
    public static final HomePostOperationBubblePresenter$a C;

    static {
       HomePostOperationBubblePresenter.C = new HomePostOperationBubblePresenter$a(null);
    }
    public void HomePostOperationBubblePresenter(d p0,k p1,int p2,int p3){
       a.p(p0, "fragment");
       a.p(p1, "pageStateDelegate");
       super(p1, p2);
       this.z = p0;
       this.A = p3;
       this.v = true;
       this.x = new HomePostOperationBubblePresenter$defaultFilter$1(this, p1);
       HomePostOperationBubblePresenter$b uob = PatchProxy.apply(null, this, HomePostOperationBubblePresenter.class, "8");
       if (uob != PatchProxyResult.class) {
       }else {
          HomePostOperationBubblePresenter$b uob1 = new HomePostOperationBubblePresenter$b(this, this.W8(), p0, this.X8(), p3, 5);
       }
       this.y = uob;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomePostOperationBubblePresenter.class, "2")) {
          return;
       }
       if (!this.Z8()) {
          e uoe = this.V8().g();
          if (uoe != null && uoe.b() == 16) {
             this.V8().j(false);
             this.u = (long)((float)HomePostEntranceExpUtil.g().a() * 1000.00f) + System.currentTimeMillis();
          }
       }
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, HomePostOperationBubblePresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (super.P8() && (k$a.a(this.W8(), null, b, 3, null) && HomePostBubbleFrequencyControlUtils.g.a(System.currentTimeMillis()))) {
          b = true;
       }
    label_0033 :
       return b;
    }
    public l R8(){
       Object obj = PatchProxy.apply(null, this, HomePostOperationBubblePresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HomePostOperationBubblePresenter$b uob = new HomePostOperationBubblePresenter$b(this, this.W8(), this.z, this.X8(), this.A, 5);
       return obj;
    }
    public l V8(){
       return this.y;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, HomePostOperationBubblePresenter.class, "4")) {
          return;
       }
       if (!this.V8().h()) {
          this.w = true;
          this.a9();
       }
       return;
    }
    public void p1(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomePostOperationBubblePresenter.class, "3")) {
          return;
       }
       a.p(p0, "tabId");
       a.p(p1, "parentTabId");
       if (!this.V8().h()) {
          this.w = this.v;
          this.a9();
          return;
       }else if(this.V8().h() == 3 && !this.W8().h(this.V8().i())){
          PublishGuideInfo publishGuide = this.V8().c(PublishGuideInfo.class);
          if (publishGuide != null) {
             b.f("stage_click_tab_dismiss", publishGuide);
          }
          this.V8().j(true);
       }
       this.v = false;
       return;
    }
}
