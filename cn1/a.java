package cn1.a;
import e61.a;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import nz1.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$a;
import hr3.a;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.StringBuilder;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import java.io.File;
import qkd.b;
import android.util.LruCache;
import java.util.Map;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.graphics.Bitmap$Config;

public class a	// class@0004e8
{
    public static a a;
    public static Map b;
    public static final boolean c;

    static {
       a.a = new a(0x7d000);
       a.b = new HashMap();
       a.c = a.t().u("SOURCE_LIVE").d("liveHonorMedalSwitchLiveResourceManager", false);
    }
    public void a(){
       super();
    }
    public Bitmap a(String p0,int p1){
       Object obj;
       boolean b;
       String obj2;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       LiveResourceFileUtil$LiveResourceFileType obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = PatchProxy.apply(obj, obj, uoa, "5");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(b.c.b() && a.c){
             b = true;
          }else {
             b = false;
          }
          String str = "";
          if (b) {
             obj2 = PatchProxy.applyOneRefs(p0, obj, uoa, "6");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else if(TextUtils.x(p0)){
                str1 = b.c.a(p0, "live_honor_medal");
                if (TextUtils.x(str1)) {
                   str1 = p0;
                }
                a uoa1 = LiveMaterialResourceManager.d.a().b(str1);
                if (uoa1 != null) {
                   str1 = uoa1.a();
                label_007d :
                   obj1 = str1;
                }
             }
          }else {
             obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "4");
             if (obj1 != patchProxyRe) {
             }else if(TextUtils.x(p0)){
                obj1 = LiveResourceFileUtil$LiveResourceFileType.HONOR_MEDAL;
                obj2 = PatchProxy.applyOneRefs(p0, obj, uoa, "2");
                if (obj2 != patchProxyRe) {
                }else {
                   obj2 = LiveResourceFileUtil.k("live_honor_medal_resource")+"/"+p0;
                }
                File uFile = LiveResourceFileUtil.j(obj1, obj2);
                if (!b.S(uFile)) {
                   LiveResourceFileUtil.h(obj1);
                }
                str1 = uFile.getAbsolutePath();
                goto label_007d ;
             }
          }
          obj1 = str;
       }
       if (!TextUtils.x(obj1)) {
          String[] stringArray = new String[]{obj1};
          if (b.S(b.B(stringArray))) {
             Bitmap uBitmap = a.a.get(p0+p1);
             if (uBitmap != null) {
                return uBitmap;
             }else {
                uBitmap = a.b.get(p0);
                if (uBitmap == null) {
                   uBitmap = BitmapUtil.s(obj1);
                   a.b.put(p0, uBitmap);
                }
                if (uBitmap == null) {
                   return obj;
                }else if(p1 > 0 && p1 != uBitmap.getHeight()){
                   uBitmap = BitmapUtil.U(uBitmap, (int)((((float)uBitmap.getWidth() * 0x3f800000) / (float)uBitmap.getHeight()) * (float)p1), p1, Bitmap$Config.ARGB_8888, 0);
                }
                a.a.put(p0+p1, uBitmap);
                return uBitmap;
             }
          }
       }
       return obj;
    }
}
