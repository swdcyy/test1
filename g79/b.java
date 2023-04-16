package g79.b;
import w69.h0;
import android.content.Context;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import k79.o;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import g79.b$c;
import io.reactivex.g;
import g79.a;
import w69.p0;
import brd.z;
import g79.b$e;
import erd.o;
import g79.b$b;
import g79.b$d;
import java.lang.Number;
import k79.f;
import java.util.List;
import java.util.Objects;
import java.util.LinkedList;
import android.database.Cursor;
import android.os.Environment;
import android.content.ContentResolver;
import com.yxcorp.gifshow.albumcontrol.a;
import android.provider.MediaStore$Audio$Media;
import android.net.Uri;
import android.os.CancellationSignal;
import v79.a;
import jc7.h;
import java.io.File;
import jc7.e;
import jc7.a;
import jc7.h$b;
import lkd.b;
import kc7.b;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import zsd.u;
import jlb.c;
import android.text.TextUtils;
import k79.n;
import java.util.Comparator;
import java.util.Collections;
import g79.b$a;
import wv8.a;
import w79.b;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$a;
import com.yxcorp.gifshow.album.repo.AlbumAssetCache$AssetModule;
import java.util.Map;
import com.yxcorp.gifshow.album.repo.AlbumAssetList;
import qrd.l1;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import k79.i;
import k79.i$a;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;

public final class b implements h0	// class@00242c
{
    public final o a;
    public final Context b;
    public final AlbumLimitOption c;

