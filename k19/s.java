package k19.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import yx.j0;
import y8c.d;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ImageView;
import android.net.Uri;
import ekd.x0;
import lnc.a1;
import k19.s$f;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import tw.j;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;
import g59.p;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import k19.s$a;
import android.view.View$OnClickListener;
import k19.s$b;
import k19.s$c;
import k19.s$d;
import k19.s$e;
import io.reactivex.subjects.PublishSubject;

public class s extends PresenterV2	// class@002a95
{
    public KwaiImageView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public SelectShapeButton u;
    public d v;
    public PublishSubject w;
    public List x;
    public QPhoto y;

    public void s(){
       super();
    }
    public void E8(){
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, s.class, "3")) {
          return;
       }
       int i = 0;
       if (q.f(this.x)) {
          Object[] objArray1 = new Object[i];
          j0.a("PhotoDetailNewAdPresenter", "payLoads is empty", objArray1);
          return;
       }else {
          PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo merchandiseI = this.x.get((this.v.get() % this.x.size()));
          this.q.setText(merchandiseI.mTitle);
          this.r.setText(merchandiseI.mSubtitle);
          this.p.setVisibility(i);
          this.p.B(x0.f(merchandiseI.mIconUrl), a1.d(R.dimen.arg_RES_7f07033a), a1.d(R.dimen.arg_RES_7f07033a), new s$f(this));
          s ty = this.y;
          PhotoAdvertisement$ActionbarInfo obj = PatchProxy.applyOneRefs(ty, objArray, j.class, "5");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else {
             obj = j.i(ty);
             i = a1.a(R.color.arg_RES_7f061eb8);
             i1 = (obj != null)? p.b(obj.mActionBarColor, i): i;
          }
          b uob = new b();
          uob.g(KwaiRadiusStyles.FULL);
          uob.v(i1);
          uob.s(DrawableCreator$Shape.Rectangle);
          this.u.setBackground(uob.a());
          this.u.setText(TextUtils.i(merchandiseI.mAction, a1.p(R.string.arg_RES_7f103225)));
          this.s.setText(merchandiseI.mPrice);
          this.t.setText(TextUtils.k(merchandiseI.mUnit));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1534);
       this.q = m1.f(p0, 0x7f0a42cc);
       this.r = m1.f(p0, 0x7f0a42b0);
       this.s = m1.f(p0, 0x7f0a4220);
       this.t = m1.f(p0, 0x7f0a42ee);
       this.u = m1.f(p0, 0x7f0a055f);
       m1.a(p0, new s$a(this), R.id.iv_icon);
       m1.a(p0, new s$b(this), R.id.tv_title);
       m1.a(p0, new s$c(this), R.id.tv_subtitle);
       m1.a(p0, new s$d(this), R.id.fl_purchase_root);
       m1.a(p0, new s$e(this), R.id.root);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "1")) {
          return;
       }
       this.v = this.r8("ADAPTER_POSITION_GETTER");
       this.w = this.r8("AD_MERCHANDISE_SUBJECT");
       this.x = this.r8("AD_MERCHANDISE_LIST_DATA");
       this.y = this.r8("AD_MERCHANDISE_PHOTO");
       return;
    }
}
