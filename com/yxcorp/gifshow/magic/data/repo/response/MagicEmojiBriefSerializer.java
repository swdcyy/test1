package com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiBriefSerializer;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.magic.data.repo.response.MagicEmojiBriefResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.lang.Integer;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Long;

public class MagicEmojiBriefSerializer implements i	// class@00120c
{

    public void MagicEmojiBriefSerializer(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       JsonObject jsonObject = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicEmojiBriefSerializer.class, "2");
       if (jsonObject != PatchProxyResult.class) {
       }else {
          jsonObject = new JsonObject();
          jsonObject.G("userInfo", p2.a(p0.mUserInfo));
          JsonArray jsonArray = new JsonArray();
          p0 = p0.mMagicEmojis.iterator();
          while (p0.hasNext()) {
             MagicEmoji magicEmoji = p0.next();
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.c0("id", magicEmoji.mId);
             jsonObject1.a0("tabType", Integer.valueOf(magicEmoji.mTabType));
             jsonObject1.c0("name", magicEmoji.mName);
             if (!q.f(magicEmoji.mMagicFaces)) {
                JsonArray jsonArray1 = new JsonArray();
                Iterator iterator = magicEmoji.mMagicFaces.iterator();
                while (iterator.hasNext()) {
                   MagicEmoji$MagicFace magicFace = iterator.next();
                   JsonObject jsonObject2 = new JsonObject();
                   jsonObject2.c0("id", magicFace.mId);
                   jsonObject2.a0("checksum", Long.valueOf(magicFace.mChecksum));
                   jsonArray1.G(jsonObject2);
                }
                jsonObject1.G("magicFaces", jsonArray1);
             }
             jsonArray.G(jsonObject1);
          }
          jsonObject.G("data", jsonArray);
       }
       return jsonObject;
    }
}
