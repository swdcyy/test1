package com.yxcorp.gifshow.v3.editor.prettify.makeup.g;
import n0c.c;
import java.util.ArrayList;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import faa.a;
import q87.c;
import ooc.d;
import lnc.l8;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import t45.d;
import brd.z;
import vsc.h;
import erd.o;
import cjd.e;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.f;

public class g extends c	// class@00119a
{
    public EditorSdk2V2$VideoEditorProject f;
    public final List g;

    public void g(){
       super();
       this.g = new ArrayList();
    }
    public t b(){
       t obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f != null || !this.g.isEmpty()) {
          obj = d.a.a(this.f, this.g, l8.f.b(), 3);
       }else {
          Object[] objArray = new Object[0];
          a.D().w("EditRecoMakeupSuitesRequest", "project is null and assets is empty", objArray);
          obj = t.just("");
       }
       return obj.observeOn(d.c).flatMap(new h(this)).map(new e()).map(f.b);
    }
}
