package com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$f;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$b;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import brd.t;
import avc.a;
import avc.b;
import erd.g;
import crd.b;

public final class FontViewModel$f implements RemoteFontRepo$b	// class@00144d
{
    public final FontViewModel a;

    public void FontViewModel$f(FontViewModel p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FontViewModel$f.class, "1")) {
          return;
       }
       a.p(p0, "remoteFontConfigList");
       Object[] objArray = new Object[0];
       a.D().w("FontBIZ", "fetchConfig result size: "+p0.size(), objArray);
       FontViewModel$f ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, FontViewModel.class, "19")) {
          ta.o0(p0).subscribe(new a(ta), b.b);
       }
       p0.b = false;
       return;
    }
}
