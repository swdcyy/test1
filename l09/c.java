package l09.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.c;
import io.reactivex.subjects.PublishSubject;
import mxb.o;

public final class c extends PresenterV2	// class@002c62
{
    public QPhoto p;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          a.S("mPhoto");
       }
       if (!c.c(tp.mEntity)) {
          return;
       }else {
          o.c = PublishSubject.g();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       o.c = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       return;
    }
}
