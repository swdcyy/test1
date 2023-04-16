package com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory$a$a;
import erd.g;
import com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory$a;
import java.lang.Object;
import uo7.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.a0;
import uo7.c0;
import android.app.Activity;
import com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;

public final class KsFansTopOtherFactory$a$a implements g	// class@001bfa
{
    public final KsFansTopOtherFactory$a b;

    public void KsFansTopOtherFactory$a$a(KsFansTopOtherFactory$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFansTopOtherFactory$a$a.class, "1")) {
       }else {
          d.a(-61392074).V20(this.b.getConfiguration().k(), "7", this.b.c.e);
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, KsFansTopOtherFactory$a.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 0x77c1;
             uElementPack.name = "FANS_TOP";
             uElementPack.type = 1;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(p0.c.e.mEntity);
             p0 = new ClickMetaData();
             p0.setType(1);
             p0.setElementPackage(uElementPack);
             p0.setContentPackage(uContentPack);
             u1.B(p0);
          }
       }
       return;
    }
}
