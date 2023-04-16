package lf1.l;
import z1.a;
import com.kuaishou.live.common.core.component.comments.mock.c;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lf1.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import android.util.Base64;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Boolean;

public final class l implements a	// class@002eed
{
    public final c a;
    public final QLiveMessage b;
    public final String c;
    public final a d;

    public void l(c p0,QLiveMessage p1,String p2,a p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void accept(Object p0){
       l ta = this.a;
       l tb = this.b;
       l tc = this.c;
       l td = this.d;
       ta.P8(tb, p0);
       if (!TextUtils.x(tc)) {
          LiveFeedBackground liveFeedBack = PatchProxy.applyOneRefs(tc, null, k.class, "1");
          if (liveFeedBack != PatchProxyResult.class) {
          }else {
             int i = 0;
             try{
                liveFeedBack = LiveFeedBackground.parseFrom(Base64.decode(tc, i));
             }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e2){
                LiveLogTag cOMMENT = LiveLogTag.COMMENT;
                cOMMENT.appendTag("DisplayUserState");
                p0 = cOMMENT;
                b.y(p0, "parseFeedBackgroundFromBase64String, LiveFeedBackground parse error", e2);
             }catch(java.lang.IllegalArgumentException e2){
                cOMMENT = LiveLogTag.COMMENT;
                cOMMENT.appendTag("DisplayUserState");
                p0 = cOMMENT;
                b.y(p0, "parseFeedBackgroundFromBase64String, base64 decode error", e2);
             }
             liveFeedBack = new LiveFeedBackground();
          }
          if (PatchProxy.applyVoidTwoRefs(tb, liveFeedBack, ta, c.class, "5") || (ta.R8(tb) && liveFeedBack != null)) {
             p0 = tb.mLiveAudienceState;
             if (p0 == null) {
                p0 = new LiveAudienceState();
             }
             p0.feedBackground = liveFeedBack;
             tb.mLiveAudienceState = p0;
          }
       }
    label_006e :
       td.accept(Boolean.TRUE);
       return;
    }
}
