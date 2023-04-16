package com.kwai.emotionsdk.customize.CustomizeEmotionFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.widget.TextView;
import jl5.c;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.content.res.Resources;
import java.lang.CharSequence;
import com.kwai.emotionsdk.util.ActivityContext;
import ekd.p0;
import e17.i;
import e17.s;
import com.kwai.emotionsdk.core.j;
import brd.t;
import gr8.b;
import brd.x;
import com.kwai.emotionsdk.customize.CustomizeEmotionFragment$a;
import com.kwai.emotionsdk.customize.f;
import erd.g;
import crd.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ag6.a;
import java.util.Objects;
import gk5.h;
import fk5.b;
import android.view.View$OnClickListener;
import fk5.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.emotionsdk.customize.b;
import com.kwai.emotionsdk.customize.c;

public class CustomizeEmotionFragment extends RxFragment	// class@000da0
{
    public View c;
    public TextView d;
    public TextView e;
    public RecyclerView f;
    public View g;
    public View h;
    public TextView i;
    public h j;
    public static final int k;

    public void CustomizeEmotionFragment(){
       super();
    }
    public void Vg(int p0){
       String str;
       if (PatchProxy.isSupport(CustomizeEmotionFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomizeEmotionFragment.class, "8")) {
          return;
       }
       int i = 1;
       boolean b = (p0 > 0)? true: false;
       this.h.setEnabled(b);
       this.i.setEnabled(b);
       if (b) {
          CustomizeEmotionFragment ti = this.i;
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             str = PatchProxy.applyTwoRefs(Integer.valueOf(R.string.arg_RES_7f100d7d), Integer.valueOf(p0), null, uoc, "5");
             if (str != PatchProxyResult.class) {
             label_0061 :
                ti.setText(str);
             }
          }
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p0);
          str = c.b().getResources().getString(R.string.arg_RES_7f100d7d, objArray);
          goto label_0061 ;
       }else {
          this.i.setText(R.string.arg_RES_7f100d7b);
       }
       return;
    }
    public void Wg(){
       if (PatchProxy.applyVoid(null, this, CustomizeEmotionFragment.class, "7")) {
          return;
       }
       if (!p0.C(ActivityContext.d().b())) {
          s.a(R.string.arg_RES_7f100d92);
          return;
       }else {
          j.e().j().compose(this.ge()).subscribe(new CustomizeEmotionFragment$a(this), f.b);
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, CustomizeEmotionFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d03e6, p1, false);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CustomizeEmotionFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       CustomizeEmotionFragment tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(objArray, tj, h.class, "16")) {
             h k = tj.k;
             if (k != null && !k.isDisposed()) {
                tj.k.dispose();
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CustomizeEmotionFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.c = p0.findViewById(0x7f0a1716);
       this.d = p0.findViewById(0x7f0a3643);
       this.e = p0.findViewById(0x7f0a3f7b);
       this.d.setOnClickListener(new b(this));
       this.c.setOnClickListener(new a(this));
       RecyclerView recyclerView = p0.findViewById(R.id.recycler_view);
       this.f = recyclerView;
       recyclerView.setItemAnimator(null);
       this.f.setLayoutManager(new GridLayoutManager(this.getContext(), 4));
       this.g = p0.findViewById(0x7f0a04bd);
       this.h = p0.findViewById(0x7f0a4448);
       this.i = p0.findViewById(0x7f0a4434);
       this.h.setOnClickListener(new b(this));
       this.i.setOnClickListener(new c(this));
       this.Wg();
       return;
    }
}
