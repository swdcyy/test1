package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$i;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
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

public final class VideoLoaderImpl$i implements g	// class@001a8b
{
    public final VideoLoaderImpl b;
    public final l c;

    public void VideoLoaderImpl$i(VideoLoaderImpl p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl$i.class, "1")) {
          return;
       }
       a.q(p0, "it");
       Cursor uCursor = i.e.d();
       if (uCursor != null) {
          uCursor.moveToFirst();
       }
       int count = (uCursor != null)? uCursor.getCount(): 0;
       ArrayList uArrayList = new ArrayList(count);
       i = 0;
       while (i < count) {
          i$a e = i.e;
          QMedia qMedia = e.n(uCursor);
          boolean b = (qMedia != null)? e.k(qMedia): false;
          if (qMedia != null) {
             VideoLoaderImpl$i tc = this.c;
             if (tc == null || (!tc.invoke(qMedia).booleanValue() || this.b.p(qMedia, b))) {
             label_0064 :
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
             goto label_0064 ;
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
