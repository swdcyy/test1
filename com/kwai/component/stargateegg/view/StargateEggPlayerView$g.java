package com.kwai.component.stargateegg.view.StargateEggPlayerView$g;
import wx4.a$b;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import wx4.a$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import android.view.TextureView;
import wx4.a;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import ug5.b;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.component.stargateegg.log.StargateEggKLog;
import q87.c;

public final class StargateEggPlayerView$g implements a$b	// class@000b57
{
    public final StargateEggPlayerView a;

    public void StargateEggPlayerView$g(StargateEggPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(a$c p0,int p1,int p2){
       StargateEggPlayerView a;
       if (PatchProxy.isSupport(StargateEggPlayerView$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, StargateEggPlayerView$g.class, "1")) {
          return;
       }
       StargateEggPlayerView b = this.a.B;
       Objects.requireNonNull(b, "null cannot be cast to non-null type com.kuaishou.tk.api.view.player.TextureRenderView");
       b.setVisibility(4);
       a renderView = (p0 != null)? p0.getRenderView(): null;
       if (a.g(renderView, this.a.B) ^ 0x01) {
          b.a("TKOlympicPlayer", this.a.P+" onSurfaceCreated: unmatched "+"render callback\n");
          return;
       }else {
          StargateEggPlayerView$g ta = this.a;
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
             ta.d();
          }
          return;
       }
    }
    public void b(a$c p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(StargateEggPlayerView$g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, StargateEggPlayerView$g.class, "2")) {
          return;
       }
       a renderView = (p0 != null)? p0.getRenderView(): null;
       if (a.g(renderView, this.a.B) ^ 0x01) {
          b.a("TKOlympicPlayer", this.a.P+" onSurfaceChanged: unmatched render"+" "+"callback\n");
          return;
       }else {
          StargateEggPlayerView$g ta = this.a;
          ta.E = p2;
          ta.F = p3;
          return;
       }
    }
    public void c(a$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView$g.class, "3")) {
          return;
       }
       StargateEggPlayerView$g og = null;
       a renderView = (p0 != null)? p0.getRenderView(): og;
       if (a.g(renderView, this.a.B) ^ 0x01) {
          b.a("TKOlympicPlayer", this.a.P+" onSurfaceDestroyed: unmatched "+"render "+"callback\n");
          return;
       }else if(this.a.A != null){
          String str = this.a.P+" onSurfaceDestroyed: calling "+"setSurface "+"null\n";
          if (!PatchProxy.applyVoidTwoRefs("TKOlympicPlayer", str, og, b.class, "2")) {
             Object[] objArray = new Object[0];
             StargateEggKLog.C().A("TKOlympicPlayer", str, objArray);
          }
       }
       StargateEggPlayerView$g ta = this.a;
       ta.z = og;
       ta.f();
       return;
    }
}
