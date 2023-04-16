package bpd.x;
import android.view.View$OnClickListener;
import bpd.y;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.SimpleDialogInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import apd.i;

public final class x implements View$OnClickListener	// class@0002b2
{
    public final y b;

    public void x(y p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       x tb = this.b;
       if (tb.t != null && !TextUtils.isEmpty(tb.s.mFooterTargetUrl)) {
          tb.t.h(tb.s.mFooterTargetUrl);
       }
       return;
    }
}
