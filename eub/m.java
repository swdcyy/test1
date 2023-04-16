package eub.m;
import ooc.r0;
import eub.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.lang.Object;
import ooc.q0;
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
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import y26.b$a;
import android.content.Context;
import lnc.a1;
import eub.i$a;
import android.content.Intent;
import c26.c;
import uwc.f;
import java.util.Collection;
import uxb.a;
import uxb.l;
import uxb.d;
import tkd.b;
import tkd.d;
import uxb.u;
import uxb.g;
import uxb.s;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class m implements r0	// class@00282d
{
    public final i b;
    public final c c;
    public final b$a d;

    public void m(i p0,c p1,b$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
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
       ArrayList obj;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, om, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "nextStepTaskManager");
       obj = new ArrayList();
       EditorSdk2V2$VideoEditorProject project = this.d.getProject();
       a.m(project);
       om = this.b;
       i$a uoa = om.k();
       obj.addAll(f.y0(p0, this.c, project, new b$a(a1.c()), om.c, uoa, this.d, null, null));
       project = this.d.getProject();
       a.m(project);
       obj.addAll(l.a().AV(p0, this.c, project, this.b.k()));
       project = this.d.getProject();
       a.m(project);
       obj.addAll(d.a(-1527502188).AV(p0, this.c, project, this.b.k()));
       project = this.d.getProject();
       a.m(project);
       obj.addAll(l.c().AV(p0, this.c, project, this.b.k()));
       project = this.d.getProject();
       a.m(project);
       obj.addAll(l.j().AV(p0, this.c, project, this.b.k()));
       Object[] objArray = new Object[0];
       a.D().w("EditPageNoUiPublishStageImpl", "upload buildNextStepTaskList resultList:"+obj, objArray);
       return obj;
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
