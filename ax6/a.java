package ax6.a;
import ok.o;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.groot.slide.filter.a$a;
import java.lang.Enum;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kwai.library.groot.slide.filter.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.postwork.PostStatus;

public final class a implements o	// class@00039b
{
    public final boolean b;
    public final SlideMediaType c;

    public void a(boolean p0,SlideMediaType p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       boolean b1;
       a tb = this.b;
       a tc = this.c;
       boolean b = true;
       if (p0 != null && (p0.getUser() != null && (!TextUtils.x(p0.getPhotoId()) && (!p0.isVideoType() && (p0.isImageType() || (p0.isLiveStream() && (!p0.isLiveStream() || tb != null))))))) {
          switch (a$a.a[tc.ordinal()]){
              case 1:
                if (p0.isLiveStream() && !r1.l1(p0.mEntity)) {
                }
                break;
              case 2:
                if (p0.isLiveStream() || (p0.getPostWorkInfoId() < 0 || (p0.getFeedStatus() != PostStatus.UPLOAD_COMPLETE && p0.getFeedStatus() != null))) {
                label_00b3 :
                   b = false;
                }
                break;
              case 3:
                if (!p0.isVideoType()) {
                }
                break;
              case 4:
                Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else if(p0.isVideoType() && !p0.isAd()){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (!b1) {
                }
                break;
              case 5:
                if (p0.isLiveStream() && !p0.isAd()) {
                }
                break;
              case 6:
                if (p0.isLiveStream() && r1.l1(p0.mEntity)) {
                   goto label_00b3 ;
                }
                break;
              default:
                goto label_00b3 ;
          }
       label_00b4 :
          return b;
       }else {
          goto label_00b3 ;
       }
    }
}
