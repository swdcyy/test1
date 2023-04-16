package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$j;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import msd.l;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Boolean;
import java.lang.Long;
import brd.g;

public final class BaseLoaderImpl$j implements g	// class@001a71
{
    public final BaseLoaderImpl b;
    public final l c;

    public void BaseLoaderImpl$j(BaseLoaderImpl p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLoaderImpl$j.class, "1")) {
          return;
       }
       a.q(p0, "it");
       BaseLoaderImpl$j tb = this.b;
       Cursor uCursor = tb.q(tb.r());
       if (uCursor != null) {
          uCursor.moveToFirst();
       }
       int count = (uCursor != null)? uCursor.getCount(): 0;
       ArrayList uArrayList = new ArrayList(count);
       BaseLoaderImpl$j tb1 = this.b;
       tb1.e = tb1.w();
       int i = 0;
       while (i < count) {
          BaseLoaderImpl$j tb2 = this.b;
          QMedia qMedia = tb2.v(tb2.r(), uCursor);
          if (qMedia != null) {
             BaseLoaderImpl$j tb3 = this.b;
             if (!tb3.A(qMedia, false, tb3.e)) {
                tb3 = this.c;
                if (tb3 != null && !tb3.invoke(qMedia).booleanValue()) {
                label_006e :
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
                goto label_006e ;
             }
          }else {
             goto label_006e ;
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
