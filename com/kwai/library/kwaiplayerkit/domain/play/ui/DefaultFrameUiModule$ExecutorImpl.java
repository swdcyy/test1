package com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$ExecutorImpl;
import nx6.a;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import ay6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$ExecutorImpl$viewPosArray$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$ExecutorImpl$infoProvider$2;
import android.graphics.Bitmap;
import sc6.b;
import android.widget.ImageView;
import android.widget.FrameLayout;
import vx6.d;
import com.kwai.library.kwaiplayerkit.domain.play.ui.DefaultFrameUiModule$b;
import android.graphics.Rect;

public final class DefaultFrameUiModule$ExecutorImpl implements a	// class@000855
{
    public final p a;
    public final p b;
    public final PlayerKitContentFrame c;
    public final d d;

    public void DefaultFrameUiModule$ExecutorImpl(PlayerKitContentFrame p0,d p1){
       a.p(p0, "contentFrame");
       a.p(p1, "trace");
       super();
       this.c = p0;
       this.d = p1;
       this.a = s.c(DefaultFrameUiModule$ExecutorImpl$viewPosArray$2.INSTANCE);
       this.b = s.c(new DefaultFrameUiModule$ExecutorImpl$infoProvider$2(this));
    }
    public Bitmap a(){
       this.d.a("tryGetFrameBitmap");
       this.d.b();
       return this.c.C();
    }
    public void b(boolean p0){
       this.c.setEnableUseCoverWhenPause(p0);
    }
    public void c(b p0){
       this.c.b(p0);
    }
    public int d(){
       return this.c.getSurfaceType();
    }
    public void e(){
       this.c.u();
    }
    public void f(b p0){
       this.c.z(p0);
    }
    public void g(){
       this.c.A();
    }
    public ImageView getCover(){
       ImageView cover = this.c.getCover();
       a.o(cover, "contentFrame.cover");
       return cover;
    }
    public void h(Bitmap p0){
       a.p(p0, "bitmap");
       this.c.I(p0);
    }
    public void i(boolean p0){
       this.c.setDisableFrame(p0);
    }
    public void j(){
       this.c.G();
    }
    public int[] k(){
       this.c.getLocationOnScreen(this.s());
       this.s()[2] = this.c.getWidth();
       this.s()[3] = this.c.getHeight();
       return this.s();
    }
    public void l(){
       this.d.a("updateFrameAndTryShowCover");
       this.c.J();
       this.d.b();
    }
    public void m(boolean p0){
       this.c.setEnableCover(p0);
    }
    public void n(boolean p0){
       this.c.setEnableReuseSurfaceBeforeRender(p0);
    }
    public void o(boolean p0){
       this.c.setEnableAlphaFrame(p0);
    }
    public Bitmap p(){
       this.d.a("tryGetVisibleFrameShot");
       this.d.b();
       return this.c.E();
    }
    public d q(){
       return this.b.getValue();
    }
    public Bitmap r(Rect p0){
       this.d.a("tryGetVisibleFrameShotWithRect");
       this.d.b();
       return this.c.F(p0);
    }
    public final int[] s(){
       return this.a.getValue();
    }
}
