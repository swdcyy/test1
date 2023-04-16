package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$g;
import wx4.a$b;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import wx4.a$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wx4.a;
import kotlin.jvm.internal.a;
import com.kuaishou.tk.api.view.player.a;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.util.Objects;
import android.content.Context;
import android.widget.FrameLayout;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.framework.player.core.b$b;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import wx4.f;
import com.kwai.video.cache.AwesomeCacheCallback;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.video.player.IMediaPlayer;
import com.kuaishou.tk.api.view.player.logger.KsLogTKBusinessTag;
import java.util.List;
import wx4.e;
import xx4.c;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import xx4.b;
import nsd.s0;
import java.lang.Exception;
import java.util.Collection;
import java.util.Arrays;

public final class TKOlympicPlayerView$g implements a$b	// class@000fa1
{
    public final TKOlympicPlayerView a;

    public void TKOlympicPlayerView$g(TKOlympicPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(a$c p0,int p1,int p2){
       TKOlympicPlayerView a;
       int this;
       if (PatchProxy.isSupport(TKOlympicPlayerView$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKOlympicPlayerView$g.class, "1")) {
          return;
       }
       TKOlympicPlayerView$g og = null;
       a renderView = (p0 != null)? p0.getRenderView(): og;
       if (a.g(renderView, this.a.B) ^ 1) {
          a.a("TKOlympicPlayer", "onSurfaceCreated: unmatched render callback\n");
          return;
       }else {
          TKOlympicPlayerView$g ta = this.a;
          ta.z = p0;
          if (ta.A != null) {
             a.m(p0);
             p0.a(this.a.A);
             a = this.a.A;
             if (a != null) {
                IKwaiMediaPlayer iKwaiMediaPl = a.getIKwaiMediaPlayer();
                if (iKwaiMediaPl != null) {
                   iKwaiMediaPl.stepFrame();
                }
             }
          }else {
             try{
                Objects.requireNonNull(ta);
                if (PatchProxy.applyVoid(og, ta, TKOlympicPlayerView.class, "15") || (!a.g(ta.f, "") && ta.z != null)) {
                   ta.d();
                   this = 0;
                   Context context = ta.getContext();
                   a.o(context, "context");
                   context = context.getApplicationContext();
                   a.o(context, "context.applicationContext");
                   ta.J = context;
                   b uob = ta.a();
                   ta.A = uob;
                   if (uob != null) {
                      uob.addOnPreparedListener(ta.W0);
                   }
                   TKOlympicPlayerView a2 = ta.A;
                   if (a2 != null) {
                      a2.addOnVideoSizeChangedListener(ta.V0);
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.addOnCompletionListener(ta.X0);
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.addOnErrorListener(ta.c1);
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.addOnInfoListener(ta.Z0);
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.addOnSeekCompleteListener(ta.a1);
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.addOnBufferingUpdateListener(ta.d1);
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.w(ta.getMPlayerStateChangedListener());
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      IKwaiMediaPlayer iKwaiMediaPl1 = a2.getIKwaiMediaPlayer();
                      if (iKwaiMediaPl1 != null) {
                         iKwaiMediaPl1.setOnABLoopEndOfCounterListener(ta.getMAbLoopLnr());
                      }
                   }
                   ta.H = this;
                   a2 = ta.z;
                   if (a2 != null) {
                      a2.a(ta.A);
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.addAwesomeCallBack(new f(ta));
                   }
                   a2 = ta.A;
                   if (a2 != null) {
                      a2.prepareAsync();
                   }
                   ta.c = this;
                }
             }catch(java.io.IOException e5){
                a.c("TKOlympicPlayer", "Unable to open content: "+ta.f+10, e5);
                ta.c = -1;
                a = ta.c1;
                TKOlympicPlayerView a1 = ta.A;
                if (a1 != null) {
                   og = a1.getIKwaiMediaPlayer();
                }
                a.onError(og, 1, this);
             }catch(java.lang.IllegalArgumentException e5){
                a.c("TKOlympicPlayer", "Unable to open content: "+ta.f+10, e5);
                ta.c = -1;
                a = ta.c1;
                a1 = ta.A;
                if (a1 != null) {
                   og = a1.getIKwaiMediaPlayer();
                }
                a.onError(og, 1, this);
             }
          }
       }
    }
    public void b(a$c p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(TKOlympicPlayerView$g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, TKOlympicPlayerView$g.class, "2")) {
          return;
       }
       a renderView = (p0 != null)? p0.getRenderView(): null;
       if (a.g(renderView, this.a.B) ^ 0x01) {
          a.a("TKOlympicPlayer", "onSurfaceChanged: unmatched render callback\n");
          return;
       }else {
          TKOlympicPlayerView$g ta = this.a;
          ta.E = p2;
          ta.F = p3;
          return;
       }
    }
    public void c(a$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$g.class, "3")) {
          return;
       }
       a renderView = (p0 != null)? p0.getRenderView(): null;
       String str = "TKOlympicPlayer";
       if (a.g(renderView, this.a.B) ^ 0x01) {
          a.a(str, "onSurfaceDestroyed: unmatched render callback\n");
          return;
       }else if(this.a.A != null){
          String str1 = "onSurfaceDestroyed: calling setSurface null\n";
          if (!PatchProxy.applyVoidTwoRefs(str, str1, null, a.class, "2")) {
             KsLogTKBusinessTag pLAYER = KsLogTKBusinessTag.PLAYER;
             pLAYER.appendTag(str);
             KsLogTKBusinessTag ksLogTKBusin = pLAYER;
             e uoe = new e(str1);
             if (!PatchProxy.applyVoidTwoRefs(ksLogTKBusin, uoe, null, c.class, "4")) {
                a.p(ksLogTKBusin, "tag");
                a.p(uoe, "msg");
                ArrayList uArrayList = new ArrayList(u.Y(ksLogTKBusin, 10));
                Iterator iterator = ksLogTKBusin.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(iterator.next().getTagName());
                }
                List list = s0.g(uArrayList);
                try{
                   str = uoe.invoke();
                }catch(java.lang.Exception e1){
                   str = "onWarning exception : "+e1.getMessage();
                }
                list.add(0, "tachikoma");
                String[] stringArray = new String[0];
                Object[] objArray = list.toArray(stringArray);
                Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                c.a(str, Arrays.copyOf(objArray, objArray.length));
             }
          }
       }
       TKOlympicPlayerView$g ta = this.a;
       ta.z = null;
       ta.d();
       return;
    }
}
