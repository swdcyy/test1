package m9a.q;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class q	// class@002f8f
{

    public void q(){
       super();
    }
    public static int a(RecyclerView p0,float p1,float p2){
       if (PatchProxy.isSupport(q.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), null, q.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null) {
          return -1;
       }else {
          View view = p0.findChildViewUnder(p1, (p2 - p0.getTranslationY()));
          if (view == null) {
             return -1;
          }else {
             return p0.getChildViewHolder(view).getAdapterPosition();
          }
       }
    }
}
