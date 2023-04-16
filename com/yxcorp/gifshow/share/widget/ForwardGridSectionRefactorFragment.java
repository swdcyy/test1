package com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$a;
import nsd.u;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$b;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$animationSubject$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$forwardTypeList$2;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$ForwardListType;
import kotlin.Pair;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import qrd.l1;
import androidx.fragment.app.KwaiDialogFragment;
import io.reactivex.subjects.PublishSubject;
import lnc.l1;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.util.Collection;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import g9c.a;
import ekd.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.content.Context;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import i2b.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$d;
import android.view.View$OnClickListener;
import msd.l;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import djc.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionRefactorFragment$e;
import android.animation.Animator$AnimatorListener;
import ekd.f;
import djc.d0;
import androidx.recyclerview.widget.RecyclerView$q;

public final class ForwardGridSectionRefactorFragment extends BottomSheetFragment	// class@001cdd
{
    public List A;
    public List B;
    public List C;
    public p D;
    public q E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public SharePosInfo J;
    public String K;
    public float L;
    public View M;
    public RecyclerView N;
    public RecyclerView O;
    public TextView P;
    public RecyclerView Q;
    public View R;
    public c0 S;
    public final ForwardGridSectionRefactorFragment$b T;
    public final ForwardGridSectionRefactorFragment$b U;
    public final ForwardGridSectionRefactorFragment$b V;
    public final p W;
    public final p X;
    public x Y;
    public int z;
    public static final ForwardGridSectionRefactorFragment$a U0;
    public static final l Z;

