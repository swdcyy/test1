package com.yxcorp.gifshow.share.factory.TokenShareDialogFragment;
import ml8.d;
import hp7.g;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.share.factory.TokenShareDialogFragment$a;
import nsd.u;
import hp7.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.c;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.share.factory.TokenShareDialogFragment$b;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.share.factory.TokenShareDialogFragment$c;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import androidx.fragment.app.Fragment;
import i2b.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.ViewParent;
import java.util.Objects;
import android.content.DialogInterface;

public final class TokenShareDialogFragment extends KwaiDialogFragment implements d, g	// class@001b8c
{
    public String p;
    public TextView q;
    public TextView r;
    public TextView s;
    public c t;
    public c u;
    public View v;
    public boolean w;
    public boolean x;
    public static final TokenShareDialogFragment$a y;

    static {
       TokenShareDialogFragment.y = new TokenShareDialogFragment$a(null);
    }
    public void TokenShareDialogFragment(){
       super();
    }
    public void N4(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TokenShareDialogFragment.class, "7")) {
          return;
       }
       a.p(p1, "shareMessage");
       this.u = p0;
       this.p = p1;
       this.Cb(this.t, "token");
       return;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, TokenShareDialogFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       view = p0.findViewById(R.id.title);
       a.o(view, "view.findViewById\(R.id.title\)");
       this.q = view;
       view = p0.findViewById(R.id.subtitle);
       a.o(view, "view.findViewById\(R.id.subtitle\)");
       this.s = view;
       view = p0.findViewById(R.id.description);
       a.o(view, "view.findViewById\(R.id.description\)");
       this.r = view;
       TokenShareDialogFragment tq = this.q;
       if (tq == null) {
          a.S("titleText");
       }
       tq.setText(R.string.arg_RES_7f101c37);
       tq = this.s;
       if (tq == null) {
          a.S("comText");
       }
       tq.setText(R.string.arg_RES_7f101c3a);
       tq = this.r;
       if (tq == null) {
          a.S("messageText");
       }
       TokenShareDialogFragment tp = this.p;
       if (tp == null) {
          a.S("mShareMessage");
       }
       tq.setText(tp);
       m1.a(p0, new TokenShareDialogFragment$b(this), R.id.close_btn);
       m1.a(p0, new TokenShareDialogFragment$c(this), R.id.action);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, TokenShareDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = false;
       this.setCancelable(b);
       this.setStyle(1, R.style.arg_RES_7f110363);
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       if (uDialog.getWindow() != null) {
          Window window = uDialog.getWindow();
          if (window != null) {
             window.setBackgroundDrawable(new ColorDrawable(b));
          }
          obj = uDialog.getWindow();
          if (obj != null) {
             obj.setDimAmount(0.30f);
          }
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       TokenShareDialogFragment tv1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TokenShareDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       if (this.w == null) {
          this.dismissAllowingStateLoss();
          return new View(this.getContext());
       }else {
          TokenShareDialogFragment tv = this.v;
          if (tv == null) {
             this.v = a.g(p0, 0x7f0d076d, p1, false);
             if (!PatchProxy.applyVoid(null, this, TokenShareDialogFragment.class, "8")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SHARE_TOKEN_WINDOW_POP";
                u1.u0(4, uElementPack, null);
             }
             tv1 = this.v;
             a.m(tv1);
             this.doBindView(tv1);
          }else {
             a.m(tv);
             if (tv.getParent() != null) {
                tv1 = this.v;
                a.m(tv1);
                ViewParent parent = tv1.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                parent.removeView(this.v);
             }
          }
          return this.v;
       }
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TokenShareDialogFragment.class, "6")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       if (this.x == null) {
          TokenShareDialogFragment tu = this.u;
          if (tu != null) {
             tu.a();
          }
       }
       return;
    }
}
