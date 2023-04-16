package com.kuaishou.merchant.transaction.detail.self.model.MerchantDetailJumpDataDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.MerchantDetailJumpData;
import com.google.gson.JsonObject;
import fg6.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.JumpToH5Data;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.JumpToWxMiniProData;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.JumpToAppData;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.UnSupportJumpData;
import java.lang.Throwable;

public class MerchantDetailJumpDataDeserializer implements b	// class@00091c
{

    public void MerchantDetailJumpDataDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       try{
          p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantDetailJumpDataDeserializer.class, "2");
          if (p1 != PatchProxyResult.class) {
          }else {
             int i = p0.r().e0("type").p();
             if (i) {
                if (i != 1) {
                   if (i != 2) {
                      if (i == 3) {
                         i = a.b.c(p0, JumpToH5Data.class);
                      }else {
                         throw new JsonParseException("unknown jump type "+i);
                      }
                   }else {
                      i = a.b.c(p0, JumpToWxMiniProData.class);
                   }
                }else {
                   i = a.b.c(p0, JumpToAppData.class);
                }
             }else {
                i = a.b.c(p0, UnSupportJumpData.class);
             }
          }
          return p1;
       }catch(java.lang.IllegalStateException e7){
          throw new JsonParseException(e7);
       }
    }
}
