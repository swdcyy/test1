package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$g;
import in1.a;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter;
import android.view.ViewGroup;
import android.app.Activity;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import android.view.View;
import mrd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailLivePlayerCardViewController;
import androidx.lifecycle.LiveData;
import hn1.c;
import z0.a;
import androidx.lifecycle.Transformations;
import brd.t;
import brd.y;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailPhotoPlayerCardViewController;
import hn1.d;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$g$a;
import erd.g;
import crd.b;
import java.lang.Boolean;
import hn1.z$a;
import hn1.z$b;
import hn1.z$c;

public final class LiveHotSpotDetailCoreMediaAdapter$g extends ViewControllerAdapter$a implements a	// class@00137e
{
    public final a f;
    public final PublishSubject g;
    public final PublishSubject h;
    public final LiveHotSpotDetailCoreMediaAdapter i;

    public void LiveHotSpotDetailCoreMediaAdapter$g(LiveHotSpotDetailCoreMediaAdapter p0,ViewGroup p1,Activity p2,int p3,PublishSubject p4){
       LiveHotSpotDetailLivePlayerCardViewController liveHotSpotD;
       LiveData liveData;
       LiveHotSpotDetailLivePlayerCardViewController liveHotSpotD1;
       a.p(p1, "itemView");
       a.p(p2, "activity");
       a.p(p4, "cardEventSubject");
       this.i = p0;
       super(p1, p0.N0(), p2);
       this.h = p4;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<L¡­eHotSpotDetailPlayInfo>\(\)");
       this.f = uoa;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Li¡­otSpotDetailVideoEvent>\(\)");
       this.g = publishSubje;
       LiveHotSpotDetailCoreMediaAdapter$g og = LiveHotSpotDetailCoreMediaAdapter$g.class;
       if (PatchProxy.isSupport(og)) {
          liveHotSpotD = PatchProxy.applyOneRefs(Integer.valueOf(p3), this, og, "4");
          if (liveHotSpotD != PatchProxyResult.class) {
          }else if(p3 == MediaType.LIVE.getType()){
             liveData = Transformations.map(this.b(), new c());
             a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
             liveHotSpotD1 = new LiveHotSpotDetailLivePlayerCardViewController(liveData, uoa, publishSubje, p4);
          }else if(p3 == MediaType.PHOTO.getType()){
             liveData = Transformations.map(this.b(), new d());
             a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
             liveHotSpotD1 = new LiveHotSpotDetailPhotoPlayerCardViewController(liveData, uoa, publishSubje, p4);
          }else {
             liveHotSpotD = null;
          }
          liveHotSpotD = liveHotSpotD1;
       }else {
          goto label_0049 ;
       }
       if (liveHotSpotD != null) {
          this.E2(p1, liveHotSpotD);
       }
       publishSubje.subscribe(new LiveHotSpotDetailCoreMediaAdapter$g$a(this));
       return;
    }
    public void mute(boolean p0){
       LiveHotSpotDetailCoreMediaAdapter$g og = LiveHotSpotDetailCoreMediaAdapter$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "3")) {
          return;
       }
       this.f.onNext(new z$a(p0));
       return;
    }
    public void startPlay(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailCoreMediaAdapter$g.class, "1")) {
          return;
       }
       this.f.onNext(z$b.a);
       return;
    }
    public void stopPlay(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailCoreMediaAdapter$g.class, "2")) {
          return;
       }
       this.f.onNext(z$c.a);
       return;
    }
}
