package com.yxcorp.gifshow.bottom.sheet.h;
import z1.a;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetFragment;
import java.lang.Object;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qa9.k;
import hka.a;

public final class h implements a	// class@001c6a
{
    public final BottomSheetFragment a;

    public void h(BottomSheetFragment p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       h ta = this.a;
       if (!ta.getActivity() instanceof GifshowActivity) {
       }else if(p0.booleanValue()){
          if (ta.c == null) {
             ta.c = new k(ta);
          }
          ta.getActivity().F2(ta.c);
       }else if(ta.c != null){
          ta.getActivity().l3(ta.c);
       }
       return;
    }
}
