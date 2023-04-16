package com.amap.api.location.AMapLocationClientOption;
import android.os.Parcelable;
import java.lang.Cloneable;
import com.amap.api.location.AMapLocationClientOption$AMapLocationProtocol;
import com.amap.api.location.AMapLocationClientOption$1;
import java.lang.Object;
import com.loc.fj;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import android.os.Parcel;
import com.amap.api.location.AMapLocationClientOption$AMapLocationPurpose;
import java.lang.String;
import java.lang.Throwable;
import com.amap.api.location.AMapLocationClientOption$2;
import java.lang.Enum;
import java.lang.StringBuilder;

public class AMapLocationClientOption implements Parcelable, Cloneable	// class@000ecf
{
    public boolean A;
    public int B;
    public int C;
    public float D;
    public AMapLocationClientOption$AMapLocationPurpose E;
    public boolean b;
    public String c;
    public long h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public AMapLocationClientOption$AMapLocationMode o;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public long y;
    public AMapLocationClientOption$GeoLanguage z;
    public static final Parcelable$Creator CREATOR;
    public static boolean OPEN_ALWAYS_SCAN_WIFI;
    public static long SCAN_WIFI_INTERVAL;
    public static String a;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static AMapLocationClientOption$AMapLocationProtocol p;

    static {
       AMapLocationClientOption.p = AMapLocationClientOption$AMapLocationProtocol.HTTP;
       AMapLocationClientOption.a = "";
       AMapLocationClientOption.CREATOR = new AMapLocationClientOption$1();
       AMapLocationClientOption.OPEN_ALWAYS_SCAN_WIFI = true;
       AMapLocationClientOption.SCAN_WIFI_INTERVAL = 0x7530;
    }
    public void AMapLocationClientOption(){
       super();
       this.h = 2000;
       this.i = (long)fj.i;
       this.j = false;
       this.k = true;
       this.l = true;
       this.m = true;
       this.n = true;
       this.o = AMapLocationClientOption$AMapLocationMode.Hight_Accuracy;
       this.q = false;
       this.r = false;
       this.s = true;
       this.t = true;
       this.u = false;
       this.v = false;
       this.w = true;
       this.x = 0x7530;
       this.y = 0x7530;
       this.z = AMapLocationClientOption$GeoLanguage.DEFAULT;
       this.A = false;
       this.B = 1500;
       this.C = 0x1499700;
       this.D = 0;
       this.E = null;
       this.b = false;
       this.c = null;
    }
    public void AMapLocationClientOption(Parcel p0){
       super();
       this.h = 2000;
       this.i = (long)fj.i;
       boolean b = false;
       this.j = b;
       this.k = true;
       this.l = true;
       this.m = true;
       this.n = true;
       AMapLocationClientOption$AMapLocationMode hight_Accura = AMapLocationClientOption$AMapLocationMode.Hight_Accuracy;
       this.o = hight_Accura;
       this.q = b;
       this.r = b;
       this.s = true;
       this.t = true;
       this.u = b;
       this.v = b;
       this.w = true;
       this.x = 0x7530;
       this.y = 0x7530;
       AMapLocationClientOption$GeoLanguage dEFAULT = AMapLocationClientOption$GeoLanguage.DEFAULT;
       this.z = dEFAULT;
       this.A = b;
       this.B = 1500;
       this.C = 0x1499700;
       this.D = 0;
       AMapLocationClientOption$AMapLocationPurpose uAMapLocatio = null;
       this.E = uAMapLocatio;
       this.b = b;
       this.c = uAMapLocatio;
       this.h = p0.readLong();
       this.i = p0.readLong();
       boolean b1 = (p0.readByte())? true: false;
       this.j = b1;
       b1 = (p0.readByte())? true: false;
       this.k = b1;
       b1 = (p0.readByte())? true: false;
       this.l = b1;
       b1 = (p0.readByte())? true: false;
       this.m = b1;
       b1 = (p0.readByte())? true: false;
       this.n = b1;
       b1 = p0.readInt();
       if (b1 != -1) {
          hight_Accura = AMapLocationClientOption$AMapLocationMode.values()[b1];
       }
       this.o = hight_Accura;
       boolean b2 = (p0.readByte())? true: false;
       this.q = b2;
       b2 = (p0.readByte())? true: false;
       this.r = b2;
       b2 = (p0.readByte())? true: false;
       this.s = b2;
       b2 = (p0.readByte())? true: false;
       this.t = b2;
       b2 = (p0.readByte())? true: false;
       this.u = b2;
       b2 = (p0.readByte())? true: false;
       this.v = b2;
       b2 = (p0.readByte())? true: false;
       this.w = b2;
       this.x = p0.readLong();
       b2 = p0.readInt();
       AMapLocationClientOption$AMapLocationProtocol hTTP = (b2 == -1)? AMapLocationClientOption$AMapLocationProtocol.HTTP: AMapLocationClientOption$AMapLocationProtocol.values()[b2];
       AMapLocationClientOption.p = hTTP;
       b2 = p0.readInt();
       if (b2 != -1) {
          dEFAULT = AMapLocationClientOption$GeoLanguage.values()[b2];
       }
       this.z = dEFAULT;
       this.D = p0.readFloat();
       b2 = p0.readInt();
       if (b2 != -1) {
          uAMapLocatio = AMapLocationClientOption$AMapLocationPurpose.values()[b2];
       }
       this.E = uAMapLocatio;
       if (p0.readByte()) {
          b = true;
       }
       AMapLocationClientOption.OPEN_ALWAYS_SCAN_WIFI = b;
       this.y = p0.readLong();
       return;
    }
    public static String getAPIKEY(){
       return AMapLocationClientOption.a;
    }
    public static boolean isDownloadCoordinateConvertLibrary(){
       return false;
    }
    public static boolean isOpenAlwaysScanWifi(){
       return AMapLocationClientOption.OPEN_ALWAYS_SCAN_WIFI;
    }
    public static void setDownloadCoordinateConvertLibrary(boolean p0){
    }
    public static void setLocationProtocol(AMapLocationClientOption$AMapLocationProtocol p0){
       AMapLocationClientOption.p = p0;
    }
    public static void setOpenAlwaysScanWifi(boolean p0){
       AMapLocationClientOption.OPEN_ALWAYS_SCAN_WIFI = p0;
    }
    public static void setScanWifiInterval(long p0){
       AMapLocationClientOption.SCAN_WIFI_INTERVAL = p0;
    }
    public final AMapLocationClientOption a(AMapLocationClientOption p0){
       this.h = p0.h;
       this.j = p0.j;
       this.o = p0.o;
       this.k = p0.k;
       this.q = p0.q;
       this.r = p0.r;
       this.l = p0.l;
       this.m = p0.m;
       this.i = p0.i;
       this.s = p0.s;
       this.t = p0.t;
       this.u = p0.u;
       this.v = p0.isSensorEnable();
       this.w = p0.isWifiScan();
       this.x = p0.x;
       AMapLocationClientOption.setLocationProtocol(p0.getLocationProtocol());
       this.z = p0.z;
       AMapLocationClientOption.setDownloadCoordinateConvertLibrary(AMapLocationClientOption.isDownloadCoordinateConvertLibrary());
       this.D = p0.D;
       this.E = p0.E;
       AMapLocationClientOption.setOpenAlwaysScanWifi(AMapLocationClientOption.isOpenAlwaysScanWifi());
       AMapLocationClientOption.setScanWifiInterval(p0.getScanWifiInterval());
       this.y = p0.y;
       this.C = p0.getCacheTimeOut();
       this.A = p0.getCacheCallBack();
       this.B = p0.getCacheCallBackTime();
       return this;
    }
    public AMapLocationClientOption clone(){
       super.clone();
       return new AMapLocationClientOption().a(this);
    }
    public Object clone(){
       return this.clone();
    }
    public int describeContents(){
       return 0;
    }
    public boolean getCacheCallBack(){
       return this.A;
    }
    public int getCacheCallBackTime(){
       return this.B;
    }
    public int getCacheTimeOut(){
       return this.C;
    }
    public float getDeviceModeDistanceFilter(){
       return this.D;
    }
    public AMapLocationClientOption$GeoLanguage getGeoLanguage(){
       return this.z;
    }
    public long getGpsFirstTimeout(){
       return this.y;
    }
    public long getHttpTimeOut(){
       return this.i;
    }
    public long getInterval(){
       return this.h;
    }
    public long getLastLocationLifeCycle(){
       return this.x;
    }
    public AMapLocationClientOption$AMapLocationMode getLocationMode(){
       return this.o;
    }
    public AMapLocationClientOption$AMapLocationProtocol getLocationProtocol(){
       return AMapLocationClientOption.p;
    }
    public AMapLocationClientOption$AMapLocationPurpose getLocationPurpose(){
       return this.E;
    }
    public long getScanWifiInterval(){
       return AMapLocationClientOption.SCAN_WIFI_INTERVAL;
    }
    public boolean isGpsFirst(){
       return this.r;
    }
    public boolean isKillProcess(){
       return this.q;
    }
    public boolean isLocationCacheEnable(){
       return this.t;
    }
    public boolean isMockEnable(){
       return this.k;
    }
    public boolean isNeedAddress(){
       return this.l;
    }
    public boolean isOffset(){
       return this.s;
    }
    public boolean isOnceLocation(){
       return this.j;
    }
    public boolean isOnceLocationLatest(){
       return this.u;
    }
    public boolean isSensorEnable(){
       return this.v;
    }
    public boolean isWifiActiveScan(){
       return this.m;
    }
    public boolean isWifiScan(){
       return this.w;
    }
    public void setCacheCallBack(boolean p0){
       this.A = p0;
    }
    public void setCacheCallBackTime(int p0){
       this.B = p0;
    }
    public void setCacheTimeOut(int p0){
       this.C = p0;
    }
    public AMapLocationClientOption setDeviceModeDistanceFilter(float p0){
       if (p0 < 0) {
          p0 = 0;
       }
       this.D = p0;
       return this;
    }
    public AMapLocationClientOption setGeoLanguage(AMapLocationClientOption$GeoLanguage p0){
       this.z = p0;
       return this;
    }
    public AMapLocationClientOption setGpsFirst(boolean p0){
       this.r = p0;
       return this;
    }
    public AMapLocationClientOption setGpsFirstTimeout(long p0){
       int i = 5000;
       if (p0 - i < 0) {
          p0 = i;
       }
       if (p0 - 0x7530 > 0) {
          p0 = 0x7530;
       }
       this.y = p0;
       return this;
    }
    public AMapLocationClientOption setHttpTimeOut(long p0){
       this.i = p0;
       return this;
    }
    public AMapLocationClientOption setInterval(long p0){
       if (p0 - 800 <= 0) {
          p0 = 800;
       }
       this.h = p0;
       return this;
    }
    public AMapLocationClientOption setKillProcess(boolean p0){
       this.q = p0;
       return this;
    }
    public AMapLocationClientOption setLastLocationLifeCycle(long p0){
       this.x = p0;
       return this;
    }
    public AMapLocationClientOption setLocationCacheEnable(boolean p0){
       this.t = p0;
       return this;
    }
    public AMapLocationClientOption setLocationMode(AMapLocationClientOption$AMapLocationMode p0){
       this.o = p0;
       return this;
    }
    public AMapLocationClientOption setLocationPurpose(AMapLocationClientOption$AMapLocationPurpose p0){
       int g;
       String str;
       this.E = p0;
       if (p0 != null) {
          int i = AMapLocationClientOption$2.a[p0.ordinal()];
          int b = false;
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   i = AMapLocationClientOption.d;
                   g = AMapLocationClientOption.g;
                   if (!(i & g)) {
                      this.b = true;
                      AMapLocationClientOption.d = i | g;
                      str = "sport";
                   label_0036 :
                      this.c = str;
                   }
                }
             }else {
                i = AMapLocationClientOption.d;
                g = AMapLocationClientOption.f;
                if (!(i & g)) {
                   this.b = true;
                   AMapLocationClientOption.d = i | g;
                   str = "transport";
                   goto label_0036 ;
                }
             }
             this.o = AMapLocationClientOption$AMapLocationMode.Hight_Accuracy;
             this.j = b;
             this.u = b;
             this.r = true;
             this.k = b;
             this.w = true;
          }else {
             this.o = AMapLocationClientOption$AMapLocationMode.Hight_Accuracy;
             this.j = true;
             this.u = true;
             this.r = b;
             this.k = b;
             this.w = true;
             i = AMapLocationClientOption.d;
             b = AMapLocationClientOption.e;
             if (!(i & b)) {
                this.b = true;
                AMapLocationClientOption.d = i | b;
                this.c = "signin";
             }
          }
       }
       return this;
    }
    public AMapLocationClientOption setMockEnable(boolean p0){
       this.k = p0;
       return this;
    }
    public AMapLocationClientOption setNeedAddress(boolean p0){
       this.l = p0;
       return this;
    }
    public AMapLocationClientOption setOffset(boolean p0){
       this.s = p0;
       return this;
    }
    public AMapLocationClientOption setOnceLocation(boolean p0){
       this.j = p0;
       return this;
    }
    public AMapLocationClientOption setOnceLocationLatest(boolean p0){
       this.u = p0;
       return this;
    }
    public AMapLocationClientOption setSensorEnable(boolean p0){
       this.v = p0;
       return this;
    }
    public AMapLocationClientOption setWifiActiveScan(boolean p0){
       this.m = p0;
       this.n = p0;
       return this;
    }
    public AMapLocationClientOption setWifiScan(boolean p0){
       this.w = p0;
       AMapLocationClientOption tn = (p0)? this.n: false;
       this.m = tn;
       return this;
    }
    public String toString(){
       return "interval:"+String.valueOf(this.h)+"#"+"isOnceLocation:"+String.valueOf(this.j)+"#"+"locationMode:"+String.valueOf(this.o)+"#"+"locationProtocol:"+String.valueOf(AMapLocationClientOption.p)+"#"+"isMockEnable:"+String.valueOf(this.k)+"#"+"isKillProcess:"+String.valueOf(this.q)+"#"+"isGpsFirst:"+String.valueOf(this.r)+"#"+"isNeedAddress:"+String.valueOf(this.l)+"#"+"isWifiActiveScan:"+String.valueOf(this.m)+"#"+"wifiScan:"+String.valueOf(this.w)+"#"+"httpTimeOut:"+String.valueOf(this.i)+"#"+"isLocationCacheEnable:"+String.valueOf(this.t)+"#"+"isOnceLocationLatest:"+String.valueOf(this.u)+"#"+"sensorEnable:"+String.valueOf(this.v)+"#"+"geoLanguage:"+String.valueOf(this.z)+"#"+"locationPurpose:"+String.valueOf(this.E)+"#"+"callback:"+String.valueOf(this.A)+"#"+"time:"+String.valueOf(this.B)+"#";
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeLong(this.h);
       p0.writeLong(this.i);
       p0.writeByte(this.j);
       p0.writeByte(this.k);
       p0.writeByte(this.l);
       p0.writeByte(this.m);
       p0.writeByte(this.n);
       AMapLocationClientOption to = this.o;
       int i = -1;
       to = (to == null)? -1: to.ordinal();
       p0.writeInt(to);
       p0.writeByte(this.q);
       p0.writeByte(this.r);
       p0.writeByte(this.s);
       p0.writeByte(this.t);
       p0.writeByte(this.u);
       p0.writeByte(this.v);
       p0.writeByte(this.w);
       p0.writeLong(this.x);
       to = (AMapLocationClientOption.p == null)? -1: this.getLocationProtocol().ordinal();
       p0.writeInt(to);
       to = this.z;
       to = (to == null)? -1: to.ordinal();
       p0.writeInt(to);
       p0.writeFloat(this.D);
       to = this.E;
       if (to != null) {
          i = to.ordinal();
       }
       p0.writeInt(i);
       p0.writeInt(AMapLocationClientOption.OPEN_ALWAYS_SCAN_WIFI);
       p0.writeLong(this.y);
       return;
    }
}
