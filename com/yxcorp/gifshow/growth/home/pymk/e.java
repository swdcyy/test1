package com.yxcorp.gifshow.growth.home.pymk.e;
import erd.g;
import com.yxcorp.gifshow.growth.home.pymk.f;
import java.lang.Object;
import java.lang.Integer;
import y8c.d;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import v5a.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.t3;
import v5a.a$b;
import vna.s;
import msd.l;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import rx6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import mx6.a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import java.lang.Exception;

public final class e implements g	// class@0013a0
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f f;
       e tb = this.b;
       if (tb.q != null) {
          if (p0.intValue() >= 0 && tb.G.get() == p0.intValue()) {
             p0 = tb.N;
             if (p0 == null || !p0.isPlaying()) {
                try{
                   p0 = f.class;
                   if (!PatchProxy.applyVoid(null, tb, p0, "10") && tb.F != null) {
                      boolean b = true;
                      tb.O = b;
                      f = tb.F;
                      p0 = PatchProxy.applyOneRefs(f, tb, p0, "11");
                      if (p0 != PatchProxyResult.class) {
                      }else {
                         a$b uob = new a$b(f);
                         uob.b(new s(f, t3.a(tb.M, f)));
                         p0 = uob.a();
                      }
                      p0 = QPhotoPlayerKitDataSource.g(p0);
                      tb.q.g(p0, p0.j().a());
                      p0 = tb.q.getPlayerKitContext().e(a.class);
                      if (p0 != null) {
                         p0 = p0.getPlayer();
                         tb.N = p0;
                         if (p0 != null) {
                            p0.addOnPreparedListener(tb.P);
                         }
                      }
                   }
                }catch(java.lang.Exception e5){
                   e5.printStackTrace();
                }
             }
          }else {
             tb.P8();
          }
       }
    }
}
