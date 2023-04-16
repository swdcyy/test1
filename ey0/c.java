package ey0.c;
import z1.a;
import ey0.k;
import java.lang.String;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o96.u;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.a1;
import j21.l;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.StringBuffer;
import com.yxcorp.utility.TextUtils;

public final class c implements a	// class@00221b
{
    public final k a;
    public final String b;

    public void c(k p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       c ta = this.a;
       c tb = this.b;
       Objects.requireNonNull(ta);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (PatchProxy.applyVoidTwoRefs(tb, p0, ta, ok, "3")) {
       }else {
          int i = 0x7f110668;
          if (p0 == null) {
             p0 = PatchProxy.apply(null, ta, ok, "6");
             if (p0 != patchProxyRe) {
             }else {
                p0 = u.g("live_audience");
             }
             if (p0 != null && SystemUtil.K()) {
                i.d(i, "读取定位缓存，上次定位时间是："+DateUtils.a(u.c()));
             }
          }
       label_0052 :
          LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_LOCATION;
          String str = (p0 == null)? "NULL": p0.toString();
          b.c0(lIVE_AUDIENC, "onLocationFinish", "locationCityInfo", str);
          if (p0 == null) {
             i.d(i, a1.p(R.string.arg_RES_7f1025d6));
          }else {
             String str1 = PatchProxy.applyTwoRefs(tb, p0, null, l.class, "1");
             if (str1 != patchProxyRe) {
             }else {
                HashMap hashMap = new HashMap();
                hashMap.put("country", l.a(p0.mCountry));
                hashMap.put("province", l.a(p0.mProvince));
                hashMap.put("city", l.a(p0.mCityName));
                hashMap.put("county", l.a(p0.mCounty));
                hashMap.put("street", l.a(p0.mStreet));
                p0 = Pattern.compile("\(\\$\\{\)\([\\w]+\)\(\\}\)").matcher(tb);
                StringBuffer str2 = "";
                while (p0.find()) {
                   p0.appendReplacement(str2, TextUtils.k(hashMap.get(p0.group(2))));
                }
                p0.appendTail(str2);
                str1 = str2;
             }
             p0 = ta.d;
             if (p0 != null) {
                p0.accept(str1);
                ta.d = null;
             }
          }
          ta.e = false;
       }
       return;
    }
}
