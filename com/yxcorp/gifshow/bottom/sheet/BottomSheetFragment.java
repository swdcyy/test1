package com.yxcorp.gifshow.bottom.sheet.BottomSheetFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import i2b.a;
import qa9.n;
import com.yxcorp.gifshow.bottom.sheet.h;
import brd.t;
import qa9.q;
import com.yxcorp.gifshow.bottom.sheet.i;
import qa9.l;
import erd.g;
import crd.b;

public final class BottomSheetFragment extends Fragment	// class@001c5e
{
    public f b;
    public a c;
    public static final int d;

    public void BottomSheetFragment(){
       super();
    }
    public f Ug(){
       Object obj = PatchProxy.apply(null, this, BottomSheetFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new f(this);
       }
       return this.b;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BottomSheetFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, this.Ug().c().mContainerLayout, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BottomSheetFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       this.Ug().f();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BottomSheetFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       f uof = this.Ug();
       uof.g(p0);
       uof.h = new n(this);
       uof.i = new h(this);
       uof.a(uof.b.e().subscribe(new i(this, uof), new l(uof)));
       return;
    }
}
