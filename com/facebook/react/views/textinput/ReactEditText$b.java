package com.facebook.react.views.textinput.ReactEditText$b;
import android.text.method.KeyListener;
import java.lang.Object;
import android.view.View;
import android.text.Editable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.facebook.react.views.textinput.ReactEditText;
import android.view.KeyEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class ReactEditText$b implements KeyListener	// class@001424
{
    public int a;

    public void ReactEditText$b(){
       super();
       this.a = 0;
    }
    public void clearMetaKeyState(View p0,Editable p1,int p2){
       if (PatchProxy.isSupport(ReactEditText$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ReactEditText$b.class, "4")) {
          return;
       }
       ReactEditText.F.clearMetaKeyState(p0, p1, p2);
       return;
    }
    public int getInputType(){
       return this.a;
    }
    public boolean onKeyDown(View p0,Editable p1,int p2,KeyEvent p3){
       if (PatchProxy.isSupport(ReactEditText$b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, ReactEditText$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return ReactEditText.F.onKeyDown(p0, p1, p2, p3);
    }
    public boolean onKeyOther(View p0,Editable p1,KeyEvent p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactEditText$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ReactEditText.F.onKeyOther(p0, p1, p2);
    }
    public boolean onKeyUp(View p0,Editable p1,int p2,KeyEvent p3){
       if (PatchProxy.isSupport(ReactEditText$b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, ReactEditText$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return ReactEditText.F.onKeyUp(p0, p1, p2, p3);
    }
}
