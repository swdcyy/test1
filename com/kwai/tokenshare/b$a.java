package com.kwai.tokenshare.b$a;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import com.kwai.tokenshare.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.content.ClipboardManager;
import android.content.ClipData;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import android.content.ClipData$Item;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import bu7.l;
import java.lang.StringBuilder;
import q87.c;
import bu7.g;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import bu7.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class b$a implements ClipboardManager$OnPrimaryClipChangedListener	// class@001919
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void onPrimaryClipChanged(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       if (this.a.b != null) {
          b$a ta = this.a;
          if ((System.currentTimeMillis() - ta.c) - 2000 < 0) {
             b a = ta.a;
             if (a != null && a.hasPrimaryClip()) {
                ClipData primaryClip = ClipboardInterceptor.getPrimaryClip(this.a.a);
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                   int i = 0;
                   ClipData$Item itemAt = primaryClip.getItemAt(i);
                   if (itemAt != null && itemAt.getText() != null) {
                      String str = itemAt.getText().toString();
                      if (!TextUtils.x(str)) {
                         Object[] objArray = new Object[i];
                         l.C().w("ClipboardMonitor", "addedText is "+str, objArray);
                         t.fromCallable(new g(str)).subscribeOn(d.c).observeOn(d.a).subscribe(new f(this, str), Functions.d());
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
