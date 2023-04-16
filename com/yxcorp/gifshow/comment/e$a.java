package com.yxcorp.gifshow.comment.e$a;
import sfc.a;
import com.yxcorp.gifshow.comment.e;
import android.content.Context;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.e$c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.retrofit.model.KwaiException;
import java.util.Iterator;
import java.util.Set;
import com.yxcorp.gifshow.comment.e$b;
import java.util.ArrayList;
import com.yxcorp.gifshow.comment.utils.d;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import aegon.chrome.net.NetworkException;
import com.yxcorp.gifshow.comment.d;
import com.yxcorp.gifshow.log.utils.b$a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class e$a extends a	// class@0010b5
{
    public final Activity c;
    public final QPhoto d;
    public final QComment e;
    public final e$c f;
    public final e g;

    public void e$a(e p0,Context p1,Activity p2,QPhoto p3,QComment p4,e$c p5){
       this.g = p0;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       this.g.m(this.c, this.d, this.e, this.f, p0);
       if (p0 instanceof KwaiException && p0.getErrorCode() == 0x20f62) {
          e$a tf = this.f;
          if (tf != null) {
             tf.d(this.e, p0);
          }
          Iterator iterator = this.g.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().n7(this.d, this.e, p0);
          }
          this.g.c.remove(this.e);
       }
       if (d.l(p0)) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100773));
       }else if(p0.getCause() instanceof NetworkException){
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       }else if(!ExceptionHandler.handleException(this.b, p0, d.b)){
          i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
       }
       return;
    }
}
