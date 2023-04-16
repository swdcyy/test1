package com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayRecoInputInfo;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.Friend;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import nsd.u;
import java.lang.Boolean;
import la6.a;

public class RelayRecoInputInfo implements CursorResponse, Serializable	// class@000a7f
{
    public final List friendList;
    public final String pcursor;
    public ArrayList tmpList;
    public final List topicList;

    public void RelayRecoInputInfo(String p0,List p1,List p2){
       super();
       this.pcursor = p0;
       this.topicList = p1;
       this.friendList = p2;
    }
    public String getCursor(){
       return this.pcursor;
    }
    public final List getFriendList(){
       return this.friendList;
    }
    public List getItems(){
       ArrayList uArrayList;
       RelayRecoInputInfo obj = PatchProxy.apply(null, this, RelayRecoInputInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.tmpList;
       if (obj == null) {
          uArrayList = new ArrayList();
          RelayRecoInputInfo tfriendList = this.friendList;
          if (tfriendList != null) {
             Iterator iterator = tfriendList.iterator();
             while (iterator.hasNext()) {
                RelayDataItem relayDataIte = new RelayDataItem(1, null, iterator.next(), false, 8, null);
                uArrayList.add(v2);
             }
          }
          this.tmpList = uArrayList;
       }
       return uArrayList;
    }
    public final String getPcursor(){
       return this.pcursor;
    }
    public final List getTopicList(){
       return this.topicList;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, RelayRecoInputInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.pcursor);
    }
}
