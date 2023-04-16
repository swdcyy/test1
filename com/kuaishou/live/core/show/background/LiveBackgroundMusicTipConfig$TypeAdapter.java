package com.kuaishou.live.core.show.background.LiveBackgroundMusicTipConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.live.core.show.background.LiveBackgroundMusicTipConfig;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class LiveBackgroundMusicTipConfig$TypeAdapter extends TypeAdapter	// class@0009d9
{
    public final Gson a;
    public static final a b;

    static {
       LiveBackgroundMusicTipConfig$TypeAdapter.b = a.get(LiveBackgroundMusicTipConfig.class);
    }
    public void LiveBackgroundMusicTipConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveBackgroundMusicTipConfig$TypeAdapter.class, "2");
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
             obj = new LiveBackgroundMusicTipConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("backgroundMusicTipDelayTime")) {
                   if (!str1.equals("backgroundMusicTipText")) {
                      p0.Q();
                   }else {
                      obj.mBackgroundMusicTipText = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mBackgroundMusicTipDelayTimeMs = KnownTypeAdapters$n.a(p0, obj.mBackgroundMusicTipDelayTimeMs);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBackgroundMusicTipConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("backgroundMusicTipDelayTime");
          p0.K(p1.mBackgroundMusicTipDelayTimeMs);
          if (p1.mBackgroundMusicTipText != null) {
             p0.r("backgroundMusicTipText");
             TypeAdapters.A.write(p0, p1.mBackgroundMusicTipText);
          }
          p0.j();
       }
       return;
    }
}
