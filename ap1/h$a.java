package ap1.h$a;
import zo1.a;
import ap1.h;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Objects;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ap1.g;
import java.lang.Runnable;
import d61.y;
import rg1.a;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public class h$a implements a	// class@000274
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void Eb(int p0,String p1,boolean p2,String p3,String p4){
       Object[] objArray;
       h$a uoa = h$a.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       int i5 = 5;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[i5];
          objArray[i4] = Integer.valueOf(p0);
          objArray[i3] = p1;
          objArray[i2] = Boolean.valueOf(p2);
          objArray[i1] = p3;
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       h$a tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          objArray = new Object[i5];
          objArray[i4] = Integer.valueOf(p0);
          objArray[i3] = p1;
          objArray[i2] = Boolean.valueOf(p2);
          objArray[i1] = p3;
          objArray[i] = p4;
          if (!PatchProxy.applyVoid(objArray, tb, oh, "5")) {
          label_0055 :
             m.b(tb.p);
             g og = new g(tb, p3, p0, p1, p4);
             y.a(tb.getActivity(), i5, tb, 200);
             oh = tb.t;
             if (oh != null) {
                oh.a();
             }
          }
       }else {
          goto label_0055 ;
       }
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public boolean n9(){
       h obj = PatchProxy.apply(null, this, h$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.p;
       boolean b = (obj != null && obj.isAdded())? true: false;
       return b;
    }
    public void qi(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
}
