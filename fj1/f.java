package fj1.f;
import yh3.a;
import aj1.d;
import cj1.b;
import aj1.a;
import bj1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import fj1.f$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fj1.f$a$b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import fj1.f$a$a;
import ah1.c;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class f extends a	// class@00235e
{
    public final LiveData a;
    public final d b;
    public final b c;
    public final a d;
    public final a e;

    public void f(d p0,b p1,a p2,a p3){
       a.p(p0, "diyTextModel");
       a.p(p1, "diyInputInfo");
       a.p(p2, "diyPanelListener");
       a.p(p3, "dialogDelegate");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
    }
    public void u0(f$a p0){
       f tc;
       f$a$a a;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "1")) {
          return;
       }
       a.p(p0, "intent");
       boolean b = true;
       if (a.g(p0, f$a$b.a)) {
          tc = this.c;
          String str = this.b.a();
          int i = (str != null)? str.length(): 0;
          if (i <= 0) {
             b = false;
          }
          tc.i = b;
          this.d.e(this.c);
       }else if(p0 instanceof f$a$a){
          a = p0.a;
          if (!PatchProxy.applyVoidOneRefs(a, this, uof, "2")) {
             this.b.e("input", a);
             if (a.length() <= 0) {
                b = false;
             }
             if (b) {
                this.r0(this.a).setValue(String.valueOf(a.length())+"/"+String.valueOf(this.c.d()));
             }else {
                this.r0(this.a).setValue("");
             }
             if (TextUtils.x(a)) {
                tc = this.c;
                tc.f(tc.b());
             }else {
                this.c.f(a);
             }
             this.d.c(this.c);
          }
       }
       return;
    }
}
