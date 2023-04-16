package c6a.b$b;
import android.view.View$OnClickListener;
import c6a.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.widget.TextView;
import com.yxcorp.gifshow.util.rx.RxBus;
import c6a.c;
import java.util.List;
import com.yxcorp.gifshow.detail.school.SchoolSquareResponse$b;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class b$b implements View$OnClickListener	// class@00055d
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       b p;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, b.class, "9")) {
          int i = 0;
          Iterator iterator = tb.w.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj.isSelected() && i != tb.x) {
                tb.x = i;
                RxBus.f.b(new c(tb.u.get(i).value));
                p = tb.p;
                if (p != null) {
                   p.o();
                }
                if (tb.x == null) {
                   p = tb.s;
                   if (p != null) {
                      p.setPlaceHolderImage(R.drawable.arg_RES_7f080dd9);
                   }
                }else {
                   p = tb.s;
                   if (p != null) {
                      p.setPlaceHolderImage(R.drawable.arg_RES_7f080dd7);
                   }
                }
             }else {
                p = tb.p;
                if (p != null) {
                   p.o();
                }
             }
             i = i1;
          }
       }
       PatchProxy.onMethodExit(b$b.class, "1");
       return;
    }
}
