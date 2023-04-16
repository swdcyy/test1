package com.zmxv.RNSound.RNSoundModule;
import android.media.AudioManager$OnAudioFocusChangeListener;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.String;
import android.media.MediaPlayer;
import android.content.res.Resources;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import java.io.FileDescriptor;
import android.content.res.AssetManager;
import java.lang.CharSequence;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.File;
import java.util.Map;
import java.lang.Object;
import java.lang.Double;
import com.facebook.react.bridge.Callback;
import java.lang.Integer;
import com.facebook.react.bridge.ReactContext;
import android.media.AudioManager;
import java.lang.Float;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Exception;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.zmxv.RNSound.RNSoundModule$c;
import android.media.MediaPlayer$OnCompletionListener;
import com.zmxv.RNSound.RNSoundModule$d;
import android.media.MediaPlayer$OnErrorListener;
import com.facebook.react.bridge.ReadableMap;
import android.os.Build$VERSION;
import android.media.PlaybackParams;
import java.util.Objects;
import com.zmxv.RNSound.RNSoundModule$a;
import android.media.MediaPlayer$OnPreparedListener;
import com.zmxv.RNSound.RNSoundModule$b;
import java.lang.Math;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;

public class RNSoundModule extends ReactContextBaseJavaModule implements AudioManager$OnAudioFocusChangeListener	// class@000c76
{
    public String category;
    public ReactApplicationContext context;
    public Double focusedPlayerKey;
    public Boolean mixWithOthers;
    public Map playerPool;
    public Boolean wasPlayingBeforeFocusChange;
    public static final Object NULL;

