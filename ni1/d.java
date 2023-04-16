package ni1.d;
import qi1.b;
import java.lang.Object;
import xg1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import ui1.m;
import ti1.i;
import kotlin.jvm.internal.a;
import android.view.View;
import ul1.d;
import java.lang.StringBuilder;
import ch1.d;
import tl1.a;
import yg1.f;
import ch1.a;
import ih1.i;
import ul1.a;
import ch1.c;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Integer;
import ul1.c;

public final class d implements b	// class@003329
{
    public a b;

    public void d(){
       super();
       this.b = new a();
    }
    public void D0(){
       if (PatchProxy.applyVoid(null, this, d.class, "20")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[onRechargeShow]");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().D0();
       }
       return;
    }
    public void J0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().J0(p0);
       }
       return;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "18")) {
          return;
       }
       a.p(p0, "count");
       b.Z(LiveGiftTag.GIFT_BOX, "[onBatchItemClick]");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().M(p0);
       }
       return;
    }
    public void O1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "17")) {
          return;
       }
       a.p(p0, "view");
       b.Z(LiveGiftTag.GIFT_BOX, "[onBatchClick]");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().O1(p0);
       }
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, d.class, "15")) {
          return;
       }
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().P();
       }
       return;
    }
    public void a(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b.Z(LiveGiftTag.GIFT_BOX, "[onTabUnSelected]"+p1.b().a());
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(f p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "23")) {
          return;
       }
       a.p(p0, "result");
       LiveGiftTag gIFT_BOX = LiveGiftTag.GIFT_BOX;
       StringBuilder str = "[onPagerFetchFinish]tabId:";
       a uoa = p0.c();
       uoa = (uoa != null)? uoa.a: null;
       b.Z(gIFT_BOX, str+uoa);
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(String p0,a p1){
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "9")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       LiveGiftTag gIFT_BOX = LiveGiftTag.GIFT_BOX;
       StringBuilder str = "[onGiftUnSelected]";
       Gift gift = p1.b().b();
       gift = (gift != null)? gift.mName: null;
       b.Z(gIFT_BOX, str+gift);
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1);
       }
       return;
    }
    public void d(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b.Z(LiveGiftTag.GIFT_BOX, "[onTabSelected]"+p1.b().a());
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1);
       }
       return;
    }
    public void e(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "11")) {
          return;
       }
       a.p(p0, "source");
       LiveGiftTag gIFT_BOX = LiveGiftTag.GIFT_BOX;
       StringBuilder str = "[onGiftUnSelectedByTab]";
       if (p1 != null) {
          c uoc = p1.b();
          if (uoc != null) {
             Gift gift = uoc.b();
             if (gift != null) {
                gift = gift.mName;
             label_002e :
                b.Z(gIFT_BOX, str+gift);
                Iterator iterator = this.b.a().iterator();
                while (iterator.hasNext()) {
                   iterator.next().e(p0, p1);
                }
                return;
             }
          }
       }
       String str1 = null;
       goto label_002e ;
    }
    public void f(String p0,LiveGiftSortType p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "5")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "sortType");
       a.p(p2, "tabInfo");
       b.Z(LiveGiftTag.GIFT_BOX, "[onTabSortTypeChanged]"+p2.b().a());
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p0, p1, p2);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[onDialogShow]");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().g();
       }
       return;
    }
    public void g2(int p0,String p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "22")) {
          return;
       }
       a.p(p1, "message");
       b.Z(LiveGiftTag.GIFT_BOX, "[onDialogShowFailed]code:"+p0+",message:"+p1);
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().g2(p0, p1);
       }
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[onDialogDismiss]");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().h();
       }
       return;
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, d.class, "16")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[onPagerItemUnSelected]");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().h2();
       }
       return;
    }
    public void i(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b.Z(LiveGiftTag.GIFT_BOX, "[onTabShow]"+p1.b().a());
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().i(p0, p1);
       }
       return;
    }
    public void j(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "10")) {
          return;
       }
       a.p(p0, "source");
       LiveGiftTag gIFT_BOX = LiveGiftTag.GIFT_BOX;
       StringBuilder str = "[onGiftSelectedByTab]";
       if (p1 != null) {
          c uoc = p1.b();
          if (uoc != null) {
             Gift gift = uoc.b();
             if (gift != null) {
                gift = gift.mName;
             label_002e :
                b.Z(gIFT_BOX, str+gift);
                Iterator iterator = this.b.a().iterator();
                while (iterator.hasNext()) {
                   iterator.next().j(p0, p1);
                }
                return;
             }
          }
       }
       String str1 = null;
       goto label_002e ;
    }
    public void k(String p0,a p1){
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "7")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       LiveGiftTag gIFT_BOX = LiveGiftTag.GIFT_BOX;
       StringBuilder str = "[onGiftShow]";
       Gift gift = p1.b().b();
       gift = (gift != null)? gift.mName: null;
       b.Z(gIFT_BOX, str+gift);
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().k(p0, p1);
       }
       return;
    }
    public void l(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "12")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().l(p0, p1);
       }
       return;
    }
    public void m(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "13")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().m(p0, p1);
       }
       return;
    }
    public void n(String p0,a p1){
       String str1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "8")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       LiveGiftTag gIFT_BOX = LiveGiftTag.GIFT_BOX;
       StringBuilder str = "[onGiftSelected]";
       Gift gift = p1.b().b();
       gift = (gift != null)? gift.mName: null;
       b.Z(gIFT_BOX, str+gift);
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().n(p0, p1);
       }
       return;
    }
    public final void o(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "24")) {
          return;
       }
       a.p(p0, "listener");
       this.b.b(p0);
       return;
    }
    public final void p(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "25")) {
          return;
       }
       a.p(p0, "listener");
       this.b.c(p0);
       return;
    }
    public void p1(Integer p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "19")) {
          return;
       }
       b.d0(LiveGiftTag.GIFT_BOX, "[onBatchCountChanged]", "oldValue is ", p0, "newValue is ", Integer.valueOf(p1));
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().p1(p0, p1);
       }
       return;
    }
    public void u0(){
       if (PatchProxy.applyVoid(null, this, d.class, "21")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[onRechargeClick]");
       Iterator iterator = this.b.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().u0();
       }
       return;
    }
}
