package bdc.k;
import bdc.c;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import qvb.i;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import bdc.a;
import bdc.b;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.util.Collections;
import qrd.l1;
import la6.b;

public final class k extends c	// class@00045c
{

    public void k(){
       super(2, "friend_tab_cache_2", 0, true, false, 20, null);
    }
    public void e(){
       FriendSlidePlayFeedResponse obj;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "1")) {
          return;
       }
       super.e();
       c ta = this.a;
       if (ta != null) {
          List items = ta.getItems();
          if (items != null) {
             Iterator iterator = items.iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                Object obj1 = obj;
                obj1 = (obj1 != null && (obj1.getUser() != null && a.b(obj1)))? 1: null;
                if (obj1) {
                   objArray = obj;
                   break ;
                }
             }
             if (objArray != null) {
                obj = new FriendSlidePlayFeedResponse();
                obj.mPhotos = Collections.singletonList(objArray);
                this.h().k(obj, FriendSlidePlayFeedResponse.class);
             }
          }
       }
       return;
    }
}
