package a7a.c$k;
import erd.g;
import a7a.c;
import java.lang.Object;
import eda.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import e7a.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import java.util.BitSet;
import id5.v;
import q87.c;

public final class c$k implements g	// class@00004c
{
    public final c b;

    public void c$k(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$k.class, "1")) {
       }else if(a.g(p0.a(), this.b.R8().getPhotoId()) && this.b.S8().Vg().e()){
          this.b.w.clear(8);
          this.b.w.clear(11);
          Object[] objArray = new Object[0];
          v.C().w("SlideHorizontalAtlasAPP", "enter detail clear: flag=8", objArray);
          p0.B = true;
       }
       PatchProxy.onMethodExit(c$k.class, "1");
       return;
    }
}
