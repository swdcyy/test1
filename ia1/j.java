package ia1.j;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import ia1.j$a;
import uo3.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;
import java.lang.Number;
import s81.a;
import uo3.m;
import android.app.Application;
import vo3.f;
import vo3.e;
import android.content.Context;
import vo3.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import ro3.g;

public class j	// class@002880
{
    public static l a;
    public static final String b;
    public static l c;
    public static final String d;
    public static l e;
    public static final String f;
    public static final b g;

    static {
       j.b = b.a(-1504323719).c("live_red_packet_cache").getAbsolutePath();
       j.d = b.a(-1504323719).c("live_enter_room").getAbsolutePath();
       j.f = b.a(-1504323719).c("live_common_image_cache").getAbsolutePath();
       j.g = new j$a();
    }
    public void j(){
       super();
    }
    public static l a(String p0,String p1){
       b obj3;
       long l;
       long l1;
       boolean b1;
       float f;
       l obj = p0;
       Object obj1 = p1;
       j oj = j.class;
       m obj2 = PatchProxy.applyTwoRefs(obj, obj1, null, oj, "4");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       boolean b = (obj.equals("RED_PACKET_SKIN_BIZ_TAG") && (a.a().c() || SystemUtil.J()))? true: false;
       f uof = null;
       if (PatchProxy.isSupport(oj)) {
          obj3 = PatchProxy.applyOneRefs(Boolean.valueOf(b), null, oj, "8");
          if (obj3 != PatchProxyResult.class) {
             l = obj3.longValue();
          }else {
          label_004c :
             l = 0x1e00000;
             if (b) {
                long l3 = a.t();
                if (l3 - uof > 0) {
                   l = l3;
                }
             }
          }
       }else {
          goto label_004c ;
       }
       if (PatchProxy.isSupport(oj)) {
          obj3 = PatchProxy.applyOneRefs(Boolean.valueOf(b), null, oj, "9");
          if (obj3 != PatchProxyResult.class) {
             l1 = obj3.longValue();
          }else {
          label_0074 :
             String str = 0x9a7ec800;
             if (b) {
                long l2 = a.w();
                if (l2 - uof > 0) {
                   l1 = l2;
                }
             }
             l1 = str;
          }
       }else {
          goto label_0074 ;
       }
       if (PatchProxy.isSupport(oj)) {
          Object obj4 = PatchProxy.applyOneRefs(Boolean.valueOf(b), null, oj, "7");
          if (obj4 != PatchProxyResult.class) {
             b1 = obj4.booleanValue();
          }else if(b){
             b1 = a.u();
          }else {
             b1 = false;
          }
       }else {
          goto label_00a0 ;
       }
       if (PatchProxy.isSupport(oj)) {
          Object obj5 = PatchProxy.applyOneRefs(Boolean.valueOf(b), null, oj, "6");
          if (obj5 != PatchProxyResult.class) {
             f = obj5.floatValue();
          }else {
          label_00c1 :
             f = 3.00f;
             if (b) {
                float f1 = a.s();
                if (f1 > 0) {
                   f = f1;
                }
             }
          }
       }else {
          goto label_00c1 ;
       }
       Application uApplication = a.b();
       f uof1 = new f(obj);
       uof1.b = l;
       uof1.c = l1;
       obj3 = j.g;
       uof1.d = obj3;
       e uoe = PatchProxy.apply(null, uof1, f.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(uof1);
       }
       obj2 = new m(obj, uApplication, obj1, uoe);
       obj2.f = b1;
       obj2.g = false;
       obj2.h = true;
       obj2.i = f;
       obj2.e = 0x2710;
       obj2.j = obj3;
       obj = PatchProxy.apply(null, obj2, m.class, "2");
       if (obj != PatchProxyResult.class) {
       }else if(!TextUtils.isEmpty(obj2.c)){
          obj = new l(obj2);
       }else {
          throw new IllegalArgumentException("mRootPath is null");
       }
       return obj;
    }
    public static l b(){
       j oj = j.class;
       Object obj = PatchProxy.apply(null, null, oj, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.c == null) {
          _monitor_enter(oj);
          if (j.c == null) {
             j.c = j.a("biz_tag_enter_room", j.d);
          }
          _monitor_exit(oj);
       }
       return j.c;
    }
    public static l c(){
       j oj = j.class;
       Object obj = PatchProxy.apply(null, null, oj, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.e == null) {
          _monitor_enter(oj);
          if (j.e == null) {
             j.e = j.a("biz_tag_live_common_image", j.f);
          }
          _monitor_exit(oj);
       }
       return j.e;
    }
    public static l d(){
       j oj = j.class;
       Object obj = PatchProxy.apply(null, null, oj, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.a == null) {
          _monitor_enter(oj);
          if (j.a == null) {
             j.a = j.a("RED_PACKET_SKIN_BIZ_TAG", j.b);
             g.a = j.a;
          }
          _monitor_exit(oj);
       }
       return j.a;
    }
}
