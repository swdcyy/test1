package com.frog.engine.record.FrogInternalScreenRecord;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.frog.engine.record.IFrogInternalRecordListener;
import java.nio.ByteBuffer;
import java.lang.Exception;
import java.lang.StringBuilder;

public class FrogInternalScreenRecord	// class@001568
{
    public static IFrogInternalRecordListener sListener;

    public void FrogInternalScreenRecord(){
       super();
    }
    public static void AudioCallBack(byte[] p0,int p1,int p2,int p3,int p4,long p5){
       FrogInternalScreenRecord uFrogInterna = FrogInternalScreenRecord.class;
       if (PatchProxy.isSupport(uFrogInterna)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, null, uFrogInterna, "1")) {
             return;
          }
       }
       IFrogInternalRecordListener sListener = FrogInternalScreenRecord.sListener;
       if (sListener != null) {
          sListener.AudioCallBack(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public static native void Destory(String p0);
    public static native void PauseRecord(String p0);
    public static void RecordScreenError(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrogInternalScreenRecord.class, "3")) {
          return;
       }
       IFrogInternalRecordListener sListener = FrogInternalScreenRecord.sListener;
       if (sListener != null) {
          sListener.RecordScreenError(p0);
       }
       return;
    }
    public static native void ResumeRecord(String p0);
    public static native void StartRecord(int p0,int p1,int p2,int p3,int p4,String p5);
    public static native void StopRecord(String p0);
    public static void VideoCallBack(ByteBuffer p0,int p1,int p2,int p3,long p4){
       FrogInternalScreenRecord uFrogInterna = FrogInternalScreenRecord.class;
       if (PatchProxy.isSupport(uFrogInterna)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uFrogInterna, "2")) {
             return;
          }
       }
       try{
          IFrogInternalRecordListener sListener = FrogInternalScreenRecord.sListener;
          if (sListener != null) {
             sListener.VideoCallBack(p0, p1, p2, p3, p4);
          }
       }catch(java.lang.Exception e8){
          e8.getMessage();
          FrogInternalScreenRecord.RecordScreenError("VideoCallBack"+e8.getMessage());
       }
       return;
    }
    public static void recordAddAudioTrack(int p0){
       FrogInternalScreenRecord uFrogInterna = FrogInternalScreenRecord.class;
       if (PatchProxy.isSupport(uFrogInterna) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uFrogInterna, "4")) {
          return;
       }
       IFrogInternalRecordListener sListener = FrogInternalScreenRecord.sListener;
       if (sListener != null) {
          sListener.recordAddAudioTrack(p0);
       }
       return;
    }
    public static void setListener(IFrogInternalRecordListener p0){
       FrogInternalScreenRecord.sListener = p0;
    }
    public void recordRemoveAudioTrack(int p0){
       FrogInternalScreenRecord uFrogInterna = FrogInternalScreenRecord.class;
       if (PatchProxy.isSupport(uFrogInterna) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFrogInterna, "5")) {
          return;
       }
       IFrogInternalRecordListener sListener = FrogInternalScreenRecord.sListener;
       if (sListener != null) {
          sListener.recordRemoveAudioTrack(p0);
       }
       return;
    }
}
