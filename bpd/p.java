package bpd.p;
import android.view.View$OnClickListener;
import bpd.q;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.MultiPicsDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import apd.i;

public final class p implements View$OnClickListener	// class@0002aa
{
    public final q b;

    public void p(q p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p tb = this.b;
       if (tb.x != null && !TextUtils.x(tb.w.mFooterTargetUrl)) {
          tb.x.h(tb.w.mFooterTargetUrl);
       }
       return;
    }
}
