package com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatInfoUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLineChatMessages$SCLiveLineChatInfoUpdate extends MessageNano	// class@0011df
{
    public String lineChatId;
    public String liveStreamId;
    public boolean mute;
    public static LiveLineChatMessages$SCLiveLineChatInfoUpdate[] _emptyArray;

    public void LiveLineChatMessages$SCLiveLineChatInfoUpdate(){
       super();
       this.clear();
    }
    public static LiveLineChatMessages$SCLiveLineChatInfoUpdate[] emptyArray(){
       if (LiveLineChatMessages$SCLiveLineChatInfoUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLineChatMessages$SCLiveLineChatInfoUpdate._emptyArray == null) {
             LiveLineChatMessages$SCLiveLineChatInfoUpdate[] sCLiveLineCh = new LiveLineChatMessages$SCLiveLineChatInfoUpdate[0];
             LiveLineChatMessages$SCLiveLineChatInfoUpdate._emptyArray = sCLiveLineCh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLineChatMessages$SCLiveLineChatInfoUpdate._emptyArray;
    }
    public static LiveLineChatMessages$SCLiveLineChatInfoUpdate parseFrom(CodedInputByteBufferNano p0){
       return new LiveLineChatMessages$SCLiveLineChatInfoUpdate().mergeFrom(p0);
    }
    public static LiveLineChatMessages$SCLiveLineChatInfoUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLineChatMessages$SCLiveLineChatInfoUpdate(), p0);
    }
    public LiveLineChatMessages$SCLiveLineChatInfoUpdate clear(){
       this.liveStreamId = "";
       this.lineChatId = "";
       this.mute = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.lineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.lineChatId);
       }
       LiveLineChatMessages$SCLiveLineChatInfoUpdate tmute = this.mute;
       if (tmute != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tmute);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLineChatMessages$SCLiveLineChatInfoUpdate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.mute = p0.readBool();
                }
             }else {
                this.lineChatId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.lineChatId).equals(str)) {
          p0.writeString(2, this.lineChatId);
       }
       LiveLineChatMessages$SCLiveLineChatInfoUpdate tmute = this.mute;
       if (tmute != null) {
          p0.writeBool(3, tmute);
       }
       super.writeTo(p0);
       return;
    }
}
