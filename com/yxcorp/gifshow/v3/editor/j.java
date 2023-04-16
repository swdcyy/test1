package com.yxcorp.gifshow.v3.editor.j;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.yxcorp.gifshow.v3.editor.j$a;
import voc.o;
import uwc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import lwc.f;
import aw9.c0;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import pwc.c;
import java.io.IOException;

public abstract class j extends BaseEditor	// class@000fb7
{
    public EditorSdk2V2$VideoEditorProject o;
    public EditorSdk2V2$VideoEditorProject p;
    public f q;
    public f r;
    public final i s;

    public void j(){
       super();
       this.s = new j$a(this);
    }
    public void Q(o p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "2")) {
          return;
       }
       p0.k(this.q);
       return;
    }
    public void R(o p0,VideoSDKPlayerView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "3")) {
          return;
       }
       p0.m(this.o);
       p1.setVideoProject(this.o, true);
       f.a(this.o, this.q);
       p0.k(this.q);
       return;
    }
    public void S(o p0,c0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "1")) {
          return;
       }
       if (f.E(this.i().getType())) {
          f uof = p0.d();
          this.r = uof;
          this.q = uof.b(this);
       }else {
          this.r = p0.d();
          EditorSdk2V2$VideoEditorProject videoEditorP = p0.f();
          try{
             this.p = videoEditorP;
             this.q = this.r.b(this);
             this.o = p1.a().snapCurrentProject();
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e3){
             e3.printStackTrace();
          }
       }
    }
}
