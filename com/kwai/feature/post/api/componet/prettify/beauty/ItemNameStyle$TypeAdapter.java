package com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.feature.post.api.componet.prettify.beauty.ItemNameStyle;
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

public final class ItemNameStyle$TypeAdapter extends TypeAdapter	// class@0012dd
{
    public final Gson a;
    public static final a b;

    static {
       ItemNameStyle$TypeAdapter.b = a.get(ItemNameStyle.class);
    }
    public void ItemNameStyle$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ItemNameStyle$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new ItemNameStyle();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("textColor")) {
                   if (!str1.equals("bgColor")) {
                      p0.Q();
                   }else {
                      obj.mBackgroundColor = TypeAdapters.A.read(p0);
                   }
                }else {
                   obj.mTextColor = TypeAdapters.A.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ItemNameStyle$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTextColor != null) {
             p0.r("textColor");
             TypeAdapters.A.write(p0, p1.mTextColor);
          }
          if (p1.mBackgroundColor != null) {
             p0.r("bgColor");
             TypeAdapters.A.write(p0, p1.mBackgroundColor);
          }
          p0.j();
       }
       return;
    }
}
