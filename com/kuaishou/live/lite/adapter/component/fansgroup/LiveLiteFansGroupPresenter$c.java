package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter$c;
import qi1.b;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi1.b$a;
import kotlin.jvm.internal.a;
import android.view.View;
import ul1.d;
import yg1.f;
import ch1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ExtraInfoType;
import java.util.Map;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.Integer;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import ul1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import ul1.c;

public final class LiveLiteFansGroupPresenter$c implements b	// class@001d93
{
    public final LiveLiteFansGroupPresenter b;

    public void LiveLiteFansGroupPresenter$c(LiveLiteFansGroupPresenter p0){
       this.b = p0;
       super();
    }
    public void D0(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupPresenter$c.class, "18")) {
          return;
       }
       b$a.p(this);
       return;
    }
    public void J0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter$c.class, "5")) {
          return;
       }
       b$a.d(this, p0);
       return;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter$c.class, "4")) {
          return;
       }
       a.p(p0, "count");
       b$a.c(this, p0);
       return;
    }
    public void O1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter$c.class, "2")) {
          return;
       }
       a.p(p0, "view");
       b$a.a(this, p0);
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupPresenter$c.class, "23")) {
          return;
       }
       b$a.u(this);
       return;
    }
    public void a(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "22")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b$a.t(this, p0, p1);
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "result");
       a uoa = p0.c();
       if (uoa != null) {
          uoa = uoa.f;
          if (uoa != null) {
             uoa = uoa.get(LiveGiftBoxConfig$ExtraInfoType.FANS_GROUP_INTIMACY);
          label_0024 :
             if (uoa != null) {
                this.b.K.s(Integer.valueOf(uoa.mLevel), Integer.valueOf(uoa.mStatus));
             }
             return;
          }
       }
       uoa = null;
       goto label_0024 ;
    }
    public void c(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "12")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       b$a.i(this, p0, p1);
       return;
    }
    public void d(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "19")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b$a.q(this, p0, p1);
       return;
    }
    public void e(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "13")) {
          return;
       }
       a.p(p0, "source");
       b$a.j(this, p0, p1);
       return;
    }
    public void f(String p0,LiveGiftSortType p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteFansGroupPresenter$c.class, "21")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "sortType");
       a.p(p2, "tabInfo");
       b$a.s(this, p0, p1, p2);
       return;
    }
    public void g(){
       PatchProxy.applyVoid(null, this, LiveLiteFansGroupPresenter$c.class, "7");
    }
    public void g2(int p0,String p1){
       LiveLiteFansGroupPresenter$c uoc = LiveLiteFansGroupPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "8")) {
          return;
       }
       a.p(p1, "message");
       b$a.e(this, p0, p1);
       return;
    }
    public void h(){
       PatchProxy.applyVoid(null, this, LiveLiteFansGroupPresenter$c.class, "6");
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupPresenter$c.class, "14")) {
          return;
       }
       b$a.k(this);
       return;
    }
    public void i(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "20")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b$a.r(this, p0, p1);
       return;
    }
    public void j(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "10")) {
          return;
       }
       a.p(p0, "source");
       b$a.g(this, p0, p1);
       return;
    }
    public void k(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "11")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       b$a.h(this, p0, p1);
       return;
    }
    public void l(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "15")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       b$a.m(this, p0, p1);
       return;
    }
    public void m(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "16")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       b$a.n(this, p0, p1);
       return;
    }
    public void n(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteFansGroupPresenter$c.class, "9")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       b$a.f(this, p0, p1);
       return;
    }
    public void p1(Integer p0,int p1){
       LiveLiteFansGroupPresenter$c uoc = LiveLiteFansGroupPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       b$a.b(this, p0, p1);
       return;
    }
    public void u0(){
       if (PatchProxy.applyVoid(null, this, LiveLiteFansGroupPresenter$c.class, "17")) {
          return;
       }
       b$a.o(this);
       return;
    }
}
