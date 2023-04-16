package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveCommonNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveCommonNotice extends MessageNano	// class@001344
{
    public String content;
    public long displayDuration;
    public int displayType;
    public boolean showScreenCenter;
    public static LiveStreamMessages$SCLiveCommonNotice[] _emptyArray;

    public void LiveStreamMessages$SCLiveCommonNotice(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveCommonNotice[] emptyArray(){
       if (LiveStreamMessages$SCLiveCommonNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveCommonNotice._emptyArray == null) {
             LiveStreamMessages$SCLiveCommonNotice[] sCLiveCommon = new LiveStreamMessages$SCLiveCommonNotice[0];
             LiveStreamMessages$SCLiveCommonNotice._emptyArray = sCLiveCommon;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveCommonNotice._emptyArray;
    }
    public static LiveStreamMessages$SCLiveCommonNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveCommonNotice().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveCommonNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveCommonNotice(), p0);
    }
    public LiveStreamMessages$SCLiveCommonNotice clear(){
       this.displayType = 0;
       this.content = "";
       this.displayDuration = 0;
       this.showScreenCenter = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveCommonNotice tdisplayType = this.displayType;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tdisplayType);
       }
       if (!(this.content).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       tdisplayType = this.displayDuration;
       if (tdisplayType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tdisplayType);
       }
       tdisplayType = this.showScreenCenter;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tdisplayType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveCommonNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.showScreenCenter = p0.readBool();
                   }
                }else {
                   this.displayDuration = p0.readUInt64();
                }
             }else {
                this.content = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.displayType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveCommonNotice tdisplayType = this.displayType;
       if (tdisplayType != null) {
          p0.writeInt32(1, tdisplayType);
       }
       if (!(this.content).equals("")) {
          p0.writeString(2, this.content);
       }
       tdisplayType = this.displayDuration;
       if (tdisplayType) {
          p0.writeUInt64(3, tdisplayType);
       }
       tdisplayType = this.showScreenCenter;
       if (tdisplayType != null) {
          p0.writeBool(4, tdisplayType);
       }
       super.writeTo(p0);
       return;
    }
}
