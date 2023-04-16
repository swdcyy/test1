package com.kuaishou.merchant.web.bridge.EditAddressFunction$a;
import la4.b;
import com.kuaishou.merchant.web.bridge.EditAddressFunction;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.merchant.web.bridge.EditAddressFunction$JsEditAddressParam;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zm4.b;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class EditAddressFunction$a implements b	// class@0009d1
{
    public final YodaBaseWebView b;
    public final EditAddressFunction$JsEditAddressParam c;
    public final EditAddressFunction d;

    public void EditAddressFunction$a(EditAddressFunction p0,YodaBaseWebView p1,EditAddressFunction$JsEditAddressParam p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, EditAddressFunction$a.class, "1")) {
          return;
       }
       k1.o(new b(this, this.b, this.c));
       return;
    }
    public void e(){
       a.a(this);
    }
    public void f(boolean p0){
       h.d(this, p0);
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       a.c(this);
    }
    public void p(){
       h.c(this);
    }
}
