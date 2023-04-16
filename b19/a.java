package b19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b19.a$a;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Boolean;
import lnc.y0;
import kotlin.jvm.internal.a;
import rf5.u;
import android.view.View;
import java.util.ArrayList;
import ekd.m1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public final class a extends PresenterV2	// class@000352
{
    public View p;
    public View q;
    public ArrayList r;
    public u s;
    public PhotoDetailParam t;
    public NasaBizParam u;
    public final a$a v;
    public final int w;
    public int x;

    public void a(){
       super();
       this.v = new a$a(this);
       this.w = a1.d(0x7f070bf1);
    }
    public void E8(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       if (f.b()) {
          a tu = this.u;
          if (tu != null) {
             NasaSlideParam nasaSlidePar = tu.getNasaSlideParam();
             if (nasaSlidePar != null) {
                objArray = Boolean.valueOf(nasaSlidePar.isHomePage());
             }
          }
          if (y0.p(objArray)) {
             i = 0;
          label_002f :
             this.x = i;
             tu = this.p;
             if (tu == null) {
                a.S("mContentView");
             }
             a ts = this.s;
             int i1 = (ts != null && ts.w() == true)? 0: this.x;
             tu.setPadding(0, 0, 0, i1);
             tu = this.r;
             if (tu != null) {
                tu.add(this.v);
             }
             tu = this.q;
             if (tu != null) {
                tu.setTranslationY((float)this.w);
             }
             return;
          }
       }
       i = this.w;
       goto label_002f ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.ad_detail_content_layout);
       a.o(view, "bindWidget<View>\(rootVie¡­ad_detail_content_layout\)");
       this.p = view;
       this.q = m1.f(p0, 0x7f0a04db);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.r8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.s = this.q8(u.class);
       this.t = this.q8(PhotoDetailParam.class);
       this.u = this.q8(NasaBizParam.class);
       return;
    }
}
