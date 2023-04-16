package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import java.io.Serializable;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.Friend;
import java.lang.Object;
import nsd.u;

public final class RelayDataItem implements Serializable	// class@000a7e
{
    public final Friend friend;
    public boolean isSelected;
    public final List topicList;
    public final int type;

    public void RelayDataItem(int p0,List p1,Friend p2,boolean p3){
       super();
       this.type = p0;
       this.topicList = p1;
       this.friend = p2;
       this.isSelected = p3;
    }
    public void RelayDataItem(int p0,List p1,Friend p2,boolean p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final Friend getFriend(){
       return this.friend;
    }
    public final List getTopicList(){
       return this.topicList;
    }
    public final int getType(){
       return this.type;
    }
    public final boolean isSelected(){
       return this.isSelected;
    }
    public final void setSelected(boolean p0){
       this.isSelected = p0;
    }
}
