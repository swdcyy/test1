package com.kuaishou.live.core.show.chat.model.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.chat.model.LiveChatFollowTipConfig;
import com.kuaishou.live.core.show.chat.model.LiveChatFollowTipConfig$TypeAdapter;
import com.kuaishou.live.core.show.chat.model.LiveChatBetweenAnchorsConfig;
import com.kuaishou.live.core.show.chat.model.LiveChatBetweenAnchorsConfig$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivelibrarieslivemodel implements j	// class@000a20
{

    public void StagFactoryksfeaturesftlivelivelibrarieslivemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivelibrarieslivemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == LiveChatFollowTipConfig.class) {
          return new LiveChatFollowTipConfig$TypeAdapter(p0);
       }
       if (rawType == LiveChatBetweenAnchorsConfig.class) {
          return new LiveChatBetweenAnchorsConfig$TypeAdapter(p0);
       }
       return null;
    }
}
