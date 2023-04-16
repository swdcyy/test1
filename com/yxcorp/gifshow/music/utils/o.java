package com.yxcorp.gifshow.music.utils.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kqb.y;
import java.util.List;
import com.yxcorp.gifshow.music.utils.n;
import ok.h;
import com.google.common.collect.Lists;
import com.kuaishou.android.model.music.Music;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.music.utils.d;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import kqb.b0;
import java.lang.Number;
import com.yxcorp.gifshow.music.utils.g;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.music.network.model.response.MusicRecommendInfo;
import java.util.Map;
import lnc.o5;
import java.util.Iterator;
import kqb.a0;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import erd.g;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import kqb.c0;
import crd.b;

public class o	// class@0020a4
{

    public void o(){
       super();
    }
    public static Lyrics a(Lyrics p0,long p1,long p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), null, o.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return y.c(p0, p1, p2);
    }
    public static List b(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Lists.h(p0, n.b);
    }
    public static Bitmap c(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.c(p0);
    }
    public static Bitmap d(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d(p0);
    }
    public static String e(Music p0){
       object oobject;
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       Music mMmuLrcUrls = p0.mMmuLrcUrls;
       if (mMmuLrcUrls != null) {
          int len = mMmuLrcUrls.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = mMmuLrcUrls[i];
                if (oobject != null && !TextUtils.x(oobject.getUrl())) {
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
          return oobject.getUrl();
       }
       p0 = p0.mMmuLrcUrl;
       if (p0 != null) {
          return p0;
       }else {
          return "";
       }
    }
    public static File f(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(p0);
    }
    public static String g(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       if (!TextUtils.x(p0.mLrcUrl)) {
          return p0.mLrcUrl;
       }
       p0 = p0.mLrcUrls;
       if (p0 != null) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (oobject != null && !TextUtils.x(oobject.getUrl())) {
                return oobject.getUrl();
             }
             i = i + 1;
          }
       }
       return "";
    }
    public static long h(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return g.a(p0);
    }
    public static File i(Music p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.j(p0);
    }
    public static int j(List p0,Music p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, o.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null || (!p0.isEmpty() && p1 != null)) {
          int i = 0;
          int i1 = p0.size();
          while (i < i1) {
             if (TextUtils.n(p1.getUniqueCode(), p0.get(i).getUniqueCode())) {
                return i;
             }
             i = i + 1;
          }
       }
       return -1;
    }
    public static boolean k(Music p0){
       boolean b = (p0 != null && p0.mIsFakeQPhoto != null)? true: false;
       return b;
    }
    public static boolean l(Music p0,int p1,int p2){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, o.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return g.c(p0, p1, p2);
    }
    public static void m(MusicsResponse p0){
       StringBuilder str1;
       if (PatchProxy.applyVoidOneRefs(p0, null, o.class, "19")) {
          return;
       }
       if (q.f(p0.mMusics)) {
          return;
       }
       MusicsResponse mRecommendIn = p0.mRecommendInfo;
       if (mRecommendIn == null || (!q.h(mRecommendIn.mRecoReasonMap) && !TextUtils.x(mRecommendIn.mRecoMusicCount))) {
          int i = o5.b(mRecommendIn.mRecoMusicCount, 0);
          Iterator iterator = p0.mMusics.iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             Music music = iterator.next();
             if (i1 < i) {
                if (TextUtils.x(music.mExpTag)) {
                   continue ;
                }else {
                   String str = mRecommendIn.mRecoReasonMap.get(music.mExpTag);
                   if (TextUtils.x(str)) {
                      continue ;
                   }else {
                      Music mPhotoCount = music.mPhotoCount;
                      long l = (mPhotoCount == null)? 0: mPhotoCount.longValue();
                      if (str.contains("${0}")) {
                         str = a0.a(str);
                         Object[] objArray = new Object[1];
                         a0 uoa0 = a0.class;
                         if (PatchProxy.isSupport(uoa0)) {
                            str1 = PatchProxy.applyOneRefs(Long.valueOf(l), null, uoa0, "2");
                            if (str1 != PatchProxyResult.class) {
                            }else if(l - 9999 <= 0){
                               str1 = "1Íò";
                            }else {
                               l = l / 0x2710;
                               str1 = l;
                               str1 = str1+"Íò";
                            }
                         }else {
                            goto label_0096 ;
                         }
                         objArray[0] = str1;
                         str = String.format(str, objArray);
                      }
                      music.mRecommendReason = str;
                      i1 = i1 + 1;
                   }
                }
             }
          }
       }
       return;
    }
    public static void n(BaseFragment p0,Music p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, o.class, "12")) {
          return;
       }
       if (p1 != null) {
          p1.startSyncWithFragment(p0.m());
          p1.observable().compose(c.c(p0.m(), FragmentEvent.DESTROY)).subscribe(new c0(p2));
       }
       return;
    }
}
