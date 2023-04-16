package gf1.n;
import com.kuaishou.live.common.core.component.comments.fluency.quick.f$b;
import com.kuaishou.live.common.core.component.comments.fluency.quick.j;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened;
import com.kuaishou.livestream.message.nano.LiveQuickCommentContainer$LiveQuickCommentItem;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import gf1.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class n implements f$b	// class@0024c7
{
    public final j a;

    public void n(j p0){
       this.a = p0;
    }
    public final void a(LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened p0,LiveQuickCommentContainer$LiveQuickCommentItem p1){
       n ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, ta, j.class, "10")) {
       }else {
          p0 = p0.bizId;
          LiveQuickCommentContainer$LiveQuickCommentItem displayText = p1.displayText;
          p1 = p1.quickCommentId;
          ClientContent$LiveStreamPackage liveStreamPa = ta.h();
          if (!PatchProxy.applyVoidFourRefs(p0, displayText, p1, liveStreamPa, null, g.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "QUICK_COMMENT_CARD";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("biz_type", p0);
             jsonObject.c0("btn_type", displayText);
             jsonObject.c0("btn_type_id", p1);
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u0(9, uElementPack, uContentPack);
          }
       }
       return;
    }
}
