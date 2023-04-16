package com.kwai.nearby.local.tab.present.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.tab.present.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw5.d;
import fm7.d;
import mrb.a;
import q87.c;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import q96.f;
import lrb.a;
import bsb.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.nearby.common.helper.migrate.c;
import vc7.d0;

public class h extends PresenterV2	// class@000ff8
{
    public d p;
    public d0 q;
    public CityInfo r;
    public final f s;
    public static final String t = "h";

    public void h(){
       super();
       this.s = new h$a(this);
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
          return;
       }
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, oh, "7") && d.d(this.p.getTypeValue())) {
          Object[] objArray2 = new Object[i];
          a.C().w(h.t, "clear Roaming", objArray2);
          if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
             d.g(this.p.getTypeValue(), 0);
             d.f(this.p.getTypeValue(), objArray);
          }
       }
       a.k(this.s);
       CityInfo uCityInfo = a.b();
       this.r = uCityInfo;
       if (!PatchProxy.applyVoidOneRefs(uCityInfo, this, oh, "3")) {
          oh = this.p;
          if (oh != null) {
             oh.b(uCityInfo);
             Object[] objArray1 = new Object[i];
             a.C().w(h.t, "mLocalCurrentCity setValue->"+uCityInfo, objArray1);
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       c.a();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       a.n(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.r8("local_current_city");
       this.q = this.r8("HOME_LOCAL_PAGE_STATE");
       return;
    }
}
