package j99.t;
import h3.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import de5.a;
import java.util.Set;
import java.util.ArrayList;
import android.util.SparseArray;
import com.kwai.component.photo.detail.core.atlas.a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.lang.Math;
import i2b.a;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.a;
import k99.f;
import k99.k;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.yxcorp.gifshow.entity.QPreInfo;
import k99.g;
import k99.a;
import j99.t$a;
import ekd.j;

public class t extends a	// class@0027d5
{
    public final PhotoDetailParam d;
    public final NormalDetailBizParam e;
    public final a f;
    public final v1 g;
    public List h;
    public SparseArray i;
    public Set j;

    public void t(PhotoDetailParam p0,NormalDetailBizParam p1,a p2,Set p3){
       super();
       this.h = new ArrayList();
       this.i = new SparseArray();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.j = p3;
       this.g = new a(p0.mPhoto);
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(t.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, t.class, "3")) {
          return;
       }
       p0.removeView(p2);
       PresenterV2 presenterV2 = this.i.get(p1);
       if (presenterV2 != null && (presenterV2.R1() && !presenterV2.y8())) {
          presenterV2.destroy();
          this.i.remove(p1);
       }
    label_003d :
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int atlasListSiz = this.d.mPhoto.getAtlasListSize();
       ImageMeta$AtlasCoverSize[] atlasSizes = this.d.mPhoto.getAtlasSizes();
       int i = (atlasSizes == null)? 0: atlasSizes.length;
       return Math.min(atlasListSiz, i);
    }
    public Object o(ViewGroup p0,int p1){
       View obj;
       t ot = t.class;
       if (PatchProxy.isSupport(ot)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ot, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.i(p0, R.layout.arg_RES_7f0d02a6);
       p0.addView(obj);
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new a());
       presenterV2.U7(new f());
       presenterV2.U7(new k());
       presenterV2.U7(new b(this.d.getDetailCommonParam().mPreInfo, this.d.getDetailCommonParam().getPreUserId(), this.d.getDetailCommonParam().getPrePhotoId()));
       presenterV2.U7(new g());
       presenterV2.U7(new a());
       presenterV2.f(obj);
       t$a uoa = new t$a();
       uoa.b = p1;
       uoa.c = this.h;
       uoa.f = this.f;
       uoa.g = this.j;
       uoa.i = this.g;
       Object[] objArray = new Object[]{this.d,this.e,uoa};
       presenterV2.i(j.a(objArray).toArray());
       this.i.put(p1, presenterV2);
       obj.setTag(Integer.valueOf(p1));
       return obj;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
