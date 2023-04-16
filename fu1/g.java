package fu1.g;
import eu1.b;
import eu1.c;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import hu1.a;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import cu1.d;
import ut1.f;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import ut1.k;
import ut1.l;
import com.kwai.framework.model.user.UserInfo;
import android.graphics.Rect;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import java.lang.CharSequence;
import android.text.TextUtils;
import eu1.d;
import java.lang.Float;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.StringBuilder;
import lnc.a1;
import fu1.f;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;

public class g extends b	// class@0023b6
{

    public void g(){
       super();
    }
    public List b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "liveMultiPkUIInfo");
       b.Z(LiveCommonLogTag.MULTI_PK, "team parseGlobalRenderInfo show progressbar and countdown");
       return new ArrayList();
    }
    public List c(c p0){
       int this;
       int i1;
       Object obj = this;
       Object obj1 = p0;
       a obj2 = PatchProxy.applyOneRefs(obj1, obj, g.class, "6");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "liveMultiPkUIInfo");
       ArrayList uArrayList = new ArrayList();
       obj2 = this.a(p0);
       if (obj2 != null) {
          uArrayList.add(obj2);
       }
       LiveMultiPkViewStyle liveMultiPkV = d.l(p0);
       Iterator iterator = p0.b().l().values().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().f().values().iterator();
          while (iterator1.hasNext()) {
             Object obj3 = iterator1.next();
             UserInfo mId = obj3.c().mId;
             Object obj4 = p0.e().get(mId);
             if (obj4 != null) {
                a.o(mId, "userId");
                Object obj5 = obj4;
                Rect obj6 = PatchProxy.applyThreeRefs(liveMultiPkV, p0, mId, this, g.class, "7");
                if (obj6 != PatchProxyResult.class) {
                }else if(liveMultiPkV == LiveMultiPkViewStyle.SIMPLE){
                   obj6 = PatchProxy.applyTwoRefs(obj1, mId, obj, g.class, "8");
                   if (obj6 != PatchProxyResult.class) {
                   }else if(TextUtils.equals(mId, p0.a())){
                      obj6 = LiveMultiPkLayoutViewType.MULTI_PK_SELF_SIMPLE_CELL;
                   }else {
                      obj6 = LiveMultiPkLayoutViewType.MULTI_PK_OTHER_SIMPLE_CELL;
                   }
                }else if(TextUtils.equals(mId, p0.a())){
                   obj6 = LiveMultiPkLayoutViewType.MULTI_PK_SELF_CELL;
                }else {
                   obj6 = LiveMultiPkLayoutViewType.MULTI_PK_OTHER_CELL;
                }
                Object obj7 = obj6;
                obj2 = PatchProxy.applyThreeRefs(obj5, obj3, obj7, this, g.class, "9");
                if (obj2 != PatchProxyResult.class) {
                }else {
                   obj6 = obj5;
                   UserInfo userInfo = (obj6.top == null)? 1: null;
                   int i = d.e();
                   this = obj6.height();
                   if (userInfo) {
                      this = this - i;
                   }
                   d uod = new d(obj6.width(), this, null);
                   uod.leftMargin = obj6.left;
                   obj6 = obj6.top;
                   if (userInfo) {
                      i1 = obj6 + i;
                   }
                   uod.topMargin = i1;
                   userInfo = obj3.c().mId;
                   a.o(userInfo, "memberInfo.user.mId");
                   obj2 = new a(uod, obj7, userInfo);
                }
                uArrayList.add(obj2);
             }else {
                b.B(LiveCommonLogTag.MULTI_PK, "team parseParticipantRenderInfo failed userRect is null"+mId);
             }
             obj = this;
          }
          obj = this;
       }
       return uArrayList;
    }
    public List d(c p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "liveMultiPkUIInfo");
       obj = new ArrayList();
       Iterator iterator = p0.b().l().values().iterator();
       while (iterator.hasNext()) {
          k ok = iterator.next();
          String str = ok.e();
          Rect rect = p0.d().get(str);
          if (rect != null) {
             a uoa = PatchProxy.applyTwoRefs(rect, ok, this, g.class, "3");
             if (uoa != PatchProxyResult.class) {
             }else {
                d uod = new d(rect.width(), rect.height(), Float.valueOf((float)a1.d(0x7f07025d)));
                uod.leftMargin = rect.left;
                uod.topMargin = rect.top;
                uoa = new a(uod, LiveMultiPkLayoutViewType.MULTI_PK_TEAM_FRAME, ok.e());
             }
             obj.add(uoa);
          }else {
             b.B(LiveCommonLogTag.MULTI_PK, "solo parseTeamRenderInfo failed teamRect or color"+str);
          }
          if (!ok.d()) {
             obj.addAll(this.e(ok, p0));
          }else {
             b.Z(LiveCommonLogTag.MULTI_PK, "parseTeamRenderInfo fuzzy"+str);
          }
       }
       return obj;
    }
    public List e(k p0,c p1){
       LiveMultiPkLayoutViewType mULTI_PK_SCO;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "teamInfo");
       a.p(p1, "liveMultiPkUIInfo");
       obj = new ArrayList();
       LiveMultiPkViewStyle liveMultiPkV = d.l(p1);
       Iterator iterator = p0.f().values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return obj;
          }
          Object obj1 = iterator.next();
          UserInfo mId = obj1.c().mId;
          Object obj2 = p1.e().get(mId);
          if (obj2 != null) {
             a obj3 = (p0.f().size() > 1)? 1: null;
             if (obj3) {
                obj3 = PatchProxy.applyThreeRefs(obj2, obj1, liveMultiPkV, this, g.class, "5");
                if (obj3 != PatchProxyResult.class) {
                }else {
                   int i = a1.d(R.dimen.arg_RES_7f070857);
                   d uod = new d(-2, i, null);
                   uod.leftMargin = obj2.left;
                   int i1 = obj2.bottom - i;
                   uod.topMargin = i1;
                   i = f.a[liveMultiPkV.ordinal()];
                   if (i != 1) {
                      if (i == 2) {
                         mULTI_PK_SCO = LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT;
                      }else {
                         break ;
                      }
                   }else {
                      mULTI_PK_SCO = LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT_SIMPLE;
                   }
                   UserInfo mId1 = obj1.c().mId;
                   a.o(mId1, "memberInfo.user.mId");
                   obj3 = new a(uod, mULTI_PK_SCO, mId1);
                }
                obj.add(obj3);
             }
          }else {
             b.B(LiveCommonLogTag.MULTI_PK, "team parseTeamScoreInfo failed userRect is null"+mId);
          }
       }
       throw new NoWhenBranchMatchedException();
    }
}
