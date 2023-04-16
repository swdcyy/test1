package com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.share.OperationModel$d;
import nsd.u;
import com.yxcorp.gifshow.share.OperationModel$c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.OperationModel$Type;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.share.OperationModel$a;
import com.yxcorp.gifshow.share.OperationModel$b;
import erd.g;
import crd.b;
import brd.t;
import java.io.File;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Boolean;
import mhc.w1;
import java.lang.Enum;
import com.kuaishou.android.model.feed.ImageFeed;
import mhc.x;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import com.yxcorp.gifshow.model.SharePlatformData;
import msd.l;
import com.yxcorp.gifshow.entity.IMShareData;
import com.yxcorp.gifshow.entity.MultiImageLinkInfo;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;
import trd.t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.framework.model.user.User;
import tl8.d;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.util.Map;
import qrd.l1;
import com.yxcorp.gifshow.entity.TagDetailItem;
import java.lang.StringBuilder;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Integer;

public final class OperationModel	// class@001b5d
{
    public final boolean A;
    public final String B;
    public String a;
    public File b;
    public File c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public final Map h;
    public final Map i;
    public String j;
    public int k;
    public String l;
    public boolean m;
    public final boolean n;
    public final OperationModel$Type o;
    public final BaseFeed p;
    public final User q;
    public final IMShareData r;
    public final TagDetailItem s;
    public final String t;
    public String u;
    public final int v;
    public final boolean w;
    public final l x;
    public boolean y;
    public final boolean z;
    public static final OperationModel$d C;

