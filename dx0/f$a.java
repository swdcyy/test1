package dx0.f$a;
import ds5.c;
import dx0.f;
import java.lang.Object;
import java.lang.String;
import ds5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.model.StreamType;
import m91.b;
import t02.a0;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import android.widget.ImageView;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.framework.model.user.User;
import p91.m;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import dx0.e;
import java.lang.Runnable;
import e93.f;
import java.lang.Throwable;

public class f$a implements c	// class@002054
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public String N5(){
       return b.a(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       b.c(this, p0, p1);
    }
    public void ff(QLivePlayConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       int i = 0;
       if (p0.mStreamType == StreamType.AUDIO.toInt()) {
          f$a tb = this.b;
          tb.O = true;
          if (!tb.R.N().r2(AudienceBizRelation.VOICE_PARTY) && !this.b.R.N().r2(AudienceBizRelation.CHAT_CENTER_STATUS_VIEW)) {
             this.b.K.setVisibility(i);
             this.b.a9();
          }
          tb = this.b;
          tb.R.E.addLiveEventListener(tb.U);
          tb = this.b;
          tb.K.U(tb.R.Z2.I().mAvatars);
          f.i("removeLivePlayConfigListener", new e(this), this.b);
          this.b.b9();
       }else {
          p0.O = i;
       }
       return;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public boolean xi(){
       return b.e(this);
    }
}
