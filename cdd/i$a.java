package cdd.i$a;
import androidx.recyclerview.widget.RecyclerView$o;
import cdd.i;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.e;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Number;
import java.lang.Integer;
import g9c.a;
import com.yxcorp.plugin.search.entity.SearchItem;

public class i$a implements RecyclerView$o	// class@000535
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "2")) {
          return;
       }
       QPhoto qPhoto = this.b.r1(p0);
       if (qPhoto != null && this.b.s1(p0)) {
          this.b.w.c(qPhoto);
       }
       return;
    }
    public void w6(View p0){
       int i;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       QPhoto qPhoto = this.b.r1(p0);
       if (qPhoto != null && this.b.s1(p0)) {
          i$a tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.applyOneRefs(p0, tb, oi, "4");
          i = 0;
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          }else {
             p0 = p0.getTag(R.id.search_item_view_pos_tag);
             i1 = (p0 == null)? 0: Integer.parseInt(p0.toString());
          }
          tb = this.b;
          i w = tb.w;
          Objects.requireNonNull(tb);
          Object[] objArray = null;
          SearchItem obj1 = PatchProxy.apply(objArray, tb, oi, "2");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             int itemCount = tb.getItemCount();
             while (i < itemCount && i < 10) {
                obj1 = tb.N0(i).mPhoto;
                if (obj1 != null) {
                   objArray = obj1;
                   break ;
                }
                i = i + 1;
             }
          }
          w.d(qPhoto, objArray, i1);
       }
       return;
    }
}
