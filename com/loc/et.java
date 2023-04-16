package com.loc.et;
import android.content.Context;
import android.os.Handler;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.loc.fq;
import android.telephony.TelephonyManager;
import com.loc.er;
import com.loc.ep;
import com.loc.es;
import android.telephony.CellInfoGsm;
import android.telephony.CellIdentityGsm;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellIdentityLte;
import android.telephony.CellSignalStrengthLte;
import android.os.Build$VERSION;
import android.telephony.CellInfoNr;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityNr;
import android.os.Build;
import com.loc.fm;
import java.lang.Throwable;
import java.lang.Integer;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.CellLocation;
import java.util.List;
import com.loc.ek;
import android.telephony.CellInfoCdma;
import android.telephony.CellIdentityCdma;
import android.telephony.CellSignalStrengthCdma;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import java.util.Iterator;
import android.telephony.CellInfo;
import com.loc.ds;
import com.loc.dr;
import com.loc.dt;
import com.loc.du;
import com.loc.dv;
import android.telephony.gsm.GsmCellLocation;
import android.telephony.SignalStrength;
import android.telephony.cdma.CdmaCellLocation;
import java.lang.Math;
import android.telephony.PhoneStateListener;
import com.loc.fj;
import java.lang.SecurityException;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.pm.ApplicationInfo;
import com.loc.et$a;
import com.loc.cj;
import java.util.concurrent.Executor;
import com.loc.cl;
import android.telephony.TelephonyManager$CellInfoCallback;
import java.lang.Thread;
import java.lang.StringBuilder;
import android.net.NetworkInfo;
import com.loc.et$b;
import java.lang.Exception;

public final class et	// class@00141a
{
    public ArrayList a;
    public TelephonyManager b;
    public PhoneStateListener c;
    public SignalStrength d;
    public boolean e;
    public StringBuilder f;
    public String g;
    public Context h;
    public boolean i;
    public boolean j;
    public String k;
    public ArrayList l;
    public er m;
    public long n;
    public boolean o;
    public Object p;
    public TelephonyManager$CellInfoCallback q;
    public boolean r;
    public String s;
    public String t;
    public ek u;

