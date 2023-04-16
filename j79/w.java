package j79.w;
import androidx.lifecycle.Observer;
import j79.q;
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

public final class w implements Observer	// class@002797
{
    public final q b;

    public void w(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
       }else if(p0.c() == UpdateType.CHANGE_ALL){
          this.b.e.J(p0.g());
       }else if(p0.c() == UpdateType.REMOVE_AT){
          this.b.e.L(p0.a());
       }
       p0 = this.b.n.p();
       if (p0 != null) {
          p0.setCurrentItem(this.b.l.u0());
       }
       p0 = this.b;
       p0.e.I(p0.l.u0());
       this.b.j();
       p0 = this.b;
       p0.f = p0.l.u0();
       this.b.e.B();
       return;
    }
}
