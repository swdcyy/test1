package com.yxcorp.gifshow.share.wechat.b;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.IOException;

public final class b implements g	// class@001ca6
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       throw new IOException("No Permission Granted!");
    }
}
