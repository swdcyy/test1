package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayCountStyle;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter extends TypeAdapter	// class@001031
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveDisplayCountStyle.class);
    }
    public void LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveDisplayCountStyle();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("enableNewDisplayCountStyle")) {
                   p0.Q();
                }else {
                   obj.mEnableNewDisplayCountStyle = KnownTypeAdapters$g.a(p0, obj.mEnableNewDisplayCountStyle);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveDisplayCountStyle$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("enableNewDisplayCountStyle");
          p0.P(p1.mEnableNewDisplayCountStyle);
          p0.j();
       }
       return;
    }
}
