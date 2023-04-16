package e8a.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e8a.g$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import jta.e;
import e8a.g$b;
import java.lang.Runnable;
import android.app.Activity;
import java.util.List;
import com.kwai.robust.PatchProxyResult;

public final class g extends PresenterV2	// class@0020aa
{
    public final View$OnLayoutChangeListener p;
    public List q;
    public View r;

    public void g(){
       super();
       this.p = new g$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       g tr = this.r;
       if (tr != null) {
          tr.addOnLayoutChangeListener(this.p);
       }
       tr = this.r;
       if (tr != null) {
          a.m(tr);
          if (tr.getHeight()) {
             tr = this.q;
             if (tr == null) {
                a.S("mOnSizeChangedListenerList");
             }
             Iterator iterator = tr.iterator();
             while (iterator.hasNext()) {
                g tr1 = this.r;
                a.m(tr1);
                g tr2 = this.r;
                a.m(tr2);
                iterator.next().b(tr1.getWidth(), tr2.getHeight());
             }
          }else {
          label_0051 :
             tr = this.r;
             if (tr != null) {
                tr.post(new g$b(this));
             }
          }
       }else {
          goto label_0051 ;
       }
       return;
    }
    public void F8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "4")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          objArray = activity.findViewById(R.id.nasa_slide_play_view_pager_layout);
       }
       this.r = objArray;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       g tr = this.r;
       if (tr != null) {
          tr.removeOnLayoutChangeListener(this.p);
       }
       return;
    }
    public final List P8(){
       g obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mOnSizeChangedListenerList");
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       Object obj = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       a.o(obj, "inject\(AccessIds.SLIDE_PLAY_SIZE_CHANGED_LIST\)");
       this.q = obj;
       return;
    }
}
