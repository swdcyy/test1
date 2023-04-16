package oj.k;
import nj.h;
import androidx.fragment.app.FragmentActivity;
import nj.d;
import androidx.fragment.app.Fragment;
import com.gifshow.tuna.player.poi.PoiFoodPlayFragment;
import com.gifshow.tuna.player.component.TunaPlayFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.gifshow.tuna.player.component.IVideoModel;

public class k extends h	// class@0027db
{
    public a o;

    public void k(FragmentActivity p0,d p1){
       super(p0, p1);
    }
    public Fragment L0(int p0){
       return this.e1(p0);
    }
    public TunaPlayFragment d1(int p0){
       return this.e1(p0);
    }
    public PoiFoodPlayFragment e1(int p0){
       IVideoModel obj;
       PoiFoodPlayFragment poiFoodPlayF;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.m.get(p0);
       h tn = this.n;
       k to = this.o;
       if (PatchProxy.isSupport(PoiFoodPlayFragment.class)) {
          poiFoodPlayF = PatchProxy.applyFourRefs(Integer.valueOf(p0), obj, tn, to, null, PoiFoodPlayFragment.class, "1");
          if (poiFoodPlayF != PatchProxyResult.class) {
          label_0051 :
             return poiFoodPlayF;
          }
       }
       poiFoodPlayF = new PoiFoodPlayFragment();
       poiFoodPlayF.j = p0;
       poiFoodPlayF.p = obj;
       poiFoodPlayF.l = tn;
       poiFoodPlayF.t = to;
       goto label_0051 ;
    }
}
