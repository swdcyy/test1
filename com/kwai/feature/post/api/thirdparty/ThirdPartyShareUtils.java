package com.kwai.feature.post.api.thirdparty.ThirdPartyShareUtils;
import java.lang.String;
import java.util.regex.Pattern;
import xf6.g;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.w0;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Collections;
import java.lang.Iterable;
import iud.a;
import java.nio.charset.Charset;
import android.app.Application;
import o56.a;
import android.os.Build$VERSION;
import android.content.Context;
import com.yxcorp.gifshow.util.CPU;
import java.lang.Long;
import java.lang.System;
import java.io.File;
import java.lang.Number;
import android.media.MediaPlayer;
import java.lang.Exception;

public final class ThirdPartyShareUtils	// class@001452
{
    public static final Pattern a;
    public static final long b;

    static {
       ThirdPartyShareUtils.a = Pattern.compile("kwai://sharemedia\(/.*\)?");
       long l = (g.Y0())? Long.MAX_VALUE: 3000;
       ThirdPartyShareUtils.b = l;
    }
    public void ThirdPartyShareUtils(){
       super();
    }
    public static boolean a(Uri p0){
       long l1;
       String obj = PatchProxy.applyOneRefs(p0, null, ThirdPartyShareUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "sign";
       String str = w0.a(p0, obj);
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = w0.b(p0).iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (str1.equals(obj) || w0.a(p0, str1) == null) {
             continue ;
          }else {
             uArrayList.add(str1+"="+w0.a(p0, str1));
          }
       }
       Collections.sort(uArrayList);
       obj = CPU.getClock(a.b(), (TextUtils.join("", uArrayList)).getBytes(a.f), Build$VERSION.SDK_INT);
       if (!str.equals(obj)) {
          return false;
       }
       String str2 = w0.a(p0, "signTime");
       if (TextUtils.isEmpty(str2)) {
          return false;
       }
       if (TextUtils.isEmpty(str)) {
          return false;
       }
       long l = -1;
       try{
          l1 = Long.parseLong(str2);
       }catch(java.lang.Exception e0){
          l1 = l;
       }
       if (!l1 - l) {
          return false;
       }
       l = System.currentTimeMillis() - l1;
       if (!g.Y0() && (l < 0 || l - ThirdPartyShareUtils.b > 0)) {
          return false;
       }
       return str.equals(e0);
    }
    public static int b(Context p0,File p1){
       MediaPlayer obj = PatchProxy.applyTwoRefs(p0, p1, null, ThirdPartyShareUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Uri uri = w0.c(p1);
       try{
          obj = new MediaPlayer();
          obj.setDataSource(p0.getApplicationContext(), uri);
          obj.prepare();
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return obj.getDuration();
    }
}
