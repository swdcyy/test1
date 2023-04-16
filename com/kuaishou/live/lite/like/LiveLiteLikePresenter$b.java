package com.kuaishou.live.lite.like.LiveLiteLikePresenter$b;
import wb3.d;
import com.kuaishou.live.lite.like.LiveLiteLikePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.like.h;
import com.kuaishou.live.lite.like.f;
import com.kuaishou.live.lite.like.f$a;

public class LiveLiteLikePresenter$b implements d	// class@0009e8
{
    public final LiveLiteLikePresenter a;

    public void LiveLiteLikePresenter$b(LiveLiteLikePresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       f f;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteLikePresenter$b.class, "1")) {
          return;
       }
       LiveLiteLikePresenter j = this.a.J;
       if (j != null) {
          Objects.requireNonNull(j);
          if (!PatchProxy.applyVoid(objArray, j, h.class, "2")) {
             h o = j.o;
             Objects.requireNonNull(o);
             if (!PatchProxy.applyVoid(objArray, o, f.class, "3")) {
                f = o.f;
                if (f != null) {
                   f.c();
                }
             }
          }
       }
       return;
    }
}
