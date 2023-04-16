package a7a.h$a;
import ud5.c;
import a7a.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn5.n;
import hn5.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e7a.a;
import androidx.fragment.app.Fragment;
import wkd.b;
import gb5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;

public final class h$a implements c	// class@000055
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoidWithListener(null, this, h$a.class, "2")) {
          return;
       }
       if (m.a().FG(this.a.S8())) {
          b.a(0x8708467).n(this.a.S8(), false, this.a.R8());
       }
       PatchProxy.onMethodExit(h$a.class, "2");
       return;
    }
    public void onFailure(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h$a.class, "1")) {
          return;
       }
       if (m.a().FG(this.a.S8())) {
          b.a(0x8708467).l(this.a.S8(), false, this.a.R8(), p0);
       }
       PatchProxy.onMethodExit(h$a.class, "1");
       return;
    }
}
