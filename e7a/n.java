package e7a.n;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.presenter.c;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import wkd.b;
import com.kwai.framework.network.monitor.NetworkTypeMonitor;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Number;
import m9a.w;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonElement;
import k2b.u1;

public final class n implements Runnable	// class@002090
{
    public final c b;
    public final String c;
    public final String d;

    public void n(c p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       int i;
       n tb = this.b;
       n tc = this.c;
       n td = this.d;
       Objects.requireNonNull(tb);
       NetworkTypeMonitor networkTypeM = b.a(0x34606e83);
       if (networkTypeM != null) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("network_stat_id", networkTypeM.a());
          jsonObject.c0("video_play_session_id", tb.t);
          jsonObject.a0("network_type", Integer.valueOf(networkTypeM.c));
          jsonObject.a0("current_network_type", Integer.valueOf(w.a()));
          jsonObject.c0("photo_id", tb.q.getPhotoId());
          c q = tb.q;
          Object obj = PatchProxy.applyOneRefs(q, tb, c.class, "5");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(q.isLongPhotos()){
             i = 4;
          }else if(q.isAtlasPhotos()){
             i = 3;
          }else if(q.isImageType()){
             i = 2;
          }else if(q.isMoodType()){
             i = 11;
          }else {
             i = 1;
          }
          jsonObject.a0("media_type", Integer.valueOf(i));
          jsonObject.c0("reason", tc);
          if (!TextUtils.x(td)) {
             jsonObject.c0("switch_fail_error_code", td);
          }
          u1.R("VIDEO_PLAY_STALLED_LOG", jsonObject.toString(), 14);
       }
       return;
    }
}
