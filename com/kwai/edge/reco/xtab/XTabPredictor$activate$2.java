package com.kwai.edge.reco.xtab.XTabPredictor$activate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import brd.t;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t45.d;
import brd.z;
import com.kwai.edge.reco.xtab.XTabPredictor$activate$2$a;
import com.kwai.edge.reco.xtab.XTabPredictor$activate$2$b;
import erd.g;
import crd.b;

public final class XTabPredictor$activate$2 extends Lambda implements l	// class@000d5d
{
    public static final XTabPredictor$activate$2 INSTANCE;

    static {
       XTabPredictor$activate$2.INSTANCE = new XTabPredictor$activate$2();
    }
    public void XTabPredictor$activate$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XTabPredictor$activate$2.class, "1")) {
          return;
       }
       a.p(p0, "o");
       p0.subscribeOn(d.c).subscribe(XTabPredictor$activate$2$a.b, XTabPredictor$activate$2$b.b);
       return;
    }
}
