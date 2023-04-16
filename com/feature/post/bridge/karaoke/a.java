package com.feature.post.bridge.karaoke.a;
import og.k;
import com.feature.post.bridge.karaoke.b$a;
import java.lang.Object;
import r26.e;
import w26.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.feature.post.bridge.YodaUploadVideoResult;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.String;
import com.kwai.yoda.function.c;
import com.feature.post.bridge.karaoke.KtvErrorResult;
import o56.a;
import android.app.Application;

public class a implements k	// class@0014a1
{
    public final b$a a;

    public void a(b$a p0){
       this.a = p0;
       super();
    }
    public void b(e p0,c p1){
       p1.oO(this.a.k, p0);
    }
    public void c(e p0,c p1){
       p1.pV(this.a.k, p0);
    }
    public void d(Object p0){
       p0 = this.a;
       p0.o.l(p0.k, p0, p0.l, p0.m, null, p0.n);
    }
    public void e(){
       a ta = this.a;
       ta = this.a;
       ta.o.l(ta.k, new KtvErrorResult(0x4e21, a.B.getString(R.string.arg_RES_7f1042c6)), ta.l, ta.m, null, ta.n);
    }
    public void f(String p0){
       a ta = this.a;
       a ta1 = this.a;
       ta.o.l(ta.k, new KtvErrorResult(412, p0), ta1.l, ta1.m, null, ta1.n);
    }
}
