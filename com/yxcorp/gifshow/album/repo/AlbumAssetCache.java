package com.yxcorp.gifshow.album.repo.AlbumAssetCache;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$a;
import nsd.u;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$b;
import java.lang.Object;
import java.util.Objects;
import java.util.EnumMap;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import java.lang.Class;
import com.yxcorp.gifshow.album.repo.AlbumAssetList;
import java.util.Map;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qrd.l1;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AlbumAssetCache	// class@001a57
{
    public final Object a;
    public final Map b;
    public static final AlbumAssetCache c;
    public static final AlbumAssetCache$a d;

    static {
       AlbumAssetCache.d = new AlbumAssetCache$a(null);
       Objects.requireNonNull(AlbumAssetCache$b.b);
       AlbumAssetCache.c = AlbumAssetCache$b.a;
    }
    public void AlbumAssetCache(){
       super();
       this.a = new Object();
       EnumMap uEnumMap = new EnumMap(AlbumAssetCache$AssetModule.class);
       this.b = uEnumMap;
       uEnumMap.put(AlbumAssetCache$AssetModule.ALL, new AlbumAssetList());
       uEnumMap.put(AlbumAssetCache$AssetModule.VIDEO, new AlbumAssetList());
       uEnumMap.put(AlbumAssetCache$AssetModule.IMAGE, new AlbumAssetList());
    }
    public void AlbumAssetCache(u p0){
       super();
       this.a = new Object();
       EnumMap uEnumMap = new EnumMap(AlbumAssetCache$AssetModule.class);
       this.b = uEnumMap;
       uEnumMap.put(AlbumAssetCache$AssetModule.ALL, new AlbumAssetList());
       uEnumMap.put(AlbumAssetCache$AssetModule.VIDEO, new AlbumAssetList());
       uEnumMap.put(AlbumAssetCache$AssetModule.IMAGE, new AlbumAssetList());
    }
    public static QMedia[] c(AlbumAssetCache p0,AlbumAssetCache$AssetModule p1,int p2,int p3,int p4,Object p5){
       QMedia[] qMediaArray;
       AlbumAssetCache a;
       QMedia[] qMediaArray1;
       int i = 0;
       if (p4 & 0x02) {
          p2 = 0;
       }
       int i1 = Integer.MAX_VALUE;
       if (p4 & 0x04) {
          p3 = Integer.MAX_VALUE;
       }
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(AlbumAssetCache.class)) {
          qMediaArray = PatchProxy.applyThreeRefs(p1, Integer.valueOf(p2), Integer.valueOf(p3), p0, AlbumAssetCache.class, "4");
          if (qMediaArray != PatchProxyResult.class) {
          }else {
          label_0035 :
             a.q(p1, "module");
             a = p0.a;
             _monitor_enter(a);
             if (p2 > p3) {
                qMediaArray1 = new QMedia[i];
                _monitor_exit(a);
             }else {
                AlbumAssetList uAlbumAssetL = p0.b.get(p1);
                if (uAlbumAssetL != null) {
                   if (uAlbumAssetL.getSize() <= 0) {
                      Objects.toString(p1);
                      qMediaArray1 = new QMedia[i];
                      _monitor_exit(a);
                   }else if(p3 == i1){
                      p3 = uAlbumAssetL.getSize() - 1;
                   }
                   if (p2 >= uAlbumAssetL.getSize() || p3 >= uAlbumAssetL.getSize()) {
                      Objects.toString(p1);
                      uAlbumAssetL.getSize();
                      qMediaArray1 = new QMedia[i];
                      _monitor_exit(a);
                   }else {
                      QMedia[] qMediaArray2 = new QMedia[((p3 - p2) + 1)];
                      if (p2 <= p3) {
                         i1 = p2;
                         i = i1 - p2;
                         qMediaArray2[i] = uAlbumAssetL.query(i1);
                         while (i1 != p3) {
                            i1++;
                         }
                      }
                      _monitor_exit(a);
                      qMediaArray = qMediaArray2;
                   }
                }else {
                   Objects.toString(p1);
                   qMediaArray1 = new QMedia[i];
                   _monitor_exit(a);
                }
             }
             qMediaArray = qMediaArray1;
          }
       }else {
          goto label_0035 ;
       }
       return qMediaArray;
    }
    public final void a(AlbumAssetCache$AssetModule p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetCache.class, "9")) {
          return;
       }
       a.q(p0, "module");
       AlbumAssetCache ta = this.a;
       _monitor_enter(ta);
       AlbumAssetList uAlbumAssetL = this.b.get(p0);
       if (uAlbumAssetL != null) {
          uAlbumAssetL.clear();
          a = l1.a;
       }
       _monitor_exit(ta);
       return;
    }
    public final int b(AlbumAssetCache$AssetModule p0){
       AlbumAssetCache obj = PatchProxy.applyOneRefs(p0, this, AlbumAssetCache.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.q(p0, "module");
       obj = this.a;
       _monitor_enter(obj);
       AlbumAssetList uAlbumAssetL = this.b.get(p0);
       int size = (uAlbumAssetL != null)? uAlbumAssetL.getSize(): 0;
       _monitor_exit(obj);
       return size;
    }
    public final QMedia d(AlbumAssetCache$AssetModule p0,int p1){
       AlbumAssetCache uAlbumAssetC = AlbumAssetCache.class;
       if (PatchProxy.isSupport(uAlbumAssetC)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uAlbumAssetC, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p0, "module");
       uAlbumAssetC = this.a;
       _monitor_enter(uAlbumAssetC);
       AlbumAssetList uAlbumAssetL = this.b.get(p0);
       if (uAlbumAssetL != null) {
          if (p1 < 0) {
             "\"fetch asset index out of bounds,"+"index: "+p1+", "+p0+" cache length: "+uAlbumAssetL.getSize();
             _monitor_exit(uAlbumAssetC);
             return null;
          }else if(p1 >= uAlbumAssetL.getSize()){
             _monitor_exit(uAlbumAssetC);
             return null;
          }else {
             _monitor_exit(uAlbumAssetC);
             return uAlbumAssetL.query(p1);
          }
       }else {
          p0+" cache must resize first";
          _monitor_exit(uAlbumAssetC);
          return null;
       }
    }
    public final void e(AlbumAssetCache$AssetModule p0,int p1){
       l1 a;
       AlbumAssetCache uAlbumAssetC = AlbumAssetCache.class;
       if (PatchProxy.isSupport(uAlbumAssetC) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAlbumAssetC, "7")) {
          return;
       }
       a.q(p0, "module");
       uAlbumAssetC = this.a;
       _monitor_enter(uAlbumAssetC);
       AlbumAssetList uAlbumAssetL = this.b.get(p0);
       if (uAlbumAssetL != null) {
          uAlbumAssetL.resize(p1);
          a = l1.a;
       }
       _monitor_exit(uAlbumAssetC);
       return;
    }
    public final int f(AlbumAssetCache$AssetModule p0){
       AlbumAssetCache obj = PatchProxy.applyOneRefs(p0, this, AlbumAssetCache.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.q(p0, "module");
       obj = this.a;
       _monitor_enter(obj);
       AlbumAssetList uAlbumAssetL = this.b.get(p0);
       int size = (uAlbumAssetL != null)? uAlbumAssetL.getSize(): 0;
       _monitor_exit(obj);
       return size;
    }
    public final QMedia g(AlbumAssetCache$AssetModule p0,int p1,QMedia p2){
       AlbumAssetCache obj;
       if (PatchProxy.isSupport(AlbumAssetCache.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, AlbumAssetCache.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p0, "module");
       obj = this.a;
       _monitor_enter(obj);
       AlbumAssetList uAlbumAssetL = this.b.get(p0);
       QMedia qMedia = null;
       if (uAlbumAssetL != null) {
          if (p1 < 0) {
             "insert asset index out of bounds, "+"index: "+p1+", "+p0+" cache length: "+uAlbumAssetL.getSize();
             _monitor_exit(obj);
             return qMedia;
          }else if(p1 >= uAlbumAssetL.getSize()){
             "insert asset index out of bounds, "+"index: "+p1+", "+p0+" cache length: "+uAlbumAssetL.getSize();
             this.e(p0, (p1 + 1));
          }
          uAlbumAssetL.update(p1, p2);
          _monitor_exit(obj);
          return p2;
       }else {
          p0+" cache must resize first";
          _monitor_exit(obj);
          return qMedia;
       }
    }
}
