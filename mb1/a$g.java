package mb1.a$g;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$CommentFeed;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import qrd.l1;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LikeFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$EnterRoomFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsApplyInfoFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$BroadcastGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DisplayGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDisplayGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DrawingGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ToAudienceDrawingGiftFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoiceCommentFeed;
import com.kuaishou.livestream.message.nano.LiveChatMessageProto$LiveChatUserApplyInfoFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GrabRedPackFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$ShareFeed;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import java.util.Iterator;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$UserInfoSegment;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$FollowAuthorFeed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SystemNoticeFeed;
import lf3.f;

public final class a$g implements g	// class@003145
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       int len;
       int i1;
       l1 a;
       object oobject;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          LiveStreamMessages$SCFeedPush commentFeeds = p0.commentFeeds;
          int i = 0;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.likeFeeds;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.enterRoomFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.giftFeeds;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.micSeatsApplyInfoFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.toAudienceGiftFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                oobject = commentFeeds[i1];
                this.b.a(oobject.fromUser);
                this.b.a(oobject.toUser);
             }
             a = l1.a;
          }
          commentFeeds = p0.broadcastGiftFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                oobject = commentFeeds[i1];
                this.b.a(oobject.fromUser);
                this.b.a(oobject.toUser);
             }
             a = l1.a;
          }
          commentFeeds = p0.displayGiftFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.toAudienceDisplayGiftFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                oobject = commentFeeds[i1];
                this.b.a(oobject.fromUser);
                this.b.a(oobject.toUser);
             }
             a = l1.a;
          }
          commentFeeds = p0.drawingGiftFeeds;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.toAudienceDrawingGiftFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                oobject = commentFeeds[i1];
                this.b.a(oobject.fromUser);
                this.b.a(oobject.toUser);
             }
             a = l1.a;
          }
          commentFeeds = p0.voiceCommentFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.liveChatUserApplyInfoFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.grabRedPackFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                oobject = commentFeeds[i1];
                this.b.a(oobject.user);
                this.b.a(oobject.fromUser);
             }
             a = l1.a;
          }
          commentFeeds = p0.shareFeeds;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].user);
             }
             a = l1.a;
          }
          commentFeeds = p0.richTextFeeds;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             i1 = 0;
             while (i1 < len) {
                LiveStreamRichTextFeed$RichTextFeed segments = commentFeeds[i1].segments;
                a.o(segments, "richTextFeed.segments");
                ArrayList uArrayList = new ArrayList();
                int len1 = segments.length;
                int i2 = 0;
                String str = "it";
                while (i2 < len1) {
                   object oobject1 = segments[i2];
                   a.o(oobject1, str);
                   int i3 = 1;
                   if (oobject1.getContentCase() != i3) {
                      i3 = 0;
                   }
                   if (i3) {
                      uArrayList.add(oobject1);
                   }
                   i2 = i2 + 1;
                }
                Iterator iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   LiveStreamRichTextFeed$RichTextSegment richTextSegm = iterator.next();
                   a.o(richTextSegm, str);
                   this.b.a(richTextSegm.getUserInfo().user);
                }
                i1 = i1 + 1;
             }
             a = l1.a;
          }
          commentFeeds = p0.followAuthorFeed;
          if (commentFeeds != null) {
             len = commentFeeds.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(commentFeeds[i1].fans);
             }
             a = l1.a;
          }
          LiveStreamMessages$SCFeedPush systemNotice = p0.systemNoticeFeeds;
          if (systemNotice != null) {
             int len2 = systemNotice.length;
             for (; i < len2; i = i + 1) {
                this.b.a(systemNotice[i].user);
             }
             l1 a1 = l1.a;
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
