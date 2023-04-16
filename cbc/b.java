package cbc.b;
import java.lang.Object;
import java.lang.String;
import k2b.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.i3;
import k2b.h;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Number;
import k2b.f3;

public class b	// class@00056c
{

    public void b(){
       super();
    }
    public static void a(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "25")) {
          return;
       }
       b.h(p0, QCurrentUser.me().getId(), 1, "HEAD_TO_PROFILE", true, p1);
       return;
    }
    public static void b(String p0,String p1,e0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "35")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("apply_uid", p0);
       oi3.d("click_area", p1);
       h oh = h.m("3481918", "APPLY_AGAIN_POPUP");
       oh.n(oi3.e());
       oh.i(p2);
       return;
    }
    public static void c(int p0,boolean p1,String p2,e0 p3,boolean p4,boolean p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Boolean.valueOf(p1),p2,p3,Boolean.valueOf(p4),Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uob, "6")) {
             return;
          }
       }
       String str = (p4)? "rebuild": "new";
       b.m(p0, "HEAD_TO_PROFILE", p1, p2, str, p3, p5);
       return;
    }
    public static void d(String p0,boolean p1,boolean p2,e0 p3,String p4){
       String str;
       String str1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "28")) {
             return;
          }
       }
       if (p2) {
          str = p0;
          str1 = QCurrentUser.me().getId();
       }else {
          str1 = p0;
          str = QCurrentUser.me().getId();
       }
       int i = (p2)? 3: 2;
       b.h(str, str1, i, p4, p1, p3);
       return;
    }
    public static void e(int p0,boolean p1,String p2,e0 p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, b.class, "3")) {
          return;
       }
       b.m(p0, "HEAD_TO_PROFILE", p1, p2, "switch", p3, false);
       return;
    }
    public static void f(int p0,int p1,e0 p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, b.class, "21")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("button_name", Integer.valueOf(p0));
       oi3.c("popup_type", Integer.valueOf(p1));
       h oh = h.m("3398197", "CONFIRMED_POPUP");
       oh.n(oi3.e());
       oh.i(p2);
       return;
    }
    public static void g(e0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "19")) {
          return;
       }
       b.f(1, 2, p0);
       return;
    }
    public static void h(String p0,String p1,int p2,String p3,boolean p4,e0 p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Boolean.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uob, "29")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       oi3.d("from_uid", p0);
       oi3.c("popup_type", Integer.valueOf(p2));
       oi3.d("to_uid", p1);
       oi3.d("button_name", p3);
       if (p2 == 3) {
          oi3.c("show_public_status", Integer.valueOf(p4));
       }
       h oh = h.m("3398502", "CLOSED_FRIEND_RELATIONSHIP_NOTIFICATION_POPUP");
       oh.n(oi3.e());
       oh.i(p5);
       return;
    }
    public static void i(String p0,String p1,int p2,e0 p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, b.class, "24")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("from_uid", p0);
       oi3.c("popup_type", Integer.valueOf(p2));
       oi3.d("to_uid", p1);
       f3 uof3 = f3.l("3398502", "CLOSED_FRIEND_RELATIONSHIP_NOTIFICATION_POPUP");
       uof3.m(oi3.e());
       uof3.h(p3);
       return;
    }
    public static void j(e0 p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "9")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("button_type", p1);
       oi3.c("is_guide", Integer.valueOf(1));
       h oh = h.m("3383775", "RELATIONSHIP_SELECTION_POPUP");
       oh.n(oi3.e());
       oh.i(p0);
       return;
    }
    public static void k(e0 p0,boolean p1,boolean p2,String p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, b.class, "8")) {
          return;
       }
       i3 oi3 = i3.f();
       String str = (p2)? "rebuild": "new";
       oi3.d("invite_type", str);
       oi3.c("is_guide", Integer.valueOf(p1));
       oi3.d("to_uid", p3);
       f3 uof3 = f3.j("RELATIONSHIP_SELECTION_POPUP");
       uof3.m(oi3.e());
       uof3.h(p0);
       return;
    }
    public static void l(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "15")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("button_name", p0);
       h oh = h.m("3398196", "MORE_POPUP");
       oh.n(oi3.e());
       oh.i(p1);
       return;
    }
    public static void m(int p0,String p1,boolean p2,String p3,String p4,e0 p5,boolean p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Boolean.valueOf(p2),p3,p4,p5,Boolean.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uob, "7")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       oi3.c("apply_type", Integer.valueOf(p0));
       oi3.d("button_type", p1);
       oi3.c("show_public_status", Integer.valueOf(p2));
       oi3.d("invite_type", p4);
       oi3.c("is_guide", Integer.valueOf(p6));
       oi3.d("to_uid", p3);
       h oh = h.m("3383775", "RELATIONSHIP_SELECTION_POPUP");
       oh.n(oi3.e());
       oh.i(p5);
       return;
    }
    public static void n(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "31")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("apply_uid", p0);
       f3 uof3 = f3.l("3481921", "APPLIED_TOAST_POPUP");
       uof3.m(oi3.e());
       uof3.h(p1);
       return;
    }
}
