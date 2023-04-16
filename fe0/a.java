package fe0.a;
import yt5.e;
import java.lang.Object;
import tkd.b;
import tkd.d;
import yt5.g;
import vt5.a;
import au5.b;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Set;
import com.kwai.framework.model.user.User;
import androidx.fragment.app.Fragment;

public class a implements e	// class@002300
{
    public final e a;
    public final e b;

    public void a(){
       super();
       this.a = d.a(-626371061).R();
       this.b = b.a().p1();
    }
    public void a(Activity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "6")) {
          return;
       }
       this.a.a(p0, p1, p2);
       return;
    }
    public void b(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.b(p0);
       return;
    }
    public void c(String p0,BaseFeed p1,GifshowActivity p2,Set p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "7")) {
          return;
       }
       this.a.c(p0, p1, p2, p3);
       return;
    }
    public void d(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.a.d(p0);
       return;
    }
    public void e(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.a.e(p0);
       this.b.e(p0);
       return;
    }
    public void f(Activity p0,BaseFeed p1,Set p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       this.a.f(p0, p1, p2);
       return;
    }
    public void g(Activity p0,Fragment p1,BaseFeed p2,Set p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "4")) {
          return;
       }
       this.a.g(p0, p1, p2, p3);
       return;
    }
}
