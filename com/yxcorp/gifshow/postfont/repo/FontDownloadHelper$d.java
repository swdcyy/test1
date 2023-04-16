package com.yxcorp.gifshow.postfont.repo.FontDownloadHelper$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lnc.i1;

public final class FontDownloadHelper$d implements g	// class@00109f
{
    public static final FontDownloadHelper$d b;

    static {
       FontDownloadHelper$d.b = new FontDownloadHelper$d();
    }
    public void FontDownloadHelper$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontDownloadHelper$d.class, "1")) {
       }else {
          i1.a("FontBIZ", "download exception: "+p0.getMessage());
       }
       return;
    }
}
