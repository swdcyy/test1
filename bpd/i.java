package bpd.i;
import android.view.View$OnClickListener;
import bpd.l;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import apd.i;

public final class i implements View$OnClickListener	// class@0002a3
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       if (tb.v != null && !TextUtils.x(tb.u.mActionButtonTargetUrl)) {
          tb.v.g(tb.u.mActionButtonTargetUrl);
       }
       return;
    }
}
