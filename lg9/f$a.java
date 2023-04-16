package lg9.f$a;
import r8c.g;
import lg9.f;
import qm6.b$a;
import nm6.d;
import android.content.Intent;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pi9.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import tl8.d;
import java.lang.Long;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.camera.record.CameraActivity;

public class f$a extends g	// class@002de4
{
    public final b$a a;
    public final d b;
    public final f c;

    public void f$a(f p0,b$a p1,d p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Intent p0,BaseFeed p1,File p2,Bundle p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f$a.class, "1")) {
          return;
       }
       p0.putExtras(c.a(this.a, null, true));
       SerializableHook.putExtra(p0, "result_duration", Long.getLong(p1.a(PhotoMeta.class).mDisplayTime));
       if (this.b.d() != null) {
          p0.putExtras(this.b.d());
       }
       p0.putExtras(p3);
       return;
    }
    public SimpleMagicFace c(BaseFeed p0){
       p0 = PatchProxy.applyOneRefs(p0, this, f$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (this.b.d() != null && SerializableHook.getSerializable(this.b.d(), "magic_face") != null) {
          return SerializableHook.getSerializable(this.b.d(), "magic_face");
       }
       return null;
    }
    public Music d(BaseFeed p0){
       p0 = PatchProxy.applyOneRefs(p0, this, f$a.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (this.b.d() == null || SerializableHook.getSerializable(this.b.d(), "music") == null) {
          return null;
       }
       this.b.d().remove("music");
       return SerializableHook.getSerializable(this.b.d(), "music");
    }
    public int e(){
       return 8;
    }
    public Class f(){
       return CameraActivity.class;
    }
    public boolean g(){
       return true;
    }
}
