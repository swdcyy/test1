package c.t.m.g.dy;
import android.telephony.CellLocation;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import c.t.m.g.ce;
import android.telephony.TelephonyManager;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.String;
import c.t.m.g.ed;
import java.lang.Throwable;
import c.t.m.g.df$a;
import java.lang.Enum;
import android.telephony.SignalStrength;
import java.lang.Math;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import java.lang.Object;
import c.t.m.g.ef;
import java.lang.Class;
import c.t.m.g.df;
import java.util.List;
import java.util.ArrayList;

public class dy	// class@000c5b
{
    public static boolean a;

    public static int a(CellLocation p0){
       if (p0 instanceof CdmaCellLocation) {
          return p0.getBaseStationId();
       }
       try{
          return p0.getCid();
       }catch(java.lang.Exception e0){
          return -1;
       }
    }
    public static CellLocation a(ce p0){
       TelephonyManager telephonyMan = p0.b();
       if (telephonyMan != null) {
          int i = 1;
          try{
             CellLocation cellLocation = LocationInterceptor.getCellLocation(telephonyMan);
             boolean b = false;
             int i1 = (telephonyMan.getSimState() == 5)? 1: 0;
             if (i1) {
                boolean b1 = dy.a(p0.a);
                i1 = dy.a(cellLocation);
                if (cellLocation != null && (dy.b(cellLocation) || (i1 < 0 && !b1))) {
                   b = true;
                }
                dy.a = b;
                if (b) {
                   ed.a("CELL", "per:"+dy.a+",air:"+b1+",cid:"+i1);
                }
             }
             if (dy.a && ed.a) {
                ed.b("Cells", "location permission denied!");
             }
             return cellLocation;
          }catch(java.lang.Exception e6){
             dy.a = i;
             ed.a("CELL", "getCellLocation error.", e6);
          }
          return CellLocation.getEmpty();
       }else {
          goto label_0073 ;
       }
    }
    public static boolean a(int p0){
       boolean b = (p0 != df$a.c.ordinal())? true: false;
       return b;
    }
    public static boolean a(int p0,int p1,int p2,int p3,long p4){
       boolean b = true;
       if (dy.b(p0)) {
          if (p1 < 0 || (p2 < 0 || (p3 <= 0 || (p3 == Integer.MAX_VALUE || (p4 <= 0 || p4 - 0xffff >= 0))))) {
             b = false;
          }
          return b;
       }else if(p1 >= 0 && (p2 >= 0 && (p3 < 0 || (p3 != Integer.MAX_VALUE && (p4 - 0xfffffff && (p4 - 0x7fffffff && p4 - 0x3040101)))))){
          p0 = p4 - 0xffff;
          if (p0) {
             p1 = p4;
             if (p1 > 0) {
                if (!p0 || p1 <= 0) {
                   b = false;
                }
                return b;
             }
          }
       }
    label_0051 :
       return false;
    }
    public static boolean a(int p0,SignalStrength p1,SignalStrength p2){
       boolean b = true;
       if (p1 == null || p2 == null) {
          return b;
       }
       int i = Math.abs(dy.b(p0, p1, p2));
       if (dy.a(p0)) {
          if (i <= 3) {
             b = false;
          }
          return b;
       }else if(dy.b(p0)){
          if (i <= 6) {
             b = false;
          }
          return b;
       }else {
          return false;
       }
    }
    public static boolean a(Context p0){
       boolean b = false;
       if (Settings$Global.getInt(p0.getContentResolver(), "airplane_mode_on") == 1) {
          b = true;
       }
       return b;
    }
    public static boolean a(CellLocation p0,CellLocation p1){
       boolean b = false;
       if (ef.a(p0, p1)) {
          return b;
       }
       if (p0.getClass() != p1.getClass()) {
          return b;
       }
       if (p0 instanceof GsmCellLocation) {
          if (p0.getCid() == p1.getCid()) {
             b = true;
          }
          return b;
       }else if(p0 instanceof CdmaCellLocation && p0.getBaseStationId() == p1.getBaseStationId()){
          b = true;
       }
       return b;
    }
    public static boolean a(df p0){
       if (ef.a(p0)) {
          return false;
       }
       return dy.a(p0.a.ordinal(), p0.b, p0.c, p0.d, p0.f);
    }
    public static int b(int p0,SignalStrength p1,SignalStrength p2){
       if (dy.a(p0)) {
          return (p1.getGsmSignalStrength() - p2.getGsmSignalStrength());
       }
       if (dy.b(p0)) {
          return (p1.getCdmaDbm() - p2.getCdmaDbm());
       }
       return 0;
    }
    public static List b(ce p0){
       ed.b("Cells", "Get Cell Info");
       List allCellInfo = LocationInterceptor.getAllCellInfo(p0.b());
       if (allCellInfo != null) {
          return allCellInfo;
       }
       return new ArrayList();
    }
    public static boolean b(int p0){
       boolean b = (p0 == df$a.c.ordinal())? true: false;
       return b;
    }
    public static boolean b(CellLocation p0){
       try{
          if (!p0.getCid() && !p0.getLac()) {
             return true;
          }
          return false;
       }catch(java.lang.ClassCastException e0){
       }
    }
}
