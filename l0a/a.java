package l0a.a;
import qvb.i;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import qvb.q;
import qvb.h;

public class a implements i	// class@002d31
{
    public final List b;

    public void a(List p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.b = uArrayList;
       if (p0 != null && p0.size()) {
          uArrayList.addAll(p0);
       }
       return;
    }
    public int A(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): this.b.indexOf(p0);
       return i;
    }
    public void F(int p0,Object p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3") && (p0 >= 0 && this.getCount() > p0))) {
          this.b.remove(p0);
          this.b.add(p0, p1);
       }
    label_0029 :
       return;
    }
    public void J(){
    }
    public Object L0(){
       return null;
    }
    public void a(){
    }
    public void add(int p0,Object p1){
    }
    public void add(Object p0){
    }
    public void b(List p0){
    }
    public void clear(){
    }
    public boolean d(List p0){
       return false;
    }
    public List d1(){
       return this.b;
    }
    public void e(int p0,List p1){
    }
    public void f(q p0){
    }
    public int getCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
    public Object getItem(int p0){
       QPhoto qPhoto;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          qPhoto = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (qPhoto != PatchProxyResult.class) {
          label_0026 :
             return qPhoto;
          }
       }
       QPhoto qPhoto1 = (!p0)? this.b.get(p0): 0;
       qPhoto = qPhoto1;
       goto label_0026 ;
    }
    public List getItems(){
       return this.b;
    }
    public void h(q p0){
    }
    public boolean hasMore(){
       return false;
    }
    public boolean i(){
       return h.a(this);
    }
    public void invalidate(){
    }
    public boolean isEmpty(){
       return false;
    }
    public void l0(List p0){
    }
    public void load(){
    }
    public void p1(){
    }
    public void release(){
       h.b(this);
    }
    public boolean remove(Object p0){
       return false;
    }
    public void set(int p0,Object p1){
    }
}
