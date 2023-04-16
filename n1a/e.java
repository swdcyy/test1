package n1a.e;
import erd.g;
import n1a.g;
import java.lang.String;
import java.lang.Object;
import l1a.a;
import java.util.Objects;
import l1a.b;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e17.i;
import android.widget.EditText;

public final class e implements g	// class@0030b6
{
    public final g b;
    public final String c;

    public void e(g p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       b uob = new b();
       uob.mId = p0.mId;
       uob.mText = this.c;
       tb.v.q().add(0, uob);
       i.a(R.style.arg_RES_7f110669, 0x7f1017f8);
       tb.R8();
       tb.r.setEnabled(true);
    }
}
