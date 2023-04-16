package com.yxcorp.gifshow.dialog.kem.d$a;
import x9a.n0;
import com.yxcorp.gifshow.dialog.kem.d;
import java.lang.Object;
import java.util.HashSet;
import com.yxcorp.gifshow.model.response.dialog.DialogItemViewResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Set;
import com.yxcorp.gifshow.model.response.dialog.KemCheckableDialogResponse;

public class d$a implements n0	// class@001ab0
{
    public Set a;
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
       this.a = new HashSet();
    }
    public void a(boolean p0,Object p1){
       d$a uoa = d$a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "1")) {
          if (p0) {
             this.a.add(p1);
          }else {
             this.a.remove(p1);
          }
          d$a tb = this.b;
          boolean b = (this.a.size() >= this.b.v.mMinSelectItemCount)? true: false;
          tb.P8(b);
       }
       return;
    }
}
