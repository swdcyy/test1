package com.frog.engine.audio.MediaCodecDecode;
import java.lang.Object;
import java.util.ArrayList;
import android.media.MediaExtractor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.media.MediaCodec;
import com.kwai.robust.PatchProxyResult;
import android.media.MediaFormat;
import com.frog.engine.internal.FrogLog;
import android.os.Build$VERSION;
import android.view.Surface;
import android.media.MediaCrypto;
import java.lang.Byte;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import android.media.MediaCodec$BufferInfo;
import java.lang.StringBuilder;
import java.lang.Number;

public class MediaCodecDecode	// class@0014f7
{
    public ArrayList arrayList;
    public int channel;
    public long durationUs;
    public boolean mDecodeEnd;
    public MediaExtractor mExtractor;
    public MediaFormat mFormat;
    public ByteBuffer[] mInputBuffers;
    public ByteBuffer[] mOutputBuffers;
    public MediaCodec mediaCodec;
    public int pcmEncoding;
    public int sampleRate;

    public void MediaCodecDecode(){
       super();
       this.arrayList = new ArrayList();
       this.mExtractor = new MediaExtractor();
       this.mFormat = null;
       this.mediaCodec = null;
    }
    public final void close(){
       if (PatchProxy.applyVoid(null, this, MediaCodecDecode.class, "1")) {
          return;
       }
       MediaCodecDecode tmExtractor = this.mExtractor;
       if (tmExtractor != null) {
          tmExtractor.release();
          this.mExtractor = null;
       }
       tmExtractor = this.mediaCodec;
       if (tmExtractor != null) {
          tmExtractor.stop();
          this.mediaCodec.release();
          this.mediaCodec = null;
       }
       return;
    }
    public byte[] decodeCodec(String p0){
       String str = "pcm-encoding";
       String str1 = "Audio_Decode_J_M";
       MediaCodecDecode obj = PatchProxy.applyOneRefs(p0, this, MediaCodecDecode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       byte[] uobyteArray = null;
       try{
          this.mExtractor.setDataSource(p0);
          int i = 0;
          int i1 = 0;
          while (true) {
             String str2 = "mime";
             if (i1 < this.mExtractor.getTrackCount()) {
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i1);
                if ((trackFormat.getString(str2)).startsWith("audio/")) {
                   this.mFormat = trackFormat;
                   obj = 1;
                label_0041 :
                   if (!obj) {
                      break ;
                   }else {
                      obj = this.mExtractor;
                      try{
                         obj.selectTrack(i1);
                         this.mediaCodec = MediaCodec.createDecoderByType(this.mFormat.getString(str2));
                         this.sampleRate = this.mFormat.getInteger("sample-rate");
                         this.channel = this.mFormat.getInteger("channel-count");
                         this.durationUs = this.mFormat.getLong("durationUs");
                         if (Build$VERSION.SDK_INT >= 24) {
                            try{
                               int integer = (this.mFormat.containsKey(str))? this.mFormat.getInteger(str): 2;
                               this.pcmEncoding = integer;
                            }catch(java.lang.Exception e0){
                               FrogLog.e(str1, "mFormat ex Encoding ENCODING_PCM_16BIT");
                               this.pcmEncoding = 2;
                            }
                         }else {
                            this.pcmEncoding = 2;
                         }
                      }catch(java.io.IOException e0){
                         FrogLog.e(str1, "input contain no audio");
                      }
                      this.mediaCodec.configure(this.mFormat, uobyteArray, uobyteArray, i);
                      this.mediaCodec.start();
                      while (this.mDecodeEnd == null) {
                         this.decodePcmData();
                      }
                      this.close();
                      byte[] uobyteArray1 = new byte[this.arrayList.size()];
                      for (; i < this.arrayList.size(); i++) {
                         uobyteArray1[i] = this.arrayList.get(i).byteValue();
                      }
                      this.arrayList.clear();
                      return uobyteArray1;
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                obj = null;
                i1 = -1;
                goto label_0041 ;
             }
          }
          FrogLog.d(str1, "input contain no audio");
          return uobyteArray;
       }catch(java.lang.Exception e0){
          FrogLog.d(str1, "input contain no audio path is not exist ");
          this.close();
          return uobyteArray;
       }
    }
    public final void decodePcmData(){
       if (PatchProxy.applyVoid(null, this, MediaCodecDecode.class, "2")) {
          return;
       }
       long l = 0x2710;
       int i = this.mediaCodec.dequeueInputBuffer(l);
       int i1 = 0;
       if (i >= 0) {
          ByteBuffer inputBuffer = this.mediaCodec.getInputBuffer(i);
          inputBuffer.clear();
          int i2 = this.mExtractor.readSampleData(inputBuffer, i1);
          if (i2 < 0) {
             this.mediaCodec.queueInputBuffer(i, 0, 0, 0, 4);
          }else {
             this.mediaCodec.queueInputBuffer(i, 0, i2, this.mExtractor.getSampleTime(), 0);
             this.mExtractor.advance();
          }
       }
       MediaCodec$BufferInfo uBufferInfo = new MediaCodec$BufferInfo();
       int i3 = this.mediaCodec.dequeueOutputBuffer(uBufferInfo, l);
       if (i3 == -1) {
          FrogLog.d("Audio_Decode_J_M", "INFO_TRY_AGAIN_LATER");
       }else if(i3 == -2){
          FrogLog.d("Audio_Decode_J_M", "output format changed");
       }else if(i3 < 0){
          FrogLog.d("Audio_Decode_J_M", "outputIndex="+i3);
       }else {
          ByteBuffer outputBuffer = this.mediaCodec.getOutputBuffer(i3);
          MediaCodec$BufferInfo size = uBufferInfo.size;
          byte[] uobyteArray = new byte[size];
          outputBuffer.get(uobyteArray);
          outputBuffer.clear();
          for (int i4 = 0; i4 < size; i4 = i4 + 1) {
             this.arrayList.add(Byte.valueOf(uobyteArray[i4]));
          }
          this.mediaCodec.releaseOutputBuffer(i3, i1);
          if (uBufferInfo.flags & 0x04) {
             FrogLog.d("Audio_Decode_J_M", "decode: end");
             this.mDecodeEnd = true;
          }
       }
       return;
    }
    public int getChannel(){
       return this.channel;
    }
    public long getDurationUs(){
       return this.durationUs;
    }
    public int getPcmEncodingSize(){
       MediaCodecDecode tpcmEncoding = this.pcmEncoding;
       if (tpcmEncoding == 3) {
          return this.channel;
       }
       if (tpcmEncoding != 4) {
          return (this.channel * 2);
       }
       return (this.channel * 4);
    }
    public int getSampleRate(){
       return this.sampleRate;
    }
    public int getTotalFrames(){
       Object obj = PatchProxy.apply(null, this, MediaCodecDecode.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.getPcmEncodingSize() * this.getChannel());
    }
}
