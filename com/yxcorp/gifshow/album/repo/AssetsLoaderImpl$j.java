package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$j;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import msd.l;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k79.i;
import android.database.Cursor;
import k79.i$a;
import java.util.ArrayList;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import brd.g;

public final class AssetsLoaderImpl$j implements g	// class@001a63
{
    public final AssetsLoaderImpl b;
    public final l c;

    public void AssetsLoaderImpl$j(AssetsLoaderImpl p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl$j.class, "1")) {
          return;
       }
       a.q(p0, "it");
       Cursor uCursor = i.e.a();
       if (uCursor != null) {
          uCursor.moveToFirst();
       }
       boolean b = false;
       int count = (uCursor != null)? uCursor.getCount(): 0;
       ArrayList uArrayList = new ArrayList(count);
       i = 0;
       while (i < count) {
          QMedia qMedia = i.e.m(uCursor);
          if (qMedia != null && !this.b.s(qMedia, b)) {
             AssetsLoaderImpl$j tc = this.c;
             if (tc != null && !tc.invoke(qMedia).booleanValue()) {
             label_005c :
                if (uCursor != null) {
                   uCursor.moveToNext();
                }
             }else {
                uArrayList.add(Long.valueOf(qMedia.mModified));
                if (uCursor != null) {
                   uCursor.moveToNext();
                }
             }
          }else {
             goto label_005c ;
          }
          i = i + 1;
       }
       Log.g("AssetsLoaderImpl", "loadModifiedTimeList finished, size = "+count);
       p0.onNext(uArrayList);
       p0.onComplete();
       if (uCursor != null) {
          uCursor.close();
       }
       return;
    }
}
