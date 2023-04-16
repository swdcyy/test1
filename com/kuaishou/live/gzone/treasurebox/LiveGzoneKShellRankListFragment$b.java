package com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment$b;
import y8c.g;
import com.kuaishou.live.gzone.treasurebox.LiveGzoneKShellRankListFragment;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kuaishou.live.gzone.treasurebox.presenter.b;
import ml8.c;
import g9c.a;
import com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankUserInfo;
import r53.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import m53.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class LiveGzoneKShellRankListFragment$b extends g	// class@001c4c
{
    public final LiveGzoneKShellRankListFragment w;

    public void LiveGzoneKShellRankListFragment$b(LiveGzoneKShellRankListFragment p0){
       this.w = p0;
       super();
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public ArrayList a1(int p0,f p1){
       return this.w.H;
    }
    public f h1(ViewGroup p0,int p1){
       LiveGzoneKShellRankListFragment$b uob = LiveGzoneKShellRankListFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0bce), new b());
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneKShellRankListFragment$b.class, "1")) {
          return;
       }
       super.k1(p0);
       LiveGzoneKShellRankUserInfo liveGzoneKSh = this.N0(p0.getAdapterPosition());
       if (liveGzoneKSh != null && liveGzoneKSh.mIsShowed == null) {
          liveGzoneKSh.mIsShowed = true;
          ClientContent$LiveStreamPackage liveStreamPa = this.w.F.a.a();
          if (!PatchProxy.applyVoidTwoRefs(liveGzoneKSh, liveStreamPa, null, n.class, "32")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "MAOLIANG_RANK_PANEL_AUTHOR_ITEM";
             uElementPack.params = n.a(liveGzoneKSh);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.u0(6, uElementPack, uContentPack);
          }
       }
       return;
    }
}
