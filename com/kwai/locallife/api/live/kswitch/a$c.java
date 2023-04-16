package com.kwai.locallife.api.live.kswitch.a$c;
import com.kwai.locallife.api.live.kswitch.a$d;
import com.kwai.locallife.api.live.kswitch.a;
import com.kwai.locallife.api.live.kswitch.LiveLocalLifeSwitchKeys;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.locallife.api.live.kswitch.a$a;
import com.kwai.locallife.api.live.kswitch.LiveLocalLifeSwitchKeys$From;
import java.lang.Enum;
import xf6.l;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.abtest.f;
import java.util.List;
import java.util.Iterator;

public class a$c extends a$d	// class@000ea1
{
    public List c;
    public List d;
    public final a e;

    public void a$c(a p0,LiveLocalLifeSwitchKeys p1){
       this.e = p0;
       super(p0, p1);
       this.c = new ArrayList();
       this.d = new ArrayList();
    }
    public boolean a(){
       int b;
       Boolean uBoolean;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$c uoc = a$c.class;
       a$d obj = PatchProxy.apply(null, this, uoc, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Iterator obj1 = PatchProxy.applyOneRefs(obj, this, uoc, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = a$a.a[obj.from().ordinal()];
          if (b != 1) {
             if (b != 2) {
                b = (b != 3)? false: l.c(obj.key(), obj.defaultValue().booleanValue());
             }else {
                b = a.t().d(obj.key(), obj.defaultValue().booleanValue());
             }
          }else {
             b = f.a(obj.key());
          }
       }
       if (!this.c.isEmpty()) {
          obj1 = this.c.iterator();
          while (obj1.hasNext()) {
             uBoolean = obj1.next();
             if (b || uBoolean.booleanValue()) {
                b = true;
             }else {
                b = false;
             }
          }
       }
       if (!this.d.isEmpty()) {
          obj1 = this.d.iterator();
          while (obj1.hasNext()) {
             uBoolean = obj1.next();
             if (b && uBoolean.booleanValue()) {
                b = true;
             }else {
                b = false;
             }
          }
       }
       return b;
    }
}
