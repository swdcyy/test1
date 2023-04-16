package fj1.e;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import cj1.b;
import bj1.a;
import aj1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import aj1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import fj1.d;
import androidx.lifecycle.LifecycleOwner;
import fj1.f;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.vc.input.LiveDiyPanelDataBinding$bindVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import fj1.a;
import android.view.View$OnClickListener;
import android.text.InputFilter;
import ej1.b;
import android.widget.EditText;
import fj1.b;
import android.text.TextWatcher;
import fj1.c;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.domain.giftdiy.viewswitcher.LiveViewSwitcher;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Dialog;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import android.view.Display;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import fj1.e$a;
import android.content.DialogInterface$OnCancelListener;
import fj1.e$b;
import android.content.DialogInterface$OnKeyListener;
import java.lang.Integer;
import com.yxcorp.utility.n;

public final class e extends DialogViewController	// class@00235a
{
    public d l;
    public final d m;
    public Window n;
    public final b o;
    public final a p;
    public final a q;

    public void e(b p0,a p1,a p2){
       a.p(p0, "diyInputInfo");
       a.p(p1, "dialogDelegate");
       a.p(p2, "diyPanelListener");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.m = new d();
    }
    public void F2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "3")) {
          return;
       }
       super.F2();
       View view = a.a(this.D2(), R.layout.arg_RES_7f0d0ae3);
       a.o(view, "KwaiLayoutInflater.infla¡­out.live_diy_edit_layout\)");
       this.R2(view);
       ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
       layoutParams.height = a1.d(0x7f07031f);
       view.setLayoutParams(layoutParams);
       this.l = new d(view, this, this.m, this.o);
       f uof = new f(this.m, this.o, this.q, this.p);
       e tl = this.l;
       if (tl == null) {
          a.S("dataBinding");
       }
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoidOneRefs(uof, tl, d.class, "1")) {
          a.p(uof, "vm");
          tl.i.b(tl.h, new LiveDiyPanelDataBinding$bindVM$1(tl));
          tl.d.setOnClickListener(new a(uof));
          int i = 1;
          InputFilter[] inputFilterA = new InputFilter[i];
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             inputFilterA[i1] = new b(tl.j);
          }
          tl.c.setFilters(inputFilterA);
          tl.c.addTextChangedListener(new b(uof));
          uof.a.observe(tl.h, new c(tl));
          if (!PatchProxy.applyVoid(objArray, tl, d.class, "2")) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(tl.j.b());
             uArrayList.addAll(tl.j.b);
             tl.f.setTexts(uArrayList);
             if (!TextUtils.x(tl.j.e())) {
                tl.c.setText(tl.j.e());
             }else {
                tl.c();
             }
          }
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "5")) {
          return;
       }
       super.J2();
       e tl = this.l;
       if (tl == null) {
          a.S("dataBinding");
       }
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoid(objArray, tl, d.class, "7")) {
          tl.d();
       }
       return;
    }
    public void X2(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       a.p(p0, "dialog");
       super.X2(p0);
       p0.setCanceledOnTouchOutside(true);
       Window window = p0.getWindow();
       if (window != null) {
          this.n = window;
          a.o(window, "it");
          WindowManager$LayoutParams attributes = window.getAttributes();
          attributes.gravity = 80;
          attributes.flags = attributes.flags & 0xfd;
          WindowManager windowManage = window.getWindowManager();
          a.o(windowManage, "it.windowManager");
          Display defaultDispl = windowManage.getDefaultDisplay();
          a.o(defaultDispl, "it.windowManager.defaultDisplay");
          attributes.width = defaultDispl.getWidth();
          window.setAttributes(attributes);
          Window window1 = p0.getWindow();
          if (window1 != null) {
             window1.setSoftInputMode(3);
          }
          window.setBackgroundDrawable(new ColorDrawable(0));
       }
       p0.setOnCancelListener(new e$a(this));
       p0.setOnKeyListener(new e$b(this));
       this.a3(200);
       return;
    }
    public final b Y2(){
       return this.o;
    }
    public final a Z2(){
       return this.q;
    }
    public final void a3(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "6")) {
          return;
       }
       uoe = this.l;
       if (uoe == null) {
          a.S("dataBinding");
       }
       Objects.requireNonNull(uoe);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uoe, uod, "3")) {
          uoe.c.clearFocus();
          uoe.c.requestFocus();
          n.a0(uoe.g.getContext(), uoe.c, p0);
       }
       return;
    }
}
