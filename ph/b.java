package ph.b;
import com.kwai.feature.api.feed.thanos.ThanosPlugin;
import java.lang.Object;
import ko5.d;
import ao5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import wq6.h;
import androidx.fragment.app.FragmentActivity;
import gsa.e0;
import java.lang.Boolean;
import android.view.View;
import com.kwai.slide.play.detail.utils.c;
import com.kwai.feature.api.feed.thanos.ThanosPlugin$ThanosResId;
import android.app.Activity;
import java.lang.Number;
import uh5.e;
import com.kwai.kcube.TabIdentifier;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import on5.b;

public class b implements ThanosPlugin	// class@002929
{

    public void b(){
       super();
    }
    public c HR(d p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new IllegalStateException("仅占位使用");
    }
    public boolean Og(){
       return false;
    }
    public boolean PL(){
       return false;
    }
    public e0 Rn(h p0,FragmentActivity p1,boolean p2){
       if (PatchProxy.isSupport(b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, b.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new IllegalStateException("不应该走到这");
    }
    public void U4(View p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, b.class, "2")) {
          return;
       }
       c.d(p0, p1, p2);
       return;
    }
    public int Xi(ThanosPlugin$ThanosResId p0,Activity p1){
       return 0;
    }
    public int gM(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return e.c();
    }
    public boolean ho(){
       return false;
    }
    public boolean in(TabIdentifier p0){
       return false;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean jj(){
       return false;
    }
    public boolean ns(PhotoDetailParam p0){
       return false;
    }
    public TabIdentifier p7(){
       return b.b;
    }
}
