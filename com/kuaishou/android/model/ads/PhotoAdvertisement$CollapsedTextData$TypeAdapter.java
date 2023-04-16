package com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CollapsedTextData;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PhotoAdvertisement$CollapsedTextData$TypeAdapter extends TypeAdapter	// class@0008e0
{
    public final Gson a;
    public static final a b;

    static {
       PhotoAdvertisement$CollapsedTextData$TypeAdapter.b = a.get(PhotoAdvertisement$CollapsedTextData.class);
    }
    public void PhotoAdvertisement$CollapsedTextData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PhotoAdvertisement$CollapsedTextData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PhotoAdvertisement$CollapsedTextData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PhotoAdvertisement$CollapsedTextData uCollapsedTe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCollapsedTe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCollapsedTe;
       }else {
          p0.c();
          PhotoAdvertisement$CollapsedTextData uCollapsedTe1 = new PhotoAdvertisement$CollapsedTextData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("content")) {
                if (!str.equals("minLineCount")) {
                   p0.Q();
                }else {
                   uCollapsedTe1.mMinLineCount = KnownTypeAdapters$k.a(p0, uCollapsedTe1.mMinLineCount);
                }
             }else {
                uCollapsedTe1.mContent = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uCollapsedTe1;
       }
    }
    public void b(b p0,PhotoAdvertisement$CollapsedTextData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoAdvertisement$CollapsedTextData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          p0.r("minLineCount");
          p0.K((long)p1.mMinLineCount);
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
