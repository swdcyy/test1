package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$loadAllMediaListInterval$1;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import k79.m;
import kotlin.jvm.internal.Ref$IntRef;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1;
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
import com.yxcorp.gifshow.models.QMedia;
import msd.p;
import qrd.l1;
import k79.j;
import brd.g;

public final class ImageLoaderImpl$loadAllMediaListInterval$1 implements g	// class@001a80
{
    public final ImageLoaderImpl b;
    public final int c;
    public final String d;
    public final int e;

    public void ImageLoaderImpl$loadAllMediaListInterval$1(ImageLoaderImpl p0,int p1,String p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       ImageLoaderImpl a;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderImpl$loadAllMediaListInterval$1.class, "1")) {
          return;
       }
       a.q(p0, "emitter");
       this.b.n();
       this.b.d.clear();
       m.i.g(1);
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = this.c;
       ImageLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1 oloadAllMedi = new ImageLoaderImpl$loadAllMediaListInterval$1$onLoadItem$1(this, intRef, p0);
       ImageLoaderImpl$loadAllMediaListInterval$1 tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = PatchProxy.applyOneRefs(oloadAllMedi, tb, ImageLoaderImpl.class, "17");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          Cursor uCursor = i.e.c();
          a = tb.a;
          StringBuilder str = "internalLoadAll, cursor size=";
          Integer integer = (uCursor != null)? Integer.valueOf(uCursor.getCount()): null;
          Log.g(a, str+integer);
          i = 0;
          int count = (uCursor != null)? uCursor.getCount(): 0;
          AlbumAssetCache$a d = AlbumAssetCache.d;
          AlbumAssetCache$AssetModule iMAGE = AlbumAssetCache$AssetModule.IMAGE;
          int i1 = d.a().b(iMAGE);
          if (count != i1) {
             d.a().a(iMAGE);
             d.a().e(iMAGE, count);
          }
          ArrayList uArrayList1 = new ArrayList();
          int count1 = (uCursor != null)? uCursor.getCount(): 0;
          count1 = count1 - 1;
          Log.g(tb.a, "endPos="+count1+", cacheSize="+i1);
          if (count1 >= 0) {
             while (uCursor != null) {
                uCursor.moveToPosition(i);
                break ;
                i = i + 1;
             }
             QMedia qMedia = i.e.l(uCursor);
             AlbumAssetCache.d.a().g(AlbumAssetCache$AssetModule.IMAGE, i, qMedia);
             if (!tb.p(qMedia)) {
                if (qMedia == null) {
                   a.L();
                }
                uArrayList1.add(qMedia);
                l1 ol1 = oloadAllMedi.invoke(uArrayList1, qMedia);
             }
             if (i != count1) {
                goto label_00ee ;
             }
          }
          j.a(uCursor);
          uArrayList = uArrayList1;
       }
       p0.onNext(uArrayList);
       p0.onComplete();
       return;
    }
}
