package g41.c$d;
import android.view.TextureView$SurfaceTextureListener;
import g41.c;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import w99.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;
import u99.d;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;

public class c$d implements TextureView$SurfaceTextureListener	// class@00241d
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(c$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c$d.class, "1")) {
          return;
       }
       c$d tb = this.b;
       d.h(tb.a, "onSurfaceTextureAvailable", d.b(tb.b.mEntity, tb.e, tb.c));
       this.b.e.g0(true);
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, c$d.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       c$d tb = this.b;
       d.h(tb.a, "onSurfaceTextureDestroyed", d.b(tb.b.mEntity, tb.e, tb.c));
       if (this.b.c.isResumed()) {
          this.b.f();
       }
       this.b.e.g0(false);
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
    }
}
