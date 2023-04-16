package ced.e0;
import com.yxcorp.plugin.search.result.hashtag.presenters.a;
import ced.e0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vdd.c;
import xdd.f;
import mrd.a;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import java.util.Collection;
import ekd.q;
import med.f;
import com.kwai.robust.PatchProxyResult;
import s0d.e;
import s0d.f;
import jd.c;
import s0d.a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import android.widget.ImageView;
import ded.h;
import ded.k;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e0 extends a	// class@00054d
{
    public BaseFragment A;
    public PublishSubject B;
    public f C;
    public ImageCallback D;
    public boolean v;
    public ImageView w;
    public View x;
    public TagInfo y;
    public SearchResultExtParams z;

    public void e0(){
       super();
       this.D = new e0$a(this);
    }
    public void E8(){
       e0 uoe0 = e0.class;
       if (PatchProxy.applyVoid(null, this, uoe0, "3")) {
          return;
       }
       super.E8();
       if (this.v != null) {
          boolean b = true;
          this.s.a(b);
          this.s.r.onNext(new f(b));
          e0 ty = this.y;
          if (ty != null && !q.f(ty.mBgUrls)) {
             TagInfo mBgUrls = this.y.mBgUrls;
             if (!PatchProxy.applyVoidOneRefs(mBgUrls, this, uoe0, "4")) {
                if (q.f(mBgUrls)) {
                   this.S8();
                }else {
                   this.C = new f();
                   e[] uoeArray = PatchProxy.applyOneRefs(mBgUrls, this, uoe0, "6");
                   if (uoeArray != PatchProxyResult.class) {
                   }else {
                      f uof = f.x().q(mBgUrls);
                      uof.l(this.C);
                      uoeArray = uof.w();
                   }
                   if (!PatchProxy.applyVoidOneRefs(uoeArray, this, uoe0, "5")) {
                      if (uoeArray.length > 0) {
                         a.d(ImageRequestBuilder.d(uoeArray[0]).a(), this.D);
                      }else {
                         this.R8();
                      }
                   }
                }
             }
          }else {
             this.S8();
          }
       }else {
          int i = 0x7f062030;
          if (this.s.h != null) {
             this.w.setImageResource(i);
             this.s.a(0);
             this.s.r.onNext(new f(0));
          }else {
             this.w.setImageResource(i);
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "8")) {
          return;
       }
       if (h.c(this.y)) {
          this.B.onNext(Integer.valueOf(k.a));
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "7")) {
          return;
       }
       if (this.v == null) {
          return;
       }
       this.R8();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a369a);
       this.x = m1.f(p0, 0x7f0a125b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       super.j8();
       this.y = this.r8("TagInfo");
       this.z = this.r8("TagInfoExtParams");
       this.v = h.b(this.y);
       this.A = this.r8("FRAGMENT");
       this.B = this.r8("TAG_COLOR_SAMPLED_SUBJECT");
       return;
    }
}
