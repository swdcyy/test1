package com.kuaishou.live.lite.like.j;
import msd.a;
import com.kuaishou.live.lite.like.LiveLiteLikePresenter;
import com.kuaishou.live.lite.like.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;
import java.lang.Boolean;
import xb3.j;
import androidx.lifecycle.LifecycleOwner;
import td3.o;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import com.kuaishou.live.lite.like.b;
import wb3.l;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import wb3.c;
import wb3.d;
import ok.o;
import qrd.l1;

public final class j implements a	// class@0009f8
{
    public final LiveLiteLikePresenter b;
    public final c c;

    public void j(LiveLiteLikePresenter p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(){
       j tb = this.b;
       j tc = this.c;
       Objects.requireNonNull(tb);
       LiveLiteLikePresenter liveLiteLike = LiveLiteLikePresenter.class;
       if (PatchProxy.applyVoid(null, tb, liveLiteLike, "8")) {
       }else if(tb.L.i().booleanValue()){
          j oj = new j(tb, tb.w);
          tb.I = oj;
          tb.D.c(LayoutViewType.LikeEffect, oj);
       }
       if (!PatchProxy.applyVoidOneRefs(tc, tb, liveLiteLike, "7") && !tb.L.i().booleanValue()) {
          b uob = new b(tc, tb.A, tb.w, tb.N, tb.O, new l(tb));
          tb.H = v8;
          tb.D.c(LayoutViewType.FullscreenLikeEffect, v8);
       }
       return l1.a;
    }
}
