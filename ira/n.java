package ira.n;
import ira.n$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.Object;
import wkd.b;
import com.yxcorp.gifshow.growth.widget.GrowthWidgetManager;
import com.yxcorp.gifshow.growth.widget.WidgetType;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ira.m;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.List;
import m56.c;
import m56.d;
import m56.e;

public abstract class n	// class@002eff
{
    public GrowthWidgetManager a;
    public static final List b;
    public static final n$a c;

    static {
       n.c = new n$a(null);
       n.b = new ArrayList();
    }
    public void n(){
       super();
       this.a = b.a(-1382356358);
    }
    public final GrowthWidgetManager a(){
       return this.a;
    }
    public abstract WidgetType b();
    public void c(Context p0,Intent p1){
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       if (b.a(-2009612988).b()) {
          this.e();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       m om = b.a(-2009612988);
       Objects.requireNonNull(om);
       if (!PatchProxy.applyVoidOneRefs(this, om, m.class, "2")) {
          a.p(this, "policy");
          if (om.b()) {
             om.a.add(this);
          }
       }
       return;
    }
    public void onActivityDestroyEvent(c p0){
    }
    public void onActivityPauseEvent(d p0){
    }
    public void onActivityResumeEvent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "3")) {
          return;
       }
       m om = b.a(-2009612988);
       Objects.requireNonNull(om);
       if (!PatchProxy.applyVoidOneRefs(this, om, m.class, "3")) {
          a.p(this, "policy");
          if (om.b()) {
             om.a.remove(this);
          }
       }
       return;
    }
}
