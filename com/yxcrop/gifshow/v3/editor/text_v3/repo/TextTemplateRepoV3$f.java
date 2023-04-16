package com.yxcrop.gifshow.v3.editor.text_v3.repo.TextTemplateRepoV3$f;
import erd.g;
import lod.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bod.a;
import d0c.a;
import d0c.b;
import xod.f;
import ood.d;
import nuc.a;
import ood.b;
import kotlin.jvm.internal.a;

public final class TextTemplateRepoV3$f implements g	// class@000c26
{
    public final a b;

    public void TextTemplateRepoV3$f(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepoV3$f.class, "1")) {
       }else if(p0.isEmpty()){
          this.b.r(new a(b.a(), f.a.c(), true));
          p0 = this.b.p();
          str = b.a().d();
          if (str == null) {
             str = "";
          }
          p0.u(str);
          this.b.t(Integer.MAX_VALUE);
       }else {
          b uob = this.b.n();
          int i = (uob != null)? uob.c(): 0;
          this.b.r(p0.get(i));
          str = p0.get(i).b().d();
          a.m(str);
          this.b.p().u(str);
          uob = this.b.n();
          if (uob != null) {
             a.o(p0, "it");
             uob.h(p0);
          }
       }
       return;
    }
}
