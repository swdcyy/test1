package j01.n;
import sfc.a;
import j01.m;
import com.yxcorp.gifshow.models.Gift;
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
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import j01.i0;
import mk1.h;
import rk1.b;
import h01.y;
import java.util.Objects;
import bl1.a;
import wk1.b;
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
import t02.a0;
import p91.m;
import lm1.d;
import lm1.f;
import ik1.i0;

public class n extends a	// class@002a04
{
    public final Gift c;
    public final i d;
    public final long e;
    public final String f;
    public final GiftMessage g;
    public final int h;
    public final int i;
    public final c j;
    public final e k;
    public final m l;

    public void n(m p0,Gift p1,i p2,long p3,String p4,GiftMessage p5,int p6,int p7,c p8,e p9){
       this.l = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       KwaiException mErrorCode;
       n l;
       n d;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, n.class, "1")) {
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
          if (obj2 == 803) {
             d.a(0x630bc993).d1().l();
          }else if(obj2 == 907 || obj2 == 908){
             l = obj.l;
             d = obj.c;
             Objects.requireNonNull(l);
             if (!PatchProxy.applyVoidOneRefs(d, l, m.class, "11")) {
                l.w.H2(d);
             }
             obj.l.q.q.c();
          }else if(obj2 == 901){
             obj.l.q.q.c();
          }else if(obj2 == 143){
             obj.l.r.a();
          }
       }else {
          mErrorCode = null;
       }
       obj.l.q.A.K4("[GiftBoxSendGiftToAnchorPresenter][httpSendNormalGiftToAnchor]sendError");
       l = obj.l;
       d = obj.d;
       String str1 = "[GiftBoxSendGiftToAnchorPresenter][httpSendNormalGiftToAnchor]"+a.a(p0);
       if (mErrorCode == null) {
          mErrorCode = 0x18a25;
       }
       l.R8(d, "CLIENT_SEND_REQUEST_RESULT", str1, mErrorCode);
       long l1 = SystemClock.elapsedRealtime() - obj.e;
       String[] stringArray = new String[11];
       stringArray[i] = "taskSessionId="+obj.f;
       stringArray[1] = "giftId=";
       stringArray[2] = String.valueOf(obj.g.mGiftId);
       stringArray[3] = "giftCount=";
       stringArray[4] = String.valueOf(obj.h);
       stringArray[5] = "giftComboCount=";
       stringArray[6] = String.valueOf(obj.l.q.I.get(obj.g.mComboKey));
       stringArray[7] = "giftIndex=";
       stringArray[8] = String.valueOf(obj.i);
       stringArray[9] = "timeCost=";
       stringArray[10] = String.valueOf(l1);
       e.a("LiveAudienceGiftBox", "sendGiftFail", obj1, stringArray);
       if (!b) {
          f.a(str);
       }
       obj.j.c(l1);
       g og = new g(null, null, a.b(p0), a.i(p0), null);
       b uob = new b(obj.l.t.Z2.getLiveStreamId(), obj.g, obj.c, obj.h, false, false, 4);
       obj1.b("key_send_gift_context", obj.d);
       obj1.c(new d(obj.d.b(), obj.j, obj.k, b));
       obj.l.t.V1.G4(obj1);
       return;
    }
}
