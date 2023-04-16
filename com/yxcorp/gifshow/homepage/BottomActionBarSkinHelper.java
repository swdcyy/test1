package com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper;
import com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper$enableBottomActionBarSkin$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import wh5.c;
import wq6.h;
import tn5.a;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.homepage.BottomActionBarSkinHelper$a;
import ok.h;
import sb5.e;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.opt.BottomActionBarSkinConfig;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;

public final class BottomActionBarSkinHelper	// class@001696
{
    public static final p a;
    public static final BottomActionBarSkinHelper b;

    static {
       BottomActionBarSkinHelper.b = new BottomActionBarSkinHelper();
       BottomActionBarSkinHelper.a = s.c(BottomActionBarSkinHelper$enableBottomActionBarSkin$2.INSTANCE);
    }
    public void BottomActionBarSkinHelper(){
       super();
    }
    public final boolean a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       BottomActionBarSkinHelper uBottomActio = BottomActionBarSkinHelper.class;
       Object obj = PatchProxy.apply(null, this, uBottomActio, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Boolean uBoolean = PatchProxy.apply(null, this, uBottomActio, "1");
       if (uBoolean == patchProxyRe) {
          uBoolean = BottomActionBarSkinHelper.a.getValue();
       }
       boolean b = (uBoolean.booleanValue() && !c.b())? true: false;
       return b;
    }
    public final a b(h p0,int p1){
       Object obj;
       BottomActionBarSkinHelper uBottomActio = BottomActionBarSkinHelper.class;
       if (PatchProxy.isSupport(uBottomActio)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uBottomActio, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "tab");
       obj = null;
       BottomActionBarSkinConfig uBottomActio1 = e.c(BottomActionBarSkinHelper$a.b, obj);
       if (uBottomActio1 != null) {
          BottomActionBarSkinConfig tabConfigNam = uBottomActio1.tabConfigNames;
          List list = uBottomActio1.a();
          if (tabConfigNam != null && (list != null && (p1 >= 0 && p1 < tabConfigNam.size()))) {
             Iterator iterator = list.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   if (a.g(obj1.c(), tabConfigNam.get(p1))) {
                      obj = obj1;
                   }
                }
                break ;
             }
          }
       }
       return obj;
    }
}
