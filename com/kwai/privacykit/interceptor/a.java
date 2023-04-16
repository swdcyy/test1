package com.kwai.privacykit.interceptor.a;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import java.lang.Object;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import wk7.f;

public final class a implements ClipboardManager$OnPrimaryClipChangedListener	// class@0013cb
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void onPrimaryClipChanged(){
       ClipboardInterceptor.c = true;
       if (PatchProxy.applyVoid(null, null, ClipboardInterceptor.class, "3")) {
       }else {
          Iterator iterator = ClipboardInterceptor.a.keySet().iterator();
          while (iterator.hasNext()) {
             ClipboardManager$OnPrimaryClipChangedListener onPrimaryCli = iterator.next();
             if (onPrimaryCli != null) {
                f.a("ClipboardInterceptor", "dispatchOnPrimaryClipChange: ");
                onPrimaryCli.onPrimaryClipChanged();
             }
          }
       }
       return;
    }
}
