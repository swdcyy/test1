package d19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.ad.detail.presenter.player.f;
import com.yxcorp.gifshow.ad.detail.presenter.player.j;
import com.yxcorp.gifshow.ad.detail.presenter.player.i;
import d19.d;
import com.yxcorp.gifshow.ad.detail.presenter.player.c;
import com.yxcorp.gifshow.ad.detail.presenter.player.e;
import com.yxcorp.gifshow.ad.detail.presenter.player.l;
import com.yxcorp.gifshow.ad.detail.presenter.player.g;
import g59.j;
import e19.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e19.a;
import e19.c;
import f19.b;
import xf6.f;
import fe5.d;
import jc6.p;

public class a extends PresenterV2	// class@002026
{

    public void a(PhotoDetailParam p0){
       super();
       this.U7(new f());
       this.U7(new j());
       this.U7(new i());
       this.U7(new d());
       this.U7(new c());
       this.U7(new e());
       this.U7(new l());
       this.U7(new g());
       if (!j.a()) {
          this.U7(new g());
       }
       this.U7(new d());
       if (!PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          this.U7(new a());
          this.U7(new c());
          this.U7(new b(p0));
       }
       if (f.k()) {
          this.U7(new d(R.id.photo_detail_debug_info));
       }
       if (f.g()) {
          this.U7(new p(R.id.view_stub_hodor_debug_info));
       }
       return;
    }
}
