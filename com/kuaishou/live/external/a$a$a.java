package com.kuaishou.live.external.a$a$a;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kuaishou.live.external.a$a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import android.widget.TextView;
import com.kuaishou.live.external.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import o02.f;
import o02.e;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.external.c;
import com.kuaishou.live.external.d;
import erd.g;
import crd.b;
import com.kuaishou.live.external.e;
import com.kuaishou.live.external.f;

public class a$a$a implements SlipSwitchButton$b	// class@001b6b
{
    public final a$a a;

    public void a$a$a(a$a p0){
       this.a = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       boolean b;
       a$a p1;
       a$a$a uoa$a = a$a$a.class;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa$a, "1")) {
          return;
       }
       a$a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), ta, uoa, "5")) {
          p1 = ta.q;
          if (p1 != null) {
             if (p1) {
                p1.setText(R.string.arg_RES_7f102ed2);
             }else {
                p1.setText(R.string.arg_RES_7f102ed1);
             }
          }
       }
       ta = this.a;
       if (p1 != ta.t.d) {
          Objects.requireNonNull(ta);
          Object[] objArray = null;
          Object obj = PatchProxy.apply(objArray, ta, uoa, "8");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             p1 = ta.p;
             b = (p1 != null && p1.isEnabled())? true: false;
          }
          if (b) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), ta, uoa, "9")) {
                if (!PatchProxy.applyVoid(objArray, ta, uoa, "7")) {
                   a$a p = ta.p;
                   if (p != null) {
                      p.setEnabled(false);
                   }
                }
                if (p1) {
                   e.a().T().map(new e()).subscribe(new c(ta), new d(ta));
                }else {
                   e.a().l().map(new e()).subscribe(new e(ta), new f(ta));
                }
             }
          }
       }
    label_00d7 :
       return;
    }
}
