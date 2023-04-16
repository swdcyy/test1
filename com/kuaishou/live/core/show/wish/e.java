package com.kuaishou.live.core.show.wish.e;
import vq5.b;
import com.kuaishou.live.core.show.wish.f;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.util.Objects;
import java.lang.String;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cn2.i;
import java.util.HashMap;
import java.util.Map;
import va1.s0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import an2.a;
import o02.e;
import brd.t;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import wm2.e;
import sfc.a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class e implements b	// class@00129a
{
    public final f a;

    public void e(f p0){
       this.a = p0;
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       String str = "wishid";
       String str1 = x0.a(p0, str);
       String str2 = x0.a(p0, "effectid");
       String str3 = x0.a(p0, "userid");
       String str4 = x0.a(p0, "source");
       if (str4.equals("share")) {
          str4 = "1";
       }else if(str4.equals("profile")){
          str4 = "2";
       }else if(str4.equals("message")){
          str4 = "3";
       }else {
          str4 = "";
       }
       if (!TextUtils.x(str1) && !TextUtils.x(str3)) {
          String str5 = i.e(ta.O.c.mEntity);
          if (!TextUtils.x(str5)) {
             HashMap hashMap = new HashMap();
             hashMap.put(str, str1);
             hashMap.put("userIdOfWish", str3);
             hashMap.put("wishdetailfrom", str4);
             hashMap.put("sourceType", String.valueOf(ta.O.l));
             hashMap.put("sourceUrl", i.c(ta.O.m));
             str = s0.a(str5, hashMap);
             f uof = f.class;
             if (PatchProxy.isSupport(uof)) {
                Object[] objArray = new Object[]{str1,str3,str4,str2,str};
                if (!PatchProxy.applyVoid(objArray, ta, uof, "4")) {
                }
             }else {
             }
          }
       }
    label_00d9 :
       return;
    }
}
