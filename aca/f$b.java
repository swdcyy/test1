package aca.f$b;
import i69.h;
import aca.f;
import java.lang.Object;
import brd.v;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import crd.b;
import java.util.ArrayList;
import i69.g;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import com.kuaishou.logic.c;
import java.lang.Integer;
import brd.g;
import java.lang.IllegalStateException;
import java.lang.Enum;
import java.lang.Throwable;
import com.yxcorp.gifshow.v3.framework.KSStore;
import tvc.c;
import com.yxcorp.gifshow.editor.aicutv2.actions.VideoTemplateHideLoadingAction;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.g7;
import tvc.a;
import aca.f$b$a;
import java.lang.Runnable;
import ekd.k1;

public final class f$b implements h	// class@000091
{
    public v a;
    public final f b;

    public void f$b(f p0){
       this.b = p0;
       super();
    }
    public void a(v p0){
       this.a = p0;
    }
    public void b(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "4")) {
          return;
       }
       a.p(p0, "bitmap");
       Object[] objArray = new Object[0];
       a.D().s("VideoTemplateLoadingMW", "onFlashImage called bitmap="+p0, objArray);
       f$b tb = this.b;
       if (tb.d != null) {
          return;
       }
       if (tb.e == null) {
          tb.e = true;
          f j = tb.j;
          if (j != null && !j.isDisposed()) {
             j.dispose();
          }
          this.b.h.clear();
          this.b.f = 0;
       }
       this.b.h.add(p0);
       return;
    }
    public void c(){
       g.a(this);
    }
    public void d(String p0,int p1){
       g.k(this, p0, p1);
    }
    public void e(String p0,AICutErrorCode p1){
       g.h(this, p0, p1);
    }
    public void f(AICutErrorCode p0){
       f$b ta;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "5")) {
          return;
       }
       a.p(p0, "error");
       Object[] objArray = new Object[0];
       a.D().w("VideoTemplateLoadingMW", "onEnd\(\) called with: error = ["+p0+']', objArray);
       this.b.k.b();
       if (p0 == AICutErrorCode.NO_ERROR) {
          ta = this.a;
          if (ta != null) {
             ta.onNext(Integer.valueOf(100));
          }
          ta = this.a;
          if (ta != null) {
             ta.onComplete();
          }
       }else {
          ta = this.a;
          if (ta != null) {
             ta.onError(new IllegalStateException("VideoTemplateLoadingMW AICut init "+"loading failed due to "+p0.name()));
          }
       }
       if (p0 != AICutErrorCode.CANCEL_BY_USER) {
          KSStore kSStore = this.b.a();
          if (kSStore != null) {
             EditorDelegate uEditorDeleg = this.b.m.f();
             a.o(uEditorDeleg, "editorHelperContract.editorDelegate");
             kSStore.a(new VideoTemplateHideLoadingAction(p0, (g7.a(uEditorDeleg.N()) ^ 0x01)));
          }
       }
       return;
    }
    public void g(int p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.b.k.c(p0);
       uob = this.a;
       if (uob != null) {
          uob.onNext(Integer.valueOf(p0));
       }
       return;
    }
    public void h(String p0){
       g.f(this, p0);
    }
    public void i(String p0,String p1){
       g.g(this, p0, p1);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "3")) {
          return;
       }
       k1.r(new f$b$a(this), 0);
       return;
    }
    public void onFrameResult(Bitmap p0){
       g.d(this, p0);
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("VideoTemplateLoadingMW", "onStart\(\) called ", objArray);
       this.b.k.a();
       f$b ta = this.a;
       if (ta != null) {
          ta.onNext(Integer.valueOf(i));
       }
       return;
    }
}
