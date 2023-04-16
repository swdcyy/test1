package com.yxcorp.gifshow.edit.draft.model.t;
import io.reactivex.g;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.edit.draft.model.q;
import java.io.FileFilter;
import java.io.File;
import brd.g;
import java.util.HashMap;
import java.lang.Long;
import laa.c0;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public final class t implements g	// class@001b10
{
    public final DraftFileManager b;

    public void t(DraftFileManager p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       t tb = this.b;
       File[] uFileArray = tb.a.listFiles(q.b);
       if (uFileArray == null) {
          p0.onComplete();
       }else {
          int i = 0;
          try{
             HashMap hashMap = new HashMap();
             int len = uFileArray.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject1 = uFileArray[i1];
                hashMap.put(oobject1, Long.valueOf(oobject1.lastModified()));
             }
             Arrays.sort(uFileArray, new c0(hashMap));
          }catch(java.lang.Exception e3){
             PostUtils.D("DraftFileManager", "draft sort exception", e3);
          }
          int len1 = uFileArray.length;
          while (true) {
             if (i < len1) {
                object oobject = uFileArray[i];
                if (!p0.isDisposed()) {
                   c uoc = tb.Z(oobject);
                   if (uoc != null && !p0.isDisposed()) {
                      p0.onNext(uoc);
                   }
                   i = i + 1;
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
