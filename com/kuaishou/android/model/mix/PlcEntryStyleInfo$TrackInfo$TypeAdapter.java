package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$TypeAdapter$a;

public final class PlcEntryStyleInfo$TrackInfo$TypeAdapter extends TypeAdapter	// class@000dac
{
    public final Gson a;
    public static final a b;

    static {
       PlcEntryStyleInfo$TrackInfo$TypeAdapter.b = a.get(PlcEntryStyleInfo$TrackInfo.class);
    }
    public void PlcEntryStyleInfo$TrackInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PlcEntryStyleInfo$TrackInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$TrackInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$TrackInfo trackInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return trackInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return trackInfo;
       }else {
          p0.c();
          PlcEntryStyleInfo$TrackInfo trackInfo1 = new PlcEntryStyleInfo$TrackInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("url")) {
                if (!str.equals("type")) {
                   p0.Q();
                }else {
                   trackInfo1.mType = KnownTypeAdapters$k.a(p0, trackInfo1.mType);
                }
             }else {
                trackInfo1.mUrls = new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new PlcEntryStyleInfo$TrackInfo$TypeAdapter$b(this)).a(p0);
             }
          }
          p0.j();
          return trackInfo1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$TrackInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$TrackInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mUrls != null) {
             p0.r("url");
             new KnownTypeAdapters$ArrayTypeAdapter(TypeAdapters.A, new PlcEntryStyleInfo$TrackInfo$TypeAdapter$a(this)).b(p0, p1.mUrls);
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
