package com.yxcorp.gifshow.comment.c;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import com.yxcorp.gifshow.comment.e;
import android.app.Activity;
import ek9.a;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.e$c;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$Status;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import ek9.m1;
import java.lang.StringBuilder;
import q87.c;
import crd.b;
import java.lang.Throwable;
import com.ks.ksuploader.KSUploaderCloseReason;
import com.kwai.video.ksuploaderkit.UploadResponse;

public class c implements KSUploaderKitEventListener	// class@00109b
{
    public final Activity a;
    public final a b;
    public final String c;
    public final String d;
    public final List e;
    public final QComment f;
    public final QPhoto g;
    public final e$c h;
    public final KSUploaderKit i;
    public final e j;

    public void c(e p0,Activity p1,a p2,String p3,String p4,List p5,QComment p6,QPhoto p7,e$c p8,KSUploaderKit p9){
       this.j = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       super();
    }
    public void onComplete(KSUploaderKitCommon$Status p0,int p1,String p2){
       c uoc = this;
       int i = p0;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       m1.C().w("CommentHelper", "onComplete: status£º "+p0+" i : "+p1+" s: "+p2, objArray);
       if (i == KSUploaderKitCommon$Status.Success) {
          uoc.j.a(uoc.a, uoc.b, uoc.c, uoc.d, uoc.e, uoc.f);
       }else {
          uoc.j.m(uoc.a, uoc.g, uoc.f, uoc.h, new Throwable("picture upload fail"));
       }
       uoc.i.release();
       return;
    }
    public void onProgress(double p0){
    }
    public void onStateChanged(KSUploaderKitCommon$Status p0){
    }
    public void onUploadFinished(KSUploaderCloseReason p0,UploadResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       m1.C().w("CommentHelper", "onUploadFinished", objArray);
       return;
    }
}
