package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGRConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGRConfig;
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
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.live.core.show.startup.b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.live.core.show.startup.a;

public final class LiveConfigStartupResponse$LiveGRConfig$TypeAdapter extends TypeAdapter	// class@001044
{
    public final Gson a;
    public static final a b;

    static {
       LiveConfigStartupResponse$LiveGRConfig$TypeAdapter.b = a.get(LiveConfigStartupResponse$LiveGRConfig.class);
    }
    public void LiveConfigStartupResponse$LiveGRConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveConfigStartupResponse$LiveGRConfig$TypeAdapter.class, "2");
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
             obj = new LiveConfigStartupResponse$LiveGRConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("disableHorizontalScreenAuthorIds")) {
                   p0.Q();
                }else {
                   obj.mDisableLandscapeAnchorIds = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new b(this)).a(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveConfigStartupResponse$LiveGRConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mDisableLandscapeAnchorIds != null) {
             p0.r("disableHorizontalScreenAuthorIds");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new a(this)).b(p0, p1.mDisableLandscapeAnchorIds);
          }
          p0.j();
       }
       return;
    }
}
