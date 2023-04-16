package i31.a;
import android.view.View$OnClickListener;
import i31.f;
import com.kuaishou.livestream.message.nano.LiveTopUserForbidden$SCTopUserForbiddenDialog;
import android.app.Activity;
import java.lang.Object;
import android.view.View;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.String;
import vq5.d;
import android.content.Context;

public final class a implements View$OnClickListener	// class@002818
{
    public final f b;
    public final LiveTopUserForbidden$SCTopUserForbiddenDialog c;
    public final Activity d;

    public void a(f p0,LiveTopUserForbidden$SCTopUserForbiddenDialog p1,Activity p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       if (tb.r == null || (!TextUtils.isEmpty(tc.helpRouteUrl) && tb.r.P0(tc.helpRouteUrl))) {
          tb.r.r4(tc.helpRouteUrl, td);
       }
    label_0024 :
       return;
    }
}
