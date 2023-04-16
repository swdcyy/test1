package k19.a;
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
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import android.view.View;
import ekd.m1;
import k19.a$a;
import android.view.View$OnClickListener;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@002a78
{
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public d w;
    public PublishSubject x;
    public List y;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       int i = 0;
       if (q.f(this.y)) {
          Object[] objArray = new Object[i];
          j0.a("PhotoDetailNewAdPresenter", "payLoads is empty", objArray);
          return;
       }else {
          PhotoAdvertisement$MerchandiseInfo$DiscountInfo merchandiseI = this.y.get((this.w.get() % this.y.size()));
          if (TextUtils.x(merchandiseI.mLeftTopLabel)) {
             this.t.setVisibility(8);
          }else {
             this.t.setVisibility(i);
          }
          this.s.setText(TextUtils.k(merchandiseI.mMerchandiseTitle));
          this.p.setText(TextUtils.k(merchandiseI.mTitle));
          this.q.setText(TextUtils.k(merchandiseI.mSubTitle));
          this.r.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          this.r.setText(TextUtils.k(merchandiseI.mPrice));
          this.t.setText(TextUtils.k(merchandiseI.mLeftTopLabel));
          this.u.setText(TextUtils.k(merchandiseI.mAction));
          this.v.setText(TextUtils.k(merchandiseI.mUnit));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a42cc);
       this.q = m1.f(p0, 0x7f0a42b0);
       this.r = m1.f(p0, 0x7f0a4220);
       this.s = m1.f(p0, 0x7f0a4250);
       this.t = m1.f(p0, 0x7f0a41b3);
       this.u = m1.f(p0, 0x7f0a40da);
       this.v = m1.f(p0, 0x7f0a42ee);
       m1.a(p0, new a$a(this), R.id.root);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.w = this.r8("ADAPTER_POSITION_GETTER");
       this.x = this.r8("AD_MERCHANDISE_SUBJECT");
       this.y = this.r8("AD_MERCHANDISE_LIST_DATA");
       return;
    }
}
