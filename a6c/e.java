package a6c.e;
import p5c.b;
import java.lang.Object;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import android.view.ViewStub;
import tkd.b;
import tkd.d;
import rx5.c;
import a6c.d;
import a6c.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s5c.m;
import ml8.c;

public class e extends b	// class@00008a
{

    public void e(Object[] p0){
       super(p0);
    }
    public f h1(ViewGroup p0,int p1){
       View obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d1567);
       obj = view.findViewById(R.id.follow_button);
       if (obj instanceof ViewStub) {
          obj.setLayoutResource(d.a(0x77cfa10c).rv());
          obj.setVisibility(0);
       }
       d uod = new d();
       uod.U7(new c());
       uod.U7(new m());
       return new f(view, uod);
    }
}
