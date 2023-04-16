package com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$KWAI_LIGHT$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$KWAI_LIGHT_NO_SKIN$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$KWAI_DARK$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$KWAI_DARK_TRANS$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$KWAI_BLACK$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$NEBULA_LIGHT$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$NEBULA_LIGHT_NO_SKIN$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$NEBULA_SOLID_LIGHT$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$NEBULA_DARK$2;
import com.kwai.feature.api.feed.home.kcubehome.bottom.common.state.BottomBarSchemeOpt$NEBULA_DARK_TRANS$2;
import java.lang.Object;
import sn5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import zf6.j;

public final class BottomBarSchemeOpt	// class@000f09
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final BottomBarSchemeOpt k;

    static {
       BottomBarSchemeOpt.k = new BottomBarSchemeOpt();
       BottomBarSchemeOpt.a = s.c(BottomBarSchemeOpt$KWAI_LIGHT$2.INSTANCE);
       BottomBarSchemeOpt.b = s.c(BottomBarSchemeOpt$KWAI_LIGHT_NO_SKIN$2.INSTANCE);
       BottomBarSchemeOpt.c = s.c(BottomBarSchemeOpt$KWAI_DARK$2.INSTANCE);
       BottomBarSchemeOpt.d = s.c(BottomBarSchemeOpt$KWAI_DARK_TRANS$2.INSTANCE);
       BottomBarSchemeOpt.e = s.c(BottomBarSchemeOpt$KWAI_BLACK$2.INSTANCE);
       BottomBarSchemeOpt.f = s.c(BottomBarSchemeOpt$NEBULA_LIGHT$2.INSTANCE);
       BottomBarSchemeOpt.g = s.c(BottomBarSchemeOpt$NEBULA_LIGHT_NO_SKIN$2.INSTANCE);
       BottomBarSchemeOpt.h = s.c(BottomBarSchemeOpt$NEBULA_SOLID_LIGHT$2.INSTANCE);
       BottomBarSchemeOpt.i = s.c(BottomBarSchemeOpt$NEBULA_DARK$2.INSTANCE);
       BottomBarSchemeOpt.j = s.c(BottomBarSchemeOpt$NEBULA_DARK_TRANS$2.INSTANCE);
    }
    public void BottomBarSchemeOpt(){
       super();
    }
    public static final a a(){
       Object obj = PatchProxy.apply(null, null, BottomBarSchemeOpt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BottomBarSchemeOpt.e.getValue();
    }
    public static final a b(){
       Object obj = PatchProxy.apply(null, null, BottomBarSchemeOpt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BottomBarSchemeOpt.c.getValue();
    }
    public static final a c(){
       Object obj = PatchProxy.apply(null, null, BottomBarSchemeOpt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BottomBarSchemeOpt.d.getValue();
    }
    public static final a d(){
       Object obj = PatchProxy.apply(null, null, BottomBarSchemeOpt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BottomBarSchemeOpt.a.getValue();
    }
    public static final a e(){
       Object obj = PatchProxy.apply(null, null, BottomBarSchemeOpt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BottomBarSchemeOpt.b.getValue();
    }
    public static final a f(){
       Object obj = PatchProxy.apply(null, null, BottomBarSchemeOpt.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return BottomBarSchemeOpt.i.getValue();
    }
    public final int g(int p0){
       BottomBarSchemeOpt uBottomBarSc = BottomBarSchemeOpt.class;
       if (PatchProxy.isSupport(uBottomBarSc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBottomBarSc, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return j.a(p0, 2);
    }
    public final int h(int p0){
       BottomBarSchemeOpt uBottomBarSc = BottomBarSchemeOpt.class;
       if (PatchProxy.isSupport(uBottomBarSc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBottomBarSc, "11");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return j.a(p0, 1);
    }
}
