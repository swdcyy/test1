package c19.b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.entity.QPhoto;
import c19.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nx8.g;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdMainProcess;
import com.yxcorp.gifshow.ad.AdProcess;

public final class b$a implements Runnable	// class@0004c1
{
    public final QPhoto b;
    public final b c;

    public void b$a(QPhoto p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$a.class, "1")) {
          return;
       }
       AdMainProcess uAdMainProce = g.a.a(this.c.d, new PhotoAdDataWrapper(this.b.mEntity));
       uAdMainProce.o(false);
       uAdMainProce.m();
       PatchProxy.onMethodExit(b$a.class, "1");
       return;
    }
}
