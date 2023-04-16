package com.kwai.yoda.function.ui.DialogFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ez7.a;
import yz7.e;
import com.kwai.yoda.function.ui.DialogFunction$a;
import io.reactivex.g;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import lrd.b;
import com.kwai.yoda.function.ui.DialogFunction$b;
import com.kwai.yoda.function.ui.DialogFunction$c;
import erd.g;
import crd.b;
import com.kwai.yoda.bridge.YodaException;

public final class DialogFunction extends c	// class@001234
{

    public void DialogFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       a uoa;
       DialogFunction uDialogFunct = DialogFunction.class;
       if (PatchProxy.isSupport(uDialogFunct)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uDialogFunct, "1")) {
             return;
          }
       }
       a.q(p1, "nameSpace");
       a.q(p2, "command");
       a.q(p3, "params");
       String str = "callbackId";
       try{
          a.q(p4, str);
          uoa = e.a(p3, a.class);
       }catch(java.lang.Exception e0){
          uoa = null;
       }
       if (uoa != null) {
          DialogFunction uDialogFunct1 = this;
          YodaBaseWebView yodaBaseWebV = p0;
          String str1 = p1;
          String str2 = p2;
          String str3 = p4;
          DialogFunction$b uob = new DialogFunction$b(uDialogFunct1, yodaBaseWebV, str1, str2, str3);
          DialogFunction$c uoc = new DialogFunction$c(uDialogFunct1, yodaBaseWebV, str1, str2, str3);
          t.create(new DialogFunction$a(p0, uoa)).subscribeOn(a.c()).observeOn(b.c()).subscribe(v6, v7);
          return;
       }else {
          throw new YodaException(0x1e84f, "The Input is invalid: root params should be object.");
       }
    }
}
