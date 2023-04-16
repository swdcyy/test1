package com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import k79.f;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$a;
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
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$singleExecutor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.models.QMedia;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import r79.c;
import k79.f$a;
import java.util.Set;
import brd.t;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$b;
import io.reactivex.g;
import g79.a;
import w69.p0;
import brd.z;
import k79.j;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$a;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import crd.b;
import kotlin.jvm.internal.Ref$BooleanRef;
import k79.f$b;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$c;
import erd.g;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$d;
import erd.a;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$e;
import msd.l;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$j;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$loadAllMediaListInterval$1;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executor;
import lrd.b;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$g;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$h;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$i;
import java.lang.Number;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl$f;
import k79.i;
import k79.i$a;
import java.lang.Math;
import qrd.l1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.LinkedList;
import java.util.Collection;
import kotlin.Pair;
import k79.m;

public class BaseLoaderImpl implements f	// class@001a75
{
    public final Object a;
    public final Set b;
    public final List c;
    public final List d;
    public List e;
    public g f;
    public AtomicReference g;
    public final p h;
    public Context i;
    public int j;
    public Cursor k;
    public MediaFilterList l;
    public static final BaseLoaderImpl$a m;

    static {
       BaseLoaderImpl.m = new BaseLoaderImpl$a(null);
    }
    public void BaseLoaderImpl(Context p0,int p1,Cursor p2,MediaFilterList p3){
       a.q(p0, "context");
       a.q(p3, "filter");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.a = new Object();
       this.b = new CopyOnWriteArraySet();
       this.c = new CopyOnWriteArrayList();
       this.d = new ArrayList();
       this.g = new AtomicReference(null);
       this.h = s.c(BaseLoaderImpl$singleExecutor$2.INSTANCE);
    }
    public boolean A(QMedia p0,boolean p1,List p2){
       if (PatchProxy.isSupport(BaseLoaderImpl.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, BaseLoaderImpl.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if (p0 != null) {
          QMedia path = p0.path;
          if (path != null) {
             File uFile = new File(path);
             if (!p1 && (this.l.isDisplay(p0) || (!uFile.exists() || (uFile.length() > 0 && (p2 == null || p2.contains(uFile.getAbsolutePath())))))) {
                b = false;
             }
          }
       }
       return b;
    }
    public void a(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLoaderImpl.class, "16")) {
          return;
       }
       a.q(p0, "observer");
       this.b.add(p0);
       return;
    }
    public boolean b(){
       boolean i;
       List obj = PatchProxy.apply(null, this, BaseLoaderImpl.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w();
       if (obj != null) {
          i = obj.size();
          BaseLoaderImpl te = this.e;
          if (te == null || i != te.size()) {
             i = true;
          label_002b :
             return i;
          }
       }
       i = false;
       goto label_002b ;
    }
    public t c(int p0,int p1){
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uBaseLoaderI, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.g("BaseLoaderImpl", "asyncLoadMediaList startPos="+p0+", endInclusive="+p1);
       a c = a.c;
       t ot = t.create(new BaseLoaderImpl$b(this, p0, p1)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(ot, "Observable.create<List<I¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, BaseLoaderImpl.class, "12")) {
          return;
       }
       Log.g("BaseLoaderImpl", "close called");
       j.a(this.k);
       return;
    }
    public void d(boolean p0){
       QMedia qMedia;
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseLoaderI, "14")) {
          return;
       }
       String str = "BaseLoaderImpl";
       Log.g(str, "checkAndRefresh called, force="+p0);
       Object obj = null;
       boolean b = true;
       if (!p0) {
          QMedia[] qMediaArray = AlbumAssetCache.c(AlbumAssetCache.d.a(), this.p(this.j), 0, 0, 6, null);
          Cursor uCursor = this.q(this.j);
          if (uCursor != null) {
             int count = uCursor.getCount();
             int i = 0;
             if (count == qMediaArray.length) {
                if (count > 0) {
                   uCursor.moveToPosition(i);
                   qMedia = this.v(this.j, uCursor);
                }else {
                   qMedia = obj;
                }
                uCursor.moveToPosition(i);
                int i1 = (!qMediaArray.length)? 1: 0;
                object oobject = (i1 ^ b)? qMediaArray[i]: obj;
                if (a.g(qMedia, oobject) ^ b) {
                   Log.g(str, "asset first pos has been changed");
                }else {
                label_007f :
                   j.a(uCursor);
                   if (!i) {
                      Log.g(str, "checkAndRefresh no change");
                   }
                }
             }
             i = 1;
             goto label_007f ;
          }
          return;
       }
       b uob = this.g.get();
       if (uob != null && !uob.isDisposed()) {
          Log.g(str, "last loadAllMediaListInterval is loading, assetList.size="+this.c.size());
          uob = this.g.getAndSet(obj);
          if (uob != null) {
             uob.dispose();
          }
       }
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = b;
       this.g.set(f$b.b(this, 0, 0, null, 7, null).observeOn(a.c.i().b()).doOnNext(new BaseLoaderImpl$c(this, uBooleanRef)).doOnComplete(new BaseLoaderImpl$d(this)).doOnDispose(BaseLoaderImpl$e.b).subscribe());
       return;
    }
    public t e(l p0){
       a obj = PatchProxy.applyOneRefs(p0, this, BaseLoaderImpl.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c;
       t ot = t.create(new BaseLoaderImpl$j(this, p0)).subscribeOn(obj.i().c()).observeOn(obj.i().b());
       a.h(ot, "Observable.create<List<L¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public List f(int p0,int p1){
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uBaseLoaderI, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Log.g("BaseLoaderImpl", "syncLoadMediaList startPos="+p0+", endInclusive="+p1);
       this.t();
       return this.u(p0, p1);
    }
    public void g(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLoaderImpl.class, "17")) {
          return;
       }
       a.q(p0, "observer");
       this.b.remove(p0);
       return;
    }
    public t h(int p0,int p1,String p2){
       if (PatchProxy.isSupport(BaseLoaderImpl.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, BaseLoaderImpl.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p2, "albumPath");
       Log.g("BaseLoaderImpl", "loadAllMediaListInterval albumPath="+p2+", interval="+p0+", ratio="+p1);
       t ot = t.create(new BaseLoaderImpl$loadAllMediaListInterval$1(this, p0, p2, p1));
       ThreadPoolExecutor threadPoolEx = PatchProxy.apply(null, this, BaseLoaderImpl.class, "1");
       if (threadPoolEx == PatchProxyResult.class) {
          threadPoolEx = this.h.getValue();
       }
       ot = ot.subscribeOn(b.b(threadPoolEx)).doOnComplete(new BaseLoaderImpl$g(this)).doOnNext(new BaseLoaderImpl$h(this)).observeOn(a.c.i().b()).doOnNext(new BaseLoaderImpl$i(this));
       a.h(ot, "Observable.create { emit¡­ as List<QMedia>\)\n      }");
       return ot;
    }
    public int i(){
       BaseLoaderImpl obj = PatchProxy.apply(null, this, BaseLoaderImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.t();
       obj = this.k;
       int count = (obj != null)? obj.getCount(): 0;
       return count;
    }
    public boolean isClosed(){
       Object obj = PatchProxy.apply(null, this, BaseLoaderImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return j.e(this.k);
    }
    public t j(){
       t obj = PatchProxy.apply(null, this, BaseLoaderImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("BaseLoaderImpl", "loadAlbumFolderList...");
       a c = a.c;
       obj = t.create(new BaseLoaderImpl$f(this)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(obj, "Observable.create<List<Q¡­kInner.schedulers.main\(\)\)");
       return obj;
    }
    public QMedia k(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, BaseLoaderImpl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.c.isEmpty()) {
          objArray = this.c.get(0);
       }
       return objArray;
    }
    public List l(){
       Object obj = PatchProxy.apply(null, this, BaseLoaderImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("BaseLoaderImpl", "getAllMedias, size="+this.c.size());
       return this.c;
    }
    public void m(int p0){
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLoaderI, "23")) {
          return;
       }
       this.d.add(Integer.valueOf(p0));
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, BaseLoaderImpl.class, "22")) {
          return;
       }
       this.d.clear();
       return;
    }
    public final List o(){
       return this.c;
    }
    public final AlbumAssetCache$AssetModule p(int p0){
       AlbumAssetCache$AssetModule aLL;
       if (p0) {
          aLL = (p0 != 1)? AlbumAssetCache$AssetModule.ALL: AlbumAssetCache$AssetModule.IMAGE;
       }else {
          aLL = AlbumAssetCache$AssetModule.VIDEO;
       }
       return aLL;
    }
    public Cursor q(int p0){
       Cursor uCursor;
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBaseLoaderI, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          uCursor = (p0 != 1)? i.e.a(): i.e.c();
       }else {
          uCursor = i.e.d();
       }
       return uCursor;
    }
    public final int r(){
       return this.j;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, BaseLoaderImpl.class, "11")) {
          return;
       }
       Log.g("BaseLoaderImpl", "reset called");
       BaseLoaderImpl tk = this.k;
       int i = 0;
       int position = (tk != null)? tk.getPosition(): 0;
       this.n();
       j.a(this.k);
       Cursor uCursor = this.q(this.j);
       this.k = uCursor;
       if (uCursor != null) {
          uCursor.moveToPosition(Math.max(Math.min(position, (uCursor.getCount() - 1)), i));
          AlbumAssetCache$AssetModule uAssetModule = this.p(this.j);
          AlbumAssetCache$a d = AlbumAssetCache.d;
          if (d.a().f(uAssetModule) != uCursor.getCount()) {
             d.a().a(uAssetModule);
             d.a().e(uAssetModule, uCursor.getCount());
          }
       }
       return;
    }
    public int s(){
       Object obj = PatchProxy.apply(null, this, BaseLoaderImpl.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public final void t(){
       if (PatchProxy.applyVoid(null, this, BaseLoaderImpl.class, "25")) {
          return;
       }
       BaseLoaderImpl ta = this.a;
       _monitor_enter(ta);
       if (j.e(this.k)) {
          Log.g("BaseLoaderImpl", "init called");
          this.n();
          Cursor uCursor = this.q(this.j);
          this.k = uCursor;
          if (uCursor != null) {
             AlbumAssetCache$AssetModule uAssetModule = this.p(this.j);
             AlbumAssetCache$a d = AlbumAssetCache.d;
             if (d.a().f(uAssetModule) != uCursor.getCount()) {
                d.a().a(uAssetModule);
                d.a().e(uAssetModule, uCursor.getCount());
             }
          }
       }
       _monitor_exit(ta);
       return;
    }
    public final List u(int p0,int p1){
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uBaseLoaderI, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uBaseLoaderI = this.a;
       _monitor_enter(uBaseLoaderI);
       Log.g("BaseLoaderImpl", "internalLoadMediaList, startInclusive="+p0+", endInclusive="+p1+"...");
       if (j.e(this.k)) {
          Log.d("BaseLoaderImpl", "internalLoadMediaList assetsCursor closed, return empty list");
          _monitor_exit(uBaseLoaderI);
          return CollectionsKt__CollectionsKt.E();
       }else if(p0 < 0 || p1 >= this.i()){
          Log.d("BaseLoaderImpl", "invalid startInclusive="+p0);
          p0 = 0;
       }
       if (p1 >= this.i()) {
          Log.d("BaseLoaderImpl", "invalid endInclusive="+p1);
          p1 = this.i() - 1;
       }
       p1 = (p1 - p0) + 1;
       p0 = p0 + this.s();
       ArrayList uArrayList = new ArrayList();
       LinkedList linkedList = new LinkedList();
       AlbumAssetCache$AssetModule uAssetModule = this.p(this.j);
       this.e = this.w();
       int i = 0;
       while (uArrayList.size() < p1) {
          int i1 = i + p0;
          BaseLoaderImpl tk = this.k;
          boolean count = (tk != null)? tk.getCount(): -1;
          if (i1 < count) {
             i = i + 1;
             AlbumAssetCache$a d = AlbumAssetCache.d;
             QMedia qMedia = d.a().d(uAssetModule, i1);
             if (qMedia == null) {
                BaseLoaderImpl tk1 = this.k;
                if (tk1 != null) {
                   tk1.moveToPosition(i1);
                }
                qMedia = d.a().g(uAssetModule, i1, this.v(this.j, this.k));
             }
             count = (qMedia != null)? i.e.k(qMedia): false;
             if (this.A(qMedia, count, this.e)) {
                Log.g("BaseLoaderImpl", "add skip position "+i1+", media="+qMedia);
                this.m(i1);
             }else if(count && qMedia != null){
                linkedList.add(new Pair(Integer.valueOf(i1), qMedia));
             }
             if (qMedia == null) {
                a.L();
             }
             uArrayList.add(qMedia);
          }else {
             break ;
          }
       }
       _monitor_exit(uBaseLoaderI);
       return uArrayList;
    }
    public QMedia v(int p0,Cursor p1){
       QMedia qMedia;
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uBaseLoaderI, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          qMedia = (p0 != 1)? i.e.m(p1): i.e.l(p1);
       }else {
          qMedia = i.e.n(p1);
       }
       return qMedia;
    }
    public List w(){
       return null;
    }
    public void x(int p0){
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLoaderI, "21")) {
          return;
       }
       m.i.b(p0);
       return;
    }
    public void y(int p0,QMedia p1){
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBaseLoaderI, "20")) {
          return;
       }
       a.q(p1, "qMedia");
       m.i.c(p0, p1);
       return;
    }
    public void z(int p0){
       BaseLoaderImpl uBaseLoaderI = BaseLoaderImpl.class;
       if (PatchProxy.isSupport(uBaseLoaderI) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseLoaderI, "19")) {
          return;
       }
       m.i.g(p0);
       return;
    }
}
