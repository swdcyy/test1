package com.kuaishou.gifshow.platform.network.keyconfig.RecoDegradeConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.RecoDegradeConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.google.gson.stream.b;

public final class RecoDegradeConfig$TypeAdapter extends TypeAdapter	// class@000881
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       RecoDegradeConfig$TypeAdapter.c = a.get(RecoDegradeConfig.class);
    }
    public void RecoDegradeConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(KnownTypeAdapters.c, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RecoDegradeConfig$TypeAdapter.class, "2");
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
             obj = new RecoDegradeConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("recoverChannelList")) {
                   if (!str1.equals("enableDegradeShow")) {
                      p0.Q();
                   }else {
                      obj.mEnableDegradeShow = KnownTypeAdapters$g.a(p0, obj.mEnableDegradeShow);
                   }
                }else {
                   obj.mRecoverChannelList = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecoDegradeConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enableDegradeShow");
          p0.P(p1.mEnableDegradeShow);
          if (p1.mRecoverChannelList != null) {
             p0.r("recoverChannelList");
             this.b.write(p0, p1.mRecoverChannelList);
          }
          p0.j();
       }
       return;
    }
}
