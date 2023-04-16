package b79.e;
import b79.i;
import android.view.View;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFooterItemViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import java.util.List;
import androidx.lifecycle.ViewModel;
import r79.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b79.d;
import java.lang.CharSequence;
import android.widget.TextView;
import ga9.b;

public final class e extends i	// class@000382
{
    public final AbsAlbumFooterItemViewBinder e;

    public void e(View p0,AbsAlbumFooterItemViewBinder p1){
       a.q(p0, "mItemView");
       a.q(p1, "viewBinder");
       super(p0, p1);
       this.e = p1;
    }
    public void a(Object p0,List p1,ViewModel p2){
       AbsAlbumFooterItemViewBinder e;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "1")) {
       }else {
          a.q(p1, "payloads");
          if (p0 instanceof d) {
             e = this.e().e;
             if (e != null) {
                e.setText(p0.b);
             }
          }
       }
       return;
    }
    public b b(){
       return this.e();
    }
    public AbsAlbumFooterItemViewBinder e(){
       return this.e;
    }
}
