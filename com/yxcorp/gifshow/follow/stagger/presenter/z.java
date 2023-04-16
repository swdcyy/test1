package com.yxcorp.gifshow.follow.stagger.presenter.z;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import eja.z0;
import kga.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import com.kwai.component.feedstaggercard.model.CardStyle;
import android.view.View;
import java.util.Random;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zf6.k;
import lnc.a1;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;

public class z extends g	// class@001227
{
    public HomeFollowFragment H;

    public void z(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       super.E8();
       this.X7(new FragmentCompositeLifecycleState(this.H).k().subscribe(new z0(this), c.a));
       return;
    }
    public void P8(ViewGroup p0){
       z oz = z.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oz, "3")) {
          return;
       }
       if (CardStyle.isV5Bottom(this.t.mBottomType)) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, oz, "4") && this.E == null) {
             View[] viewArray = new View[]{p0.findViewById(0x7f0a146a),p0.findViewById(0x7f0a146d),p0.findViewById(0x7f0a146e),p0.findViewById(0x7f0a146f),p0.findViewById(0x7f0a1470),p0.findViewById(0x7f0a1471),p0.findViewById(0x7f0a1472),p0.findViewById(0x7f0a1473)};
             this.Z8(new Random(), viewArray);
          }
       }else {
          super.P8(p0);
       }
       return;
    }
    public int R8(){
       Object obj = PatchProxy.apply(null, this, z.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (CardStyle.isV5Bottom(this.t.mBottomType)) {
          return this.A;
       }
       return super.R8();
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, z.class, "5")) {
          return;
       }
       super.V8();
       if (CardStyle.isV5Bottom(this.t.mBottomType)) {
          this.u.setPadding(this.D, 0, this.D, 0);
          if (k.d()) {
             this.u.setBackgroundColor(a1.a(R.color.arg_RES_7f0619d5));
          }else {
             this.u.setBackground(a1.f(R.drawable.arg_RES_7f080d9b));
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       super.j8();
       this.H = this.r8("FRAGMENT");
       return;
    }
}
