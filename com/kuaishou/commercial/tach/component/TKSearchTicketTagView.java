package com.kuaishou.commercial.tach.component.TKSearchTicketTagView;
import com.tachikoma.core.component.e;
import gx4.f;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import vx4.p;
import java.lang.Number;

public class TKSearchTicketTagView extends e	// class@001668
{

    public void TKSearchTicketTagView(f p0){
       super(p0);
       this.getView();
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public ViewGroup createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKSearchTicketTagView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(-2130465762).b(p0);
    }
    public int getRealWidth(){
       Object obj = PatchProxy.apply(null, this, TKSearchTicketTagView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return d.a(-2130465762).VV(this.getView());
    }
    public void updateTicketPrefix(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TKSearchTicketTagView.class, "2")) {
          return;
       }
       d.a(-2130465762).t7(this.getView(), p0, p1);
       return;
    }
}
