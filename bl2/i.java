package bl2.i;
import android.view.View$OnClickListener;
import bl2.j$a;
import java.lang.Object;
import android.view.View;
import bl2.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wk2.s;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class i implements View$OnClickListener	// class@000411
{
    public final j$a b;

    public void i(j$a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       s.t((TextUtils.x(tb.d.C) ^ 0x01));
       j$a d = tb.d;
       Objects.requireNonNull(d);
       if (PatchProxy.applyVoid(null, d, j.class, "9")) {
       }else {
          d.a9(0);
       }
       tb.b.setVisibility(8);
       return;
    }
}
