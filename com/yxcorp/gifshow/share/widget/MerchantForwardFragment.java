package com.yxcorp.gifshow.share.widget.MerchantForwardFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$a;
import nsd.u;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$Companion$recyclerViewInitFunc$1;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$e;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.content.res.Configuration;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import i2b.a;
import com.yxcorp.gifshow.share.widget.MerchantForwardFragment$f;
import android.view.View$OnClickListener;
import msd.l;
import android.widget.TextView;
import android.widget.CheckBox;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.f;

public final class MerchantForwardFragment extends BottomSheetFragment	// class@001d16
{
    public CheckBox A;
    public TextView B;
    public String C;
    public boolean D;
    public List E;
    public t F;
    public p G;
    public q H;
    public MerchantForwardFragment$d I;
    public final MerchantForwardFragment$b J;
    public RecyclerView z;
    public static final l K;
    public static final MerchantForwardFragment$a L;

    static {
       MerchantForwardFragment.L = new MerchantForwardFragment$a(null);
       MerchantForwardFragment.K = MerchantForwardFragment$Companion$recyclerViewInitFunc$1.INSTANCE;
    }
    public void MerchantForwardFragment(){
       super();
       this.C = "";
       this.J = new MerchantForwardFragment$b(this);
    }
    public final boolean Ih(){
       Object obj = PatchProxy.apply(null, this, MerchantForwardFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.E != null || this.D != null) {
          return true;
       }
       this.dismissAllowingStateLoss();
       return false;
    }
    public final String Jh(){
       return this.C;
    }
    public final void Kh(){
       if (PatchProxy.applyVoid(null, this, MerchantForwardFragment.class, "8")) {
          return;
       }
       this.J.W0(this.E);
       if (this.D != null) {
          this.J.Q0().add(new MerchantForwardFragment$e(this));
       }
       MerchantForwardFragment tz = this.z;
       if (tz == null) {
          a.S("platformListView");
       }
       tz.setAdapter(this.J);
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantForwardFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setWindowAnimations(R.style.arg_RES_7f1103db);
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantForwardFragment.class, "6")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       if (!this.Ih()) {
          return;
       }
       this.Kh();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       TypedArray typedArray;
       MerchantForwardFragment tB;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantForwardFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       Context context = this.getContext();
       if (context != null) {
          Resources$Theme theme = context.getTheme();
          if (theme != null) {
             typedArray = theme.obtainStyledAttributes(c$b.V0);
          label_002c :
             int i = 0x7f0d0483;
             int i1 = 0;
             if (typedArray != null) {
                i = typedArray.getResourceId(i1, i);
             }
             if (typedArray != null) {
                typedArray.recycle();
             }
             View view = a.g(this.getLayoutInflater(), i, p1, i1);
             view.findViewById(R.id.cancel_button).setOnClickListener(new MerchantForwardFragment$f(this));
             View view1 = view.findViewById(R.id.share_platform_list);
             MerchantForwardFragment.K.invoke(view1);
             a.o(view1, "view.findViewById<androi¡­ply\(recyclerViewInitFunc\)");
             this.z = view1;
             view1 = view.findViewById(R.id.tv_introduc);
             a.o(view1, "view.findViewById\(R.id.tv_introduc\)");
             this.B = view1;
             view1 = view.findViewById(R.id.cb_copy);
             a.o(view1, "view.findViewById\(R.id.cb_copy\)");
             this.A = view1;
             String str = "copyCb";
             if (!TextUtils.isEmpty(this.C)) {
                tB = this.B;
                if (tB == null) {
                   a.S("introduceTv");
                }
                tB.setVisibility(i1);
                tB = this.A;
                if (tB == null) {
                   a.S(str);
                }
                tB.setVisibility(i1);
                tB = this.B;
                if (tB == null) {
                   a.S("introduceTv");
                }
                tB.setText(this.C);
             }else {
                tB = this.B;
                if (tB == null) {
                   a.S("introduceTv");
                }
                tB.setVisibility(8);
                tB = this.A;
                if (tB == null) {
                   a.S(str);
                }
                tB.setVisibility(8);
             }
             return view;
          }
       }
       typedArray = null;
       goto label_002c ;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantForwardFragment.class, "5")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!this.Ih()) {
          return;
       }
       this.Kh();
       f.f(p0);
       return;
    }
}
