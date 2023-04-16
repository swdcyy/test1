package asa.g$a;
import z1.a;
import asa.g;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import db5.e;
import android.view.View;

public final class g$a implements a	// class@0002ea
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       int i = p0.intValue();
       g$a uoa = g$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoa, "1")) {
          if (b5.a(this.a.getActivity()) && (e.b(this.a.getActivity()) || e.a())) {
             i = this.a;
             i.S8(i.p, g.P8(i));
          }else {
             uoa = this.a;
             uoa.S8((uoa.p + i), g.P8(uoa));
          }
       }
       return;
    }
}
