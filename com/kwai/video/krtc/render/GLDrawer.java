package com.kwai.video.krtc.render.GLDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.render.GLDrawer$GLDrawerFrame;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class GLDrawer	// class@0007dd
{
    public long nativeDrawer;
    public long nativeFbo;
    public static final String TAG = "com.kwai.video.krtc.render.GLDrawer";

    public void GLDrawer(){
       super();
       this.nativeDrawer = 0;
       this.nativeFbo = 0;
       this.nativeDrawer = this.nativeCreateDrawer();
       this.nativeFbo = 0;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, GLDrawer.class, "2")) {
          return;
       }
       GLDrawer tnativeDrawe = this.nativeDrawer;
       if (tnativeDrawe) {
          this.nativeDestroy(tnativeDrawe);
          this.nativeDrawer = 0;
       }
       return;
    }
    public boolean draw(GLDrawer$GLDrawerFrame p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GLDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.nativeDraw(this.nativeDrawer, p0);
    }
    public long getNativeDrawer(){
       return this.nativeDrawer;
    }
    public native final long nativeCreateDrawer();
    public native final void nativeDestroy(long p0);
    public native final boolean nativeDraw(long p0,GLDrawer$GLDrawerFrame p1);
}
