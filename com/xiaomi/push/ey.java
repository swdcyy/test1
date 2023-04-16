package com.xiaomi.push.ey;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ey extends Enum	// class@001103
{
    public final int a;
    public static final ey A;
    public static final ey B;
    public static final ey C;
    public static final ey D;
    public static final ey E;
    public static final ey F;
    public static final ey G;
    public static final ey H;
    public static final ey I;
    public static final ey J;
    public static final ey K;
    public static final ey L;
    public static final ey M;
    public static final ey N;
    public static final ey O;
    public static final ey P;
    public static final ey Q;
    public static final ey R;
    public static final ey S;
    public static final ey T;
    public static final ey U;
    public static final ey V;
    public static final ey W;
    public static final ey X;
    public static final ey Y;
    public static final ey Z;
    public static final ey a;
    public static final ey[] a;
    public static final ey aa;
    public static final ey ab;
    public static final ey ac;
    public static final ey ad;
    public static final ey ae;
    public static final ey b;
    public static final ey c;
    public static final ey d;
    public static final ey e;
    public static final ey f;
    public static final ey g;
    public static final ey h;
    public static final ey i;
    public static final ey j;
    public static final ey k;
    public static final ey l;
    public static final ey m;
    public static final ey n;
    public static final ey o;
    public static final ey p;
    public static final ey q;
    public static final ey r;
    public static final ey s;
    public static final ey t;
    public static final ey u;
    public static final ey v;
    public static final ey w;
    public static final ey x;
    public static final ey y;
    public static final ey z;

    static {
       ey uoey = new ey("TCP_CONN_FAIL", 0, 1);
       ey.a = uoey;
       ey uoey1 = new ey("TCP_CONN_TIME", 1, 2);
       ey.b = uoey1;
       ey uoey2 = new ey("PING_RTT", 2, 3);
       ey.c = uoey2;
       ey uoey3 = new ey("CHANNEL_CON_FAIL", 3, 4);
       ey.d = uoey3;
       ey uoey4 = new ey("CHANNEL_CON_OK", 4, 5);
       ey.e = uoey4;
       ey uoey5 = new ey("ICMP_PING_FAIL", 5, 6);
       ey.f = uoey5;
       ey uoey6 = new ey("ICMP_PING_OK", 6, 7);
       ey.g = uoey6;
       ey uoey7 = new ey("CHANNEL_ONLINE_RATE", 7, 8);
       ey.h = uoey7;
       ey uoey8 = new ey("BATCH_TCP_CONN_SUCCESS", 8, 1000);
       ey.i = uoey8;
       ey uoey9 = new ey("BATCH_TCP_CONN_FAIL", 9, 1001);
       ey.j = uoey9;
       ey uoey10 = new ey("CHANNEL_STATS_COUNTER", 10, 8000);
       ey.k = uoey10;
       ey uoey11 = new ey("GSLB_REQUEST_SUCCESS", 11, 0x2710);
       ey.l = uoey11;
       ey uoey12 = new ey("GSLB_TCP_NOACCESS", 12, 0x2775);
       ey.m = uoey12;
       ey uoey13 = uoey12;
       ey uoey14 = new ey("GSLB_TCP_NETUNREACH", 13, 0x2776);
       ey.n = uoey14;
       ey uoey15 = uoey14;
       uoey12 = new ey("GSLB_TCP_CONNREFUSED", 14, 0x2777);
       ey.o = uoey12;
       ey uoey16 = uoey12;
       uoey14 = new ey("GSLB_TCP_NOROUTETOHOST", 15, 0x2778);
       ey.p = uoey14;
       ey uoey17 = uoey14;
       uoey12 = new ey("GSLB_TCP_TIMEOUT", 16, 0x2779);
       ey.q = uoey12;
       ey uoey18 = uoey12;
       uoey14 = new ey("GSLB_TCP_INVALARG", 17, 0x277a);
       ey.r = uoey14;
       ey uoey19 = uoey14;
       uoey12 = new ey("GSLB_TCP_UKNOWNHOST", 18, 0x277b);
       ey.s = uoey12;
       ey uoey20 = uoey12;
       uoey14 = new ey("GSLB_TCP_ERR_OTHER", 19, 0x27d7);
       ey.t = uoey14;
       ey uoey21 = uoey14;
       uoey12 = new ey("GSLB_ERR", 20, 0x2af7);
       ey.u = uoey12;
       ey uoey22 = uoey12;
       uoey14 = new ey("CONN_SUCCESS", 21, 0x4e20);
       ey.v = uoey14;
       ey uoey23 = uoey14;
       uoey12 = new ey("CONN_TCP_NOACCESS", 22, 0x4e85);
       ey.w = uoey12;
       ey uoey24 = uoey12;
       uoey14 = new ey("CONN_TCP_NETUNREACH", 23, 0x4e86);
       ey.x = uoey14;
       ey uoey25 = uoey14;
       uoey12 = new ey("CONN_TCP_CONNREFUSED", 24, 0x4e87);
       ey.y = uoey12;
       ey uoey26 = uoey12;
       uoey14 = new ey("CONN_TCP_NOROUTETOHOST", 25, 0x4e88);
       ey.z = uoey14;
       ey uoey27 = uoey14;
       uoey12 = new ey("CONN_TCP_TIMEOUT", 26, 0x4e89);
       ey.A = uoey12;
       ey uoey28 = uoey12;
       uoey14 = new ey("CONN_TCP_INVALARG", 27, 0x4e8a);
       ey.B = uoey14;
       ey uoey29 = uoey14;
       uoey12 = new ey("CONN_TCP_UKNOWNHOST", 28, 0x4e8b);
       ey.C = uoey12;
       ey uoey30 = uoey12;
       uoey14 = new ey("CONN_TCP_ERR_OTHER", 29, 0x4ee7);
       ey.D = uoey14;
       ey uoey31 = uoey14;
       uoey12 = new ey("CONN_XMPP_ERR", 30, 0x4faf);
       ey.E = uoey12;
       ey uoey32 = uoey12;
       uoey14 = new ey("CONN_BOSH_UNKNOWNHOST", 31, 0x4fb7);
       ey.F = uoey14;
       ey uoey33 = uoey14;
       uoey12 = new ey("CONN_BOSH_ERR", 32, 0x5013);
       ey.G = uoey12;
       ey uoey34 = uoey12;
       uoey14 = new ey("BIND_SUCCESS", 33, 0x7530);
       ey.H = uoey14;
       ey uoey35 = uoey14;
       uoey12 = new ey("BIND_TCP_READ_TIMEOUT_DEPRECTED", 34, 0x7595);
       ey.I = uoey12;
       ey uoey36 = uoey12;
       uoey14 = new ey("BIND_TCP_CONNRESET_DEPRECTED", 35, 0x7596);
       ey.J = uoey14;
       ey uoey37 = uoey14;
       uoey12 = new ey("BIND_TCP_BROKEN_PIPE_DEPRECTED", 36, 0x7597);
       ey.K = uoey12;
       ey uoey38 = uoey12;
       uoey14 = new ey("BIND_TCP_READ_TIMEOUT", 37, 0x759c);
       ey.L = uoey14;
       ey uoey39 = uoey14;
       uoey12 = new ey("BIND_TCP_CONNRESET", 38, 0x759d);
       ey.M = uoey12;
       ey uoey40 = uoey12;
       uoey14 = new ey("BIND_TCP_BROKEN_PIPE", 39, 0x759e);
       ey.N = uoey14;
       ey uoey41 = uoey14;
       uoey12 = new ey("BIND_TCP_ERR", 40, 0x75f7);
       ey.O = uoey12;
       ey uoey42 = uoey12;
       uoey14 = new ey("BIND_XMPP_ERR", 41, 0x76bf);
       ey.P = uoey14;
       ey uoey43 = uoey14;
       uoey12 = new ey("BIND_BOSH_ITEM_NOT_FOUND", 42, 0x76c1);
       ey.Q = uoey12;
       ey uoey44 = uoey12;
       uoey14 = new ey("BIND_BOSH_ERR", 43, 0x7723);
       ey.R = uoey14;
       ey uoey45 = uoey14;
       uoey12 = new ey("BIND_TIMEOUT", 44, 0x7725);
       ey.S = uoey12;
       ey uoey46 = uoey12;
       uoey14 = new ey("BIND_INVALID_SIG", 45, 0x7726);
       ey.T = uoey14;
       ey uoey47 = uoey14;
       uoey12 = new ey("CHANNEL_TCP_READTIMEOUT_DEPRECTED", 46, 0x9ca5);
       ey.U = uoey12;
       ey uoey48 = uoey12;
       uoey14 = new ey("CHANNEL_TCP_CONNRESET_DEPRECTED", 47, 0x9ca6);
       ey.V = uoey14;
       ey uoey49 = uoey14;
       uoey12 = new ey("CHANNEL_TCP_BROKEN_PIPE_DEPRECTED", 48, 0x9ca7);
       ey.W = uoey12;
       ey uoey50 = uoey12;
       uoey14 = new ey("CHANNEL_TCP_READTIMEOUT", 49, 0x9cac);
       ey.X = uoey14;
       ey uoey51 = uoey14;
       uoey12 = new ey("CHANNEL_TCP_CONNRESET", 50, 0x9cad);
       ey.Y = uoey12;
       ey uoey52 = uoey12;
       uoey14 = new ey("CHANNEL_TCP_BROKEN_PIPE", 51, 0x9cae);
       ey.Z = uoey14;
       ey uoey53 = uoey14;
       uoey12 = new ey("CHANNEL_TCP_ERR", 52, 0x9d07);
       ey.aa = uoey12;
       ey uoey54 = uoey12;
       uoey14 = new ey("CHANNEL_XMPPEXCEPTION", 53, 0x9dcf);
       ey.ab = uoey14;
       ey uoey55 = uoey14;
       uoey12 = new ey("CHANNEL_BOSH_ITEMNOTFIND", 54, 0x9dd1);
       ey.ac = uoey12;
       ey uoey56 = uoey12;
       uoey14 = new ey("CHANNEL_BOSH_EXCEPTION", 55, 0x9e33);
       ey.ad = uoey14;
       ey uoey57 = uoey14;
       uoey12 = new ey("CHANNEL_TIMER_DELAYED", 56, 0xc351);
       ey.ae = uoey12;
       ey[] uoeyArray = new ey[57];
       uoeyArray[0] = uoey;
       uoeyArray[1] = uoey1;
       uoeyArray[2] = uoey2;
       uoeyArray[3] = uoey3;
       uoeyArray[4] = uoey4;
       uoeyArray[5] = uoey5;
       uoeyArray[6] = uoey6;
       uoeyArray[7] = uoey7;
       uoeyArray[8] = uoey8;
       uoeyArray[9] = uoey9;
       uoeyArray[10] = uoey10;
       uoeyArray[11] = uoey11;
       uoeyArray[12] = uoey13;
       uoeyArray[13] = uoey15;
       uoeyArray[14] = uoey16;
       uoeyArray[15] = uoey17;
       uoeyArray[16] = uoey18;
       uoeyArray[17] = uoey19;
       uoeyArray[18] = uoey20;
       uoeyArray[19] = uoey21;
       uoeyArray[20] = uoey22;
       uoeyArray[21] = uoey23;
       uoeyArray[22] = uoey24;
       uoeyArray[23] = uoey25;
       uoeyArray[24] = uoey26;
       uoeyArray[25] = uoey27;
       uoeyArray[26] = uoey28;
       uoeyArray[27] = uoey29;
       uoeyArray[28] = uoey30;
       uoeyArray[29] = uoey31;
       uoeyArray[30] = uoey32;
       uoeyArray[31] = uoey33;
       uoeyArray[32] = uoey34;
       uoeyArray[33] = uoey35;
       uoeyArray[34] = uoey36;
       uoeyArray[35] = uoey37;
       uoeyArray[36] = uoey38;
       uoeyArray[37] = uoey39;
       uoeyArray[38] = uoey40;
       uoeyArray[39] = uoey41;
       uoeyArray[40] = uoey42;
       uoeyArray[41] = uoey43;
       uoeyArray[42] = uoey44;
       uoeyArray[43] = uoey45;
       uoeyArray[44] = uoey46;
       uoeyArray[45] = uoey47;
       uoeyArray[46] = uoey48;
       uoeyArray[47] = uoey49;
       uoeyArray[48] = uoey50;
       uoeyArray[49] = uoey51;
       uoeyArray[50] = uoey52;
       uoeyArray[51] = uoey53;
       uoeyArray[52] = uoey54;
       uoeyArray[53] = uoey55;
       uoeyArray[54] = uoey56;
       uoeyArray[55] = uoey57;
       uoeyArray[56] = uoey12;
       ey.a = uoeyArray;
    }
    public void ey(String p0,int p1,int p2){
       this.a = p2;
    }
    public static ey a(int p0){
       if (p0 == 0x7725) {
          return ey.S;
       }
       if (p0 == 0x7726) {
          return ey.T;
       }
       switch (p0){
           case 1:
             return ey.a;
           case 2:
             return ey.b;
           case 3:
             return ey.c;
           case 4:
             return ey.d;
           case 5:
             return ey.e;
           case 6:
             return ey.f;
           case 7:
             return ey.g;
           case 8:
             return ey.h;
           default:
             switch (p0){
                 case 8000:
                   return ey.k;
                 case 0x2710:
                   return ey.l;
                 case 0x27d7:
                   return ey.t;
                 case 0x2af7:
                   return ey.u;
                 case 0x4e20:
                   return ey.v;
                 case 0x4ee7:
                   return ey.D;
                 case 0x4faf:
                   return ey.E;
                 case 0x4fb7:
                   return ey.F;
                 case 0x5013:
                   return ey.G;
                 case 0x7530:
                   return ey.H;
                 case 0x75f7:
                   return ey.O;
                 case 0x76bf:
                   return ey.P;
                 case 0x76c1:
                   return ey.Q;
                 case 0x7723:
                   return ey.R;
                 case 0x9d07:
                   return ey.aa;
                 case 0x9dcf:
                   return ey.ab;
                 case 0x9dd1:
                   return ey.ac;
                 case 0x9e33:
                   return ey.ad;
                 case 0xc351:
                   return ey.ae;
                 default:
                   switch (p0){
                       case 0x2775:
                         return ey.m;
                       case 0x2776:
                         return ey.n;
                       case 0x2777:
                         return ey.o;
                       case 0x2778:
                         return ey.p;
                       case 0x2779:
                         return ey.q;
                       case 0x277a:
                         return ey.r;
                       case 0x277b:
                         return ey.s;
                       default:
                         switch (p0){
                             case 0x4e85:
                               return ey.w;
                             case 0x4e86:
                               return ey.x;
                             case 0x4e87:
                               return ey.y;
                             case 0x4e88:
                               return ey.z;
                             case 0x4e89:
                               return ey.A;
                             case 0x4e8a:
                               return ey.B;
                             case 0x4e8b:
                               return ey.C;
                             default:
                               switch (p0){
                                   case 0x7595:
                                     return ey.I;
                                   case 0x7596:
                                     return ey.J;
                                   case 0x7597:
                                     return ey.K;
                                   default:
                                     switch (p0){
                                         case 0x759c:
                                           return ey.L;
                                         case 0x759d:
                                           return ey.M;
                                         case 0x759e:
                                           return ey.N;
                                         default:
                                           switch (p0){
                                               case 0x9ca5:
                                                 return ey.U;
                                               case 0x9ca6:
                                                 return ey.V;
                                               case 0x9ca7:
                                                 return ey.W;
                                               default:
                                                 switch (p0){
                                                     case 0x9cac:
                                                       return ey.X;
                                                     case 0x9cad:
                                                       return ey.Y;
                                                     case 0x9cae:
                                                       return ey.Z;
                                                     default:
                                                       return null;
                                                 }
                                           }
                                     }
                               }
                         }
                   }
             }
       }
    }
    public static ey valueOf(String p0){
       return Enum.valueOf(ey.class, p0);
    }
    public static ey[] values(){
       return ey.a.clone();
    }
    public int a(){
       return this.a;
    }
}
