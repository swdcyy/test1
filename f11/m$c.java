package f11.m$c;
import yq5.b;
import f11.m;
import java.lang.Object;
import yq5.a;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class m$c implements b	// class@00227b
{
    public final m b;

    public void m$c(m p0){
       this.b = p0;
       super();
    }
    public void D(){
       a.e(this);
    }
    public int E3(b p0){
       return a.b(this, p0);
    }
    public long c1(){
       return 3000;
    }
    public int compareTo(Object p0){
       return a.a(this, p0);
    }
    public int getPriority(){
       return 1000;
    }
    public View getView(){
       m$c obj = PatchProxy.apply(null, this, m$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       obj.S8(obj.getContext());
       return this.b.B;
    }
    public void onAttach(){
       a.c(this);
    }
    public void onDetach(){
       a.d(this);
    }
    public void onShow(){
       a.f(this);
    }
}
