package com.yxcorp.gifshow.v3.editor.cover.k;
import com.kuaishou.android.post.session.previewtasks.GraphTask;
import com.yxcorp.gifshow.v3.editor.cover.k$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qaa.a;
import haa.a;
import hba.a;
import ppc.k;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.kwai.flash.Flash$Type;

public class k extends GraphTask	// class@000e7b
{

    public void k(k$a p0){
       super(p0);
    }
    public String[] e(){
       String[] obj = PatchProxy.apply(null, this, k.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("CoverMTNSTask", "dependOn isPicturesType:"+this.r(), objArray);
       if (!this.r()) {
          return super.e();
       }
       obj = new String[]{"PhotosCropWorkCountDownNSTask"};
       return obj;
    }
    public Object key(){
       return "CoverMTNSTask";
    }
    public synchronized void m(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       super.m();
       Object[] objArray = new Object[0];
       a.D().w("CoverMTNSTask", "realRun", objArray);
       k.c(a.f(this.b.c), a.r(this.b.c));
       return;
    }
    public final boolean r(){
       Object obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.E(this.b.c.a1());
    }
    public Flash$Type type(){
       return Flash$Type.MAIN;
    }
}
