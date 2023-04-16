package b79.k;
import b79.i;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumDividerItemViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import java.util.List;
import androidx.lifecycle.ViewModel;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import q79.d;
import ga9.b;
import ia9.d;

public final class k extends i	// class@000388
{
    public final AbsAlbumDividerItemViewBinder e;

    public void k(View p0,AbsAlbumDividerItemViewBinder p1){
       a.q(p0, "mItemView");
       a.q(p1, "viewBinder");
       super(p0, p1);
       this.e = p1;
    }
    public void a(Object p0,List p1,ViewModel p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "2")) {
       }else {
          a.q(p1, "payloads");
          if (!p2 instanceof d) {
             p2 = null;
          }
          boolean b = (p2 != null)? p2.r(): true;
          this.d(b);
       }
       return;
    }
    public b b(){
       return this.e;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       super.c();
       return;
    }
}
