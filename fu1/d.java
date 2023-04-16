package fu1.d;
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
import eu1.d;
import java.lang.Float;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import lnc.a1;
import java.lang.Integer;
import fu1.c;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;

public class d extends b	// class@0023b3
{

    public void d(){
       super();
    }
    public List b(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "liveMultiPkUIInfo");
       b.Z(LiveCommonLogTag.MULTI_PK, "solo parseGlobalRenderInfo show countdown");
       return new ArrayList();
    }
    public List c(c p0){
       Iterator obj5;
       Iterator iterator2;
       UserInfo this;
       Object obj = this;
       String obj1 = p0;
       a obj2 = PatchProxy.applyOneRefs(obj1, obj, d.class, "8");
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
             d obj4 = p0.e().get(mId);
             if (obj4 != null) {
                String str = p0.a();
                String str1 = str;
                String str2 = str;
                obj5 = obj4;
                obj2 = PatchProxy.applyFourRefs(liveMultiPkV, obj4, obj3, str1, this, d.class, "9");
                if (obj2 != PatchProxyResult.class) {
                   iterator2 = iterator;
                   obj5 = iterator1;
                }else {
                   obj4 = new d(obj5.width(), obj5.height(), null);
                   UserInfo obj6 = obj5;
                   obj4.leftMargin = obj6.left;
                   obj4.topMargin = obj6.top;
                   this = obj3.c().mId;
                   a.o(this, "memberInfo.user.mId");
                   obj6 = this;
                   obj1 = "memberInfo.user.mId";
                   iterator2 = iterator;
                   UserInfo userInfo = this;
                   obj5 = iterator1;
                   a uoa = str;
                   Object obj7 = PatchProxy.applyThreeRefs(liveMultiPkV, obj6, str2, this, d.class, "10");
                   if (obj7 != PatchProxyResult.class) {
                   }else if(liveMultiPkV == LiveMultiPkViewStyle.SIMPLE){
                      String str3 = str2;
                      obj7 = PatchProxy.applyTwoRefs(userInfo, str3, obj, d.class, "11");
                      if (obj7 != PatchProxyResult.class) {
                      }else if(TextUtils.equals(userInfo, str3)){
                         obj7 = LiveMultiPkLayoutViewType.MULTI_PK_SELF_SIMPLE_CELL;
                      }else {
                         obj7 = LiveMultiPkLayoutViewType.MULTI_PK_OTHER_SIMPLE_CELL;
                      }
                   }else if(TextUtils.equals(userInfo, str2)){
                      obj7 = LiveMultiPkLayoutViewType.MULTI_PK_SELF_CELL;
                   }else {
                      obj7 = LiveMultiPkLayoutViewType.MULTI_PK_OTHER_CELL;
                   }
                   obj6 = obj3.c().mId;
                   a.o(obj6, obj1);
                   obj2 = new a(obj4, obj7, obj6);
                }
                uArrayList.add(obj2);
             }else {
                iterator2 = iterator;
                obj5 = iterator1;
                b.B(LiveCommonLogTag.MULTI_PK, "solo parseParticipantRenderInfo failed userRect is null"+mId);
             }
             iterator1 = obj5;
             iterator = iterator2;
          }
          int i = p0;
       }
       return uArrayList;
    }
    public List d(c p0){
       LiveMultiPkLayoutViewType liveMultiPkL;
       d uod;
       Object obj = this;
       Object obj1 = p0;
       k obj2 = PatchProxy.applyOneRefs(obj1, obj, d.class, "2");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       a.p(obj1, "liveMultiPkUIInfo");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.b().l().values().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return uArrayList;
          }
          obj2 = iterator.next();
          ArrayList obj3 = PatchProxy.applyTwoRefs(obj2, obj1, obj, d.class, "3");
          if (obj3 != PatchProxyResult.class) {
          }else {
             String str = obj2.e();
             Rect rect = p0.d().get(str);
             if (rect != null) {
                obj3 = PatchProxy.applyTwoRefs(rect, obj2, obj, d.class, "4");
                if (obj3 != PatchProxyResult.class) {
                }else {
                   uod = new d(rect.width(), rect.height(), Float.valueOf((float)a1.d(0x7f07025d)));
                   uod.leftMargin = rect.left;
                   uod.topMargin = rect.top;
                   obj3 = new a(uod, LiveMultiPkLayoutViewType.MULTI_PK_TEAM_FRAME, obj2.e());
                }
             }else {
                b.B(LiveCommonLogTag.MULTI_PK, "solo parseTeamRenderInfo failed teamRect"+str);
                obj3 = null;
             }
          }
          if (obj3 != null) {
             uArrayList.add(obj3);
          }
          obj3 = PatchProxy.applyTwoRefs(obj2, obj1, obj, d.class, "5");
          if (obj3 != PatchProxyResult.class) {
          }else {
             ArrayList uArrayList1 = new ArrayList();
             LiveMultiPkViewStyle liveMultiPkV = d.l(p0);
             int i = obj2.f().size();
             if (PatchProxy.isSupport(d.class)) {
                liveMultiPkL = PatchProxy.applyTwoRefs(liveMultiPkV, Integer.valueOf(i), obj, d.class, "6");
                if (liveMultiPkL != PatchProxyResult.class) {
                }else {
                label_00dd :
                   int i2 = c.a[liveMultiPkV.ordinal()];
                   d uod1 = 5;
                   if (i2 != 1) {
                      if (i2 == 2) {
                         liveMultiPkL = (i < uod1)? LiveMultiPkLayoutViewType.MULTI_PK_SCORE_WITH_RANK: LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT;
                      }else {
                         break ;
                      }
                   }else if(i < uod1){
                      liveMultiPkL = LiveMultiPkLayoutViewType.MULTI_PK_SCORE_WITH_RANK_SIMPLE;
                   }else {
                      liveMultiPkL = LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT_SIMPLE;
                   }
                }
             }else {
                goto label_00dd ;
             }
             Object obj4 = liveMultiPkL;
             Iterator iterator1 = obj2.f().values().iterator();
             while (iterator1.hasNext()) {
                Object obj5 = iterator1.next();
                UserInfo mId = obj5.c().mId;
                Object obj6 = p0.e().get(mId);
                if (obj6 != null) {
                   Object obj7 = obj6;
                   a uoa = PatchProxy.applyThreeRefs(obj6, obj5, obj4, this, d.class, "7");
                   if (uoa != PatchProxyResult.class) {
                   }else {
                      int i1 = a1.d(R.dimen.arg_RES_7f070857);
                      uod = new d(-2, i1, null);
                      UserInfo obj8 = obj7;
                      uod.leftMargin = obj8.left;
                      i = obj8.bottom - i1;
                      uod.topMargin = i;
                      obj8 = obj5.c().mId;
                      a.o(obj8, "memberInfo.user.mId");
                      uoa = new a(uod, obj4, obj8);
                   }
                   uArrayList1.add(uoa);
                }else {
                   b.B(LiveCommonLogTag.MULTI_PK, "solo parseTeamScoreInfo failed userRect is null"+mId);
                }
             }
             obj3 = uArrayList1;
          }
          uArrayList.addAll(obj3);
       }
       throw new NoWhenBranchMatchedException();
    }
}
