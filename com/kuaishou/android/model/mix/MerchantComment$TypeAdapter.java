package com.kuaishou.android.model.mix.MerchantComment$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.MerchantComment;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.MerchantComment$Card$TypeAdapter;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.List;
import com.google.gson.stream.b;

public final class MerchantComment$TypeAdapter extends TypeAdapter	// class@000d20
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public static final a d;

    static {
       MerchantComment$TypeAdapter.d = a.get(MerchantComment.class);
    }
    public void MerchantComment$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(MerchantComment$Card$TypeAdapter.e);
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
    }
    public MerchantComment a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, MerchantComment$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       MerchantComment merchantComm = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return merchantComm;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return merchantComm;
       }else {
          p0.c();
          MerchantComment merchantComm1 = new MerchantComment();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd1dc5021:
                   if (str.equals("showCustomerMillis")) {
                      i = 0;
                   }
                   break;
                 case 0x5a0e763:
                   if (str.equals("cards")) {
                      i = 1;
                   }
                   break;
                 case 0x267d6b90:
                   if (str.equals("customerToDisappearMillis")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   merchantComm1.mShowCustomerMillis = KnownTypeAdapters$n.a(p0, merchantComm1.mShowCustomerMillis);
                   break;
                 case 1:
                   merchantComm1.mCards = this.c.read(p0);
                   break;
                 case 2:
                   merchantComm1.mCustomerToDisappearMillis = KnownTypeAdapters$n.a(p0, merchantComm1.mCustomerToDisappearMillis);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return merchantComm1;
       }
    }
    public void b(b p0,MerchantComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantComment$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mCards != null) {
             p0.r("cards");
             this.c.write(p0, p1.mCards);
          }
          p0.r("customerToDisappearMillis");
          p0.K(p1.mCustomerToDisappearMillis);
          p0.r("showCustomerMillis");
          p0.K(p1.mShowCustomerMillis);
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
