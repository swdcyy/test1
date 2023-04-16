package a7d.a;
import yu5.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;
import com.yxcorp.plugin.search.utils.k;
import nfd.l0;
import nfd.y0;
import com.kwai.framework.abtest.f;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import nfd.k2;
import nfd.s1;
import com.kwai.framework.model.user.User;
import android.widget.ImageView;
import com.yxcorp.plugin.search.utils.j0;
import lyb.h;
import com.yxcorp.plugin.search.entity.SearchItem;
import q7d.d0;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import xed.c;
import com.yxcorp.plugin.search.entity.kbox.KBoxItem;
import ufd.l;
import nfd.n0;
import pad.l;
import nfd.m0$a;
import nfd.m0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.search.SearchPage;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import w7d.i;
import nfd.o3;
import com.yxcorp.plugin.search.utils.p;
import edd.b;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import gbd.t;
import k2b.e0;
import gbd.c;
import gbd.d;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import java.lang.Number;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.SearchParams;
import nfd.q2$a;
import nfd.c3;
import nfd.q2;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import add.b;
import com.yxcorp.plugin.search.http.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import sy5.a;
import com.search.common.entity.SearchBaseItem;
import oed.a;

public class a implements a	// class@00009c
{

    public void a(){
       super();
    }
    public boolean D7(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l0.b(k.b(p0));
    }
    public boolean Ek(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (y0.A()) {
          return f.a("searchSomeLowImageResolution");
       }
       boolean b = (b.a(-404437045).g() && s1.n().mAllLowImageResolution != null)? true: false;
       return b;
    }
    public void Jr(User p0,ImageView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       j0.K(p0, p1);
       return;
    }
    public boolean QD(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return d0.k(p0);
    }
    public void R8(int p0,int p1,h p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, a.class, "4")) {
          return;
       }
       RxBus.f.b(new c(p0, p1, p2.mKBoxItem));
       return;
    }
    public void RH(l p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "11")) {
          return;
       }
       int i = n0.h(p1);
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(i), null, ol, "2")) {
          m0$a uoa1 = new m0$a();
          uoa1.b(8);
          uoa1.c(i);
          n0.b(p0, uoa1.a());
       }
       return;
    }
    public void Xw(BaseFragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       i.c(l0.a(p1), p0.getActivity());
       return;
    }
    public void dG(l p0,User p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       m0$a uoa = new m0$a();
       uoa.c(n0.g(p1));
       uoa.f(R.drawable.arg_RES_7f081e90);
       uoa.b(9);
       n0.b(p0, uoa.a());
       return;
    }
    public int dr(int p0){
       if (!p0) {
          return 0x7f081e90;
       }
       return 0;
    }
    public void et(h p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "12")) {
          return;
       }
       p.c(p0, p1);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean jP(Activity p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return k.c(p0, p1);
    }
    public void lI(BaseFragment p0,h p1,int p2){
       b uob = b.class;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       if (p1 instanceof SearchItem && p0 instanceof SearchResultFragment) {
          SearchResultFragment searchResult = p0;
          String str = "USER";
          int i = 1;
          switch (p2){
              case 1:
                t.n(i, p0, b.c(p1), t.b(searchResult, p1), p1);
                break;
              case 2:
                String str1 = "ADVERT_CARD";
                if (!PatchProxy.isSupport(uob) || (PatchProxy.applyVoidFourRefs(p1, searchResult, str1, Integer.valueOf(0), null, b.class, "1") || (p1 == null || (!TextUtils.isEmpty(str1) && searchResult != null)))) {
                   t.n(0, searchResult, b.b(p1, "ADVERT_CARD", p1.getAdSubType()), t.b(searchResult, p1), p1);
                }
                break;
              case 3:
                t.n(0, p0, b.c(p1), t.b(searchResult, p1), p1);
                break;
              case 4:
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), p1, searchResult, null, b.class, "6")) {
                   c uoc = c.f();
                   uoc.a("ADVERT_HEADLINE_MORE_SUBCARD");
                   d uod = uoc.c();
                   uod.k(p1.getAuthorId());
                   uod.w("TITLE");
                   uod.s();
                   uoc.d(p1).l(d0.j(p1));
                   b.f(i, p1, searchResult, uoc.b());
                }
                break;
              case 5:
                t.n(i, p0, b.b(p1, "ADVERT_CARD", "COMMODITY"), t.b(searchResult, p1), p1);
                break;
              case 6:
                t.n(i, p0, b.b(p1, "ADVERT_CARD", str), t.b(searchResult, p1), p1);
                break;
              case 7:
                t.n(i, p0, b.b(p1, "ADVERT_USER_FOLLOW_SUBCARD", str), t.b(searchResult, p1), p1);
                break;
              case 8:
                t.n(i, p0, b.b(p1, "ADVERT_USER_UNFOLLOW_SUBCARD", str), t.b(searchResult, p1), p1);
                break;
              default:
          }
       }
       return;
    }
    public int q00(QPhoto p0,h p1,View p2,BaseFragment p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       p.p(c3.d(p0, p1, SearchParams.getSearchParams(p0.mEntity), p2, p3).a(), false, false);
       return 1025;
    }
    public boolean uY(BaseFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof SearchResultFragment && p0.q() instanceof b) {
          return p0.q().B2();
       }
       return false;
    }
    public void ut(BaseFragment p0,h p1,QPhoto p2,int p3,int p4,boolean p5,JsonObject p6){
       Object[] objArray;
       ClientEvent$ElementPackage uElementPack;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p6;
       a uoa = a.class;
       int i = 6;
       int i1 = 3;
       int i2 = 2;
       int i3 = 0;
       int i4 = 7;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[i4];
          objArray[i3] = oobject;
          objArray[1] = oobject1;
          objArray[i2] = p2;
          objArray[i1] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Boolean.valueOf(p5);
          objArray[i] = oobject2;
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }else {
          int i5 = this;
       }
       if (!oobject1 instanceof SearchItem || (oobject instanceof SearchResultFragment && p3 == 100)) {
          b uob = b.class;
          Object obj = null;
          if (PatchProxy.isSupport(uob)) {
             objArray = new Object[i4];
             objArray[i3] = oobject1;
             objArray[1] = p2;
             objArray[i2] = oobject;
             objArray[i1] = "ADVERT_CARD";
             objArray[4] = Boolean.valueOf(p5);
             objArray[5] = Integer.valueOf(p4);
             objArray[i] = oobject2;
             if (!PatchProxy.applyVoid(objArray, obj, uob, "13")) {
             }
          }else if(oobject1 != null && (!TextUtils.isEmpty("ADVERT_CARD") && (oobject == null || (p2 == null && oobject1.mPhoto == null)))){
             PhotoAdvertisement photoAdverti = k.B(p2);
             if (photoAdverti == null) {
                photoAdverti = k.B(oobject1.mPhoto);
             }
             if (photoAdverti != null) {
                SearchItem mPhoto = (p2 == null)? oobject1.mPhoto: p2;
                String str = String.valueOf(photoAdverti.mCreativeId);
                if (PatchProxy.isSupport(uob)) {
                   Object[] objArray1 = new Object[i];
                   objArray1[i3] = oobject1;
                   objArray1[1] = mPhoto;
                   objArray1[i2] = "ADVERT_CARD";
                   objArray1[i1] = Boolean.valueOf(p5);
                   objArray1[4] = str;
                   objArray1[5] = oobject2;
                   uElementPack = PatchProxy.apply(objArray1, null, uob, "14");
                   if (uElementPack != PatchProxyResult.class) {
                   label_0163 :
                      t.n(p4, oobject, uElementPack, t.b(oobject, oobject1), oobject1);
                   }
                }
                a uoa1 = a.k().e("search_session_id", oobject1.mSessionId);
                String str1 = "";
                String liveStreamId = (mPhoto != null)? mPhoto.getLiveStreamId(): str1;
                a uoa2 = uoa1.e("live_id", liveStreamId).a("advert_type", (p5 ^ 0x01)).e("advert_id", str).h(oobject2);
                d uod = d.r();
                uod.a("ADVERT_CARD");
                String photoId = (mPhoto != null)? mPhoto.getPhotoId(): str1;
                uod.k(photoId);
                uod.w("ADVERT");
                uod.u(oobject1.mRank);
                uod.t(oobject1.mPosition);
                Object obj1 = PatchProxy.applyOneRefs(mPhoto, null, uob, "15");
                if (obj1 != PatchProxyResult.class) {
                   str1 = obj1;
                }else if(mPhoto == null || !mPhoto.isAd()){
                   if (mPhoto.isLiveStream()) {
                      str1 = "LIVE";
                   }else if(mPhoto.isImageType()){
                      str1 = "IMAGE_ATLAS";
                   }else if(mPhoto.isVideoType()){
                      str1 = "PHOTO";
                   }
                }
                uod.v(str1);
                uod.l(uoa2.j());
                uElementPack = uod.d();
                goto label_0163 ;
             }
          }
       }
    label_016c :
       return;
    }
    public void xd(User p0,Activity p1,QPhoto p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "8")) {
          return;
       }
       a.d(p0, p1, p2);
       return;
    }
}
