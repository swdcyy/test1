package com.kuaishou.live.lite.combocomment.item.LiveLiteComboCommentViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import o93.d;
import androidx.lifecycle.LiveData;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.combocomment.item.LiveLiteComboCommentViewController$onCreate$viewModel$2;
import com.kuaishou.live.lite.combocomment.item.LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import p93.g;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.lite.combocomment.item.LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import p93.a;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import qrd.p;
import p93.b;
import androidx.lifecycle.Observer;
import p93.c;
import p93.d;
import android.view.View$OnLongClickListener;
import android.widget.TextView;
import p93.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import p93.f;
import android.view.View$OnTouchListener;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;

public final class LiveLiteComboCommentViewController extends ViewController	// class@0007ce
{
    public final d j;
    public final LiveData k;
    public final l l;

    public void LiveLiteComboCommentViewController(d p0,LiveData p1,l p2){
       a.p(p0, "delegate");
       a.p(p1, "message");
       a.p(p2, "updateShowDuration");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteComboCommentViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0985);
       View view = this.P2();
       Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
       a uoa = new a(view, this);
       g value = new ViewModelLazy(m0.d(g.class), new LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$2(new LiveLiteComboCommentViewController$onCreate$$inlined$viewModels$1(this)), new LiveLiteComboCommentViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, uoa, a.class, "2")) {
          a.p(value, "viewModel");
          value.d.observe(uoa.g, new b(uoa));
          value.e.observe(uoa.g, new c(uoa));
          uoa.a.setOnLongClickListener(new d(value));
          uoa.b.setOnClickListener(new e(value));
          uoa.b.setOnTouchListener(new f(uoa));
       }
       ComboCommentMessage value1 = this.k.getValue();
       if (value1 != null) {
          a.o(value1, "it");
          this.j.d(value1);
       }
       return;
    }
}
