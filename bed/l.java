package bed.l;
import ded.f$b;
import bed.y;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import java.util.Objects;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.VideoFeed;
import kp.w1;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class l implements f$b	// class@000414
{
    public final y a;
    public final SimpleMagicFace b;
    public final Music c;
    public final String d;

    public void l(y p0,SimpleMagicFace p1,Music p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(QPhoto p0,Throwable p1){
       l ta = this.a;
       l tb = this.b;
       l tc = this.c;
       l td = this.d;
       Objects.requireNonNull(ta);
       if (p1 != null) {
          ExceptionHandler.handleException(ta.a, p1);
       }else if(p0.isVideoType() && (!p0.isPublic() || p0.isKtv())){
          p0 = new QPhoto(w1.k("", null));
       }
       ta.m(ta.a, tb, tc, td, p0);
       return;
    }
}
