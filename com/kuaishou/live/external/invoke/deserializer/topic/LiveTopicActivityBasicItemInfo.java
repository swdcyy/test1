package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;
import mkd.a;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ka6.b;

public class LiveTopicActivityBasicItemInfo extends SyncableProvider implements a	// class@0008c4
{
    public int mActivityType;
    public boolean mHasShown;
    public String mTopicActivityId;
    public String mTopicActivityJumpUrl;
    public static final long serialVersionUID = 0x4c2f59cd025a082f;

    public void LiveTopicActivityBasicItemInfo(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveTopicActivityBasicItemInfo.class, "1")) {
          return;
       }
       b.b().c(this, LiveTopicActivityBasicItemInfo.class);
       return;
    }
}
