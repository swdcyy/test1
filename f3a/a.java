package f3a.a;
import y8c.g;
import f3a.a$a;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
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
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f3a.g;
import ml8.c;

public final class a extends g	// class@00227a
{
    public a$a w;
    public ArrayList x;

    public void a(){
       super();
       this.w = new a$a();
    }
    public void a(ObservableMap p0){
       super();
       a$a uoa = new a$a();
       this.w = uoa;
       uoa.b = p0;
       Object[] objArray = new Object[]{uoa};
       this.x = Lists.e(objArray);
    }
    public ArrayList a1(int p0,f p1){
       return this.x;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new g());
       return new f(a.i(p0, 0x7f0d10e0), obj);
    }
}
