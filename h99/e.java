package h99.e;
import com.yxcorp.gifshow.widget.m;
import h99.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import whc.k0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import az6.a;
import java.util.Objects;
import im8.f;
import p1a.a;
import p1a.a$a;
import brd.t;
import yic.p0;
import cjd.e;
import erd.o;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.OperationModelFactory;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.KwaiOperator$Style;
import com.yxcorp.gifshow.share.OperationFactoryAdapter;
import com.yxcorp.gifshow.share.im.a;
import rhc.t;
import rhc.v;
import mhc.v1;
import mhc.o0;
import zic.a;
import h99.e$a;
import k2b.e0;
import xxb.b;
import com.yxcorp.gifshow.entity.TagDetailItem;
import rhc.q;

public class e extends m	// class@002571
{
    public final GifshowActivity c;
    public final f d;

    public void e(f p0,GifshowActivity p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       OperationModel operationMod;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       k0 ok0 = new k0(this.d.c.getPhoto(), this.d.c.getDetailCommonParam().getPreInfo(), this.c);
       f c = this.d.c;
       a mSource = c.mSource;
       PhotoDetailParam mPhoto = c.mPhoto;
       QPhoto mEntity = mPhoto.mEntity;
       Object[] objArray = null;
       if (!mPhoto.isMine()) {
          e td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoid(objArray, td, f.class, "3")) {
             td.d.get().a(a$a.a(837, "more"));
          }
          operationMod = OperationModelFactory.b(mEntity, mSource, p0.b(mPhoto).map(new e()));
          KwaiOperator kwaiOperator = new KwaiOperator(this.c, operationMod, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, a.T0(), new t(), new v(ok0));
          mSource.m(a.a(operationMod.i()));
          mSource.q(new e$a(this, this.d.f, mEntity));
       }else {
          operationMod = OperationModelFactory.f(mEntity, mSource, objArray);
          KwaiOperator kwaiOperator1 = new KwaiOperator(this.c, operationMod, KwaiOperator$Style.ITEM_LIST_LIGHT, new q(ok0));
          kwaiOperator1.m(a.a(operationMod.i()));
          kwaiOperator1.p();
       }
       return;
    }
}
