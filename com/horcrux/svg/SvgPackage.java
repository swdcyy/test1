package com.horcrux.svg.SvgPackage;
import rd.d;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.NativeModule;
import com.horcrux.svg.SvgViewModule;
import com.horcrux.svg.RNSVGRenderableManager;
import java.util.List;
import java.util.Collections;
import com.facebook.react.uimanager.ViewManager;
import com.horcrux.svg.RenderableViewManager$GroupViewManager;
import com.horcrux.svg.RenderableViewManager$PathViewManager;
import com.horcrux.svg.RenderableViewManager$CircleViewManager;
import com.horcrux.svg.RenderableViewManager$EllipseViewManager;
import com.horcrux.svg.RenderableViewManager$LineViewManager;
import com.horcrux.svg.RenderableViewManager$RectViewManager;
import com.horcrux.svg.RenderableViewManager$TextViewManager;
import com.horcrux.svg.RenderableViewManager$TSpanViewManager;
import com.horcrux.svg.RenderableViewManager$TextPathViewManager;
import com.horcrux.svg.RenderableViewManager$ImageViewManager;
import com.horcrux.svg.RenderableViewManager$ClipPathViewManager;
import com.horcrux.svg.RenderableViewManager$DefsViewManager;
import com.horcrux.svg.RenderableViewManager$UseViewManager;
import com.horcrux.svg.RenderableViewManager$SymbolManager;
import com.horcrux.svg.RenderableViewManager$LinearGradientManager;
import com.horcrux.svg.RenderableViewManager$RadialGradientManager;
import com.horcrux.svg.RenderableViewManager$PatternManager;
import com.horcrux.svg.RenderableViewManager$MaskManager;
import com.horcrux.svg.RenderableViewManager$ForeignObjectManager;
import com.horcrux.svg.RenderableViewManager$MarkerManager;
import com.horcrux.svg.SvgViewManager;
import java.lang.Object;
import java.util.Arrays;
import com.facebook.react.bridge.ModuleSpec;
import xm.a;
import java.lang.Class;
import javax.inject.Provider;
import xm.b;
import ge.b;
import com.horcrux.svg.t;
import com.horcrux.svg.RenderableViewManager$SVGClass;
import java.lang.String;
import java.lang.Enum;
import com.horcrux.svg.d;
import com.horcrux.svg.n;
import com.horcrux.svg.q;
import com.horcrux.svg.v;
import com.horcrux.svg.g;
import com.horcrux.svg.k;
import com.horcrux.svg.i;
import com.horcrux.svg.j;
import com.horcrux.svg.u;
import com.horcrux.svg.o;
import com.horcrux.svg.p;
import com.horcrux.svg.l;
import com.horcrux.svg.h;
import com.horcrux.svg.a;
import com.horcrux.svg.f;
import com.horcrux.svg.e;
import com.horcrux.svg.c;
import com.horcrux.svg.s;
import com.horcrux.svg.b;
import com.horcrux.svg.m;

public class SvgPackage extends d	// class@0005f4
{

