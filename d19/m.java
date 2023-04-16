package d19.m;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.l;
import java.lang.Object;
import h46.q;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import a46.b;
import lnc.x6;
import lnc.y6;
import e17.i;
import yx.j0;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.robust.PatchProxyResult;
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

public final class m implements g	// class@002033
{
    public final l b;

    public void m(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Object[] objArray;
       int i1;
       m b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(obj, b, ol, "3")) {
       }else if(obj.d() != b.p){
          b uob = y6.r(b.class);
          int i = 1;
          if (uob != null && uob.s20() == i) {
             i.a(R.style.arg_RES_7f11066a, 0x7f100f6d);
          }else if(!b.p.isVideoType()){
             b.P8(obj);
          }else if(b.s == null){
             objArray = new Object[0];
             j0.f("SourcePhotoDownload", "还没开始播，不需要停止播放器", objArray);
             b.P8(obj);
          }else if(QCurrentUser.me() != null && !QCurrentUser.me().isLogined()){
             Object[] objArray1 = new Object[0];
             j0.f("SourcePhotoDownload", "还没登录，先引导登录，不需要停止播放器", objArray1);
             Object obj1 = PatchProxy.applyOneRefs(obj, b, ol, "6");
             if (obj1 != PatchProxyResult.class) {
                i1 = obj1.intValue();
             }else {
                int i2 = obj.a();
                if (i2 != i) {
                   if (i2 != 2) {
                      i1 = (i2 != 6)? 71: 180;
                   }else {
                      i1 = 64;
                   }
                }else {
                   i1 = 58;
                }
             }
             l t = b.t;
             d.a(-1712118428).ne(t, t.getUrl(), "source_photo_"+i1, i1, a1.p(R.string.arg_RES_7f10305c), b.p.mEntity, null, b.r, null).K(0).h();
          }else if(a1.o(l.z) - 3000 < 0){
             l.z = a1.k();
             if (b.s != null) {
                objArray = new Object[0];
                j0.f("SourcePhotoDownload", "视频类型，停止播放器，等异步stop真正停住后，再启动下载", objArray);
                b.s.y();
                b.P8(obj);
             }
          }
       }
       return;
    }
}
