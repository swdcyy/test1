package eb1.f;
import java.lang.Object;
import bb1.b;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import eb1.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gb1.h0;
import gb1.s;
import gb1.g;
import gb1.z;
import gb1.m1;
import gb1.u0;
import gb1.i2;
import gb1.d1;
import gb1.v1;
import gb1.d0;
import fb1.i;

public class f	// class@0020cc
{

    public void f(){
       super();
    }
    public e a(b p0,LiveAdminAbilityModel p1){
       LiveAdminAbilityModel obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p1.mType;
       if (obj == 106) {
          return new i(p0, p1);
       }
       if (obj == 300) {
          return new d0(p0, p1);
       }
       switch (obj){
           case 'd':
             return new v1(p0, p1);
           case 'e':
             return new d1(p0, p1);
           case 'f':
             return new i2(p0, p1);
           case 'g':
             return new u0(p0, p1);
           case 'h':
             return new m1(p0, p1);
           default:
             switch (obj){
                 case 200:
                   return new z(p0, p1);
                 case 201:
                   return new g(p0, p1);
                 case 202:
                   return new s(p0, p1);
                 case 203:
                   return new h0(p0, p1);
                 default:
                   return null;
             }
       }
    }
}
