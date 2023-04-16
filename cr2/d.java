package cr2.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import java.lang.Integer;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkStatistic;

public class d	// class@0023cc
{

    public void d(){
       super();
    }
    public static void a(String p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uod, "2")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("timeStamp", Long.valueOf(p1));
       oi3.d("voice_party_pk_id", p0);
       u1.R("VOICE_PARTY_CROSS_ROOM_PK_ACCEPT_INVITATION_SUCCESS", oi3.e(), 3);
       return;
    }
    public static void b(String p0,String p1,int p2,long p3,String p4,String p5,String p6,String p7){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Long.valueOf(p3),p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, uod, "5")) {
             return;
          }
       }
       d.c("VOICE_PARTY_CROSS_ROOM_PK_CONNECT_FAIL", p0, p1, p2, p3, p4, p5, p6, p7, "");
       return;
    }
    public static void c(String p0,String p1,String p2,int p3,long p4,String p5,String p6,String p7,String p8,String p9){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Long.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = p9;
          if (PatchProxy.applyVoid(objArray, null, uod, "12")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       oi3.d("role", p1);
       oi3.d("reason", p2);
       oi3.c("pk_end_type", Integer.valueOf(p3));
       oi3.c("timeStamp", Long.valueOf(p4));
       oi3.d("live_stream_id", p5);
       oi3.d("voice_party_pk_id", p6);
       oi3.d("inviter_anchor_id", p7);
       oi3.d("invited_anchor_id", p8);
       oi3.d("invited_guest_id", p9);
       u1.R(p0, oi3.e(), 3);
       return;
    }
    public static void d(String p0,String p1,String p2,long p3,long p4,String p5,String p6,String p7,String p8,String p9){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       object oobject4 = p6;
       object oobject5 = p7;
       object oobject6 = p8;
       object oobject7 = p9;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[10];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = Long.valueOf(p3);
          objArray[4] = Long.valueOf(p4);
          objArray[5] = oobject3;
          objArray[6] = oobject4;
          objArray[7] = oobject5;
          objArray[8] = oobject6;
          objArray[9] = oobject7;
          if (PatchProxy.applyVoid(objArray, null, uod, "13")) {
             return;
          }
       }
       i3 oi3 = i3.f();
       oi3.d("role", p1);
       oi3.d("stage", p2);
       oi3.c("start_timeStamp", Long.valueOf(p3));
       oi3.c("end_timeStamp", Long.valueOf(p4));
       oi3.d("live_stream_id", oobject3);
       oi3.d("voice_party_pk_id", oobject4);
       oi3.d("inviter_anchor_id", oobject5);
       oi3.d("invited_anchor_id", oobject6);
       oi3.d("invited_guest_id", oobject7);
       u1.R(p0, oi3.e(), 3);
       return;
    }
    public static void e(String p0,long p1,String p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, null, d.class, "3")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("timeStamp", Long.valueOf(p1));
       oi3.d("voice_party_pk_id", p0);
       oi3.d("stage", p2);
       u1.R("VOICE_PARTY_CROSS_ROOM_PK_GUEST_BEGIN_TO_SWITCH_ROOM", oi3.e(), 3);
       return;
    }
    public static void f(String p0,String p1,int p2,long p3,String p4,String p5,String p6,String p7,String p8){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uod, "4")) {
             return;
          }
       }
       d.c("VOICE_PARTY_CROSS_ROOM_PK_INVITATION_FAIL", p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return;
    }
    public static void g(String p0,String p1,long p2,String p3,String p4,String p5,String p6,String p7){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, uod, "8")) {
             return;
          }
       }
       d.c("VOICE_PARTY_CROSS_ROOM_PK_BACK_ROOM_FAIL", p0, p1, 0, p2, p3, p4, p5, p6, p7);
       return;
    }
    public static void h(String p0,String p1,long p2,long p3,String p4,String p5,String p6,String p7,String p8){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uod, "10")) {
             return;
          }
       }
       d.d("VOICE_PARTY_CROSS_ROOM_PK_SWITCH_READY_SUCCEED", p0, p1, p2, p3, p4, p8, p5, p6, p7);
       return;
    }
    public static void i(String p0,String p1,long p2,long p3,String p4,String p5,String p6,String p7,String p8){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uod, "9")) {
             return;
          }
       }
       d.d("VOICE_PARTY_CROSS_ROOM_PK_SWITCH_ROOM_SUCCEED", p0, p1, p2, p3, p4, p8, p5, p6, p7);
       return;
    }
    public static void j(String p0,String p1,int p2,long p3,String p4,String p5,String p6,String p7,String p8){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, uod, "6")) {
             return;
          }
       }
       d.c("VOICE_PARTY_CROSS_ROOM_PK_PKING_END", p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return;
    }
    public static void k(String p0,SCLiveVoicePartyPkStatistic p1,long p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, d.class, "11")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("state", p0);
       oi3.d("pkId", p1.pkId);
       oi3.c("timeStamp", Long.valueOf(p2));
       u1.R("VOICE_PARTY_CROSS_ROOM_PK_RECEIVE_STATISTIC_ERROR", oi3.e(), 3);
       return;
    }
    public static void l(String p0,long p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uod, "1")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("timeStamp", Long.valueOf(p1));
       oi3.d("voice_party_pk_id", p0);
       u1.R("VOICE_PARTY_CROSS_ROOM_PK_SEND_INVITATION_SUCCESS", oi3.e(), 3);
       return;
    }
    public static void m(String p0,String p1,long p2,String p3,String p4,String p5,String p6,String p7){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),p3,p4,p5,p6,p7};
          if (PatchProxy.applyVoid(objArray, null, uod, "7")) {
             return;
          }
       }
       d.c("VOICE_PARTY_CROSS_ROOM_PK_VOTE_END_PKINFO_CHECK_ERROR", p0, p1, 0, p2, p3, p4, p5, p6, p7);
       return;
    }
}
