package com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.OptionItem$TypeAdapter;
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
import com.google.gson.internal.bind.TypeAdapters;
import java.util.List;
import com.google.gson.stream.b;

public final class InterestAdjustSnackBarInfo$TypeAdapter extends TypeAdapter	// class@000ceb
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       InterestAdjustSnackBarInfo$TypeAdapter.d = a.get(InterestAdjustSnackBarInfo.class);
    }
    public void InterestAdjustSnackBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(OptionItem$TypeAdapter.b);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public InterestAdjustSnackBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, InterestAdjustSnackBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       InterestAdjustSnackBarInfo interestAdju = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return interestAdju;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return interestAdju;
       }else {
          p0.c();
          InterestAdjustSnackBarInfo interestAdju1 = new InterestAdjustSnackBarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xa0b28de5:
                   if (str.equals("interestId")) {
                      i = 0;
                   }
                   break;
                 case 0xe96c704b:
                   if (str.equals("optionItems")) {
                      i = 1;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   interestAdju1.mInterestId = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   interestAdju1.mOptionItems = this.c.read(p0);
                   break;
                 case 2:
                   interestAdju1.mContent = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return interestAdju1;
       }
    }
    public void b(b p0,InterestAdjustSnackBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InterestAdjustSnackBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mInterestId != null) {
             p0.r("interestId");
             TypeAdapters.A.write(p0, p1.mInterestId);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mOptionItems != null) {
             p0.r("optionItems");
             this.c.write(p0, p1.mOptionItems);
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
