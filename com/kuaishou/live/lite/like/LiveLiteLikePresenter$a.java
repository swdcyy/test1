package com.kuaishou.live.lite.like.LiveLiteLikePresenter$a;
import wb3.c;
import com.kuaishou.live.lite.like.LiveLiteLikePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xb3.j;

public class LiveLiteLikePresenter$a implements c	// class@0009e7
{
    public final LiveLiteLikePresenter a;

    public void LiveLiteLikePresenter$a(LiveLiteLikePresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLikePresenter$a.class, "1")) {
          return;
       }
       LiveLiteLikePresenter i = this.a.I;
       if (i != null) {
          i.n = i.n + 1;
       }
       return;
    }
}
