package com.kwai.components.feedmodel.KwaiCoinTaskInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.KwaiCoinTaskInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class KwaiCoinTaskInfo$TypeAdapter extends TypeAdapter	// class@000c1a
{
    public final Gson a;
    public static final a b;

    static {
       KwaiCoinTaskInfo$TypeAdapter.b = a.get(KwaiCoinTaskInfo.class);
    }
    public void KwaiCoinTaskInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, KwaiCoinTaskInfo$TypeAdapter.class, "2");
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
             obj = new KwaiCoinTaskInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xabba5058:
                      if (str.equals("amount")) {
                         i = 0;
                      }
                      break;
                    case 0xc9e135a5:
                      if (str.equals("scheme")) {
                         i = 1;
                      }
                      break;
                    case 0xe3d2f560:
                      if (str.equals("dialogSubTitle")) {
                         i = 2;
                      }
                      break;
                    case 0x313c79:
                      if (str.equals("icon")) {
                         i = 3;
                      }
                      break;
                    case 0x36452d:
                      if (str.equals("text")) {
                         i = 4;
                      }
                      break;
                    case 0x368f3a:
                      if (str.equals("type")) {
                         i = 5;
                      }
                      break;
                    case 0xca41f0:
                      if (str.equals("dialogTitle")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mAmount = KnownTypeAdapters$k.a(p0, obj.mAmount);
                      break;
                    case 1:
                      obj.mActionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mDialogSubTitle = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mLogoUrl = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mTitle = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.mType = KnownTypeAdapters$k.a(p0, obj.mType);
                      break;
                    case 6:
                      obj.mDialogTitle = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiCoinTaskInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mLogoUrl != null) {
             p0.r("icon");
             TypeAdapters.A.write(p0, p1.mLogoUrl);
          }
          if (p1.mActionUrl != null) {
             p0.r("scheme");
             TypeAdapters.A.write(p0, p1.mActionUrl);
          }
          if (p1.mDialogTitle != null) {
             p0.r("dialogTitle");
             TypeAdapters.A.write(p0, p1.mDialogTitle);
          }
          if (p1.mDialogSubTitle != null) {
             p0.r("dialogSubTitle");
             TypeAdapters.A.write(p0, p1.mDialogSubTitle);
          }
          p0.r("amount");
          p0.K((long)p1.mAmount);
          p0.r("type");
          p0.K((long)p1.mType);
          p0.j();
       }
       return;
    }
}
