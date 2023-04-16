package com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$b;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo;
import xqc.f;
import wqc.b;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.io.File;
import xqc.g;
import qkd.b;
import java.lang.Integer;
import brd.g;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import voc.e0;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo$a$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import e17.i;

public final class EditFrameRepo$a implements PostTaskManager$b	// class@000f9e
{
    public final EditFrameRepo a;
    public final f b;
    public final b c;
    public final boolean d;
    public final v e;

    public void EditFrameRepo$a(EditFrameRepo p0,f p1,b p2,boolean p3,v p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(PostTaskManager$a p0){
       EditFrameRepo$a te;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditFrameRepo$a.class, "1")) {
          return;
       }
       a.p(p0, "task");
       if (a.g(p0.d(), this.b.d())) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("EditCanvasRepo", "downloadBG finished data:"+this.c+", isSilent="+this.d, objArray);
          g og = p0.b();
          if (og != null) {
             og = og.a;
             if (og != null) {
             label_005a :
                File uFile = new File(og);
                boolean b = b.S(uFile);
                Object[] objArray1 = new Object[i];
                a.D().w("EditCanvasRepo", "downloadBG finished resourceFileValid:"+b, objArray1);
                if (b) {
                   te = this.e;
                   if (te != null) {
                      te.onNext(Integer.valueOf(100));
                   }
                   te = this.e;
                   if (te != null) {
                      te.onComplete();
                   }
                }else {
                   this.a.a(p0.d());
                   RuntimeException runtimeExcep = new RuntimeException("downloadBG failed, resource path invalid: "+uFile.getAbsolutePath()+", backgroundId: "+p0.d());
                   ExceptionHandler.handleCaughtException(runtimeExcep);
                   te = this.e;
                   if (te != null) {
                      te.onError(runtimeExcep);
                   }
                }
             }
          }
          String str = "";
          goto label_005a ;
       }
    label_00cb :
       return;
    }
    public void b(PostTaskManager$a p0){
       e0.a(this, p0);
    }
    public void c(PostTaskManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditFrameRepo$a.class, "4")) {
          return;
       }
       a.p(p0, "task");
       e0.e(this, p0);
       if (a.g(p0.d(), this.b.d())) {
          k1.p(new EditFrameRepo$a$a(this), Integer.valueOf(0));
       }
       return;
    }
    public void d(PostTaskManager$a p0,int p1){
       EditFrameRepo$a uoa = EditFrameRepo$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       a.p(p0, "task");
       e0.d(this, p0, p1);
       if (a.g(p0.d(), this.b.d())) {
          int i = 100;
          if (p1 >= 0 && i >= p1) {
             uoa = this.e;
             if (uoa != null) {
                uoa.onNext(Integer.valueOf(p1));
             }
             Object[] objArray = new Object[0];
             a.D().w("EditCanvasRepo", "downloadBG processing, id="+p0.d()+" progress="+p1+", isSilent="+this.d, objArray);
          }
       }
       return;
    }
    public void e(PostTaskManager$a p0,boolean p1){
       EditFrameRepo$a uoa = EditFrameRepo$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3")) {
          return;
       }
       a.p(p0, "task");
       if (a.g(p0.d(), this.b.d())) {
          Object[] objArray = new Object[0];
          a.D().w("EditCanvasRepo", "downloadBG error, id="+p0.d()+" isSilent="+this.d, objArray);
          this.a.a(p0.d());
          RuntimeException runtimeExcep = new RuntimeException("downloadBG failed, backgroundId: "+p0.d());
          ExceptionHandler.handleCaughtException(runtimeExcep);
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          EditFrameRepo$a te = this.e;
          if (te != null) {
             te.onNext(Integer.valueOf(0));
          }
          te = this.e;
          if (te != null) {
             te.onError(runtimeExcep);
          }
       }
       return;
    }
}
