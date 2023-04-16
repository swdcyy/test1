package com.yxcorp.gifshow.v3.y;
import roc.g;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import roc.e;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import roc.f;
import yvc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ooc.g;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.kwai.feature.post.funnel.PostCommonFunnel;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import faa.a;
import q87.c;
import java.util.Objects;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.util.Iterator;
import ooc.o0;
import java.lang.Runnable;
import ekd.k1;

public class y implements g	// class@00167d
{
    public EditorManager a;
    public c b;
    public Workspace$Type c;
    public Workspace$Source d;
    public e e;
    public Runnable f;

    public void y(EditorManager p0,c p1,Workspace$Type p2,Workspace$Source p3,BaseEditPreviewFragmentViewBinder p4){
       super();
       this.f = null;
       this.b = p1;
       this.a = p0;
       this.c = p2;
       this.d = p3;
       e uoe = p4.y(p0, p2, p3, p0.m());
       this.e = uoe;
       uoe.b(this);
    }
    public void a(View p0,int p1,RecyclerView$ViewHolder p2){
       f.a(this, p0, p1, p2);
    }
    public void b(a p0,int p1,RecyclerView$ViewHolder p2){
       if (PatchProxy.isSupport(y.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, y.class, "1")) {
          return;
       }
       this.e(p0.a());
       PostCommonFunnel.b.b(p2.itemView, p0.c());
       return;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, y.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.j();
    }
    public List d(){
       Object obj = PatchProxy.apply(null, this, y.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.l();
    }
    public void e(EditorItemFunc p0){
       boolean b;
       a uoa;
       boolean b1;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y oy = y.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oy, "2")) {
          return;
       }
       if (this.a.m().getContext().isFinishing()) {
          ExceptionHandler.handleCaughtException(new IllegalStateException("EditorItemLayoutManager selectEditor "+p0+" in activity finishing"));
          return;
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("BaseEditorListController", "onAdapterItemSelected: model:"+p0, objArray);
          y ta = this.a;
          Objects.requireNonNull(ta);
          objArray = null;
          View obj = PatchProxy.apply(objArray, ta, EditorManager.class, "52");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!ta.b.getAlpha() && ta.o != null){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             this.a.h(i);
             uoa = 1;
          }else {
             uoa = null;
          }
          Object obj1 = PatchProxy.apply(objArray, this, oy, "16");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             Iterator iterator = this.e.d().iterator();
             while (true) {
                float f = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      if (f || !obj.getAlpha() - 0x3f800000) {
                         f = Float.MIN_VALUE;
                      }else {
                         continue ;
                      }
                   }else {
                      b1 = f;
                   }
                }
             }
          }
          if (!b1) {
             return;
          }else if(uoa){
             l = 200;
          }else {
             l = 0;
          }
          Object[] objArray1 = new Object[i];
          a.D().w("BaseEditorListController", "onAdapterItemSelected: selectedModel:"+p0+", delay:"+l, objArray1);
          o0 oo0 = new o0(this, p0);
          this.f = oo0;
          k1.r(oo0, l);
          return;
       }
    }
}
