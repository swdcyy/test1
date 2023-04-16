package a7a.h$c;
import jd5.i;
import a7a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import io.reactivex.subjects.PublishSubject;
import tp7.a;
import com.yxcorp.gifshow.entity.QPhoto;
import e7a.a;
import nsd.u;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uo5.a;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class h$c implements i	// class@000057
{
    public final h a;

    public void h$c(h p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       if (PatchProxy.isSupport2(h$c.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, h$c.class, "1")) {
          return;
       }
       if (!h.Y8(this.a).H()) {
          a uoa = new a(p0, this.a.R8().getAtlasListSize(), false, 0, 12, null);
          h.X8(this.a).onNext(v10);
       }
       h$c ta = this.a;
       int i = 1;
       ta.Z8((h.Y8(ta).z() ^ i));
       Activity activity = this.a.getActivity();
       if (p0) {
          i = false;
       }
       a.c(activity, i, 23);
       PatchProxy.onMethodExit(h$c.class, "1");
       return;
    }
    public void b(int p0,int p1){
       if (PatchProxy.isSupport2(h$c.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p0), Integer.valueOf(p1), this, h$c.class, "2")) {
          return;
       }
       h.X8(this.a).onNext(new a(p0, this.a.R8().getAtlasListSize(), true, p1));
       h$c ta = this.a;
       ta.Z8((h.Y8(ta).z() ^ true));
       PatchProxy.onMethodExit(h$c.class, "2");
       return;
    }
    public void c(){
       if (PatchProxy.applyVoidWithListener(null, this, h$c.class, "3")) {
          return;
       }
       h y = this.a.y;
       if (y == null) {
          a.S("mAtlasProgressBarStopPublisher");
       }
       y.onNext(Boolean.TRUE);
       PatchProxy.onMethodExit(h$c.class, "3");
       return;
    }
}
