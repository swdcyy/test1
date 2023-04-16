package com.yxcorp.gifshow.upload.e0$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.e0;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.lang.Object;
import com.yxcorp.gifshow.upload.e0$c$a;
import com.yxcorp.gifshow.upload.e0$c$b;
import com.yxcorp.gifshow.upload.e0$c$c;
import com.yxcorp.gifshow.upload.e0$c$d;
import erd.g;
import cjd.a;
import com.yxcorp.gifshow.upload.e0$c$e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f36.b;
import dnc.q0;
import upb.a;
import upb.f;
import dnc.d2;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import com.yxcorp.gifshow.upload.e0$c$g;
import android.os.Handler;
import java.lang.System;
import com.yxcorp.gifshow.upload.e0$c$f;
import ojd.f;
import brd.t;
import cjd.e;
import erd.o;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class e0$c implements Runnable	// class@001e74
{
    public final LocalMusicUploadInfo b;
    public boolean c;
    public f d;
    public float e;
    public boolean f;
    public long g;
    public b h;
    public b i;
    public d0$a j;
    public g k;
    public g l;
    public g m;
    public g n;
    public final e0 o;

    public void e0$c(e0 p0,LocalMusicUploadInfo p1){
       this.o = p0;
       super();
       this.j = new e0$c$a(this);
       this.k = new e0$c$b(this);
       this.l = new e0$c$c(this);
       this.m = a.a(new e0$c$d(this));
       this.n = a.a(new e0$c$e(this));
       this.b = p1;
       q0 oq0 = PatchProxy.apply(null, this, e0$c.class, "1");
       if (oq0 != PatchProxyResult.class) {
       }else {
          oq0 = new q0(p0.a, f.a());
       }
       this.h = oq0;
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e0$c.class, "5")) {
          return;
       }
       e0$c tb = this.b;
       tb.mStatus = IUploadInfo$Status.CANCELED;
       this.o.c(tb);
       this.o.b.post(new e0$c$g(this));
       this.o.a.b("", "", this.g, this.b);
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e0$c.class, "2")) {
          return;
       }
       if (this.c != null) {
          e0$c tb = this.b;
          tb.mStatus = IUploadInfo$Status.CANCELED;
          this.o.c(tb);
          return;
       }else {
          this.g = System.currentTimeMillis();
          this.b.mStatus = IUploadInfo$Status.UPLOADING;
          e0$c$f uoc$f = new e0$c$f(this);
          this.d = uoc$f;
          this.o.c(this.b);
          this.i = this.h.a(this.b, uoc$f).doOnNext(this.m).doOnError(this.k).doOnError(this.n).map(new e()).subscribe(this.l, Functions.d());
          return;
       }
    }
}
