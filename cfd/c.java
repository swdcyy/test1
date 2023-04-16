package cfd.c;
import erd.o;
import cfd.d;
import u99.f;
import u99.b;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import qcd.a;
import com.yxcorp.plugin.search.entity.SearchItem;
import jfd.d;
import u99.c;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import nc6.b;
import java.lang.Math;
import ekd.e0;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import jfd.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import com.kuaishou.android.model.mix.CommonMeta;
import elb.o0$a;
import wh5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import xd5.d;
import elb.o0;
import java.util.Locale;
import com.kuaishou.android.model.feed.PhotoType;
import androidx.fragment.app.FragmentActivity;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import nfd.g3;
import com.kuaishou.android.model.feed.SearchParams;
import yed.e;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.model.feed.SearchParams$a;
import com.search.common.entity.SearchBaseItem;
import ncd.a;
import java.lang.Boolean;
import java.util.List;

public final class c implements o	// class@00031b
{
    public final d b;
    public final f c;
    public final b d;
    public final long e;
    public final long f;
    public final int g;

    public void c(d p0,f p1,b p2,long p3,long p4,int p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final Object apply(Object p0){
       Object[] obj;
       long l;
       long l1;
       a a;
       SearchParams searchParams;
       boolean b2;
       String str5;
       f x;
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       c d = uoc.d;
       c e = uoc.e;
       c f = uoc.f;
       c g = uoc.g;
       Objects.requireNonNull(b);
       d uod = d.class;
       int i = 7;
       int i1 = 1;
       boolean i2 = 2;
       int i3 = 6;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[i];
          objArray[0] = c;
          objArray[i1] = d;
          objArray[i2] = Long.valueOf(e);
          objArray[3] = Long.valueOf(f);
          objArray[4] = Integer.valueOf(g);
          objArray[5] = Integer.valueOf(0);
          objArray[i3] = Integer.valueOf(0);
          obj = PatchProxy.apply(objArray, b, uod, "4");
          if (obj != PatchProxyResult.class) {
          }else {
          label_005b :
             a uoa = new a();
             uoa.e(b.r);
             uoa.d(b.q);
             uoa.c(b.p);
             uoa.b(b.u);
             uoa.a(b.s);
             a uoa1 = a.class;
             String str = "1";
             if (PatchProxy.isSupport(uoa1)) {
                obj = new Object[i];
                obj[0] = c;
                obj[i1] = d;
                obj[i2] = Long.valueOf(e);
                obj[3] = Long.valueOf(f);
                obj[4] = Integer.valueOf(g);
                obj[5] = Integer.valueOf(0);
                obj[6] = Integer.valueOf(0);
                obj = PatchProxy.apply(obj, uoa, uoa1, str);
                if (obj != PatchProxyResult.class) {
                }
             }
             ClientStat$VideoStatEvent videoStatEve = new ClientStat$VideoStatEvent();
             videoStatEve.sessionUuid = TextUtils.k(c.l);
             videoStatEve.duration = c.j;
             videoStatEve.playedDuration = e + f;
             videoStatEve.enterTime = c.h;
             videoStatEve.leaveAction = g;
             videoStatEve.leaveTime = c.i;
             videoStatEve.otherPauseDuration = (d.e + c.e(1)) - c.e(5);
             videoStatEve.manualPauseDuration = d.i + c.e(3);
             videoStatEve.downloaded = c.z;
             videoStatEve.popupWindowPlayedDuration = d.g;
             b c1 = d.c;
             Object[] objArray1 = null;
             String obj1 = PatchProxy.apply(objArray1, c, f.class, "13");
             c uoc1 = f;
             String str1 = null;
             if (obj1 != PatchProxyResult.class) {
                l = obj1.longValue();
                p0 = uoa1;
             }else {
                p0 = uoa1;
                x = c.C;
                l = (x - str1 > 0)? x: c.e(2);
             }
             videoStatEve.bufferDuration = c1 + l;
             videoStatEve.commentPauseDuration = d.d;
             videoStatEve.commentStayDuration = d.f + c.e(6);
             videoStatEve.playVideoType = uoa.b.k();
             videoStatEve.videoType = uoa.b.getVideoType();
             videoStatEve.stalledCount = d.h + c.n;
             videoStatEve.averageFps = (double)c.o;
             videoStatEve.videoQosJson = (b.a())? TextUtils.I(c.u): TextUtils.I(c.v);
             obj1 = PatchProxy.apply(objArray1, c, f.class, "10");
             if (obj1 != PatchProxyResult.class) {
                l1 = obj1.longValue();
             }else {
                x = c.x;
                if (x - str1) {
                   f y = c.y;
                   if (y - str1) {
                      l1 = Math.max((x - y), str1);
                   }
                }
                l1 = str1;
             }
             if (!e0.a || (l1 - str1 >= 0 && l1 - 0x186a0 <= 0)) {
                videoStatEve.clickToFirstFrameDuration = l1;
                obj1 = PatchProxy.apply(objArray1, c, f.class, "7");
                if (obj1 != PatchProxyResult.class) {
                }else {
                   obj1 = TextUtils.I(c.p);
                }
                videoStatEve.kwaiSignature = obj1;
                videoStatEve.boardPlatform = a.f;
                videoStatEve.dnsResolveHost = TextUtils.I(c.q);
                videoStatEve.dnsResolvedIp = TextUtils.I(c.r);
                videoStatEve.dnsResolverName = TextUtils.I(c.s);
                videoStatEve.playUrl = TextUtils.I(c.t);
                videoStatEve.leaveAction = uoa.d.a();
                videoStatEve.followPlayedDuration = e;
                uoc = uoc1;
                try{
                   videoStatEve.detailPlayedDuration = uoc;
                   videoStatEve.photoId = Long.parseLong(uoa.b.getId());
                }catch(java.lang.NumberFormatException e0){
                }
                videoStatEve.sPhotoId = uoa.b.getId();
                videoStatEve.mediaType = uoa.b.getMediaType();
                a = uoa.a;
                uoa1 = uoa.e;
                String str2 = str;
                ClientEvent$UrlPackage urlPackage = PatchProxy.applyFourRefs(c, a, d, uoa1, uoa, a.class, "3");
                String str3 = "";
                if (urlPackage != PatchProxyResult.class) {
                }else if(a.getParentFragment() instanceof SearchResultTabFragment){
                   a = a.getParentFragment();
                }
                urlPackage = new ClientEvent$UrlPackage();
                urlPackage.category = a.M();
                urlPackage.page = a.getPage();
                CommonMeta uCommonMeta = uoa.b.o();
                String str6 = (uCommonMeta == null)? str3: TextUtils.I(uCommonMeta.mExpTag);
                o0$a uoa4 = new o0$a();
                uoa4.f(4);
                uoa4.k(uoa.b.getUserId());
                uoa4.l(uoa.b.d());
                uoa4.h(str6);
                uoa4.g(c.b());
                uoa4.r(uoa.b.f());
                uoa4.m(uoa.b.isLongVideo());
                uoa4.o(uoa.b.p());
                uoa4.b(uoa.b.isAd());
                uoa4.m = c.k;
                uoa4.e(c.m);
                uoa4.p(TextUtils.I(d.l));
                uoa4.q(d.k);
                uoa4.i(d.j);
                if (uoa.b.isVideoType()) {
                   i2 = (uoa.b.getWidth() > 0 && (double)uoa.b.g() - 0x3fe851eb851eb852 < 0)? true: false;
                   uoa4.j(i2);
                }
                if (uoa.b.i() && uoa.b.c() instanceof QPhoto) {
                   d.a(uoa.b.c(), uoa4);
                }
                urlPackage.params = uoa4.a().toString()+",page_comment_stay_duration="+c.e(6);
                Object[] objArray2 = new Object[]{uoa.b.getUserId(),uoa.b.getPhotoId(),Integer.valueOf(uoa.b.m().toInt()),uoa.b.getExpTag()};
                urlPackage.subPages = String.format(Locale.US, uoa1+"/%s/%s/%d/%s", objArray2);
                if (a.getActivity() != null) {
                   urlPackage.expTagList = b.a(0xe0ff4fb).c(a);
                }
                videoStatEve.urlPackage = urlPackage;
                if (g3.o(uoa.c)) {
                   searchParams = e.a(uoa.c, uoa.b);
                }else if(uoa.b.i()){
                   a = uoa.c;
                   uoa1 = uoa.b;
                   a uoa2 = p0;
                   String str4 = PatchProxy.applyTwoRefs(a, uoa1, uoa, uoa2, "2");
                   if (str4 != PatchProxyResult.class) {
                   }else {
                      SearchItem mItemType = a.mItemType;
                      if (mItemType == SearchItem$SearchItemType.TYPE_COLLECTION) {
                         str4 = "COLLECTION";
                      }else if(mItemType == SearchItem$SearchItemType.AD_PHOTO || mItemType == SearchItem$SearchItemType.TYPE_AD_BRAND){
                         str4 = "ADVERT";
                      }else if(r1.D2(uoa1.c().mEntity)){
                         obj1 = "IMAGE_ATLAS";
                      }else {
                         obj1 = "PHOTO";
                      }
                      str4 = obj1;
                   }
                   SearchParams$a uoa3 = SearchParams.newBuilder();
                   uoa3.g(str4);
                   uoa3.f(uoa.c.mSessionId);
                   uoa3.e(uoa.c.mRank);
                   SearchParams searchParams1 = uoa3.a();
                   QPhoto qPhoto = uoa.b.c();
                   a c2 = uoa.c;
                   a b1 = uoa.b;
                   Object obj2 = PatchProxy.applyTwoRefs(c2, b1, null, a.class, str2);
                   if (obj2 != PatchProxyResult.class) {
                      b2 = obj2.booleanValue();
                   }else if(b1.i() && c2.isFeedItem()){
                      b2 = b1.c().isImageType();
                   }else {
                      b2 = false;
                   }
                   if (b2) {
                      int i4 = (r1.v3(qPhoto.mEntity))? 0: qPhoto.getAtlasList().size();
                      if (PatchProxy.isSupport(uoa2)) {
                         str5 = PatchProxy.applyThreeRefs(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i4), uoa, a.class, "4");
                         if (str5 != PatchProxyResult.class) {
                         label_046b :
                            videoStatEve.atlasParams = str5;
                         }
                      }
                      str5 = str3;
                      goto label_046b ;
                   }
                   searchParams = searchParams1;
                }else {
                   searchParams = null;
                }
                videoStatEve.searchSessionId = TextUtils.I(uoa.c.mSessionId);
                if (searchParams != null) {
                   str3 = searchParams.toLoggerString();
                }
                videoStatEve.photoSearchParams = str3;
                obj = videoStatEve;
             }else {
                throw new IllegalArgumentException("clickToFirstFrameDuration £º"+l1);
             }
          }
       }else {
          goto label_005b ;
       }
       return obj;
    }
}
