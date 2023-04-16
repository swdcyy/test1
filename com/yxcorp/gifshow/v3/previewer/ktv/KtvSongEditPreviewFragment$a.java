package com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment$a;
import ooc.r0;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
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
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.previewer.ktv.c0;
import com.yxcorp.gifshow.v3.previewer.ktv.c0$b;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import mwc.t0;
import mwc.s0;
import java.util.concurrent.Callable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class KtvSongEditPreviewFragment$a implements r0	// class@0015af
{
    public final KtvSongEditPreviewFragment b;

    public void KtvSongEditPreviewFragment$a(KtvSongEditPreviewFragment p0){
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
       KtvSongEditPreviewFragment$a uoa = KtvSongEditPreviewFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       ArrayList uArrayList = new ArrayList();
       FragmentActivity activity = this.b.getActivity();
       if (activity != null) {
          uArrayList.add(new c0(new c0$b(this.b.M, new t0(this), new s0(this), activity)));
       }
       return uArrayList;
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
