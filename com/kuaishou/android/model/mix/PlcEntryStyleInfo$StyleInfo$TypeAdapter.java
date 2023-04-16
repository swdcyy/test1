package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$i;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$WeakStyleInfo;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$StyleInfo$TypeAdapter extends TypeAdapter	// class@000d9a
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public final TypeAdapter f;
    public static final a g;

    static {
       PlcEntryStyleInfo$StyleInfo$TypeAdapter.g = a.get(PlcEntryStyleInfo$StyleInfo.class);
    }
    public void PlcEntryStyleInfo$StyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PlcEntryStyleInfo$StrongStyleInfo$TypeAdapter.j);
       this.c = p0.j(PlcEntryStyleInfo$WeakStyleInfo$TypeAdapter.h);
       this.d = p0.j(PlcEntryStyleInfo$CoverStyleInfo$TypeAdapter.f);
       this.e = p0.j(PlcEntryStyleInfo$LongVideoStyleInfo$TypeAdapter.f);
       this.f = p0.j(PlcEntryStyleInfo$CommentStyleInfo$TypeAdapter.e);
    }
    public PlcEntryStyleInfo$StyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$StyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$StyleInfo styleInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return styleInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return styleInfo;
       }else {
          p0.c();
          PlcEntryStyleInfo$StyleInfo styleInfo1 = new PlcEntryStyleInfo$StyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x80d960be:
                   if (str.equals("doWeakTransitionMillis")) {
                      i = 0;
                   }
                   break;
                 case 0x8fa0fbff:
                   if (str.equals("showWeakVideoPercent")) {
                      i = 1;
                   }
                   break;
                 case 0x98e09df7:
                   if (str.equals("strongToDisappearMillis")) {
                      i = 2;
                   }
                   break;
                 case 0x9928a8ca:
                   if (str.equals("showAdLabelInDetail")) {
                      i = 3;
                   }
                   break;
                 case 0xa52e38d5:
                   if (str.equals("appIconUrl")) {
                      i = 4;
                   }
                   break;
                 case 0xae417919:
                   if (str.equals("weakStyle")) {
                      i = 5;
                   }
                   break;
                 case 0xba1a4057:
                   if (str.equals("showAdLabelInFeed")) {
                      i = 6;
                   }
                   break;
                 case 0xbb5b2e35:
                   if (str.equals("hidePlcAfterStrongDisappear")) {
                      i = 7;
                   }
                   break;
                 case 0xc8577f90:
                   if (str.equals("marketUri")) {
                      i = 8;
                   }
                   break;
                 case 0xcaa47186:
                   if (str.equals("weakToStrongVideoCountdownMillis")) {
                      i = 9;
                   }
                   break;
                 case 0xd0a9a5bb:
                   if (str.equals("appLink")) {
                      i = 10;
                   }
                   break;
                 case 0xd0aa704c:
                   if (str.equals("appName")) {
                      i = 11;
                   }
                   break;
                 case 0xe17a45df:
                   if (str.equals("strongVideoHidePercent")) {
                      i = 12;
                   }
                   break;
                 case 0xe6f3234c:
                   if (str.equals("showWeakVideoMillis")) {
                      i = 13;
                   }
                   break;
                 case 0xf1d91d6c:
                   if (str.equals("strongVideoHideMillis")) {
                      i = 14;
                   }
                   break;
                 case 0xf27bf191:
                   if (str.equals("showWeakVideoCountdownMillis")) {
                      i = 15;
                   }
                   break;
                 case 0xfe439eb7:
                   if (str.equals("expireTimestamp")) {
                      i = 16;
                   }
                   break;
                 case 0x746592:
                   if (str.equals("longVideoStyle")) {
                      i = 17;
                   }
                   break;
                 case 0xad8abcd:
                   if (str.equals("strongToDisappearVideoCountdownMillis")) {
                      i = 18;
                   }
                   break;
                 case 0x10309985:
                   if (str.equals("commentAreaStyle")) {
                      i = 19;
                   }
                   break;
                 case 0x14983d5a:
                   if (str.equals("strongStyle")) {
                      i = 20;
                   }
                   break;
                 case 0x2909b23b:
                   if (str.equals("strongToDisappearVideoPercent")) {
                      i = 21;
                   }
                   break;
                 case 0x362a8ff1:
                   if (str.equals("packageName")) {
                      i = 22;
                   }
                   break;
                 case 0x3b83738b:
                   if (str.equals("merchantCustomerStyle")) {
                      i = 23;
                   }
                   break;
                 case 0x3e4007f1:
                   if (str.equals("subscriptDescription")) {
                      i = 24;
                   }
                   break;
                 case 0x46bcb590:
                   if (str.equals("strongToDisappearVideoMillis")) {
                      i = 25;
                   }
                   break;
                 case 0x4a03943a:
                   if (str.equals("coverStyle")) {
                      i = 26;
                   }
                   break;
                 case 0x591debb7:
                   if (str.equals("weakToStrongVideoMillis")) {
                      i = 27;
                   }
                   break;
                 case 0x62cf40f4:
                   if (str.equals("weakToStrongVideoPercent")) {
                      i = 28;
                   }
                   break;
                 case 0x662eeb1c:
                   if (str.equals("displayType")) {
                      i = 29;
                   }
                   break;
                 case 0x6e138abb:
                   if (str.equals("showWeakMillis")) {
                      i = 30;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   styleInfo1.mDoWeakTransitionMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mDoWeakTransitionMillis);
                   break;
                 case 1:
                   styleInfo1.mShowWeakVideoPercent = KnownTypeAdapters$i.a(p0, styleInfo1.mShowWeakVideoPercent);
                   break;
                 case 2:
                   styleInfo1.mStrongToDisappearMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mStrongToDisappearMillis);
                   break;
                 case 3:
                   styleInfo1.mShowAdLabelInDetail = KnownTypeAdapters$g.a(p0, styleInfo1.mShowAdLabelInDetail);
                   break;
                 case 4:
                   styleInfo1.mAppIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   styleInfo1.mWeakStyleTemplateInfo = this.c.read(p0);
                   break;
                 case 6:
                   styleInfo1.mShowAdLabelInFeed = KnownTypeAdapters$g.a(p0, styleInfo1.mShowAdLabelInFeed);
                   break;
                 case 7:
                   styleInfo1.mHidePlcAfterStrongDisappear = KnownTypeAdapters$g.a(p0, styleInfo1.mHidePlcAfterStrongDisappear);
                   break;
                 case 8:
                   styleInfo1.mMarketUri = TypeAdapters.A.read(p0);
                   break;
                 case 9:
                   styleInfo1.weakToStrongVideoCountdownMillis = KnownTypeAdapters$n.a(p0, styleInfo1.weakToStrongVideoCountdownMillis);
                   break;
                 case 10:
                   styleInfo1.mAppLink = TypeAdapters.A.read(p0);
                   break;
                 case 11:
                   styleInfo1.mAppName = TypeAdapters.A.read(p0);
                   break;
                 case 12:
                   styleInfo1.mStrongVideoHidePercent = KnownTypeAdapters$i.a(p0, styleInfo1.mStrongVideoHidePercent);
                   break;
                 case 13:
                   styleInfo1.mShowWeakVideoMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mShowWeakVideoMillis);
                   break;
                 case 14:
                   styleInfo1.mStrongVideoHideMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mStrongVideoHideMillis);
                   break;
                 case 15:
                   styleInfo1.mShowWeakVideoCountdownMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mShowWeakVideoCountdownMillis);
                   break;
                 case 16:
                   styleInfo1.mExpireTimestamp = KnownTypeAdapters$n.a(p0, styleInfo1.mExpireTimestamp);
                   break;
                 case 17:
                   styleInfo1.mLongVideoStyleTemplateInfo = this.e.read(p0);
                   break;
                 case 18:
                   styleInfo1.mStrongToDisappearVideoCountdownMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mStrongToDisappearVideoCountdownMillis);
                   break;
                 case 19:
                   styleInfo1.mCommentStyleInfo = this.f.read(p0);
                   break;
                 case 20:
                   styleInfo1.mStrongStyleTemplateInfo = this.b.read(p0);
                   break;
                 case 21:
                   styleInfo1.mStrongToDisappearVideoPercent = KnownTypeAdapters$i.a(p0, styleInfo1.mStrongToDisappearVideoPercent);
                   break;
                 case 22:
                   styleInfo1.mPackageName = TypeAdapters.A.read(p0);
                   break;
                 case 23:
                   styleInfo1.mMerchantCustomerStyle = TypeAdapters.A.read(p0);
                   break;
                 case 24:
                   styleInfo1.mSubscriptDescription = TypeAdapters.A.read(p0);
                   break;
                 case 25:
                   styleInfo1.mStrongToDisappearVideoMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mStrongToDisappearVideoMillis);
                   break;
                 case 26:
                   styleInfo1.mCoverStyleTemplateInfo = this.d.read(p0);
                   break;
                 case 27:
                   styleInfo1.mWeakToStrongVideoMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mWeakToStrongVideoMillis);
                   break;
                 case 28:
                   styleInfo1.mWeakToStrongVideoPercent = KnownTypeAdapters$i.a(p0, styleInfo1.mWeakToStrongVideoPercent);
                   break;
                 case 29:
                   styleInfo1.mDisplayType = KnownTypeAdapters$k.a(p0, styleInfo1.mDisplayType);
                   break;
                 case 30:
                   styleInfo1.mShowWeakMillis = KnownTypeAdapters$n.a(p0, styleInfo1.mShowWeakMillis);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return styleInfo1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$StyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$StyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAppLink != null) {
             p0.r("appLink");
             TypeAdapters.A.write(p0, p1.mAppLink);
          }
          p0.r("showAdLabelInDetail");
          p0.P(p1.mShowAdLabelInDetail);
          p0.r("showAdLabelInFeed");
          p0.P(p1.mShowAdLabelInFeed);
          if (p1.mPackageName != null) {
             p0.r("packageName");
             TypeAdapters.A.write(p0, p1.mPackageName);
          }
          if (p1.mAppName != null) {
             p0.r("appName");
             TypeAdapters.A.write(p0, p1.mAppName);
          }
          if (p1.mAppIconUrl != null) {
             p0.r("appIconUrl");
             TypeAdapters.A.write(p0, p1.mAppIconUrl);
          }
          p0.r("expireTimestamp");
          p0.K(p1.mExpireTimestamp);
          p0.r("showWeakMillis");
          p0.K(p1.mShowWeakMillis);
          p0.r("showWeakVideoMillis");
          p0.K(p1.mShowWeakVideoMillis);
          p0.r("showWeakVideoCountdownMillis");
          p0.K(p1.mShowWeakVideoCountdownMillis);
          p0.r("showWeakVideoPercent");
          p0.J(p1.mShowWeakVideoPercent);
          p0.r("weakToStrongVideoMillis");
          p0.K(p1.mWeakToStrongVideoMillis);
          p0.r("weakToStrongVideoPercent");
          p0.J(p1.mWeakToStrongVideoPercent);
          p0.r("weakToStrongVideoCountdownMillis");
          p0.K(p1.weakToStrongVideoCountdownMillis);
          p0.r("strongVideoHideMillis");
          p0.K(p1.mStrongVideoHideMillis);
          p0.r("strongVideoHidePercent");
          p0.J(p1.mStrongVideoHidePercent);
          p0.r("strongToDisappearVideoMillis");
          p0.K(p1.mStrongToDisappearVideoMillis);
          p0.r("strongToDisappearVideoCountdownMillis");
          p0.K(p1.mStrongToDisappearVideoCountdownMillis);
          p0.r("strongToDisappearVideoPercent");
          p0.J(p1.mStrongToDisappearVideoPercent);
          p0.r("strongToDisappearMillis");
          p0.K(p1.mStrongToDisappearMillis);
          p0.r("hidePlcAfterStrongDisappear");
          p0.P(p1.mHidePlcAfterStrongDisappear);
          p0.r("doWeakTransitionMillis");
          p0.K(p1.mDoWeakTransitionMillis);
          if (p1.mStrongStyleTemplateInfo != null) {
             p0.r("strongStyle");
             this.b.write(p0, p1.mStrongStyleTemplateInfo);
          }
          if (p1.mWeakStyleTemplateInfo != null) {
             p0.r("weakStyle");
             this.c.write(p0, p1.mWeakStyleTemplateInfo);
          }
          if (p1.mCoverStyleTemplateInfo != null) {
             p0.r("coverStyle");
             this.d.write(p0, p1.mCoverStyleTemplateInfo);
          }
          if (p1.mLongVideoStyleTemplateInfo != null) {
             p0.r("longVideoStyle");
             this.e.write(p0, p1.mLongVideoStyleTemplateInfo);
          }
          if (p1.mCommentStyleInfo != null) {
             p0.r("commentAreaStyle");
             this.f.write(p0, p1.mCommentStyleInfo);
          }
          if (p1.mSubscriptDescription != null) {
             p0.r("subscriptDescription");
             TypeAdapters.A.write(p0, p1.mSubscriptDescription);
          }
          p0.r("displayType");
          p0.K((long)p1.mDisplayType);
          if (p1.mMarketUri != null) {
             p0.r("marketUri");
             TypeAdapters.A.write(p0, p1.mMarketUri);
          }
          if (p1.mMerchantCustomerStyle != null) {
             p0.r("merchantCustomerStyle");
             TypeAdapters.A.write(p0, p1.mMerchantCustomerStyle);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
