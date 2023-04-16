package jkd.d;
import android.view.TextureView$SurfaceTextureListener;
import jkd.a;
import android.graphics.SurfaceTexture;
import java.util.Iterator;
import java.util.Set;
import java.lang.Object;

public class d extends a implements TextureView$SurfaceTextureListener	// class@001703
{

    public void d(){
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSurfaceTextureAvailable(p0, p1, p2);
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Iterator iterator = this.b.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          i = i | iterator.next().onSurfaceTextureDestroyed(p0);
       }
       return i;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSurfaceTextureSizeChanged(p0, p1, p2);
       }
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onSurfaceTextureUpdated(p0);
       }
       return;
    }
}
