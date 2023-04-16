package com.kwai.plugin.dva.install.remote.InnerPreDownloadWork;
import com.kwai.plugin.dva.work.FutureTaskWork;
import android.content.Context;
import java.lang.String;
import com.kwai.plugin.dva.install.remote.download.c;
import java.lang.Object;
import kotlin.jvm.internal.a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.plugin.dva.install.remote.InnerPreDownloadWork$doWork$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.io.File;
import nj7.c;
import zsd.u;
import java.lang.Boolean;
import com.kwai.plugin.dva.util.a;
import com.kwai.plugin.dva.install.remote.download.b;
import jj7.c;
import com.kwai.plugin.dva.install.remote.download.c$a;
import jj7.d;

public final class InnerPreDownloadWork extends FutureTaskWork	// class@001365
{
    public final Context i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final c n;

    public void InnerPreDownloadWork(Context p0,String p1,int p2,String p3,String p4,c p5){
       a.p(p0, "mContext");
       a.p(p1, "mName");
       a.p(p3, "mUrl");
       a.p(p4, "mMd5");
       a.p(p5, "mDownloader");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
    }
    public Object a(c p0){
       InnerPreDownloadWork$doWork$1 l$0;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       InnerPreDownloadWork innerPreDown = InnerPreDownloadWork.class;
       InnerPreDownloadWork$doWork$1 obj = PatchProxy.applyOneRefs(p0, this, innerPreDown, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 instanceof InnerPreDownloadWork$doWork$1) {
          obj = p0;
          InnerPreDownloadWork$doWork$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             obj.label = label - i;
          label_0025 :
             InnerPreDownloadWork$doWork$1 uodoWork$1 = obj;
             InnerPreDownloadWork$doWork$1 result = uodoWork$1.result;
             Object obj1 = b.h();
             label = uodoWork$1.label;
             i = 1;
             if (label != null) {
                if (label == i) {
                   l$0 = uodoWork$1.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                c.b(this.j, this.k);
                File uFile = c.a(this.j, this.k);
                b = false;
                if (u.q2(this.l, "asset://", b, 2, null)) {
                   return this.j;
                }else {
                   a.o(uFile, "apkPath");
                   Object obj2 = PatchProxy.applyOneRefs(uFile, this, innerPreDown, "2");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else if(uFile.exists() && uFile.isFile()){
                      String str = a.h(uFile);
                      if (str != null && a.g(str, this.m)) {
                         b = true;
                      }
                   }
                   if (b) {
                      return this.j;
                   }else {
                      InnerPreDownloadWork tn = this.n;
                      if (tn instanceof b) {
                         String absolutePath = uFile.getAbsolutePath();
                         a.o(absolutePath, "apkPath.absolutePath");
                         uodoWork$1.L$0 = this;
                         uodoWork$1.label = i;
                         if (tn.a(this.j, this.k, this.l, absolutePath, this.m, new c(this), uodoWork$1) == obj1) {
                            return obj1;
                         }
                      }else {
                         tn.d(this.j, this.k, this.l, uFile.getAbsolutePath(), this.m, new d(this));
                      }
                      tn = this;
                   }
                }
             }
             return l$0.j;
          }
       }
       obj = new InnerPreDownloadWork$doWork$1(this, p0);
       goto label_0025 ;
    }
}
