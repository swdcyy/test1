package com.facebook.react.views.textinput.ReactEditText$a;
import a2.a;
import com.facebook.react.views.textinput.ReactEditText;
import android.view.View;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.EditText;

public class ReactEditText$a extends a	// class@001423
{
    public final ReactEditText d;

    public void ReactEditText$a(ReactEditText p0){
       this.d = p0;
       super();
    }
    public boolean h(View p0,int p1,Bundle p2){
       if (PatchProxy.isSupport(ReactEditText$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactEditText$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p1 == 16) {
          ReactEditText$a td = this.d;
          td.d = true;
          td.requestFocus();
          td.d = false;
          return true;
       }else {
          return super.h(p0, p1, p2);
       }
    }
}
