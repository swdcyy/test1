package com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout;
import ml8.d;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.EditText;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout$b;
import android.view.View;
import ekd.m1;
import hb1.a;
import android.view.View$OnClickListener;
import hb1.b;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout$a;
import android.text.TextWatcher;
import hb1.c;
import android.widget.TextView$OnEditorActionListener;
import android.view.ViewGroup;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import android.animation.LayoutTransition;
import java.lang.Boolean;

public class SensitiveWordInputLayout extends RelativeLayout implements d	// class@000f51
{
    public View b;
    public View c;
    public EditText d;
    public RelativeLayout e;
    public String f;
    public SensitiveWordInputLayout$b g;
    public LayoutTransition h;
    public static final int i;

    public void SensitiveWordInputLayout(Context p0){
       super(p0, null, 0);
    }
    public void SensitiveWordInputLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SensitiveWordInputLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SensitiveWordInputLayout.class, "7")) {
          return;
       }
       this.d.setText("");
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SensitiveWordInputLayout.class, "5")) {
          return;
       }
       String str = (TextUtils.G(this.d).toString()).trim();
       this.f = str;
       if (!TextUtils.isEmpty(str)) {
          SensitiveWordInputLayout tg = this.g;
          if (tg != null) {
             tg.a(this.f);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SensitiveWordInputLayout.class, "1")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a0ca8);
       this.e = m1.f(p0, 0x7f0a37a3);
       this.b = m1.f(p0, 0x7f0a073b);
       this.c = m1.f(p0, 0x7f0a0182);
       m1.a(p0, new a(this), R.id.add_button);
       m1.a(p0, new b(this), R.id.clear_button);
       m1.e(p0, new SensitiveWordInputLayout$a(this), R.id.editor);
       m1.f(p0, R.id.editor).setOnEditorActionListener(new c(this));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SensitiveWordInputLayout.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       Activity uActivity = a.b(this.getContext());
       if (uActivity != null) {
          n.C(uActivity);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SensitiveWordInputLayout.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       LayoutTransition layoutTransi = new LayoutTransition();
       this.h = layoutTransi;
       layoutTransi.setDuration(100);
       this.e.setLayoutTransition(this.h);
       return;
    }
    public void setEnabled(boolean p0){
       if (PatchProxy.isSupport(SensitiveWordInputLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SensitiveWordInputLayout.class, "4")) {
          return;
       }
       super.setEnabled(p0);
       this.d.setEnabled(p0);
       SensitiveWordInputLayout tc = this.c;
       int i = (TextUtils.isEmpty(this.f))? 8: 0;
       tc.setVisibility(i);
       return;
    }
    public void setInputListener(SensitiveWordInputLayout$b p0){
       this.g = p0;
    }
}
