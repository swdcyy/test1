package com.yxcorp.gifshow.share.operation.KsFansTopFactory$a$a;
import erd.g;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory$a;
import java.lang.Object;
import uo7.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import yxb.b;
import android.app.Activity;
import java.util.Objects;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import nl9.a0;
import com.yxcorp.gifshow.entity.QPhoto;

public final class KsFansTopFactory$a$a implements g	// class@001bf6
{
    public final KsFansTopFactory$a b;

    public void KsFansTopFactory$a$a(KsFansTopFactory$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, KsFansTopFactory$a$a.class, "1")) {
       }else if(d.a(-430326918).cR(p0.k())){
          str = "3";
       }else {
          str = "5";
       }
       KsFansTopFactory$a c = this.b.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(null, c, KsFansTopFactory.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x77bf;
          uElementPack.name = "FANS_TOP";
          int i = 1;
          uElementPack.type = i;
          u1.u(i, uElementPack, null);
       }
       d.a(-61392074).V20(p0.k(), str, this.b.c.e);
       return;
    }
}
