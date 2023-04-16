package com.yxcorp.gifshow.pendant.kmessage.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.pendant.kmessage.Message$BubbleConfig;
import com.yxcorp.gifshow.pendant.kmessage.Message$BubbleConfig$TypeAdapter;
import com.yxcorp.gifshow.pendant.kmessage.Message$PendantConfig;
import com.yxcorp.gifshow.pendant.kmessage.Message$PendantConfig$TypeAdapter;
import com.yxcorp.gifshow.pendant.kmessage.Message;
import com.yxcorp.gifshow.pendant.kmessage.Message$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@00126d
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == Message$BubbleConfig.class) {
          return new Message$BubbleConfig$TypeAdapter(p0);
       }
       if (rawType == Message$PendantConfig.class) {
          return new Message$PendantConfig$TypeAdapter(p0);
       }
       if (rawType == Message.class) {
          return new Message$TypeAdapter(p0);
       }
       return null;
    }
}
