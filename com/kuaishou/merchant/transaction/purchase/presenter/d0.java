package com.kuaishou.merchant.transaction.purchase.presenter.d0;
import androidx.core.widget.NestedScrollView$b;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.d0$a;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.core.widget.NestedScrollView;
import java.lang.Integer;
import java.util.Iterator;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import um4.e1;
import java.util.Map;
import java.util.HashMap;

public class d0 extends PresenterV2 implements NestedScrollView$b, g	// class@00096d
{
    public d0$b p;
    public final LinkedList q;
    public NestedScrollView r;

    public void d0(){
       super();
       this.p = new d0$a(this);
       this.q = new LinkedList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       this.r.setOnScrollChangeListener(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "3")) {
          return;
       }
       this.r.setOnScrollChangeListener(null);
       return;
    }
    public void d5(NestedScrollView p0,int p1,int p2,int p3,int p4){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod0, "4")) {
             return;
          }
       }
       if (!this.q.isEmpty()) {
          Iterator iterator = this.q.iterator();
          while (iterator.hasNext()) {
             iterator.next().d5(p0, p1, p2, p3, p4);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       this.r = p0.findViewById(0x7f0a3750);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d0.class, new e1());
       }else {
          obj.put(d0.class, null);
       }
       return obj;
    }
}
