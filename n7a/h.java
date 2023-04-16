package n7a.h;
import androidx.recyclerview.widget.RecyclerView$o;
import n7a.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n7a.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo;
import nm6.e;
import n7a.g;
import java.lang.Runnable;
import o7a.d;

public class h implements RecyclerView$o	// class@0030fb
{
    public final f b;

    public void h(f p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
    }
    public void w6(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       h tb = this.b;
       if (tb.r != null) {
          f f = tb.F;
          if (f != null && (f.getChildAdapterPosition(p0) + 1) == e.a(this.b.p).mPictureIndex) {
             a u = this.b.u;
             if (u == null) {
                p0.post(new g(this, p0));
             }else {
                u.c(p0);
             }
          }
       }
       return;
    }
}
