package com.reactnativecommunity.rctaudiotoolkit.AudioPlayerModule;
import android.media.MediaPlayer$OnInfoListener;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnBufferingUpdateListener;
import com.facebook.react.bridge.LifecycleEventListener;
import android.media.AudioManager$OnAudioFocusChangeListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import java.lang.Object;
import android.media.AudioManager;
import java.lang.Integer;
import com.facebook.react.bridge.Callback;
import java.util.Map;
import android.media.MediaPlayer;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.StringBuilder;
import com.facebook.react.bridge.Arguments;
import java.lang.Thread;
import java.lang.StackTraceElement;
import java.lang.Exception;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.lang.Float;
import android.os.Build$VERSION;
import android.media.PlaybackParams;
import android.net.Uri;
import android.content.Context;
import com.reactnativecommunity.rctaudiotoolkit.AudioPlayerModule$a;
import android.media.MediaPlayer$OnPreparedListener;
import java.io.IOException;
import android.content.ContextWrapper;
import java.io.File;
import android.os.Environment;
import android.content.res.Resources;

public class AudioPlayerModule extends ReactContextBaseJavaModule implements MediaPlayer$OnInfoListener, MediaPlayer$OnErrorListener, MediaPlayer$OnCompletionListener, MediaPlayer$OnSeekCompleteListener, MediaPlayer$OnBufferingUpdateListener, LifecycleEventListener, AudioManager$OnAudioFocusChangeListener	// class@000b6a
{
    public ReactApplicationContext context;
    public Integer lastPlayerId;
    public boolean looping;
    public AudioManager mAudioManager;
    public boolean mixWithOthers;
    public Map playerAutoDestroy;
    public Map playerContinueInBackground;
    public Map playerPool;
    public Map playerSeekCallback;
    public Map playerSpeed;

