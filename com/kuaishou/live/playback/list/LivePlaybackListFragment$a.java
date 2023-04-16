package com.kuaishou.live.playback.list.LivePlaybackListFragment$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.playback.list.LivePlaybackListFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.entity.QPhoto;
import ki3.q0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import k2b.u1;
import kp.r1;
import com.yxcorp.gifshow.log.c0;

public class LivePlaybackListFragment$a extends RecyclerView$r	// class@000d22
{
    public final LivePlaybackListFragment a;

    public void LivePlaybackListFragment$a(LivePlaybackListFragment p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(LivePlaybackListFragment$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LivePlaybackListFragment$a.class, "1")) {
          return;
       }
       LivePlaybackListFragment$a ta = this.a;
       LivePlaybackListFragment h = ta.H;
       if (h != null && ta.G != null) {
          int i = h.i0();
          h = this.a.H.c();
          while (i <= h) {
             if (this.a.G.Q0().size() >= i) {
                QPhoto qPhoto = this.a.G.N0(i);
                if (qPhoto != null && !qPhoto.isShowed()) {
                   qPhoto.setShowed(true);
                   QPhoto mEntity = qPhoto.mEntity;
                   LivePlaybackListFragment j = this.a.J;
                   q0 oq0 = q0.class;
                   if (!PatchProxy.isSupport(oq0) || !PatchProxy.applyVoidTwoRefs(mEntity, Integer.valueOf(j), null, oq0, "20")) {
                      ClientContent$ContentPackage uContentPack = q0.b(mEntity);
                      ClientEvent$ElementPackage uElementPack = q0.c("VIDEO_CARD");
                      if (j == 2) {
                         ClientContent$ProfilePackage profilePacka = new ClientContent$ProfilePackage();
                         profilePacka.tab = 12;
                         uContentPack.profilePackage = profilePacka;
                      }
                      u1.u0(8, uElementPack, uContentPack);
                   }
                   r1.g5(qPhoto.mEntity, this.a.G.Q0().indexOf(qPhoto));
                   c0.q().k(qPhoto.mEntity);
                }
             }
             i++;
          }
       }
       return;
    }
}
