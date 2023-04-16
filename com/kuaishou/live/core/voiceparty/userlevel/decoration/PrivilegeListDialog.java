package com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import java.lang.String;
import sx2.b;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import sx2.r;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$$special$$inlined$viewModels$2;
import msd.a;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$b;
import com.kwai.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.PrivilegeListDialog$a;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.ListContentViewDataBinding;
import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import sx2.l;
import androidx.lifecycle.Observer;
import sx2.q;
import sx2.o;
import android.app.Dialog;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class PrivilegeListDialog extends DialogViewController	// class@001a92
{
    public final p l;
    public final b m;
    public final String n;
    public final b o;
    public final UserMicSeatLevelLogger p;

    public void PrivilegeListDialog(String p0,b p1,UserMicSeatLevelLogger p2){
       a.p(p0, "anchorId");
       a.p(p1, "decorationNavigator");
       a.p(p2, "logger");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.l = new ViewModelLazy(m0.d(r.class), new PrivilegeListDialog$$special$$inlined$viewModels$2(new PrivilegeListDialog$$special$$inlined$viewModels$1(this)), new PrivilegeListDialog$viewModel$2(this));
       this.m = new PrivilegeListDialog$b(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, PrivilegeListDialog.class, "2")) {
          return;
       }
       super.F2();
       this.Q2(R.layout.arg_RES_7f0d16d6);
       PublishSubject publishSubje = PublishSubject.g();
       publishSubje.subscribe(new PrivilegeListDialog$a(this));
       a.o(publishSubje, "PublishSubject.create<Li¡­ent\(intent\)\n      }\n    }");
       ListContentViewDataBinding listContentV = new ListContentViewDataBinding(this, this.B2(), this.A2(0x7f0a3231), this.m, this.p);
       LiveData liveData = this.Y2().u0();
       if (!PatchProxy.applyVoidTwoRefs(this, liveData, v1, ListContentViewDataBinding.class, "1")) {
          a.p(this, "lifecycleOwner");
          a.p(liveData, "state");
          liveData.observe(this, new l(v1));
       }
       q oq = new q(this.A2(0x7f0a3f1e), publishSubje);
       LiveData liveData1 = this.Y2().u0();
       if (!PatchProxy.applyVoidTwoRefs(this, liveData1, oq, q.class, "1")) {
          a.p(this, "lifecycleOwner");
          a.p(liveData1, "state");
          liveData1.observe(this, new o(oq));
       }
       return;
    }
    public void X2(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PrivilegeListDialog.class, "3")) {
          return;
       }
       a.p(p0, "dialog");
       p0.setCanceledOnTouchOutside(true);
       Window window = p0.getWindow();
       if (window != null) {
          window.setLayout(-1, -2);
          window.setGravity(80);
          window.setDimAmount(0);
          window.setBackgroundDrawable(new ColorDrawable(0));
          window.setWindowAnimations(R.style.arg_RES_7f1103bf);
       }
       return;
    }
    public final r Y2(){
       Object obj = PatchProxy.apply(null, this, PrivilegeListDialog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
}
