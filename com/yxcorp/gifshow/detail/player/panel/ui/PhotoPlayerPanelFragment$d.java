package com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;

public final class PhotoPlayerPanelFragment$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@00164d
{
    public final RecyclerView b;

    public void PhotoPlayerPanelFragment$d(RecyclerView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, PhotoPlayerPanelFragment$d.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(this.b);
       Objects.requireNonNull(uBottomSheet, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<androidx.recyclerview.widget.RecyclerView!>");
       uBottomSheet.setPeekHeight(this.b.getHeight());
       return;
    }
}
