package k99.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k99.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.lang.Number;

public final class f extends PresenterV2	// class@002b78
{
    public QPhoto p;
    public PhotoDetailParam q;
    public NormalDetailBizParam r;
    public Set s;
    public int t;
    public final c u;

    public void f(){
       super();
       this.u = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       f ts = this.s;
       if (ts == null) {
          a.S("mDoubleClickContentListeners");
       }
       ts.add(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       f ts = this.s;
       if (ts == null) {
          a.S("mDoubleClickContentListeners");
       }
       ts.remove(this.u);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.q = obj;
       obj = this.q8(NormalDetailBizParam.class);
       a.o(obj, "inject\(NormalDetailBizParam::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_DOUBLE_CLICK_LISTENERS\)");
       this.s = obj;
       obj = this.r8("ATLAS_ADAPTER_POSITION");
       a.o(obj, "inject<Int>\(AtlasAccessIds.ATLAS_ADAPTER_POSITION\)");
       this.t = obj.intValue();
       return;
    }
}
