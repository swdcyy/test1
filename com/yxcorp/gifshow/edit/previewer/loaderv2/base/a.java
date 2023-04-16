package com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xf6.g;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Boolean;
import tba.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public abstract class a	// class@001b33
{
    public c a;
    public EditorSdk2V2$VideoEditorProject b;
    public c c;
    public c d;
    public a e;
    public boolean f;
    public long g;

    public void a(){
       super();
       this.f = false;
       this.g = System.currentTimeMillis();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       if (this.f == null || g.c()) {
          Object[] objArray = new Object[0];
          f.D().w("PreviewLoaderV2", this.getClass().getSimpleName()+" : "+p0, objArray);
       }
       return;
    }
    public void b(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       this.a = p0.a;
       this.b = p0.b;
       this.d = p0.e;
       this.e = p0.d;
       this.c(p0, p1);
       return;
    }
    public abstract void c(a$a p0,Object[] p1);
    public abstract void d();
    public void e(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.g = System.currentTimeMillis();
       if (this.f == null || (this.g() && p0)) {
          this.f = true;
          this.d();
       }
       a te = this.e;
       if (te != null) {
          te.b(this.getClass().getSimpleName(), (System.currentTimeMillis() - this.g));
       }
       Object[] objArray = new Object[0];
       f.D().s("PreviewLoaderV2", this.getClass().getSimpleName()+" load cost: "+(System.currentTimeMillis() - this.g), objArray);
       return;
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
    }
    public abstract int g();
}
