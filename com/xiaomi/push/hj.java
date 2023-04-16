package com.xiaomi.push.hj;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class hj extends Enum	// class@001112
{
    public final int a;
    public static final hj a;
    public static final hj[] a;
    public static final hj b;
    public static final hj c;
    public static final hj d;
    public static final hj e;
    public static final hj f;
    public static final hj g;
    public static final hj h;
    public static final hj i;
    public static final hj j;
    public static final hj k;
    public static final hj l;
    public static final hj m;
    public static final hj n;
    public static final hj o;
    public static final hj p;
    public static final hj q;
    public static final hj r;
    public static final hj s;
    public static final hj t;
    public static final hj u;
    public static final hj v;
    public static final hj w;
    public static final hj x;

    static {
       hj ohj = new hj("DeviceInfo", 0, 1);
       hj.a = ohj;
       hj ohj1 = new hj("AppInstallList", 1, 2);
       hj.b = ohj1;
       hj ohj2 = new hj("AppActiveList", 2, 3);
       hj.c = ohj2;
       hj ohj3 = new hj("Bluetooth", 3, 4);
       hj.d = ohj3;
       hj ohj4 = new hj("Location", 4, 5);
       hj.e = ohj4;
       hj ohj5 = new hj("Account", 5, 6);
       hj.f = ohj5;
       hj ohj6 = new hj("WIFI", 6, 7);
       hj.g = ohj6;
       hj ohj7 = new hj("Cellular", 7, 8);
       hj.h = ohj7;
       hj ohj8 = new hj("TopApp", 8, 9);
       hj.i = ohj8;
       hj ohj9 = new hj("BroadcastAction", 9, 10);
       hj.j = ohj9;
       hj ohj10 = new hj("BroadcastActionAdded", 10, 11);
       hj.k = ohj10;
       hj ohj11 = new hj("BroadcastActionRemoved", 11, 12);
       hj.l = ohj11;
       hj ohj12 = new hj("BroadcastActionReplaced", 12, 13);
       hj.m = ohj12;
       hj ohj13 = ohj12;
       hj ohj14 = new hj("BroadcastActionDataCleared", 13, 14);
       hj.n = ohj14;
       hj ohj15 = ohj14;
       hj ohj16 = new hj("BroadcastActionRestarted", 14, 15);
       hj.o = ohj16;
       hj ohj17 = ohj16;
       hj ohj18 = new hj("BroadcastActionChanged", 15, 16);
       hj.p = ohj18;
       hj ohj19 = ohj18;
       ohj12 = new hj("AppPermission", 16, 17);
       hj.q = ohj12;
       hj ohj20 = ohj12;
       ohj14 = new hj("WifiDevicesMac", 17, 18);
       hj.r = ohj14;
       hj ohj21 = ohj14;
       ohj16 = new hj("ActivityActiveTimeStamp", 18, 19);
       hj.s = ohj16;
       hj ohj22 = ohj16;
       ohj18 = new hj("DeviceBaseInfo", 19, 20);
       hj.t = ohj18;
       hj ohj23 = ohj18;
       ohj12 = new hj("DeviceInfoV2", 20, 21);
       hj.u = ohj12;
       hj ohj24 = ohj12;
       ohj14 = new hj("Battery", 21, 22);
       hj.v = ohj14;
       hj ohj25 = ohj14;
       ohj16 = new hj("Storage", 22, 23);
       hj.w = ohj16;
       hj ohj26 = ohj16;
       ohj18 = new hj("AppIsInstalled", 23, 24);
       hj.x = ohj18;
       hj[] ohjArray = new hj[24];
       ohjArray[0] = ohj;
       ohjArray[1] = ohj1;
       ohjArray[2] = ohj2;
       ohjArray[3] = ohj3;
       ohjArray[4] = ohj4;
       ohjArray[5] = ohj5;
       ohjArray[6] = ohj6;
       ohjArray[7] = ohj7;
       ohjArray[8] = ohj8;
       ohjArray[9] = ohj9;
       ohjArray[10] = ohj10;
       ohjArray[11] = ohj11;
       ohjArray[12] = ohj13;
       ohjArray[13] = ohj15;
       ohjArray[14] = ohj17;
       ohjArray[15] = ohj19;
       ohjArray[16] = ohj20;
       ohjArray[17] = ohj21;
       ohjArray[18] = ohj22;
       ohjArray[19] = ohj23;
       ohjArray[20] = ohj24;
       ohjArray[21] = ohj25;
       ohjArray[22] = ohj26;
       ohjArray[23] = ohj18;
       hj.a = ohjArray;
    }
    public void hj(String p0,int p1,int p2){
       this.a = p2;
    }
    public static hj a(int p0){
       switch (p0){
           case 1:
             return hj.a;
           case 2:
             return hj.b;
           case 3:
             return hj.c;
           case 4:
             return hj.d;
           case 5:
             return hj.e;
           case 6:
             return hj.f;
           case 7:
             return hj.g;
           case 8:
             return hj.h;
           case 9:
             return hj.i;
           case 10:
             return hj.j;
           case 11:
             return hj.k;
           case 12:
             return hj.l;
           case 13:
             return hj.m;
           case 14:
             return hj.n;
           case 15:
             return hj.o;
           case 16:
             return hj.p;
           case 17:
             return hj.q;
           case 18:
             return hj.r;
           case 19:
             return hj.s;
           case 20:
             return hj.t;
           case 21:
             return hj.u;
           case 22:
             return hj.v;
           case 23:
             return hj.w;
           case 24:
             return hj.x;
           default:
             return null;
       }
    }
    public static hj valueOf(String p0){
       return Enum.valueOf(hj.class, p0);
    }
    public static hj[] values(){
       return hj.a.clone();
    }
    public int a(){
       return this.a;
    }
}
