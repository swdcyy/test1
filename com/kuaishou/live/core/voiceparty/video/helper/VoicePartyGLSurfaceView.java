package com.kuaishou.live.core.voiceparty.video.helper.VoicePartyGLSurfaceView;
import com.kuaishou.live.core.basic.widget.LivePlayGLSurfaceView;
import android.content.Context;
import lnc.a1;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.opengl.GLSurfaceView;
import android.graphics.Path$Direction;
import android.view.SurfaceView;

public class VoicePartyGLSurfaceView extends LivePlayGLSurfaceView	// class@001adc
{
    public final int d;
    public final Path e;
    public final RectF f;

    public void VoicePartyGLSurfaceView(Context p0){
       super(p0);
       this.d = a1.e(6.00f);
       this.e = new Path();
       this.f = new RectF();
    }
    public void VoicePartyGLSurfaceView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = a1.e(6.00f);
       this.e = new Path();
       this.f = new RectF();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyGLSurfaceView.class, "1")) {
          return;
       }
       this.e.reset();
       this.e.moveTo(0, 0);
       this.f.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       VoicePartyGLSurfaceView td = this.d;
       float f = (float)td;
       this.e.addRoundRect(this.f, f, (float)td, Path$Direction.CW);
       p0.clipPath(this.e);
       super.dispatchDraw(p0);
       p0.restoreToCount(p0.getSaveCount());
       return;
    }
}
