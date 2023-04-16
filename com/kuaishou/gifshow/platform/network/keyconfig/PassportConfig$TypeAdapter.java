package com.kuaishou.gifshow.platform.network.keyconfig.PassportConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.PassportConfig;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class PassportConfig$TypeAdapter extends TypeAdapter	// class@00087b
{
    public final Gson a;
    public static final a b;

    static {
       PassportConfig$TypeAdapter.b = a.get(PassportConfig.class);
    }
    public void PassportConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PassportConfig$TypeAdapter.class, "2");
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
             obj = new PassportConfig();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb76e9ee2:
                      if (str.equals("hideQQ")) {
                         i = 0;
                      }
                      break;
                    case 0xb76e9fc3:
                      if (str.equals("hideWx")) {
                         i = 1;
                      }
                      break;
                    case 0xbc6a674e:
                      if (str.equals("disableAccountOperationFlag")) {
                         i = 2;
                      }
                      break;
                    case 0xbcbf0ba5:
                      if (str.equals("ispLoginConfig")) {
                         i = 3;
                      }
                      break;
                    case 0xdcaf7478:
                      if (str.equals("enableSfAccountRequest")) {
                         i = 4;
                      }
                      break;
                    case 0xf8597baa:
                      if (str.equals("smsDelay")) {
                         i = 5;
                      }
                      break;
                    case 0x41d97d87:
                      if (str.equals("tokenRefreshInterval")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mHideQQ = KnownTypeAdapters$g.a(p0, obj.mHideQQ);
                      break;
                    case 1:
                      obj.mHideWx = KnownTypeAdapters$g.a(p0, obj.mHideWx);
                      break;
                    case 2:
                      obj.mDisableAccountOperationFlag = KnownTypeAdapters$g.a(p0, obj.mDisableAccountOperationFlag);
                      break;
                    case 3:
                      obj.mEnableIspLogin = KnownTypeAdapters$g.a(p0, obj.mEnableIspLogin);
                      break;
                    case 4:
                      obj.mEnableSfAccountRequest = KnownTypeAdapters$g.a(p0, obj.mEnableSfAccountRequest);
                      break;
                    case 5:
                      obj.mSmsDelay = KnownTypeAdapters$k.a(p0, obj.mSmsDelay);
                      break;
                    case 6:
                      obj.mTokenRefreshInterval = KnownTypeAdapters$n.a(p0, obj.mTokenRefreshInterval);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PassportConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enableSfAccountRequest");
          p0.P(p1.mEnableSfAccountRequest);
          p0.r("disableAccountOperationFlag");
          p0.P(p1.mDisableAccountOperationFlag);
          p0.r("smsDelay");
          p0.K((long)p1.mSmsDelay);
          p0.r("tokenRefreshInterval");
          p0.K(p1.mTokenRefreshInterval);
          p0.r("hideWx");
          p0.P(p1.mHideWx);
          p0.r("hideQQ");
          p0.P(p1.mHideQQ);
          p0.r("ispLoginConfig");
          p0.P(p1.mEnableIspLogin);
          p0.j();
       }
       return;
    }
}
