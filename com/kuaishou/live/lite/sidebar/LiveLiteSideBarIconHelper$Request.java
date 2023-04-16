package com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request$successListener$1;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarIconHelper$Request$failureListener$1;
import msd.l;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveLiteSideBarIconHelper$Request	// class@000b33
{
    public a a;
    public l b;
    public final int c;
    public final KwaiImageView d;
    public final KwaiImageView e;
    public final CDNUrl[] f;

    public void LiveLiteSideBarIconHelper$Request(int p0,KwaiImageView p1,KwaiImageView p2,CDNUrl[] p3){
       a.p(p1, "successIconView");
       a.p(p2, "defaultIconView");
       a.p(p3, "urls");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = LiveLiteSideBarIconHelper$Request$successListener$1.INSTANCE;
       this.b = LiveLiteSideBarIconHelper$Request$failureListener$1.INSTANCE;
    }
    public final KwaiImageView a(){
       return this.e;
    }
    public final l b(){
       return this.b;
    }
    public final int c(){
       return this.c;
    }
    public final KwaiImageView d(){
       return this.d;
    }
    public final CDNUrl[] e(){
       return this.f;
    }
    public final void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarIconHelper$Request.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
}
