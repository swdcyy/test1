package e7a.q;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.e;
import java.lang.Object;
import h46.q;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import h46.t;
import java.util.Iterator;
import h46.s;
import id5.v;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Number;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.StringBuilder;
import lnc.a1;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import de5.a;
import p5a.e;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;

public final class q implements g	// class@002093
{
    public final e b;

    public void q(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       String obj1;
       int i1;
       q b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, uoe, "3")) {
       }else if(obj.d() != b.p){
          Iterator iterator = t.b().iterator();
          do {
             if (iterator.hasNext()) {
             }else if(!b.p.isVideoType()){
                b.P8(obj);
                break ;
             }else {
                String str = "SourcePhotoDownload";
                int i = 0;
                if (b.r == null) {
                   Object[] objArray = new Object[i];
                   v.C().w(str, "还没开始播，不需要停止播放器", objArray);
                   b.P8(obj);
                   break ;
                }else if(QCurrentUser.me() != null && !QCurrentUser.me().isLogined()){
                   Object[] objArray1 = new Object[i];
                   v.C().w(str, "还没登录，先引导登录，不需要停止播放器", objArray1);
                   obj1 = PatchProxy.applyOneRefs(obj, b, uoe, "5");
                   if (obj1 != patchProxyRe) {
                      i1 = obj1.intValue();
                   }else {
                      int i2 = obj.a();
                      if (i2 != 1) {
                         if (i2 != 2) {
                            i1 = (i2 != 6)? 71: 180;
                         }else {
                            i1 = 64;
                         }
                      }else {
                         i1 = 58;
                      }
                   }
                   e s = b.s;
                   d.a(-1712118428).ne(s, s.getUrl(), "source_photo_"+i1, i1, a1.p(R.string.arg_RES_7f10305c), b.p.mEntity, null, b.q, null).K(i).h();
                   break ;
                }else if(a1.o(e.t) - 3000 < 0){
                   e.t = a1.k();
                   if (b.r != null) {
                      Object[] objArray2 = new Object[i];
                      v.C().w(str, "视频类型，停止播放器，等异步stop真正停住后，再启动下载", objArray2);
                      b.r.y();
                      obj1 = PatchProxy.apply(null, b, uoe, "7");
                      if (obj1 != patchProxyRe) {
                      }else {
                         e r = b.r;
                         obj1 = (r != null && (r.getPlayer() == null || b.r.getPlayer().getIKwaiMediaPlayer() == null))? "": b.r.getPlayer().getIKwaiMediaPlayer().getVodAdaptiveUrl();
                      }
                      obj.e(obj1);
                      b.P8(obj);
                      break ;
                   }
                }
             }
          } while (iterator.next().a());
       }
       return;
    }
}
