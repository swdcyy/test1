package com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$taskTypeRequestInterval$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$checkSavedOrPublishedPhotoList$2;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$enableLongClickToAlbum$2;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$blockBubbleShow$2;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$enablePostTKBubble$2;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils$disableBundleIdList$2;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import java.util.List;
import q46.l;
import xf6.d;
import dn6.b;
import java.util.Map;
import o56.c;
import o56.a;
import xf6.l;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class CameraEntranceUtils	// class@00107b
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static int g;
    public static final CameraEntranceUtils h;

    static {
       CameraEntranceUtils.h = new CameraEntranceUtils();
       CameraEntranceUtils.a = s.c(CameraEntranceUtils$taskTypeRequestInterval$2.INSTANCE);
       CameraEntranceUtils.b = s.c(CameraEntranceUtils$checkSavedOrPublishedPhotoList$2.INSTANCE);
       CameraEntranceUtils.c = s.c(CameraEntranceUtils$enableLongClickToAlbum$2.INSTANCE);
       CameraEntranceUtils.d = s.c(CameraEntranceUtils$blockBubbleShow$2.INSTANCE);
       CameraEntranceUtils.e = s.c(CameraEntranceUtils$enablePostTKBubble$2.INSTANCE);
       CameraEntranceUtils.f = s.c(CameraEntranceUtils$disableBundleIdList$2.INSTANCE);
       CameraEntranceUtils.g = -1;
    }
    public void CameraEntranceUtils(){
       super();
    }
    public static boolean c(CameraEntranceUtils p0,Integer p1,int p2,Object p3){
       return p0.b(null);
    }
    public final boolean a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CameraEntranceUtils uCameraEntra = CameraEntranceUtils.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uCameraEntra, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       int i = (p0 == null || !p0.length())? 1: 0;
       if (i) {
          return true;
       }else {
          Object obj1 = PatchProxy.apply(null, this, uCameraEntra, "2");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = CameraEntranceUtils.b.getValue();
          }
          boolean b1 = (obj1 != null)? obj1.contains(p0): false;
          if (!b1) {
             return true;
          }else if(l.f(p0) <= 0){
             b = true;
          }
          return b;
       }
    }
    public final boolean b(Integer p0){
       boolean b1;
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraEntranceUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          if (d.J() == p0.intValue()) {
          label_0029 :
             b1 = true;
          label_002c :
             String str = b.b.a().get("bubbleType");
             Integer integer = (str != null)? Integer.valueOf(Integer.parseInt(str)): null;
             int i = (a.a().c() && l.c("key_post_entrance_test_all", false))? 1: 0;
             if (i || (!b1 && (integer == null || (!a.g(integer, p0) && p0 != null)))) {
                b = false;
             }
          label_006d :
             return b;
          }
       }else if(d.J() != -1){
          goto label_0029 ;
       }
       b1 = false;
       goto label_002c ;
    }
    public final int d(){
       c obj = PatchProxy.apply(null, this, CameraEntranceUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.a();
       a.o(obj, "AppEnv.get\(\)");
       Map map = -1;
       if (obj.c()) {
          int g = CameraEntranceUtils.g;
          if (g == map) {
             b b = b.b;
             CharSequence uCharSequenc = b.a().get("bubbleType");
             int i = (uCharSequenc == null || !uCharSequenc.length())? 1: 0;
             if (!i) {
                Object obj1 = b.a().get("bubbleType");
                a.m(obj1);
                g = Integer.parseInt(obj1);
             }else {
                g = d.J();
             }
          }
          map = g;
       }
       return map;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, CameraEntranceUtils.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = CameraEntranceUtils.c.getValue();
       }
       return obj.booleanValue();
    }
}
