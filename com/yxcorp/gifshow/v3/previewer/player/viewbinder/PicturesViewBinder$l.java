package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$l;
import ooc.r0;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.PreviewTextureView;

public final class PicturesViewBinder$l implements r0	// class@0015f8
{
    public final PicturesViewBinder b;

    public void PicturesViewBinder$l(PicturesViewBinder p0){
       this.b = p0;
       super();
    }
    public void Z(){
       q0.q(this);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       q0.o(this, p0);
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       q0.a(this, p0);
    }
    public List f(){
       return q0.c(this);
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       return q0.b(this, p0, p1);
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       q0.n(this, p0, p1, p2, p3, p4);
    }
    public void onActivityDestroy(){
       q0.f(this);
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       PicturesViewBinder$l ol = PicturesViewBinder$l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ol, "2")) {
          return;
       }
       q0.k(this, p0);
       this.b.k.setBackgroundColor(0xff000000);
       return;
    }
    public void s(Bundle p0){
       q0.e(this, p0);
    }
    public void u(boolean p0,String p1){
       PicturesViewBinder$l ol = PicturesViewBinder$l.class;
       if (PatchProxy.isSupport(ol) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ol, "1")) {
          return;
       }
       q0.d(this, p0, p1);
       if (!p0 && a.g(p1, "CoverGenerateNSTask")) {
          Object[] objArray = new Object[0];
          a.D().w("PicturesViewBinder", "nextStepProcess cover generate ok", objArray);
          PicturesViewBinder$l tb = this.b;
          tb.u = true;
          PicturesViewBinder t = tb.t;
          if (t != null) {
             t.setPreviewPlayer(null);
          }
       }
       return;
    }
}
