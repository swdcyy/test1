package c.t.m.g.df;
import c.t.m.g.di;
import c.t.m.g.df$a;
import java.lang.System;
import java.util.ArrayList;
import android.telephony.CellIdentityNr;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.lang.StringBuilder;
import c.t.m.g.ed;
import java.lang.Throwable;
import c.t.m.g.ce;
import java.util.List;
import c.t.m.g.dy;
import android.telephony.CellLocation;
import android.telephony.SignalStrength;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import android.telephony.CellInfoCdma;
import android.telephony.CellIdentityCdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellIdentityGsm;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellInfoWcdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.CellInfoLte;
import android.telephony.CellIdentityLte;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellInfoNr;
import android.telephony.CellIdentity;
import android.telephony.CellSignalStrength;
import c.t.m.g.ec;
import android.content.Context;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.util.Iterator;
import c.t.m.g.cd;
import java.util.Collections;

public class df extends di	// class@000c41
{
    public df$a a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int h;
    public List i;
    public final long j;
    public boolean k;
    public List l;
    public List m;

    public void df(){
       super();
       this.a = df$a.a;
       this.b = 460;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = Integer.MAX_VALUE;
       this.h = Integer.MAX_VALUE;
       this.k = false;
       this.j = System.currentTimeMillis();
       this.i = new ArrayList();
    }
    public static int a(int p0){
       if (p0 < -140 || p0 > -40) {
          p0 = -1;
       }
       return p0;
    }
    public static int a(CellIdentityNr p0){
       if (p0 == null) {
          return Integer.MAX_VALUE;
       }
       int tac = p0.getTac();
       if (tac < 0 || tac >= 0xffff) {
          Class[] uClassArray = new Class[0];
          Method method = p0.getClass().getMethod("getHwTac", uClassArray);
          if (method != null) {
             Object[] objArray = new Object[0];
             Integer integer = method.invoke(p0, objArray);
             if (integer != null) {
                int i = integer.intValue();
                ed.a("TxCellInfo", "getHwTac "+i);
                tac = i;
             }
          }
       }
       return tac;
    }
    public static df a(ce p0){
       df uodf = df.a(p0, dy.b(p0));
       if (uodf == null || !uodf.a()) {
          uodf = df.a(p0, dy.a(p0), null);
       }
       return uodf;
    }
    public static df a(ce p0,CellInfo p1){
       int dbm;
       if (p1 == null || p0 == null) {
          return null;
       }
       TelephonyManager telephonyMan = p0.b();
       df uodf = new df();
       int i = -88;
       if (p1 instanceof CellInfoCdma) {
          CellIdentityCdma cellIdentity = p1.getCellIdentity();
          df$a c = df$a.c;
          uodf.a = c;
          uodf.a(telephonyMan, c);
          uodf.c = cellIdentity.getSystemId();
          uodf.d = cellIdentity.getNetworkId();
          uodf.f = (long)cellIdentity.getBasestationId();
          uodf.g = cellIdentity.getLatitude();
          uodf.h = cellIdentity.getLongitude();
          dbm = p1.getCellSignalStrength().getDbm();
          if (dbm > -110 && dbm < -40) {
             i = dbm;
          }
          uodf.e = i;
       }else if(p1 instanceof CellInfoGsm){
          uodf.a = df$a.b;
          CellIdentityGsm cellIdentity1 = p1.getCellIdentity();
          uodf.d = cellIdentity1.getLac();
          uodf.f = (long)cellIdentity1.getCid();
          uodf.b = cellIdentity1.getMcc();
          uodf.c = cellIdentity1.getMnc();
          dbm = p1.getCellSignalStrength().getDbm();
          if (dbm > -110 && dbm < -40) {
             i = dbm;
          }
          uodf.e = i;
       }else if(p1 instanceof CellInfoWcdma){
          uodf.a = df$a.d;
          CellIdentityWcdma cellIdentity2 = p1.getCellIdentity();
          uodf.d = cellIdentity2.getLac();
          uodf.f = (long)cellIdentity2.getCid();
          uodf.b = cellIdentity2.getMcc();
          uodf.c = cellIdentity2.getMnc();
          dbm = p1.getCellSignalStrength().getDbm();
          if (dbm > -110 && dbm < -40) {
             i = dbm;
          }
          uodf.e = i;
       }else if(p1 instanceof CellInfoLte){
          uodf.a = df$a.e;
          CellIdentityLte cellIdentity3 = p1.getCellIdentity();
          uodf.d = cellIdentity3.getTac();
          uodf.f = (long)cellIdentity3.getCi();
          uodf.b = cellIdentity3.getMcc();
          uodf.c = cellIdentity3.getMnc();
          dbm = p1.getCellSignalStrength().getDbm();
          if (dbm > -110 && dbm < -40) {
             i = dbm;
          }
          uodf.e = i;
       }else if(p1 instanceof CellInfoNr){
          uodf.a = df$a.f;
          CellIdentityNr cellIdentity4 = p1.getCellIdentity();
          uodf.c = Integer.parseInt(cellIdentity4.getMncString());
          uodf.b = Integer.parseInt(cellIdentity4.getMccString());
          uodf.d = df.a(cellIdentity4);
          uodf.f = cellIdentity4.getNci();
          uodf.e = df.a(p1.getCellSignalStrength().getDbm());
       }
       uodf.k = uodf.b();
       if (uodf.b == 460 && uodf.c == Integer.MAX_VALUE) {
          uodf.c = 0;
       }
       if (!ec.a().b(p0.a)) {
          uodf.a = df$a.i;
       }
       uodf.i.add(uodf.d());
       return uodf;
    }
    public static df a(ce p0,CellLocation p1,SignalStrength p2){
       df$a c;
       if (!p0.e() || p1 == null) {
          return null;
       }
       TelephonyManager telephonyMan = p0.b();
       df uodf = new df();
       if (p1 instanceof CdmaCellLocation) {
          c = df$a.c;
          uodf.a = c;
          uodf.a(telephonyMan, c);
          uodf.c = p1.getSystemId();
          uodf.d = p1.getNetworkId();
          uodf.f = (long)p1.getBaseStationId();
          uodf.g = p1.getBaseStationLatitude();
          uodf.h = p1.getBaseStationLongitude();
          uodf.e = (p2 == null)? -1: p2.getCdmaDbm();
       }else {
          c = df$a.b;
          uodf.a = c;
          uodf.a(telephonyMan, c);
          uodf.d = p1.getLac();
          uodf.f = (long)p1.getCid();
          uodf.e = (p2 == null)? -1: (p2.getGsmSignalStrength() * 2) - 113;
       }
    label_0080 :
       if (uodf.b()) {
          uodf.k = true;
       }
       if (!ec.a().b(p0.a)) {
          uodf.a = df$a.i;
       }
       uodf.i.add(uodf.d());
       return uodf;
    }
    public static df a(ce p0,List p1){
       if (p1 != null && (p0 == null || !p1.size())) {
          return new df();
       }
       ArrayList uArrayList = new ArrayList();
       df uodf = new df();
       Iterator iterator = p1.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          CellInfo uCellInfo = iterator.next();
          if (uCellInfo != null && uCellInfo.isRegistered()) {
             df uodf1 = df.a(p0, uCellInfo);
             if (uodf1.b()) {
                uodf.i.add(uodf1.d());
                if (i) {
                   i = 0;
                   uodf1.k = true;
                   uodf = uodf1;
                }else {
                   uArrayList.add(uodf1);
                }
             }else {
                cd.c().a("Cells", "invalid!"+uodf1.e());
             }
          }
       }
       uodf.m = uArrayList;
       return uodf;
    }
    public final void a(TelephonyManager p0,df$a p1){
       String networkOpera = p0.getNetworkOperator();
       if (ed.a) {
          ed.b("Cells", "MCCMNC:"+networkOpera);
       }
       int i = 460;
       int i1 = 0;
       if (networkOpera != null) {
          int i2 = 5;
          if (networkOpera.length() >= i2) {
             int i3 = 3;
             int i4 = Integer.parseInt(networkOpera.substring(i1, i3));
             i2 = Integer.parseInt(networkOpera.substring(i3, i2));
             i = (i4 == i && i2 == i3)? 1: 0;
             if (i && (p1 != df$a.c && networkOpera.length() == 11)) {
                i2 = Integer.parseInt(networkOpera.substring(9, 11));
             }
          label_005e :
             if (!i) {
                i1 = i2;
             }
             i = i4;
          }
       }
       if (i > 0 && i1 >= 0) {
          this.b = i;
          this.c = i1;
       }
       return;
    }
    public synchronized void a(List p0){
       this.l = (p0 != null)? Collections.unmodifiableList(p0): Collections.emptyList();
       return;
    }
    public boolean a(){
       return this.k;
    }
    public boolean a(long p0){
       boolean b = ((System.currentTimeMillis() - this.j) - p0 < 0)? true: false;
       return b;
    }
    public boolean b(){
       df tb;
       df tc;
       boolean b = true;
       int i = 0xffff;
       int i1 = 0xffff;
       if (this.a != df$a.c) {
          tb = this.b;
          if (tb >= null) {
             tc = this.c;
             if (tc >= null && (tb != 535 && tc != 535)) {
                tb = this.d;
                if (tb >= null && (tb != i1 && tb != 0x64f0)) {
                   tb = this.f;
                   if (tb - i && (tb - 0xfffffff && (tb - 0x7fffffff && (tb - 0x3040101 && (tb - 8 && (tb - 10 && (tb - 33 && tb > 0))))))) {
                   label_005b :
                      return b;
                   }
                }
             }
          }
       label_005a :
          b = false;
          goto label_005b ;
       }else {
          tb = this.b;
          if (tb >= null) {
             tc = this.c;
             if (tc >= null && (tb != 535 && tc != 535)) {
                tb = this.d;
                if (tb >= null && tb != i1) {
                   tb = this.f;
                   if (tb - i && tb > 0) {
                   label_007a :
                      return b;
                   }
                }
             }
          }
          b = false;
          goto label_007a ;
       }
    }
    public synchronized List c(){
       if (this.l == null) {
          this.l = Collections.emptyList();
       }
       return this.l;
    }
    public String d(){
       return this.b+this.c+this.d+this.f;
    }
    public String e(){
       return this.b+","+this.c+","+this.d+","+this.f+","+this.e;
    }
    public String toString(){
       return "TxCellInfo [PhoneType="+this.a+", MCC="+this.b+", MNC="+this.c+", LAC="+this.d+", CID="+this.f+", RSSI="+this.e+", LAT="+this.g+", LNG="+this.h+", mTime="+this.j+"]";
    }
}
