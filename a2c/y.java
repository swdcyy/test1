package a2c.y;
import im8.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import a2c.d0;
import java.util.Map;
import java.util.HashMap;

public final class y implements g	// class@000056
{
    public Fragment b;
    public ProfileBgVideoInfo c;
    public PublishSubject d;

    public void y(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.d = publishSubje;
    }
    public final void a(ProfileBgVideoInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.c = p0;
       return;
    }
    public final void b(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, y.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, y.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(y.class, new d0());
       }else {
          obj.put(y.class, null);
       }
       return obj;
    }
}
