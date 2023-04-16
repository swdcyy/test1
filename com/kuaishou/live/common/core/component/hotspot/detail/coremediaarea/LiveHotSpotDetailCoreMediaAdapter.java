package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import hn1.h0;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$a;
import erd.r;
import brd.t;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$b;
import erd.o;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$c;
import erd.g;
import crd.b;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$d;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$e;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$f;
import lnc.i3;
import ln1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import java.util.List;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType$a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$g;

public final class LiveHotSpotDetailCoreMediaAdapter extends ViewControllerAdapter	// class@00137f
{
    public final PublishSubject j;
    public final h0 k;
    public final boolean l;
    public final k m;

    public void LiveHotSpotDetailCoreMediaAdapter(LifecycleOwner p0,Activity p1,h0 p2,boolean p3,k p4){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "playManager");
       a.p(p4, "detailMainVCDelegate");
       super(p0, p1);
       this.k = p2;
       this.l = p3;
       this.m = p4;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Li¡­HotSpotDetailCardEvent>\(\)");
       this.j = publishSubje;
       publishSubje.filter(LiveHotSpotDetailCoreMediaAdapter$a.b).map(LiveHotSpotDetailCoreMediaAdapter$b.b).distinct().subscribe(new LiveHotSpotDetailCoreMediaAdapter$c(this));
       publishSubje.filter(LiveHotSpotDetailCoreMediaAdapter$d.b).map(LiveHotSpotDetailCoreMediaAdapter$e.b).subscribe(new LiveHotSpotDetailCoreMediaAdapter$f(this, p1));
    }
    public final void P0(i3 p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHotSpotDetailCoreMediaAdapter.class, "1")) {
          return;
       }
       p0.d("related_author_id", p1.getAuthorId());
       String str = (p1 instanceof LiveHotSpotLiveViewData)? "LIVE": "VIDEO";
       p0.d("content_type", str);
       p0.d("related_content_id", p1.getRelatedId());
       p0.d("server_exp_tag", p1.getServerExpTag());
       return;
    }
    public int f0(int p0){
       LiveHotSpotDetailCoreMediaAdapter liveHotSpotD = LiveHotSpotDetailCoreMediaAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveHotSpotD, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return MediaType.Companion.a(this.L0().get(p0)).getType();
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveHotSpotDetailCoreMediaAdapter liveHotSpotD = LiveHotSpotDetailCoreMediaAdapter.class;
       if (PatchProxy.isSupport(liveHotSpotD)) {
          LiveHotSpotDetailCoreMediaAdapter$g og = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveHotSpotD, "2");
          if (og != PatchProxyResult.class) {
          label_003e :
             return og;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       LiveHotSpotDetailCoreMediaAdapter$g og1 = new LiveHotSpotDetailCoreMediaAdapter$g(this, uFrameLayout, this.K0(), p1, this.j);
       goto label_003e ;
    }
}
