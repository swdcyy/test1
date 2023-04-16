package com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$e;
import erd.g;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class RemoteFontRepo$e implements g	// class@0010a8
{
    public final RemoteFontRepo$b b;

    public void RemoteFontRepo$e(RemoteFontRepo$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RemoteFontRepo$e.class, "1")) {
       }else {
          RemoteFontRepo$e tb = this.b;
          if (tb != null) {
             tb.a(new ArrayList());
          }
          Log.d("FontBIZ", "fetchConfigForEditFont error: "+p0.getMessage());
       }
       return;
    }
}
