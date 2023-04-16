package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$i;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
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
import brd.g;

public final class ImageLoaderImpl$i implements g	// class@001a7e
{
    public final ImageLoaderImpl b;
    public final l c;

    public void ImageLoaderImpl$i(ImageLoaderImpl p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderImpl$i.class, "1")) {
          return;
       }
       a.q(p0, "it");
       Cursor uCursor = i.e.c();
       if (uCursor != null) {
          uCursor.moveToFirst();
       }
       i = 0;
       int count = (uCursor != null)? uCursor.getCount(): 0;
       ArrayList uArrayList = new ArrayList(count);
       while (i < count) {
          QMedia qMedia = i.e.l(uCursor);
          if (qMedia != null) {
             ImageLoaderImpl$i tc = this.c;
             if (tc == null || (!tc.invoke(qMedia).booleanValue() || this.b.p(qMedia))) {
             label_005b :
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
             goto label_005b ;
          }
          i = i + 1;
       }
       p0.onNext(uArrayList);
       p0.onComplete();
       if (uCursor != null) {
          uCursor.close();
       }
       return;
    }
}
