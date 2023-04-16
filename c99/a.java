package c99.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import c99.a$a;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public final class a extends PresenterV2	// class@0004fd
{
    public PhotoDetailParam p;
    public f q;
    public PublishSubject r;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       a tr = this.r;
       if (tr == null) {
          a.S("mActivityFinishEvent");
       }
       this.X7(tr.subscribe(new a$a(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       f obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.p = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.q = obj;
       Object obj1 = this.r8("PHOTO_DETAIL_ACTIVITY_FINISH_EVENT");
       a.o(obj1, "inject\(AccessIds.PHOTO_D¡­IL_ACTIVITY_FINISH_EVENT\)");
       this.r = obj1;
       return;
    }
}
