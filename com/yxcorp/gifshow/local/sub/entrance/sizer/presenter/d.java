package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.d$a;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import tw5.d;
import com.yxcorp.gifshow.local.sub.entrance.sizer.sizermanager.LocalSizerDataProvider;
import java.lang.Boolean;

public class d extends PresenterV2	// class@001acc
{
    public RecyclerFragment p;
    public d q;
    public LocalSizerDataProvider r;
    public CityInfo s;
    public String t;
    public boolean u;
    public final q v;

    public void d(){
       super();
       this.v = new d$a(this);
       this.U7(new HomeLocalSizerViewPresenter());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.p.q().h(this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.p.q().f(this.v);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("local_current_city");
       this.r = this.r8("nearby_header_LOCAL_SIZER_MANAGER");
       this.u = this.r8("nearby_header_LOCAL_SIZER_PERMISSION_ENABLE").booleanValue();
       return;
    }
}
