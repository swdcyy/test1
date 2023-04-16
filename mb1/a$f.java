package mb1.a$f;
import lf3.g;
import mb1.a;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import java.util.Iterator;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$UserInfoSegment;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.livestream.message.nano.LiveRedPackSendInfo;
import com.kuaishou.livestream.message.nano.LiveRedPackGrabInfo;
import com.kuaishou.livestream.message.nano.WealthHighGradeEnterRoom;
import com.kuaishou.livestream.message.nano.WealthHighGradeBulletComment;
import lf3.f;

public final class a$f implements g	// class@003144
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       int len;
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
       }else {
          SCActionSignal richTextFeed = p0.richTextFeed;
          int i = 0;
          if (richTextFeed != null) {
             len = richTextFeed.length;
             i1 = 0;
             while (i1 < len) {
                LiveStreamRichTextFeed$RichTextFeed segments = richTextFeed[i1].segments;
                a.o(segments, "richTextFeed.segments");
                ArrayList uArrayList = new ArrayList();
                int len1 = segments.length;
                int i2 = 0;
                String str = "it";
                while (i2 < len1) {
                   object oobject = segments[i2];
                   a.o(oobject, str);
                   int i3 = 1;
                   if (oobject.getContentCase() != i3) {
                      i3 = 0;
                   }
                   if (i3) {
                      uArrayList.add(oobject);
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
          }
          richTextFeed = p0.redPackSendInfo;
          if (richTextFeed != null) {
             len = richTextFeed.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(richTextFeed[i1].sendUserInfo);
             }
          }
          richTextFeed = p0.redPackGrabInfo;
          if (richTextFeed != null) {
             len = richTextFeed.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject1 = richTextFeed[i1];
                this.b.a(oobject1.sendUserInfo);
                this.b.a(oobject1.grabUserInfo);
             }
          }
          richTextFeed = p0.wealthHighGradeEnterRoom;
          if (richTextFeed != null) {
             len = richTextFeed.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                this.b.a(richTextFeed[i1].user);
             }
          }
          SCActionSignal highGradeBul = p0.highGradeBulletComment;
          if (highGradeBul != null) {
             int len2 = highGradeBul.length;
             for (; i < len2; i = i + 1) {
                this.b.a(highGradeBul[i].user);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
