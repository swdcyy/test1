package com.yxcorp.gifshow.albumwrapper.imagecrop.c;
import io.reactivex.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import java.lang.Object;
import brd.v;
import mz6.b;
import android.content.Context;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import java.util.Collection;
import ekd.q;
import z79.c;
import android.content.DialogInterface$OnClickListener;
import z79.a;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;

public final class c implements g	// class@001b65
{
    public final ImageSelectSupplier b;

    public void c(ImageSelectSupplier p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       c tb = this.b;
       b uob = new b(tb.m);
       int[] ointArray = new int[]{ImageSelectSupplier.p,ImageSelectSupplier.q};
       ImageSelectSupplier f = tb.f;
       if (f != null && !q.f(f.b)) {
          uob.b(tb.f.b);
       }else {
          uob.j(ointArray);
       }
       uob.l(new c(tb, p0));
       uob.k(new a(tb));
       uob.q();
       ImageSelectSupplier f1 = tb.f;
       if (f1 != null) {
          ImageSelectSupplier$c a = f1.a;
          if (a != null) {
             a.show();
          }
       }
       return;
    }
}
