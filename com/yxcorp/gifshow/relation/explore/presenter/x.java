package com.yxcorp.gifshow.relation.explore.presenter.x;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.y;
import java.lang.Object;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import ib5.q;
import nac.a;
import y8c.d;
import java.util.List;
import g9c.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import v5a.a;
import v5a.a$b;
import com.yxcorp.gifshow.entity.QPhoto;
import hac.n1;
import msd.l;
import com.kwai.components.playerkit.QPhotoPlayerKitDataSource;
import rx6.b;
import com.kwai.library.kwaiplayerkit.framework.KwaiPlayerKitView;
import px6.b;
import mx6.a;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.wayne.player.main.IPlayerListener;
import java.lang.Exception;
import com.kwai.video.wayne.player.main.IMediaPlayerApi;

public final class x implements g	// class@001869
{
    public final y b;

    public void x(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       x tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y oy = y.class;
       if (tb.p != null) {
          if (p0.intValue() == 101) {
             y obj = PatchProxy.apply(null, tb, oy, "7");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(!tb.s.Vg().d() || (!tb.s.Vg().c() || q.p0(tb.s.getActivity()).s0())){
                obj = tb.s;
                if (!obj instanceof a || obj.V()) {
                   b = true;
                }
             }
             b = false;
             if (b) {
             label_006b :
                if (!tb.y.get()) {
                   if (tb.t.Q0().contains(tb.v)) {
                      try{
                         p0 = tb.q;
                         if (p0 != null && p0.isPaused()) {
                            tb.q.play();
                         }else if(!PatchProxy.applyVoid(null, tb, oy, "11") && tb.w != null){
                            tb.r = true;
                            p0 = tb.w;
                            a uoa = PatchProxy.applyOneRefs(p0, tb, oy, "12");
                            if (uoa != patchProxyRe) {
                            }else {
                               a$b uob = new a$b(p0);
                               uob.b(new n1(p0));
                               uoa = uob.a();
                            }
                            p0 = QPhotoPlayerKitDataSource.g(uoa);
                            tb.p.g(p0, p0.j().a());
                            p0 = tb.p.getPlayerKitContext().e(a.class);
                            if (p0 != null) {
                               p0 = p0.getPlayer();
                               tb.q = p0;
                               if (p0 != null) {
                                  p0.addOnPreparedListener(tb.z);
                               }
                            }
                         }
                      }catch(java.lang.Exception e8){
                         e8.printStackTrace();
                      }
                   }
                }else if(p0.intValue() == 201){
                   if (!PatchProxy.applyVoid(null, tb, oy, "9")) {
                      p0 = tb.q;
                      if (p0 != null && p0.isPlaying()) {
                         tb.q.pause();
                      }
                   }
                }else if(p0.intValue() == 301){
                   tb.P8();
                }
             }
          }
          if (p0.intValue() == 102) {
             goto label_006b ;
          }else {
             goto label_00f4 ;
          }
       }
    }
}
