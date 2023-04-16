package com.kuaishou.live.ad.fanstop.i$a;
import xq5.c;
import com.kuaishou.live.ad.fanstop.i;
import java.lang.Object;
import xq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import pl0.o0;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class i$a implements c	// class@0009a7
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void P(){
       this.b.t = false;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i$a.class, "1")) {
          return;
       }
       i$a tb = this.b;
       if (tb.t == null) {
          Objects.requireNonNull(tb);
          String str = "FLOW_OPERATE_LOC";
          if (!PatchProxy.applyVoid(objArray, tb, oi, "3") && tb.q != null) {
             ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
             uElementPack1.name = str;
             uElementPack1.action2 = str;
             ClientContent$ContentPackage uContentPack1 = new ClientContent$ContentPackage();
             uContentPack1.photoPackage = w1.f(new QPhoto(tb.q.mPhoto).mEntity);
             uContentPack1.ksOrderInfoPackage = l0.a(tb.s);
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             showEvent.contentPackage = uContentPack1;
             showEvent.elementPackage = uElementPack1;
             k1.r(new o0(showEvent), 50);
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, oi, "4") && tb.q != null) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.name = str;
             uElementPack.action2 = str;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(new QPhoto(tb.q.mPhoto).mEntity);
             uContentPack.ksOrderInfoPackage = l0.a(tb.s);
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             uClickEvent.contentPackage = uContentPack;
             uClickEvent.elementPackage = uElementPack;
             u1.a0(uClickEvent);
          }
       }
    label_00a7 :
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
