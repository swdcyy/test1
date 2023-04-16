package com.kwai.library.rickon.a;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicReference;
import ln.b;
import java.lang.String;
import ry6.e;
import java.lang.Object;
import brd.v;
import com.ks.ksuploader.KSFileUploader;
import ekd.e0;
import ry6.c;
import android.content.Context;
import com.ks.ksapi.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.ks.ksuploader.KSUploader;
import ry6.d;
import com.ks.ksuploader.KSUploaderEventListener;
import ry6.a;
import erd.f;
import com.kwai.library.rickon.RxRickonException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import brd.g;
import com.yxcorp.utility.Log;

public final class a implements g	// class@0008df
{
    public final AtomicReference b;
    public final b c;
    public final String d;
    public final e e;
    public final String f;

    public void a(AtomicReference p0,b p1,String p2,e p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void subscribe(v p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       a tf = this.f;
       tb.set(new KSFileUploader(e0.b, new c(tc)));
       if (!TextUtils.x(td)) {
          tb.get().setConfig(td);
       }
       tb.get().setEventListener(new d(te, p0, tc));
       p0.setCancellable(new a(tf, tb));
       int i = tb.get().startUploadFile(te.a, te.d, false);
       if (i) {
          p0.onError(new RxRickonException("rickon failed startUploadFile error="+i));
       }
       Log.b("RxRickon", "uploadFileNoResume: do rickon upload ret="+i);
       return;
    }
}
