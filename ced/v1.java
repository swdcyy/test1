package ced.v1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ced.v1$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import io.reactivex.subjects.PublishSubject;
import ixc.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.qa;
import ced.v1$b;
import ced.v1$c;
import erd.g;
import crd.b;

public final class v1 extends PresenterV2	// class@000588
{
    public TagInfo p;
    public PublishSubject q;
    public static final v1$a r;

    static {
       null.r = new v1$a(null);
    }
    public void v1(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v1.class, "2")) {
          return;
       }
       v1 tp = this.p;
       if (tp == null) {
          return;
       }
       a.m(tp);
       String str = 4;
       if (tp.mTagType != str) {
          return;
       }
       tp = this.p;
       a.m(tp);
       if (tp.mMagicFace == null) {
          return;
       }
       tp = this.q;
       a.m(tp);
       tp.onNext("interrupt");
       this.X7(qa.s(c.class, LoadPolicy.SILENT_INIT).R(new v1$b(this), new v1$c(this)));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v1.class, "1")) {
          return;
       }
       this.p = this.r8("TagInfo");
       this.q = this.r8("TAG_DETAIL_MAGIC_PRELOAD_PUBLISHER");
       return;
    }
}
