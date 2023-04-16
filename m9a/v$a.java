package m9a.v$a;
import n3d.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.Window;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.transition.Transition;
import ekd.j0;
import moc.b;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import p5a.b;
import java.lang.IllegalStateException;

public final class v$a implements a	// class@002f97
{
    public final PhotoDetailLogger b;
    public final GifshowActivity c;
    public final QPhoto d;
    public final a e;

    public void v$a(PhotoDetailLogger p0,GifshowActivity p1,QPhoto p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       Transition transition1;
       v$a tb1;
       if (PatchProxy.isSupport(v$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, v$a.class, "1")) {
          return;
       }
       if (p0 == 1025) {
          v$a tb = this.b;
          if (tb != null) {
             tb.enterAtlasCoverMode();
          }
          Window window = this.c.getWindow();
          a.o(window, "activity.window");
          Transition transition = null;
          window.setExitTransition(transition);
          this.c.s(this);
          window = -1;
          if (p1 == window && p2 != null) {
             p1 = j0.b(p2, "KEY_VIDEO_STATE_EVENT_ID", window);
             String str = j0.f(p2, "KEY_SHARE_PHOTO_ID");
             if (p1 != window) {
                transition = b.b(p1);
             }
             transition1 = transition;
             transition = str;
          }else {
             transition1 = transition;
          }
          Log.g("NavigatePhotoDetailUtil", "photoId = "+this.d.getPhotoId()+" prePagePhotoId = "+transition);
          if (b.f(this.d)) {
             if (a.g(this.d.getPhotoId(), transition)) {
                try{
                   this.e.x();
                   Log.g("NavigatePhotoDetailUtil", "sharePlayerBackReget "+this.d.getCaption());
                }catch(java.lang.IllegalStateException e9){
                   e9.printStackTrace();
                }
             }else {
                Log.g("NavigatePhotoDetailUtil", "release player "+this.d.getCaption());
                this.e.release();
             }
          }
       }
    label_00df :
       return;
    }
}
