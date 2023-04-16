package d59.c$b;
import android.view.View$OnClickListener;
import d59.c;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.ClipboardManager;
import java.lang.CharSequence;
import android.content.ClipData;
import uv8.h1;
import e17.i;

public final class c$b implements View$OnClickListener	// class@002044
{
    public final c b;
    public final String c;

    public void c$b(c p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       Context context = this.b.getContext();
       context = (context != null)? context.getSystemService("clipboard"): null;
       if (context != null) {
          context.setPrimaryClip(ClipData.newPlainText("", this.c));
          h1.a.d("¸´ÖÆ³É¹¦");
       }
       return;
    }
}
