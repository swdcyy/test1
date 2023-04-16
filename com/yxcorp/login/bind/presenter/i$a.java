package com.yxcorp.login.bind.presenter.i$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.presenter.i;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import brd.y;
import android.view.View;
import com.yxcorp.utility.n;

public class i$a implements TextWatcher	// class@001a75
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       String str = p0.toString();
       if (TextUtils.x(str)) {
          this.b.v.onNext(Boolean.TRUE);
          this.b.u.onNext(Boolean.FALSE);
          n.Y(this.b.q, 8, false);
          return;
       }else {
          this.b.v.onNext(Boolean.FALSE);
          n.Y(this.b.q, false, true);
          this.b.P8(str);
          return;
       }
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
