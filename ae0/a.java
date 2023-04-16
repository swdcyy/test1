package ae0.a;
import java.lang.Runnable;
import android.content.Context;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import nf6.i;
import android.net.Uri;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;

public final class a implements Runnable	// class@000063
{
    public final Context b;
    public final Ref$ObjectRef c;
    public final Ref$BooleanRef d;

    public void a(Context p0,Ref$ObjectRef p1,Ref$BooleanRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Intent intent = b.a(0x66dce92a).a(this.b, Uri.parse(this.c.element));
       a td = this.d;
       b = (intent != null)? true: false;
       td.element = b;
       if (intent != null) {
          c.i(this.b, intent);
       }
       return;
    }
}
