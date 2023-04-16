package bpd.c;
import android.view.View$OnClickListener;
import bpd.e;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.BigHeadDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import apd.i;

public final class c implements View$OnClickListener	// class@00029d
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       if (tb.v != null && !TextUtils.x(tb.u.mIconTargetUrl)) {
          tb.v.f(tb.u.mIconTargetUrl);
       }
       return;
    }
}
