package com.yxcorp.gifshow.share.weibo.a;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.IOException;

public final class a implements g	// class@001cac
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       throw new IOException("No Permission Granted!");
    }
}
