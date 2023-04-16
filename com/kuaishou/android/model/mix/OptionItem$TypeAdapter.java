package com.kuaishou.android.model.mix.OptionItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.OptionItem;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class OptionItem$TypeAdapter extends TypeAdapter	// class@000d2e
{
    public final Gson a;
    public static final a b;

    static {
       OptionItem$TypeAdapter.b = a.get(OptionItem.class);
    }
    public void OptionItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public OptionItem a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, OptionItem$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       OptionItem optionItem = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return optionItem;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return optionItem;
       }else {
          p0.c();
          OptionItem optionItem1 = new OptionItem();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xd0d14278:
                   if (str.equals("weight")) {
                      i = 0;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 1;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 2;
                   }
                   break;
                 case 0x6969627:
                   if (str.equals("toast")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   optionItem1.mWeight = KnownTypeAdapters$k.a(p0, optionItem1.mWeight);
                   break;
                 case 1:
                   optionItem1.mText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   optionItem1.mType = KnownTypeAdapters$k.a(p0, optionItem1.mType);
                   break;
                 case 3:
                   optionItem1.mToast = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return optionItem1;
       }
    }
    public void b(b p0,OptionItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OptionItem$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mToast != null) {
             p0.r("toast");
             TypeAdapters.A.write(p0, p1.mToast);
          }
          p0.r("weight");
          p0.K((long)p1.mWeight);
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
