package com.kwai.yoda.bridge.NewYodaJavascriptBridge$d;
import erd.g;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import kotlin.jvm.internal.Ref$ObjectRef;
import rx7.a;
import ny7.c;
import java.lang.Object;
import ny7.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sy7.b;
import java.lang.StringBuilder;
import ny7.a;
import java.lang.Boolean;
import tb7.a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import kotlin.jvm.internal.a;
import nz7.e;
import java.lang.Integer;

public final class NewYodaJavascriptBridge$d implements g	// class@001178
{
    public final NewYodaJavascriptBridge b;
    public final Ref$ObjectRef c;
    public final a d;
    public final Ref$ObjectRef e;
    public final c f;

    public void NewYodaJavascriptBridge$d(NewYodaJavascriptBridge p0,Ref$ObjectRef p1,a p2,Ref$ObjectRef p3,c p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewYodaJavascriptBridge$d.class, "1")) {
       }else {
          b b = b.b;
          b.g(this.c.element+' '+this.d.q+" execute result - "+p0.a);
          this.d.e();
          Ref$ObjectRef element = this.c.element;
          NewYodaJavascriptBridge$d uod = null;
          Boolean uBoolean = (element != null)? Boolean.valueOf(element.h()): uod;
          if (a.c(uBoolean)) {
             a.h(p0, "it");
             this.b.v(this.e.element, this.f, this.d, p0);
          }else {
             b.g(this.d.q+" do not need callback");
             Ref$ObjectRef element1 = this.e.element;
             if (element1 != null) {
                e sessionLogge = element1.getSessionLogger();
                if (sessionLogge != null) {
                   sessionLogge.t(this.d, Integer.valueOf(p0.a), p0.b, uod);
                }
             }
          }
       }
       return;
    }
}
