package com.yxcorp.login.userlogin.fragment.e;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.login.userlogin.fragment.LogoutDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import h3b.a;
import android.content.SharedPreferences;
import com.yxcorp.login.helper.c;
import com.kwai.framework.model.user.QCurrentUser;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import brd.t;
import y1d.y0;
import y1d.z0;
import erd.g;
import crd.b;

public class e extends m	// class@001b4f
{
    public final LogoutDialogFragment c;

    public void e(LogoutDialogFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("resetToken", a.a.getString("reset_password_token", ""));
       new c().a(QCurrentUser.ME.getId(), TextUtils.G(this.c.p).toString(), hashMap).subscribe(new y0(this), new z0(this));
       return;
    }
}
