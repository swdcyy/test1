package bbd.f;
import ucd.n;
import nfd.a0$a;
import med.a;
import ufd.l;
import nfd.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import com.yxcorp.plugin.search.entity.ExtInfo;
import android.view.View;
import android.view.ViewStub;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateUserFeed;
import ekd.m1;
import android.widget.TextView;
import bbd.a;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.entity.template.aggregate.AttachedInfo;
import com.yxcorp.plugin.search.entity.TemplateText;
import nfd.o3;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinModel;
import nfd.n0;
import zf6.k;
import pad.l;
import java.lang.Integer;
import nfd.m0$a;
import com.yxcorp.gifshow.model.CDNUrl;
import nfd.m0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e7d.h;

public class f extends n	// class@0003d7
{
    public TextView A;
    public ViewStub B;
    public BaseFragment p;
    public SearchItem q;
    public h r;
    public TemplateUserFeed s;
    public a0 t;
    public AttachedInfo u;
    public View v;
    public View w;
    public View x;
    public TextView y;
    public TextView z;

    public void f(){
       super();
       a0$a uoa = new a0$a();
       uoa.c(new a());
       this.t = uoa.a();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "3")) {
          return;
       }
       f tq = this.q;
       if (tq != null) {
          SearchItem mKBoxItem = tq.mKBoxItem;
          if (mKBoxItem != null) {
             KBoxItem mBaseFeed = mKBoxItem.mBaseFeed;
             if (mBaseFeed != null) {
                TemplateBaseFeed mExtInfo = mBaseFeed.mExtInfo;
                if (mExtInfo != null) {
                   objArray = mExtInfo.mAttachedInfo;
                }
             }
          }
       }
       this.u = objArray;
       if (objArray != null) {
          if (this.v == null) {
             this.v = this.B.inflate();
          }
          this.B.setVisibility(0);
          this.v.setVisibility(0);
          this.s = this.q.mKBoxItem.mBaseFeed;
          this.t.g.c(this.v);
          this.w = m1.f(this.v, 0x7f0a05a4);
          this.y = m1.f(this.v, 0x7f0a3f7b);
          this.z = m1.f(this.v, 0x7f0a3bd5);
          this.A = m1.f(this.v, 0x7f0a3ef3);
          this.x = m1.f(this.v, 0x7f0a1798);
          this.P8(this.w, new a(this));
          this.V8();
       }else {
          this.B.setVisibility(8);
       }
       return;
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "4")) {
          return;
       }
       o3.Y(this.y, this.u.mTitle);
       int i = 0;
       int i1 = 1;
       f uof = 8;
       if (!q.f(this.u.mSubTitles)) {
          o3.Y(this.z, this.u.mSubTitles.get(i));
          if (this.u.mSubTitles.size() > i1) {
             o3.Y(this.A, this.u.mSubTitles.get(i1));
             this.x.setVisibility(i);
          }else {
             this.A.setVisibility(uof);
             this.x.setVisibility(uof);
          }
       }else {
          this.z.setVisibility(uof);
          this.A.setVisibility(uof);
          this.x.setVisibility(uof);
       }
       if (this.u.mButton.mStatus == i1) {
          i = true;
       }
       a0 g = this.t.g;
       int i2 = n0.h(i);
       if (!i) {
          objArray = (k.d())? this.u.mDarkIconUrls: this.u.mIconUrls;
       }
    label_008e :
       if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidThreeRefs(g, Integer.valueOf(i2), objArray, null, l.class, "3")) {
          m0$a uoa = new m0$a();
          uoa.b(7);
          uoa.c(i2);
          uoa.d(objArray);
          n0.b(g, uoa.a());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a0288);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(SearchItem.class);
       this.r = this.r8("SEARCH_FRAGMENT_DELEGATE");
       return;
    }
}
