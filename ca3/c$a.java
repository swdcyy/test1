package ca3.c$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import java.util.Objects;
import com.kuaishou.live.lite.comment.model.GiftSentMessage;
import java.lang.StringBuilder;
import lnc.a1;
import ca3.c$c;
import com.kwai.framework.model.user.UserInfo;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;

public final class c$a implements a	// class@0004d4
{

    public void c$a(){
       super();
    }
    public final Object apply(Object p0){
       String obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.lite.comment.model.GiftSentMessage");
       obj = (p0.getGiftCount() > 1)? a1.q(0x7f104647, p0.getGiftCount())+p0.getGiftName(): a1.p(0x7f104646)+p0.getGiftName();
       UserInfo mName = p0.getUserInfo().mName;
       a.o(mName, "giftSentMessage.userInfo.mName");
       return new c$c(mName, obj, p0.getGiftBitmap(), p0.getSenderState());
    }
}
