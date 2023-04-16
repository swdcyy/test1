package com.kwai.component.photo.detail.slide.presenter.b$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.component.photo.detail.slide.presenter.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.StringBuilder;
import java.util.Map;
import java.lang.Boolean;
import vy6.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import de5.a;

public class b$a implements ViewPager$i	// class@000a91
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       int i = uoa.s.M(uoa.p);
       if (i < 0) {
          return;
       }
       this.b.P8("onPageSelected currentPosition: "+this.b.u+" toPosition: "+p0+" index: "+i);
       uoa = this.b;
       if (uoa.u == p0) {
          Map y = b.y;
          Boolean uBoolean = y.get(uoa.v);
          if (uBoolean != null && uBoolean.booleanValue()) {
             return;
          }else {
             y.put(this.b.v, Boolean.TRUE);
             this.b.P8("onPageSelected call becomesAttach");
             this.b.q.i2();
          }
       }else {
          uoa.q.F1();
          b$a tb = this.b;
          b q = tb.q;
          Objects.requireNonNull(tb);
          String str = PatchProxy.apply(null, tb, b.class, "4");
          if (str != PatchProxyResult.class) {
          }else {
             b p = tb.p;
             if (p == null) {
                str = "ks://photo";
             }else {
                Object[] objArray = new Object[]{p.getUserId(),tb.p.getPhotoId(),Integer.valueOf(tb.p.getType()),tb.p.getExpTag()};
                str = String.format(Locale.US, "ks://photo/%s/%s/%d/%s", objArray);
             }
          }
          q.n(str, u1.r(this.b.r));
       }
       return;
    }
}
