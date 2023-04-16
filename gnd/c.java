package gnd.c;
import androidx.recyclerview.widget.h$b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Number;

public final class c extends h$b	// class@000f53
{
    public final List a;
    public final List b;

    public void c(List p0,List p1){
       a.p(p0, "newList");
       a.p(p1, "oldList");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       NewTextBaseElementData newTextBaseE = this.a.get(p1);
       NewTextBaseElementData newTextBaseE1 = this.b.get(p0);
       boolean b = (a.g(newTextBaseE.F0(), newTextBaseE1.F0()) && !newTextBaseE.m0() - newTextBaseE1.m0())? true: false;
       return b;
    }
    public boolean b(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.a.get(p1).l0() == this.b.get(p0).l0())? true: false;
       return b;
    }
    public Object c(int p0,int p1){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, c.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return null;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.size();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.size();
    }
}
