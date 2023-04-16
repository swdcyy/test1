package cl9.z2;
import erd.g;
import cl9.a3;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import qvb.i;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class z2 implements g	// class@00068b
{
    public final a3 b;

    public void z2(a3 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z2 tb = this.b;
       if (tb.r.getItems().size() > 0) {
          String captionToCom = p0.getCaptionToComment();
          a3 q = tb.q;
          if (TextUtils.x(captionToCom)) {
             captionToCom = p0.getCaption();
          }
          q.mComment = captionToCom;
          tb.s.g7().k0();
       }
       return;
    }
}
