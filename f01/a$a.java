package f01.a$a;
import ug1.a1;
import f01.a;
import java.lang.Object;
import f92.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.q1;
import java.util.Objects;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.activitycontext.ActivityContext;
import e17.i;
import f92.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import lm1.i;
import lm1.h;
import com.kuaishou.live.basic.model.QLiveMessage;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Enum;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.gift.GiftMessage;
import ik1.b0;
import ne1.h;
import com.kuaishou.live.common.core.component.gift.gift.p;

public class a$a implements a1	// class@002261
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void G4(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       if (p0.e != null) {
          b d = p0.d;
          b c = p0.c;
          int i = d.mPrice * c;
          if (p0.f == null) {
             q1.D(d, 1, c, i, this.a.P8());
          }
          this.a.R8(p0);
          a$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, a.class, "3")) {
             String str = null;
             p0 = p0.i;
             if (p0 instanceof WalletResponse) {
                str = p0.getIntimacyIncreaseToast();
             }else if(p0 instanceof LiveSendNoPanelGiftResponse){
                str = p0.getIntimacyIncreaseToast();
             }
             if (!TextUtils.x(str) && ActivityContext.g().h()) {
                i.f(R.style.arg_RES_7f11066a, str, 1);
             }
          }
       }
    label_0068 :
       return;
    }
    public void S1(a p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       String str = "key_send_gift_context";
       Objects.requireNonNull(p0);
       h obj = PatchProxy.applyOneRefs(str, p0, a.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = p0.h.get(str);
       }
       Gift gift = null;
       Gift gift1 = (obj instanceof i)? obj: gift;
       a b = p0.b;
       if (b == null) {
          this.a.S8(gift1, "SENDING_GIFT", "CLIENT_MOCK_RESULT", "[LiveAudienceGiftBoxSendSuccessPresenter][onSendDrawingGiftResult]empty message", 508);
          return;
       }else {
          obj = new h(gift1, b, 2);
          if (p0.f != null) {
             if (p0.g == null) {
                q1.D(gift, 1, p0.e, p0.d, this.a.P8());
             }
             if (!TextUtils.equals(p0.a, this.a.p.c.getLiveStreamId())) {
                this.a.S8(gift1, "SENDING_GIFT", "CLIENT_MOCK_RESULT", "[LiveAudienceGiftBoxSendSuccessPresenter][onSendDrawingGiftResult]event:"+p0.a+",photo:"+this.a.p.c.getLiveStreamId(), 507);
                return;
             }else if(p0.c != null){
                i = this.a.p.b2.d(QCurrentUser.me().getId()).ordinal();
                Iterator iterator = p0.c.iterator();
                while (iterator.hasNext()) {
                   iterator.next().mLiveAssistantType = i;
                }
             }
             this.a.p.c2.s(obj);
             a0 x = this.a.p.X;
             if (x != null) {
                x.dd(p0.c);
             }
          }
          return;
       }
    }
    public void o4(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       if (p0.e != null) {
          b d = p0.d;
          b c = p0.c;
          int i = d.mPrice * c;
          if (p0.f == null) {
             q1.D(d, 1, c, i, this.a.P8());
          }
          if (p.l()) {
             this.a.R8(p0);
          }
       }
       return;
    }
    public void t2(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       if (p0.e != null) {
          this.a.R8(p0);
       }
       return;
    }
}
