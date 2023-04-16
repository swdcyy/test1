package e7a.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import o56.a;
import e0a.j;
import java.lang.StringBuilder;
import lnc.bb;
import k2b.u1;
import android.view.ViewGroup;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;

public class o extends PresenterV2	// class@002091
{
    public View p;

    public void o(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       View view = this.m8();
       this.p = view;
       this.P8(view);
       int i = this.R8(this.p);
       if (!a.d() && (i > j.q() && i <= (j.q() + 2))) {
          StringBuilder str = "";
          bb.b(this.p, str, R.id.key_accumulate_leak_count);
          u1.R("SlidePlayViewLeakMonitorPresenter", "view个数达到:"+i+"\n"+str, 14);
       }
    label_0060 :
       return;
    }
    public final void P8(View p0){
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0 instanceof ViewGroup) {
          Object tag = p0.getTag(R.id.key_child_view_count);
          int i = 0x7f0a15db;
          Object tag1 = p0.getTag(i);
          ViewGroup viewGroup = p0;
          int childCount = viewGroup.getChildCount();
          int i1 = 0;
          if (tag instanceof Integer && childCount > tag.intValue()) {
             int i2 = tag1.intValue() + 1;
             p0.setTag(i, Integer.valueOf(i2));
             String obj = PatchProxy.apply(null, this, oo, "4");
             int i3 = (obj != PatchProxyResult.class)? obj.intValue(): a.t().a("nasa_view_leak_threshold", 5);
             if (i2 >= i3) {
                obj = "";
                bb.b(this.p, obj, i);
                obj = "有viewGroup连续增加"+i2+"次\n"+obj;
                if (!a.d()) {
                   u1.R("SlidePlayViewLeakMonitorPresenter", obj, 14);
                }
             }
          }else {
             p0.setTag(i, Integer.valueOf(i1));
          }
          p0.setTag(R.id.key_child_view_count, Integer.valueOf(viewGroup.getChildCount()));
          while (i1 < viewGroup.getChildCount()) {
             p0 = viewGroup.getChildAt(i1);
             if (p0 instanceof ViewGroup) {
                this.P8(p0);
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
    public int R8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          return i;
       }
       if (p0 instanceof ViewGroup) {
          int i1 = 1;
          ViewGroup viewGroup = p0;
          while (i < viewGroup.getChildCount()) {
             View childAt = viewGroup.getChildAt(i);
             i1 = (childAt instanceof ViewGroup)? i1 + this.R8(childAt): i1 + 1;
             i = i + 1;
          }
          i = i1;
       }
       return i;
    }
}
