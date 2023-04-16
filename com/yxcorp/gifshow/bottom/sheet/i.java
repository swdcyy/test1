package com.yxcorp.gifshow.bottom.sheet.i;
import erd.g;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetFragment;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import qa9.m;
import java.lang.Runnable;

public final class i implements g	// class@001c6b
{
    public final BottomSheetFragment b;
    public final f c;

    public void i(BottomSheetFragment p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       if (!p0.booleanValue() && tb.getFragmentManager() != null) {
          p0 = tb.getFragmentManager().beginTransaction().s(tb);
          p0.x(new m(tc));
          p0.m();
       }
       return;
    }
}
