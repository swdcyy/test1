package com.facebook.imagepipeline.producers.t$a;
import id.k;
import com.facebook.imagepipeline.producers.t;
import id.i;
import id.c0;
import com.facebook.common.util.TriState;
import java.lang.Object;
import bd.d;
import ab.e;
import java.io.InputStream;
import com.facebook.imageformat.a;
import com.facebook.imageformat.b;
import nc.a;
import com.facebook.imagepipeline.nativecode.a;
import fd.e;
import id.b;
import java.util.Objects;
import com.facebook.imagepipeline.producers.s;
import id.e0;
import java.lang.String;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class t$a extends k	// class@001149
{
    public final c0 c;
    public TriState d;
    public final t e;

    public void t$a(t p0,i p1,c0 p2){
       this.e = p0;
       super(p1);
       this.c = p2;
       this.d = TriState.UNSET;
    }
    public void i(Object p0,int p1){
       TriState uNSET = TriState.UNSET;
       if (this.d == uNSET && p0 != null) {
          e.d(p0);
          a uoa = b.c(p0.k());
          if (a.a(uoa)) {
             a uoa1 = e.a();
             uNSET = (uoa1 == null)? TriState.NO: TriState.valueOf((uoa1.a(uoa) ^ 0x01));
          }else if(uoa == a.c){
             uNSET = TriState.NO;
          }
          this.d = uNSET;
       }
       if (this.d == TriState.NO) {
          this.n().d(p0, p1);
       }else if(b.e(p1)){
          if (this.d == TriState.YES && p0 != null) {
             t$a te = this.e;
             t$a tc = this.c;
             Objects.requireNonNull(te);
             e.d(p0);
             s os = new s(te, this.n(), tc.l(), tc, "WebpTranscodeProducer", d.a(p0));
             te.a.execute(p0);
          }else {
             this.n().d(p0, p1);
          }
       }
       return;
    }
}
