package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e$c;
import c26.a;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e;
import brd.v;
import java.lang.Object;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qca.a;
import java.lang.Enum;
import java.lang.Throwable;
import brd.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e$c$a;
import java.lang.Runnable;
import ekd.k1;
import b26.b$a;
import java.lang.Float;

public final class CompressAndEncodePluginImpl$e$c implements a	// class@000d41
{
    public final CompressAndEncodePluginImpl$e a;
    public final v b;

    public void CompressAndEncodePluginImpl$e$c(CompressAndEncodePluginImpl$e p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(EncodeInfo$Status p0,EncodeInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CompressAndEncodePluginImpl$e$c.class, "1")) {
          return;
       }
       a.p(p0, "status");
       a.p(p1, "encodeInfo");
       if (this.a.c != p1.mId) {
          return;
       }
       int i = a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                this.b.onError(new Throwable());
             }
          }else {
             this.b.onError(new Throwable());
          }
       }else if(!TextUtils.n(this.a.d, p1.getOutputPath())){
          File uFile = new File(this.a.d);
          if (uFile.exists()) {
             b.q(uFile);
          }
          StringBuilder str = "waitEncodeProgress\(\) "+this.a.d+' '+uFile;
          b.W(new File(p1.getOutputPath()), uFile);
          k1.o(new CompressAndEncodePluginImpl$e$c$a(uFile));
       }
       this.b.onNext(new b$a(new File(p1.getOutputPath()), 0x3f800000, true));
       this.b.onComplete();
       return;
    }
    public void b(float p0,EncodeInfo p1){
       CompressAndEncodePluginImpl$e$c uoe$c = CompressAndEncodePluginImpl$e$c.class;
       if (PatchProxy.isSupport(uoe$c) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, uoe$c, "2")) {
          return;
       }
       a.p(p1, "encodeInfo");
       this.b.onNext(new b$a(new File(p1.getOutputPath()), p0, false));
       return;
    }
}