    public void et(Context p0,Handler p1){
       super();
       this.i = false;
       this.j = false;
       this.a = new ArrayList();
       this.k = null;
       this.l = new ArrayList();
       this.b = null;
       this.m = null;
       this.n = 0;
       this.c = null;
       this.o = false;
       this.p = new Object();
       this.r = false;
       this.e = false;
       this.f = null;
       this.s = null;
       this.t = null;
       this.g = null;
       this.h = p0;
       this.b = fq.a(p0, "phone");
       this.o();
       er uoer = new er(p0, "cellAge", p1);
       this.m = uoer;
       uoer.a();
    }
    public static long a(et p0){
       return p0.n;
    }
    public static long a(et p0,long p1){
       p0.n = p1;
       return p1;
    }
    public static es a(int p0,boolean p1,int p2,int p3,int p4,int p5,int p6){
       es uoes = new es(p0, p1);
       uoes.a = p2;
       uoes.b = p3;
       uoes.c = p4;
       uoes.d = p5;
       uoes.k = p6;
       return uoes;
    }
    public static es a(CellInfoGsm p0,boolean p1){
       if (p0 == null || p0.getCellIdentity() == null) {
          return null;
       }
       CellIdentityGsm cellIdentity = p0.getCellIdentity();
       int mcc = cellIdentity.getMcc();
       int mnc = cellIdentity.getMnc();
       int lac = cellIdentity.getLac();
       int cid = cellIdentity.getCid();
       es uoes = et.a(1, p1, mcc, mnc, lac, cid, p0.getCellSignalStrength().getDbm());
       uoes.o = p0.getCellIdentity().getBsic();
       uoes.p = p0.getCellIdentity().getArfcn();
       uoes.q = p0.getCellSignalStrength().getTimingAdvance();
       uoes.s = p0.getCellSignalStrength().getDbm();
       return uoes;
    }
    public static es a(CellInfoLte p0,boolean p1){
       if (p0 == null || p0.getCellIdentity() == null) {
          return null;
       }
       CellIdentityLte cellIdentity = p0.getCellIdentity();
       es uoes = et.a(3, p1, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getTac(), cellIdentity.getCi(), p0.getCellSignalStrength().getDbm());
       uoes.o = cellIdentity.getPci();
       if (Build$VERSION.SDK_INT >= 24) {
          uoes.p = cellIdentity.getEarfcn();
       }
       uoes.q = p0.getCellSignalStrength().getTimingAdvance();
       uoes.s = p0.getCellSignalStrength().getDbm();
       return uoes;
    }
    public static es a(CellInfoNr p0,boolean p1){
       if (p0 == null || p0.getCellIdentity() == null) {
          return null;
       }
       CellIdentityNr cellIdentity = p0.getCellIdentity();
       int tac = cellIdentity.getTac();
       int i = 0;
       if (tac == Integer.MAX_VALUE && ("HUAWEI").equals(Build.MANUFACTURER)) {
          Object[] objArray = new Object[i];
          tac = fm.b(cellIdentity, "getHwTac", objArray);
       }
    label_0031 :
       long nci = cellIdentity.getNci();
       int i1 = Integer.parseInt(cellIdentity.getMccString());
       int i2 = Integer.parseInt(cellIdentity.getMncString());
       es uoes = et.a(5, p1, i1, i2, cellIdentity.getTac(), 0, p0.getCellSignalStrength().getSsRsrp());
       uoes.e = nci;
       if (tac > 0xffffff) {
          uoes.c = 0xffff;
       }else if(tac > 0xffff){
          uoes.c = 0xffff;
          uoes.q = tac;
       }else {
          uoes.c = tac;
       }
       uoes.o = cellIdentity.getPci();
       uoes.p = cellIdentity.getNrarfcn();
       uoes.s = p0.getCellSignalStrength().getDbm();
       return uoes;
    }
    public static es a(CellInfoWcdma p0,boolean p1){
       if (p0 == null || p0.getCellIdentity() == null) {
          return null;
       }
       CellIdentityWcdma cellIdentity = p0.getCellIdentity();
       es uoes = et.a(4, p1, cellIdentity.getMcc(), cellIdentity.getMnc(), cellIdentity.getLac(), cellIdentity.getCid(), p0.getCellSignalStrength().getDbm());
       uoes.o = cellIdentity.getPsc();
       uoes.p = p0.getCellIdentity().getUarfcn();
       uoes.s = p0.getCellSignalStrength().getDbm();
       return uoes;
    }
    public static void a(et p0,CellLocation p1){
       p0.a(p1);
    }
    public static boolean a(int p0){
       if (p0 <= 0 || p0 > 15) {
          return false;
       }
       return true;
    }
    public static int b(int p0){
       return ((p0 * 2) - 113);
    }
    public static boolean b(et p0){
       p0.r = true;
       return true;
    }
    public static CellLocation c(et p0){
       return p0.t();
    }
    public static List d(et p0){
       return p0.u();
    }
    public static ek e(et p0){
       return p0.u;
    }
    public final es a(CellInfoCdma p0,boolean p1){
       es uoes = null;
       if (p0 != null && p0.getCellIdentity() != null) {
          CellIdentityCdma cellIdentity = p0.getCellIdentity();
          if (cellIdentity.getSystemId() > 0 && (cellIdentity.getNetworkId() >= 0 && cellIdentity.getBasestationId() >= 0)) {
             CellIdentityCdma cellIdentity1 = p0.getCellIdentity();
             String[] stringArray = fq.a(this.b);
             int i = Integer.parseInt(stringArray[1]);
             int i1 = Integer.parseInt(stringArray[0]);
             es uoes1 = et.a(2, p1, i1, i, 0, 0, p0.getCellSignalStrength().getCdmaDbm());
             uoes1.h = cellIdentity1.getSystemId();
             uoes1.i = cellIdentity1.getNetworkId();
             uoes1.j = cellIdentity1.getBasestationId();
             uoes1.f = cellIdentity1.getLatitude();
             uoes1.g = cellIdentity1.getLongitude();
             uoes1.s = p0.getCellSignalStrength().getCdmaDbm();
             return uoes1;
          }
       }
    label_0077 :
       return uoes;
    }
    public final List a(){
       CellInfo uCellInfo1;
       CellIdentityCdma cellIdentity;
       ds uods;
       ArrayList uArrayList = new ArrayList();
       List allCellInfo = LocationInterceptor.getAllCellInfo(this.b);
       if (allCellInfo != null) {
          Iterator iterator = allCellInfo.iterator();
          while (iterator.hasNext()) {
             CellInfo uCellInfo = iterator.next();
             boolean b = true;
             if (uCellInfo instanceof CellInfoCdma) {
                uCellInfo1 = uCellInfo;
                cellIdentity = uCellInfo1.getCellIdentity();
                uods = new ds(uCellInfo.isRegistered(), b);
                uods.m = cellIdentity.getLatitude();
                uods.n = cellIdentity.getLongitude();
                uods.j = cellIdentity.getSystemId();
                uods.k = cellIdentity.getNetworkId();
                uods.l = cellIdentity.getBasestationId();
                uods.d = uCellInfo1.getCellSignalStrength().getAsuLevel();
                uods.c = uCellInfo1.getCellSignalStrength().getCdmaDbm();
             }else {
                cellIdentity = 24;
                if (uCellInfo instanceof CellInfoGsm) {
                   uCellInfo1 = uCellInfo;
                   CellIdentityGsm cellIdentity1 = uCellInfo1.getCellIdentity();
                   dt uodt = new dt(uCellInfo.isRegistered(), b);
                   uodt.a = String.valueOf(cellIdentity1.getMcc());
                   uodt.b = String.valueOf(cellIdentity1.getMnc());
                   uodt.j = cellIdentity1.getLac();
                   uodt.k = cellIdentity1.getCid();
                   uodt.c = uCellInfo1.getCellSignalStrength().getDbm();
                   uodt.d = uCellInfo1.getCellSignalStrength().getAsuLevel();
                   if (Build$VERSION.SDK_INT >= cellIdentity) {
                      uodt.m = cellIdentity1.getArfcn();
                      uodt.n = cellIdentity1.getBsic();
                   }
                   uArrayList.add(uodt);
                }else if(uCellInfo instanceof CellInfoLte){
                   uCellInfo1 = uCellInfo;
                   CellIdentityLte cellIdentity2 = uCellInfo1.getCellIdentity();
                   uods = new du(uCellInfo.isRegistered());
                   uods.a = String.valueOf(cellIdentity2.getMcc());
                   uods.b = String.valueOf(cellIdentity2.getMnc());
                   uods.l = cellIdentity2.getPci();
                   uods.d = uCellInfo1.getCellSignalStrength().getAsuLevel();
                   uods.k = cellIdentity2.getCi();
                   uods.j = cellIdentity2.getTac();
                   uods.n = uCellInfo1.getCellSignalStrength().getTimingAdvance();
                   uods.c = uCellInfo1.getCellSignalStrength().getDbm();
                   if (Build$VERSION.SDK_INT >= cellIdentity) {
                      uods.m = cellIdentity2.getEarfcn();
                   }
                }else {
                   int sDK_INT = Build$VERSION.SDK_INT;
                   if (uCellInfo instanceof CellInfoWcdma) {
                      CellInfo uCellInfo2 = uCellInfo;
                      CellIdentityWcdma cellIdentity3 = uCellInfo2.getCellIdentity();
                      dv uodv = new dv(uCellInfo.isRegistered(), b);
                      uodv.a = String.valueOf(cellIdentity3.getMcc());
                      uodv.b = String.valueOf(cellIdentity3.getMnc());
                      uodv.j = cellIdentity3.getLac();
                      uodv.k = cellIdentity3.getCid();
                      uodv.l = cellIdentity3.getPsc();
                      uodv.d = uCellInfo2.getCellSignalStrength().getAsuLevel();
                      uodv.c = uCellInfo2.getCellSignalStrength().getDbm();
                      if (sDK_INT >= cellIdentity) {
                         uodv.m = cellIdentity3.getUarfcn();
                      }
                      uArrayList.add(uodv);
                   }
                }
             }
             uArrayList.add(uods);
          }
       }
       return uArrayList;
    }
    public synchronized final void a(CellLocation p0){
       es uoes;
       et td;
       String[] stringArray = fq.a(this.b);
       this.a.clear();
       if (p0 instanceof GsmCellLocation) {
          uoes = new es(1, 1);
          uoes.a = fq.e(stringArray[0]);
          uoes.b = fq.e(stringArray[1]);
          uoes.c = p0.getLac();
          uoes.d = p0.getCid();
          td = this.d;
          if (td != null) {
             int gsmSignalStr = td.getGsmSignalStrength();
             gsmSignalStr = (gsmSignalStr == 99)? Integer.MAX_VALUE: et.b(gsmSignalStr);
             uoes.s = gsmSignalStr;
          }
          uoes.r = false;
          this.m.a(uoes);
          this.a.add(uoes);
          return;
       }else if(p0 instanceof CdmaCellLocation){
          uoes = new es(2, 1);
          uoes.a = Integer.parseInt(stringArray[0]);
          uoes.b = Integer.parseInt(stringArray[1]);
          uoes.f = p0.getBaseStationLatitude();
          uoes.g = p0.getBaseStationLongitude();
          uoes.h = p0.getSystemId();
          uoes.i = p0.getNetworkId();
          uoes.j = p0.getBaseStationId();
          td = this.d;
          if (td != null) {
             uoes.s = td.getCdmaDbm();
          }
          uoes.r = false;
          this.m.a(uoes);
          this.a.add(uoes);
       }
       return;
    }
    public final void a(ek p0){
       this.u = p0;
    }
    public synchronized final void a(List p0){
       et tl = this.l;
       if (tl != null) {
          tl.clear();
       }
       if (p0 == null || p0.size() <= 0) {
          return;
       }else {
          int i = 0;
          while (i < p0.size()) {
             CellInfo uCellInfo = p0.get(i);
             if (uCellInfo != null) {
                es uoes = null;
                boolean b = uCellInfo.isRegistered();
                if (uCellInfo instanceof CellInfoCdma) {
                   uoes = this.a(uCellInfo, b);
                }else if(uCellInfo instanceof CellInfoGsm){
                   uoes = et.a(uCellInfo, b);
                }else if(uCellInfo instanceof CellInfoWcdma){
                   uoes = et.a(uCellInfo, b);
                }else if(uCellInfo instanceof CellInfoLte){
                   uoes = et.a(uCellInfo, b);
                }else if(Build$VERSION.SDK_INT >= 29 && uCellInfo instanceof CellInfoNr){
                   uoes = et.a(uCellInfo, b);
                }
                if (uoes != null) {
                   this.m.a(uoes);
                   uoes.m = (short)(int)Math.min(0xffff, this.m.e(uoes));
                   uoes.r = true;
                   this.l.add(uoes);
                }
             }
             i = i + 1;
          }
          this.i = false;
          et tl1 = this.l;
          if (tl1 != null && tl1.size() > 0) {
             this.i = true;
          }
          return;
       }
    }
    public final void a(boolean p0){
       this.m.a(p0);
       this.n = 0;
       et tp = this.p;
       _monitor_enter(tp);
       this.o = true;
       _monitor_exit(tp);
       tp = this.b;
       if (tp != null) {
          et tc = this.c;
          if (tc != null) {
             tp.listen(tc, 0);
          }
       }
       this.c = null;
       this.d = null;
       this.b = null;
       return;
    }
    public final void a(boolean p0,boolean p1){
       try{
          this.e = fq.a(this.h);
          if (this.s()) {
             this.b(p0, p1);
             this.a(this.t());
             this.a(this.u());
          }
          if (this.e != null) {
             this.j();
          }
          return;
       }catch(java.lang.SecurityException e2){
          this.g = e2.getMessage();
          return;
       }
    }
    public final void b(){
       int i = 0;
       if (Build$VERSION.SDK_INT >= 31) {
          String str = (!this.h.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION"))? "hasFineLocPerm": "hasNoFineLocPerm";
          String str1 = (!this.h.checkSelfPermission("android.permission.READ_PHONE_STATE"))? "hasReadPhoneStatePerm": "hasNoReadPhoneStatePerm";
          int i1 = 1;
          if (!TextUtils.isEmpty(this.t) && !(this.t).equals(str)) {
             i = 1;
          }
          if (TextUtils.isEmpty(this.s) || (this.s).equals(str1)) {
             i1 = i;
          }
          if (i1) {
             this.p();
          }
       }
       return;
    }
    public final void b(boolean p0,boolean p1){
       if (this.e == null && this.b != null) {
          cj uocj = 29;
          if (Build$VERSION.SDK_INT >= uocj && this.h.getApplicationInfo().targetSdkVersion >= uocj) {
             if (this.q == null) {
                this.q = new et$a(this);
             }
             LocationInterceptor.requestCellInfoUpdate(this.b, cj.a().b(), this.q);
             if (p1 || p0) {
                int i = 0;
                while (this.r == null && i < 20) {
                   Thread.sleep(5);
                   i++;
                }
             }
          }
       }
    label_0048 :
       this.j = false;
       et tb = this.b;
       if (tb != null) {
          String networkOpera = tb.getNetworkOperator();
          this.k = networkOpera;
          if (!TextUtils.isEmpty(networkOpera)) {
             this.j = true;
          }
       }
       this.n = fq.b();
       return;
    }
    public synchronized final ArrayList c(){
       ArrayList uArrayList = new ArrayList();
       et ta = this.a;
       if (ta != null) {
          Iterator iterator = ta.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().d());
          }
       }
       return uArrayList;
    }
    public synchronized final ArrayList d(){
       ArrayList uArrayList = new ArrayList();
       et tl = this.l;
       if (tl != null) {
          Iterator iterator = tl.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().d());
          }
       }
       return uArrayList;
    }
    public synchronized final es e(){
       es uoes = null;
       if (this.e != null) {
          return uoes;
       }
       et ta = this.a;
       if (ta.size() > 0) {
          return ta.get(0).d();
       }
       return uoes;
    }
    public synchronized final es f(){
       es uoes1;
       es uoes = null;
       if (this.e != null) {
          return uoes;
       }
       et tl = this.l;
       if (tl.size() <= 0) {
          return uoes;
       }
       Iterator iterator = tl.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return tl.get(0).d();
          }
          uoes1 = iterator.next();
          if (uoes1.n != null) {
             break ;
          }
       }
       return uoes1.d();
    }
    public final int g(){
       int i = this.q();
       int i1 = 0;
       int i2 = (this.i != null)? 4: 0;
       i = i | i2;
       if (this.j != null) {
          i1 = 8;
       }
       return (i | i1);
    }
    public final int h(){
       return (this.q() & 0x03);
    }
    public final TelephonyManager i(){
       return this.b;
    }
    public synchronized final void j(){
       this.g = null;
       this.a.clear();
       this.l.clear();
       this.i = false;
       this.j = false;
    }
    public final String k(){
       return this.g;
    }
    public final String l(){
       return this.k;
    }
    public synchronized final String m(){
       int i;
       StringBuilder str;
       if (this.e != null) {
          this.j();
       }
       et tf = this.f;
       if (tf == null) {
          this.f = "";
       }else {
          tf.delete(0, tf.length());
       }
       if (this.h() == 1) {
          for (i = 1; i < this.a.size(); i = i + 1) {
             StringBuilder str1 = this.f+"#"+this.a.get(i).b;
             str1 = this.f+"|"+this.a.get(i).c;
             str1 = this.f+"|"+this.a.get(i).d;
          }
       }
       i = 1;
       while (i < this.l.size()) {
          es uoes = this.l.get(i);
          es l = uoes.l;
          if (l != 1 && (l != 3 && (l == 4 || l == 5))) {
             str = this.f+"#"+uoes.l;
             str = this.f+"|"+uoes.a;
             str = this.f+"|"+uoes.b;
             str = this.f+"|"+uoes.c;
             str = this.f+"|"+uoes.a();
          }else if(l == 2){
             str = this.f+"#"+uoes.l;
             str = this.f+"|"+uoes.a;
             str = this.f+"|"+uoes.h;
             str = this.f+"|"+uoes.i;
             str = this.f+"|"+uoes.j;
          }
          i = i + 1;
       }
       if ((this.f).length() > 0) {
          (this.f).deleteCharAt(0);
       }
       return this.f;
    }
    public final boolean n(){
       boolean b = true;
       et tb = this.b;
       if (tb != null) {
          if (!TextUtils.isEmpty(tb.getSimOperator())) {
             return b;
          }else if(!TextUtils.isEmpty(this.b.getSimCountryIso())){
             return b;
          }
       }
       int i = fq.a(fq.c(this.h));
       if (i && (i != 4 && (i != 2 && (i == 5 || i == 3)))) {
          return b;
       }else {
          return false;
       }
    }
    public final void o(){
       if (this.b == null) {
          return;
       }
       this.p();
       return;
    }
    public final void p(){
       try{
          if (this.c == null) {
             this.c = new et$b(this);
          }
          int i = 320;
          int sDK_INT = Build$VERSION.SDK_INT;
          String str = "hasFineLocPerm";
          String str1 = "android.permission.ACCESS_FINE_LOCATION";
          int i1 = 31;
          if (sDK_INT >= i1) {
             if (!this.h.checkSelfPermission(str1)) {
                this.t = str;
             }else {
                this.t = "hasNoFineLocPerm";
             label_002b :
                if (sDK_INT >= i1) {
                   int i2 = 1;
                   String str2 = (!this.h.checkSelfPermission("android.permission.READ_PHONE_STATE"))? 1: null;
                   if (this.h.checkSelfPermission(str1)) {
                      i2 = 0;
                   }
                   if (str2 && i2) {
                      i = i | 0x0400;
                   }
                   str2 = (str2)? "hasReadPhoneStatePerm": "hasNoReadPhoneStatePerm";
                   this.s = str2;
                   if (!i2) {
                      str = "hasNoFineLocPerm";
                   }
                   this.t = str;
                }else {
                   i = i | 0x0400;
                }
                et tc = this.c;
                if (tc != null) {
                   this.b.listen(tc, i);
                }
                return;
             }
          }
          i = 336;
          goto label_002b ;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return;
       }
    }
    public final int q(){
       int i;
       es uoes = this.e();
       uoes = (uoes != null)? uoes.l: 0;
       return uoes;
    }
    public final CellLocation r(){
       et tb = this.b;
       if (tb != null) {
          try{
             this.g = null;
             return LocationInterceptor.getCellLocation(tb);
          }catch(java.lang.SecurityException e0){
             this.g = e0.getMessage();
          }
       label_001e :
          return v1;
       }else {
          goto label_001e ;
       }
    }
    public final boolean s(){
       boolean b = false;
       if (this.e != null) {
       }else if((fq.b() - this.n) - 0xafc8 < 0){
          b = true;
       }
       return b;
    }
    public final CellLocation t(){
       if (this.b == null) {
          return null;
       }
       return this.r();
    }
    public final List u(){
       List allCellInfo;
       if (fq.c() < 18) {
          return null;
       }
       et tb = this.b;
       if (tb == null) {
          return null;
       }
       try{
          allCellInfo = LocationInterceptor.getAllCellInfo(tb);
          try{
             this.g = null;
          label_0020 :
             return allCellInfo;
          }catch(java.lang.SecurityException e2){
          }
          this.g = e2.getMessage();
          goto label_0020 ;
       }catch(java.lang.SecurityException e2){
          allCellInfo = null;
          goto label_001a ;
       }
    }
}
