package d61.j;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import bjd.d;
import bb6.c;
import d61.j$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import d61.j$a;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import ekd.x0;
import java.util.Iterator;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.yxcorp.gifshow.model.CDNUrl;

public final class j	// class@001f27
{

    public void j(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j.b(CdnHostGroupType.LIVE, p0);
    }
    public static String b(CdnHostGroupType p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       String obj = null;
       d obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, oj, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = c.a();
       Uri obj2 = PatchProxy.applyTwoRefs(p0, p1, obj, oj, "3");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else if(TextUtils.x(p1)){
          obj2 = Uri.parse(p1);
          String path = obj2.getPath();
          if (!TextUtils.x(path) && path.startsWith("/")) {
             path = path.substring(1);
          }
          j$b uob = new j$b(obj);
          uob.d = p0;
          uob.b = path;
          String scheme = (!TextUtils.x(obj2.getScheme()))? obj2.getScheme(): "https";
          uob.a = scheme;
          HashMap hashMap = PatchProxy.applyOneRefs(obj2, obj, oj, "4");
          if (hashMap != patchProxyRe) {
          }else {
             hashMap = new HashMap();
             Set set = x0.c(obj2);
             if (set != null) {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   String str1 = iterator.next();
                   obj = obj2.getQueryParameter(str1);
                   if (obj != null) {
                      hashMap.put(str1, obj);
                   }
                }
             }
          }
          uob.c = hashMap;
          obj = uob;
       }
       if (obj == null) {
          b.c0(LiveLogTag.LIVE_TVC_AD, "parseUrl fail", "originUrl", p1);
          return p1;
       }else {
          String str = obj1.f(obj.d.getTypeName(), obj.a, obj.b, obj.c);
          if (TextUtils.x(str)) {
             b.c0(LiveLogTag.LIVE_TVC_AD, "composeUrl fail", "originUrl", p1);
             return p1;
          }else {
             return str;
          }
       }
    }
    public static CDNUrl[] c(LiveCdnNodeView[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       if (p0 == null || !p0.length) {
          CDNUrl[] uCDNUrlArray = new CDNUrl[i];
          return uCDNUrlArray;
       }else {
          CDNUrl[] uCDNUrlArray1 = new CDNUrl[p0.length];
          for (; i < p0.length; i = i + 1) {
             uCDNUrlArray1[i] = new CDNUrl(p0[i].cdn, p0[i].url);
          }
          return uCDNUrlArray1;
       }
    }
}
