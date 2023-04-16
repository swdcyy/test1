package a47.f;
import n3d.a;
import com.kwai.live.gzone.bridge.function.e;
import com.kwai.live.gzone.bridge.function.LiveGzoneThirdPlatformParams;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import android.os.Bundle;

public class f implements a	// class@00004e
{
    public final LiveGzoneThirdPlatformParams b;
    public final g c;
    public final e d;

    public void f(e p0,LiveGzoneThirdPlatformParams p1,g p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, f.class, "1")) {
          return;
       }
       if (QCurrentUser.me().isLogined()) {
          this.d.a(this.b, this.c);
       }else {
          this.c.a(-1, "not login", null);
       }
       return;
    }
}
