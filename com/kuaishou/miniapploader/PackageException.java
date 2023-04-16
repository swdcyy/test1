package com.kuaishou.miniapploader.PackageException;
import java.io.IOException;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class PackageException extends IOException	// class@0009e7
{
    public final int code;

    public void PackageException(int p0,String p1){
       a.q(p1, "msg");
       super(p1);
       this.code = p0;
    }
    public final int getCode(){
       return this.code;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PackageException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+", code "+this.code;
    }
}