    static {
       OperationModel.C = new OperationModel$d(null);
    }
    public void OperationModel(OperationModel$c p0){
       OperationModel operationMod = this;
       OperationModel$c obj = p0;
       Objects.requireNonNull(p0);
       OperationModel$c uoc = PatchProxy.apply(null, obj, OperationModel$c.class, "1");
       String str = "type";
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = obj.a;
          if (uoc == null) {
             a.S(str);
          }
       }
       OperationModel$c r = obj.r;
       a.p(uoc, str);
       a.p(r, "guidePlatform");
       super();
       operationMod.o = uoc;
       operationMod.p = p0.b();
       operationMod.q = obj.c;
       operationMod.r = obj.d;
       operationMod.s = obj.e;
       operationMod.t = obj.f;
       operationMod.u = obj.h;
       operationMod.v = obj.j;
       operationMod.w = obj.k;
       operationMod.x = obj.o;
       operationMod.y = obj.l;
       operationMod.z = obj.p;
       operationMod.A = obj.q;
       operationMod.B = r;
       operationMod.d = true;
       operationMod.h = new LinkedHashMap();
       operationMod.i = new LinkedHashMap();
       String str1 = "";
       operationMod.j = str1;
       operationMod.l = str1;
       operationMod.n = true;
       operationMod.c = obj.i;
       operationMod.b = obj.g;
       operationMod.d = obj.m;
       obj = obj.n;
       if (obj != null) {
          obj.subscribe(new OperationModel$a(operationMod), OperationModel$b.b);
       }
       return;
    }
    public final void A(File p0){
       this.b = p0;
    }
    public final void B(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.j = p0;
       return;
    }
    public final void C(String p0){
       this.u = p0;
    }
    public final boolean a(KwaiOp p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationModel.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "op");
       int i = w1.b[this.o.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i == 3) {
                b = this.w();
             }
          }else {
             b = this.n;
          }
       }else {
          int i1 = w1.a[p0.ordinal()];
          if (i1 != b) {
             if (i1 != 2) {
                b = this.u();
             }else if(this.u() && !this.p instanceof ImageFeed){
                b = false;
             }
          }else {
             b = this.v();
          }
       }
       return b;
    }
    public final boolean b(){
       return this.w;
    }
    public final SharePlatformData$ShareConfig c(x p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forward");
       SharePlatformData mShareConfig = this.j(p0).mShareConfig;
       a.o(mShareConfig, "getPlatformData\(forward\).mShareConfig");
       return mShareConfig;
    }
    public final File d(){
       return this.c;
    }
    public final l e(){
       return this.x;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationModel.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof OperationModel && (a.g(this.o, p0.o) && (a.g(this.p, p0.p) && (a.g(this.q, p0.q) && (a.g(this.r, p0.r) && (a.g(this.s, p0.s) && (a.g(this.t, p0.t) && (a.g(this.u, p0.u) && (this.v == p0.v && (this.w == p0.w && (a.g(this.x, p0.x) && (this.y == p0.y && (this.z == p0.z && (this.A == p0.A && a.g(this.B, p0.B)))))))))))))))) {
          return true;
       }
       return false;
    }
    public final String f(){
       return this.l;
    }
    public final IMShareData g(x p0){
       OperationModel operationMod1;
       SharePlatformData sharePlatfor;
       ArrayList uArrayList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       OperationModel operationMod = OperationModel.class;
       String obj = PatchProxy.applyOneRefs(p0, this, operationMod, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "forward";
       a.p(p0, obj);
       if (PatchProxy.isSupport(operationMod)) {
          operationMod1 = PatchProxy.applyTwoRefs(p0, Boolean.FALSE, this, operationMod, "3");
          if (operationMod1 != patchProxyRe) {
          }else {
          label_0028 :
             a.p(p0, obj);
             int i = 0;
             if (PatchProxy.isSupport(operationMod)) {
                sharePlatfor = PatchProxy.applyTwoRefs(p0, Boolean.FALSE, this, operationMod, "6");
                if (sharePlatfor != patchProxyRe) {
                label_004d :
                   OperationModel tr = this.r;
                   User user = null;
                   if (tr != null) {
                      tr.mFeed = this.p;
                      tr.mUser = this.q;
                      if (tr.mPlatformData2InfoType == 4 && tr.mMultiImageLinkInfo == null) {
                         MultiImageLinkInfo multiImageLi = PatchProxy.applyOneRefs(sharePlatfor, this, operationMod, "16");
                         if (multiImageLi != patchProxyRe) {
                         }else {
                            multiImageLi = new MultiImageLinkInfo();
                            multiImageLi.mUrl = sharePlatfor.mShareUrl;
                            multiImageLi.mTitle = sharePlatfor.mTitle;
                            multiImageLi.mDesc = sharePlatfor.mSubTitle;
                            SharePlatformData$ShareConfig mCoverUrls = sharePlatfor.mCoverUrls;
                            if (mCoverUrls != null) {
                               a.o(mCoverUrls, "config.mCoverUrls");
                               int i1 = 1;
                               int i2 = (!mCoverUrls.length)? 1: 0;
                               if (i2 ^ i1) {
                                  mCoverUrls = sharePlatfor.mCoverUrls;
                                  if (mCoverUrls != null) {
                                     uArrayList = new ArrayList(mCoverUrls.length);
                                     int len = mCoverUrls.length;
                                     for (; i < len; i = i + 1) {
                                        uArrayList.add(mCoverUrls[i].mUrl);
                                     }
                                  }else {
                                     uArrayList = user;
                                  }
                               }else {
                               label_00b0 :
                                  mCoverUrls = sharePlatfor.mCoverUrl;
                                  if (mCoverUrls != null) {
                                     uArrayList = t.k(mCoverUrls);
                                  }else {
                                     uArrayList = sharePlatfor.mCoverStringUrls;
                                     if (uArrayList == null) {
                                        uArrayList = CollectionsKt__CollectionsKt.E();
                                     }
                                  }
                               }
                            }else {
                               goto label_00b0 ;
                            }
                            multiImageLi.mImageUrls = uArrayList;
                            OperationModel tp = this.p;
                            if (tp != null) {
                               User user1 = tp.a(User.class);
                               if (user1 != null) {
                                  User mAvatars = user1.mAvatars;
                                  if (mAvatars != null) {
                                     CDNUrl uCDNUrl = ArraysKt___ArraysKt.Ib(mAvatars);
                                     if (uCDNUrl != null) {
                                        uCDNUrl = uCDNUrl.mUrl;
                                        if (uCDNUrl != null) {
                                           user = uCDNUrl;
                                        label_00e8 :
                                           multiImageLi.mIconUrl = user;
                                        }
                                     }
                                  }
                               }
                               if (user1 != null) {
                                  user = user1.mAvatar;
                                  goto label_00e8 ;
                               }else {
                                  goto label_00e8 ;
                               }
                            }else {
                               multiImageLi.mIconUrl = sharePlatfor.mImIconUrl;
                            }
                            mCoverUrls = (TextUtils.x(sharePlatfor.mSourceName))? sharePlatfor.mSource: sharePlatfor.mSourceName;
                            multiImageLi.mSourceName = mCoverUrls;
                         }
                         tr.mMultiImageLinkInfo = multiImageLi;
                      }
                      operationMod1 = tr;
                   }else {
                      operationMod1 = user;
                   }
                }
             }
             a.p(p0, obj);
             sharePlatfor = this.k(p0, i).mShareConfig;
             a.o(sharePlatfor, "getPlatformData\(forward,¡­orceRefresh\).mShareConfig");
             goto label_004d ;
          }
       }else {
          goto label_0028 ;
       }
       return operationMod1;
    }
    public final String h(){
       return this.t;
    }
    public int hashCode(){
       OperationModel obj = PatchProxy.apply(null, this, OperationModel.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.o;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       OperationModel tp = this.p;
       int i2 = (tp != null)? tp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tp = this.q;
       i2 = (tp != null)? tp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tp = this.r;
       i2 = (tp != null)? tp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tp = this.s;
       i2 = (tp != null)? tp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tp = this.t;
       i2 = (tp != null)? tp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tp = this.u;
       i2 = (tp != null)? tp.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.v) * 31;
       tp = this.w;
       int i3 = 1;
       if (tp != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tp = this.x;
       i2 = (tp != null)? tp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tp = this.y;
       if (tp != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tp = this.z;
       if (tp != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tp = this.A;
       if (tp == null) {
          i3 = tp;
       }
       i1 = (i1 + i3) * 31;
       tp = this.B;
       if (tp != null) {
          i = tp.hashCode();
       }
       return (i1 + i);
    }
    public final BaseFeed i(){
       return this.p;
    }
    public final SharePlatformData j(x p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "forward");
       return this.k(p0, false);
    }
    public final SharePlatformData k(x p0,boolean p1){
       String obj;
       SharePlatformData sharePlatfor2;
       SharePlatformData sharePlatfor3;
       SharePlatformData$ShareConfig mTitle;
       SharePlatformData$ShareConfig mCoverUrls;
       SharePlatformData$ShareConfig shareConfig1;
       SharePlatformData$ShareConfig shareConfig2;
       String str;
       OperationModel operationMod = OperationModel.class;
       if (PatchProxy.isSupport(operationMod)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, operationMod, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "forward";
       a.p(p0, obj);
       if (p1 && !PatchProxy.applyVoidOneRefs(p0, this, operationMod, "5")) {
          a.p(p0, obj);
          this.i.remove(p0.v());
       }
       SharePlatformData sharePlatfor = this.i.get(p0.v());
       if (sharePlatfor != null) {
          return sharePlatfor;
       }else {
          sharePlatfor = this.h.get(p0.v());
          operationMod = this.x;
          SharePlatformData$ShareConfig shareConfig = null;
          SharePlatformData sharePlatfor1 = (operationMod != null)? operationMod.invoke(p0): shareConfig;
          if (sharePlatfor != null) {
             sharePlatfor2 = sharePlatfor;
          }else {
             sharePlatfor2 = new SharePlatformData();
             if (sharePlatfor1 != null) {
                sharePlatfor3 = sharePlatfor1.mSharePlatform;
                if (sharePlatfor3 != null) {
                label_0071 :
                   sharePlatfor2.mSharePlatform = sharePlatfor3;
                   if (sharePlatfor1 != null) {
                      sharePlatfor3 = sharePlatfor1.mShareMethod;
                      if (sharePlatfor3 != null) {
                      label_007c :
                         sharePlatfor2.mShareMethod = sharePlatfor3;
                         sharePlatfor3 = (sharePlatfor1 != null)? sharePlatfor1.mShareMode: shareConfig;
                         sharePlatfor2.mShareMode = sharePlatfor3;
                      }
                   }
                   str = "card";
                   goto label_007c ;
                }
             }
             str = p0.v();
             goto label_0071 ;
          }
          sharePlatfor = (sharePlatfor != null)? sharePlatfor.mShareConfig: shareConfig;
          sharePlatfor1 = (sharePlatfor1 != null)? sharePlatfor1.mShareConfig: shareConfig;
          sharePlatfor3 = (sharePlatfor != null)? sharePlatfor: new SharePlatformData$ShareConfig();
          if (sharePlatfor != null) {
             mTitle = sharePlatfor.mTitle;
             if (mTitle == null) {
             label_00a2 :
                mTitle = (sharePlatfor1 != null)? sharePlatfor1.mTitle: shareConfig;
             }
          }else {
             goto label_00a2 ;
          }
          sharePlatfor3.mTitle = mTitle;
          if (sharePlatfor != null) {
             mTitle = sharePlatfor.mSubTitle;
             if (mTitle == null) {
             label_00b1 :
                mTitle = (sharePlatfor1 != null)? sharePlatfor1.mSubTitle: shareConfig;
             }
          }else {
             goto label_00b1 ;
          }
          sharePlatfor3.mSubTitle = mTitle;
          mTitle = (sharePlatfor1 != null)? sharePlatfor1.mSubTitle: shareConfig;
          sharePlatfor3.mBackSubTitle = mTitle;
          if (sharePlatfor != null) {
             mTitle = sharePlatfor.mSource;
             if (mTitle == null) {
             label_00c8 :
                mTitle = (sharePlatfor1 != null)? sharePlatfor1.mSource: shareConfig;
             }
          }else {
             goto label_00c8 ;
          }
          sharePlatfor3.mSource = mTitle;
          if (sharePlatfor != null) {
             mTitle = sharePlatfor.mCoverUrl;
             if (mTitle == null) {
             label_00d7 :
                mTitle = (sharePlatfor1 != null)? sharePlatfor1.mCoverUrl: shareConfig;
             }
          }else {
             goto label_00d7 ;
          }
          sharePlatfor3.mCoverUrl = mTitle;
          mTitle = null;
          int b = (sharePlatfor != null && sharePlatfor.mCoverUrls != null)? true: false;
          sharePlatfor3.isCoverUrlsFetched = b;
          if (sharePlatfor != null) {
             mCoverUrls = sharePlatfor.mCoverUrls;
             if (mCoverUrls == null) {
             label_00f2 :
                mCoverUrls = (sharePlatfor1 != null)? sharePlatfor1.mCoverUrls: shareConfig;
             }
          }else {
             goto label_00f2 ;
          }
          sharePlatfor3.mCoverUrls = mCoverUrls;
          if (sharePlatfor != null) {
             mCoverUrls = sharePlatfor.mShareUrl;
             if (mCoverUrls == null) {
             label_0101 :
                mCoverUrls = (sharePlatfor1 != null)? sharePlatfor1.mShareUrl: shareConfig;
             }
          }else {
             goto label_0101 ;
          }
          sharePlatfor3.mShareUrl = mCoverUrls;
          if (sharePlatfor != null) {
             mCoverUrls = sharePlatfor.mImageData;
             if (mCoverUrls == null) {
             label_0110 :
                mCoverUrls = (sharePlatfor1 != null)? sharePlatfor1.mImageData: shareConfig;
             }
          }else {
             goto label_0110 ;
          }
          sharePlatfor3.mImageData = mCoverUrls;
          if (sharePlatfor != null) {
             mCoverUrls = sharePlatfor.mH5MaxTitleLength;
             if (mCoverUrls == null) {
             label_011f :
                mCoverUrls = (sharePlatfor1 != null)? sharePlatfor1.mH5MaxTitleLength: -1;
             }
          }else {
             goto label_011f ;
          }
          sharePlatfor3.mH5MaxTitleLength = mCoverUrls;
          if (sharePlatfor != null) {
             mTitle = sharePlatfor.mAppIdKeyIndex;
          }
          sharePlatfor3.mAppIdKeyIndex = mTitle;
          if (sharePlatfor != null) {
             mTitle = sharePlatfor.mShareAppId;
             if (mTitle == null) {
             label_0134 :
                mTitle = (sharePlatfor1 != null)? sharePlatfor1.mShareAppId: shareConfig;
             }
          }else {
             goto label_0134 ;
          }
          sharePlatfor3.mShareAppId = mTitle;
          if (sharePlatfor != null) {
             mTitle = sharePlatfor.mAppId;
             if (mTitle == null) {
             label_0143 :
                mTitle = (sharePlatfor1 != null)? sharePlatfor1.mAppId: shareConfig;
             }
          }else {
             goto label_0143 ;
          }
          sharePlatfor3.mAppId = mTitle;
          if (sharePlatfor != null) {
             SharePlatformData$ShareConfig mSharePath = sharePlatfor.mSharePath;
             if (mSharePath != null) {
                shareConfig = mSharePath;
             }else if(sharePlatfor1 != null){
                shareConfig = sharePlatfor1.mSharePath;
             }
          }else {
             goto label_0153 ;
          }
          sharePlatfor3.mSharePath = shareConfig;
          sharePlatfor2.mShareConfig = sharePlatfor3;
          this.i.put(p0.v(), sharePlatfor2);
          return sharePlatfor2;
       }
    }
    public final File l(){
       return this.b;
    }
    public final String m(){
       return this.j;
    }
    public final int n(){
       return this.v;
    }
    public final int o(){
       return this.k;
    }
    public final TagDetailItem p(){
       return this.s;
    }
    public final OperationModel$Type q(){
       return this.o;
    }
    public final String r(){
       return this.u;
    }
    public final User s(){
       return this.q;
    }
    public final boolean t(){
       return this.A;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, OperationModel.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OperationModel\(type="+this.o+", photo="+this.p+", user="+this.q+", imShareData="+this.r+", tagDetail="+this.s+", liveStreamId="+this.t+", uri="+this.u+", source="+this.v+", collate="+this.w+", defaultConfigGetter="+this.x+", forceAvailable="+this.y+", showToast="+this.z+", isLongPressShare="+this.A+", guidePlatform="+this.B+"\)";
    }
    public final boolean u(){
       OperationModel obj = PatchProxy.apply(null, this, OperationModel.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.y != null) {
          return b;
       }
       obj = this.p;
       if (obj == null) {
          return false;
       }
       if (obj instanceof LiveStreamFeed) {
          return b;
       }
       PhotoMeta photoMeta = obj.a(PhotoMeta.class);
       if (photoMeta != null && TextUtils.x(photoMeta.mMessageGroupId)) {
          User user = obj.a(User.class);
          if (user == null || user.mPrivate != b) {
          label_0046 :
             return b;
          }
       }
       b = false;
       goto label_0046 ;
    }
    public final boolean v(){
       OperationModel obj = PatchProxy.apply(null, this, OperationModel.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.y != null) {
          return b;
       }
       obj = this.p;
       if (obj == null) {
          return false;
       }
       if (!obj instanceof LiveStreamFeed) {
          PhotoMeta photoMeta = obj.a(PhotoMeta.class);
          if (photoMeta == null || photoMeta.isPublic() != b) {
             b = false;
          }
       }
       return b;
    }
    public final boolean w(){
       boolean b = (this.y != null || this.q != null)? true: false;
       return b;
    }
    public final boolean x(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationModel.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "pageList");
       return p0.contains(Integer.valueOf(this.v));
    }
    public final void y(File p0){
       this.c = p0;
    }
    public final void z(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OperationModel.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.l = p0;
       return;
    }
}
