package bpd.b;
import android.view.View$OnClickListener;
import bpd.e;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.BigHeadDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import apd.i;

public final class b implements View$OnClickListener	// class@00029b
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       if (tb.v != null && !TextUtils.x(tb.u.mActionButtonTargetUrl)) {
          tb.v.g(tb.u.mActionButtonTargetUrl);
       }
       return;
    }
}
