package c35.p;
import java.lang.Object;
import com.kuaishou.viewbinder.IViewBinder;
import android.view.View;
import android.view.View$OnClickListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c35.j;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;
import c35.m;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewStub;

public class p	// class@000419
{
    public static String a = "_key_view_binder_scenario";

    public void p(){
       super();
    }
    public static void a(IViewBinder p0,View p1,View$OnClickListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, p.class, "2")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (p0 == null) {
          p1.setOnClickListener(p2);
       }
       p1.setOnClickListener(new j(p0, p2));
       return;
    }
    public static void b(IViewBinder p0,RadioGroup p1,RadioGroup$OnCheckedChangeListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, p.class, "4")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p1.setOnCheckedChangeListener(new m(p0, p2));
       return;
    }
    public static View c(View p0,int p1,int p2){
       if (PatchProxy.isSupport(p.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, p.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != null && (!p1 || !p2)) {
          return null;
       }else {
          View view = p0.findViewById(p2);
          if (view != null) {
             return view;
          }else {
             ViewStub viewStub = p0.findViewById(p1);
             if (viewStub == null) {
                return null;
             }else {
                return viewStub.inflate().findViewById(p2);
             }
          }
       }
    }
}
