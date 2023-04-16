package com.yxcorp.gifshow.edit.draft.model.x;
import io.reactivex.g;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.lang.String;
import java.lang.StringBuilder;
import haa.f;
import q87.c;
import brd.g;
import laa.b0;
import java.lang.Runnable;
import t45.c;

public final class x implements g	// class@001b19
{
    public final List b;

    public void x(List p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.b.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          if (uFile.exists()) {
             File uFile1 = new File(uFile.getParent(), uFile.getName()+".trash");
             if (uFile.renameTo(uFile1)) {
                uArrayList.add(uFile1);
             }else {
                uArrayList.add(uFile);
             }
          }
          Object[] objArray = new Object[i];
          f.D().w("DraftFileManager", "deleteDirectories onNext "+uFile.getAbsolutePath(), objArray);
          p0.onNext(uFile);
       }
       c.a(new b0(uArrayList));
       Object[] objArray1 = new Object[i];
       f.D().w("DraftFileManager", "deleteDirectories onComplete", objArray1);
       p0.onComplete();
       return;
    }
}
