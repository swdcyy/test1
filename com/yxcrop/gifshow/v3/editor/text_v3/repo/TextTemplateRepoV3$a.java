package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$a;
import erd.a;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3;
import lod.a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import ood.d;
import q87.c;
import ood.b;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.RuntimeException;
import com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class TextTemplateRepoV3$a implements a	// class@000c1e
{
    public final TextTemplateRepoV3 b;
    public final a c;
    public final v d;

    public void TextTemplateRepoV3$a(TextTemplateRepoV3 p0,a p1,v p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextTemplateRepoV3$a.class, "1")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("TextTemplateRepoV3", "downloadTextTemplate downloaded textId:"+this.c.b(), objArray1);
       if (this.c.n() == null) {
          throw new RuntimeException("downloadTextTemplate templateJsonWrapper is null");
       }
       b uob = this.c.n();
       a.m(uob);
       this.b.f.put(this.c.b(), uob);
       b uob1 = this.c.n();
       if (uob1 == null || uob1.g() != true) {
          k1.o(new TextTemplateRepoV3$a$a(this));
          return;
       }else {
          this.c.v(objArray);
          throw new RuntimeException("downloadTextTemplate templateJsonWrapper is empty");
       }
    }
}
