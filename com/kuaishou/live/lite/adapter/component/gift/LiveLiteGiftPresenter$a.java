package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$a;
import jm1.a;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import java.lang.Object;
import qi1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ni1.d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import ni1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ni1.c;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteGiftPresenter$a implements a	// class@001dac
{
    public final LiveLiteGiftPresenter a;

    public void LiveLiteGiftPresenter$a(LiveLiteGiftPresenter p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftPresenter$a.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       if (this.a.h9()) {
          this.a.j9().o(p0);
       }else {
          LiveLiteGiftPresenter z = this.a.Z;
          if (z != null) {
             LiveGiftBoxManager liveGiftBoxM = z.e();
             if (liveGiftBoxM != null) {
                liveGiftBoxM.h(p0);
             }
          }
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftPresenter$a.class, "4")) {
          return;
       }
       a.p(p0, "listener");
       if (this.a.h9()) {
          this.a.j9().p(p0);
       }else {
          LiveLiteGiftPresenter z = this.a.Z;
          if (z != null) {
             LiveGiftBoxManager liveGiftBoxM = z.e();
             if (liveGiftBoxM != null) {
                liveGiftBoxM.j(p0);
             }
          }
       }
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "giftBoxParam");
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxService][showGiftBoxDialog]"+p0);
       LiveLiteGiftPresenter z = this.a.Z;
       if (z != null) {
          LiveGiftBoxManager liveGiftBoxM = z.e();
          if (liveGiftBoxM != null) {
             liveGiftBoxM.i(p0);
          }
       }
       return;
    }
    public c e(){
       Object[] objArray = null;
       LiveLiteGiftPresenter obj = PatchProxy.apply(objArray, this, LiveLiteGiftPresenter$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.Z;
       if (obj != null) {
          LiveGiftBoxManager liveGiftBoxM = obj.e();
          if (liveGiftBoxM != null) {
             objArray = liveGiftBoxM.g();
          }
       }
       return objArray;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftPresenter$a.class, "2")) {
          return;
       }
       b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxService][dismissGiftBoxDialog]");
       LiveLiteGiftPresenter z = this.a.Z;
       if (z != null) {
          LiveGiftBoxManager liveGiftBoxM = z.e();
          if (liveGiftBoxM != null) {
             liveGiftBoxM.b();
          }
       }
       return;
    }
}
