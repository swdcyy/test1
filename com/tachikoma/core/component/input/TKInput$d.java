package com.tachikoma.core.component.input.TKInput$d;
import android.widget.TextView$OnEditorActionListener;
import com.tachikoma.core.component.input.TKInput;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import com.tkruntime.v8.JsValueRef;

public class TKInput$d implements TextView$OnEditorActionListener	// class@000d74
{
    public final TKInput a;

    public void TKInput$d(TKInput p0){
       this.a = p0;
       super();
    }
    public boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(TKInput$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, TKInput$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       int i = 5;
       boolean b = false;
       if (p1 != 2 && (p1 != 3 && (p1 != 4 && (p1 == i || p1 == 6)))) {
          if (p1 != i) {
             b = true;
          }
          String text = this.a.getText();
          if (text != null && !text.equals(this.a.mOnEditorActionText)) {
             p1.mOnEditorActionText = text;
             HashMap hashMap = new HashMap();
             hashMap.put("value", text);
             HashMap hashMap1 = new HashMap();
             hashMap1.put("target", hashMap);
             hashMap1.put("type", "change");
             TKInput$d ta = this.a;
             ta.onRefCallWithArgs(ta.onchangeRef, hashMap1);
          }
       }
    label_006e :
       return b;
    }
}
