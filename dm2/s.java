package dm2.s;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import android.app.Activity;
import d61.y;
import k17.b;
import lnc.a1;
import android.view.View;
import ekd.m1;

public class s extends c	// class@00254f
{
    public RecyclerView p;
    public RecyclerView$n q;
    public static String sLivePresenterClassName = "LiveGzoneVoteItemSpacePresenter";

    public void s(){
       super();
    }
    public void E8(){
       s os = s.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, os, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, os, "3")) {
          this.p.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), 1, false));
          this.p.removeItemDecoration(this.q);
          int i = (y.d(this.getActivity()))? 12: 16;
          b uob = new b(1, a1.e((float)i));
          this.q = uob;
          this.p.addItemDecoration(uob);
       }
       return;
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, s.class, "4");
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1a54);
       return;
    }
}
