package com.kuaishou.live.lite.anchorinfo.recommendtag.b;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService;
import e93.b;
import xp5.i;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.lite.anchorinfo.recommendtag.f;
import u83.b;
import java.lang.Class;
import ok.x;
import va1.g0;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ec3.f;
import com.kuaishou.live.lite.anchorinfo.recommendtag.a;
import msd.a;
import a1.b;
import android.content.Context;
import android.widget.FrameLayout;
import u83.a;
import android.view.ViewGroup;
import a1.b$e;

public class b extends ViewController	// class@001e6f
{
    public final User j;
    public final LiveStreamModel k;
    public final LiveStreamFeed l;
    public final b m;
    public final i n;
    public final ViewModelProvider o;
    public final LiveLiteAnchorInfoAreaService p;
    public final LiveLiteGestureService q;
    public final LiveLiteScatterLoadManager r;

    public void b(User p0,LiveStreamModel p1,LiveStreamFeed p2,LiveLiteAnchorInfoAreaService p3,b p4,i p5,LiveLiteGestureService p6,LiveLiteScatterLoadManager p7){
       super();
       this.o = new ViewModelProvider(this.getViewModelStore(), g0.a(f.class, new b(this)));
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p4;
       this.n = p5;
       this.p = p3;
       this.q = p6;
       this.r = p7;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       LiveLiteLogTag lITE_ANCHOR_ = LiveLiteLogTag.LITE_ANCHOR_INFO;
       b.Z(lITE_ANCHOR_, "recoreason-vc-create");
       if (this.k.mCoverReasonTag == null) {
          b.Z(lITE_ANCHOR_, "recoreason is null");
          return;
       }else if(f.h()){
          this.r.ll("init_anchor_recommend_info", new a(this));
       }else {
          this.V2();
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO, "recoreason-vc-destroy");
       return;
    }
    public final void V2(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       new b(this.D2()).a(R.layout.arg_RES_7f0d0c6f, new FrameLayout(this.D2()), new a(this));
       return;
    }
}
