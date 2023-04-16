package cta.b;
import cta.b$a;
import nsd.u;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import zr6.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.kwai.kcube.TabIdentifier;
import cta.b$b;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Strategy;
import cta.i;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dr6.h;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Condition;
import cta.h;
import er6.d;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Tab;
import er6.h;
import er6.g;
import er6.c;
import er6.b;
import er6.f;
import er6.e;
import dr6.j;
import java.util.List;
import dr6.b;
import dr6.g;
import dr6.f;
import dr6.c;
import dr6.d;
import dr6.e;
import dr6.i;
import java.util.Collection;
import java.lang.Boolean;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import java.lang.IllegalStateException;

public final class b	// class@0023b1
{
    public boolean a;
    public final List b;
    public final TabIdentifier c;
    public final List d;
    public final b$b e;
    public final DynamicTabConfig f;
    public final g g;
    public static final b$a h;

    static {
       b.h = new b$a(null);
    }
    public void b(DynamicTabConfig p0,g p1){
       i a;
       h oh;
       int i;
       ArrayList uArrayList4;
       DynamicTabConfig$Tab mType3;
       TabIdentifier tabIdentifie2;
       TabIdentifier tabIdentifie3;
       b uob = this;
       DynamicTabConfig obj = p0;
       ArrayList obj1 = p1;
       a.p(obj, "dynamicTabConfig");
       a.p(obj1, "tabParamBuilder");
       super();
       uob.f = obj;
       uob.g = obj1;
       uob.b = new ArrayList();
       DynamicTabConfig mType = obj.mType;
       a.o(mType, "dynamicTabConfig.mType");
       uob.c = new TabIdentifier(mType, obj.mId);
       obj1 = new ArrayList();
       uob.d = obj1;
       uob.e = new b$b();
       obj = obj.mStrategies;
       if (obj != null) {
          ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             DynamicTabConfig$Strategy strategy = iterator.next();
             a = i.a;
             b f = uob.f;
             b c = uob.c;
             a.o(strategy, "s");
             b g = uob.g;
             Objects.requireNonNull(a);
             b uob1 = c;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             b uob2 = g;
             Iterator iterator1 = iterator;
             b uob3 = g;
             ArrayList uArrayList1 = obj1;
             b uob4 = c;
             j oj = PatchProxy.applyFourRefs(f, uob1, strategy, uob2, a, i.class, "1");
             if (oj != patchProxyRe) {
             }else {
                a.p(f, "dynamicTabConfig");
                a.p(uob4, "dynamicTabId");
                a.p(strategy, "strategy");
                a.p(uob3, "tabParamBuilder");
                DynamicTabConfig$Strategy mConditions = strategy.mConditions;
                if (mConditions != null) {
                   ArrayList uArrayList2 = new ArrayList(u.Y(mConditions, 10));
                   Iterator iterator2 = mConditions.iterator();
                   while (iterator2.hasNext()) {
                      DynamicTabConfig$Condition uCondition = iterator2.next();
                      h a1 = h.a;
                      a.o(uCondition, "it");
                      Objects.requireNonNull(a1);
                      g og = PatchProxy.applyTwoRefs(uCondition, uob3, a1, h.class, "1");
                      if (og != patchProxyRe) {
                      }else {
                         a.p(uCondition, "condition");
                         a.p(uob3, "tabParamBuilder");
                         DynamicTabConfig$Tab mType1 = uCondition.mExecutor.mType;
                         a.o(mType1, "condition.mExecutor.mType");
                         TabIdentifier tabIdentifie = new TabIdentifier(mType1, uCondition.mExecutor.mId);
                         DynamicTabConfig$Tab mType2 = uCondition.mBeExecuted.mType;
                         a.o(mType2, "condition.mBeExecuted.mType");
                         TabIdentifier tabIdentifie1 = new TabIdentifier(mType2, uCondition.mBeExecuted.mId);
                         DynamicTabConfig$Condition mCondition = uCondition.mCondition;
                         if (mCondition != 1) {
                            if (mCondition != 2) {
                               if (mCondition != 3) {
                                  if (mCondition != 4) {
                                     if (mCondition != 5) {
                                        oh = new h(uob3, tabIdentifie, tabIdentifie1);
                                     }else {
                                        og = new g(uob3, tabIdentifie, tabIdentifie1, uCondition.mIndex);
                                     }
                                  }else {
                                     oh = new c(uob3, tabIdentifie, tabIdentifie1);
                                  }
                               }else {
                                  oh = new b(uob3, tabIdentifie, tabIdentifie1);
                               }
                            }else {
                               oh = new f(uob3, tabIdentifie, tabIdentifie1);
                            }
                         }else {
                            oh = new e(uob3, tabIdentifie, tabIdentifie1);
                         }
                         og = oh;
                      }
                      uArrayList2.add(og);
                      String str = 10;
                   }
                   ArrayList uArrayList3 = new ArrayList();
                   iterator2 = uArrayList2.iterator();
                   while (iterator2.hasNext()) {
                      Object obj2 = iterator2.next();
                      i = obj2 instanceof h ^ 1;
                      if (i) {
                         uArrayList3.add(obj2);
                      }
                   }
                   uArrayList4 = uArrayList3;
                }else {
                   uArrayList4 = null;
                }
                DynamicTabConfig$Strategy mContainer = strategy.mContainer;
                String str1 = "it.mType";
                if (mContainer != null) {
                   mType3 = mContainer.mType;
                   a.o(mType3, str1);
                   tabIdentifie2 = new TabIdentifier(mType3, mContainer.mId);
                }else {
                   tabIdentifie2 = null;
                }
                mContainer = strategy.mTarget;
                if (mContainer != null) {
                   mType3 = mContainer.mType;
                   a.o(mType3, str1);
                   tabIdentifie3 = new TabIdentifier(mType3, mContainer.mId);
                }else {
                   tabIdentifie3 = null;
                }
                switch (strategy.mStrategy){
                    case 1:
                      e uoe = new e(uob3, uob4, tabIdentifie2, uArrayList4, f, strategy.mIndex);
                      break;
                    case 2:
                      d uod = new d(uob3, uob4, tabIdentifie2, uArrayList4, f, tabIdentifie3);
                      break;
                    case 3:
                      c uoc = new c(uob3, uob4, tabIdentifie2, uArrayList4, f, tabIdentifie3);
                      break;
                    case 4:
                      f uof = new f(uob3, uob4, tabIdentifie2, uArrayList4, f, strategy.mIndex);
                      break;
                    case 5:
                      g og1 = new g(uob3, uob4, tabIdentifie2, uArrayList4, f, tabIdentifie3);
                      break;
                    case 6:
                      g = new b(uob3, uob4, tabIdentifie2, uArrayList4, f);
                      break;
                    default:
                      j oj1 = new j(uob3, uob4, tabIdentifie2, uArrayList4, f);
                }
                oj = mContainer;
             }
             oj.a(uob.e);
             uArrayList.add(oj);
             iterator = iterator1;
             obj1 = uArrayList1;
             patchProxyRe = 10;
          }
          obj1.addAll(uArrayList);
       }
       return;
    }
    public final boolean a(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a != null) {
          throw new IllegalStateException("alreadyExecute "+this.f);
       }
       b = true;
       this.a = b;
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("DynamicTab", "start execute "+this.f.logInfo(), objArray);
       Iterator iterator = this.d.iterator();
       while (true) {
          if (iterator.hasNext()) {
             h oh = iterator.next();
             if (oh.execute()) {
                this.b.addAll(oh.b());
                break ;
             }
          }else {
             b = false;
             break ;
          }
       }
       Object[] objArray1 = new Object[i];
       b.C().w("DynamicTab", "finish execute success: "+b, objArray1);
       return b;
    }
    public final DynamicTabConfig b(){
       return this.f;
    }
}
