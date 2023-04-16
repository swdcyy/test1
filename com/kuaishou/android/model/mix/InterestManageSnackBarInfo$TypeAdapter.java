package com.kuaishou.android.model.mix.InterestManageSnackBarInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.InterestManageSnackBarInfo$ActionInfo;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class InterestManageSnackBarInfo$TypeAdapter extends TypeAdapter	// class@000cf3
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       InterestManageSnackBarInfo$TypeAdapter.c = a.get(InterestManageSnackBarInfo.class);
    }
    public void InterestManageSnackBarInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(InterestManageSnackBarInfo$ActionInfo$TypeAdapter.b);
    }
    public InterestManageSnackBarInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, InterestManageSnackBarInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       InterestManageSnackBarInfo interestMana = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return interestMana;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return interestMana;
       }else {
          p0.c();
          InterestManageSnackBarInfo interestMana1 = new InterestManageSnackBarInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x1ae8f343:
                   if (str.equals("showAfterTimeInMilliseconds")) {
                      i = 0;
                   }
                   break;
                 case 0x38b73479:
                   if (str.equals("content")) {
                      i = 1;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 2;
                   }
                   break;
                 case 0x6e5c4c04:
                   if (str.equals("actionInfo")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   interestMana1.mShowAfterTimeInMilliseconds = KnownTypeAdapters$n.a(p0, interestMana1.mShowAfterTimeInMilliseconds);
                   break;
                 case 1:
                   interestMana1.mContent = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   interestMana1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   interestMana1.mActionInfo = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return interestMana1;
       }
    }
    public void b(b p0,InterestManageSnackBarInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InterestManageSnackBarInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mContent != null) {
             p0.r("content");
             TypeAdapters.A.write(p0, p1.mContent);
          }
          if (p1.mActionInfo != null) {
             p0.r("actionInfo");
             this.b.write(p0, p1.mActionInfo);
          }
          p0.r("showAfterTimeInMilliseconds");
          p0.K(p1.mShowAfterTimeInMilliseconds);
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
