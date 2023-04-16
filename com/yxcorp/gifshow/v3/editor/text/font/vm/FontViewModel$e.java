package com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostUtils;

public final class FontViewModel$e implements g	// class@00144c
{
    public static final FontViewModel$e b;

    static {
       FontViewModel$e.b = new FontViewModel$e();
    }
    public void FontViewModel$e(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontViewModel$e.class, "1")) {
       }else {
          PostUtils.D("FontBIZ", "fontDownloadHelper", p0);
       }
       return;
    }
}
