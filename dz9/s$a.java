package dz9.s$a;
import android.view.View$OnClickListener;
import dz9.s;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dz9.u;
import android.content.res.Resources;
import com.kwai.library.widget.popup.common.f;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.a;

public final class s$a implements View$OnClickListener	// class@002021
{
    public final s b;
    public final TextView c;

    public void s$a(s p0,TextView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onClick(View p0){
       Drawable drawable;
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       s b = this.b.b;
       if (b.F != null) {
          b.F = false;
          drawable = f.j().getDrawable(R.drawable.arg_RES_7f080618);
          a.o(drawable, "getResources\(\).getDrawab¡­list_checkbox_unselected\)");
          drawable.setBounds(false, false, drawable.getMinimumWidth(), drawable.getMinimumHeight());
          this.c.setCompoundDrawables(drawable, null, null, null);
       }else {
          b.F = true;
          drawable = f.j().getDrawable(R.drawable.arg_RES_7f080617);
          a.o(drawable, "getResources\(\).getDrawab¡­n_list_checkbox_selected\)");
          drawable.setBounds(false, false, drawable.getMinimumWidth(), drawable.getMinimumHeight());
          this.c.setCompoundDrawables(drawable, null, null, null);
       }
       return;
    }
}
