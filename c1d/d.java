package c1d.d;
import c1d.c;
import q3d.a;
import android.app.Activity;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import n3d.b;
import com.yxcorp.login.bind.ChangePhoneActivity;
import android.content.Intent;
import android.content.Context;
import android.os.Bundle;

public class d extends a implements c	// class@0004c7
{

    public void d(){
       super();
    }
    public final c H(Activity p0,String p1,String p2,String p3,int p4){
       a obj1;
       Intent intent;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       String str = "1";
       int i = 4;
       int i1 = 3;
       int i2 = 5;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[i2];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[i1] = oobject3;
          objArray[i] = Integer.valueOf(p4);
          obj1 = PatchProxy.apply(objArray, obj, uod, str);
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       this.h0();
       obj1 = obj.b;
       obj1.a = oobject;
       if (PatchProxy.isSupport(ChangePhoneActivity.class)) {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = oobject;
          objArray1[1] = oobject1;
          objArray1[2] = oobject2;
          objArray1[i1] = oobject3;
          objArray1[i] = Integer.valueOf(p4);
          intent = PatchProxy.apply(objArray1, null, ChangePhoneActivity.class, str);
          if (intent != patchProxyRe) {
          label_0083 :
             obj1.e = intent;
             return obj;
          }
       }
       intent = new Intent(oobject, ChangePhoneActivity.class);
       Bundle uBundle = new Bundle();
       uBundle.putString("arg_verify_code", oobject1);
       uBundle.putString("arg_phone_number", oobject2);
       uBundle.putString("arg_country_code", oobject3);
       uBundle.putInt("arg_country_flag_res_id", p4);
       intent.putExtras(uBundle);
       goto label_0083 ;
    }
}
