package abd.f$b;
import com.yxcorp.gifshow.widget.m;
import abd.f;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.plugin.search.entity.kbox.MovieTab;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import android.widget.TextView;
import sy5.a;
import x9d.g;
import com.google.gson.JsonObject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import nfd.q1;
import java.util.Objects;
import android.widget.LinearLayout;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.core.content.ContextCompat;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatTextView;

public class f$b extends m	// class@0000c4
{
    public final SelectShapeTextView c;
    public final MovieTab d;
    public final f e;

    public void f$b(f p0,SelectShapeTextView p1,MovieTab p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(View p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       f$b te = this.e;
       te.C = te.z.getAdapter();
       if (!this.c.isSelected() && this.e.D == null) {
          a uoa = a.k();
          uoa.e("button_name", this.d.mTabName);
          f$b te1 = this.e;
          int i = 1;
          q1.z(i, te1.x, te1.w, "FILTERABLE_FILTET_SUBCARD", uoa.j());
          te = this.e;
          te.D = i;
          te1 = this.c;
          f$b td = this.d;
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoidTwoRefs(te1, td, te, uof, "4")) {
             g.b9(te1, i);
             te.Z8();
             te.G = td;
             te.c9(td);
          }
          te = this.e;
          te1 = this.c;
          Objects.requireNonNull(te);
          if (!PatchProxy.applyVoidOneRefs(te1, te, uof, "9")) {
             int i1 = 0;
             while (i1 < te.y.getChildCount()) {
                SelectShapeTextView childAt = te.y.getChildAt(i1);
                if (te.y.getChildAt(i1) != te1) {
                   childAt.setTextColor(ContextCompat.getColor(te.getContext(), R.color.arg_RES_7f061672));
                   childAt.setTypeface(Typeface.DEFAULT);
                   childAt.setSelected(false);
                   childAt.setBackgroundResource(R.drawable.arg_RES_7f082499);
                }
                i1 = i1 + 1;
             }
          }
       }
       return;
    }
}
