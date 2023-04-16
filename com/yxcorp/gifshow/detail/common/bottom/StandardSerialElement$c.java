package com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$c;
import erd.g;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import n8a.a;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.model.user.User$FollowStatus;

public final class StandardSerialElement$c implements g	// class@00139b
{
    public final StandardSerialElement b;

    public void StandardSerialElement$c(StandardSerialElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, StandardSerialElement$c.class, "1")) {
       }else {
          p0 = this.b.s0();
          if (p0 == null || p0.isMine() != true) {
             p0 = this.b.s0();
             if (p0 != null) {
                StandardSerialElement$c tb = this.b;
                p0 = p0.getUser();
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, StandardSerialElement.class, "12") && p0 != null) {
                   StandardSerialElement c = tb.C;
                   if (c != null) {
                      Object[] objArray = null;
                      Object[] objArray1 = PatchProxy.apply(objArray, c, a.class, "6");
                      if (objArray1 != PatchProxyResult.class) {
                      }else {
                         a = c.a;
                         if (a != null) {
                            objArray = a.getItems();
                         }
                         objArray1 = objArray;
                      }
                      if (objArray1 != null) {
                         Iterator iterator = objArray1.iterator();
                         while (iterator.hasNext()) {
                            User user = iterator.next().getUser();
                            if (user != null) {
                               user.setFollowStatus(p0.getFollowStatus());
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