    public void AudioPlayerModule(ReactApplicationContext p0){
       super(p0);
       this.playerPool = new HashMap();
       this.playerAutoDestroy = new HashMap();
       this.playerContinueInBackground = new HashMap();
       this.playerSeekCallback = new HashMap();
       this.playerSpeed = new HashMap();
       this.looping = false;
       this.mixWithOthers = false;
       this.context = p0;
       p0.addLifecycleEventListener(this);
       this.mAudioManager = this.context.getSystemService("audio");
    }
    public static boolean equals(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public final void destroy(Integer p0){
       this.destroy(p0, null);
    }
    public void destroy(Integer p0,Callback p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.release();
          this.playerPool.remove(p0);
          this.playerAutoDestroy.remove(p0);
          this.playerContinueInBackground.remove(p0);
          this.playerSeekCallback.remove(p0);
          this.playerSpeed.remove(p0);
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putString("message", "Destroyed player");
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
          this.context.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("RCTAudioPlayerEvent:"+p0, writableNati);
       }
       return;
    }
    public final WritableMap errObj(String p0,String p1){
       return this.errObj(p0, p1, true);
    }
    public final WritableMap errObj(String p0,String p1,boolean p2){
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
       if (p2) {
          e0.putString("stackTrace", str);
       }
       return e0;
    }
    public void getCurrentTime(Integer p0,Callback p1){
       Object[] objArray;
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 1;
       if (mediaPlayer == null) {
          objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "playerId "+p0+" not found.");
          p1.invoke(objArray);
          return;
       }else {
          int i1 = 2;
          try{
             Object[] objArray1 = new Object[i1];
             objArray1[0] = null;
             objArray1[i] = this.getInfo(mediaPlayer);
             p1.invoke(objArray1);
          }catch(java.lang.Exception e5){
             objArray = new Object[i];
             objArray[0] = this.errObj("getCurrentTime", e5.toString());
             p1.invoke(objArray);
          }
          return;
       }
    }
    public WritableMap getInfo(MediaPlayer p0){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putDouble("duration", (double)p0.getDuration());
       writableMap.putDouble("position", (double)p0.getCurrentPosition());
       writableMap.putDouble("audioSessionId", (double)p0.getAudioSessionId());
       return writableMap;
    }
    public String getName(){
       return "RCTAudioPlayer";
    }
    public final Integer getPlayerId(MediaPlayer p0){
       Map$Entry uEntry;
       Iterator iterator = this.playerPool.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uEntry = iterator.next();
          if (AudioPlayerModule.equals(p0, uEntry.getValue())) {
             break ;
          }
       }
       return uEntry.getKey();
    }
    public void onAudioFocusChange(int p0){
       if (p0 == -2 || p0 == -1) {
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.putString("message", "Lost audio focus, playback paused");
          this.emitEvent(this.lastPlayerId, "forcePause", writableNati);
       }
       return;
    }
    public void onBufferingUpdate(MediaPlayer p0,int p1){
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putString("message", "Status update for media stream buffering");
       writableNati.putInt("percent", p1);
       this.emitEvent(this.getPlayerId(p0), "progress", writableNati);
    }
    public void onCompletion(MediaPlayer p0){
       Integer playerId = this.getPlayerId(p0);
       WritableNativeMap writableNati = new WritableNativeMap();
       p0.seekTo(0);
       if (this.looping != null) {
          p0.start();
          writableNati.putString("message", "Media playback looped");
          this.emitEvent(playerId, "looped", writableNati);
       }else {
          writableNati.putString("message", "Playback completed");
          this.emitEvent(playerId, "ended", writableNati);
       }
       if (this.looping == null && this.playerAutoDestroy.get(playerId).booleanValue()) {
          this.destroy(playerId);
       }
       return;
    }
    public boolean onError(MediaPlayer p0,int p1,int p2){
       Integer playerId = this.getPlayerId(p0);
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putInt("what", p1);
       writableNati.putInt("extra", p2);
       WritableNativeMap writableNati1 = new WritableNativeMap();
       writableNati1.putMap("err", writableNati);
       writableNati1.putString("message", "Android MediaPlayer error");
       this.emitEvent(playerId, "error", writableNati1);
       this.destroy(playerId);
       return true;
    }
    public void onHostDestroy(){
    }
    public void onHostPause(){
       Iterator iterator = new HashMap(this.playerPool).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Integer key = uEntry.getKey();
          Boolean uBoolean = this.playerContinueInBackground.get(key);
          if (uBoolean != null && !uBoolean.booleanValue()) {
             MediaPlayer value = uEntry.getValue();
             if (value == null) {
                continue ;
             }else {
                try{
                   value.pause();
                   WritableNativeMap writableNati = new WritableNativeMap();
                   writableNati.putString("message", "Playback paused due to onHostPause");
                   writableNati.putMap("info", this.getInfo(value));
                   this.emitEvent(key, "pause", writableNati);
                }catch(java.lang.Exception e1){
                   e1.toString();
                   goto label_000f ;
                }
             }
          }
       }
       return;
    }
    public void onHostResume(){
    }
    public boolean onInfo(MediaPlayer p0,int p1,int p2){
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putInt("what", p1);
       writableNati.putInt("extra", p2);
       WritableNativeMap writableNati1 = new WritableNativeMap();
       writableNati1.putMap("info", writableNati);
       writableNati1.putString("message", "Android MediaPlayer info");
       this.emitEvent(this.getPlayerId(p0), "info", writableNati1);
       return false;
    }
    public void onSeekComplete(MediaPlayer p0){
       Integer playerId = this.getPlayerId(p0);
       Callback uCallback = this.playerSeekCallback.get(playerId);
       if (uCallback != null) {
          Object[] objArray = new Object[]{null,this.getInfo(p0)};
          uCallback.invoke(objArray);
          this.playerSeekCallback.remove(playerId);
       }
       WritableNativeMap writableNati = new WritableNativeMap();
       writableNati.putString("message", "Seek operation completed");
       this.emitEvent(playerId, "seeked", writableNati);
       return;
    }
    public void pause(Integer p0,Callback p1){
       String str = "pause";
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 1;
       if (mediaPlayer == null) {
          Object[] objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "playerId "+p0+" not found.");
          p1.invoke(objArray);
          return;
       }else {
          try{
             mediaPlayer.pause();
             WritableNativeMap writableNati = new WritableNativeMap();
             writableNati.putString("message", "Playback paused");
             writableNati.putMap("info", this.getInfo(mediaPlayer));
             this.emitEvent(p0, str, writableNati);
             Object[] objArray1 = new Object[]{null,this.getInfo(mediaPlayer)};
             p1.invoke(objArray1);
          }catch(java.lang.Exception e9){
             Object[] objArray2 = new Object[i];
             objArray2[0] = this.errObj(str, e9.toString());
             p1.invoke(objArray2);
          }
          return;
       }
    }
    public void play(Integer p0,Callback p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 1;
       if (mediaPlayer == null) {
          Object[] objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "playerId "+p0+" not found.");
          p1.invoke(objArray);
          return;
       }else if(this.mixWithOthers == null){
          this.mAudioManager.requestAudioFocus(this, 3, i);
       }
       Float uFloat = this.playerSpeed.get(p0);
       if (Build$VERSION.SDK_INT >= 23 && uFloat != null) {
          PlaybackParams playbackPara = new PlaybackParams();
          playbackPara.setSpeed(uFloat.floatValue());
          mediaPlayer.setPlaybackParams(playbackPara);
          if (!mediaPlayer.isPlaying()) {
             mediaPlayer.start();
          }
       }else {
          mediaPlayer.start();
       }
       Object[] objArray1 = new Object[]{null,this.getInfo(mediaPlayer)};
       p1.invoke(objArray1);
    }
    public void prepare(Integer p0,String p1,ReadableMap p2,Callback p3){
       Object[] objArray1;
       if (p1 == null || p1.isEmpty()) {
          Object[] objArray = new Object[]{this.errObj("nopath", "Provided path was empty")};
          p3.invoke(objArray);
          return;
       }else {
          this.destroy(p0);
          this.lastPlayerId = p0;
          Uri uri = this.uriFromPath(p1);
          try{
             MediaPlayer mediaPlayer = new MediaPlayer();
             uri.getPath();
             mediaPlayer.setDataSource(this.context, uri);
             mediaPlayer.setOnErrorListener(this);
             mediaPlayer.setOnInfoListener(this);
             mediaPlayer.setOnCompletionListener(this);
             mediaPlayer.setOnSeekCompleteListener(this);
             mediaPlayer.setOnPreparedListener(new AudioPlayerModule$a(this, p3));
             this.playerPool.put(p0, mediaPlayer);
             uri = "autoDestroy";
             boolean booleanx = (p2.hasKey(uri))? p2.getBoolean(uri): true;
             String str = "continuesToPlayInBackground";
             boolean booleanx1 = (p2.hasKey(str))? p2.getBoolean(str): false;
             this.mixWithOthers = false;
             if (p2.hasKey("mixWithOthers")) {
                this.mixWithOthers = p2.getBoolean("mixWithOthers");
             }
             this.playerAutoDestroy.put(p0, Boolean.valueOf(booleanx));
             AudioPlayerModule tplayerConti = this.playerContinueInBackground;
             Boolean uBoolean = Boolean.valueOf(booleanx1);
             try{
                tplayerConti.put(p0, uBoolean);
                mediaPlayer.prepareAsync();
             }catch(java.lang.Exception e7){
                objArray1 = new Object[]{this.errObj("prepare", e7.toString())};
                p3.invoke(objArray1);
             }
             return;
          }catch(java.io.IOException e7){
             objArray1 = new Object[]{this.errObj("invalidpath", e7.toString())};
             p3.invoke(objArray1);
             return;
          }
       }
    }
    public void seek(Integer p0,Integer p1,Callback p2){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 1;
       if (mediaPlayer == null) {
          Object[] objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "playerId "+p0+" not found.");
          p2.invoke(objArray);
          return;
       }else if(p1.intValue() >= 0){
          Callback uCallback = this.playerSeekCallback.get(p0);
          if (uCallback != null) {
             Object[] objArray1 = new Object[i];
             objArray1[0] = this.errObj("seekfail", "new seek operation before old one completed", 0);
             uCallback.invoke(objArray1);
             this.playerSeekCallback.remove(p0);
          }
          this.playerSeekCallback.put(p0, p2);
          mediaPlayer.seekTo(p1.intValue());
       }
       return;
    }
    public void set(Integer p0,ReadableMap p1,Callback p2){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 1;
       if (mediaPlayer == null) {
          Object[] objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "playerId "+p0+" not found.");
          p2.invoke(objArray);
          return;
       }else {
          String str = "wakeLock";
          if (p1.hasKey(str) && p1.getBoolean(str)) {
             mediaPlayer.setWakeMode(this.context, i);
          }
          String str1 = "autoDestroy";
          if (p1.hasKey(str1)) {
             this.playerAutoDestroy.put(p0, Boolean.valueOf(p1.getBoolean(str1)));
          }
          str1 = "continuesToPlayInBackground";
          if (p1.hasKey(str1)) {
             this.playerContinueInBackground.put(p0, Boolean.valueOf(p1.getBoolean(str1)));
          }
          str1 = "volume";
          if (p1.hasKey(str1) && !p1.isNull(str1)) {
             mediaPlayer.setVolume((float)p1.getDouble(str1), (float)p1.getDouble(str1));
          }
          str1 = "looping";
          if (p1.hasKey(str1) && !p1.isNull(str1)) {
             this.looping = p1.getBoolean(str1);
          }
          if (Build$VERSION.SDK_INT >= 23) {
             str1 = "speed";
             if (p1.hasKey(str1) || p1.hasKey("pitch")) {
                PlaybackParams playbackPara = new PlaybackParams();
                if (p1.hasKey(str1) && !p1.isNull(str1)) {
                   float f = (float)p1.getDouble(str1);
                   this.playerSpeed.put(p0, Float.valueOf(f));
                   if (mediaPlayer.isPlaying()) {
                      playbackPara.setSpeed(f);
                   }
                }
                if (p1.hasKey("pitch") && !p1.isNull("pitch")) {
                   playbackPara.setPitch((float)p1.getDouble("pitch"));
                }
                mediaPlayer.setPlaybackParams(playbackPara);
             }
          }
          Object[] objArray1 = new Object[0];
          p2.invoke(objArray1);
          return;
       }
    }
    public void stop(Integer p0,Callback p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 1;
       if (mediaPlayer == null) {
          Object[] objArray = new Object[i];
          objArray[0] = this.errObj("notfound", "playerId "+p0+" not found.");
          p1.invoke(objArray);
          return;
       }else if(this.playerAutoDestroy.get(p0).booleanValue()){
          mediaPlayer.pause();
          this.destroy(p0);
          Object[] objArray1 = new Object[0];
          p1.invoke(objArray1);
       }else {
          Callback uCallback = this.playerSeekCallback.get(p0);
          if (uCallback != null) {
             Object[] objArray2 = new Object[i];
             objArray2[0] = this.errObj("seekfail", "Playback stopped before seek operation could finish");
             uCallback.invoke(objArray2);
             this.playerSeekCallback.remove(p0);
          }
          this.playerSeekCallback.put(p0, p1);
          mediaPlayer.seekTo(0);
          mediaPlayer.pause();
       }
    }
    public final Uri uriFromPath(String p0){
       File uFile = new File(new ContextWrapper(this.context).getFilesDir()+"/"+p0);
       if (uFile.exists()) {
          return Uri.fromFile(uFile);
       }
       uFile = new File(Environment.getExternalStorageDirectory()+"/"+p0);
       if (uFile.exists()) {
          return Uri.fromFile(uFile);
       }
       File uFile1 = new File(p0);
       if (uFile1.exists()) {
          return Uri.fromFile(uFile1);
       }
       int i = 46;
       String str = (p0.lastIndexOf(i) != -1)? p0.substring(0, p0.lastIndexOf(i)): p0;
       i = this.context.getResources().getIdentifier(str, "raw", this.context.getPackageName());
       if (i) {
          return Uri.parse("android.resource://"+this.context.getPackageName()+"/"+i);
       }else {
          return Uri.parse(p0);
       }
    }
}
