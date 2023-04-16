package com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ClickAfterWords;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
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

public final class PhotoAdvertisement$ClickAfterWords$TypeAdapter extends TypeAdapter	// class@0008dc
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PhotoAdvertisement$ClickAfterWords$TypeAdapter.c = a.get(PhotoAdvertisement$ClickAfterWords.class);
    }
    public void PhotoAdvertisement$ClickAfterWords$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public PhotoAdvertisement$ClickAfterWords a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$ClickAfterWords$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$ClickAfterWords uClickAfterW = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uClickAfterW;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uClickAfterW;
       }else {
          p0.c();
          PhotoAdvertisement$ClickAfterWords uClickAfterW1 = new PhotoAdvertisement$ClickAfterWords();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("wordsTitle")) {
                if (!str.equals("words")) {
                   p0.Q();
                }else {
                   uClickAfterW1.mWords = this.b.read(p0);
                }
             }else {
                uClickAfterW1.mWordsTitle = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uClickAfterW1;
       }
    }
    public void b(b p0,PhotoAdvertisement$ClickAfterWords p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$ClickAfterWords$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mWordsTitle != null) {
             p0.r("wordsTitle");
             TypeAdapters.A.write(p0, p1.mWordsTitle);
          }
          if (p1.mWords != null) {
             p0.r("words");
             this.b.write(p0, p1.mWords);
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
