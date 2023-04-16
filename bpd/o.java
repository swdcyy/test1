package bpd.o;
import android.view.View$OnClickListener;
import bpd.q;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.MultiPicsDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import apd.i;

public final class o implements View$OnClickListener	// class@0002a9
{
    public final q b;

    public void o(q p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       if (tb.x != null && !TextUtils.x(tb.w.mActionButtonTargetUrl)) {
          tb.x.g(tb.w.mActionButtonTargetUrl);
       }
       return;
    }
}
