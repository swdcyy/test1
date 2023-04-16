package com.yxcorp.gifshow.album.widget.preview.c$e;
import erd.g;
import com.yxcorp.gifshow.album.widget.preview.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class c$e implements g	// class@001b30
{
    public final c b;

    public void c$e(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, "1")) {
       }else {
          Log.g("ImagePreviewItem", "getView error="+p0.getMessage());
       }
       return;
    }
}
