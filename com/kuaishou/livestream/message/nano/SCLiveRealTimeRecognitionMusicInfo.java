package com.kuaishou.livestream.message.nano.SCLiveRealTimeRecognitionMusicInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.AuthorMusicInfo;

public final class SCLiveRealTimeRecognitionMusicInfo extends MessageNano	// class@00143b
{
    public String liveStreamId;
    public AuthorMusicInfo musicInfo;
    public long recognitionMusicOffset;
    public long recognitionServerTime;
    public int singStatus;
    public static SCLiveRealTimeRecognitionMusicInfo[] _emptyArray;

    public void SCLiveRealTimeRecognitionMusicInfo(){
       super();
       this.clear();
    }
    public static SCLiveRealTimeRecognitionMusicInfo[] emptyArray(){
       if (SCLiveRealTimeRecognitionMusicInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRealTimeRecognitionMusicInfo._emptyArray == null) {
             SCLiveRealTimeRecognitionMusicInfo[] sCLiveRealTi = new SCLiveRealTimeRecognitionMusicInfo[0];
             SCLiveRealTimeRecognitionMusicInfo._emptyArray = sCLiveRealTi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRealTimeRecognitionMusicInfo._emptyArray;
    }
    public static SCLiveRealTimeRecognitionMusicInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRealTimeRecognitionMusicInfo().mergeFrom(p0);
    }
    public static SCLiveRealTimeRecognitionMusicInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRealTimeRecognitionMusicInfo(), p0);
    }
    public SCLiveRealTimeRecognitionMusicInfo clear(){
       this.liveStreamId = "";
       this.musicInfo = null;
       this.recognitionServerTime = 0;
       this.recognitionMusicOffset = 0;
       this.singStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLiveRealTimeRecognitionMusicInfo tmusicInfo = this.musicInfo;
       if (tmusicInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tmusicInfo);
       }
       tmusicInfo = this.recognitionServerTime;
       int i1 = 0;
       if (tmusicInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmusicInfo);
       }
       tmusicInfo = this.recognitionMusicOffset;
       if (tmusicInfo - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmusicInfo);
       }
       tmusicInfo = this.singStatus;
       if (tmusicInfo != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tmusicInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveRealTimeRecognitionMusicInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.singStatus = i;
                         }
                      }
                   }else {
                      this.recognitionMusicOffset = p0.readUInt64();
                   }
                }else {
                   this.recognitionServerTime = p0.readUInt64();
                }
             }else if(this.musicInfo == null){
                this.musicInfo = new AuthorMusicInfo();
             }
             p0.readMessage(this.musicInfo);
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLiveRealTimeRecognitionMusicInfo tmusicInfo = this.musicInfo;
       if (tmusicInfo != null) {
          p0.writeMessage(2, tmusicInfo);
       }
       tmusicInfo = this.recognitionServerTime;
       int i = 0;
       if (tmusicInfo - i) {
          p0.writeUInt64(3, tmusicInfo);
       }
       tmusicInfo = this.recognitionMusicOffset;
       if (tmusicInfo - i) {
          p0.writeUInt64(4, tmusicInfo);
       }
       tmusicInfo = this.singStatus;
       if (tmusicInfo != null) {
          p0.writeInt32(5, tmusicInfo);
       }
       super.writeTo(p0);
       return;
    }
}
