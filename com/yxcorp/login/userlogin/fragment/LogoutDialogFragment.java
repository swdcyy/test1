package com.yxcorp.login.userlogin.fragment.LogoutDialogFragment;
import ml8.d;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Switch;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import y1d.x0;
import android.text.TextWatcher;
import com.yxcorp.login.userlogin.fragment.e;
import android.view.View$OnClickListener;
import y1d.v0;
import y1d.w0;
import android.widget.CompoundButton$OnCheckedChangeListener;

public class LogoutDialogFragment extends KwaiDialogFragment implements d	// class@001b33
{
    public EditText p;
    public Button q;
    public Switch r;
    public View s;
    public View t;
    public b u;
    public static final int v;

    public void LogoutDialogFragment(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogoutDialogFragment.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1401);
       this.q = m1.f(p0, 0x7f0a2994);
       this.r = m1.f(p0, 0x7f0a395b);
       this.s = m1.f(p0, 0x7f0a1402);
       this.t = m1.f(p0, 0x7f0a0785);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogoutDialogFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LogoutDialogFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setStyle(1, R.style.arg_RES_7f110363);
       Dialog uDialog = super.onCreateDialog(p0);
       if (uDialog.getWindow() != null) {
          uDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LogoutDialogFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0eb8, p1, false);
       this.doBindView(view);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LogoutDialogFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LogoutDialogFragment.class, "7")) {
          this.p.addTextChangedListener(new x0(this));
          this.q.setOnClickListener(new e(this));
          this.t.setOnClickListener(new v0(this));
          this.r.setChecked(true);
          this.p.setInputType(145);
          this.r.setOnCheckedChangeListener(new w0(this));
       }
       Window window = this.getDialog().getWindow();
       if (window != null) {
          window.setDimAmount(0.30f);
       }
       return;
    }
}
