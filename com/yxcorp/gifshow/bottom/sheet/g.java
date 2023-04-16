package com.yxcorp.gifshow.bottom.sheet.g;
import z1.a;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetDialogFragment;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Object;
import java.lang.Boolean;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import qa9.i;
import android.content.DialogInterface$OnKeyListener;

public final class g implements a	// class@001c69
{
    public final BottomSheetDialogFragment a;
    public final f b;

    public void g(BottomSheetDialogFragment p0,f p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       g ta = this.a;
       g tb = this.b;
       if (ta.getDialog() == null) {
       }else if(p0.booleanValue()){
          if (ta.c == null) {
             ta.c = new i(tb);
          }
          ta.getDialog().setOnKeyListener(ta.c);
       }else {
          ta.getDialog().setOnKeyListener(null);
       }
       return;
    }
}
