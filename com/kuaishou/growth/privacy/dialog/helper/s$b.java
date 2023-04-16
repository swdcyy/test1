package com.kuaishou.growth.privacy.dialog.helper.s$b;
import io7.a;
import java.lang.Object;
import com.kuaishou.growth.privacy.dialog.helper.s$a;
import java.lang.String;
import io7.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kuaishou.growth.privacy.dialog.helper.s;

public class s$b implements a	// class@000722
{

    public void s$b(){
       super();
    }
    public void s$b(s$a p0){
       super();
    }
    public void a(String p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s$b.class, "1")) {
          return;
       }
       if (p1 != null && (p1.a(false) && PermissionUtils.a(a.b(), "android.permission.READ_PHONE_STATE"))) {
          s.a(a.b());
       }
    label_0027 :
       return;
    }
}
