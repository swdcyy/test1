package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import k79.f;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$a;
import nsd.u;
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
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$singleExecutor$2;
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
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$b;
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
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$c;
import erd.g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$d;
import erd.a;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$e;
import msd.l;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$j;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$loadAllMediaListInterval$1;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import lrd.b;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$h;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$i;
import java.lang.Number;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$f;
import qrd.l1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.LinkedList;
import java.util.Collection;
import kotlin.Pair;
import java.lang.Math;
import java.io.File;
import r79.c;

public class AssetsLoaderImpl implements f	// class@001a67
{
    public final Object a;
    public final Set b;
    public final List c;
    public final List d;
    public g e;
    public AtomicReference f;
    public final p g;
    public Context h;
    public Cursor i;
    public MediaFilterList j;
    public static final AssetsLoaderImpl$a k;

    static {
       AssetsLoaderImpl.k = new AssetsLoaderImpl$a(null);
    }
    public void AssetsLoaderImpl(Context p0,Cursor p1,MediaFilterList p2){
       a.q(p0, "context");
       a.q(p2, "filter");
       super();
       this.h = p0;
       this.i = p1;
       this.j = p2;
       this.a = new Object();
       this.b = new CopyOnWriteArraySet();
       this.c = new CopyOnWriteArrayList();
       this.d = new ArrayList();
       this.f = new AtomicReference(null);
       this.g = s.c(AssetsLoaderImpl$singleExecutor$2.INSTANCE);
    }
    public void a(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl.class, "14")) {
          return;
       }
       a.q(p0, "observer");
       this.b.add(p0);
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, AssetsLoaderImpl.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public t c(int p0,int p1){
       AssetsLoaderImpl uAssetsLoade = AssetsLoaderImpl.class;
       if (PatchProxy.isSupport(uAssetsLoade)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAssetsLoade, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.g("AssetsLoaderImpl", "asyncLoadMediaList startPos="+p0+", endInclusive="+p1);
       a c = a.c;
       t ot = t.create(new AssetsLoaderImpl$b(this, p0, p1)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(ot, "Observable.create<List<I¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, AssetsLoaderImpl.class, "11")) {
          return;
       }
       Log.g("AssetsLoaderImpl", "close called");
       j.a(this.i);
       return;
    }
    public void d(boolean p0){
       int i;
       QMedia qMedia;
       AssetsLoaderImpl uAssetsLoade = AssetsLoaderImpl.class;
       if (PatchProxy.isSupport(uAssetsLoade) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAssetsLoade, "13")) {
          return;
       }
       String str = "AssetsLoaderImpl";
       Log.g(str, "checkAndRefresh called");
       QMedia[] qMediaArray = AlbumAssetCache.c(AlbumAssetCache.d.a(), AlbumAssetCache$AssetModule.ALL, 0, 0, 6, null);
       i$a e = i.e;
       Cursor uCursor = e.a();
       if (uCursor != null) {
          int count = uCursor.getCount();
          Object obj = null;
          i = 0;
          if (count == qMediaArray.length) {
             if (count > 0) {
                uCursor.moveToPosition(i);
                qMedia = e.m(uCursor);
             }else {
                qMedia = obj;
             }
             uCursor.moveToPosition(i);
             count = (!qMediaArray.length)? 1: 0;
             object oobject = (count ^ true)? qMediaArray[i]: obj;
             if (a.g(qMedia, oobject) ^ true) {
                Log.g(str, "asset first pos has been changed");
             }else {
             label_0068 :
                j.a(uCursor);
                if (!i && !p0) {
                   Log.g(str, "checkAndRefresh no change");
                   return;
                }else {
                   b uob = this.f.get();
                   if (uob != null && !uob.isDisposed()) {
                      Log.g(str, "last loadAllMediaListInterval is loading, assetList.size="+this.c.size());
                      uob = this.f.getAndSet(obj);
                      if (uob != null) {
                         uob.dispose();
                      }
                   }
                   Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                   uBooleanRef.element = true;
                   this.f.set(f$b.b(this, 0, 0, null, 7, null).observeOn(a.c.i().b()).doOnNext(new AssetsLoaderImpl$c(this, uBooleanRef)).doOnComplete(new AssetsLoaderImpl$d(this)).doOnDispose(AssetsLoaderImpl$e.b).subscribe());
                }
             }
          }
          i = 1;
          goto label_0068 ;
       }
       return;
    }
    public t e(l p0){
       a obj = PatchProxy.applyOneRefs(p0, this, AssetsLoaderImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       t ot = t.create(new AssetsLoaderImpl$j(this, p0)).subscribeOn(obj.i().c()).observeOn(obj.i().b());
       a.h(ot, "Observable.create<List<L¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public List f(int p0,int p1){
       AssetsLoaderImpl uAssetsLoade = AssetsLoaderImpl.class;
       if (PatchProxy.isSupport(uAssetsLoade)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAssetsLoade, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.g("AssetsLoaderImpl", "syncLoadMediaList startPos="+p0+", endInclusive="+p1);
       this.q();
       return this.r(p0, p1);
    }
    public void g(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl.class, "15")) {
          return;
       }
       a.q(p0, "observer");
       this.b.remove(p0);
       return;
    }
    public t h(int p0,int p1,String p2){
       if (PatchProxy.isSupport(AssetsLoaderImpl.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AssetsLoaderImpl.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p2, "albumPath");
       Log.g("AssetsLoaderImpl", "loadAllMediaListInterval albumPath="+p2+", interval="+p0+", ratio="+p1);
       t ot = t.create(new AssetsLoaderImpl$loadAllMediaListInterval$1(this, p0, p2, p1));
       ThreadPoolExecutor threadPoolEx = PatchProxy.apply(null, this, AssetsLoaderImpl.class, "2");
       if (threadPoolEx == PatchProxyResult.class) {
          threadPoolEx = this.g.getValue();
       }
       ot = ot.subscribeOn(b.b(threadPoolEx)).doOnComplete(new AssetsLoaderImpl$g(this)).doOnNext(new AssetsLoaderImpl$h(this)).observeOn(a.c.i().b()).doOnNext(new AssetsLoaderImpl$i(this));
       a.h(ot, "Observable.create { emit¡­ as List<QMedia>\)\n      }");
       return ot;
    }
    public int i(){
       AssetsLoaderImpl obj = PatchProxy.apply(null, this, AssetsLoaderImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.q();
       obj = this.i;
       int count = (obj != null)? obj.getCount(): 0;
       return count;
    }
    public boolean isClosed(){
       Object obj = PatchProxy.apply(null, this, AssetsLoaderImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return j.e(this.i);
    }
    public t j(){
       t obj = PatchProxy.apply(null, this, AssetsLoaderImpl.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("AssetsLoaderImpl", "loadAlbumFolderList...");
       a c = a.c;
       obj = t.create(new AssetsLoaderImpl$f(this)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(obj, "Observable.create<List<Q¡­kInner.schedulers.main\(\)\)");
       return obj;
    }
    public QMedia k(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, AssetsLoaderImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.c.isEmpty()) {
          objArray = this.c.get(0);
       }
       return objArray;
    }
    public List l(){
       Object obj = PatchProxy.apply(null, this, AssetsLoaderImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("AssetsLoaderImpl", "getAllMedias, size="+this.c.size());
       return this.c;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, AssetsLoaderImpl.class, "20")) {
          return;
       }
       this.d.clear();
       return;
    }
    public final Set n(){
       return this.b;
    }
    public final List o(){
       return this.c;
    }
    public final AtomicReference p(){
       return this.f;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, AssetsLoaderImpl.class, "23")) {
          return;
       }
       AssetsLoaderImpl ta = this.a;
       _monitor_enter(ta);
       if (j.e(this.i)) {
          Log.g("AssetsLoaderImpl", "init called");
          this.m();
          Cursor uCursor = i.e.a();
          this.i = uCursor;
          if (uCursor != null) {
             AlbumAssetCache$a d = AlbumAssetCache.d;
             AlbumAssetCache$AssetModule aLL = AlbumAssetCache$AssetModule.ALL;
             if (d.a().f(aLL) != uCursor.getCount()) {
                d.a().a(aLL);
                d.a().e(aLL, uCursor.getCount());
             }
          }
       }
       _monitor_exit(ta);
       return;
    }
    public final List r(int p0,int p1){
       AssetsLoaderImpl obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(AssetsLoaderImpl.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AssetsLoaderImpl.class, "25");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.a;
       _monitor_enter(obj);
       Log.g("AssetsLoaderImpl", "internalLoadMediaList, startInclusive="+p0+", endInclusive="+p1+"...");
       if (j.e(this.i)) {
          Log.d("AssetsLoaderImpl", "internalLoadMediaList assetsCursor closed, return empty list");
          _monitor_exit(obj);
          return CollectionsKt__CollectionsKt.E();
       }else if(p0 < 0 || p1 >= this.i()){
          Log.d("AssetsLoaderImpl", "invalid startInclusive="+p0);
          p0 = 0;
       }
       if (p1 >= this.i()) {
          Log.d("AssetsLoaderImpl", "invalid endInclusive="+p1);
          p1 = this.i() - 1;
       }
       p1 = (p1 - p0) + 1;
       LinkedList obj1 = PatchProxy.apply(null, this, AssetsLoaderImpl.class, "22");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): this.d.size();
       p0 = p0 + i;
       ArrayList uArrayList = new ArrayList();
       obj1 = new LinkedList();
       int i1 = 0;
       while (uArrayList.size() < p1) {
          int i2 = i1 + p0;
          AssetsLoaderImpl ti = this.i;
          boolean count = (ti != null)? ti.getCount(): -1;
          if (i2 < count) {
             i1 = i1 + 1;
             AlbumAssetCache$a d = AlbumAssetCache.d;
             AlbumAssetCache$AssetModule aLL = AlbumAssetCache$AssetModule.ALL;
             QMedia qMedia = d.a().d(aLL, i2);
             if (qMedia == null) {
                AssetsLoaderImpl ti1 = this.i;
                if (ti1 != null) {
                   ti1.moveToPosition(i2);
                }
                qMedia = d.a().g(aLL, i2, i.e.m(this.i));
             }
             count = (qMedia != null)? i.e.k(qMedia): false;
             if (this.s(qMedia, count)) {
                Log.g("AssetsLoaderImpl", "add skip position "+i2+", media="+qMedia);
                if (PatchProxy.isSupport(AssetsLoaderImpl.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), this, AssetsLoaderImpl.class, "21")) {
                   continue ;
                }
             }else if(count && qMedia != null){
                obj1.add(new Pair(Integer.valueOf(i2), qMedia));
             }
             if (qMedia == null) {
                a.L();
             }
             uArrayList.add(qMedia);
          }else {
             break ;
          }
          this.d.add(Integer.valueOf(i2));
       }
       _monitor_exit(obj);
       return uArrayList;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, AssetsLoaderImpl.class, "10")) {
          return;
       }
       Log.g("AssetsLoaderImpl", "reset called");
       AssetsLoaderImpl ti = this.i;
       int i = 0;
       int position = (ti != null)? ti.getPosition(): 0;
       this.m();
       j.a(this.i);
       Cursor uCursor = i.e.a();
       this.i = uCursor;
       if (uCursor != null) {
          uCursor.moveToPosition(Math.max(Math.min(position, (uCursor.getCount() - 1)), i));
          AlbumAssetCache$a d = AlbumAssetCache.d;
          AlbumAssetCache$AssetModule aLL = AlbumAssetCache$AssetModule.ALL;
          if (d.a().f(aLL) != uCursor.getCount()) {
             d.a().a(aLL);
             d.a().e(aLL, uCursor.getCount());
          }
       }
       return;
    }
    public boolean s(QMedia p0,boolean p1){
       AssetsLoaderImpl uAssetsLoade = AssetsLoaderImpl.class;
       if (PatchProxy.isSupport(uAssetsLoade)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uAssetsLoade, "26");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0 != null) {
          QMedia path = p0.path;
          if (path != null) {
             File uFile = new File(path);
             if (!p1 && (this.j.isDisplay(p0) || (uFile.exists() && uFile.length() > 0))) {
                b = false;
             }
          }
       }
       return b;
    }
}
