package b71.c;
import b71.a;
import java.lang.Object;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomBarConfigResponse;
import java.util.Map;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarConfig;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Integer;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarItem;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import z61.b;

public class c implements a	// class@00031e
{

    public void c(){
       super();
    }
    public List a(LiveBottomBarConfigResponse p0,Map p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mBottomBarEntry;
       if (p0 == null) {
          return null;
       }
       obj = new ArrayList();
       List list = this.b(p1, p0.mLeftBottomBarListItems, false);
       if (!q.f(list)) {
          obj.addAll(list);
       }
       List list1 = this.b(p1, p0.mRightBottomBarListItems, true);
       if (!q.f(list1)) {
          obj.addAll(list1);
       }
       return obj;
    }
    public final List b(Map p0,List p1,boolean p2){
       ArrayList obj;
       Integer integer;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (!q.f(p1)) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             List list = iterator.next();
             if (PatchProxy.isSupport(c.class)) {
                integer = PatchProxy.applyThreeRefs(list, p0, Boolean.valueOf(p2), this, c.class, "3");
                if (integer != PatchProxyResult.class) {
                }else {
                label_0053 :
                   Iterator iterator1 = list.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         LiveBottomServerConfig$BottomBarItem uBottomBarIt = iterator1.next();
                         MutableLiveData mutableLiveD = p0.get(Integer.valueOf(uBottomBarIt.mBottomBarItemId));
                         if (mutableLiveD == null || (mutableLiveD.getValue() != null && mutableLiveD.getValue().mIsVisible.booleanValue())) {
                            mutableLiveD.getValue().mIsRightAlign = p2;
                            integer = Integer.valueOf(uBottomBarIt.mBottomBarItemId);
                         }
                      }else {
                         integer = null;
                      }
                   }
                }
             }else {
                goto label_0053 ;
             }
             if (integer != null) {
                obj.add(integer);
             }else {
                continue ;
             }
          }
       }
       return obj;
    }
}
