package com.yxcorp.gifshow.v3.editor.cover.q0$a;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$e;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import ppc.m0;
import java.lang.Runnable;
import android.view.ViewGroup;

public class q0$a implements PictureSelectView$e	// class@000eba
{
    public final q0 a;

    public void q0$a(q0 p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       q0$a uoa = q0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!this.a.w.S()) {
          return;
       }
       this.a.w.W();
       this.a.w.post(new m0(this));
       return;
    }
}
