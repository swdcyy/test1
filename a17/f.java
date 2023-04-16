package a17.f;
import java.lang.Object;
import a17.c$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import a17.k;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import b17.b;
import w07.l;
import com.kwai.library.widget.popup.common.c$b;
import x07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;

public final class f	// class@000015
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public static final c$a a(c$a p0){
       a.p(p0, "builder");
       c$a o = p0.O;
       if (o != null) {
       }else {
          o = new k(p0);
       }
       p0.e0(o);
       o = p0.J;
       if (o == -1) {
          int i = 0x7f0d150b;
       }
       p0.k0(o);
       p0.a0(0, new b());
       p0.Q(R.id.widget_popup_bottom_anim_view);
       p0.L(new b(R.layout.arg_RES_7f0d150c));
       a.o(p0, "builder.setAdapter<KwaiS¡­list_layout_view\)\n      \)");
       return p0;
    }
}
