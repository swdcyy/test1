package com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.a;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem$downloadFile$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import zsd.u;

public class IPackageDownloader$DownloadItem	// class@0015a0
{
    public final int a;
    public final p b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public void IPackageDownloader$DownloadItem(String p0,String p1,String p2,String p3,String p4,boolean p5){
       a.p(p0, "name");
       a.p(p1, "version");
       a.p(p2, "url");
       a.p(p3, "filePath");
       a.p(p4, "md5");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.a = (a.g(p2+p3)).hashCode();
       this.b = s.c(new IPackageDownloader$DownloadItem$downloadFile$2(this));
    }
    public final File a(){
       Object obj = PatchProxy.apply(null, this, IPackageDownloader$DownloadItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public int b(){
       return this.a;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, IPackageDownloader$DownloadItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (!(u.S1(this.e) ^ i) || (!(u.S1(this.f) ^ i) || !(u.S1(this.g) ^ i))) {
          i = false;
       }
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IPackageDownloader$DownloadItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DownloadItem: ===>"+"\nname = "+this.c+"\nversion = "+this.d+"\nurl = "+this.e+"\nfilePath = "+this.f+"\nmd5 = "+this.g+"\nwifiOnly = "+this.h+"\n===>";
    }
}
