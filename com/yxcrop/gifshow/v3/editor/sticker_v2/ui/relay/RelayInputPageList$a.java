package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList$a;
import erd.o;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList;
import java.lang.String;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayRecoInputInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.Friend;
import nsd.u;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;

public final class RelayInputPageList$a implements o	// class@000ac8
{
    public final RelayInputPageList b;
    public final String c;

    public void RelayInputPageList$a(RelayInputPageList p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       RelayDataItem relayDataIte1;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, RelayInputPageList$a.class, "1");
       if (obj != PatchProxyResult.class) {
          p0 = obj;
       }else {
          a.p(p0, "result");
          this.b.h2().addAll(p0.getItems());
          if (TextUtils.x(this.c) && this.b.t != null) {
             obj = new ArrayList(p0.getItems());
             p0.getItems().clear();
             int i = 8;
             if (obj.size() > i) {
                List list = obj.subList(0, i);
                a.o(list, "items.subList\(0, PAGE_SIZE\)");
                p0.getItems().addAll(list);
             }else {
                p0.getItems().addAll(obj);
             }
             List topicList = p0.getTopicList();
             topicList = (topicList == null || topicList.isEmpty())? 1: null;
             if (!topicList) {
                RelayDataItem relayDataIte = new RelayDataItem(0, p0.getTopicList(), null, false, 8, null);
                p0.getItems().add(0, v12);
             }
             if (obj.size() > i) {
                relayDataIte1 = new RelayDataItem(2, null, null, false, 8, null);
                p0.getItems().add(v10);
             }
          }
       label_00a8 :
          Iterator iterator = p0.getItems().iterator();
          while (iterator.hasNext()) {
             relayDataIte1 = iterator.next();
             relayDataIte1.setSelected(0);
             Iterator iterator1 = this.b.i2().iterator();
             String str = null;
             while (iterator1.hasNext()) {
                Object obj1 = iterator1.next();
                String id = obj1.getId();
                Friend friend = relayDataIte1.getFriend();
                if (friend != null) {
                   str = friend.getUserId();
                }
                if (a.g(id, str)) {
                   str = obj1;
                   break ;
                }
             }
             if (str != null) {
                relayDataIte1.setSelected(true);
             }
          }
       }
       return p0;
    }
}
