package a63.a;
import h3.a;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import android.util.SparseArray;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.model.PreviewModel;
import a63.a$a;
import i2b.a;
import com.kuaishou.live.gzone.v2.imagepreview.n;

public class a extends a	// class@000051
{
    public List d;
    public PublishSubject e;
    public int f;
    public SparseArray g;
    public SparseArray h;
    public SparseArray i;

    public void a(List p0,int p1,PublishSubject p2){
       super();
       this.d = p0;
       this.e = p2;
       this.f = p1;
       this.g = new SparseArray();
       this.h = new SparseArray();
       this.i = new SparseArray();
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "3")) {
          return;
       }
       p0.removeView(this.g.get(p1));
       if (this.i.get(p1) != null) {
          this.i.get(p1).destroy();
          this.i.remove(p1);
       }
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public Object o(ViewGroup p0,int p1){
       PreviewModel obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.d.get(p1);
       View view = this.g.get(p1);
       a$a uoa1 = this.h.get(p1);
       PresenterV2 presenterV2 = this.i.get(p1);
       if (view == null) {
          view = a.i(p0, R.layout.arg_RES_7f0d0599);
          uoa1 = new a$a();
          uoa1.b = obj;
          uoa1.c = p1;
          uoa1.e = this.e;
          uoa1.d = this.f;
          presenterV2 = new n();
          presenterV2.f(view);
       }
       Object[] objArray = new Object[]{uoa1,this};
       presenterV2.i(objArray);
       this.i.put(p1, presenterV2);
       p0.addView(view);
       return view;
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
