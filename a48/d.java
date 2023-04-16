package a48.d;
import android.view.View$OnLongClickListener;
import com.mini.about.ui.AboutFragment;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.content.Context;
import androidx.fragment.app.Fragment;
import zi8.k;
import android.content.ClipboardManager;
import android.content.ClipData;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipData$Item;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import om.f;
import om.p;

public class d implements View$OnLongClickListener	// class@000028
{
    public final AboutFragment b;

    public void d(AboutFragment p0){
       this.b = p0;
       super();
    }
    public boolean onLongClick(View p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       Context context = this.b.getContext();
       Object obj = PatchProxy.applyOneRefs(context, null, k.class, "2");
       if (obj != patchProxyRe) {
       }else if(context == null){
          ClipboardManager systemServic = context.getSystemService("clipboard");
          if (systemServic.hasPrimaryClip()) {
             ClipData primaryClip = ClipboardInterceptor.getPrimaryClip(systemServic);
             if (primaryClip != null) {
                obj = primaryClip.getItemAt(false).getText().toString();
             }
          }
       }
       obj = null;
       if (!TextUtils.isEmpty(obj)) {
          p.c(this.b.getString(R.string.arg_RES_7f10357d), null);
       }
       return false;
    }
}
