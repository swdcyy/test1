package ekd.m$a;
import android.telephony.CellInfo;
import java.lang.Object;
import android.telephony.CellInfoGsm;
import android.telephony.CellIdentityGsm;
import android.os.Build$VERSION;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellInfoCdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellIdentityTdscdma;
import java.lang.String;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellInfoLte;
import android.telephony.CellIdentityLte;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellInfoNr;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityNr;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthNr;
import android.os.SystemClock;
import java.lang.Integer;

public class m$a	// class@000d5d
{
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;

    public void m$a(CellInfo p0){
       super();
       this.a = -1;
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.j = -1;
       this.k = -1;
       this.l = -1;
       int i = 24;
       long l = 30;
       if (p0 instanceof CellInfoGsm) {
          CellInfoGsm uCellInfoGsm = p0;
          CellIdentityGsm cellIdentity = uCellInfoGsm.getCellIdentity();
          this.a = cellIdentity.getMcc();
          this.b = cellIdentity.getMnc();
          this.c = cellIdentity.getLac();
          this.d = (long)cellIdentity.getCid();
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT >= i) {
             this.e = cellIdentity.getArfcn();
          }
          CellSignalStrengthGsm cellSignalSt = uCellInfoGsm.getCellSignalStrength();
          if (sDK_INT >= l) {
             this.g = cellSignalSt.getRssi();
          }
          this.l = cellSignalSt.getDbm();
       }else if(p0 instanceof CellInfoCdma){
          CellSignalStrengthCdma cellSignalSt1 = p0.getCellSignalStrength();
          this.g = cellSignalSt1.getCdmaDbm();
          this.l = cellSignalSt1.getDbm();
       }else if(p0 instanceof CellInfoWcdma){
          CellInfoWcdma uCellInfoWcd = p0;
          CellIdentityWcdma cellIdentity1 = uCellInfoWcd.getCellIdentity();
          this.a = cellIdentity1.getMcc();
          this.b = cellIdentity1.getMnc();
          this.c = cellIdentity1.getLac();
          this.d = (long)cellIdentity1.getCid();
          if (Build$VERSION.SDK_INT >= i) {
             this.e = cellIdentity1.getUarfcn();
          }
          this.l = uCellInfoWcd.getCellSignalStrength().getDbm();
       }else {
          String str = 29;
          if (p0 instanceof CellInfoTdscdma) {
             if (Build$VERSION.SDK_INT >= str) {
                CellInfoTdscdma uCellInfoTds = p0;
                CellIdentityTdscdma cellIdentity2 = uCellInfoTds.getCellIdentity();
                this.a = this.b(cellIdentity2.getMccString());
                this.b = this.b(cellIdentity2.getMncString());
                this.c = cellIdentity2.getLac();
                this.d = (long)cellIdentity2.getCid();
                this.e = cellIdentity2.getUarfcn();
                CellSignalStrengthTdscdma cellSignalSt2 = uCellInfoTds.getCellSignalStrength();
                this.h = cellSignalSt2.getRscp();
                this.l = cellSignalSt2.getDbm();
             }
          }else if(p0 instanceof CellInfoLte){
             CellInfoLte uCellInfoLte = p0;
             CellIdentityLte cellIdentity3 = uCellInfoLte.getCellIdentity();
             this.a = cellIdentity3.getMcc();
             this.b = cellIdentity3.getMnc();
             this.c = cellIdentity3.getTac();
             this.d = (long)cellIdentity3.getCi();
             int sDK_INT1 = Build$VERSION.SDK_INT;
             if (sDK_INT1 >= i) {
                this.e = cellIdentity3.getEarfcn();
             }
             if (sDK_INT1 >= l) {
                this.f = this.a(cellIdentity3.getBands());
             }
             CellSignalStrengthLte cellSignalSt3 = uCellInfoLte.getCellSignalStrength();
             if (sDK_INT1 >= str) {
                this.g = cellSignalSt3.getRssi();
             }
             if (sDK_INT1 >= 26) {
                this.h = cellSignalSt3.getRsrp();
                this.i = cellSignalSt3.getRsrq();
                this.j = cellSignalSt3.getCqi();
                this.k = cellSignalSt3.getRssnr();
             }
             this.l = cellSignalSt3.getDbm();
          }else if(p0 instanceof CellInfoNr){
             int sDK_INT2 = Build$VERSION.SDK_INT;
             if (sDK_INT2 >= str) {
                CellInfoNr uCellInfoNr = p0;
                CellIdentityNr cellIdentity4 = uCellInfoNr.getCellIdentity();
                this.a = this.b(cellIdentity4.getMccString());
                this.b = this.b(cellIdentity4.getMncString());
                this.c = cellIdentity4.getTac();
                this.d = cellIdentity4.getNci();
                this.e = cellIdentity4.getNrarfcn();
                if (sDK_INT2 >= l) {
                   this.f = this.a(cellIdentity4.getBands());
                }
                CellSignalStrengthNr cellSignalSt4 = uCellInfoNr.getCellSignalStrength();
                this.h = cellSignalSt4.getSsRsrp();
                this.i = cellSignalSt4.getSsRsrq();
                this.k = cellSignalSt4.getSsSinr();
                this.l = cellSignalSt4.getDbm();
             }
          }
       }
       this.m = (Build$VERSION.SDK_INT >= l)? SystemClock.elapsedRealtime() - p0.getTimestampMillis(): SystemClock.elapsedRealtime() - (p0.getTimeStamp() / 1000);
       return;
    }
    public final int a(int[] p0){
       if (p0.length > 0) {
          return p0[0];
       }
       return -1;
    }
    public final int b(String p0){
       if (p0 == null) {
          return -1;
       }
       return Integer.parseInt(p0);
    }
}
