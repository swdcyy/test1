package com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$stickerReRankABConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;

public final class StickerRanker$stickerReRankABConfig$2 extends Lambda implements a	// class@001212
{
    public static final StickerRanker$stickerReRankABConfig$2 INSTANCE;

    static {
       StickerRanker$stickerReRankABConfig$2.INSTANCE = new StickerRanker$stickerReRankABConfig$2();
    }
    public void StickerRanker$stickerReRankABConfig$2(){
       super(0);
    }
    public final StickerRanker$a invoke(){
       StickerRanker$a uoa;
       JsonObject obj = PatchProxy.apply(null, this, StickerRanker$stickerReRankABConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("StickerRerankABConfig", JsonObject.class, new JsonObject());
       try{
          uoa = a.a.c(obj, StickerRanker$a.class);
          if (uoa == null) {
             uoa = new StickerRanker$a();
          }
          uoa.a = obj;
       }catch(java.lang.Exception e0){
          uoa = new StickerRanker$a();
       }
       return uoa;
    }
    public Object invoke(){
       return this.invoke();
    }
}
