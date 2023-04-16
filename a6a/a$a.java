package a6a.a$a;
import java.lang.Object;
import nsd.u;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.ContactTargetItem;
import com.yxcorp.gifshow.detail.relation.select.model.LastestFriendGroup;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import e4d.a;

public final class a$a	// class@00003c
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "items");
       Iterator iterator = p0.iterator();
       while (true) {
          if (iterator.hasNext()) {
             ContactTargetItem uContactTarg = iterator.next();
             String str = null;
             if (uContactTarg instanceof LastestFriendGroup) {
                LastestFriendGroup mLastestCont = (uContactTarg != null)? uContactTarg.mLastestContacts: str;
                a.o(mLastestCont, "item?.mLastestContacts");
                Iterator iterator1 = mLastestCont.iterator();
                do {
                   if (iterator1.hasNext()) {
                      ContactTargetItem mUser = iterator1.next().mUser;
                      String id = (mUser != null)? mUser.getId(): str;
                      QCurrentUser qCurrentUser = QCurrentUser.me();
                      a.o(qCurrentUser, "QCurrentUser.me\(\)");
                      int i = a.g(id, qCurrentUser.getId()) ^ 1;
                      if (i) {
                         break ;
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                } while (i);
                a.a(1);
                return;
             }else {
                uContactTarg = uContactTarg.mUser;
                if (uContactTarg != null) {
                   str = uContactTarg.getId();
                }
                QCurrentUser qCurrentUser1 = QCurrentUser.me();
                a.o(qCurrentUser1, "QCurrentUser.me\(\)");
                int i1 = a.g(str, qCurrentUser1.getId()) ^ 1;
                if (i1) {
                   a.a(1);
                   return;
                }
             }
          }else {
             a.a(false);
             return;
          }
       }
    }
}