    public void RNSoundModule(ReactApplicationContext p0){
       super(p0);
       this.playerPool = new HashMap();
       this.mixWithOthers = Boolean.TRUE;
       this.wasPlayingBeforeFocusChange = Boolean.FALSE;
       this.context = p0;
       this.category = null;
    }
    public void addListener(String p0){
    }
    public MediaPlayer createMediaPlayer(String p0){
       AssetFileDescriptor uAssetFileDe;
       int identifier = this.context.getResources().getIdentifier(p0, "raw", this.context.getPackageName());
       MediaPlayer mediaPlayer = new MediaPlayer();
       if (identifier) {
          try{
             uAssetFileDe = this.context.getResources().openRawResourceFd(identifier);
             mediaPlayer.setDataSource(uAssetFileDe.getFileDescriptor(), uAssetFileDe.getStartOffset(), uAssetFileDe.getLength());
             uAssetFileDe.close();
             return mediaPlayer;
          }catch(java.io.IOException e0){
             return v8;
          }
       }else {
          int i = 3;
          if (p0.startsWith("http://") || p0.startsWith("https://")) {
             try{
                mediaPlayer.setAudioStreamType(i);
                mediaPlayer.setDataSource(p0);
                return mediaPlayer;
             }catch(java.io.IOException e0){
                return v8;
             }
          }else {
             String str = "asset:/";
             if (p0.startsWith(str)) {
                try{
                   uAssetFileDe = SplitAssetHelper.openFd(this.context.getAssets(), p0.replace(str, ""));
                   mediaPlayer.setDataSource(uAssetFileDe.getFileDescriptor(), uAssetFileDe.getStartOffset(), uAssetFileDe.getLength());
                   uAssetFileDe.close();
                   return mediaPlayer;
                }catch(java.io.IOException e0){
                   return v8;
                }
             }else if(p0.startsWith("file:/")){
                try{
                   mediaPlayer.setDataSource(p0);
                   return mediaPlayer;
                }catch(java.io.IOException e0){
                   return v8;
                }
             }else if(new File(p0).exists()){
                try{
                   mediaPlayer.setAudioStreamType(i);
                   mediaPlayer.setDataSource(p0);
                   return mediaPlayer;
                }catch(java.io.IOException e0){
                   return v8;
                }
             }else {
                goto label_0097 ;
             }
          }
       }
    }
    public void enable(Boolean p0){
    }
    public Map getConstants(){
       HashMap hashMap = new HashMap();
       hashMap.put("IsAndroid", Boolean.TRUE);
       return hashMap;
    }
    public void getCurrentTime(Double p0,Callback p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 0;
       int i1 = 2;
       if (mediaPlayer == null) {
          Object[] objArray = new Object[i1];
          objArray[i] = Integer.valueOf(-1);
          objArray[1] = Boolean.FALSE;
          p1.invoke(objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i1];
          objArray1[i] = Double.valueOf(((double)mediaPlayer.getCurrentPosition() * 0x3f50624dd2f1a9fc));
          objArray1[1] = Boolean.valueOf(mediaPlayer.isPlaying());
          p1.invoke(objArray1);
          return;
       }
    }
    public String getName(){
       return "RNSound";
    }
    public void getSystemVolume(Callback p0){
       int i = 1;
       try{
          AudioManager systemServic = this.context.getSystemService("audio");
          Object[] objArray = new Object[i];
          objArray[0] = Float.valueOf(((float)systemServic.getStreamVolume(3) / (float)systemServic.getStreamMaxVolume(3)));
          p0.invoke(objArray);
       }catch(java.lang.Exception e2){
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("code", -1);
          writableMap.putString("message", e2.getMessage());
          Object[] objArray1 = new Object[i];
          objArray1[0] = writableMap;
          p0.invoke(objArray1);
       }
       return;
    }
    public void onAudioFocusChange(int p0){
       if (!this.mixWithOthers.booleanValue()) {
          MediaPlayer mediaPlayer = this.playerPool.get(this.focusedPlayerKey);
          if (mediaPlayer != null) {
             if (p0 <= 0) {
                Boolean uBoolean = Boolean.valueOf(mediaPlayer.isPlaying());
                this.wasPlayingBeforeFocusChange = uBoolean;
                if (uBoolean.booleanValue()) {
                   this.pause(this.focusedPlayerKey, null);
                }
             }else if(this.wasPlayingBeforeFocusChange.booleanValue()){
                this.play(this.focusedPlayerKey, null);
                this.wasPlayingBeforeFocusChange = Boolean.FALSE;
             }
          }
       }
       return;
    }
    public void onCatalystInstanceDestroy(){
       Iterator iterator = this.playerPool.entrySet().iterator();
       while (iterator.hasNext()) {
          MediaPlayer value = iterator.next().getValue();
          if (value != null) {
             value.reset();
             value.release();
          }
          iterator.remove();
       }
       return;
    }
    public void pause(Double p0,Callback p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null && mediaPlayer.isPlaying()) {
          mediaPlayer.pause();
       }
       if (p1 != null) {
          Object[] objArray = new Object[0];
          p1.invoke(objArray);
       }
       return;
    }
    public void play(Double p0,Callback p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       int i = 1;
       if (mediaPlayer == null) {
          this.setOnPlay(false, p0);
          if (p1 != null) {
             Object[] objArray = new Object[i];
             objArray[0] = Boolean.FALSE;
             p1.invoke(objArray);
          }
          return;
       }else if(mediaPlayer.isPlaying()){
          return;
       }else if(!this.mixWithOthers.booleanValue()){
          this.context.getSystemService("audio").requestAudioFocus(this, 3, i);
          this.focusedPlayerKey = p0;
       }
       mediaPlayer.setOnCompletionListener(new RNSoundModule$c(this, p0, p1));
       mediaPlayer.setOnErrorListener(new RNSoundModule$d(this, p0, p1));
       mediaPlayer.start();
       this.setOnPlay(i, p0);
       return;
    }
    public void prepare(String p0,Double p1,ReadableMap p2,Callback p3){
       Object[] objArray;
       MediaPlayer mediaPlayer = this.createMediaPlayer(p0);
       String str = "speed";
       if (p2.hasKey(str) && Build$VERSION.SDK_INT >= -0.00f) {
          mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed((float)p2.getDouble(str)));
       }
       int i = -1;
       if (mediaPlayer == null) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("code", i);
          writableMap.putString("message", "resource not found");
          objArray = new Object[]{writableMap,RNSoundModule.NULL};
          p3.invoke(objArray);
          return;
       }else {
          this.playerPool.put(p1, mediaPlayer);
          RNSoundModule tcategory = this.category;
          if (tcategory != null) {
             Integer integer = null;
             Objects.requireNonNull(tcategory);
             switch (tcategory.hashCode()){
                 case 0x94815e4f:
                   if (tcategory.equals("System")) {
                      i = 0;
                   }
                   break;
                 case 0x26de50:
                   if (tcategory.equals("Ring")) {
                      i = 1;
                   }
                   break;
                 case 0x3c68a31:
                   if (tcategory.equals("Alarm")) {
                      i = 2;
                   }
                   break;
                 case 0x4eff112:
                   if (tcategory.equals("Voice")) {
                      i = 3;
                   }
                   break;
                 case 0x2e0b8a78:
                   if (tcategory.equals("Ambient")) {
                      i = 4;
                   }
                   break;
                 case 0x73dc3a3b:
                   if (tcategory.equals("Playback")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   integer = Integer.valueOf(1);
                   break;
                 case 1:
                   integer = Integer.valueOf(2);
                   break;
                 case 2:
                   integer = Integer.valueOf(4);
                   break;
                 case 3:
                   integer = Integer.valueOf(0);
                   break;
                 case 4:
                   integer = Integer.valueOf(5);
                   break;
                 case 5:
                   integer = Integer.valueOf(3);
                   break;
                 default:
                   objArray = new Object[]{this.category};
                   String.format("Unrecognised category %s", objArray);
             }
             if (integer != null) {
                mediaPlayer.setAudioStreamType(integer.intValue());
             }
          }
          mediaPlayer.setOnPreparedListener(new RNSoundModule$a(this, p3));
          RNSoundModule$b uob = new RNSoundModule$b(this, p3);
          try{
             mediaPlayer.setOnErrorListener(uob);
             if (p2.hasKey("loadSync") && p2.getBoolean("loadSync")) {
                mediaPlayer.prepare();
             }else {
                mediaPlayer.prepareAsync();
             }
             return;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public void release(Double p0){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.reset();
          mediaPlayer.release();
          this.playerPool.remove(p0);
          if (!this.mixWithOthers.booleanValue() && p0 == this.focusedPlayerKey) {
             this.context.getSystemService("audio").abandonAudioFocus(this);
          }
       }
       return;
    }
    public void removeListeners(Integer p0){
    }
    public void reset(Double p0){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.reset();
       }
       return;
    }
    public void setCategory(String p0,Boolean p1){
       this.category = p0;
       this.mixWithOthers = p1;
    }
    public void setCurrentTime(Double p0,Float p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.seekTo(Math.round((p1.floatValue() * 1000.00f)));
       }
       return;
    }
    public void setLooping(Double p0,Boolean p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.setLooping(p1.booleanValue());
       }
       return;
    }
    public void setOnPlay(boolean p0,Double p1){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putBoolean("isPlaying", p0);
       writableMap.putDouble("playerKey", p1.doubleValue());
       this.context.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("onPlayChange", writableMap);
    }
    public void setPitch(Double p0,Float p1){
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setPitch(p1.floatValue()));
       }
       return;
    }
    public void setSpeakerphoneOn(Double p0,Boolean p1){
       if (this.playerPool.get(p0) != null) {
          AudioManager systemServic = this.context.getSystemService("audio");
          if (p1.booleanValue()) {
             systemServic.setMode(3);
          }else {
             systemServic.setMode(0);
          }
          systemServic.setSpeakerphoneOn(p1.booleanValue());
       }
       return;
    }
    public void setSpeed(Double p0,Float p1){
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(p1.floatValue()));
       }
       return;
    }
    public void setSystemVolume(Float p0){
       AudioManager systemServic = this.context.getSystemService("audio");
       systemServic.setStreamVolume(3, Math.round(((float)systemServic.getStreamMaxVolume(3) * p0.floatValue())), 0);
    }
    public void setVolume(Double p0,Float p1,Float p2){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null) {
          mediaPlayer.setVolume(p1.floatValue(), p2.floatValue());
       }
       return;
    }
    public void stop(Double p0,Callback p1){
       MediaPlayer mediaPlayer = this.playerPool.get(p0);
       if (mediaPlayer != null && mediaPlayer.isPlaying()) {
          mediaPlayer.pause();
          mediaPlayer.seekTo(0);
       }
       if (!this.mixWithOthers.booleanValue() && p0 == this.focusedPlayerKey) {
          this.context.getSystemService("audio").abandonAudioFocus(this);
       }
       Object[] objArray = new Object[0];
       p1.invoke(objArray);
       return;
    }
}
