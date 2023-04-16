package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.controller.TheaterPlayerController;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zw2.a;
import java.lang.Enum;
import java.util.Iterator;
import java.lang.Iterable;
import msd.l;
import java.lang.Boolean;
import java.util.Objects;
import yw2.o;
import msd.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import e17.i;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import android.graphics.Point;
import zw2.b;
import ekd.k1;

public final class TheaterPlayerController$a implements Runnable	// class@0019d3
{
    public final TheaterPlayerController b;
    public final TheaterPlayer$Event c;

    public void TheaterPlayerController$a(TheaterPlayerController p0,TheaterPlayer$Event p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Iterator iterator;
       o a;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, TheaterPlayerController$a.class, str)) {
          return;
       }
       int i = a.a[this.c.ordinal()];
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      iterator = this.b.f.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().invoke(Boolean.FALSE);
                      }
                      return;
                   }
                }else {
                   iterator = this.b.f.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().invoke(Boolean.TRUE);
                   }
                   return;
                }
             }else {
                TheaterPlayerController h = this.b.h;
                Objects.requireNonNull(h);
                o oo = o.class;
                if (!PatchProxy.applyVoid(objArray, h, oo, str)) {
                   if (h.d.invoke().booleanValue()) {
                      if (!PatchProxy.applyVoid(objArray, h, oo, "3")) {
                         b.c0(LiveVoicePartyLogTag.THEATER, "tryRetryPlayTheater", "retryCount: ", Integer.valueOf(h.a));
                         a = h.a;
                         if (a >= 5) {
                            i.a(R.style.arg_RES_7f110668, 0x7f102e6a);
                         }else {
                            h.a = a + i1;
                            h.c.invoke();
                         }
                      }
                   }else {
                      h.b = i1;
                   }
                }
             }
          }else {
             Point videoSize = this.b.l().getVideoSize();
             TheaterPlayerController$a tb = this.b;
             Point x = videoSize.x;
             videoSize = videoSize.y;
             Objects.requireNonNull(tb);
             TheaterPlayerController theaterPlaye = TheaterPlayerController.class;
             if (!PatchProxy.isSupport(theaterPlaye) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(x), Integer.valueOf(videoSize), tb, theaterPlaye, "17")) {
                k1.o(new b(tb, x, videoSize));
             }
          }
       }else {
          this.b.h.a = 0;
       }
       iterator = this.b.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke(this.c);
       }
       return;
    }
}
