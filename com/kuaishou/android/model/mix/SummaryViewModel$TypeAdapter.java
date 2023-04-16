package com.kuaishou.android.model.mix.SummaryViewModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.SummaryViewModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$ArrayTypeAdapter;
import com.kuaishou.android.model.mix.SummaryViewModel$TypeAdapter$b;
import com.vimeo.stag.KnownTypeAdapters$f;
import com.google.gson.stream.b;
import com.kuaishou.android.model.mix.SummaryViewModel$TypeAdapter$a;

public final class SummaryViewModel$TypeAdapter extends TypeAdapter	// class@000e07
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       SummaryViewModel$TypeAdapter.e = a.get(SummaryViewModel.class);
    }
    public void SummaryViewModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(User.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(CDNUrl.class));
    }
    public SummaryViewModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SummaryViewModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SummaryViewModel summaryViewM = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return summaryViewM;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return summaryViewM;
       }else {
          p0.c();
          SummaryViewModel summaryViewM1 = new SummaryViewModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbe071a81:
                   if (str.equals("ksOrderId")) {
                      i = 0;
                   }
                   break;
                 case 0xc09b2e36:
                   if (str.equals("textColor")) {
                      i = 1;
                   }
                   break;
                 case 0x313c79:
                   if (str.equals("icon")) {
                      i = 2;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 3;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 4;
                   }
                   break;
                 case 0x6a68e08:
                   if (str.equals("users")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   summaryViewM1.mKsOrderId = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   summaryViewM1.mTextColor = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   summaryViewM1.mIcon = new KnownTypeAdapters$ArrayTypeAdapter(this.d, new SummaryViewModel$TypeAdapter$b(this)).a(p0);
                   break;
                 case 3:
                   summaryViewM1.mText = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   summaryViewM1.mType = KnownTypeAdapters$k.a(p0, summaryViewM1.mType);
                   break;
                 case 5:
                   summaryViewM1.mUsers = this.c.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return summaryViewM1;
       }
    }
    public void b(b p0,SummaryViewModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SummaryViewModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mTextColor != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          if (p1.mUsers != null) {
             p0.r("users");
             this.c.write(p0, p1.mUsers);
          }
          if (p1.mIcon != null) {
             p0.r("icon");
             new KnownTypeAdapters$ArrayTypeAdapter(this.d, new SummaryViewModel$TypeAdapter$a(this)).b(p0, p1.mIcon);
          }
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          p0.r("type");
          p0.K((long)p1.mType);
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
