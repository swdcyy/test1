package b17.b;
import w07.l;
import java.lang.Object;
import a17.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import androidx.recyclerview.widget.RecyclerView;
import a17.c$a;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Paint;
import android.content.Context;
import android.view.ViewGroup;
import j17.a;
import lnc.a1;
import r07.b;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView$n;
import a17.a;

public final class b implements l	// class@0003b4
{

    public void b(){
       super();
    }
    public void apply(Object p0){
       Context context;
       a.p(p0, "target");
       View view = p0.z();
       if (view != null) {
          RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
          if (recyclerView != null) {
             String str = "context";
             if (p0.c0().P != null) {
                ShapeDrawable shapeDrawabl = new ShapeDrawable(new RectShape());
                Paint paint = shapeDrawabl.getPaint();
                a.o(paint, "shape.paint");
                context = recyclerView.getContext();
                a.o(context, str);
                paint.setColor(a.a(context, R.color.arg_RES_7f062152));
                shapeDrawabl.setIntrinsicHeight(a1.e(0x3f000000));
                recyclerView.addItemDecoration(new b(shapeDrawabl));
             }
             if (p0.p == null) {
                Context context1 = recyclerView.getContext();
                a.o(context1, str);
                context = recyclerView.getContext();
                a.o(context, str);
                recyclerView.addItemDecoration(new a(recyclerView, a.c(context1, R.dimen.arg_RES_7f0710c3), a.c(context, R.dimen.arg_RES_7f0710c3)));
             }
          }
       }
       return;
    }
}
