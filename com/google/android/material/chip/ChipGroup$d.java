package com.google.android.material.chip.ChipGroup$d;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.google.android.material.chip.ChipGroup;
import java.lang.Object;
import com.google.android.material.chip.ChipGroup$a;
import android.view.View;
import com.google.android.material.chip.Chip;
import android.widget.CompoundButton$OnCheckedChangeListener;

public class ChipGroup$d implements ViewGroup$OnHierarchyChangeListener	// class@001674
{
    public ViewGroup$OnHierarchyChangeListener b;
    public final ChipGroup c;

    public void ChipGroup$d(ChipGroup p0){
       this.c = p0;
       super();
    }
    public void ChipGroup$d(ChipGroup p0,ChipGroup$a p1){
       super(p0);
    }
    public void onChildViewAdded(View p0,View p1){
       if (p0 == this.c && p1 instanceof Chip) {
          if (p1.getId() == -1) {
             p1.setId(View.generateViewId());
          }
          p1.setOnCheckedChangeListenerInternal(this.c.i);
       }
       ChipGroup$d tb = this.b;
       if (tb != null) {
          tb.onChildViewAdded(p0, p1);
       }
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       if (p0 == this.c && p1 instanceof Chip) {
          p1.setOnCheckedChangeListenerInternal(null);
       }
       ChipGroup$d tb = this.b;
       if (tb != null) {
          tb.onChildViewRemoved(p0, p1);
       }
       return;
    }
}
