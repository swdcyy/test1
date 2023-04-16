package com.kuaishou.gifshow.platform.network.keyconfig.ActivityConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.gifshow.platform.network.keyconfig.Sf2023KeyConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.UgActivityPlatform$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.gifshow.platform.network.keyconfig.UgActivityPlatform;
import com.google.gson.stream.b;

public final class ActivityConfig$TypeAdapter extends TypeAdapter	// class@00084d
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       ActivityConfig$TypeAdapter.d = a.get(ActivityConfig.class);
    }
    public void ActivityConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(UgActivityPlatform$TypeAdapter.b);
       this.c = p0.j(a.get(Sf2023KeyConfig.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ActivityConfig$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new ActivityConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("ugActivityPlatform")) {
                   if (!str1.equals("acWarmup")) {
                      p0.Q();
                   }else {
                      obj.mSfEggConfig = this.c.read(p0);
                   }
                }else {
                   obj.mUgActivityPlatform = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mUgActivityPlatform != null) {
             p0.r("ugActivityPlatform");
             this.b.write(p0, p1.mUgActivityPlatform);
          }
          if (p1.mSfEggConfig != null) {
             p0.r("acWarmup");
             this.c.write(p0, p1.mSfEggConfig);
          }
          p0.j();
       }
       return;
    }
}
