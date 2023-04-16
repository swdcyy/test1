package bdd.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k06.a;
import lnc.a1;
import android.app.Application;
import o56.a;
import android.content.Context;
import androidx.core.content.ContextCompat;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.Number;
import lnc.o5;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig;
import lyb.h;
import com.kwai.framework.model.user.User;
import iw.a;
import java.lang.Boolean;
import tw.e;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import bdd.c;
import erd.g;
import java.lang.Integer;
import bdd.a;
import bdd.d;
import bdd.b;

public class e	// class@0003fa
{

    public void e(){
       super();
    }
    public static void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "31")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a uoa = new a();
       uoa.f((float)a1.d(R.dimen.arg_RES_7f07030a));
       uoa.k(ContextCompat.getColor(a.b(), R.color.arg_RES_7f061adc));
       uoa.m(a1.e(0x3f000000));
       p0.setBackground(uoa.a());
       return;
    }
    public static PhotoAdvertisement$SearchBrandInfo b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && (k.B(p0) == null || k.B(p0).mAdData == null)) {
          return null;
       }
       return k.B(p0).mAdData.mSearchBrandInfo;
    }
    public static long c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       PhotoAdvertisement$SearchBrandInfo searchBrandI = e.b(p0);
       long l = 0;
       if (searchBrandI == null) {
          return l;
       }
       return o5.d(searchBrandI.mBookUserCount, l);
    }
    public static List d(QPhoto p0){
       PhotoAdvertisement$SearchBrandInfo obj = PatchProxy.applyOneRefs(p0, null, e.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement$SearchBrandInfo searchBrandI = e.b(p0);
       if (searchBrandI != null) {
          obj = searchBrandI.mChildLinkConfig;
          if (obj != null) {
             if (q.f(obj.mChildLinks)) {
                return null;
             }else {
                return searchBrandI.mChildLinkConfig.mChildLinks;
             }
          }
       }
       return null;
    }
    public static List e(QPhoto p0){
       PhotoAdvertisement$SearchBrandInfo obj = PatchProxy.applyOneRefs(p0, null, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement$SearchBrandInfo searchBrandI = e.b(p0);
       if (searchBrandI != null) {
          obj = searchBrandI.mSmallShopConfig;
          if (obj != null) {
             if (q.f(obj.products)) {
                return null;
             }else {
                return searchBrandI.mSmallShopConfig.products;
             }
          }
       }
       return null;
    }
    public static String f(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement$SearchBrandInfo searchBrandI = e.b(p0);
       if (searchBrandI == null) {
          return "";
       }
       return searchBrandI.mAdTitle;
    }
    public static User g(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.k(p0)) {
          return p0.getCurrentPhoto().getUser();
       }
       return p0.getCurrentUser();
    }
    public static boolean h(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getAdQPhoto() != null && p0.getAdQPhoto().isAd()))? true: false;
       return b;
    }
    public static boolean i(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getCurrentPhoto() != null && p0.getCurrentPhoto().isAd()))? true: false;
       return b;
    }
    public static boolean j(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.c(p0) == 3)? true: false;
       return b;
    }
    public static boolean k(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && (p0.isAdBrandLive() && (p0.getCurrentPhoto() != null && (!p0.getCurrentPhoto().isAd() || (p0.getCurrentPhoto().isLiveStream() && e.b(p0.getCurrentPhoto()) != null))))) {
          b = true;
       }
    label_0043 :
       return b;
    }
    public static void l(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "25")) {
          return;
       }
       if (p0 != null && p0.mEntity != null) {
          i0.a().e(729, p0.mEntity).a();
       }
       return;
    }
    public static void m(QPhoto p0,boolean p1){
       int i;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "22")) {
          return;
       }
       if (p0 != null && p0.mEntity != null) {
          if (p0.isLiveStream()) {
             i = (p1)? 300: 752;
          }else if(p1){
             i = 14;
          }else {
             i = 19;
          }
          i0.a().e(i, p0.mEntity).d(c.b).a();
       }
       return;
    }
    public static void n(QPhoto p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoe, "24")) {
          return;
       }
       if (p0 != null && p0.mEntity != null) {
          i0.a().e(2, p0.mEntity).d(new a(p1)).a();
       }
       return;
    }
    public static void o(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "23")) {
          return;
       }
       if (p0 != null && p0.mEntity != null) {
          i0.a().e(1, p0.mEntity).a();
       }
       return;
    }
    public static void p(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "26")) {
          return;
       }
       if (p0 != null && p0.mEntity != null) {
          if (p0.isLiveStream()) {
             i0.a().e(61, p0.mEntity).d(d.b).a();
          }else {
             i0.a().e(124, p0.mEntity).a();
          }
       }
       return;
    }
    public static void q(QPhoto p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "21")) {
          return;
       }
       if (p0 != null && p0.mEntity != null) {
          i0.a().e(141, p0.mEntity).d(new b(p1)).a();
       }
       return;
    }
}
