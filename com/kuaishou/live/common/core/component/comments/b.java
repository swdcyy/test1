package com.kuaishou.live.common.core.component.comments.b;
import k81.k;
import o81.g;
import com.kuaishou.live.common.core.component.comments.b$a;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.like.LikeMessage;
import jf1.a0;
import o81.d;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import jf1.l0;
import com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPacketGrabPacketMessage;
import jf1.o;
import com.kuaishou.live.common.core.component.comments.model.LiveFellowRedPackSendPacketMessage;
import jf1.n;
import com.kwai.live.gzone.comments.LiveGzoneTagMessage;
import jf1.x;
import com.kuaishou.live.common.core.component.comments.model.SystemNoticeMessage;
import jf1.b0;
import com.kuaishou.live.common.core.component.redpacket.redpacket.GrabRedPacketMessage;
import jf1.t;
import com.kuaishou.live.common.core.component.redpacket.SendRedPacketMessage;
import jf1.j0;
import com.kuaishou.live.common.core.component.comments.model.LiveShareMessage;
import jf1.k0;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import jf1.i0;
import o81.f;
import com.kuaishou.live.core.show.enterroom.model.EnterRoomMessage;
import jf1.j;
import com.kuaishou.live.common.core.component.comments.model.LiveAudienceMerchantSendCSSuccessMessage;
import jf1.g;
import com.kuaishou.live.core.show.gift.GiftMessage;
import jf1.s;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftMergedMessage;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMergedMessage;
import com.kuaishou.live.common.core.component.follow.FollowAnchorMessage;
import jf1.p;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneCommonMessage;
import jf1.v;
import com.kuaishou.live.common.core.component.comments.model.VoiceCommentMessage;
import com.kuaishou.live.common.core.component.comments.item.voicecomment.a;
import com.kuaishou.live.common.core.component.comments.model.PurchaseInfoMessage;
import jf1.d0;
import com.kuaishou.live.common.core.component.comments.model.LiveKtvOrderMusicMessage;
import jf1.z;
import if1.b;
import com.kuaishou.live.common.core.component.chat.LiveChatWithGuestApplyMessage;
import jf1.i;
import com.kuaishou.live.common.core.component.comments.model.LiveFansGroupJoinMessage;
import jf1.k;
import com.kuaishou.live.common.core.component.comments.model.LiveAdConversionTaskMessage;
import jf1.b;
import com.kuaishou.live.common.core.component.comments.model.LiveFansTopHelpBuyMessage;
import jf1.m;
import com.kuaishou.live.common.core.component.comments.model.LiveGzoneInteractiveCommentMessage;
import jf1.w;
import com.kuaishou.live.common.core.component.topbar.topuser.LiveAudienceRankChangeMessage;
import jf1.h;
import android.view.ViewGroup;
import g81.a;
import k81.h;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.comments.LiveCommentDynamicBackgroundView;
import android.content.Context;
import r81.c;
import com.kuaishou.live.common.core.component.comments.b$b;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kuaishou.live.common.core.component.comments.b$c;

public class b implements k	// class@00105f
{
    public final Map a;
    public final g b;
    public final LiveCommentBackgroundParser c;
    public b$c d;
    public b$a e;

    public void b(g p0,b$a p1){
       super();
       this.a = new HashMap();
       this.b = p0;
       this.c = new LiveCommentBackgroundParser();
       this.e = p1;
       p1 = null;
       if (PatchProxy.applyVoidOneRefs(this, p1, b.class, "1")) {
       }else {
          this.c(LikeMessage.class, new a0()).c(CommentMessage.class, new l0()).c(LiveFellowRedPacketGrabPacketMessage.class, new o()).c(LiveFellowRedPackSendPacketMessage.class, new n()).c(LiveGzoneTagMessage.class, new x()).c(SystemNoticeMessage.class, new b0()).c(GrabRedPacketMessage.class, new t()).c(SendRedPacketMessage.class, new j0()).c(LiveShareMessage.class, new k0()).c(RichTextMessageOld.class, new i0(p1)).c(EnterRoomMessage.class, new j()).c(LiveAudienceMerchantSendCSSuccessMessage.class, new g()).c(GiftMessage.class, new s(this.e)).c(LiveGiftToAudienceMessage.class, new s(this.e)).c(LiveGiftMergedMessage.class, new s(this.e)).c(LiveGiftToAudienceMergedMessage.class, new s(this.e)).c(FollowAnchorMessage.class, new p(p1)).c(LiveGzoneCommonMessage.class, new v(p1)).c(VoiceCommentMessage.class, new a(p1)).c(PurchaseInfoMessage.class, new d0(p1)).c@004624(LiveKtvOrderMusicMessage.class@ffffff, new z@0099cd(p1)).c@004624(LiveChatWithGuestApplyMessage.class@ffffff, new i@00998d()).c@004624(LiveFansGroupJoinMessage.class@ffffff, new k@00999b(p1)).c@004624(LiveAdConversionTaskMessage.class@ffffff, new b@009970(p1)).c@004624(LiveFansTopHelpBuyMessage.class@ffffff, new m@0099a2(p1)).c@004624(LiveGzoneInteractiveCommentMessage.class@ffffff, new w@0099c1()).c@004624(LiveAudienceRankChangeMessage.class@ffffff, new h@009985());
       }
       return;
    }
    public h a(ViewGroup p0,a p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "4");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       LiveCommentDynamicBackgroundView liveCommentD = new LiveCommentDynamicBackgroundView(p0.getContext());
       liveCommentD.b(this.b.d());
       return new b$b(this, liveCommentD);
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Lists.c(this.a.keySet());
    }
    public b c(Class p0,d p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(p0, p1);
       return this;
    }
    public b d(b$c p0){
       this.d = p0;
       return this;
    }
}
