package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$loadAllMediaListInterval$1;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.database.Cursor;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Thread;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$a;
import java.util.ArrayList;
import java.util.LinkedList;
import com.yxcorp.gifshow.models.QMedia;
import k79.i;
import k79.i$a;
import kotlin.Pair;
import msd.p;
import qrd.l1;
import java.util.Collection;
import k79.h;
import k79.d;
import java.lang.Runnable;
import k79.j;
import brd.g;

public final class BaseLoaderImpl$loadAllMediaListInterval$1 implements g	// class@001a73
{
    public final BaseLoaderImpl b;
    public final int c;
    public final String d;
    public final int e;

    public void BaseLoaderImpl$loadAllMediaListInterval$1(BaseLoaderImpl p0,int p1,String p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLoaderImpl$loadAllMediaListInterval$1.class, "1")) {
          return;
       }
       a.q(p0, "emitter");
       this.b.t();
       this.b.o().clear();
       BaseLoaderImpl$loadAllMediaListInterval$1 tb = this.b;
       tb.z(tb.r());
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = this.c;
       BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1 oloadAllMedi = new BaseLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1(this, intRef, p0);
       tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.applyOneRefs(oloadAllMedi, tb, BaseLoaderImpl.class, "26");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          Cursor uCursor = tb.q(tb.j);
          StringBuilder str = "internalLoadAll, cursor size=";
          Integer integer = (uCursor != null)? Integer.valueOf(uCursor.getCount()): null;
          String str1 = "BaseLoaderImpl";
          Log.g(str1, str+integer+", thread="+Thread.currentThread());
          AlbumAssetCache$AssetModule uAssetModule = tb.p(tb.j);
          int count = (uCursor != null)? uCursor.getCount(): 0;
          AlbumAssetCache$a d = AlbumAssetCache.d;
          int i = d.a().b(uAssetModule);
          if (count != i) {
             d.a().a(uAssetModule);
             d.a().e(uAssetModule, count);
          }
          ArrayList uArrayList1 = new ArrayList();
          LinkedList linkedList = new LinkedList();
          BaseLoaderImpl j = tb.j;
          j = (j == null || j == 2)? 1: 0;
          int count1 = (uCursor != null)? uCursor.getCount(): 0;
          count1 = count1 - 1;
          Log.g(str1, "endPos="+count1+", cacheSize="+i);
          tb.e = tb.w();
          if (count1 >= 0) {
             int i1 = 0;
             while (uCursor != null) {
                uCursor.moveToPosition(i1);
                break ;
                i1 = i1 + 1;
             }
             QMedia qMedia = tb.v(tb.j, uCursor);
             if (j && (qMedia != null && i.e.k(qMedia))) {
                linkedList.add(new Pair(Integer.valueOf(i1), qMedia));
             }
          label_010e :
             AlbumAssetCache.d.a().g(uAssetModule, i1, qMedia);
             if (!tb.A(qMedia, false, tb.e)) {
                if (qMedia == null) {
                   a.L();
                }
                uArrayList1.add(qMedia);
                l1 ol1 = oloadAllMedi.invoke(uArrayList1, qMedia);
             }
             if (i1 != count1) {
                goto label_0130 ;
             }
          }
          if (j && (linkedList.isEmpty() ^ 1)) {
             h.a().b(new d(tb, linkedList));
          }
          j.a(uCursor);
          uArrayList = uArrayList1;
       }
       p0.onNext(uArrayList);
       p0.onComplete();
       return;
    }
}
