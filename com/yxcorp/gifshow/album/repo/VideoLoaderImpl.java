package com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import k79.f;
import android.content.Context;
import android.database.Cursor;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$singleExecutor$2;
import msd.a;
import qrd.p;
import qrd.s;
import k79.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.t;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$a;
import io.reactivex.g;
import g79.a;
import w69.p0;
import brd.z;
import k79.j;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$a;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import com.yxcorp.gifshow.models.QMedia;
import k79.i;
import k79.i$a;
import crd.b;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import k79.f$b;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$b;
import erd.g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$c;
import erd.a;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$d;
import msd.l;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$i;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$loadAllMediaListInterval$1;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import lrd.b;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$f;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$h;
import java.lang.Number;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl$e;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.LinkedList;
import java.util.Collection;
import kotlin.Pair;
import java.io.File;
import r79.c;
import java.lang.Math;

public final class VideoLoaderImpl implements f	// class@001a8f
{
    public final String a;
    public final Object b;
    public final Set c;
    public final List d;
    public final List e;
    public g f;
    public AtomicReference g;
    public final p h;
    public Context i;
    public Cursor j;
    public MediaFilterList k;

    public void VideoLoaderImpl(Context p0,Cursor p1,MediaFilterList p2){
       a.q(p0, "context");
       a.q(p2, "filter");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.a = "VideoLoaderImpl";
       this.b = new Object();
       this.c = new CopyOnWriteArraySet();
       this.d = new CopyOnWriteArrayList();
       this.e = new ArrayList();
       this.g = new AtomicReference(null);
       this.h = s.c(VideoLoaderImpl$singleExecutor$2.INSTANCE);
    }
    public void a(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl.class, "13")) {
          return;
       }
       a.q(p0, "observer");
       this.c.add(p0);
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, VideoLoaderImpl.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public t c(int p0,int p1){
       VideoLoaderImpl videoLoaderI = VideoLoaderImpl.class;
       if (PatchProxy.isSupport(videoLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, videoLoaderI, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.g(this.a, "loadMediaList startInclusive="+p0+", endInclusive="+p1);
       this.n();
       a c = a.c;
       t ot = t.create(new VideoLoaderImpl$a(this, p0, p1)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(ot, "Observable.create<List<I¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, VideoLoaderImpl.class, "10")) {
          return;
       }
       Log.g(this.a, "close called");
       j.a(this.j);
       return;
    }
    public void d(boolean p0){
       int i;
       QMedia qMedia;
       VideoLoaderImpl videoLoaderI = VideoLoaderImpl.class;
       if (PatchProxy.isSupport(videoLoaderI) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, videoLoaderI, "12")) {
          return;
       }
       Log.g(this.a, "checkAndRefresh called, force="+p0);
       String str = null;
       boolean b = true;
       if (!p0) {
          QMedia[] qMediaArray = AlbumAssetCache.c(AlbumAssetCache.d.a(), AlbumAssetCache$AssetModule.VIDEO, 0, 0, 6, null);
          i$a e = i.e;
          Cursor uCursor = e.d();
          if (uCursor != null) {
             int count = uCursor.getCount();
             i = 0;
             if (count == qMediaArray.length) {
                if (count > 0) {
                   uCursor.moveToPosition(i);
                   qMedia = e.n(uCursor);
                }else {
                   qMedia = str;
                }
                uCursor.moveToPosition(i);
                count = (!qMediaArray.length)? 1: 0;
                object oobject = (count ^ b)? qMediaArray[i]: str;
                if (a.g(qMedia, oobject) ^ b) {
                   Log.g(this.a, "asset first pos has been changed");
                }else {
                label_007b :
                   j.a(uCursor);
                   if (!i && !p0) {
                      Log.g(this.a, "checkAndRefresh no change");
                   }
                }
             }
             i = 1;
             goto label_007b ;
          }
          return;
       }
    label_008a :
       b uob = this.g.get();
       if (uob != null && !uob.isDisposed()) {
          Log.g(this.a, "last loadAllMediaListInterval is loading, videoList.size="+this.d.size());
          uob = this.g.getAndSet(str);
          if (uob != null) {
             uob.dispose();
          }
       }
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = b;
       this.g.set(f$b.b(this, 0, 0, null, 7, null).observeOn(a.c.i().b()).doOnNext(new VideoLoaderImpl$b(this, uBooleanRef)).doOnComplete(new VideoLoaderImpl$c(this)).doOnDispose(new VideoLoaderImpl$d(this)).subscribe());
       return;
    }
    public t e(l p0){
       a obj = PatchProxy.applyOneRefs(p0, this, VideoLoaderImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       t ot = t.create(new VideoLoaderImpl$i(this, p0)).subscribeOn(obj.i().c()).observeOn(obj.i().b());
       a.h(ot, "Observable.create<List<L¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public List f(int p0,int p1){
       VideoLoaderImpl videoLoaderI = VideoLoaderImpl.class;
       if (PatchProxy.isSupport(videoLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, videoLoaderI, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.n();
       return this.o(p0, p1);
    }
    public void g(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl.class, "14")) {
          return;
       }
       a.q(p0, "observer");
       this.c.remove(p0);
       return;
    }
    public t h(int p0,int p1,String p2){
       if (PatchProxy.isSupport(VideoLoaderImpl.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, VideoLoaderImpl.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p2, "albumPath");
       t ot = t.create(new VideoLoaderImpl$loadAllMediaListInterval$1(this, p0, p2, p1));
       ThreadPoolExecutor threadPoolEx = PatchProxy.apply(null, this, VideoLoaderImpl.class, "1");
       if (threadPoolEx == PatchProxyResult.class) {
          threadPoolEx = this.h.getValue();
       }
       ot = ot.subscribeOn(b.b(threadPoolEx)).doOnComplete(new VideoLoaderImpl$f(this)).doOnNext(VideoLoaderImpl$g.b).doOnNext(new VideoLoaderImpl$h(this));
       a.h(ot, "Observable.create { emit¡­as List<QMedia>\)\n\n      }");
       return ot;
    }
    public int i(){
       VideoLoaderImpl obj = PatchProxy.apply(null, this, VideoLoaderImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.n();
       obj = this.j;
       int count = (obj != null)? obj.getCount(): 0;
       return count;
    }
    public boolean isClosed(){
       Object obj = PatchProxy.apply(null, this, VideoLoaderImpl.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return j.e(this.j);
    }
    public t j(){
       t obj = PatchProxy.apply(null, this, VideoLoaderImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a c = a.c;
       obj = t.create(new VideoLoaderImpl$e(this)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(obj, "Observable.create<List<Q¡­kInner.schedulers.main\(\)\)");
       return obj;
    }
    public QMedia k(){
       Object obj = PatchProxy.apply(null, this, VideoLoaderImpl.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public List l(){
       Object obj = PatchProxy.apply(null, this, VideoLoaderImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g(this.a, "getAllMedias, size="+this.d.size());
       return this.d;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, VideoLoaderImpl.class, "15")) {
          return;
       }
       this.e.clear();
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, VideoLoaderImpl.class, "16")) {
          return;
       }
       if (j.e(this.j)) {
          Log.g(this.a, "init called");
          this.j = i.e.d();
          this.m();
          VideoLoaderImpl tj = this.j;
          if (tj != null) {
             AlbumAssetCache$a d = AlbumAssetCache.d;
             AlbumAssetCache$AssetModule vIDEO = AlbumAssetCache$AssetModule.VIDEO;
             if (d.a().f(vIDEO) != tj.getCount()) {
                d.a().a(vIDEO);
                d.a().e(vIDEO, tj.getCount());
             }
          }
       }
       return;
    }
    public final List o(int p0,int p1){
       boolean count;
       VideoLoaderImpl videoLoaderI = VideoLoaderImpl.class;
       if (PatchProxy.isSupport(videoLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, videoLoaderI, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       videoLoaderI = this.b;
       _monitor_enter(videoLoaderI);
       if (j.e(this.j)) {
          Log.d(this.a, "internalLoadMediaList videoCursor closed, return empty list");
          _monitor_exit(videoLoaderI);
          return CollectionsKt__CollectionsKt.E();
       }else if(p0 < 0 || p1 >= this.i()){
          Log.d(this.a, "invalid startInclusive="+p0);
          p0 = 0;
       }
       if (p1 >= this.i()) {
          Log.d(this.a, "invalid endInclusive="+p1);
          p1 = this.i() - 1;
       }
       p1 = (p1 - p0) + 1;
       int i = this.e.size() + p0;
       Log.g(this.a, "internalLoadMediaList called, inputStart="+p0+", start="+i+", count="+p1);
       ArrayList uArrayList = new ArrayList();
       LinkedList linkedList = new LinkedList();
       int i1 = 0;
       while (uArrayList.size() < p1) {
          int i2 = i1 + i;
          VideoLoaderImpl tj = this.j;
          count = (tj != null)? tj.getCount(): -1;
          if (i2 < count) {
             i1 = i1 + 1;
             AlbumAssetCache$a d = AlbumAssetCache.d;
             AlbumAssetCache$AssetModule vIDEO = AlbumAssetCache$AssetModule.VIDEO;
             QMedia qMedia = d.a().d(vIDEO, i2);
             if (qMedia == null) {
                VideoLoaderImpl tj1 = this.j;
                if (tj1 != null) {
                   tj1.moveToPosition(i2);
                }
                qMedia = d.a().g(vIDEO, i2, i.e.n(this.j));
             }
             count = (qMedia != null)? i.e.k(qMedia): false;
             if (this.p(qMedia, count)) {
                Log.g(this.a, "add skip position "+i2+", media="+qMedia);
                this.e.add(Integer.valueOf(i2));
             }else if(count && qMedia != null){
                linkedList.add(new Pair(Integer.valueOf(i2), qMedia));
             }
             if (qMedia == null) {
                a.L();
             }
             uArrayList.add(qMedia);
          }else {
             break ;
          }
       }
       _monitor_exit(videoLoaderI);
       return uArrayList;
    }
    public final boolean p(QMedia p0,boolean p1){
       VideoLoaderImpl videoLoaderI = VideoLoaderImpl.class;
       if (PatchProxy.isSupport(videoLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, videoLoaderI, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0 != null) {
          QMedia path = p0.path;
          if (path != null) {
             File uFile = new File(path);
             if (!p1 && (this.k.isDisplay(p0) || (uFile.exists() && uFile.length() > 0))) {
                b = false;
             }
          }
       }
       return b;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, VideoLoaderImpl.class, "9")) {
          return;
       }
       Log.g(this.a, "reset called");
       VideoLoaderImpl tj = this.j;
       int i = 0;
       int position = (tj != null)? tj.getPosition(): 0;
       this.m();
       VideoLoaderImpl tj1 = this.j;
       if (tj1 != null) {
          tj1.close();
       }
       Cursor uCursor = i.e.d();
       this.j = uCursor;
       if (uCursor != null) {
          uCursor.moveToPosition(Math.max(Math.min(position, (uCursor.getCount() - 1)), i));
          AlbumAssetCache$a d = AlbumAssetCache.d;
          AlbumAssetCache$AssetModule vIDEO = AlbumAssetCache$AssetModule.VIDEO;
          if (d.a().f(vIDEO) != uCursor.getCount()) {
             d.a().a(vIDEO);
             d.a().e(vIDEO, uCursor.getCount());
          }
       }
       return;
    }
}
