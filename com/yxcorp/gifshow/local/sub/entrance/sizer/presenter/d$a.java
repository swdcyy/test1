package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.d$a;
import qvb.q;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.d;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Objects;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import tw5.d;
import lrb.a;
import wkd.b;
import v1b.a;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import bsb.a;
import v1b.c;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import brd.t;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import f2b.n;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class d$a implements q	// class@001acb
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 && this.b.p.c1()) {
          d$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, d.class, "2")) {
             tb.s = tb.q.d();
             CityInfo uCityInfo = a.h();
             if (uCityInfo != null) {
                uCityInfo = uCityInfo.mCityName;
                if (uCityInfo != null) {
                   tb.t = uCityInfo;
                label_0050 :
                   tb.X7(b.a(0x70f21769).b(a.c(tb.r.getType()), c.a.getLong(b.d("user")+"hasShowBubbleId", 0), 1).observeOn(d.c).map(new e()).observeOn(d.a).subscribe(new n(tb), Functions.e));
                }
             }
             tb.t = "";
             goto label_0050 ;
          }
       }
       return;
    }
}
