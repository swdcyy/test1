package gsa.i;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;
import com.yxcorp.gifshow.homepage.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.homepage.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import sb5.c;
import java.lang.Number;
import sb5.b;
import com.kwai.component.homepage_interface.skin.HomeBottomBarSkinConfig;
import java.util.List;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import com.yxcorp.gifshow.util.v;
import j80.c;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import gsa.i$b;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.q;
import java.util.Iterator;
import android.app.Application;
import o56.a;
import com.yxcorp.image.request.a;
import s0d.e;
import gsa.i$a;
import android.content.Context;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.a$g;
import com.yxcorp.image.fresco.wrapper.a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import kb.c;
import com.yxcorp.utility.Log;
import no5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class i	// class@002bf2
{
    public static final Boolean a;
    public static x b;
    public static x c;

    static {
       i.a = Boolean.valueOf(a.t().d("enableBottomTabIconSaveFile", true));
       i.b = Suppliers.a(a.b);
       i.c = Suppliers.a(b.b);
    }
    public void i(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, i.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = i.b.get();
       }
       return obj.booleanValue();
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.a(-1397878105).c();
    }
    public static int c(){
       Object obj = PatchProxy.apply(null, null, i.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (i.i() != null && (i.i().mHomeBottomBarSkinConfig != null && i.i().mHomeBottomBarSkinConfig.mIconUrls != null)) {
          return i.i().mHomeBottomBarSkinConfig.mIconUrls.size();
       }
       return 0;
    }
    public static File d(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, oi, "18");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, oi, "19");
       if (obj2 != patchProxyRe) {
       }else if(TextUtils.x(p0)){
          obj2 = obj;
       }else {
          obj2 = Uri.parse(p0).getPath();
       }
       p0 = v.h(obj2);
       if (TextUtils.x(p0)) {
          return obj;
       }else {
          return new File(b.a(-1504323719).j("bottom_tab_resource"), p0+".png");
       }
    }
    public static String e(){
       HomeBottomBarSkinConfig obj = PatchProxy.apply(null, null, i.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!i.a()) {
          return "";
       }
       obj = b.a(-1397878105).b();
       if (obj != null) {
          obj = obj.mCameraIconUrl;
          if (obj != null) {
             return obj;
          }
       }
       return "";
    }
    public static List f(){
       HomeBottomBarSkinConfig obj = PatchProxy.apply(null, null, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-1397878105).b();
       ArrayList uArrayList = new ArrayList();
       if (obj != null) {
          HomeBottomBarSkinConfig mIconUrls = obj.mIconUrls;
          if (mIconUrls != null && mIconUrls.size() > 0) {
             uArrayList.addAll(obj.mIconUrls);
          }
          mIconUrls = obj.mCameraIconUrl;
          if (mIconUrls != null) {
             uArrayList.add(mIconUrls);
          }
          mIconUrls = obj.mDarkBottomBarBgUrl;
          if (mIconUrls != null) {
             uArrayList.add(mIconUrls);
          }
          obj = obj.mLightBottomBarBgUrl;
          if (obj != null) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public static String g(int p0){
       HomeBottomBarSkinConfig obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oi, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!i.a()) {
          return "";
       }else {
          obj = b.a(-1397878105).b();
          if (obj != null) {
             obj = obj.mIconUrls;
             if (obj != null) {
                return obj.get(p0);
             }
          }
          return "";
       }
    }
    public static String h(){
       Object obj = PatchProxy.apply(null, null, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (i.i() != null && i.i().mHomeBottomBarSkinConfig != null) {
          return i.i().mHomeBottomBarSkinConfig.mRedDotColor;
       }
       return "";
    }
    public static b i(){
       Object obj = PatchProxy.apply(null, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1397878105).a();
    }
    public static void j(KwaiImageView p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, i.class, "17")) {
          return;
       }
       if (i.a.booleanValue()) {
          File uFile = i.d(p1);
          if (uFile == null || !uFile.exists()) {
             p0.M(p1, p2);
          }else {
             p0.w(uFile, 0, 0, new i$b(p0, p1, p2));
          }
       }else {
          p0.M(p1, p2);
       }
       return;
    }
    public static void k(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, oi, "16")) {
          return;
       }
       List list = i.f();
       if (q.f(list)) {
          return;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (i.a.booleanValue()) {
             File uFile = i.d(str);
             if (uFile != null) {
                a.j(a.b(), a.u(str).q(), uFile.getAbsolutePath(), new i$a(str));
             }
          }else {
             Fresco.getImagePipeline().prefetchToDiskCache(a.u(str).q(), objArray);
          }
          Log.g("NasaBottomTabIconUtils", str);
       }
       HomeBottomBarSkinConfig obj = PatchProxy.apply(objArray, objArray, oi, "15");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = b.a(-1397878105).b();
          i = (obj != null)? obj.mVersionCode: 0;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("home_bottom_icon_skin_version", i);
       g.a(uEditor);
       return;
    }
    public static boolean l(){
       Object obj = PatchProxy.apply(null, null, i.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = i.c.get();
       }
       return obj.booleanValue();
    }
}
