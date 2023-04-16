package p5c.b;
import y8c.g;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import y8c.f;
import android.view.ViewGroup;
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
import s5c.r;
import s5c.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s5c.m;
import ml8.c;

public class b extends g	// class@003bae
{
    public final ArrayList w;

    public void b(Object[] p0){
       super();
       this.w = Lists.e(p0);
    }
    public final ArrayList a1(int p0,f p1){
       return this.w;
    }
    public f h1(ViewGroup p0,int p1){
       View obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
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
       r or = new r();
       or.U7(new k());
       or.U7(new m());
       return new f(view, or);
    }
}
