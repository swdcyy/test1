package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$loadAllMediaListInterval$1;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import k79.m;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import k79.i;
import android.database.Cursor;
import k79.i$a;
import java.lang.StringBuilder;
import java.lang.Integer;
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
import k79.q;
import java.lang.Runnable;
import k79.j;
import brd.g;

public final class VideoLoaderImpl$loadAllMediaListInterval$1 implements g	// class@001a8d
{
    public final VideoLoaderImpl b;
    public final int c;
    public final String d;
    public final int e;

    public void VideoLoaderImpl$loadAllMediaListInterval$1(VideoLoaderImpl p0,int p1,String p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       VideoLoaderImpl a;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl$loadAllMediaListInterval$1.class, "1")) {
          return;
       }
       a.q(p0, "emitter");
       this.b.n();
       this.b.d.clear();
       int i = 0;
       m.i.g(i);
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = this.c;
       VideoLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1 oloadAllMedi = new VideoLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1(this, intRef, p0);
       VideoLoaderImpl$loadAllMediaListInterval$1 tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.applyOneRefs(oloadAllMedi, tb, VideoLoaderImpl.class, "17");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          Cursor uCursor = i.e.d();
          a = tb.a;
          StringBuilder str = "internalLoadAll, cursor size=";
          Integer integer = (uCursor != null)? Integer.valueOf(uCursor.getCount()): null;
          Log.g(a, str+integer);
          int count = (uCursor != null)? uCursor.getCount(): 0;
          AlbumAssetCache$a d = AlbumAssetCache.d;
          AlbumAssetCache$AssetModule vIDEO = AlbumAssetCache$AssetModule.VIDEO;
          int i1 = d.a().b(vIDEO);
          if (count != i1) {
             d.a().a(vIDEO);
             d.a().e(vIDEO, count);
          }
          ArrayList uArrayList1 = new ArrayList();
          LinkedList linkedList = new LinkedList();
          int count1 = (uCursor != null)? uCursor.getCount(): 0;
          count1 = count1 - 1;
          Log.d(tb.a, "endPos="+count1+", cacheSize="+i1);
          if (count1 >= 0) {
             i1 = 0;
             while (uCursor != null) {
                uCursor.moveToPosition(i1);
                break ;
                i1 = i1 + 1;
             }
             i$a e = i.e;
             QMedia qMedia = e.n(uCursor);
             if (qMedia != null && e.k(qMedia)) {
                linkedList.add(new Pair(Integer.valueOf(i1), qMedia));
             }
             AlbumAssetCache.d.a().g(AlbumAssetCache$AssetModule.VIDEO, i1, qMedia);
             if (!tb.p(qMedia, i)) {
                if (qMedia == null) {
                   a.L();
                }
                uArrayList1.add(qMedia);
                l1 ol1 = oloadAllMedi.invoke(uArrayList1, qMedia);
             }
             if (i1 != count1) {
                goto label_0107 ;
             }
          }
          if (linkedList.isEmpty() ^ 0x01) {
             h.a().b(new q(tb, linkedList));
          }
          j.a(uCursor);
          uArrayList = uArrayList1;
       }
       p0.onNext(uArrayList);
       p0.onComplete();
       return;
    }
}
