package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTimeViewBinder$b;
import pn9.c;
import java.lang.Object;
import android.view.ViewGroup;
import pn9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import oqc.d;
import android.content.Context;
import lnc.a1;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;

public final class HighlightTimeViewBinder$b implements c	// class@000f69
{

    public void HighlightTimeViewBinder$b(){
       super();
    }
    public a a(ViewGroup p0,int p1){
       HighlightTimeViewBinder$b uob = HighlightTimeViewBinder$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.c(LayoutInflater.from(a1.c()), R.layout.arg_RES_7f0d0932, p0, false);
       a.o(view, "LayoutInflater.from\(Comm¡­ger_emoji, parent, false\)");
       return new d(view);
    }
}
