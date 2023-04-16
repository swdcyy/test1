package com.frog.engine.storage.FrogStorageManager;
import com.frog.engine.FrogCanvasKVStorageProxy;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import org.json.JSONObject;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONArray;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import java.lang.Number;
import java.lang.Boolean;

public class FrogStorageManager	// class@00156c
{
    public FrogCanvasKVStorageProxy mFrogCanvasKVStorageProxy;

    public void FrogStorageManager(FrogCanvasKVStorageProxy p0){
       super();
       this.mFrogCanvasKVStorageProxy = p0;
    }
    public void clean(){
       if (PatchProxy.applyVoid(null, this, FrogStorageManager.class, "8")) {
          return;
       }
       FrogStorageManager tmFrogCanvas = this.mFrogCanvasKVStorageProxy;
       if (tmFrogCanvas != null) {
          tmFrogCanvas.clean();
       }
       return;
    }
    public JSONObject get(String p0){
       FrogStorageManager obj = PatchProxy.applyOneRefs(p0, this, FrogStorageManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mFrogCanvasKVStorageProxy;
       if (obj != null) {
          return obj.get(p0);
       }
       return null;
    }
    public JSONObject getStorageInfo(){
       JSONObject obj = PatchProxy.apply(null, this, FrogStorageManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mFrogCanvasKVStorageProxy == null) {
          return new JSONObject();
       }
       try{
          obj = new JSONObject();
          String[] allKeys = this.mFrogCanvasKVStorageProxy.getAllKeys();
          JSONArray jSONArray = new JSONArray();
          if (allKeys != null && allKeys.length > 0) {
             int len = allKeys.length;
             for (int i = 0; i < len; i = i + 1) {
                jSONArray.put(allKeys[i]);
             }
          }
          obj.put("keys", jSONArray);
          obj.put("currentSize", this.mFrogCanvasKVStorageProxy.getTotalSize());
          obj.put("limitSize", 0x2800);
       }catch(java.lang.Exception e1){
          FrogLog.e("FrogStorageManager", e1.getMessage());
       }
       return obj;
    }
    public long getTotalSize(){
       FrogStorageManager obj = PatchProxy.apply(null, this, FrogStorageManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mFrogCanvasKVStorageProxy;
       if (obj != null) {
          return obj.getTotalSize();
       }
       return 0;
    }
    public void init(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogStorageManager.class, "1")) {
          return;
       }
       FrogStorageManager tmFrogCanvas = this.mFrogCanvasKVStorageProxy;
       if (tmFrogCanvas != null) {
          tmFrogCanvas.init(p0);
       }
       return;
    }
    public void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogStorageManager.class, "6")) {
          return;
       }
       FrogStorageManager tmFrogCanvas = this.mFrogCanvasKVStorageProxy;
       if (tmFrogCanvas != null) {
          tmFrogCanvas.remove(p0);
       }
       return;
    }
    public void save(String p0,JSONObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogStorageManager.class, "4")) {
          return;
       }
       FrogStorageManager tmFrogCanvas = this.mFrogCanvasKVStorageProxy;
       if (tmFrogCanvas != null) {
          tmFrogCanvas.save(p0, p1);
       }
       return;
    }
    public boolean storageIsFull(){
       FrogStorageManager obj = PatchProxy.apply(null, this, FrogStorageManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mFrogCanvasKVStorageProxy;
       boolean b = false;
       if (obj != null && obj.getTotalSize() - 0x2800 > 0) {
          b = true;
       }
       return b;
    }
}
