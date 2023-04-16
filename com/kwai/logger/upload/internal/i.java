package com.kwai.logger.upload.internal.i;
import erd.g;
import v87.d;
import java.lang.String;
import java.lang.Object;
import v87.b;
import t87.d;
import w87.j;
import w87.a;
import w87.e;
import java.lang.Runnable;
import f97.a;
import com.kwai.logger.upload.model.ActionResponse;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public final class i implements g	// class@000ed4
{
    public final d b;
    public final int c;
    public final String d;

    public void i(d p0,int p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       i td = this.d;
       d.a("ObiwanUploader", "notify end...");
       j.a().h(tb.a);
       if (tc == 100) {
          j oj = j.a();
          d a = tb.a;
          if (oj.p(oj.b)) {
             a uoa = oj.e(a);
             if (uoa != null) {
                a.a(new e(oj, uoa));
             }
          }
       }else {
          j.a().o(tb.a, tc, td);
       }
       p0 = p0.a().mFileDownloadUrl;
       if (!TextUtils.isEmpty(p0)) {
          d.a("ObiwanUploader", tb.a+" ,ktp file download url : "+p0);
       }
       return;
    }
}
