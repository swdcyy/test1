package com.kuaishou.android.model.mix.UrlInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.UrlInfo;
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
import com.google.gson.stream.b;

public final class UrlInfo$TypeAdapter extends TypeAdapter	// class@000e21
{
    public final Gson a;
    public static final a b;

    static {
       UrlInfo$TypeAdapter.b = a.get(UrlInfo.class);
    }
    public void UrlInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public UrlInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, UrlInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       UrlInfo urlInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return urlInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return urlInfo;
       }else {
          p0.c();
          UrlInfo urlInfo1 = new UrlInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("cdn")) {
                if (!str.equals("url")) {
                   p0.Q();
                }else {
                   urlInfo1.setUrl(TypeAdapters.A.read(p0));
                }
             }else {
                urlInfo1.setCdn(TypeAdapters.A.read(p0));
             }
          }
          p0.j();
          return urlInfo1;
       }
    }
    public void b(b p0,UrlInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UrlInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.getCdn() != null) {
             p0.r("cdn");
             TypeAdapters.A.write(p0, p1.getCdn());
          }
          if (p1.getUrl() != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.getUrl());
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
