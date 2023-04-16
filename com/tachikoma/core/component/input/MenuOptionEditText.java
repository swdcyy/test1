package com.tachikoma.core.component.input.MenuOptionEditText;
import android.widget.EditText;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.tachikoma.core.component.input.MenuOptionEditText$a;
import android.widget.TextView;

public class MenuOptionEditText extends EditText	// class@000d70
{
    public MenuOptionEditText$a b;

    public void MenuOptionEditText(Context p0){
       super(p0);
    }
    public void MenuOptionEditText(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MenuOptionEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean onTextContextMenuItem(int p0){
       MenuOptionEditText obj;
       if (PatchProxy.isSupport(MenuOptionEditText.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MenuOptionEditText.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       switch (p0){
           case 0x1020020:
             obj = this.b;
             if (obj != null) {
                obj.a();
             }
             break;
           case 0x1020021:
             obj = this.b;
             if (obj != null) {
                obj.b();
             }
             break;
           case 0x1020022:
             obj = this.b;
             if (obj != null) {
                obj.c();
             }
             break;
           default:
       }
    label_003a :
       return super.onTextContextMenuItem(p0);
    }
    public void setMenuOptionListener(MenuOptionEditText$a p0){
       this.b = p0;
    }
}
