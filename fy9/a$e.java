package fy9.a$e;
import erd.r;
import fy9.a;
import java.lang.Object;
import xwa.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.IMPhotoReplyConfigInfo$IMPhotoReplyItem;

public final class a$e implements r	// class@002380
{
    public final a b;

    public void a$e(a p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       a obj = PatchProxy.applyOneRefs(p0, this, a$e.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "event");
          obj = this.b.s;
          int i = 0;
          if (obj != null) {
             IMPhotoReplyConfigInfo mReplyItems = obj.mReplyItems;
             if (mReplyItems != null) {
                Iterator iterator = mReplyItems.iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   Object obj2 = (!obj1.mMsgSeq - p0.a)? 1: null;
                   if (obj2) {
                      i = obj1;
                      break ;
                   }
                }
             }
          }
          if (i != null) {
             b = true;
          }else {
             b = false;
          }
       }
       return b;
    }
}
