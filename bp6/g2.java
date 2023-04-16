package bp6.g2;
import bp6.g2$a;
import bp6.g2$b;
import ip6.a;
import com.kwai.imsdk.msg.KwaiMsg;
import com.kwai.imsdk.msg.CustomMsg;
import qo6.e;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.util.Objects;
import qo6.p;
import java.lang.Integer;
import java.util.Set;
import qo6.j;
import com.kwai.imsdk.msg.UnsupportedMsg;
import com.kwai.imsdk.msg.question.KwaiIMPickCSQuestionMessage;
import com.kwai.imsdk.msg.question.KwaiIMCSQuestionListMessage;
import com.kwai.imsdk.msg.EvaluationMsg;
import com.kwai.imsdk.msg.KwaiIMHtmlMessage;
import com.kwai.imsdk.msg.KwaiIMVoiceCallMessage;
import com.kwai.imsdk.msg.KwaiIMMultiMediaMessage;
import com.kwai.imsdk.msg.ForwardMsg;
import com.kwai.imsdk.msg.ReferenceMsg;
import com.kwai.imsdk.msg.RecalledMsg;
import com.kwai.imsdk.msg.NoticeMsg;
import com.kwai.imsdk.msg.RedPacketMsg;
import com.kwai.imsdk.msg.FormattedNoticeMsg;
import com.kwai.imsdk.msg.FileMsg;
import com.kwai.imsdk.msg.EmotionMsg;
import com.kwai.imsdk.msg.VideoMsg;
import com.kwai.imsdk.msg.AudioMsg;
import com.kwai.imsdk.msg.ImageMsg;
import com.kwai.imsdk.msg.TextMsg;
import com.kwai.imsdk.internal.UploadFileMsg;
import java.lang.String;

public class g2	// class@000521
{
    public static final e a;
    public static final j b;
    public static e c;
    public static j d;

    static {
       g2$a uoa = new g2$a();
       g2.a = uoa;
       g2$b uob = new g2$b();
       g2.b = uob;
       g2.c = uoa;
       g2.d = uob;
    }
    public static KwaiMsg a(a p0){
       NoticeMsg noticeMsg;
       if (p0 == null) {
          return null;
       }
       if (p0.getMsgType() == 2) {
          CustomMsg uCustomMsg = new CustomMsg(p0);
          if (uCustomMsg.getContentBytes() != null) {
             uCustomMsg.handleContent(uCustomMsg.getContentBytes());
          }
          if (g2.c.a(uCustomMsg)) {
             return uCustomMsg;
          }
       }
       int msgType = p0.getMsgType();
       int msgType1 = p0.getMsgType();
       Objects.requireNonNull(v.l());
       p w = v.w;
       int i = 0;
       if (w != null) {
          w = w.a;
          byte[] uobyteArray = (w != null && w.contains(Integer.valueOf(msgType1)))? 1: null;
          if (uobyteArray) {
             i = 1;
          }
       }
       msgType = (i || msgType > 999)? p0.getMsgType(): -1;
       if (msgType) {
          if (msgType != 1) {
             if (msgType != 3) {
                if (msgType != 4) {
                   if (msgType != 5) {
                      if (msgType != 6) {
                         if (msgType != 200) {
                            if (msgType != 203) {
                               switch (msgType){
                                   case 10:
                                     noticeMsg = new NoticeMsg(p0);
                                     break;
                                   case 11:
                                     noticeMsg = new RecalledMsg(p0);
                                     break;
                                   case 12:
                                     noticeMsg = new ReferenceMsg(p0);
                                     break;
                                   case 13:
                                     noticeMsg = new ForwardMsg(p0);
                                     break;
                                   case 14:
                                     noticeMsg = new KwaiIMMultiMediaMessage(p0);
                                     break;
                                   case 15:
                                     noticeMsg = new KwaiIMVoiceCallMessage(p0);
                                     break;
                                   case 16:
                                     noticeMsg = new KwaiIMHtmlMessage(p0);
                                     break;
                                   default:
                                     switch (msgType){
                                         case 501:
                                           noticeMsg = new EvaluationMsg(p0);
                                           break;
                                         case 502:
                                           noticeMsg = new KwaiIMCSQuestionListMessage(p0);
                                           break;
                                         case 503:
                                           noticeMsg = new KwaiIMPickCSQuestionMessage(p0);
                                           break;
                                         default:
                                           noticeMsg = g2.d.a(p0, msgType);
                                           if (noticeMsg == null) {
                                              noticeMsg = new UnsupportedMsg(p0);
                                           }
                                     }
                               }
                            }else {
                               noticeMsg = new RedPacketMsg(p0);
                            }
                         }else {
                            noticeMsg = new FormattedNoticeMsg(p0);
                         }
                      }else {
                         noticeMsg = new FileMsg(p0);
                      }
                   }else {
                      noticeMsg = new EmotionMsg(p0);
                   }
                }else {
                   noticeMsg = new VideoMsg(p0);
                }
             }else {
                noticeMsg = new AudioMsg(p0);
             }
          }else {
             noticeMsg = new ImageMsg(p0);
          }
       }else {
          noticeMsg = new TextMsg(p0);
       }
       if (noticeMsg.getContentBytes() != null) {
          noticeMsg.handleContent(noticeMsg.getContentBytes());
       }
       if (noticeMsg instanceof UploadFileMsg) {
          KwaiMsg kwaiMsg = noticeMsg;
          kwaiMsg.mUploadFileName = kwaiMsg.getUploadUri();
       }
       if (p0 instanceof KwaiMsg) {
          noticeMsg.setNewStatus(p0.getNewStatus());
       }
       return noticeMsg;
    }
}
