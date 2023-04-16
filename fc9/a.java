package fc9.a;
import android.view.View;
import java.lang.Object;
import java.util.ArrayList;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;

public class a	// class@0022f8
{
    public final View a;
    public View b;
    public TextView c;
    public View d;
    public View e;
    public boolean f;
    public List g;

    public void a(View p0){
       super();
       this.g = new ArrayList();
       this.a = p0;
    }
    public void a(View p0,int p1,int p2){
       super();
       this.g = new ArrayList();
       this.a = p0;
       if (p0 != null) {
          this.c = p0.findViewById(p1);
          this.d = p0.findViewById(p2);
       }
       return;
    }
    public void a(View p0,int p1,int p2,int p3){
       super();
       this.g = new ArrayList();
       this.a = p0;
       if (p0 != null) {
          this.b = p0.findViewById(p1);
          this.c = p0.findViewById(p2);
          this.d = p0.findViewById(p3);
       }
       return;
    }
    public void a(View p0,int p1,int p2,int p3,int p4){
       super();
       this.g = new ArrayList();
       this.a = p0;
       if (p0 != null) {
          this.b = p0.findViewById(p1);
          this.c = p0.findViewById(p2);
          this.d = p0.findViewById(p3);
          this.e = p0.findViewById(p4);
       }
       return;
    }
    public View a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = this.a;
       if (uoa != null) {
          return uoa.findViewById(p0);
       }else {
          return null;
       }
    }
    public View b(){
       return this.b;
    }
    public View c(){
       return this.a;
    }
    public View d(){
       return this.d;
    }
    public View e(){
       return this.e;
    }
    public TextView f(){
       return this.c;
    }
    public boolean g(){
       boolean b = (this.a == null)? true: false;
       return b;
    }
    public boolean h(){
       return this.f;
    }
    public boolean i(){
       a obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public void j(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       this.f = p0;
       uoa = this.a;
       if (uoa != null) {
          uoa.setEnabled(p0);
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.setEnabled(p0);
       }
       uoa = this.d;
       if (uoa != null) {
          uoa.setEnabled(p0);
       }
       uoa = this.c;
       if (uoa != null) {
          uoa.setEnabled(p0);
       }
       uoa = this.e;
       if (uoa != null) {
          uoa.setEnabled(p0);
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().setEnabled(p0);
       }
       return;
    }
    public void k(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       int len = p0.length;
       int i = 0;
       while (i < len) {
          int i1 = p0[i];
          View view = this.a.findViewById(i1);
          if (view != null && !this.g.contains(view)) {
             this.g.add(this.a.findViewById(i1));
          }
          i = i + 1;
       }
       return;
    }
}
