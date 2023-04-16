package bpd.j;
import android.view.View$OnClickListener;
import bpd.l;
import java.lang.Object;
import android.view.View;
import com.yxcorp.plugin.kwaitoken.model.BigPictureDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import apd.i;

public final class j implements View$OnClickListener	// class@0002a4
{
    public final l b;

    public void j(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       if (tb.v != null && !TextUtils.x(tb.u.mBigPicTargetUrl)) {
          tb.v.i(tb.u.mBigPicTargetUrl);
       }
       return;
    }
}
