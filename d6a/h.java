package d6a.h;
import d6a.i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.framework.model.user.User;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d6a.i$a;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import java.lang.Enum;
import com.yxcorp.gifshow.postwork.PostStatus;

public final class h	// class@001e9c
{

    public static boolean a(i p0,QPhoto p1,boolean p2){
       boolean b = true;
       if (!r1.i3(p1.mEntity) && (r1.a3(p1.mEntity) || r1.C2(p1.mEntity))) {
          return b;
       }
       if (p1.getEntity() != null && (p1.getUser() != null && (!TextUtils.x(p1.getPhotoId()) && (!p1.isVideoType() && (p1.isImageType() || (p1.isLiveStream() && (!p1.isLiveStream() || p2))))))) {
          switch (i$a.a[p0.G1().ordinal()]){
              case 1:
                if (p1.isLiveStream()) {
                   if (r1.l1(p1.mEntity)) {
                      return false;
                   }else {
                      return b;
                   }
                }
                break;
              case 2:
                if (!p1.isLiveStream()) {
                   if (p1.getPostWorkInfoId() < 0 || (p1.getFeedStatus() != PostStatus.UPLOAD_COMPLETE && p1.getFeedStatus() != null)) {
                      b = false;
                   }
                   return b;
                }
                break;
              case 3:
                if (p1.isVideoType()) {
                   return b;
                }
                break;
              case 4:
                int i = (p1.isVideoType() && !p1.isAd())? 1: 0;
                if (i) {
                   return b;
                }
                break;
              case 5:
                if (!p1.isLiveStream() || p1.isAd()) {
                   return b;
                }
                break;
              case 6:
                if (p1.isLiveStream() && r1.l1(p1.mEntity)) {
                   return false;
                }else {
                   return b;
                }
                break;
              default:
          }
       }
    label_00bf :
       return false;
    }
}
