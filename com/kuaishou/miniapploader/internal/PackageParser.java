package com.kuaishou.miniapploader.internal.PackageParser;
import java.lang.String;
import java.lang.Object;
import dn4.c$a;
import dn4.c;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kuaishou.miniapploader.PackageException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import en4.a;

public class PackageParser	// class@0009ec
{
    public long a;

    public void PackageParser(String p0,int p1,int p2){
       super();
       c.a(null);
       if (!p2 || (p2 != 1 && p2 != 2)) {
          throw new IllegalArgumentException("Illegal read type "+p2);
       }
       this.a = this.nativeInit(p0, p1, p2);
       return;
    }
    public PackageException a(){
       a obj = PatchProxy.apply(null, this, PackageParser.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Gson().h(this.nativeGetException(this.a), a.class);
       return new PackageException(obj.code, obj.msg);
    }
    public native final byte[] nativeGetCombinedFileData(long p0,String p1);
    public native final String nativeGetException(long p0);
    public native final int nativeGetFileCount(long p0);
    public native final byte[] nativeGetFileData(long p0,String p1);
    public native final String[] nativeGetFileNames(long p0);
    public native final int nativeGetFileSize(long p0,String p1);
    public native final byte nativeGetPackageVersion(long p0);
    public native final long nativeInit(String p0,int p1,int p2);
    public native final boolean nativeParse(long p0);
    public native final void nativeRelease(long p0);
}
