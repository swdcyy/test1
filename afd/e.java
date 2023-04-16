package afd.e;
import android.view.View$OnClickListener;
import afd.g;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.search.template.bigcard.state.a;

public final class e implements View$OnClickListener	// class@000023
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       if (tb.t.c()) {
          tb.t.b(false);
          tb.W8(false);
       }else {
          tb.t.b(true);
          tb.W8(true);
       }
       return;
    }
}
