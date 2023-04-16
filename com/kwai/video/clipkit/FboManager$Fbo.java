package com.kwai.video.clipkit.FboManager$Fbo;
import com.kwai.video.clipkit.FboManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class FboManager$Fbo	// class@001a3b
{
    public int count;
    public int framebuffer;
    public final int height;
    public int texture;
    public final FboManager this$0;
    public final int width;

    public void FboManager$Fbo(FboManager p0,int p1,int p2,int p3,int p4){
       this.this$0 = p0;
       super();
       this.width = p1;
       this.height = p2;
       this.framebuffer = p3;
       this.texture = p4;
       this.count = 0;
    }
    public synchronized boolean isLocked(){
       boolean b = (this.count != null)? true: false;
       return b;
    }
    public synchronized void lock(){
       this.count = this.count + 1;
    }
    public synchronized void lock(int p0){
       this.count = this.count + p0;
    }
    public synchronized boolean unlock(){
       FboManager$Fbo obj = PatchProxy.apply(null, this, FboManager$Fbo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.count;
       if (obj == null) {
          return false;
       }
       this.count = obj - 1;
       return 1;
    }
}
