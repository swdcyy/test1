package com.google.android.material.chip.ChipGroup$b;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.google.android.material.chip.ChipGroup;
import java.lang.Object;
import com.google.android.material.chip.ChipGroup$a;
import android.widget.CompoundButton;

public class ChipGroup$b implements CompoundButton$OnCheckedChangeListener	// class@001672
{
    public final ChipGroup b;

    public void ChipGroup$b(ChipGroup p0){
       this.b = p0;
       super();
    }
    public void ChipGroup$b(ChipGroup p0,ChipGroup$a p1){
       super(p0);
    }
    public void onCheckedChanged(CompoundButton p0,boolean p1){
       ChipGroup$b tb;
       if (this.b.l != null) {
          return;
       }
       int id = p0.getId();
       ChipGroup uChipGroup = -1;
       if (p1) {
          tb = this.b;
          ChipGroup k = tb.k;
          if (k != uChipGroup && (k != id && tb.g != null)) {
             tb.e(k, false);
          }
       label_001e :
          this.b.setCheckedId(id);
       }else {
          tb = this.b;
          if (tb.k == id) {
             tb.setCheckedId(uChipGroup);
          }
       }
       return;
    }
}
