package com.kwai.social.startup.reminder.model.IMPhotoMsgQuickReplyConfig;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import nsd.u;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class IMPhotoMsgQuickReplyConfig implements Serializable	// class@0018cd
{
    public final boolean enable;
    public final List quickReplyButtonList;

    public void IMPhotoMsgQuickReplyConfig(boolean p0,List p1){
       super();
       this.enable = p0;
       this.quickReplyButtonList = p1;
    }
    public void IMPhotoMsgQuickReplyConfig(boolean p0,List p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = CollectionsKt__CollectionsKt.E();
       }
       super(p0, p1);
       return;
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final List getQuickReplyButtonList(){
       return this.quickReplyButtonList;
    }
}
