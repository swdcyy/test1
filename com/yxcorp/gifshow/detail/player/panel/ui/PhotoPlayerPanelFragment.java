package com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$a;
import nsd.u;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import p3a.c;
import java.util.List;
import p3a.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$b;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;

public final class PhotoPlayerPanelFragment extends BottomSheetFragment	// class@00164e
{
    public b A;
    public c B;
    public List z;
    public static final PhotoPlayerPanelFragment$a C;

    static {
       PhotoPlayerPanelFragment.C = new PhotoPlayerPanelFragment$a(null);
    }
    public void PhotoPlayerPanelFragment(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotoPlayerPanelFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d04fc, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoPlayerPanelFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       PhotoPlayerPanelFragment tz = this.z;
       PhotoPlayerPanelFragment tA = this.A;
       if (tz != null && tA != null) {
          p0 = p0.findViewById(R.id.list);
          a.o(p0, "view.findViewById\(R.id.list\)");
          p0.setOverScrollMode(2);
          c uoc = new c(tz, tA);
          this.B = uoc;
          p0.setAdapter(uoc);
          GridLayoutManager gridLayoutMa = new GridLayoutManager(p0.getContext(), 5);
          p0.setLayoutManager(gridLayoutMa);
          gridLayoutMa.m1(new PhotoPlayerPanelFragment$c(tz));
          p0.getViewTreeObserver().addOnGlobalLayoutListener(new PhotoPlayerPanelFragment$d(p0));
          BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(p0);
          Objects.requireNonNull(uBottomSheet, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<androidx.recyclerview.widget.RecyclerView!>");
          uBottomSheet.setHideable(true);
          uBottomSheet.setBottomSheetCallback(new PhotoPlayerPanelFragment$b(this));
       }
       return;
    }
}
