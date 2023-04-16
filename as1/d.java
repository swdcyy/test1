package as1.d;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.multiline.renderpart.puzzle.model.LiveMultiLinePuzzleState;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.SCLivePuzzleStatistics;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleUserInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Long;
import java.util.List;
import java.util.Collection;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import d61.v;
import java.lang.Number;
import com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatStartInfo;
import java.util.Map;
import java.lang.Integer;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d	// class@00029a
{
    public SCLivePuzzleStatistics a;
    public LivePuzzleLineChatStartInfo b;
    public ArrayList c;
    public LiveMultiLinePuzzleState d;

    public void d(){
       super();
       this.c = new ArrayList();
       this.d = LiveMultiLinePuzzleState.IDLE;
    }
    public final String a(){
       object oobject;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          return objArray;
       }
       SCLivePuzzleStatistics puzzleUser = obj.puzzleUser;
       a.o(puzzleUser, "it.puzzleUser");
       int len = puzzleUser.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = puzzleUser[i];
             LivePuzzleUserInfo livePuzzleUs = (oobject.roleType == 2)? 1: null;
             if (livePuzzleUs) {
             label_0031 :
                if (oobject != null) {
                   LivePuzzleUserInfo player = oobject.player;
                   if (player != null) {
                      objArray = Long.valueOf(player.userId);
                      break ;
                   }
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             oobject = objArray;
             goto label_0031 ;
          }
       }
       return String.valueOf(objArray);
    }
    public final List b(){
       ArrayList uArrayList;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          SCLivePuzzleStatistics puzzleUser = obj.puzzleUser;
          if (puzzleUser != null) {
             uArrayList = new ArrayList();
             int len = puzzleUser.length;
             int i = 0;
             while (i < len) {
                object oobject = puzzleUser[i];
                LivePuzzleUserInfo livePuzzleUs = (oobject.roleType == 2)? 1: null;
                if (livePuzzleUs) {
                   uArrayList.add(oobject);
                }
                i = i + 1;
             }
             ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                uArrayList1.add(String.valueOf(iterator.next().player.userId));
             }
             uArrayList = uArrayList1;
          }
       }
       return uArrayList;
    }
    public final LivePuzzleUserInfo c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       long l = v.f(p0, 0);
       d ta = this.a;
       LivePuzzleUserInfo livePuzzleUs = null;
       if (ta != null) {
          SCLivePuzzleStatistics puzzleUser = ta.puzzleUser;
          if (puzzleUser != null) {
             int len = puzzleUser.length;
             int i = 0;
             while (i < len) {
                object oobject = puzzleUser[i];
                LivePuzzleUserInfo livePuzzleUs1 = (!oobject.player.userId - l)? 1: null;
                if (livePuzzleUs1) {
                   livePuzzleUs = oobject;
                   break ;
                }
                i = i + 1;
             }
          }
       }
       return livePuzzleUs;
    }
    public final int d(String p0){
       object oobject;
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "userId");
       long l = v.f(p0, 0);
       d ta = this.a;
       LivePuzzleUserInfo livePuzzleUs = null;
       if (ta != null) {
          SCLivePuzzleStatistics puzzleUser = ta.puzzleUser;
          a.o(puzzleUser, "it.puzzleUser");
          int len = puzzleUser.length;
          int i = 0;
          while (true) {
             if (i < len) {
                oobject = puzzleUser[i];
                LivePuzzleUserInfo livePuzzleUs1 = (!oobject.player.userId - l)? 1: null;
                if (livePuzzleUs1) {
                label_0042 :
                   if (oobject != null) {
                      livePuzzleUs = oobject.roleType;
                      break ;
                   }
                   break ;
                }else {
                   i = i + 1;
                }
             }else {
                oobject = null;
                goto label_0042 ;
             }
          }
          return livePuzzleUs;
       }else {
          ta = this.b;
          if (ta != null) {
             LivePuzzleLineChatStartInfo userRoleInfo = ta.userRoleInfo;
             if (userRoleInfo != null) {
                Integer integer = userRoleInfo.get(Long.valueOf(l));
                if (integer != null) {
                   livePuzzleUs = integer.intValue();
                }
             }
          }
          return livePuzzleUs;
       }
    }
    public final UserInfo e(String p0){
       UserInfo userInfo;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       obj = this.c.iterator();
       do {
          if (obj.hasNext()) {
          }else {
             userInfo = null;
             break ;
          }
          userInfo = obj.next();
       } while (TextUtils.n(userInfo.mId, p0));
       return userInfo;
    }
    public final List f(){
       return this.c;
    }
    public final void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       if (p0 != null) {
          this.c.clear();
          this.c.addAll(p0);
       }
       return;
    }
}
