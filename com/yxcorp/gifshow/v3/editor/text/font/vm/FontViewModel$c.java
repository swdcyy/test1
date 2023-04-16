package com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$c;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import di0.b;

public final class FontViewModel$c implements o	// class@001449
{
    public final FontViewModel b;

    public void FontViewModel$c(FontViewModel p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FontViewModel$c.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.D().s("FontBIZ", "load config finish, size is: "+p0.size(), objArray);
          b.t(this.b.w0(), p0, null, 2, null);
          this.b.p0();
       }
       return p0;
    }
}
