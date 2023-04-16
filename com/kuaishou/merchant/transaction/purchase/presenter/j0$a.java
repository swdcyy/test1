package com.kuaishou.merchant.transaction.purchase.presenter.j0$a;
import com.kuaishou.merchant.transaction.purchase.presenter.j0$b;
import com.kuaishou.merchant.transaction.purchase.presenter.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import ue4.o;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import com.google.gson.JsonObject;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Number;

public class j0$a implements j0$b	// class@000983
{
    public final j0 a;

    public void j0$a(j0 p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, j0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return o.u(this.a.s);
    }
    public String b(){
       j0 obj = PatchProxy.apply(null, this, j0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.t;
       if (obj != null && obj.getText() != null) {
          String str = o.e(this.a.t.getText());
          if (o.s(str)) {
             return str;
          }
       }
       return null;
    }
    public JsonObject c(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, j0$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b();
       if (!TextUtils.x(obj)) {
          objArray = new JsonObject();
          objArray.a0("accountType", Integer.valueOf(2));
          objArray.c0("account", obj);
       }
       return objArray;
    }
}
