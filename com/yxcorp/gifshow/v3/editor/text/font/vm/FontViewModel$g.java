package com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel$g;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Collection;
import brd.t;

public final class FontViewModel$g implements o	// class@001450
{
    public final FontViewModel b;

    public void FontViewModel$g(FontViewModel p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, FontViewModel$g.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.o0(new ArrayList(p0));
       }
       return ot;
    }
}
