package com.yxcorp.gifshow.v3.editor.text.dynamic.repo.DynamicTextDownloadHelper$c;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lnc.i1;

public final class DynamicTextDownloadHelper$c implements g	// class@0013d9
{
    public static final DynamicTextDownloadHelper$c b;

    static {
       DynamicTextDownloadHelper$c.b = new DynamicTextDownloadHelper$c();
    }
    public void DynamicTextDownloadHelper$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTextDownloadHelper$c.class, "1")) {
       }else {
          i1.a("DynamicTextDownloadHelper", "download exception: "+p0.getMessage());
       }
       return;
    }
}
