package dh9.a$c;
import com.yxcorp.gifshow.camera.record.frame.c$e;
import dh9.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.frame.a;
import com.kwai.gifshow.post.api.core.model.CameraFramePageType;
import java.lang.Boolean;

public final class a$c implements c$e	// class@001f36
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public View n1(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.q.k2();
    }
    public boolean o1(){
       return false;
    }
    public int p1(){
       return 1;
    }
    public boolean q1(){
       return true;
    }
    public void r1(){
    }
    public boolean s1(){
       return false;
    }
    public int t1(){
       return 0;
    }
    public CameraFramePageType u1(){
       return CameraFramePageType.STATE_SHOOT;
    }
    public boolean v1(){
       return false;
    }
    public boolean w1(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.w1();
    }
    public void x1(int p0){
    }
    public void y1(int p0,long p1){
    }
    public boolean z1(){
       return false;
    }
}
