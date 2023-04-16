package com.yxcorp.gifshow.v3.editor.enhancefilter.b$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import w46.b;
import com.yxcorp.gifshow.util.PostUtils;

public final class b$b implements g	// class@000f85
{
    public static final b$b b;

    static {
       b$b.b = new b$b();
    }
    public void b$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().t("EnhanceFilterViewModel", p0.getMessage(), objArray);
          PostUtils.D("EnhanceFilterViewModel", "mModelDownloadHelper startDownload", p0);
       }
       return;
    }
}
