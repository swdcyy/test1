package j01.e0$b;
import erd.g;
import j01.e0;
import lm1.i;
import java.lang.String;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.yxcorp.gifshow.models.Gift;
import lm1.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import mk1.h;
import tk1.b;
import java.util.Objects;
import njd.a;
import com.kuaishou.live.common.core.component.gift.giftstore.api.LivePackSendResponse;
import wk1.b;
import java.lang.StringBuilder;
import oy1.a;
import android.os.SystemClock;
import android.util.SparseArray;
import z12.e;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Integer;
import f92.b;
import xp5.g;
import lp3.c;
import lp3.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zb6.a;
import lm1.c;
import fq5.b;
import t02.a0;
import p91.m;
import w91.a;
import java.util.Map;
import lm1.f;
import lm1.d;
import lm1.e;
import ik1.i0;

public class e0$b implements g	// class@0029ee
{
    public final i b;
    public final long c;
    public final String d;
    public final GiftMessage e;
    public final int f;
    public final int g;
    public final Gift h;
    public final g i;
    public final e0 j;

    public void e0$b(e0 p0,i p1,long p2,String p3,GiftMessage p4,int p5,int p6,Gift p7,g p8){
       this.j = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       super();
    }
    public void accept(Object p0){
       KwaiException mErrorCode;
       String str1;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e0 uoe0 = e0.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e0$b.class, "1")) {
       }else {
          v4 = obj1 instanceof KwaiException;
          e0$b uob = 0x10299;
          boolean b = true;
          String str = "";
          int i = 0;
          if (v4) {
             KwaiException obj2 = obj1;
             mErrorCode = obj2.mErrorCode;
             if (mErrorCode != 0x10298 && (mErrorCode != uob && (mErrorCode == 0x1029c || mErrorCode == 0x1029d))) {
                obj.j.t.B.h(b);
             }
             e0$b j = obj.j;
             obj2 = obj2.mResponse;
             Objects.requireNonNull(j);
             str1 = PatchProxy.applyOneRefs(obj2, j, uoe0, "7");
             if (str1 != patchProxyRe) {
             }else if(obj2 != null && (obj2.a() != null && obj2.a() instanceof LivePackSendResponse)){
                str1 = obj2.a().getJumpUrl();
             }else {
                str1 = str;
             }
          }else {
             str1 = str;
             mErrorCode = null;
          }
          obj.j.t.A.K4("[GiftBoxSendPacketGiftToAnchorPresenter][httpSendPacketGift]sendError");
          e0$b j1 = obj.j;
          e0$b b1 = obj.b;
          String str2 = "[GiftBoxSendPacketGiftToAnchorPresenter][httpSendPacketGift]"+a.a(obj1);
          if (mErrorCode == null) {
             mErrorCode = 0x18a25;
          }
          j1.R8(b1, "CLIENT_SEND_REQUEST_RESULT", str2, mErrorCode);
          long l = SystemClock.elapsedRealtime() - obj.c;
          String[] stringArray = new String[11];
          stringArray[i] = "taskSessionId="+obj.d;
          stringArray[b] = "giftId=";
          stringArray[2] = String.valueOf(obj.e.mGiftId);
          stringArray[3] = "giftCount=";
          stringArray[4] = String.valueOf(obj.f);
          stringArray[5] = "giftComboCount=";
          stringArray[6] = String.valueOf(obj.j.t.I.get(obj.e.mComboKey));
          stringArray[7] = "giftIndex=";
          stringArray[8] = String.valueOf(obj.g);
          stringArray[9] = "timeCost=";
          stringArray[10] = String.valueOf(l);
          e.a("LiveAudienceGiftBox", "sendPacketGiftFail", obj1, stringArray);
          HashMap hashMap = new HashMap();
          hashMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
          b uob1 = new b(obj.j.v.a(g.class).getLiveStreamId(), obj.e, obj.h, obj.f, false, false, 4);
          stringArray.b("key_send_gift_context", obj.b);
          stringArray.m = b;
          e0$b j2 = obj.j;
          Objects.requireNonNull(j2);
          String str3 = PatchProxy.applyOneRefs(obj1, j2, uoe0, "8");
          if (str3 != patchProxyRe) {
          }else if(v4){
             Object obj3 = obj1;
             str = obj3.getMessage();
             if (TextUtils.x(str)) {
                str = (obj3.mErrorCode == uob)? j2.l8().getString(R.string.arg_RES_7f101c44): j2.l8().getString(R.string.arg_RES_7f104645);
             }
          }
          str3 = str;
          stringArray.k = str3;
          stringArray.l = str1;
          obj.i.c(a.b(obj1));
          obj.i.d(a.i(obj1));
          c uoc = new c(obj.d, l, hashMap, obj.j.u.b().t5().a(a.class).d6(), null);
          f uof = obj.b.b();
          stringArray.c(new d(uof, obj1, uof.g(), obj.i));
          obj.j.u.V1.t2(stringArray);
       }
       return;
    }
}