    public void SvgPackage(){
       super();
    }
    public static NativeModule lambda$getNativeModules$0(ReactApplicationContext p0){
       return new SvgViewModule(p0);
    }
    public static NativeModule lambda$getNativeModules$1(ReactApplicationContext p0){
       return new RNSVGRenderableManager(p0);
    }
    public List createJSModules(){
       return Collections.emptyList();
    }
    public List createViewManagers(ReactApplicationContext p0){
       ViewManager[] viewManagerA = new ViewManager[21];
       viewManagerA[0] = new RenderableViewManager$GroupViewManager();
       viewManagerA[1] = new RenderableViewManager$PathViewManager();
       viewManagerA[2] = new RenderableViewManager$CircleViewManager();
       viewManagerA[3] = new RenderableViewManager$EllipseViewManager();
       viewManagerA[4] = new RenderableViewManager$LineViewManager();
       viewManagerA[5] = new RenderableViewManager$RectViewManager();
       viewManagerA[6] = new RenderableViewManager$TextViewManager();
       viewManagerA[7] = new RenderableViewManager$TSpanViewManager();
       viewManagerA[8] = new RenderableViewManager$TextPathViewManager();
       viewManagerA[9] = new RenderableViewManager$ImageViewManager();
       viewManagerA[10] = new RenderableViewManager$ClipPathViewManager();
       viewManagerA[11] = new RenderableViewManager$DefsViewManager();
       viewManagerA[12] = new RenderableViewManager$UseViewManager();
       viewManagerA[13] = new RenderableViewManager$SymbolManager();
       viewManagerA[14] = new RenderableViewManager$LinearGradientManager();
       viewManagerA[15] = new RenderableViewManager$RadialGradientManager();
       viewManagerA[16] = new RenderableViewManager$PatternManager();
       viewManagerA[17] = new RenderableViewManager$MaskManager();
       viewManagerA[18] = new RenderableViewManager$ForeignObjectManager();
       viewManagerA[19] = new RenderableViewManager$MarkerManager();
       viewManagerA[20] = new SvgViewManager();
       return Arrays.asList(viewManagerA);
    }
    public List getNativeModules(ReactApplicationContext p0){
       ModuleSpec[] moduleSpecAr = new ModuleSpec[]{ModuleSpec.nativeModuleSpec(SvgViewModule.class, new a(p0)),ModuleSpec.nativeModuleSpec(RNSVGRenderableManager.class, new b(p0))};
       return Arrays.asList(moduleSpecAr);
    }
    public b getReactModuleInfoProvider(){
       return d.getReactModuleInfoProviderViaReflection(this);
    }
    public List getViewManagers(ReactApplicationContext p0){
       ModuleSpec[] moduleSpecAr = new ModuleSpec[21];
       moduleSpecAr[0] = ModuleSpec.viewManagerSpec(t.a, RenderableViewManager$SVGClass.RNSVGGroup.name());
       moduleSpecAr[1] = ModuleSpec.viewManagerSpec(d.a, RenderableViewManager$SVGClass.RNSVGPath.name());
       moduleSpecAr[2] = ModuleSpec.viewManagerSpec(n.a, RenderableViewManager$SVGClass.RNSVGCircle.name());
       moduleSpecAr[3] = ModuleSpec.viewManagerSpec(q.a, RenderableViewManager$SVGClass.RNSVGEllipse.name());
       moduleSpecAr[4] = ModuleSpec.viewManagerSpec(v.a, RenderableViewManager$SVGClass.RNSVGLine.name());
       moduleSpecAr[5] = ModuleSpec.viewManagerSpec(g.a, RenderableViewManager$SVGClass.RNSVGRect.name());
       moduleSpecAr[6] = ModuleSpec.viewManagerSpec(k.a, RenderableViewManager$SVGClass.RNSVGText.name());
       moduleSpecAr[7] = ModuleSpec.viewManagerSpec(i.a, RenderableViewManager$SVGClass.RNSVGTSpan.name());
       moduleSpecAr[8] = ModuleSpec.viewManagerSpec(j.a, RenderableViewManager$SVGClass.RNSVGTextPath.name());
       moduleSpecAr[9] = ModuleSpec.viewManagerSpec(u.a, RenderableViewManager$SVGClass.RNSVGImage.name());
       moduleSpecAr[10] = ModuleSpec.viewManagerSpec(o.a, RenderableViewManager$SVGClass.RNSVGClipPath.name());
       moduleSpecAr[11] = ModuleSpec.viewManagerSpec(p.a, RenderableViewManager$SVGClass.RNSVGDefs.name());
       moduleSpecAr[12] = ModuleSpec.viewManagerSpec(l.a, RenderableViewManager$SVGClass.RNSVGUse.name());
       moduleSpecAr[13] = ModuleSpec.viewManagerSpec(h.a, RenderableViewManager$SVGClass.RNSVGSymbol.name());
       moduleSpecAr[14] = ModuleSpec.viewManagerSpec(a.a, RenderableViewManager$SVGClass.RNSVGLinearGradient.name());
       moduleSpecAr[15] = ModuleSpec.viewManagerSpec(f.a, RenderableViewManager$SVGClass.RNSVGRadialGradient.name());
       moduleSpecAr[16] = ModuleSpec.viewManagerSpec(e.a, RenderableViewManager$SVGClass.RNSVGPattern.name());
       moduleSpecAr[17] = ModuleSpec.viewManagerSpec(c.a, RenderableViewManager$SVGClass.RNSVGMask.name());
       moduleSpecAr[18] = ModuleSpec.viewManagerSpec(s.a, RenderableViewManager$SVGClass.RNSVGForeignObject.name());
       moduleSpecAr[19] = ModuleSpec.viewManagerSpec(b.a, RenderableViewManager$SVGClass.RNSVGMarker.name());
       moduleSpecAr[20] = ModuleSpec.viewManagerSpec(m.a, "RNSVGSvgView");
       return Arrays.asList(moduleSpecAr);
    }
}
