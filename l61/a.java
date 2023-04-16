package l61.a;
import com.kuaishou.live.bottombar.component.panel.a;
import androidx.lifecycle.LifecycleOwner;
import k61.f;
import android.view.ViewGroup;
import k61.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import l61.d;
import l61.b;
import l61.c;
import java.lang.Number;
import java.util.List;
import ekd.q;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import k61.g;
import z61.f;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;

public class a extends a	// class@002e85
{
    public final boolean i;

    public void a(LifecycleOwner p0,boolean p1,f p2){
       super(p0, p2);
       this.i = p1;
    }
    public c J0(ViewGroup p0,int p1){
       d uod;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != 1) {
          uod = (p1 != 3)? new d(a.i(p0, 0x7f0d0a7d), this.i, this.h): new b(a.i(p0, 0x7f0d0a7c), this.h);
       }else {
          uod = new c(a.i(p0, 0x7f0d0a84));
       }
       return uod;
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       MutableLiveData mutableLiveD = q.d(this.f, p0);
       if (mutableLiveD != null && mutableLiveD.getValue() != null) {
          if (mutableLiveD.getValue() instanceof g) {
             return 1;
          }else if(mutableLiveD.getValue() instanceof f){
             return 3;
          }else if(mutableLiveD.getValue() instanceof LiveNormalBottomBarItem){
             return 2;
          }
       }
       return 0;
    }
}
