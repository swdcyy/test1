package com.kwai.feature.platform.misc.logger.OpenLoggerChannelUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import w96.m;
import android.content.Context;
import xh7.a;
import tkd.b;
import tkd.d;
import nu5.b;
import android.content.Intent;
import com.yxcorp.gifshow.log.n;
import com.kwai.framework.logger.config.b;
import android.net.Uri;
import ekd.w0;
import fg6.a;
import aa6.c;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import yh7.a;

public class OpenLoggerChannelUriHandler extends AnnotationUriHandler	// class@0012b1
{

    public void OpenLoggerChannelUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       boolean b;
       OpenLoggerChannelUriHandler openLoggerCh = OpenLoggerChannelUriHandler.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, openLoggerCh, "1")) {
          return;
       }
       o0 obj = PatchProxy.apply(null, this, openLoggerCh, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(a.a().c() || m.a()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p0.b().startActivity(d.a(0x304f5b72).G2(p0.b()));
          obj = n.L;
          if (obj instanceof b) {
             String str = w0.a(p0.g(), "data");
             try{
                obj.d(a.a.h(str, c.class), w0.a(p0.g(), "weblogger_switch"));
             }catch(com.google.gson.JsonParseException e0){
                Log.d("OpenLoggerChannelUriHandler", "…®¬Î¡¥Ω”Œﬁ–ß≈‰÷√£∫"+str);
             }
          }
       }else {
          p1.a(new a(403));
       }
       return;
    }
}