    static {
       ForwardGridSectionRefactorFragment.U0 = new ForwardGridSectionRefactorFragment$a(null);
       ForwardGridSectionRefactorFragment.Z = ForwardGridSectionRefactorFragment$Companion$recyclerViewInitFunc$1.INSTANCE;
    }
    public void ForwardGridSectionRefactorFragment(){
       super();
       this.z = -1;
       this.G = true;
       this.T = new ForwardGridSectionRefactorFragment$b(this);
       this.U = new ForwardGridSectionRefactorFragment$b(this);
       this.V = new ForwardGridSectionRefactorFragment$b(this);
       this.W = s.c(ForwardGridSectionRefactorFragment$animationSubject$2.INSTANCE);
       this.X = s.c(ForwardGridSectionRefactorFragment$forwardTypeList$2.INSTANCE);
    }
    public final Pair Ih(ForwardGridSectionRefactorFragment$ForwardListType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ForwardGridSectionRefactorFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = (this.Lh().size() < 3 || p0 != ForwardGridSectionRefactorFragment$ForwardListType.INAPP)? true: false;
       Integer integer = Integer.valueOf(this.Lh().indexOf(p0));
       integer.intValue();
       this.Lh().size();
       return new Pair(Boolean.valueOf(b), integer);
    }
    public final boolean Jh(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionRefactorFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.B != null) {
          return true;
       }
       this.dismissAllowingStateLoss();
       return false;
    }
    public final PublishSubject Kh(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionRefactorFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.W.getValue();
    }
    public final List Lh(){
       Object obj = PatchProxy.apply(null, this, ForwardGridSectionRefactorFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.X.getValue();
    }
    public final String Mh(){
       return this.K;
    }
    public final void Nh(){
       ForwardGridSectionRefactorFragment tO;
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionRefactorFragment.class, "12")) {
          return;
       }
       String str = "functionListView";
       int i = 8;
       if (l1.a()) {
          tO = this.O;
          if (tO == null) {
             a.S(str);
          }
          tO.setVisibility(i);
          tO = this.B;
          ForwardGridSectionRefactorFragment tC = this.C;
          if (tO != null && tC != null) {
             this.U.W0(CollectionsKt___CollectionsKt.m4(tO, tC));
          }else if(tO != null){
             this.U.W0(tO);
          }else {
             this.U.W0(tC);
          }
       }else {
          tO = this.O;
          if (tO == null) {
             a.S(str);
          }
          tO.setVisibility(0);
          this.U.W0(this.B);
       }
       this.Lh().clear();
       String str1 = "dividerView";
       String str2 = "platformListView";
       if (q.f(this.U.Q0())) {
          tO = this.N;
          if (tO == null) {
             a.S(str2);
          }
          tO.setVisibility(i);
          tO = this.M;
          if (tO == null) {
             a.S(str1);
          }
          tO.setVisibility(i);
       }else {
          tO = this.N;
          if (tO == null) {
             a.S(str2);
          }
          tO.setVisibility(0);
          tO = this.M;
          if (tO == null) {
             a.S(str1);
          }
          tO.setVisibility(0);
          this.Lh().add(ForwardGridSectionRefactorFragment$ForwardListType.PLATFORM);
       }
       tO = this.N;
       if (tO == null) {
          a.S(str2);
       }
       tO.setAdapter(this.U);
       if (q.f(this.C)) {
          tO = this.M;
          if (tO == null) {
             a.S(str1);
          }
          tO.setVisibility(i);
          tO = this.O;
          if (tO == null) {
             a.S(str);
          }
          tO.setVisibility(i);
       }else {
          this.V.W0(this.C);
          tO = this.O;
          if (tO == null) {
             a.S(str);
          }
          tO.setAdapter(this.V);
          this.Lh().add(ForwardGridSectionRefactorFragment$ForwardListType.FUNCTION);
       }
       tO = this.Q;
       str = "inAppListView";
       if (tO == null) {
          a.S(str);
       }
       tO.setAdapter(this.T);
       if (q.f(this.A)) {
          if (this.F == null) {
             tO = this.P;
             if (tO == null) {
                a.S("inAppTitle");
             }
             tO.setVisibility(i);
          }
          tO = this.Q;
          if (tO == null) {
             a.S(str);
          }
          tO.setVisibility(i);
          tO = this.R;
          if (tO == null) {
             a.S("imDividerView");
          }
          tO.setVisibility(i);
       }else if(this.F == null){
          tO = this.P;
          if (tO == null) {
             a.S("inAppTitle");
          }
          tO.setVisibility(0);
       }
       tO = this.Q;
       if (tO == null) {
          a.S(str);
       }
       tO.setVisibility(0);
       tO = this.R;
       if (tO == null) {
          a.S("imDividerView");
       }
       tO.setVisibility(0);
       this.T.W0(this.A);
       tO = this.Q;
       if (tO == null) {
          a.S(str);
       }
       tO.setAdapter(this.T);
       this.Lh().add(0, ForwardGridSectionRefactorFragment$ForwardListType.INAPP);
       if (this.Lh().size() > 0) {
          this.T.r1(this.Ih(ForwardGridSectionRefactorFragment$ForwardListType.INAPP));
          this.U.r1(this.Ih(ForwardGridSectionRefactorFragment$ForwardListType.PLATFORM));
          this.V.r1(this.Ih(ForwardGridSectionRefactorFragment$ForwardListType.FUNCTION));
          this.L = this.getResources().getDimension(0x7f070ca1) * 0x3fc00000;
       }
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionRefactorFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             window.setWindowAnimations(R.style.arg_RES_7f1103dc);
          }
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionRefactorFragment.class, "10")) {
          return;
       }
       a.p(p0, "newConfig");
       super.onConfigurationChanged(p0);
       if (!this.Jh()) {
          return;
       }
       this.Nh();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       TypedArray typedArray;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ForwardGridSectionRefactorFragment.class, "6");
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
             boolean b = false;
             int i = 0x7f0d0484;
             if (this.I == null && typedArray != null) {
                i = typedArray.getResourceId(b, i);
             }
             if (typedArray != null) {
                typedArray.recycle();
             }
             View view = a.g(this.getLayoutInflater(), i, p1, b);
             View view1 = view.findViewById(R.id.cancel_button);
             if (this.G == null) {
                view1.setOnClickListener(new ForwardGridSectionRefactorFragment$d(this));
             }else {
                a.o(view1, "cancelView");
                view1.setVisibility(8);
             }
             TextView textView = view.findViewById(R.id.im_send_to_title);
             View view2 = view.findViewById(R.id.share_platform_divide);
             a.o(view2, "view.findViewById\(R.id.share_platform_divide\)");
             this.M = view2;
             view2 = view.findViewById(R.id.share_im_divider);
             a.o(view2, "view.findViewById\(R.id.share_im_divider\)");
             this.R = view2;
             view2 = view.findViewById(R.id.share_platform_list);
             l z = ForwardGridSectionRefactorFragment.Z;
             z.invoke(view2);
             a.o(view2, "view.findViewById<androi¡­ply\(recyclerViewInitFunc\)");
             this.N = view2;
             view2 = view.findViewById(R.id.function_list);
             z.invoke(view2);
             a.o(view2, "view.findViewById<androi¡­ply\(recyclerViewInitFunc\)");
             this.O = view2;
             view1 = view.findViewById(R.id.im_send_to_title);
             a.o(view1, "view.findViewById\(R.id.im_send_to_title\)");
             this.P = view1;
             view1 = view.findViewById(R.id.share_im_list);
             z.invoke(view1);
             a.o(view1, "view.findViewById<androi¡­ply\(recyclerViewInitFunc\)");
             this.Q = view1;
             if (this.z != -1) {
                view.findViewById(R.id.panel_background).setBackgroundResource(this.z);
             }
             textView.setTextColor(this.getResources().getColor(R.color.arg_RES_7f0619e8));
             return view;
          }
       }
       typedArray = null;
       goto label_002c ;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionRefactorFragment.class, "9")) {
          return;
       }
       super.onDestroy();
       ForwardGridSectionRefactorFragment tS = this.S;
       if (tS != null) {
          tS.a();
       }
       tS = this.Y;
       if (tS != null) {
          tS.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionRefactorFragment.class, "8")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!this.Jh()) {
          return;
       }
       this.Nh();
       f.g(p0, 180, new ForwardGridSectionRefactorFragment$e(this));
       ForwardGridSectionRefactorFragment tH = this.H;
       if (tH - null > 0) {
          c0 uoc0 = new c0(tH, true, this);
          int i = 3;
          RecyclerView[] recyclerView = new RecyclerView[i];
          ForwardGridSectionRefactorFragment tN = this.N;
          if (tN == null) {
             a.S("platformListView");
          }
          recyclerView[0] = tN;
          tN = this.O;
          if (tN == null) {
             a.S("functionListView");
          }
          recyclerView[1] = tN;
          int i1 = 2;
          ForwardGridSectionRefactorFragment tQ = this.Q;
          if (tQ == null) {
             a.S("inAppListView");
          }
          recyclerView[i1] = tQ;
          if (!PatchProxy.applyVoidOneRefs(recyclerView, uoc0, c0.class, "4")) {
             a.p(recyclerView, "anchorViews");
             uoc0.c = new d0(uoc0);
             i1 = 0;
             while (i1 < i) {
                object oobject = recyclerView[i1];
                c0 c = uoc0.c;
                if (c != null) {
                   a.m(c);
                   oobject.addOnItemTouchListener(c);
                }
                i1 = i1 + 1;
             }
          }
          this.S = uoc0;
       }
       tH = this.Y;
       if (tH != null) {
          tH.f(p0);
          Object[] objArray = new Object[true];
          objArray[0] = tH;
          tH.i(objArray);
       }
       return;
    }
}
