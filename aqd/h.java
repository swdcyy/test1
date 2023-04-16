package aqd.h;
import aqd.c;
import android.content.Context;
import java.lang.Object;
import android.renderscript.RenderScript;
import android.renderscript.Element;
import android.renderscript.ScriptIntrinsicBlur;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Type;

public final class h implements c	// class@000222
{
    public final RenderScript a;
    public final ScriptIntrinsicBlur b;
    public Allocation c;
    public int d;
    public int e;

    public void h(Context p0){
       super();
       this.d = -1;
       this.e = -1;
       RenderScript renderScript = RenderScript.create(p0);
       this.a = renderScript;
       this.b = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
    }
    public boolean a(){
       return true;
    }
    public Bitmap$Config b(){
       return Bitmap$Config.ARGB_8888;
    }
    public final Bitmap c(Bitmap p0,float p1){
       Allocation uAllocation = Allocation.createFromBitmap(this.a, p0);
       h oh = (p0.getHeight() == this.e && p0.getWidth() == this.d)? 1: null;
       if (!oh) {
          oh = this.c;
          if (oh != null) {
             oh.destroy();
          }
          this.c = Allocation.createTyped(this.a, uAllocation.getType());
          this.d = p0.getWidth();
          this.e = p0.getHeight();
       }
       this.b.setRadius(p1);
       this.b.setInput(uAllocation);
       this.b.forEach(this.c);
       this.c.copyTo(p0);
       uAllocation.destroy();
       return p0;
    }
    public final void destroy(){
       this.b.destroy();
       this.a.destroy();
       h tc = this.c;
       if (tc != null) {
          tc.destroy();
       }
       return;
    }
}
