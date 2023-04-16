package f53.d$a;
import vq5.b;
import f53.d;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.x0;
import fg6.a;
import j57.a;
import com.google.gson.Gson;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.yxcorp.gifshow.models.Gift;
import j47.c;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import com.kwai.framework.model.user.QCurrentUser;
import ht5.a;
import lp3.c;
import lp3.e;
import com.kwai.framework.model.user.User;
import xp5.g;
import ht5.b$b;
import com.kwai.framework.model.user.UserInfo;
import ht5.b;
import lm1.f;
import java.lang.Boolean;
import wkd.b;
import ad5.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.webkit.URLUtil;
import vq5.d;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.widget.f$b;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import y43.a;
import fq5.b;
import f53.e;
import com.kwai.library.widget.popup.common.c;
import hc1.a;
import f92.b;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.c;
import w91.a;
import java.util.Map;
import lm1.d;
import lm1.e;
import lm1.g;
import ik1.i0;

public class d$a implements b	// class@0028a4
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(Uri p0){
       d$a a;
       Gift gift;
       int i2;
       i oi;
       f uof;
       b uob2;
       boolean b;
       Object obj = this;
       String obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, d$a.class, "1")) {
          return;
       }
       String str = x0.a(obj1, "source");
       obj1 = x0.a(obj1, "targeturl");
       a uoa = a.a.h(x0.a(obj1, "gift"), a.class);
       a = obj.a;
       a giftId = uoa.giftId;
       a mGiftToken = uoa.mGiftToken;
       uoa = uoa.mCount;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Integer.valueOf(giftId),mGiftToken,Integer.valueOf(uoa),str,obj1};
          if (!PatchProxy.applyVoid(objArray, a, uod, "3")) {
          label_0064 :
             gift = a.r.d3(giftId);
             if (gift != null) {
                try{
                   i2 = Integer.parseInt(str);
                }catch(java.lang.NumberFormatException e0){
                   i2 = 0;
                }
                if (PatchProxy.isSupport(uod)) {
                   oi = PatchProxy.applyTwoRefs(gift, Integer.valueOf(i2), a, uod, "4");
                   if (oi != patchProxyRe) {
                   label_00a8 :
                      f obj2 = oi;
                      User obj3 = obj2;
                      Object obj4 = obj2;
                      Gift gift1 = gift;
                      a.P8(obj3, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveGzoneLinkSendGiftPresenter]sending", 1);
                      if (QCurrentUser.me().isLogined()) {
                         giftId = a.p.a(a.class);
                         obj3 = a.v.I();
                         if (obj3 == null) {
                            obj3 = new User();
                         }
                         b$b uob = new b$b(gift1);
                         uob.g(mGiftToken);
                         uob.d(uoa);
                         uob.b(i);
                         int i3 = 0;
                         uob.l(i3);
                         uob.c(i3);
                         uob.i(i);
                         uob.f(i2);
                         uob.j(UserInfo.convertFromQUser(obj3));
                         b uob1 = uob.a();
                         obj2 = f.a(uob1);
                         Object obj5 = obj4;
                         obj5.g(obj2);
                         if (PatchProxy.isSupport(uod)) {
                            obj4 = obj5;
                            uof = obj2;
                            uob2 = uob1;
                            f$b obj6 = PatchProxy.applyThreeRefs(gift1, Integer.valueOf(uoa), obj1, a, d.class, "6");
                            if (obj6 != patchProxyRe) {
                               b = obj6.booleanValue();
                            }else {
                            label_013e :
                               long l = b.a(0x4c90014d).q();
                               long l1 = (long)(gift1.mPrice * uoa);
                               if (l - l1 < 0) {
                                  if (!TextUtils.x(obj1)) {
                                     if (!URLUtil.isNetworkUrl(obj1)) {
                                        if (a.q.P0(obj1)) {
                                           a.q.r4(obj1, a.getContext());
                                        }
                                     }else {
                                        obj6 = new f$b(a.getActivity());
                                        obj6.g0(obj1);
                                        obj6.f0(a.s.m);
                                        new e(a, obj6).Z();
                                     }
                                  }else {
                                     a.p.a(a.class).Na((l1 - l));
                                  }
                                  b = false;
                               }else {
                                  b = true;
                               }
                            }
                         }else {
                            obj4 = obj5;
                            uof = obj2;
                            uob2 = uob1;
                            String str1 = null;
                            goto label_013e ;
                         }
                         if (!b) {
                            a.P8(obj4, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveGzoneLinkSendGiftPresenter]sending", 0x1870a);
                            b uob3 = new b(a.s.m.getLiveStreamId(), GiftMessage.createSelfGiftMessage(gift1, uoa), gift1, uoa, false, true, i2);
                            c uoc = new c("", 0, null, a.p.a(a.class).d6(), null);
                            obj1.c(new d(uof, uoa, uof.g(), g.a(0x1870a, "")));
                            a.p.a(i0.class).G4(obj1);
                         }else {
                            uob2.a("key_send_gift_context", obj4);
                            giftId.a7(uob2);
                         }
                      }
                   }
                }
                oi = new i(a.t.o6());
                LiveSendGiftTraceInfo liveSendGift = oi.e();
                liveSendGift.z(i);
                liveSendGift.j(gift);
                liveSendGift.t(i2);
                liveSendGift.s(10);
                goto label_00a8 ;
             }
          }
       }else {
          goto label_0064 ;
       }
       return;
    }
}
