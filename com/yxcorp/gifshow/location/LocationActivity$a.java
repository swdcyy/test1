package com.yxcorp.gifshow.location.LocationActivity$a;
import ty5.e;
import com.yxcorp.gifshow.location.LocationActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.location.LocationFragment;
import android.widget.TextView;
import java.util.Objects;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;

public class LocationActivity$a extends e	// class@001ad5
{
    public final LocationActivity b;

    public void LocationActivity$a(LocationActivity p0){
       this.b = p0;
       super();
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, LocationActivity$a.class, "1")) {
          return;
       }
       this.b.O.Ih(true);
       this.b.A.setVisibility(8);
       return;
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationActivity$a.class, "5")) {
          return;
       }
       LocationActivity o = this.b.O;
       Objects.requireNonNull(o);
       if (!PatchProxy.applyVoidOneRefs(p0, o, LocationFragment.class, "13")) {
          o.J = p0;
          o.q().clear();
          o.h0().scrollToPosition(0);
          o.N.M0().k0();
          if (!TextUtils.isEmpty(p0)) {
             o.a();
          }else {
             o.Hh();
          }
       }
       return;
    }
    public void ke(String p0,boolean p1){
       if (PatchProxy.isSupport(LocationActivity$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LocationActivity$a.class, "4")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void qc(String p0,boolean p1,String p2){
       if (PatchProxy.isSupport(LocationActivity$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, LocationActivity$a.class, "3")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void s7(boolean p0){
       LocationActivity$a uoa = LocationActivity$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.b.O.Ih(false);
       if (this.b.v3() && !TextUtils.x(this.b.L)) {
          this.b.A.setVisibility(false);
       }
       return;
    }
}
