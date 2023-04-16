package com.kuaishou.android.model.mix.FansTopDisplayStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopExtData$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$g;
import java.util.List;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopExtData;
import com.google.gson.stream.b;

public final class FansTopDisplayStyle$TypeAdapter extends TypeAdapter	// class@000c6e
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       FansTopDisplayStyle$TypeAdapter.e = a.get(FansTopDisplayStyle.class);
    }
    public void FansTopDisplayStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(FansTopDisplayStyle$FansTopRecommendUsers$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(FansTopDisplayStyle$FansTopExtData$TypeAdapter.b);
    }
    public FansTopDisplayStyle a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, FansTopDisplayStyle$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       FansTopDisplayStyle uFansTopDisp = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uFansTopDisp;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uFansTopDisp;
       }else {
          p0.c();
          FansTopDisplayStyle uFansTopDisp1 = new FansTopDisplayStyle();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xb21df56b:
                   if (str.equals("extData")) {
                      i = 0;
                   }
                   break;
                 case 0xc206a2ac:
                   if (str.equals("recommendUsers")) {
                      i = 1;
                   }
                   break;
                 case 0xd6284e2a:
                   if (str.equals("showDeliveryIcon")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uFansTopDisp1.mExtData = this.d.read(p0);
                   break;
                 case 1:
                   uFansTopDisp1.mFansTopRecommendUsers = this.c.read(p0);
                   break;
                 case 2:
                   uFansTopDisp1.mShowDeliveryIcon = KnownTypeAdapters$g.a(p0, uFansTopDisp1.mShowDeliveryIcon);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uFansTopDisp1;
       }
    }
    public void b(b p0,FansTopDisplayStyle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FansTopDisplayStyle$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("showDeliveryIcon");
          p0.P(p1.mShowDeliveryIcon);
          if (p1.mFansTopRecommendUsers != null) {
             p0.r("recommendUsers");
             this.c.write(p0, p1.mFansTopRecommendUsers);
          }
          if (p1.mExtData != null) {
             p0.r("extData");
             this.d.write(p0, p1.mExtData);
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
