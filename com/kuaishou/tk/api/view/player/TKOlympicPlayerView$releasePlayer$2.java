package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$releasePlayer$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Exception;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.kuaishou.tk.api.view.player.a;

public final class TKOlympicPlayerView$releasePlayer$2 extends Lambda implements l	// class@000fad
{
    public static final TKOlympicPlayerView$releasePlayer$2 INSTANCE;

    static {
       TKOlympicPlayerView$releasePlayer$2.INSTANCE = new TKOlympicPlayerView$releasePlayer$2();
    }
    public void TKOlympicPlayerView$releasePlayer$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$releasePlayer$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       a.c("TKOlympicPlayer", "olympic player view releasePlayer error!", p0);
       return;
    }
}
