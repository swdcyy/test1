package com.kuaishou.android.model.mix.LyricItemEntity$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.LyricItemEntity;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.LyricItemEntity$MusicCommonTagEntity;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
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
import com.google.gson.stream.b;

public final class LyricItemEntity$TypeAdapter extends TypeAdapter	// class@000d14
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       LyricItemEntity$TypeAdapter.d = a.get(LyricItemEntity.class);
    }
    public void LyricItemEntity$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(LyricItemEntity$MusicCommonTagEntity.class));
       this.c = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public LyricItemEntity a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LyricItemEntity$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LyricItemEntity lyricItemEnt = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return lyricItemEnt;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return lyricItemEnt;
       }else {
          p0.c();
          LyricItemEntity lyricItemEnt1 = new LyricItemEntity();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbf29e7f4:
                   if (str.equals("lyrics")) {
                      i = 0;
                   }
                   break;
                 case 0xc594b292:
                   if (str.equals("prefix")) {
                      i = 1;
                   }
                   break;
                 case 0x1def6e8c:
                   if (str.equals("highlightParts")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   lyricItemEnt1.mLyricsInfo = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   lyricItemEnt1.mLyricPrefixEntity = this.b.read(p0);
                   break;
                 case 2:
                   lyricItemEnt1.mLyricsHighlightParts = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return lyricItemEnt1;
       }
    }
    public void b(b p0,LyricItemEntity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LyricItemEntity$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLyricPrefixEntity != null) {
             p0.r("prefix");
             this.b.write(p0, p1.mLyricPrefixEntity);
          }
          if (p1.mLyricsInfo != null) {
             p0.r("lyrics");
             TypeAdapters.A.write(p0, p1.mLyricsInfo);
          }
          if (p1.mLyricsHighlightParts != null) {
             p0.r("highlightParts");
             this.c.write(p0, p1.mLyricsHighlightParts);
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
