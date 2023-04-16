package h63.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h63.e0;
import h63.d0;
import lkd.b;
import tkd.b;
import tkd.d;
import os5.h;
import android.app.Activity;
import joc.d;
import android.view.View;
import ekd.m1;
import v53.f;

public class f0 extends PresenterV2	// class@002c78
{
    public a p;
    public View q;
    public f r;

    public void f0(){
       super();
    }
    public void E8(){
       f0 uof0 = f0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof0, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uof0, "4")) {
          this.p = new e0(this, new d0(this));
          d.a(0x2cb5d4a8).J3(this.getActivity(), this.p);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "5")) {
          return;
       }
       d.a(0x2cb5d4a8).T4(this.getActivity(), this.p);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a121d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       this.r = this.q8(f.class);
       return;
    }
}
