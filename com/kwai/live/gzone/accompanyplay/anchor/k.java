package com.kwai.live.gzone.accompanyplay.anchor.k;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import u07.g;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import u07.h;
import com.kwai.live.gzone.accompanyplay.anchor.k$a;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.EditText;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import h37.a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.k$b;
import java.lang.Runnable;
import com.kwai.live.gzone.accompanyplay.anchor.k$c;
import com.kwai.live.gzone.accompanyplay.anchor.k$d;
import com.kwai.live.gzone.accompanyplay.anchor.k$e;
import java.lang.Boolean;

public class k extends c	// class@000b22
{
    public EditText p;
    public View q;
    public View r;
    public View s;
    public String t;
    public b u;
    public String v;
    public String w;
    public TextView x;
    public String y;

    public void k(c$b p0){
       super(p0);
       p0.F(g.a);
       p0.N(h.a);
       p0.L(new k$a(this));
    }
    public void N(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       b9.a(this.u);
       return;
    }
    public void O(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       EditText uEditText = this.d.findViewById(R.id.dialog_editor);
       this.p = uEditText;
       k tv = this.v;
       if (tv != null) {
          uEditText.setText(tv);
       }
       this.q = this.d.findViewById(0x7f0a08fe);
       this.r = this.d.findViewById(0x7f0a073b);
       this.s = this.d.findViewById(0x7f0a04f3);
       TextView textView = this.d.findViewById(R.id.bottom_tips_text_view);
       this.x = textView;
       textView.setText(a1.r(R.string.arg_RES_7f1013bb, this.y));
       this.d.findViewById(R.id.close_button).setOnClickListener(new a(this));
       this.p.setFocusable(true);
       this.p.post(new k$b(this));
       this.r.setOnClickListener(new k$c(this));
       this.s.setOnClickListener(new k$d(this));
       this.q.setOnClickListener(new k$e(this));
       return;
    }
    public void b0(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "2")) {
          return;
       }
       if (p0) {
          this.q.setEnabled(true);
          this.q.setAlpha(0x3f800000);
       }else {
          this.q.setEnabled(false);
          this.q.setAlpha(0x3f000000);
       }
       return;
    }
}
