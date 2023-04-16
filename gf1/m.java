package gf1.m;
import com.kuaishou.live.common.core.component.comments.fluency.quick.f$a;
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
import s51.c;
import lp3.c;
import lp3.e;
import android.content.Context;
import gf1.q;

public final class m implements f$a	// class@0024c6
{
    public final j a;

    public void m(j p0){
       this.a = p0;
    }
    public final void a(LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened p0,LiveQuickCommentContainer$LiveQuickCommentItem p1){
       m ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, ta, j.class, "11")) {
       }else {
          LiveQuickCommentContainer$SCLiveQuickCommentContainerOpened bizId = p0.bizId;
          LiveQuickCommentContainer$LiveQuickCommentItem displayText = p1.displayText;
          LiveQuickCommentContainer$LiveQuickCommentItem quickComment = p1.quickCommentId;
          ClientContent$LiveStreamPackage liveStreamPa = ta.h();
          if (!PatchProxy.applyVoidFourRefs(bizId, displayText, quickComment, liveStreamPa, null, g.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "QUICK_COMMENT_CARD";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("biz_type", bizId);
             jsonObject.c0("btn_type", displayText);
             jsonObject.c0("btn_type_id", quickComment);
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u(1, uElementPack, uContentPack);
          }
          ta.b.a(c.class).r4(p1.actionRouter, ta.e);
          if (p0.clickDisappear != null && ta.l.e()) {
             ta.b("ClickDisappear");
          }
       }
       return;
    }
}
