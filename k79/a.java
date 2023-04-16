package k79.a;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import k79.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import wv8.a;
import w79.b;
import java.util.Objects;
import kotlin.TypeCastException;
import java.lang.CharSequence;
import kotlin.jvm.internal.a;
import w69.g0;
import g79.a;
import android.app.Application;
import android.content.Context;
import java.util.Map;
import java.lang.RuntimeException;
import k79.p;
import com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import android.database.Cursor;
import nsd.u;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;

public final class a	// class@002b47
{
    public static final String a = "AlbumAssetLoaderFactory";
    public static f b;
    public static f c;
    public static f d;
    public static f e;
    public static f f;
    public static HashMap g;
    public static final HashMap h;
    public static final a i;

    static {
       a.i = new a();
       a.h = new HashMap();
    }
    public void a(){
       super();
    }
    public static final f a(int p0,String p1,AlbumLimitOption p2){
       StringBuilder obj;
       String str;
       b a;
       int b1;
       f f;
       String obj1;
       MediaFilterList mediaFilterL;
       Application uApplication1;
       MediaFilterList mediaFilterL2;
       MediaFilterList mediaFilterL3;
       f b2;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "getLoader type="+p0+", sceneType="+p1+", limitOption="+p2;
       a b = a.b;
       if (!b.a()) {
          if (p2 != null) {
             str = p2.a();
             if (str != null) {
             label_004e :
                a = b.a;
                b1 = a.a(str);
                a.c("AlbumAssetLoaderFactory#getLoader", str, b1);
                if (!b1) {
                   Objects.requireNonNull(b);
                }
             }
          }
          str = "post_asset_picker";
          goto label_004e ;
       }
       Cursor uCursor = null;
       str = "<set-?>";
       if (p0) {
          int i = 1;
          if (p0 != i) {
             b1 = 2;
             if (p0 != b1) {
                if (p0 != 4) {
                   f = a.f;
                   if (f != null) {
                      if (f != null) {
                         return f;
                      }else {
                         throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.repo.IAssetsLoader");
                      }
                   }else if(p1 != null){
                      if (p1.length() <= 0) {
                         i = 0;
                      }
                      if (i) {
                         HashMap g = a.g;
                         if (g == null) {
                            g = new HashMap();
                            a.g = g;
                         }
                         if (p2 != null) {
                            b1 = p2.t();
                         }
                         HashMap hashMap = g.get(p1);
                         if (hashMap == null) {
                            hashMap = new HashMap();
                         }
                         a.h(hashMap, "map[sceneType] ?: hashMapOf\(\)");
                         if (hashMap.containsKey(Integer.valueOf(b1))) {
                            obj1 = hashMap.get(Integer.valueOf(b1));
                            if (obj1 == null) {
                               a.L();
                            }
                            return obj1;
                         }else {
                            g0 og0 = a.h.get(p1);
                            if (og0 != null) {
                               hashMap.put(Integer.valueOf(b1), og0.k7(b1, p1, a.c.b()));
                               g.put(p1, hashMap);
                               obj1 = hashMap.get(Integer.valueOf(b1));
                               if (obj1 == null) {
                                  a.L();
                               }
                               return obj1;
                            }
                         }
                      }
                   }
                label_00f3 :
                   throw new RuntimeException("you have not registered a custom assets loader");
                }else if(a.e == null){
                   Application uApplication = a.c.b();
                   if (p2 != null) {
                      mediaFilterL = p2.u();
                      if (mediaFilterL != null) {
                      label_0115 :
                         MediaFilterList mediaFilterL1 = mediaFilterL;
                         int i1 = (p2 != null)? p2.t(): 2;
                         p op = new p(uApplication, i1, null, mediaFilterL1, 4, null);
                         a.e = a.e;
                      }
                   }
                   mediaFilterL = new MediaFilterList();
                   goto label_0115 ;
                }
                if (a.e instanceof p) {
                   obj1 = "null cannot be cast to non-null type com.yxcorp.gifshow.album.repo.ScreenshotLoaderImpl";
                   if (p2 != null) {
                      int i2 = p2.t();
                      f e = a.e;
                      if (e != null) {
                         p op1 = p.class;
                         if (!PatchProxy.isSupport(op1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), e, op1, "3")) {
                            e.j = i2;
                         }
                      }else {
                         throw new TypeCastException(obj1);
                      }
                   }
                   if (p2 != null) {
                      mediaFilterL = p2.u();
                      if (mediaFilterL != null) {
                         f e1 = a.e;
                         if (e1 != null) {
                            if (!PatchProxy.applyVoidOneRefs(mediaFilterL, e1, BaseLoaderImpl.class, "30")) {
                               a.q(mediaFilterL, str);
                               e1.l = mediaFilterL;
                            }
                         }else {
                            throw new TypeCastException(obj1);
                         }
                      }
                   }
                }
             label_017f :
                f = a.e;
                if (f == null) {
                   a.L();
                }
             }else if(a.b == null){
                uApplication1 = a.c.b();
                if (p2 != null) {
                   mediaFilterL2 = p2.u();
                   if (mediaFilterL2 != null) {
                   label_01a2 :
                      a.b = new AssetsLoaderImpl(uApplication1, uCursor, mediaFilterL2);
                   }
                }
                mediaFilterL2 = new MediaFilterList();
                goto label_01a2 ;
             }
             if (p2 != null) {
                mediaFilterL3 = p2.u();
                if (mediaFilterL3 != null) {
                   b2 = a.b;
                   if (b2 instanceof AssetsLoaderImpl) {
                      if (b2 != null) {
                         if (!PatchProxy.applyVoidOneRefs(mediaFilterL3, b2, AssetsLoaderImpl.class, "28")) {
                            a.q(mediaFilterL3, str);
                            b2.j = mediaFilterL3;
                         }
                      }else {
                         throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.repo.AssetsLoaderImpl");
                      }
                   }
                }
             }
             f = a.b;
             if (f == null) {
                a.L();
             }
          }else if(a.c == null){
             uApplication1 = a.c.b();
             if (p2 != null) {
                mediaFilterL2 = p2.u();
                if (mediaFilterL2 != null) {
                label_01f5 :
                   a.c = new ImageLoaderImpl(uApplication1, uCursor, mediaFilterL2);
                }
             }
             mediaFilterL2 = new MediaFilterList();
             goto label_01f5 ;
          }
          if (p2 != null) {
             mediaFilterL3 = p2.u();
             if (mediaFilterL3 != null) {
                b2 = a.c;
                if (b2 instanceof ImageLoaderImpl) {
                   if (b2 != null) {
                      if (!PatchProxy.applyVoidOneRefs(mediaFilterL3, b2, ImageLoaderImpl.class, "20")) {
                         a.q(mediaFilterL3, str);
                         b2.k = mediaFilterL3;
                      }
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.repo.ImageLoaderImpl");
                   }
                }
             }
          }
          f = a.c;
          if (f == null) {
             a.L();
          }
       }else if(a.d == null){
          uApplication1 = a.c.b();
          if (p2 != null) {
             mediaFilterL2 = p2.u();
             if (mediaFilterL2 != null) {
             label_0247 :
                a.d = new VideoLoaderImpl(uApplication1, uCursor, mediaFilterL2);
             }
          }
          mediaFilterL2 = new MediaFilterList();
          goto label_0247 ;
       }
       if (p2 != null) {
          mediaFilterL3 = p2.u();
          if (mediaFilterL3 != null) {
             b2 = a.d;
             if (b2 instanceof VideoLoaderImpl) {
                if (b2 != null) {
                   if (!PatchProxy.applyVoidOneRefs(mediaFilterL3, b2, VideoLoaderImpl.class, "21")) {
                      a.q(mediaFilterL3, str);
                      b2.k = mediaFilterL3;
                   }
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type com.yxcorp.gifshow.album.repo.VideoLoaderImpl");
                }
             }
          }
       }
       f = a.d;
       if (f == null) {
          a.L();
       }
    label_027e :
       return f;
    }
}
