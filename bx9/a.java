package bx9.a;
import um5.a;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uw9.b;
import jx9.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lx9.a;
import kx9.c;

public class a implements a	// class@0004fb
{
    public final CommentsFragment a;
    public final QPhoto b;

    public void a(CommentsFragment p0,QPhoto p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public List a(){
       b obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.e(this.a);
       Object[] objArray = new Object[]{obj,new a(this.a, this.b)};
       return Lists.e(objArray);
    }
    public PresenterV2 b(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a(true));
       obj.U7(new c());
       PatchProxy.onMethodExit(a.class, "2");
       return obj;
    }
}
