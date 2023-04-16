package com.amap.api.fence.GeoFence;
import android.os.Parcelable;
import com.amap.api.fence.GeoFence$1;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import android.app.PendingIntent;
import java.lang.ClassLoader;
import java.lang.Class;
import com.amap.api.fence.PoiItem;
import com.amap.api.fence.DistrictItem;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import com.amap.api.location.DPoint;
import java.util.List;
import com.amap.api.location.AMapLocation;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.fq;
import java.util.Iterator;

public class GeoFence implements Parcelable	// class@000ec1
{
    public String a;
    public String b;
    public String c;
    public PendingIntent d;
    public int e;
    public PoiItem f;
    public List g;
    public List h;
    public float i;
    public long j;
    public int k;
    public float l;
    public float m;
    public DPoint n;
    public int o;
    public long p;
    public boolean q;
    public AMapLocation r;
    public static final Parcelable$Creator CREATOR;

    static {
       GeoFence.CREATOR = new GeoFence$1();
    }
    public void GeoFence(){
       super();
       this.d = null;
       this.e = 0;
       this.f = null;
       this.g = null;
       this.i = 0;
       this.j = -1;
       this.k = 1;
       this.l = 0;
       this.m = 0;
       this.n = null;
       this.o = 0;
       this.p = -1;
       this.q = true;
       this.r = null;
    }
    public void GeoFence(Parcel p0){
       super();
       this.d = null;
       int i = 0;
       this.e = i;
       this.f = null;
       this.g = null;
       this.i = 0;
       long l = -1;
       this.j = l;
       this.k = 1;
       this.l = 0;
       this.m = 0;
       this.n = null;
       this.o = i;
       this.p = l;
       this.q = true;
       this.r = null;
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = p0.readString();
       this.d = p0.readParcelable(PendingIntent.class.getClassLoader());
       this.e = p0.readInt();
       this.f = p0.readParcelable(PoiItem.class.getClassLoader());
       this.g = p0.createTypedArrayList(DistrictItem.CREATOR);
       this.i = p0.readFloat();
       this.j = p0.readLong();
       this.k = p0.readInt();
       this.l = p0.readFloat();
       this.m = p0.readFloat();
       this.n = p0.readParcelable(DPoint.class.getClassLoader());
       this.o = p0.readInt();
       this.p = p0.readLong();
       int i1 = p0.readInt();
       if (i1) {
          this.h = new ArrayList();
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             this.h.add(p0.createTypedArrayList(DPoint.CREATOR));
          }
       }
       if (p0.readByte()) {
          i = true;
       }
       this.q = i;
       this.r = p0.readParcelable(AMapLocation.class.getClassLoader());
       return;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (!p0 instanceof GeoFence) {
          return false;
       }
       if (TextUtils.isEmpty(this.b)) {
          if (!TextUtils.isEmpty(p0.b)) {
             return false;
          }
       }else if(!(this.b).equals(p0.b)){
          return false;
       }
       GeoFence tn = this.n;
       if (tn == null) {
          if (p0.n != null) {
             return false;
          }
       }else if(!tn.equals(p0.n)){
          return false;
       }
       if (this.i - p0.i) {
          return false;
       }else {
          tn = this.h;
          p0 = p0.h;
          if (tn == null) {
             if (p0 != null) {
                return false;
             }
          }else if(!tn.equals(p0)){
             return false;
          }
          return true;
       }
    }
    public int getActivatesAction(){
       return this.k;
    }
    public DPoint getCenter(){
       return this.n;
    }
    public AMapLocation getCurrentLocation(){
       return this.r;
    }
    public String getCustomId(){
       return this.b;
    }
    public List getDistrictItemList(){
       return this.g;
    }
    public long getEnterTime(){
       return this.p;
    }
    public long getExpiration(){
       return this.j;
    }
    public String getFenceId(){
       return this.a;
    }
    public float getMaxDis2Center(){
       return this.m;
    }
    public float getMinDis2Center(){
       return this.l;
    }
    public PendingIntent getPendingIntent(){
       return this.d;
    }
    public String getPendingIntentAction(){
       return this.c;
    }
    public PoiItem getPoiItem(){
       return this.f;
    }
    public List getPointList(){
       return this.h;
    }
    public float getRadius(){
       return this.i;
    }
    public int getStatus(){
       return this.o;
    }
    public int getType(){
       return this.e;
    }
    public int hashCode(){
       return ((((this.b).hashCode() + this.h.hashCode()) + this.n.hashCode()) + (int)(this.i * 100.00f));
    }
    public boolean isAble(){
       return this.q;
    }
    public void setAble(boolean p0){
       this.q = p0;
    }
    public void setActivatesAction(int p0){
       this.k = p0;
    }
    public void setCenter(DPoint p0){
       this.n = p0;
    }
    public void setCurrentLocation(AMapLocation p0){
       this.r = p0.clone();
    }
    public void setCustomId(String p0){
       this.b = p0;
    }
    public void setDistrictItemList(List p0){
       this.g = p0;
    }
    public void setEnterTime(long p0){
       this.p = p0;
    }
    public void setExpiration(long p0){
       p0 = (p0 < 0)? -1: p0 + fq.b();
       this.j = p0;
       return;
    }
    public void setFenceId(String p0){
       this.a = p0;
    }
    public void setMaxDis2Center(float p0){
       this.m = p0;
    }
    public void setMinDis2Center(float p0){
       this.l = p0;
    }
    public void setPendingIntent(PendingIntent p0){
       this.d = p0;
    }
    public void setPendingIntentAction(String p0){
       this.c = p0;
    }
    public void setPoiItem(PoiItem p0){
       this.f = p0;
    }
    public void setPointList(List p0){
       this.h = p0;
    }
    public void setRadius(float p0){
       this.i = p0;
    }
    public void setStatus(int p0){
       this.o = p0;
    }
    public void setType(int p0){
       this.e = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeParcelable(this.d, p1);
       p0.writeInt(this.e);
       p0.writeParcelable(this.f, p1);
       p0.writeTypedList(this.g);
       p0.writeFloat(this.i);
       p0.writeLong(this.j);
       p0.writeInt(this.k);
       p0.writeFloat(this.l);
       p0.writeFloat(this.m);
       p0.writeParcelable(this.n, p1);
       p0.writeInt(this.o);
       p0.writeLong(this.p);
       GeoFence th = this.h;
       if (th != null && !th.isEmpty()) {
          p0.writeInt(this.h.size());
          Iterator iterator = this.h.iterator();
          while (iterator.hasNext()) {
             p0.writeTypedList(iterator.next());
          }
       }
       p0.writeByte(this.q);
       p0.writeParcelable(this.r, p1);
       return;
    }
}
