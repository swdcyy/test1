package com.yxcorp.gifshow.v3.editor.prettify.makeup.c$a;
import voc.y;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import qr4.k$g;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.util.List;
import qr4.k$g$a;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a$a;
import com.yxcorp.gifshow.prettify.makeup.m;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import p0c.f;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import voc.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import vsc.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import msd.l;
import com.yxcorp.gifshow.edit.draft.util.VideoContextDraftExtKt;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;

public class c$a implements y	// class@001191
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       x.d(this);
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditMakeupPresenter", "discardEditChanges", objArray);
       c v = this.b.v;
       if (v != null) {
          v.eh();
       }
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("EditMakeupPresenter", "saveEditorChanges", objArray);
       c v = this.b.v;
       if (v != null) {
          v.eh();
       }
       v = this.b.z;
       if (v == null) {
          return;
       }else {
          k$g og = new k$g();
          og.a = v.a;
          og.f = v.g;
          k$g$a[] og$aArray = new k$g$a[v.c.size()];
          og.b = og$aArray;
          Iterator iterator = v.c.iterator();
          while (iterator.hasNext()) {
             a$a uoa = iterator.next();
             og.b[i] = new k$g$a();
             k$g b = og.b;
             b[i].c = uoa.e;
             b[i].b = uoa.c;
             b[i].a = uoa.a;
             i = i + 1;
          }
          m om = this.b.S8();
          MakeupSuite makeupSuite = om.h(v.a);
          if (makeupSuite == null) {
             ExceptionHandler.handleCaughtException(new Throwable("EditMakeupPresenter null suit for "+v.a+", inited "+om.l()));
          }else {
             og.e = makeupSuite.inPresetState(this.b.y.a());
          }
          this.b.r.f().x().e().N0(og);
          VideoContextDraftExtKt.c(this.b.r.f().x().e(), this.b.t, new c(om));
          this.b.r.f().x().e().O0(((v.a).equals("-10") ^ 0x01));
          v = this.b.x;
          if (v != null && v.getFilterItemList().getAdapter() != null) {
             this.b.x.getFilterItemList().getAdapter().k0();
          }
          return;
       }
    }
    public void z2(){
       x.c(this);
    }
}
