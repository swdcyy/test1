package bpd.c0;
import im8.b;
import java.lang.Object;
import bpd.b0;
import apd.i;
import java.lang.Class;
import im8.e;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.yxcorp.plugin.kwaitoken.model.TachTemplateDialogInfo;
import java.util.Set;
import java.util.HashSet;

public final class c0 implements b	// class@00029c
{
    public Set a;
    public Set b;

    public void c0(){
       super();
    }
    public void a(Object p0,Object p1){
       i oi = i.class;
       if (e.d(p1, oi)) {
          oi = e.b(p1, oi);
          if (oi != null) {
             p0.s = oi;
          }else {
             throw new IllegalArgumentException("mDialog 不能为空");
          }
       }
       if (e.d(p1, TachTemplateDialogInfo.class)) {
          p1 = e.b(p1, TachTemplateDialogInfo.class);
          if (p1 != null) {
             p0.r = p1;
          }else {
             throw new IllegalArgumentException("mInfo 不能为空");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          this.a = new HashSet();
       }
       return this.a;
    }
    public void c(Object p0){
       p0.s = null;
       p0.r = null;
    }
    public final Set d(){
       if (this.b == null) {
          HashSet hashSet = new HashSet();
          this.b = hashSet;
          hashSet.add(i.class);
          this.b.add(TachTemplateDialogInfo.class);
       }
       return this.b;
    }
}
