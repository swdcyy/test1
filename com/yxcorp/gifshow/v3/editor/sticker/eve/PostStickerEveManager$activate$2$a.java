package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$2$a;
import erd.g;
import java.lang.Object;
import sm7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ml5.a;
import java.util.Map;
import com.kwai.sdk.eve.InferenceState;
import otc.a;
import java.util.Objects;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$TaskType;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$ErrorInfo;
import lnc.a1;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import km8.b;
import lnc.p3;

public final class PostStickerEveManager$activate$2$a implements g	// class@001241
{
    public static final PostStickerEveManager$activate$2$a b;

    static {
       PostStickerEveManager$activate$2$a.b = new PostStickerEveManager$activate$2$a();
    }
    public void PostStickerEveManager$activate$2$a(){
       super();
    }
    public void accept(Object p0){
       SharedPreferences$Editor key;
       SharedPreferences a;
       if (PatchProxy.applyVoidOneRefs(p0, this, PostStickerEveManager$activate$2$a.class, "1")) {
       }else {
          a uoa = p0.f();
          String str = null;
          Map map = (uoa != null)? uoa.d(): str;
          int i = 0;
          String str1 = "PostStickerEveManager";
          if (p0.g() == InferenceState.SUCCESS) {
             a g = a.g;
             Objects.requireNonNull(g);
             if (!PatchProxy.applyVoidOneRefs(map, g, a.class, "5")) {
                HashMap hashMap = new HashMap();
                String str2 = (map != null)? map.get("scoreMap"): str;
                if (!str2 instanceof Map) {
                   str2 = str;
                }
                if (str2 != null) {
                   Iterator iterator = str2.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (uEntry.getKey() instanceof String && uEntry.getValue() instanceof Number) {
                         key = uEntry.getKey();
                         Objects.requireNonNull(key, "null cannot be cast to non-null type kotlin.String");
                         Object value = uEntry.getValue();
                         Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Number");
                         hashMap.put(key, Float.valueOf(value.floatValue()));
                      }
                   }
                }
                if (hashMap.isEmpty()) {
                   PostStickerEveLogger.d.d(PostStickerEveLogger$TaskType.PanelSort, PostStickerEveLogger$ErrorInfo.NoScoreMap);
                }
                long l = a1.k();
                String str3 = (map != null)? map.get("defaultScore"): str;
                if (!str3 instanceof Number) {
                   str3 = str;
                }
                Float uFloat = (str3 != null)? Float.valueOf(str3.floatValue()): str;
                if (uFloat == null) {
                   PostStickerEveLogger.d.d(PostStickerEveLogger$TaskType.PanelSort, PostStickerEveLogger$ErrorInfo.NoDefaultScore);
                }
                a uoa1 = a.D();
                StringBuilder str4 = "saveScore, currentTimeStamp: "+l+", "+"defaultScore: ";
                float f = 0xbf800000;
                float f1 = (uFloat != null)? uFloat.floatValue(): 0xbf800000;
                Object[] objArray = new Object[i];
                uoa1.w(str1, str4+f1, objArray);
                StickerRanker.i.j(hashMap);
                a = a.a;
                key = a.edit();
                key.putLong("sticker_score_update_time", a1.k());
                g.a(key);
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putString("sticker_score_map", b.e(hashMap));
                g.a(uEditor);
                if (uFloat != null) {
                   f = uFloat.floatValue();
                }
                SharedPreferences$Editor uEditor1 = a.edit();
                uEditor1.putFloat("sticker_default_score", f);
                g.a(uEditor1);
             }
          }else {
             Object[] objArray1 = new Object[i];
             p3.D().w(str1, "result error, "+p0, objArray1);
          }
          if (p0.g() != InferenceState.SUCCESS) {
             str = p0.toString();
          }
          PostStickerEveLogger.d.c(PostStickerEveLogger$TaskType.EveInference, str);
       }
       return;
    }
}