    public void b(Context p0,AlbumLimitOption p1){
       a.q(p0, "context");
       a.q(p1, "limitOption");
       super();
       this.b = p0;
       this.c = p1;
       this.a = new o(p0);
    }
    public t a(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a c = a.c;
       t ot = t.create(new b$c(this, p0, p1)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(ot, "Observable.create<QMedia¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public t b(int p0,int p1,int p2){
       a obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.c;
       t ot = this.g(p0).flatMap(new b$e(p2)).subscribeOn(obj.i().c()).observeOn(obj.i().b());
       a.h(ot, "asyncCreateLoader\(type\).¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public t c(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = this.g(p0).flatMap(new b$b(p0));
       a.h(ot, "asyncCreateLoader\(type\).¡­close\(\)\n          }\n    }");
       return ot;
    }
    public t d(int p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a c = a.c;
       t ot = this.g(p0).flatMap(new b$d(p1)).subscribeOn(c.i().c()).observeOn(c.i().b());
       a.h(ot, "asyncCreateLoader\(type\).¡­kInner.schedulers.main\(\)\)");
       return ot;
    }
    public int e(){
       f obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h(2);
       if (obj != null) {
          return obj.i();
       }
       return 0;
    }
    public List f(String p0){
       a b;
       String str;
       String str1;
       Object obj = this;
       object obj1 = p0;
       b obj2 = PatchProxy.applyOneRefs(obj1, obj, b.class, "5");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       obj2 = obj.a;
       Objects.requireNonNull(obj2);
       LinkedList linkedList = PatchProxy.applyTwoRefs(obj1, null, obj2, o.class, "1");
       if (linkedList != PatchProxyResult.class) {
       }else {
          linkedList = new LinkedList();
          Cursor[] uCursorArray = new Cursor[]{null,null};
          int i = 0;
          int i1 = 1;
          String externalStor = Environment.getExternalStorageState();
          externalStor = (a.g("mounted", externalStor) || a.g("mounted_ro", externalStor))? 1: null;
          ContentResolver contentResol = obj2.c.getContentResolver();
          b = a.b;
          a.h(contentResol, "cr");
          Uri iNTERNAL_CON = MediaStore$Audio$Media.INTERNAL_CONTENT_URI;
          a.h(iNTERNAL_CON, "MediaStore.Audio.Media.INTERNAL_CONTENT_URI");
          uCursorArray[i] = a.k(b, "post_album", contentResol, iNTERNAL_CON, null, null, null, "title_key", null, 128, null).a();
          if (externalStor) {
             iNTERNAL_CON = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
             a.h(iNTERNAL_CON, "MediaStore.Audio.Media.EXTERNAL_CONTENT_URI");
             uCursorArray[i1] = a.k(b, "post_album", contentResol, iNTERNAL_CON, null, null, null, "title_key", null, 128, null).a();
          }
          h oh = h.c();
          a.h(oh, "KsAlbumFileManager.getInstance\(\)");
          Objects.requireNonNull(oh);
          File uFile = PatchProxy.apply(null, oh, h.class, "11");
          if (uFile != PatchProxyResult.class) {
          }else {
             uFile = oh.a(oh.c, new e(oh), new a(oh));
          }
          a.h(uFile, "KsAlbumFileManager.getInstance\(\).photoDir");
          externalStor = uFile.getAbsolutePath();
          int i2 = 0;
          while (i2 < 2) {
             object oobject = uCursorArray[i2];
             if (oobject == null) {
                str = 1;
             }else {
                while (oobject.moveToNext()) {
                   String str2 = oobject.getString(oobject.getColumnIndex("title"));
                   String str3 = oobject.getString(oobject.getColumnIndex("artist"));
                   if (a.g("<unknown>", str3)) {
                      str3 = "";
                   }
                   String str4 = str3;
                   boolean intx = oobject.getInt(oobject.getColumnIndex("album_id"));
                   String str5 = oobject.getString(oobject.getColumnIndex("album"));
                   long longx = oobject.getLong(oobject.getColumnIndex("_size"));
                   long longx1 = oobject.getLong(oobject.getColumnIndex("duration"));
                   String str6 = oobject.getString(oobject.getColumnIndex("_data"));
                   str = oobject.getString(oobject.getColumnIndex("_display_name"));
                   a.h(str, "filename");
                   i1 = str.length() - 3;
                   str1 = str.substring(i1);
                   a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                   long longx2 = oobject.getLong(oobject.getColumnIndex("date_added"));
                   b g = b.g;
                   Objects.requireNonNull(g);
                   Pattern pattern = PatchProxy.apply(null, g, b.class, "4");
                   if (pattern != PatchProxyResult.class) {
                   }else if(b.e == null){
                      b.e = Pattern.compile(".*\\.\(mp3\)$", 2);
                   }
                   pattern = b.e;
                   if (pattern == null) {
                      a.L();
                   }
                   if (pattern.matcher(str6).matches() && longx1 - (long)obj2.b >= 0) {
                      a.h(str6, "url");
                      if (!u.q2(str6, obj2.a, false, 2, null)) {
                         c uoc = new c((long)intx, str6, longx1, longx2, str2, str4, longx, str5);
                         if (!TextUtils.isEmpty(pattern.b)) {
                            c b1 = pattern.b;
                            a.h(b1, "ai.mPath");
                            a.h(externalStor, "appPath");
                            if (!u.q2(b1, externalStor, false, 2, null)) {
                               long l = 0;
                               if (pattern.e - l > 0) {
                                  if (!TextUtils.isEmpty(p0)) {
                                     i1 = a.g(obj1, new File(pattern.b).getParent()) ^ 1;
                                     if (i1 || (new File(pattern.b).exists() && new File(pattern.b).length() - l > 0)) {
                                     }
                                  }else {
                                     str = 1;
                                  }
                               }else {
                               label_021c :
                                  str = 1;
                               }
                            }else {
                               goto label_021c ;
                            }
                         }else {
                         label_021b :
                            intx = false;
                            goto label_021c ;
                         }
                      }else {
                         goto label_021b ;
                      }
                   }else {
                      goto label_021b ;
                   }
                   str1 = 1;
                }
                oobject.close();
             }
             i2 = i2 + 1;
             str1 = 1;
          }
          Collections.sort(linkedList, n.b);
          i = 0;
          while (i < 2) {
             obj1 = uCursorArray[i];
             if (obj1 != null) {
                obj1.close();
             }
             i = i + 1;
          }
       }
       return linkedList;
    }
    public final t g(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = t.create(new b$a(this, p0)).subscribeOn(a.c.i().c());
       a.h(ot, "Observable.create<IAsset¡­SdkInner.schedulers.io\(\)\)");
       return ot;
    }
    public final f h(int p0){
       a obj;
       b a;
       boolean b;
       AssetsLoaderImpl uAssetsLoade;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.b;
       if (!obj.a()) {
          a = b.a;
          b = a.a(this.c.a());
          a.c("DataManagerImpl#createLoader", this.c.a(), b);
          if (!b) {
             Objects.requireNonNull(obj);
          }
       }
       AlbumAssetCache uAlbumAssetC = AlbumAssetCache.d.a();
       Objects.requireNonNull(uAlbumAssetC);
       if (!PatchProxy.applyVoid(null, uAlbumAssetC, AlbumAssetCache.class, "10")) {
          AlbumAssetCache a1 = uAlbumAssetC.a;
          _monitor_enter(a1);
          AlbumAssetList uAlbumAssetL = uAlbumAssetC.b.get(AlbumAssetCache$AssetModule.ALL);
          if (uAlbumAssetL != null) {
             uAlbumAssetL.clear();
          }
          uAlbumAssetL = uAlbumAssetC.b.get(AlbumAssetCache$AssetModule.VIDEO);
          if (uAlbumAssetL != null) {
             uAlbumAssetL.clear();
          }
          AlbumAssetList uAlbumAssetL1 = uAlbumAssetC.b.get(AlbumAssetCache$AssetModule.IMAGE);
          if (uAlbumAssetL1 != null) {
             uAlbumAssetL1.clear();
             l1 a2 = l1.a;
          }
          _monitor_exit(a1);
       }
       if (p0) {
          if (p0 != 1) {
             uAssetsLoade = (p0 != 2)? new AssetsLoaderImpl(this.b, i.e.a(), this.c.u()): new AssetsLoaderImpl(this.b, i.e.a(), this.c.u());
          }else {
             uAssetsLoade = new ImageLoaderImpl(this.b, i.e.c(), this.c.u());
          }
       }else {
          uAssetsLoade = new VideoLoaderImpl(this.b, i.e.d(), this.c.u());
       }
       return uAssetsLoade;
    }
}
