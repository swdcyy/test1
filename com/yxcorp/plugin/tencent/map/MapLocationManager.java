package com.yxcorp.plugin.tencent.map.MapLocationManager;
import java.lang.Object;
import sid.p;
import java.util.concurrent.ConcurrentHashMap;
import sid.b0;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.plugin.tencent.map.KwaiMapLocation;
import ir4.a$a;
import hyb.d;
import hyb.b;
import hyb.c;
import com.google.protobuf.nano.MessageNano;
import java.lang.Long;
import android.content.SharedPreferences;
import java.lang.Throwable;
import android.content.SharedPreferences$Editor;
import java.lang.System;
import oe6.g;
import sid.h;
import sid.j;
import sid.f0;
import java.lang.IllegalArgumentException;
import com.yxcorp.utility.SystemUtil;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.plugin.tencent.map.f;
import org.json.JSONObject;
import org.json.JSONException;
import ok.s;
import java.lang.Iterable;
import ok.n;
import com.google.common.collect.Iterators;
import java.util.List;
import com.google.common.collect.Lists;
import ok.s$b;
import java.util.Iterator;
import java.lang.Double;
import sid.o;
import sid.z;
import android.os.Looper;
import sid.u;
import sid.g;
import org.greenrobot.eventbus.a;
import com.tencent.beacon.event.LocationSuccessEvent;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.utility.Log;
import java.util.ArrayList;
import sid.s;
import java.util.Collection;
import com.google.gson.Gson;
import android.os.AsyncTask;
import sid.c0;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public class MapLocationManager	// class@0013bc
{
    public boolean isInited;
    public boolean isMockLocationJump;
    public final p mDefaultRequestParam;
    public String mFakeLocationStr;
    public String mLastEncryptLocation;
    public KwaiMapLocation mLastLocation;
    public boolean mLastLocationRequestSuccess;
    public u mLocationEventCallback;
    public List mPausedRequesterMap;
    public final ConcurrentHashMap mRequesterCache;
    public final ConcurrentHashMap mRequesterMap;
    public Looper sWorkLooper;
    public static final String TAG = "MapLocationManager";
    public static MapLocationManager instance;

    public void MapLocationManager(){
       super();
       this.isMockLocationJump = false;
       this.mDefaultRequestParam = p.c();
       this.mRequesterMap = new ConcurrentHashMap();
       this.mRequesterCache = new ConcurrentHashMap();
       this.isInited = false;
       this.mLastLocationRequestSuccess = false;
    }
    public static boolean allowUseLocationCache(){
       if (b0.b()) {
          return true;
       }
       return a.t().d("AllowUseLocationCacheSwitch", true);
    }
    public static String buildLastEncryptLocation(KwaiMapLocation p0){
       if (p0 == null) {
          return null;
       }
       a$a uoa = new a$a();
       uoa.a = p0.getLatitude();
       uoa.b = p0.getLongitude();
       return c.a().b(uoa);
    }
    public static MapLocationManager getInstance(){
       if (MapLocationManager.instance == null) {
          MapLocationManager mapLocationM = MapLocationManager.class;
          _monitor_enter(mapLocationM);
          if (MapLocationManager.instance == null) {
             MapLocationManager.instance = new MapLocationManager();
          }
          _monitor_exit(mapLocationM);
       }
       return MapLocationManager.instance;
    }
    public static Long getLastLocationDatetime(){
       Long longx = Long.valueOf(0);
       if (!MapLocationManager.allowUseLocationCache()) {
          return longx;
       }
       SharedPreferences sharedPrefer = c.a().f();
       if (sharedPrefer == null) {
          return longx;
       }
       return Long.valueOf(sharedPrefer.getLong("LastLocationDatetime", 0));
    }
    public static void lambda$updateLocationCache$0(KwaiMapLocation p0){
       try{
          p0.updateAddress();
       }catch(java.lang.Exception e2){
          c.a().d("updateLocation", e2);
       }
       return;
    }
    public static void setLastLocationDatetime(){
       SharedPreferences sharedPrefer = c.a().f();
       if (sharedPrefer == null) {
          return;
       }
       g.a(sharedPrefer.edit().putLong("LastLocationDatetime", System.currentTimeMillis()));
       return;
    }
    public void cancelDefaultRequest(){
       h oh = this.mRequesterMap.get(this.mDefaultRequestParam);
       if (oh != null) {
          oh.e();
       }
       return;
    }
    public int checkStatus(){
       if (!b0.b()) {
          return -2;
       }
       if (!this.isInited()) {
          return -1;
       }
       return 0;
    }
    public j createRequestTask(){
       return this.createRequestTask(this.mDefaultRequestParam);
    }
    public j createRequestTask(String p0,boolean p1,boolean p2){
       p op = p.c();
       op.c = p0;
       op.a = p1;
       op.b = p2;
       return this.createRequestTask(op);
    }
    public j createRequestTask(p p0){
       if (p0 != null) {
          return new f0(this.getRequester(p0));
       }
       throw new IllegalArgumentException("KwaiLocationRequestParam should not be null!");
    }
    public j createRequestTask(boolean p0){
       return this.createRequestTask("amap", p0, true);
    }
    public void disableFakeLocation(){
       this.mFakeLocationStr = null;
    }
    public void enableFakeLocation(String p0){
       this.mFakeLocationStr = p0;
    }
    public String getEncryptLocation(){
       if (!MapLocationManager.allowUseLocationCache()) {
          return null;
       }
       if (SystemUtil.K() && !TextUtils.isEmpty(this.mFakeLocationStr)) {
          return MapLocationManager.buildLastEncryptLocation(this.getLocation());
       }
       _monitor_enter(this);
       if (TextUtils.isEmpty(this.mLastEncryptLocation)) {
          this.mLastEncryptLocation = MapLocationManager.buildLastEncryptLocation(this.getLocation());
       }
       _monitor_exit(this);
       return this.mLastEncryptLocation;
    }
    public KwaiMapLocation getLastLocation(){
       Iterable iterable;
       List list;
       Iterator iterator;
       f a = f.a;
       SharedPreferences sharedPrefer = c.a().f();
       d uod = null;
       String str = "";
       if (sharedPrefer == null) {
       }else {
          try{
             String str1 = sharedPrefer.getString("last_location", str);
             if (!TextUtils.isEmpty(str1)) {
                JSONObject jSONObject = new JSONObject(str1);
                uod = a.a(jSONObject.optDouble("mLatitude"), jSONObject.optDouble("mLongitude"), jSONObject.optString("mAddress"));
                uod.mCountry = jSONObject.optString("mCountry");
                uod.mProvince = jSONObject.optString("mProvince");
                uod.mCity = jSONObject.optString("mCity");
                uod.mCounty = jSONObject.optString("mCounty");
                uod.mStreet = jSONObject.optString("mStreet");
             }
          }catch(org.json.JSONException e0){
             e0.printStackTrace();
          }
       }
    }
    public synchronized KwaiMapLocation getLocation(){
       if (!MapLocationManager.allowUseLocationCache()) {
          return null;
       }
       if (SystemUtil.K() && !TextUtils.isEmpty(this.mFakeLocationStr)) {
          String[] stringArray = ((this.mFakeLocationStr).trim()).split(" ");
          double d = Double.parseDouble(stringArray[0]);
          double d1 = Double.parseDouble(stringArray[1]);
          object oobject = stringArray[2];
          object oobject1 = (stringArray.length >= 4)? stringArray[3]: oobject;
          KwaiMapLocation kwaiMapLocat = new KwaiMapLocation(d1, d, "fake address");
          v9.mProvince = oobject1;
          v9.mCity = oobject;
          v9.mCountry = "国家";
          v9.mCounty = "区/县";
          v9.mStreet = "街道";
          return v9;
       }else if(this.isInited == null){
          return null;
       }else if(this.mLastLocation == null){
          this.mLastLocation = this.getLastLocation();
       }
       return this.mLastLocation;
    }
    public final h getRequester(p p0){
       h oh = this.mRequesterMap.get(p0);
       if (oh == null) {
          oh = this.mRequesterCache.remove(o.a(p0.a()));
          if (oh != null) {
             oh.h(p0);
          }
       }
       if (oh == null) {
          oh = new z(p0, this.sWorkLooper);
       }
       oh.c(this.mLocationEventCallback);
       return oh;
    }
    public void handleLocationFailed(String p0){
       c.a().d("tencentLocationFail", new Throwable(p0));
       this.mLastLocationRequestSuccess = false;
    }
    public void handleLocationSuccess(g p0){
       if (this.shouldUpdateCache()) {
          this.updateLocationCache(KwaiMapLocation.from(p0));
       }
       this.mLastLocationRequestSuccess = true;
       a.d().k(new LocationSuccessEvent());
       return;
    }
    public void init(Looper p0){
       if (this.isInited != null) {
          return;
       }
       this.sWorkLooper = p0;
       this.isInited = true;
       return;
    }
    public boolean isInited(){
       return this.isInited;
    }
    public boolean isLastLocationRequestSuccess(){
       return this.mLastLocationRequestSuccess;
    }
    public boolean isMockLocationJump(){
       return this.isMockLocationJump;
    }
    public final boolean isSameLocationInfo(KwaiMapLocation p0){
       String address = p0.getAddress();
       MapLocationManager tmLastLocati = this.mLastLocation;
       String address1 = (tmLastLocati != null)? tmLastLocati.getAddress(): "";
       if (p0.isSameLocation(this.mLastLocation)) {
          if (TextUtils.isEmpty(address)) {
             return true;
          }else if(TextUtils.isEmpty(address1)){
             return TextUtils.isEmpty(address);
          }else {
             return address.equals(address1);
          }
       }else {
          return false;
       }
    }
    public void mockLocationJump(boolean p0){
       this.isMockLocationJump = p0;
    }
    public void pauseAllRequest(){
       MapLocationManager tmRequesterM = this.mRequesterMap;
       _monitor_enter(tmRequesterM);
       Iterator iterator = this.mRequesterMap.entrySet().iterator();
       while (iterator.hasNext()) {
          h value = iterator.next().getValue();
          if (value != null && value.a()) {
             Log.b(MapLocationManager.TAG, "pause request");
             iterator.remove();
             value.e();
             if (this.mPausedRequesterMap == null) {
                this.mPausedRequesterMap = new ArrayList();
             }
             this.mPausedRequesterMap.add(value);
          }
       }
       _monitor_exit(tmRequesterM);
       return;
    }
    public void recordRequesterAdd(h p0){
       if (this.isInited() && p0.isValid()) {
          this.mRequesterMap.put(p0.g(), p0);
       }
       return;
    }
    public void recordRequesterRemove(h p0){
       this.mRequesterMap.remove(p0.g());
       this.mRequesterCache.put(p0.f(), p0);
    }
    public void requestLocation(){
       this.createRequestTask().c(null);
    }
    public void resumePausedRequest(){
       MapLocationManager tmRequesterM = this.mRequesterMap;
       _monitor_enter(tmRequesterM);
       MapLocationManager tmPausedRequ = this.mPausedRequesterMap;
       if (tmPausedRequ != null) {
          Iterator iterator = tmPausedRequ.iterator();
          while (iterator.hasNext()) {
             Log.b(MapLocationManager.TAG, "resume request");
             iterator.next().k();
          }
          this.mPausedRequesterMap = null;
       }
       _monitor_exit(tmRequesterM);
       return;
    }
    public void setLocationEventCallback(u p0){
       this.mLocationEventCallback = p0;
    }
    public final boolean shouldUpdateCache(){
       MapLocationManager tmRequesterM = this.mRequesterMap;
       _monitor_enter(tmRequesterM);
       if (this.mRequesterMap.isEmpty()) {
          _monitor_exit(tmRequesterM);
          return false;
       }else {
          Iterator iterator = this.mRequesterMap.values().iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().g().a != null) {
                   break ;
                }
             }else {
                _monitor_exit(tmRequesterM);
                return false;
             }
          }
          _monitor_exit(tmRequesterM);
          return true;
       }
    }
    public void stopAllRequest(){
       MapLocationManager tmRequesterM = this.mRequesterMap;
       _monitor_enter(tmRequesterM);
       Iterator iterator = this.mRequesterMap.entrySet().iterator();
       while (iterator.hasNext()) {
          h value = iterator.next().getValue();
          if (value != null) {
             Log.b(MapLocationManager.TAG, "stop request");
             value.i(null);
             iterator.remove();
             this.mRequesterCache.put(value.f(), value);
          }
       }
       _monitor_exit(tmRequesterM);
       return;
    }
    public final void updateLocationCache(KwaiMapLocation p0){
       if (p0 == null) {
          return;
       }
       _monitor_enter(this);
       if (this.isSameLocationInfo(p0)) {
          MapLocationManager.setLastLocationDatetime();
          _monitor_exit(this);
          return;
       }else {
          this.mLastLocation = p0;
          this.mLastEncryptLocation = MapLocationManager.buildLastEncryptLocation(p0);
          _monitor_exit(this);
          SharedPreferences sharedPrefer = c.a().f();
          if (sharedPrefer != null) {
             g.a(sharedPrefer.edit().putString("last_location", new Gson().q(p0)));
          }
          MapLocationManager.setLastLocationDatetime();
          if (TextUtils.isEmpty(p0.getAddress())) {
             AsyncTask.THREAD_POOL_EXECUTOR.execute(new c0(p0));
          }
          return;
       }
    }
}
