package cod.c$g;
import androidx.lifecycle.Observer;
import cod.c;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.ImageView;
import java.util.List;
import jn9.b;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import mn9.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$TextColors;
import huc.s;
import tb7.j;
import com.yxcorp.gifshow.component.postlistcomponent.SelectScrollOption;

public final class c$g implements Observer	// class@000356
{
    public final c b;

    public void c$g(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i1;
       int i3;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$g.class, "1")) {
       }else if(p0 == null){
          c$g tb = this.b;
          Objects.requireNonNull(tb);
          int i = 2;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "9")) {
             i1 = p0.i();
             i3 = 0x7f080f0e;
             if (i1) {
                if (i1 != 1) {
                   if (i1 != i) {
                      if (i1 != 3) {
                         tb.i.setImageResource(i3);
                      }else {
                         tb.i.setImageResource(R.drawable.arg_RES_7f080f10);
                      }
                   }else {
                      tb.i.setImageResource(R.drawable.arg_RES_7f080f12);
                   }
                }else {
                   tb.i.setImageResource(R.drawable.arg_RES_7f080f0c);
                }
             }else {
                tb.i.setImageResource(i3);
             }
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "8")) {
             i1 = p0.h();
             i3 = 0x7f080f06;
             if (i1) {
                if (i1 != 1) {
                   if (i1 != i) {
                      tb.j.setImageResource(i3);
                   }else {
                      tb.j.setImageResource(R.drawable.arg_RES_7f080f08);
                   }
                }else {
                   tb.j.setImageResource(R.drawable.arg_RES_7f080f04);
                }
             }else {
                tb.j.setImageResource(i3);
             }
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "10")) {
             p0 = p0.j();
             Iterator iterator = tb.m.m().iterator();
             i1 = 0;
             int i2 = -1;
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                i3 = i1 + 1;
                if (i1 < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager.TextColorData");
                if (j.a(p0, s.a(obj.a.c))) {
                   i2 = i1;
                }
                i1 = i3;
             }
             if (i2 >= 0) {
                tb.D(i2, true);
                b.E(tb.m, i2, true, null, 4, null);
             }else {
                int i4 = tb.m.q();
                if (i4 >= 0) {
                   tb.m.I(i4);
                }
             }
          }
       }
       return;
    }
}
