package gsa.c0;
import k26.f;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import tjc.c;
import tra.b;
import q87.c;
import ya5.c;
import k26.b;
import k26.a;

public final class c0 extends f	// class@002be2
{
    public Activity b;

    public void c0(Activity p0){
       a.p(p0, "activity");
       super(p0);
       this.b = p0;
    }
    public boolean c(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, this, c0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.a(-1608526086).S()) {
          objArray = new Object[0];
          b.C().w("HomePageLocalAlbumSnackBarHandler", "splashing", objArray);
          return 0;
       }else if(c.a){
          objArray = new Object[0];
          b.C().w("HomePageLocalAlbumSnackBarHandler", "PublishOrLocalBubbleShowing", objArray);
          return 0;
       }else {
          return a.a(this);
       }
    }
    public int e(){
       return 0x7f0a12be;
    }
}
