package nj.h;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.fragment.app.FragmentActivity;
import nj.d;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import com.gifshow.tuna.player.component.TunaPlayFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.gifshow.tuna.player.component.IVideoModel;
import java.lang.Number;

public class h extends FragmentStateAdapter	// class@002714
{
    public List m;
    public d n;

    public void h(FragmentActivity p0,d p1){
       super(p0);
       this.m = new ArrayList();
       this.n = p1;
    }
    public Fragment L0(int p0){
       return this.d1(p0);
    }
    public TunaPlayFragment d1(int p0){
       IVideoModel obj;
       TunaPlayFragment tunaPlayFrag;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.m.get(p0);
       h tn = this.n;
       if (PatchProxy.isSupport(TunaPlayFragment.class)) {
          tunaPlayFrag = PatchProxy.applyThreeRefs(Integer.valueOf(p0), obj, tn, null, TunaPlayFragment.class, "1");
          if (tunaPlayFrag != PatchProxyResult.class) {
          label_004c :
             return tunaPlayFrag;
          }
       }
       tunaPlayFrag = new TunaPlayFragment();
       tunaPlayFrag.j = p0;
       tunaPlayFrag.p = obj;
       tunaPlayFrag.l = tn;
       goto label_004c ;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.m.size();
    }
}
