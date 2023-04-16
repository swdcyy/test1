package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$b;
import ooc.r0;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import java.lang.Object;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import com.yxcorp.gifshow.v3.editor.music_v2.action.CancelAutoMusicAction;
import xvc.b;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class MusicEditor$b implements r0	// class@001043
{
    public final MusicEditor b;

    public void MusicEditor$b(MusicEditor p0){
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
       MusicEditor$b uob = MusicEditor$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.b.T().t0(new CancelAutoMusicAction());
       return;
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
       q0.k(this, p0);
    }
    public void s(Bundle p0){
       q0.e(this, p0);
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
}
