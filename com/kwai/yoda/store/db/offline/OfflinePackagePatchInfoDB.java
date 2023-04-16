package com.kwai.yoda.store.db.offline.OfflinePackagePatchInfoDB;
import com.kwai.yoda.store.db.offline.OfflinePackagePatchInfoDB$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class OfflinePackagePatchInfoDB	// class@0012f0
{
    public final String md5;
    public String patchPackageUrl;
    public int sourceVersion;
    public static final OfflinePackagePatchInfoDB$a a;

    static {
       OfflinePackagePatchInfoDB.a = new OfflinePackagePatchInfoDB$a(null);
    }
    public void OfflinePackagePatchInfoDB(String p0){
       a.q(p0, "md5");
       super();
       this.md5 = p0;
       this.patchPackageUrl = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OfflinePackagePatchInfoDB.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof OfflinePackagePatchInfoDB && a.g(this.md5, p0.md5))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       OfflinePackagePatchInfoDB obj = PatchProxy.apply(null, this, OfflinePackagePatchInfoDB.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.md5;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, OfflinePackagePatchInfoDB.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OfflinePackagePatchInfoDB\(md5="+this.md5+"\)";
    }
}
