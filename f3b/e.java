package f3b.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import com.yxcorp.gifshow.log.model.CustomEventBlacklist;
import com.yxcorp.gifshow.log.model.CustomEventBlacklist$CustomEventRule;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;

public class e	// class@0015bf
{
    public static CustomEventBlacklist a;

    public void e(){
       super();
    }
    public static boolean a(int p0,String p1){
       CustomEventBlacklist obj;
       CustomEventBlacklist$CustomEventRule equalRules;
       Iterator iterator;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (e.a == null) {
          e.a = n.A1().x();
       }
       obj = e.a;
       if (obj != null) {
          if (!p0) {
             CustomEventBlacklist mCustomEvent = obj.mCustomEventRule;
             if (mCustomEvent != null) {
                equalRules = mCustomEvent.equalRules;
                if (equalRules != null && (!equalRules.isEmpty() && e.a.mCustomEventRule.equalRules.contains(p1))) {
                   return true;
                }else {
                   equalRules = e.a.mCustomEventRule.prefixRules;
                   if (equalRules != null && !equalRules.isEmpty()) {
                      iterator = e.a.mCustomEventRule.prefixRules.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            if (p1.startsWith(iterator.next())) {
                               return true;
                            }
                            continue ;
                         }
                      }
                   }
                   equalRules = e.a.mCustomEventRule.containsRules;
                   if (equalRules != null && !equalRules.isEmpty()) {
                      iterator = e.a.mCustomEventRule.containsRules.iterator();
                      while (iterator.hasNext()) {
                         if (p1.contains(iterator.next())) {
                            return true;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
          if (p0 == 1) {
             CustomEventBlacklist mCustomStatE = obj.mCustomStatEventRule;
             if (mCustomStatE != null) {
                equalRules = mCustomStatE.equalRules;
                if (equalRules != null && (!equalRules.isEmpty() && e.a.mCustomStatEventRule.equalRules.contains(p1))) {
                   return true;
                }else {
                   equalRules = e.a.mCustomStatEventRule.prefixRules;
                   if (equalRules != null && !equalRules.isEmpty()) {
                      iterator = e.a.mCustomStatEventRule.prefixRules.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            if (p1.startsWith(iterator.next())) {
                               return true;
                            }
                            continue ;
                         }
                      }
                   }
                   equalRules = e.a.mCustomStatEventRule.containsRules;
                   if (equalRules != null && !equalRules.isEmpty()) {
                      iterator = e.a.mCustomStatEventRule.containsRules.iterator();
                      while (iterator.hasNext()) {
                         if (p1.contains(iterator.next())) {
                            return true;
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       return false;
    }
}
