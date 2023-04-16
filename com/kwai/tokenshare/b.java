package com.kwai.tokenshare.b;
import com.kwai.tokenshare.b$b;
import java.lang.Object;
import com.kwai.tokenshare.b$a;
import android.app.Application;
import o56.a;
import java.lang.String;
import android.content.ClipboardManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bu7.l;
import q87.c;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import java.lang.Exception;

public class b	// class@00191b
{
    public final ClipboardManager a;
    public boolean b;
    public long c;
    public final b$b d;
    public ClipboardManager$OnPrimaryClipChangedListener e;

    public void b(b$b p0){
       super();
       this.b = false;
       this.c = 0;
       this.e = new b$a(this);
       this.a = a.b().getSystemService("clipboard");
       this.d = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       l.C().w("ClipboardMonitor", "stop", objArray);
       if (this.b != null) {
          b ta = this.a;
          if (ta != null) {
             this.b = i;
             try{
                ClipboardInterceptor.removePrimaryClipChangedListener(ta, this.e);
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
}
