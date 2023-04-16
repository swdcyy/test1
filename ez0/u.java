package ez0.u;
import vq5.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import ekd.x0;
import mk1.c0;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserInfo;
import java.net.URLDecoder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.CDNUrl;
import wj2.q0;
import java.lang.Number;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import fg6.a;
import ez0.z;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import t02.a0;
import e92.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import um2.a;

public final class u implements b	// class@00225a
{
    public final k a;

    public void u(k p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       u ta;
       PatchProxyResult patchProxyRe;
       k ok;
       String str1;
       String str2;
       int i;
       int i1;
       Map map;
       try{
          ta = this.a;
          Objects.requireNonNull(ta);
          patchProxyRe = PatchProxyResult.class;
          ok = k.class;
          GiftTab giftTab = c0.a.a(x0.a(p0, "tab"));
          String str = x0.a(p0, "selectedGiftId");
          str1 = "UTF-8";
          String obj = PatchProxy.applyOneRefs(p0, ta, ok, "6");
          k ok1 = null;
          if (obj != patchProxyRe) {
             str2 = obj;
          }else {
             obj = x0.a(p0, "userid");
             String str5 = x0.a(p0, "username");
             str2 = x0.a(p0, "userheadurl");
             String str6 = x0.a(p0, "headurls");
             if (obj != null && str5 != null) {
                try{
                   UserInfo userInfo = new UserInfo();
                   userInfo.mId = URLDecoder.decode(obj, str1);
                   userInfo.mName = URLDecoder.decode(str5, str1);
                   if (str2 != null) {
                      userInfo.mHeadUrl = URLDecoder.decode(str2, str1);
                   }
                   if (!TextUtils.x(str6)) {
                      userInfo.mHeadUrls = q0.e(URLDecoder.decode(str6, str1));
                   }
                }catch(java.io.UnsupportedEncodingException e0){
                   k ok2 = ok1;
                }
             }else {
                goto label_0070 ;
             }
          }
       }catch(java.io.UnsupportedEncodingException e0){
       }
       try{
          Object obj1 = PatchProxy.applyOneRefs(p0, ta, ok, "5");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             str1 = x0.a(p0, "sourceType");
             if (str1 != null) {
                i = Integer.parseInt(str1);
             }
          }
          i1 = i;
       label_00a8 :
          String str3 = x0.a(p0, "scene");
          Object obj2 = PatchProxy.applyOneRefs(p0, ta, ok, "7");
          if (obj2 != patchProxyRe) {
             map = obj2;
          }else {
             String str4 = x0.a(p0, "bizmap");
             map = (TextUtils.x(str4))? ok1: a.a.i(str4, new z(ta).getType());
          }
       }catch(java.lang.Exception e4){
          b.I(LiveLogTag.GIFT, "parse url params sourceType failed: "+i, e4);
       }
       i1 = 2;
       goto label_00a8 ;
    }
}
