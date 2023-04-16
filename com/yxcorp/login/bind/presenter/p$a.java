package com.yxcorp.login.bind.presenter.p$a;
import android.text.TextWatcher;
import com.yxcorp.login.bind.presenter.p;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Integer;
import brd.y;

public class p$a implements TextWatcher	// class@001a91
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       int i = 0;
       if (p0 != null && !TextUtils.isEmpty(p0.toString())) {
          n.Y(this.b.u, i, true);
          this.b.w.onNext(Integer.valueOf((p0.toString()).length()));
       }else {
          n.Y(this.b.u, 8, i);
          this.b.w.onNext(Integer.valueOf(i));
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
