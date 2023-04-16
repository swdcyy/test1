package com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$b;
import java.lang.Runnable;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import java.util.List;
import java.lang.String;
import gb7.c;
import java.lang.Object;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import fb7.a$a;
import java.lang.Integer;
import java.util.Map;
import gb7.a;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper$b$a;
import ib7.a;
import c0d.d;
import kotlin.Pair;
import qrd.r0;
import trd.s0;
import gb7.d;

public final class BaseResourceDownloadHelper$b implements Runnable	// class@000f45
{
    public final BaseResourceDownloadHelper b;
    public final DownloadConfig c;
    public final int d;
    public final List e;
    public final String f;
    public final c g;
    public final String h;

    public void BaseResourceDownloadHelper$b(BaseResourceDownloadHelper p0,DownloadConfig p1,int p2,List p3,String p4,c p5,String p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       BaseResourceDownloadHelper$b tc = this.c;
       Objects.requireNonNull(this.b);
       a.p(tc, "downloadConfig");
       File saveFile = tc.getSaveFile();
       if (saveFile != null) {
          saveFile.delete();
       }
       saveFile = tc.getUnzipFolder();
       if (saveFile != null) {
          saveFile.delete();
       }
       if (this.d >= this.e.size()) {
          this.b.g().remove(this.f);
          return;
       }else {
          a$a uoa = this.e.get(this.d);
          if (uoa != null) {
             this.b.g().put(this.f, Integer.valueOf(this.d));
             BaseResourceDownloadHelper$b tc1 = this.c;
             a uoa1 = this.b.e().get(this.f);
             if (uoa1 == null) {
                uoa1 = tc1.getListenerDelegate();
             }
             BaseResourceDownloadHelper$b$a uob$a = new BaseResourceDownloadHelper$b$a(this);
             Objects.requireNonNull(uoa1);
             a.p(uob$a, "listener");
             uoa1.a.add(uob$a);
             Objects.requireNonNull(a.b);
             a.p(uoa, "urlSource");
             a$a b = uoa.b;
             Map map = (b != null)? s0.k(r0.a("HOST", b.b)): null;
             this.b.f().remove(this.f);
             this.b.f().put(this.f, this.b.f.b(uoa.c, this.c, this.h, map, uoa1));
             this.b.e().remove(this.f);
             this.b.e().put(this.f, uoa1);
          }
          return;
       }
    }
}
