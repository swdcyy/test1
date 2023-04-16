package com.kuaishou.live.audience.component.gift.a;
import sfc.a;
import t02.a0;
import mk1.h;
import com.yxcorp.gifshow.models.Gift;
import lp3.i;
import lm1.i;
import java.lang.String;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import lm1.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rj1.a;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import android.text.TextUtils;
import dl1.b;
import rk1.b;
import bl1.a;
import om1.a;
import lp3.c;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;
import mm1.g;
import java.lang.StringBuilder;
import oy1.a;
import android.os.SystemClock;
import android.util.SparseArray;
import z12.e;
import wy0.f;
import lm1.g;
import zb6.a;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;
import f92.b;
import p91.m;
import lm1.d;
import lm1.f;
import ik1.i0;

public class a extends a	// class@000adb
{
    public final a0 c;
    public final h d;
    public final Gift e;
    public final i f;
    public final i g;
    public final long h;
    public final String i;
    public final GiftMessage j;
    public final int k;
    public final int l;
    public final c m;
    public final e n;

    public void a(a0 p0,h p1,Gift p2,i p3,i p4,long p5,String p6,GiftMessage p7,int p8,int p9,c p10,e p11){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       this.k = p8;
       this.l = p9;
       this.m = p10;
       this.n = p11;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       KwaiException mErrorCode;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a.class, "1")) {
          return;
       }
       boolean b = a.a(p0);
       if (!b) {
          super.b(p0);
       }
       String str = a.a().a().getString(R.string.arg_RES_7f101fa4);
       int i = 0;
       if (obj1 instanceof KwaiException) {
          KwaiException obj2 = obj1;
          mErrorCode = obj2.mErrorCode;
          if (!TextUtils.isEmpty(obj2.getMessage())) {
             str = obj2.getMessage();
          }
          obj2 = obj2.mErrorCode;
          if (obj2 == 0x1484c) {
             a0 q = obj.c.Q;
             if (q != null) {
                q.c();
             }
          }else if(obj2 == 0x14849 || obj2 == 0x1484a){
             obj.d.o.H2(obj.e);
             obj.d.q.c();
          }else if(obj2 == 0x1484b){
             obj.d.q.c();
          }
       }else {
          mErrorCode = null;
       }
       if (!obj.f.b()) {
          e uoe = obj.f.a(a.class).yk(obj.g.e()).f("SENDING_GIFT").d("CLIENT_SEND_REQUEST_RESULT").e("[LiveGiftPayUtil][httpSendNebulaCreditGiftToAnchor]"+a.a(p0));
          if (mErrorCode == null) {
             mErrorCode = 0x18a25;
          }
          uoe.g(mErrorCode).a();
       }
       long l = SystemClock.elapsedRealtime() - obj.h;
       String[] stringArray = new String[12];
       stringArray[i] = "taskSessionId=";
       stringArray[1] = obj.i;
       stringArray[2] = "giftId=";
       stringArray[3] = String.valueOf(obj.j.mGiftId);
       stringArray[4] = "giftCount=";
       stringArray[5] = String.valueOf(obj.k);
       stringArray[6] = "giftComboCount=";
       a d = obj.d;
       stringArray[7] = String.valueOf(d.I.get(d.H));
       stringArray[8] = "giftIndex=";
       stringArray[9] = String.valueOf(obj.l);
       stringArray[10] = "timeCost=";
       stringArray[11] = String.valueOf(l);
       e.a("LiveSendGiftHttpUtil", "sendGiftFail", obj1, stringArray);
       if (!b) {
          f.a(str);
       }
       obj.m.c(l);
       g og = new g(null, null, a.b(p0), a.i(p0), null);
       b uob = new b(obj.c.Z2.getLiveStreamId(), obj.j, obj.e, obj.k, false, false, 4);
       obj1.b("key_send_gift_context", obj.g);
       obj1.c(new d(obj.g.b(), obj.m, obj.n, b));
       obj.c.V1.G4(obj1);
       return;
    }
}
