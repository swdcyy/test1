package com.yxcorp.gifshow.profile.ProfileEditUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import xh7.a;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import p3c.h;
import java.util.HashMap;
import wh5.c;
import yh7.a;
import com.kwai.framework.model.user.UserProfile;
import java.util.Set;
import java.util.Iterator;
import ekd.x0;

public class ProfileEditUriHandler extends AnnotationUriHandler	// class@0011e3
{

    public void ProfileEditUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       int i1;
       HashMap hashMap;
       ProfileEditUriHandler profileEditU = ProfileEditUriHandler.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, profileEditU, str)) {
          return;
       }
       Uri uri = p0.g();
       Context uContext = p0.b();
       Map obj = PatchProxy.applyOneRefs(uri, this, profileEditU, "2");
       Context uContext1 = 4;
       int i = 3;
       if (obj != PatchProxyResult.class) {
          i1 = obj.intValue();
       }else {
          String host = uri.getHost();
          String path = uri.getPath();
          if (TextUtils.n(host, "profilesetting")) {
             i1 = 0;
          }else if(TextUtils.n(host, "userinfodetailedit") && TextUtils.n(path, "/editIntroduction")){
             i1 = 3;
          }else if(TextUtils.n(host, "school") && TextUtils.n(path, "/select")){
             i1 = 4;
          }else {
             i1 = -1;
          }
       }
       if (i1) {
          if (i1 != i) {
             if (i1 == uContext1 && !PatchProxy.applyVoidThreeRefs(uri, uContext, p1, this, ProfileEditUriHandler.class, "5")) {
                obj = this.e(uri);
                if (!PatchProxy.applyVoidTwoRefs(uContext, obj, null, h.class, "7")) {
                   if (obj == null) {
                      hashMap = new HashMap();
                   }
                   if (!c.b()) {
                      str = "0";
                   }
                   hashMap.put("enableTeenageMode", str);
                   h.a(uContext, "social-profile-editProfile", "EditSchoolInfoPage", hashMap);
                }
                p1.a(new a(200));
             }
          }else if(PatchProxy.applyVoidThreeRefs(uri, uContext, p1, this, ProfileEditUriHandler.class, "4")){
             h.d(uContext, this.e(uri));
             p1.a(new a(200));
          }
       }else if(PatchProxy.applyVoidThreeRefs(uri, uContext, p1, this, ProfileEditUriHandler.class, "3")){
          h.c(uContext, null, this.e(uri));
          p1.a(new a(200));
       }
       return;
    }
    public final Map e(Uri p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ProfileEditUriHandler.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0 != null && p0.isHierarchical()) {
          Iterator iterator = p0.getQueryParameterNames().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (!TextUtils.x(str)) {
                obj.put(str, x0.b(p0, str, ""));
             }
          }
       }
       return obj;
    }
}
