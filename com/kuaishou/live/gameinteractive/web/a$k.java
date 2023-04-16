package com.kuaishou.live.gameinteractive.web.a$k;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a;
import org.json.JSONObject;
import v43.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j75.c;
import t02.a0;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import pp.a;
import q87.c;
import java.lang.StringBuilder;
import e43.b;
import e43.a;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.gameinteractive.web.j;
import com.kuaishou.live.gameinteractive.web.k;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a$k implements g	// class@001c04
{
    public final JSONObject b;
    public final c c;
    public final a d;

    public void a$k(a p0,JSONObject p1,c p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          int i = 0;
          String str = "GameInteractiveCommonBridgeImpl";
          if (p0.booleanValue()) {
             String str1 = this.b.optString("giftId");
             int i1 = this.b.optInt("count");
             int i2 = c.a(str1);
             String str2 = this.b.optString("giftToken");
             String str3 = this.b.optString("appId");
             long l = this.b.optLong("timestamp");
             String str4 = this.b.optString("sign");
             String str5 = this.d.p.Z2.d();
             int i3 = TextUtils.x(str2) ^ 0x01;
             Gift gift = a.a(i2);
             if (gift == null) {
                Object[] objArray = new Object[i];
                a.C().s(str, "gift is null, create one", objArray);
                gift = new Gift();
                gift.mId = i2;
             }
             objArray1 = new Object[i];
             a.C().s(str, "start send gift -- hasGiftToken:"+i3, objArray1);
             if (i3) {
                this.d.W8(i1, str2, gift, this.c);
             }else {
                this.d.X7(a.a().i(str3, str1, str5, str4, l).subscribeOn(d.b).observeOn(d.a).subscribe(new j(this, i1, gift), new k(this)));
             }
          }else {
             objArray1 = new Object[i];
             a.C().t(str, "request permission failed!", objArray1);
             p0 = this.c;
             if (p0 != null) {
                p0.onError(-2, "request permission failed!");
             }
          }
       }
       return;
    }
}
