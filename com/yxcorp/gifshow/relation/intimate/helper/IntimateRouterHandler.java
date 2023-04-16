package com.yxcorp.gifshow.relation.intimate.helper.IntimateRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import xh7.a;
import ekd.x0;
import lnc.o5;
import android.content.Context;
import dbc.a;
import yh7.a;

public class IntimateRouterHandler extends AnnotationUriHandler	// class@001905
{

    public void IntimateRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IntimateRouterHandler.class, "1")) {
          return;
       }
       a.d(p0.b(), o5.b(x0.a(p0.g(), "source"), 0));
       p1.a(new a(200));
       return;
    }
}
