package j99.r;
import h3.a;
import android.view.View;
import n89.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import java.lang.Math;
import i2b.a;
import qf5.a;
import k99.c0;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.e;
import k99.b0;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import k99.s;
import rkd.b;
import k99.t;
import j99.r$a;
import ekd.j;

public class r extends a	// class@0027d1
{
    public final View d;
    public final a e;
    public final PhotoDetailParam f;
    public final NormalDetailBizParam g;
    public final v1 h;
    public List i;
    public SparseArray j;
    public boolean k;

    public void r(View p0,a p1,PhotoDetailParam p2,NormalDetailBizParam p3){
       super();
       this.i = new ArrayList();
       this.j = new SparseArray();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = new a(p2.mPhoto);
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, r.class, "3")) {
          return;
       }
       p0.removeView(p2);
       PresenterV2 presenterV2 = this.j.get(p1);
       if (presenterV2 != null && (presenterV2.R1() && !presenterV2.y8())) {
          presenterV2.destroy();
          this.j.remove(p1);
       }
    label_003d :
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int atlasListSiz = this.f.mPhoto.getAtlasListSize();
       ImageMeta$AtlasCoverSize[] atlasSizes = this.f.mPhoto.getAtlasSizes();
       int i = (atlasSizes == null)? 0: atlasSizes.length;
       return Math.min(atlasListSiz, i);
    }
    public Object o(ViewGroup p0,int p1){
       View obj;
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, or, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.i(p0, R.layout.arg_RES_7f0d02a5);
       p0.addView(obj);
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new a());
       presenterV2.U7(new c0());
       presenterV2.U7(new e());
       presenterV2.U7(new b0());
       TextUtils.k(b.a(0x4b316083).R0());
       if (this.f.getSource() == 288 || (this.f.getSource() != 8 || !NasaExperimentUtils.A())) {
          presenterV2.U7(new s());
       }
       if (b.g()) {
          presenterV2.U7(new t());
       }
       presenterV2.f(obj);
       r$a uoa = new r$a();
       uoa.b = p1;
       uoa.c = this.i;
       uoa.d = this.d;
       uoa.e = this.k;
       uoa.f = this.h;
       Object[] objArray = new Object[]{this.e,this.f,this.g,uoa};
       presenterV2.i(j.a(objArray).toArray());
       this.j.put(p1, presenterV2);
       obj.setTag(Integer.valueOf(p1));
       return obj;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       int i = 0;
       while (i < this.j.size()) {
          PresenterV2 presenterV2 = this.j.valueAt(i);
          if (presenterV2 != null && (presenterV2.R1() && !presenterV2.y8())) {
             presenterV2.destroy();
          }
       label_002e :
          i = i + 1;
       }
       this.j.clear();
       return;
    }
}
