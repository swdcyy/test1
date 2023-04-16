package com.kuaishou.live.playback.play.progresspreview.b;
import k51.c;
import java.util.HashSet;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.playback.play.progresspreview.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import wjc.l;
import ki3.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.b;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.playback.play.progresspreview.LivePlaybackProgressPreviewView;
import si3.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import og3.d$a;
import og3.d;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.android.schedulers.a;
import si3.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import fi3.c;
import fi3.b;
import cjd.e;
import erd.o;
import si3.c;
import com.kuaishou.live.playback.play.progresspreview.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.app.Activity;
import mrd.c;

public class b extends c	// class@000d36
{
    public c A;
    public final d$a B;
    public final long p;
    public e0 q;
    public QPhoto r;
    public d s;
    public c t;
    public LivePlaybackProgressPreviewView u;
    public l v;
    public boolean w;
    public boolean x;
    public int y;
    public final HashSet z;

    public void b(){
       super();
       this.p = 50;
       this.z = new HashSet();
       this.A = PublishSubject.g();
       this.B = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.v = d.a(0x46ffacbc);
       this.u.setTotalTimeDisplayText(TextUtils.K((b.e(this.q.c) * 1000)));
       this.t.subscribe(new a(this), Functions.d());
       this.P8();
       this.s.b(this.B);
       this.X7(this.A.throttleLast(50, TimeUnit.MILLISECONDS).observeOn(a.c()).subscribe(new b(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.v.P5(this.R8());
       this.z.clear();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       String str = this.R8();
       String str1 = i.t(this.q.c.mEntity);
       if (!this.v.qa(str)) {
          b.d0(LiveLogTag.LIVE_PLAYBACK_PREVIEW, "fetchSpriteImages", "photoId", str, "productId", str1);
          this.X7(b.b().b(str1).map(new e()).subscribe(new c(this, str), a.b));
       }else {
          b.d0(LiveLogTag.LIVE_PLAYBACK_PREVIEW, "fetchSpriteImages, has ready", "photoId", str, "productId", str1);
       }
       return;
    }
    public final String R8(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.c.getPhotoId();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.u = this.getActivity().findViewById(0x7f0a2316);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.r8("PLAYBACK_GLOBAL_PARAM");
       this.r = this.r8("PLAYBACK_CURRENT_PHOTO");
       this.s = this.r8("PLAYBACK_CONTROL_SERVICE");
       this.t = this.r8("PLAYBACK_ORIENTATION_CHANGED_SUBJECT");
       return;
    }
}
