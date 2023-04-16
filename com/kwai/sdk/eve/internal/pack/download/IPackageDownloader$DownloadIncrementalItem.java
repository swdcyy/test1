package com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadIncrementalItem;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.a;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadIncrementalItem$incrementalFile$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadIncrementalItem$baseFile$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import zsd.u;
import java.io.File;

public final class IPackageDownloader$DownloadIncrementalItem extends IPackageDownloader$DownloadItem	// class@00159d
{
    public final int i;
    public final p j;
    public final p k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public void IPackageDownloader$DownloadIncrementalItem(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,boolean p9){
       int i = this;
       Object obj = p2;
       Object obj1 = p3;
       Object obj2 = p5;
       Object obj3 = p6;
       Object obj4 = p7;
       Object obj5 = p8;
       a.p(p0, "name");
       Object obj6 = p1;
       a.p(obj6, "version");
       a.p(obj, "url");
       a.p(obj1, "filePath");
       Object obj7 = p4;
       a.p(obj7, "md5");
       a.p(obj2, "incrementalUrl");
       a.p(obj3, "incrementalFilePath");
       a.p(obj4, "incrementalMd5");
       a.p(obj5, "baseFilePath");
       super(p0, obj6, p2, p3, obj7, p9);
       i.l = obj2;
       i.m = obj3;
       i.n = obj4;
       i.o = obj5;
       i.i = (a.g(obj+obj2+obj1)).hashCode();
       i.j = s.c(new IPackageDownloader$DownloadIncrementalItem$incrementalFile$2(this));
       i.k = s.c(new IPackageDownloader$DownloadIncrementalItem$baseFile$2(this));
    }
    public int b(){
       return this.i;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, IPackageDownloader$DownloadIncrementalItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (!super.c() || (!(u.S1(this.o) ^ i) || (a.d(new File(this.o)) <= 0 || (!(u.S1(this.l) ^ i) || (!(u.S1(this.m) ^ i) || !(u.S1(this.n) ^ i)))))) {
          i = false;
       }
       return i;
    }
    public final File d(){
       Object obj = PatchProxy.apply(null, this, IPackageDownloader$DownloadIncrementalItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IPackageDownloader$DownloadIncrementalItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DownloadIncrementalItem: ===>"+"\nname = "+this.c+"\nversion = "+this.d+"\nurl = "+this.e+"\nfilePath = "+this.f+"\nmd5 = "+this.g+"\nincrementalUrl = "+this.l+"\nincrementalFilePath = "+this.m+"\nincrementalMd5 = "+this.n+"\nwifiOnly = "+this.h+"\n===>";
    }
}
