package com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$requestConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.http.l;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.text.Regex;
import java.util.List;
import java.util.Collection;
import java.util.Objects;
import kotlin.text.StringsKt__StringsKt;
import com.yxcorp.gifshow.profile.util.ProfileLastSeenUtil$a;

public final class ProfileLastSeenUtil	// class@0015c9
{
    public static final p a;
    public static final ProfileLastSeenUtil b;

    static {
       ProfileLastSeenUtil.b = new ProfileLastSeenUtil();
       ProfileLastSeenUtil.a = s.c(ProfileLastSeenUtil$requestConfig$2.INSTANCE);
    }
    public void ProfileLastSeenUtil(){
       super();
    }
    public static final boolean b(String p0,QPhoto p1,i p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ProfileLastSeenUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p1, "photo");
       a.p(p2, "pageList");
       if (a.g(p0, p1.getPhotoId())) {
          if (!p2 instanceof l) {
             p2 = null;
          }
          if (p2 != null && p2.k2(p1) == true) {
             return false;
          }else {
             return true;
          }
       }else {
          CommonMeta commonMeta = p1.getCommonMeta();
          if (commonMeta != null) {
             commonMeta = commonMeta.mShareInfo;
             if (TextUtils.x(commonMeta)) {
                return false;
             }else {
                a.o(commonMeta, "shareInfo");
                String[] stringArray = new String[false];
                Object[] objArray = new Regex("&").split(commonMeta, false).toArray(stringArray);
                Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                int len = objArray.length;
                int i = 0;
                while (i < len) {
                   object oobject = objArray[i];
                   int i1 = StringsKt__StringsKt.i3(oobject, "=", 0, false, 6, null);
                   if (i1 > 0) {
                      int i2 = oobject.length() - true;
                      if (i1 < i2) {
                         String str = oobject.substring(false, i1);
                         a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                         if (a.g("photoId", str)) {
                            String str1 = oobject.substring((i1 + true));
                            a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
                            return a.g(p0, str1);
                         }
                      }
                   }
                   i = i + 1;
                }
             }
          }
          return false;
       }
    }
    public final ProfileLastSeenUtil$a a(){
       Object obj = PatchProxy.apply(null, this, ProfileLastSeenUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ProfileLastSeenUtil.a.getValue();
    }
}
