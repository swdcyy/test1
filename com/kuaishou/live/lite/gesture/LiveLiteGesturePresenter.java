package com.kuaishou.live.lite.gesture.LiveLiteGesturePresenter;
import b93.d;
import android.content.Context;
import com.kuaishou.live.lite.gesture.LiveLiteGestureServiceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jb3.b;
import vb3.i$a;
import vb3.i;
import d93.a;
import d93.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;

public class LiveLiteGesturePresenter extends d	// class@00097a
{
    public i v;
    public final LiveLiteGestureServiceImpl w;

    public void LiveLiteGesturePresenter(Context p0){
       super();
       this.w = new LiveLiteGestureServiceImpl(p0);
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGesturePresenter.class, "3")) {
          return;
       }
       super.F8();
       LiveLiteGesturePresenter tw = this.w;
       Objects.requireNonNull(tw);
       this.v.setTouchEventObserver(new b(tw));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGesturePresenter.class, "4")) {
          return;
       }
       this.v.setTouchEventObserver(null);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGesturePresenter.class, "2")) {
          return;
       }
       this.v = p0.a(i.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGesturePresenter.class, "1")) {
          return;
       }
       p0.d(LiveLiteGestureService.class, this.w);
       return;
    }
}
