package com.yxcorp.login.userlogin.fragment.k;
import w07.l;
import com.yxcorp.login.userlogin.fragment.QRCodeLoginFragment;
import java.lang.Object;
import u07.t;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;
import java.lang.StringBuilder;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import android.content.res.Resources;
import com.yxcorp.utility.f;
import brd.t;
import y1d.p4;
import erd.g;
import crd.b;

public final class k implements l	// class@001b57
{
    public final QRCodeLoginFragment a;

    public void k(QRCodeLoginFragment p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       k ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, QRCodeLoginFragment.class, "6")) {
       }else if(p0 == null){
          p0 = p0.z();
          if (p0 != null) {
             p0 = p0.findViewById(R.id.positive);
             if (p0 instanceof TextView) {
                p0.setEnabled(false);
                p0.setText(ta.getString(R.string.arg_RES_7f1040ae)+"\(3\)");
                p0.setTextColor(ta.getResources().getColor(R.color.arg_RES_7f061eed));
                ta.r = f.d().b(3000, 1000).subscribe(new p4(ta, p0));
             }
          }
       }
       return;
    }
}
