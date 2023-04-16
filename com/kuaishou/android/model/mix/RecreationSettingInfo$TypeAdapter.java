package com.kuaishou.android.model.mix.RecreationSettingInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.HotAreaInfo$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.stream.b;

public final class RecreationSettingInfo$TypeAdapter extends TypeAdapter	// class@000de5
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       RecreationSettingInfo$TypeAdapter.d = a.get(RecreationSettingInfo.class);
    }
    public void RecreationSettingInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(HotAreaInfo$TypeAdapter.c);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public RecreationSettingInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, RecreationSettingInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       RecreationSettingInfo recreationSe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return recreationSe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return recreationSe;
       }else {
          p0.c();
          RecreationSettingInfo recreationSe1 = new RecreationSettingInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("isRecreationPhoto")) {
                if (!str.equals("hotAreaInfo")) {
                   p0.Q();
                }else {
                   recreationSe1.mHotAreaInfos = this.c.read(p0);
                }
             }else {
                recreationSe1.mIsRecreationPhoto = KnownTypeAdapters$g.a(p0, recreationSe1.mIsRecreationPhoto);
             }
          }
          p0.j();
          return recreationSe1;
       }
    }
    public void b(b p0,RecreationSettingInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecreationSettingInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("isRecreationPhoto");
          p0.P(p1.mIsRecreationPhoto);
          if (p1.mHotAreaInfos != null) {
             p0.r("hotAreaInfo");
             this.c.write(p0, p1.mHotAreaInfos);
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
