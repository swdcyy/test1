package com.kuaishou.android.model.ads.AdWhiteBoxItem;
import java.io.Serializable;
import com.kuaishou.android.model.ads.AdWhiteBoxItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonArray;
import java.lang.Number;
import com.google.gson.JsonElement;
import qrd.l1;
import java.lang.CharSequence;
import com.google.gson.c;

public final class AdWhiteBoxItem implements Serializable	// class@000850
{
    public JsonObject b;
    public final String itemTitle;
    public String mSaveData;
    public final int style;
    public static final AdWhiteBoxItem$a Companion;
    public static final long serialVersionUID;

    static {
       AdWhiteBoxItem.Companion = new AdWhiteBoxItem$a(null);
    }
    public void AdWhiteBoxItem(String p0,int p1){
       a.p(p0, "itemTitle");
       super();
       this.itemTitle = p0;
       this.style = p1;
       this.mSaveData = "";
    }
    public final JsonObject a(String p0,int p1){
       JsonObject obj;
       if (PatchProxy.isSupport(AdWhiteBoxItem.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, AdWhiteBoxItem.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new JsonObject();
       obj.c0("title", p0);
       obj.a0("style", Integer.valueOf(p1));
       obj.G("data", new JsonArray());
       return obj;
    }
    public final void appendSubItem(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdWhiteBoxItem.class, "4")) {
          return;
       }
       a.p(p0, "subItemTitle");
       JsonObject jsonObject = this.b();
       if (jsonObject != null) {
          JsonArray jsonArray = jsonObject.g0("data");
          if (jsonArray != null) {
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.c0("title", p0);
             jsonObject1.c0("content", String.valueOf(p1));
             jsonArray.G(jsonObject1);
          }
       }
       return;
    }
    public final JsonObject b(){
       AdWhiteBoxItem obj = PatchProxy.apply(null, this, AdWhiteBoxItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          obj = (!this.mSaveData.length())? 1: null;
          JsonObject jsonObject = (obj)? this.a(this.itemTitle, this.style): this.c(this.itemTitle, this.style);
          this.b = jsonObject;
       }
       return this.b;
    }
    public final JsonObject c(String p0,int p1){
       JsonElement obj;
       if (PatchProxy.isSupport(AdWhiteBoxItem.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, AdWhiteBoxItem.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = c.d(this.mSaveData);
       a.o(obj, "JsonParser.parseString\(mSaveData\)");
       JsonObject jsonObject = obj.r();
       a.o(jsonObject, "JsonParser.parseString\(mSaveData\).asJsonObject");
       return jsonObject;
    }
    public final JsonObject getJsonObject(){
       Object obj = PatchProxy.apply(null, this, AdWhiteBoxItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b();
    }
    public final void save(){
       if (PatchProxy.applyVoid(null, this, AdWhiteBoxItem.class, "5")) {
          return;
       }
       this.mSaveData = String.valueOf(this.b());
       return;
    }
}
