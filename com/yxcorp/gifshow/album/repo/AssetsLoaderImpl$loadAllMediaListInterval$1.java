package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$loadAllMediaListInterval$1;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Objects;
import k79.m;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1;
import com.kwai.robust.PatchProxyResult;
import k79.i;
import android.database.Cursor;
import k79.i$a;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.lang.Thread;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$a;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import java.util.ArrayList;
import java.util.LinkedList;
import com.yxcorp.gifshow.models.QMedia;
import kotlin.Pair;
import msd.p;
import qrd.l1;
import java.util.Collection;
import k79.h;
import k79.b;
import java.lang.Runnable;
import k79.j;
import brd.g;

public final class AssetsLoaderImpl$loadAllMediaListInterval$1 implements g	// class@001a65
{
    public final AssetsLoaderImpl b;
    public final int c;
    public final String d;
    public final int e;

    public void AssetsLoaderImpl$loadAllMediaListInterval$1(AssetsLoaderImpl p0,int p1,String p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       int i;
       AssetsLoaderImpl uAssetsLoade = AssetsLoaderImpl.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl$loadAllMediaListInterval$1.class, "1")) {
          return;
       }
       a.q(p0, "emitter");
       this.b.q();
       this.b.o().clear();
       AssetsLoaderImpl$loadAllMediaListInterval$1 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, uAssetsLoade, "17")) {
          m.i.g(2);
       }
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = this.c;
       AssetsLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1 oloadAllMedi = new AssetsLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1(this, intRef, p0);
       tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.applyOneRefs(oloadAllMedi, tb, uAssetsLoade, "24");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          Cursor uCursor = i.e.a();
          String str = "internalLoadAll, cursor size=";
          if (uCursor != null) {
             objArray = Integer.valueOf(uCursor.getCount());
          }
          str = "AssetsLoaderImpl";
          Log.g(str, str+objArray+", thread="+Thread.currentThread());
          boolean b = false;
          int count = (uCursor != null)? uCursor.getCount(): 0;
          AlbumAssetCache$a d = AlbumAssetCache.d;
          AlbumAssetCache$AssetModule aLL = AlbumAssetCache$AssetModule.ALL;
          i = d.a().b(aLL);
          if (count != i) {
             d.a().a(aLL);
             d.a().e(aLL, count);
          }
          ArrayList uArrayList1 = new ArrayList();
          LinkedList linkedList = new LinkedList();
          int count1 = (uCursor != null)? uCursor.getCount(): 0;
          count1 = count1 - 1;
          Log.g(str, "endPos="+count1+", cacheSize="+i);
          if (count1 >= 0) {
             int i1 = 0;
             while (uCursor != null) {
                uCursor.moveToPosition(i1);
                break ;
                i1 = i1 + 1;
             }
             i$a e = i.e;
             QMedia qMedia = e.m(uCursor);
             if (qMedia != null && e.k(qMedia)) {
                linkedList.add(new Pair(Integer.valueOf(i1), qMedia));
             }
             AlbumAssetCache.d.a().g(AlbumAssetCache$AssetModule.ALL, i1, qMedia);
             if (!tb.s(qMedia, b)) {
                if (qMedia == null) {
                   a.L();
                }
                uArrayList1.add(qMedia);
                l1 ol1 = oloadAllMedi.invoke(uArrayList1, qMedia);
             }
             if (i1 != count1) {
                goto label_0121 ;
             }
          }
          if (linkedList.isEmpty() ^ 0x01) {
             h.a().b(new b(tb, linkedList));
          }
          j.a(uCursor);
          uArrayList = uArrayList1;
       }
       p0.onNext(uArrayList);
       p0.onComplete();
       return;
    }
}
