package com.yxcorp.gifshow.pendant.kmessage.Message$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.pendant.kmessage.Message;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.pendant.kmessage.Message$PendantConfig$TypeAdapter;
import com.yxcorp.gifshow.pendant.kmessage.Message$BubbleConfig$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.yxcorp.gifshow.pendant.kmessage.Message$BubbleConfig;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.yxcorp.gifshow.pendant.kmessage.Message$PendantConfig;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class Message$TypeAdapter extends TypeAdapter	// class@00126b
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       Message$TypeAdapter.d = a.get(Message.class);
    }
    public void Message$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(Message$PendantConfig$TypeAdapter.b);
       this.c = p0.j(Message$BubbleConfig$TypeAdapter.b);
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, Message$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new Message();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81158a4f:
                      if (str.equals("startTime")) {
                         i = 0;
                      }
                      break;
                    case 0x88497445:
                      if (str.equals("msgPriority")) {
                         i = 1;
                      }
                      break;
                    case 0x957315eb:
                      if (str.equals("isAbandon")) {
                         i = 2;
                      }
                      break;
                    case 0xa0336a48:
                      if (str.equals("endTime")) {
                         i = 3;
                      }
                      break;
                    case 0xc3aaef43:
                      if (str.equals("onlyTk")) {
                         i = 4;
                      }
                      break;
                    case 0xe3b21a23:
                      if (str.equals("effectPolicy")) {
                         i = 5;
                      }
                      break;
                    case 0xf944e6bf:
                      if (str.equals("tkExtraParams")) {
                         i = 6;
                      }
                      break;
                    case 0x635d47c:
                      if (str.equals("msgId")) {
                         i = 7;
                      }
                      break;
                    case 0xb04b5fe:
                      if (str.equals("pendantConfig")) {
                         i = 8;
                      }
                      break;
                    case 0x4c9df990:
                      if (str.equals("dispersedTime")) {
                         i = 9;
                      }
                      break;
                    case 0x60912cd4:
                      if (str.equals("tkBundleId")) {
                         i = 10;
                      }
                      break;
                    case 0x6f4f8aee:
                      if (str.equals("bubbleConfig")) {
                         i = 11;
                      }
                      break;
                    case 0x7a1b748a:
                      if (str.equals("activityId")) {
                         i = 12;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mTime = KnownTypeAdapters$n.a(p0, obj.mTime);
                      break;
                    case 1:
                      obj.mPriority = KnownTypeAdapters$k.a(p0, obj.mPriority);
                      break;
                    case 2:
                      obj.mIsAbandon = KnownTypeAdapters$g.a(p0, obj.mIsAbandon);
                      break;
                    case 3:
                      obj.mEndTime = KnownTypeAdapters$n.a(p0, obj.mEndTime);
                      break;
                    case 4:
                      obj.mOnlyTk = KnownTypeAdapters$g.a(p0, obj.mOnlyTk);
                      break;
                    case 5:
                      obj.mEffectPolicy = KnownTypeAdapters$k.a(p0, obj.mEffectPolicy);
                      break;
                    case 6:
                      obj.mTkExtraParams = TypeAdapters.A.read(p0);
                      break;
                    case 7:
                      obj.mMsgId = TypeAdapters.A.read(p0);
                      break;
                    case 8:
                      obj.mPendantConfig = this.b.read(p0);
                      break;
                    case 9:
                      obj.mDispersedTime = KnownTypeAdapters$n.a(p0, obj.mDispersedTime);
                      break;
                    case 10:
                      obj.mTkBundleId = TypeAdapters.A.read(p0);
                      break;
                    case 11:
                      obj.mBubbleConfig = this.c.read(p0);
                      break;
                    case 12:
                      obj.mActivityId = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Message$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mMsgId != null) {
             p0.r("msgId");
             TypeAdapters.A.write(p0, p1.mMsgId);
          }
          p0.r("msgPriority");
          p0.K((long)p1.mPriority);
          p0.r("startTime");
          p0.K(p1.mTime);
          p0.r("endTime");
          p0.K(p1.mEndTime);
          p0.r("dispersedTime");
          p0.K(p1.mDispersedTime);
          if (p1.mActivityId != null) {
             p0.r("activityId");
             TypeAdapters.A.write(p0, p1.mActivityId);
          }
          p0.r("effectPolicy");
          p0.K((long)p1.mEffectPolicy);
          p0.r("isAbandon");
          p0.P(p1.mIsAbandon);
          if (p1.mTkBundleId != null) {
             p0.r("tkBundleId");
             TypeAdapters.A.write(p0, p1.mTkBundleId);
          }
          if (p1.mTkExtraParams != null) {
             p0.r("tkExtraParams");
             TypeAdapters.A.write(p0, p1.mTkExtraParams);
          }
          p0.r("onlyTk");
          p0.P(p1.mOnlyTk);
          if (p1.mPendantConfig != null) {
             p0.r("pendantConfig");
             this.b.write(p0, p1.mPendantConfig);
          }
          if (p1.mBubbleConfig != null) {
             p0.r("bubbleConfig");
             this.c.write(p0, p1.mBubbleConfig);
          }
          p0.j();
       }
       return;
    }
}
