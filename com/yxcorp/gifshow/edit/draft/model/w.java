package com.yxcorp.gifshow.edit.draft.model.w;
import io.reactivex.g;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import laa.q;
import java.io.FileFilter;
import haa.f;
import java.lang.String;
import q87.c;
import brd.g;
import com.yxcorp.gifshow.edit.draft.model.u;
import java.util.Comparator;
import java.util.Arrays;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public final class w implements g	// class@001b13
{
    public final DraftFileManager b;
    public final File c;
    public final long d;

    public void w(DraftFileManager p0,File p1,long p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       File[] uFileArray = this.c.listFiles(new q(tb, this.d));
       int i = 0;
       if (uFileArray == null) {
          Object[] objArray = new Object[i];
          f.D().w("DraftFileManager", "listForDir\(\) dirs is null", objArray);
          p0.onComplete();
       }else {
          Arrays.sort(uFileArray, u.b);
          int len = uFileArray.length;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                object oobject = uFileArray[i1];
                if (p0.isDisposed()) {
                   Object[] objArray1 = new Object[i];
                   f.D().w("DraftFileManager", "listForDir\(\) emitter.isDisposed\(\) return", objArray1);
                   break ;
                }else {
                   c uoc = tb.Z(oobject);
                   if (uoc != null && (DraftFileManager.o0(uoc, i) && !p0.isDisposed())) {
                      p0.onNext(uoc);
                   }
                label_0058 :
                   i1 = i1 + 1;
                }
             }else {
                p0.onComplete();
                break ;
             }
          }
       }
       return;
    }
}
