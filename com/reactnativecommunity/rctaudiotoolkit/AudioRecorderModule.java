package com.reactnativecommunity.rctaudiotoolkit.AudioRecorderModule;
import android.media.MediaRecorder$OnInfoListener;
import android.media.MediaRecorder$OnErrorListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.lang.Integer;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.util.Map;
import android.media.MediaRecorder;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.StringBuilder;
import java.util.Objects;
import com.facebook.react.bridge.Arguments;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.os.Build$VERSION;
import java.lang.Boolean;
import java.lang.Exception;
import android.net.Uri;
import java.io.IOException;
import com.kuaishou.webkit.URLUtil;
import android.content.ContextWrapper;
import android.content.Context;
import java.io.File;

public class AudioRecorderModule extends ReactContextBaseJavaModule implements MediaRecorder$OnInfoListener, MediaRecorder$OnErrorListener	// class@000b6b
{
    public ReactApplicationContext context;
    public Map recorderAutoDestroy;
    public Map recorderPool;

    public void AudioRecorderModule(ReactApplicationContext p0){
       super(p0);
       this.recorderPool = new HashMap();
       this.recorderAutoDestroy = new HashMap();
       this.context = p0;
    }
    public final void destroy(Integer p0){
       this.destroy(p0, null);
    }
    public void destroy(Integer p0,Callback p1){
       MediaRecorder mediaRecorde = this.recorderPool.get(p0);
       if (mediaRecorde != null) {
          mediaRecorde.release();
          this.recorderPool.remove(p0);
          this.recorderAutoDestroy.remove(p0);
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putString("message", "Destroyed recorder");
          this.emitEvent(p0, "info", writableNati);
       }
       if (p1 != null) {
          Object[] objArray = new Object[0];
          p1.invoke(objArray);
       }
       return;
    }
    public final void emitEvent(Integer p0,String p1,WritableMap p2){
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putString("event", p1);
       writableNati.putMap("data", p2);
       if (this.context.hasActiveCatalystInstance()) {
          this.context.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("RCTAudioRecorderEvent:"+p0, writableNati);
       }
       return;
    }
    public final int encoderFromName(String p0){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x17843:
             if (p0.equals("aac")) {
                i = 0;
             }
             break;
           case 0x179c6:
             if (p0.equals("amr")) {
                i = 1;
             }
             break;
           case 0x1a6f1:
             if (p0.equals("mp4")) {
                i = 2;
             }
             break;
           case 0x1ad8f:
             if (p0.equals("ogg")) {
                i = 3;
             }
             break;
           case 0x379f99:
             if (p0.equals("webm")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return 3;
           case 1:
             return 2;
           case 2:
             return 4;
           case 3:
           case 4:
             return 6;
           default:
             return 0;
       }
    }
    public final int encoderFromPath(String p0){
       return this.encoderFromName(p0.substring((p0.lastIndexOf(46) + 1)));
    }
    public final WritableMap errObj(String p0,String p1){
       StackTraceElement[] stackTrace;
       String str;
       WritableMap writableMap = Arguments.createMap();
       try{
          stackTrace = Thread.currentThread().getStackTrace();
          int len = stackTrace.length;
          str = "";
          for (int i = 0; i < len; i = i + 1) {
             object oobject = stackTrace[i];
             StringBuilder str1 = str;
             str = (oobject != null)? oobject.toString(): "null";
             str = str1+str+"\n";
          }
       }catch(java.lang.Exception e0){
          str = "Exception occurred while parsing stack trace";
       }
       e0.putString("err", p0);
       e0.putString("message", p1);
       e0.putString("stackTrace", str);
       return e0;
    }
    public final int formatFromName(String p0){
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x17843:
             if (p0.equals("aac")) {
                i = 0;
             }
             break;
           case 0x179c6:
             if (p0.equals("amr")) {
                i = 1;
             }
             break;
           case 0x1a6f1:
             if (p0.equals("mp4")) {
                i = 2;
             }
             break;
           case 0x1ad8f:
             if (p0.equals("ogg")) {
                i = 3;
             }
             break;
           case 0x379f99:
             if (p0.equals("webm")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return 6;
           case 1:
             return 4;
           case 2:
             return 2;
           case 3:
           case 4:
             return 9;
           default:
             return 0;
       }
    }
    public final int formatFromPath(String p0){
       return this.formatFromName(p0.substring((p0.lastIndexOf(46) + 1)));
    }
    public String getName(){
       return "RCTAudioRecorder";
    }
    public final Integer getRecorderId(MediaRecorder p0){
       Map$Entry uEntry;
       Iterator iterator = this.recorderPool.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uEntry = iterator.next();
          if (Objects.equals(p0, uEntry.getValue())) {
             break ;
          }
       }
       return uEntry.getKey();
    }
    public void onError(MediaRecorder p0,int p1,int p2){
       Integer recorderId = this.getRecorderId(p0);
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putInt("what", p1);
       writableNati.putInt("extra", p2);
       WritableNativeMap writableNati1 = new WritableNativeMap();
       writableNati1.putMap("err", writableNati);
       writableNati1.putString("message", "Android MediaRecorder error");
       this.emitEvent(recorderId, "error", writableNati1);
       this.destroy(recorderId);
    }
    public void onInfo(MediaRecorder p0,int p1,int p2){
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putInt("what", p1);
       writableNati.putInt("extra", p2);
       WritableNativeMap writableNati1 = new WritableNativeMap();
       writableNati1.putMap("info", writableNati);
       writableNati1.putString("message", "Android MediaRecorder info");
       this.emitEvent(this.getRecorderId(p0), "info", writableNati1);
    }
    public void pause(Integer p0,Callback p1){
       if (Build$VERSION.SDK_INT < 24) {
          Object[] objArray = new Object[]{this.errObj("notsupported", "Android version doesn\'t support pause")};
          p1.invoke(objArray);
          return;
       }else {
          this.pause24(p0, p1);
          return;
       }
    }
    public final void pause24(Integer p0,Callback p1){
       Object[] objArray;
       MediaRecorder mediaRecorde = this.recorderPool.get(p0);
       int i = 1;
       if (mediaRecorde == null) {
          objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "recorderId "+p0+"not found.");
          p1.invoke(objArray);
          return;
       }else {
          try{
             mediaRecorde.pause();
             if (this.recorderAutoDestroy.get(p0).booleanValue()) {
                this.destroy(p0);
             }
             Object[] objArray1 = new Object[0];
             p1.invoke(objArray1);
          }catch(java.lang.Exception e5){
             objArray = new Object[i];
             objArray[0] = this.errObj("stopfail", e5.toString());
             p1.invoke(objArray);
          }
          return;
       }
    }
    public void prepare(Integer p0,String p1,ReadableMap p2,Callback p3){
       Object[] objArray;
       if (p1 == null || p1.isEmpty()) {
          objArray = new Object[]{this.errObj("invalidpath", "Provided path was empty")};
          p3.invoke(objArray);
          return;
       }else {
          this.destroy(p0);
          Uri uri = this.uriFromPath(p1);
          uri.getPath();
          MediaRecorder mediaRecorde = new MediaRecorder();
          mediaRecorde.setAudioSource(1);
          int i = this.formatFromPath(p1);
          boolean i1 = this.encoderFromPath(p1);
          int i2 = 0x1f400;
          int i3 = 0xac44;
          String str = "format";
          if (p2.hasKey(str)) {
             i = this.formatFromName(p2.getString(str));
          }
          str = "encoder";
          if (p2.hasKey(str)) {
             i1 = this.encoderFromName(p2.getString(str));
          }
          str = "bitrate";
          if (p2.hasKey(str)) {
             i2 = p2.getInt(str);
          }
          str = "channels";
          int intx = (p2.hasKey(str))? p2.getInt(str): 2;
          if (p2.hasKey("sampleRate")) {
             i3 = p2.getInt("sampleRate");
          }
          mediaRecorde.setOutputFormat(i);
          mediaRecorde.setAudioEncoder(i1);
          mediaRecorde.setAudioEncodingBitRate(i2);
          mediaRecorde.setAudioChannels(intx);
          mediaRecorde.setAudioSamplingRate(i3);
          mediaRecorde.setOutputFile(uri.getPath());
          mediaRecorde.setOnErrorListener(this);
          mediaRecorde.setOnInfoListener(this);
          this.recorderPool.put(p0, mediaRecorde);
          i1 = "autoDestroy";
          i1 = (p2.hasKey(i1))? p2.getBoolean(i1): true;
          AudioRecorderModule trecorderAut = this.recorderAutoDestroy;
          Boolean uBoolean = Boolean.valueOf(i1);
          try{
             trecorderAut.put(p0, uBoolean);
             mediaRecorde.prepare();
             objArray = new Object[]{null,uri.getPath()};
             p3.invoke(objArray);
          }catch(java.io.IOException e12){
             Object[] objArray1 = new Object[]{this.errObj("preparefail", e12.toString())};
             p3.invoke(objArray1);
          }
          return;
       }
    }
    public void record(Integer p0,Callback p1){
       Object[] objArray;
       MediaRecorder mediaRecorde = this.recorderPool.get(p0);
       int i = 1;
       if (mediaRecorde == null) {
          objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "recorderId "+p0+"not found.");
          p1.invoke(objArray);
          return;
       }else {
          try{
             mediaRecorde.start();
             Object[] objArray1 = new Object[0];
             p1.invoke(objArray1);
          }catch(java.lang.Exception e5){
             objArray = new Object[i];
             objArray[0] = this.errObj("startfail", e5.toString());
             p1.invoke(objArray);
          }
          return;
       }
    }
    public void stop(Integer p0,Callback p1){
       Object[] objArray;
       MediaRecorder mediaRecorde = this.recorderPool.get(p0);
       int i = 1;
       if (mediaRecorde == null) {
          objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "recorderId "+p0+"not found.");
          p1.invoke(objArray);
          return;
       }else {
          try{
             mediaRecorde.stop();
             if (this.recorderAutoDestroy.get(p0).booleanValue()) {
                this.destroy(p0);
             }
             Object[] objArray1 = new Object[0];
             p1.invoke(objArray1);
          }catch(java.lang.Exception e5){
             objArray = new Object[i];
             objArray[0] = this.errObj("stopfail", e5.toString());
             p1.invoke(objArray);
          }
          return;
       }
    }
    public final Uri uriFromPath(String p0){
       Uri uri = (URLUtil.isValidUrl(p0))? Uri.parse(p0): Uri.fromFile(new File(new ContextWrapper(this.context).getFilesDir()+"/"+p0));
       return uri;
    }
}
