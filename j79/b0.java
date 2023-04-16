package j79.b0;
import androidx.lifecycle.Observer;
import j79.x;
import java.lang.Object;
import ha9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import ha9.a;
import java.util.List;
import com.yxcorp.gifshow.album.preview.d;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import j79.l0;
import androidx.viewpager.widget.ViewPager;

public final class b0 implements Observer	// class@00276a
{
    public final x b;

    public void b0(x p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
       }else if(p0.c() == UpdateType.CHANGE_ALL){
          this.b.e.J(p0.g());
       }else if(p0.c() == UpdateType.REMOVE_AT){
          this.b.e.L(p0.a());
       }
       p0 = this.b.m.p();
       if (p0 != null) {
          p0.setCurrentItem(this.b.k.u0());
       }
       p0 = this.b;
       p0.e.I(p0.k.u0());
       this.b.h();
       p0 = this.b;
       p0.f = p0.k.u0();
       return;
    }
}
