package etb.n$a;
import qvb.q;
import etb.n;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.n0;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxResponse;
import android.widget.TextView;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.ArrayList;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import etb.k;
import erd.o;
import t45.d;
import brd.z;
import etb.i;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class n$a implements q	// class@002805
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          n$a tb = this.b;
          Object[] objArray = null;
          ArrayList uArrayList = (tb.r.L0() == null)? objArray: this.b.r.L0().mPlateSettings;
          tb.A = uArrayList;
          tb = this.b;
          n v = tb.v;
          int i = (tb.A == null)? 4: 0;
          v.setVisibility(i);
          this.b.P8();
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, n.class, "8") && !q.f(tb.A)) {
             Iterator iterator = tb.A.iterator();
             while (iterator.hasNext()) {
                tb.X7(iterator.next().observable().distinctUntilChanged(k.b).observeOn(d.a).subscribe(new i(tb), Functions.d()));
             }
          }
       }
       return;
    }
}
