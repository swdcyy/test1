package bz3.a;
import tw3.a;
import java.lang.Class;
import bz3.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import android.view.View;
import wkd.b;
import ex3.c;
import android.content.Context;

public class a extends a	// class@00045a
{

    public void a(){
       super();
    }
    public Class a(){
       return c.class;
    }
    public PresenterV2 b(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "1");
       return new c();
    }
    public View d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-343507015).a(p0.getContext(), p0, 0x7f0d069b);
    }
    public int getViewType(){
       return 12;
    }
}
