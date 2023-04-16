package com.kwai.edge.reco.xtab.XTabPredictor$activate$2$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class XTabPredictor$activate$2$b implements g	// class@000d5c
{
    public static final XTabPredictor$activate$2$b b;

    static {
       XTabPredictor$activate$2$b.b = new XTabPredictor$activate$2$b();
    }
    public void XTabPredictor$activate$2$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, XTabPredictor$activate$2$b.class, "1")) {
       }else {
          Log.e("XTabPredictor", "infer error ", p0);
       }
       return;
    }
}
