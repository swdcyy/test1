package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$3$a;
import msd.l;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import com.kwai.sdk.eve.proto.CustomEvent;
import otc.a;
import java.util.Objects;
import org.json.JSONObject;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import java.util.List;
import ml5.a;
import lnc.a1;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;
import w46.b;

public final class PostStickerEveManager$activate$3$a implements l	// class@001244
{

    public void PostStickerEveManager$activate$3$a(){
       super();
    }
    public Object invoke(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LinkedHashMap linkedHashMa = PatchProxy.applyOneRefs(p0, this, PostStickerEveManager$activate$3$a.class, "1");
       if (linkedHashMa != patchProxyRe) {
       }else {
          a.p(p0, "event");
          linkedHashMa = new LinkedHashMap();
          if (p0 instanceof CustomEvent) {
             try{
                a g = a.g;
                Objects.requireNonNull(g);
                String str = "usageMode";
                String str1 = "stickerId";
                if (!PatchProxy.applyVoidTwoRefs(p0, linkedHashMa, g, a.class, "4") && a.g(p0.getCustomKey(), "postStickerUsageEvent")) {
                   JSONObject jSONObject = new JSONObject(p0.getCustomValue());
                   String str2 = jSONObject.optString(str1);
                   int i = jSONObject.optInt(str);
                   a.o(str2, str1);
                   StickerRanker stickerRanke = (str2.length() > 0)? 1: null;
                   if (stickerRanke && i) {
                      stickerRanke = StickerRanker.i;
                      Objects.requireNonNull(stickerRanke);
                      String str3 = PatchProxy.applyOneRefs(str2, stickerRanke, StickerRanker.class, "5");
                      if (str3 != patchProxyRe) {
                      }else {
                         a.p(str2, str1);
                         Map b = StickerRanker.b;
                         List list = (b != null)? b.get(str2): null;
                         str3 = stickerRanke.k(list);
                      }
                      linkedHashMa.put("timestamp", new a(a1.k()));
                      linkedHashMa.put(str1, new a(str2));
                      linkedHashMa.put("groupIds", new a(str3));
                      linkedHashMa.put(str, new a(i));
                      Object[] objArray = new Object[0];
                      a.D().w("PostStickerEveManager", "fillCustomEvent "+linkedHashMa, objArray);
                   }
                }
             }catch(org.json.JSONException e0){
                a.D().e("PostStickerEveManager", "fillCustomClick params error "+p0.getCustomValue(), e0);
             }
          }
       }
    }
}
