package bpd.t;
import android.view.View$OnClickListener;
import bpd.u;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.OnePictureDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import apd.i;

public final class t implements View$OnClickListener	// class@0002ae
{
    public final u b;

    public void t(u p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       t tb = this.b;
       if (tb.r != null && !TextUtils.x(tb.q.mBigPicTargetUrl)) {
          tb.r.i(tb.q.mBigPicTargetUrl);
       }
       return;
    }
}
