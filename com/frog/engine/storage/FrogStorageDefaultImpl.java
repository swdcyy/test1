package com.frog.engine.storage.FrogStorageDefaultImpl;
import com.frog.engine.FrogCanvasKVStorageProxy;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tencent.mmkv.MMKV;
import org.json.JSONObject;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import java.lang.Number;
import com.frog.engine.storage.FrogStorageDefaultImpl$a;
import java.lang.Runnable;
import android.os.AsyncTask;
import java.io.File;
import java.util.HashMap;
import android.content.Context;
import com.frog.engine.internal.FrogEngineInternal;
import com.frog.engine.utils.MD5Utils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Throwable;
import android.content.SharedPreferences$Editor;

public class FrogStorageDefaultImpl implements FrogCanvasKVStorageProxy	// class@00156b
{
    public MMKV mMMKV;
    public String mPath;

    public void FrogStorageDefaultImpl(){
       super();
    }
    public synchronized void clean(){
       if (PatchProxy.applyVoid(null, this, FrogStorageDefaultImpl.class, "8")) {
          return;
       }
       FrogStorageDefaultImpl tmMMKV = this.mMMKV;
       if (tmMMKV == null) {
          return;
       }
       String[] stringArray = tmMMKV.allKeys();
       if (stringArray != null) {
          this.mMMKV.removeValuesForKeys(stringArray);
       }
       return;
    }
    public synchronized JSONObject get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogStorageDefaultImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMMKV == null) {
          this.initMMKV();
       }
       if (this.mMMKV == null || TextUtils.isEmpty(p0)) {
          return null;
       }else {
          p0 = this.mMMKV.decodeString(p0);
          if (!TextUtils.isEmpty(p0)) {
             try{
                return new JSONObject(p0);
             }catch(java.lang.Exception e3){
                FrogLog.e("FrogStorage", e3.getMessage());
             }
             return v1;
          }else {
             goto label_0041 ;
          }
       }
    }
    public synchronized String[] getAllKeys(){
       FrogStorageDefaultImpl obj = PatchProxy.apply(null, this, FrogStorageDefaultImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMMKV == null) {
          this.initMMKV();
       }
       obj = this.mMMKV;
       if (obj == null) {
          return null;
       }else {
          return obj.allKeys();
       }
    }
    public synchronized long getTotalSize(){
       FrogStorageDefaultImpl obj = PatchProxy.apply(null, this, FrogStorageDefaultImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.mMMKV == null) {
          this.initMMKV();
       }
       obj = this.mMMKV;
       long l = 0;
       if (obj == null) {
          return l;
       }else {
          String[] stringArray = obj.allKeys();
          if (stringArray == null || stringArray.length <= 0) {
             return l;
          }else {
             int len = stringArray.length;
             for (int i = 0; i < len; i = i + 1) {
                l = l + (long)this.mMMKV.getValueActualSize(stringArray[i]);
             }
             l = l / 1024;
             if (((float)l / 1024.00f) - (float)l > 0) {
                return (l + 1);
             }else {
                return l;
             }
          }
       }
    }
    public synchronized void init(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogStorageDefaultImpl.class, "2")) {
          return;
       }
       this.mPath = p0;
       AsyncTask.execute(new FrogStorageDefaultImpl$a(this));
       return;
    }
    public synchronized void initMMKV(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FrogStorageDefaultImpl.class, "1")) {
          return;
       }
       if (TextUtils.isEmpty(this.mPath)) {
          return;
       }
       FrogStorageDefaultImpl tmPath = this.mPath;
       try{
          File uFile = new File(tmPath);
          if (!uFile.exists()) {
             uFile.mkdirs();
          }
          if (this.mMMKV != null) {
             return;
          }else {
             File uFile1 = new File(e0, "mmkv.default");
             if (uFile1.exists()) {
                MMKV.initialize(this.mPath);
                objArray = MMKV.defaultMMKV();
             }
             HashMap hashMap = new HashMap();
             if (objArray != null) {
                String[] stringArray = objArray.allKeys();
                if (stringArray == null || stringArray.length <= 0) {
                   objArray.close();
                   uFile1.delete();
                }else {
                   int len = stringArray.length;
                   for (int i = 0; i < len; i = i + 1) {
                      object oobject = stringArray[i];
                      hashMap.put(oobject, objArray.getString(oobject, ""));
                   }
                   objArray.close();
                   uFile1.delete();
                }
             }
             if (TextUtils.isEmpty(MMKV.getRootDir()) || objArray != null) {
                MMKV.initialize(FrogEngineInternal.getApplicationContext());
             }
             this.mMMKV = MMKV.mmkvWithID(MD5Utils.getMd5Digest(this.mPath), 2, "", this.mPath);
             Iterator iterator = hashMap.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                String key = uEntry.getKey();
                this.mMMKV.encode(key, uEntry.getValue());
             }
             return;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public synchronized void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogStorageDefaultImpl.class, "7")) {
          return;
       }
       if (this.mMMKV == null) {
          this.initMMKV();
       }
       if (this.mMMKV == null || TextUtils.isEmpty(p0)) {
          return;
       }else {
          this.mMMKV.remove(p0);
          return;
       }
    }
    public synchronized void save(String p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogStorageDefaultImpl.class, "5")) {
          return;
       }
       if (this.mMMKV == null) {
          this.initMMKV();
       }
       FrogStorageDefaultImpl tmMMKV = this.mMMKV;
       if (tmMMKV == null || p1 == null) {
          return;
       }else {
          tmMMKV.encode(p0, p1.toString());
          return;
       }
    }
}
