package com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import be.c;
import java.lang.Object;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.String;
import java.lang.StringBuilder;
import hg.a;
import ce.b$a;
import ce.b;
import cb.a;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import android.util.Pair;
import java.util.HashSet;
import java.lang.Integer;

public class FabricEventEmitter implements RCTEventEmitter	// class@001266
{
    public final c mUIManager;

    public void FabricEventEmitter(c p0){
       super();
       this.mUIManager = p0;
    }
    public final WritableArray copyWritableArray(WritableArray p0){
       WritableNativeArray writableNati = new WritableNativeArray();
       for (int i = 0; i < p0.size(); i = i + 1) {
          writableNati.pushMap(this.getWritableMap(p0.getMap(i)));
       }
       return writableNati;
    }
    public final WritableMap getWritableMap(ReadableMap p0){
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.merge(p0);
       return writableNati;
    }
    public void receiveEvent(int p0,String p1,WritableMap p2){
       WritableNativeMap writableNati;
       a.a(0, "FabricEventEmitter.receiveEvent\(\'"+p1+"\'\)");
       b$a uoa = this.mUIManager.d.d(p0);
       String str = (uoa == null)? null: uoa.h;
       if (str == null) {
          a.a("FabricUIManager", "Unable to invoke event: "+p1+" for reactTag: "+p0);
       }else if(p2 == null){
          writableNati = new WritableNativeMap();
       }else {
          writableNati = p2;
       }
       str.invokeEvent(p1, writableNati);
       a.c(0, "FabricEventEmitter.receiveEvent\(\'"+p1+"\'\)");
       return;
    }
    public void receiveTouches(String p0,WritableArray p1,WritableArray p2){
       Pair pair = (("topTouchEnd").equalsIgnoreCase(p0) || ("topTouchCancel").equalsIgnoreCase(p0))? this.removeTouchesAtIndices(p1, p2): this.touchSubsequence(p1, p2);
       Pair first = pair.first;
       pair = pair.second;
       for (int i = 0; i < first.size(); i = i + 1) {
          WritableMap writableMap = this.getWritableMap(first.getMap(i));
          writableMap.putArray("changedTouches", this.copyWritableArray(first));
          writableMap.putArray("touches", this.copyWritableArray(pair));
          int intx = writableMap.getInt("target");
          if (intx < 1) {
             a.g("FabricEventEmitter", "A view is reporting that a touch occurred on tag zero.");
             intx = 0;
          }
          this.receiveEvent(intx, p0, writableMap);
       }
       return;
    }
    public final Pair removeTouchesAtIndices(WritableArray p0,WritableArray p1){
       WritableNativeArray writableNati = new WritableNativeArray();
       WritableNativeArray writableNati1 = new WritableNativeArray();
       HashSet hashSet = new HashSet();
       int i = 0;
       for (int i1 = 0; i1 < p1.size(); i1 = i1 + 1) {
          int intx = p1.getInt(i1);
          writableNati.pushMap(this.getWritableMap(p0.getMap(intx)));
          hashSet.add(Integer.valueOf(intx));
       }
       while (i < p0.size()) {
          if (!hashSet.contains(Integer.valueOf(i))) {
             writableNati1.pushMap(this.getWritableMap(p0.getMap(i)));
          }
          i = i + 1;
       }
       return new Pair(writableNati, writableNati1);
    }
    public final Pair touchSubsequence(WritableArray p0,WritableArray p1){
       WritableNativeArray writableNati = new WritableNativeArray();
       for (int i = 0; i < p1.size(); i = i + 1) {
          writableNati.pushMap(this.getWritableMap(p0.getMap(p1.getInt(i))));
       }
       return new Pair(writableNati, p0);
    }
}
