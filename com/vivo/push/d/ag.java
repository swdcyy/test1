package com.vivo.push.d.ag;
import java.lang.Object;
import com.vivo.push.o;
import com.vivo.push.l;
import com.vivo.push.d.ai;
import com.vivo.push.d.a;
import com.vivo.push.d.f;
import com.vivo.push.d.ad;
import com.vivo.push.d.d;
import com.vivo.push.d.g;
import com.vivo.push.d.l;
import com.vivo.push.d.n;
import com.vivo.push.d.x;
import com.vivo.push.d.u;
import com.vivo.push.d.r;
import com.vivo.push.d.p;
import com.vivo.push.d.h;
import com.vivo.push.d.aa;
import com.vivo.push.d.ah;
import com.vivo.push.d.c;
import com.vivo.push.d.b;
import com.vivo.push.d.af;
import com.vivo.push.d.z;
import com.vivo.push.d.k;

public final class ag	// class@00105e
{

    public void ag(){
       super();
    }
    public static l a(o p0){
       ah uoah;
       ai uoai;
       int i = p0.b();
       if (i != 20) {
          if (i != 100) {
             if (i != 101) {
                switch (i){
                    case 0:
                   label_006d :
                      uoah = new ah(p0);
                      break;
                    case 1:
                      uoah = new aa(p0);
                      break;
                    case 2:
                      uoah = new h(p0);
                      break;
                    case 3:
                      uoah = new p(p0);
                      break;
                    case 4:
                      uoah = new r(p0);
                      break;
                    case 5:
                      uoah = new u(p0);
                      break;
                    case 6:
                      uoah = new x(p0);
                      break;
                    case 7:
                      uoah = new n(p0);
                      break;
                    case 8:
                      uoah = new l(p0);
                      break;
                    case 9:
                      uoah = new g(p0);
                      break;
                    case 10:
                      uoah = new d(p0);
                      break;
                    case 11:
                      uoah = new ad(p0);
                      break;
                    case 12:
                      uoah = new f(p0);
                      break;
                    default:
                      switch (i){
                          case 2000:
                          case 2002:
                          case 2003:
                          case 2004:
                          case 2005:
                          case 2008:
                          case 2009:
                          case 2010:
                          case 2011:
                          case 2012:
                          case 2013:
                          case 2014:
                          case 2015:
                          case 2001:
                            goto label_006d ;
                          case 2006:
                            uoah = new a(p0);
                            break;
                          case 2007:
                            uoah = new ai(p0);
                            break;
                          default:
                            uoai = null;
                      }
                }
                return uoai;
             }else {
                uoah = new c(p0);
             }
          }else {
             uoah = new b(p0);
          }
       }else {
          uoah = new af(p0);
       }
       uoai = uoah;
       goto label_0086 ;
    }
    public static z b(o p0){
       aa uoaa;
       ad uoad;
       int i = p0.b();
       if (i != 20) {
          if (i != 2016) {
             switch (i){
                 case 1:
                   uoaa = new aa(p0);
                   break;
                 case 2:
                   uoaa = new h(p0);
                   break;
                 case 3:
                   uoaa = new p(p0);
                   break;
                 case 4:
                   uoaa = new r(p0);
                   break;
                 case 5:
                   uoaa = new u(p0);
                   break;
                 case 6:
                   uoaa = new x(p0);
                   break;
                 case 7:
                   uoaa = new n(p0);
                   break;
                 case 8:
                   uoaa = new l(p0);
                   break;
                 case 9:
                   uoaa = new g(p0);
                   break;
                 case 10:
                   uoaa = new d(p0);
                   break;
                 case 11:
                   uoaa = new ad(p0);
                   break;
                 default:
                   uoad = null;
             }
             return uoad;
          }else {
             uoaa = new k(p0);
          }
       }else {
          uoaa = new af(p0);
       }
       uoad = uoaa;
       goto label_0060 ;
    }
}
