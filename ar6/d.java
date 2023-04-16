package ar6.d;
import zq6.l;
import com.kwai.kcube.internal.tab.TabNode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zq6.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.kcube.internal.tab.container.ContainerTabNode;
import ar6.e;
import com.kwai.kcube.TabIdentifier;

public final class d implements l	// class@00039f
{
    public final TabNode a;

    public void d(TabNode p0){
       a.p(p0, "tabNode");
       super();
       this.a = p0;
    }
    public Object a(p p0){
       d obj2;
       ContainerTabNode obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "stateId");
       obj = this.a.z();
       Object obj1 = null;
       if (obj != null) {
          e uoe = obj.n();
          if (uoe != null) {
             obj2 = uoe.d(p0);
          label_0027 :
             if (obj2 != null) {
                obj1 = obj2;
             }else {
                obj = this.a.z();
                if (obj != null) {
                   obj2 = obj.T();
                   if (obj2 != null) {
                      obj1 = obj2.a(p0);
                   }
                }
             }
             return obj1;
          }
       }
       obj2 = obj1;
       goto label_0027 ;
    }
    public Object b(TabIdentifier p0,p p1){
       ContainerTabNode obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parentId");
       a.p(p1, "stateId");
       obj = this.a.z();
       Object obj1 = null;
       TabIdentifier tabIdentifie = (obj != null)? obj.q(): obj1;
       if (a.g(tabIdentifie, p0)) {
          ContainerTabNode uContainerTa = this.a.z();
          if (uContainerTa != null) {
             e uoe = uContainerTa.n();
             if (uoe != null) {
                obj1 = uoe.d(p1);
             }
          }
          return obj1;
       }else {
          obj = this.a.z();
          if (obj != null) {
             d uod = obj.T();
             if (uod != null) {
                obj1 = uod.b(p0, p1);
             }
          }
          return obj1;
       }
    }
}
