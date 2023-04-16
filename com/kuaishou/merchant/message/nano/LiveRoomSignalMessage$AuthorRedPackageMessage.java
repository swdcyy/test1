package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuthorRedPackageMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$AuthorRedPackageMessage extends MessageNano	// class@001c42
{
    public int canGrabCount;
    public int price;
    public String redPackageId;
    public long requestAnimationMaxDelayMillis;
    public int status;
    public static LiveRoomSignalMessage$AuthorRedPackageMessage[] _emptyArray;

    public void LiveRoomSignalMessage$AuthorRedPackageMessage(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$AuthorRedPackageMessage[] emptyArray(){
       if (LiveRoomSignalMessage$AuthorRedPackageMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$AuthorRedPackageMessage._emptyArray == null) {
             LiveRoomSignalMessage$AuthorRedPackageMessage[] uAuthorRedPa = new LiveRoomSignalMessage$AuthorRedPackageMessage[0];
             LiveRoomSignalMessage$AuthorRedPackageMessage._emptyArray = uAuthorRedPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$AuthorRedPackageMessage._emptyArray;
    }
    public static LiveRoomSignalMessage$AuthorRedPackageMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$AuthorRedPackageMessage().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$AuthorRedPackageMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$AuthorRedPackageMessage(), p0);
    }
    public LiveRoomSignalMessage$AuthorRedPackageMessage clear(){
       this.redPackageId = "";
       this.status = 0;
       this.price = 0;
       this.canGrabCount = 0;
       this.requestAnimationMaxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.redPackageId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.redPackageId);
       }
       LiveRoomSignalMessage$AuthorRedPackageMessage tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       tstatus = this.price;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tstatus);
       }
       tstatus = this.canGrabCount;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tstatus);
       }
       tstatus = this.requestAnimationMaxDelayMillis;
       if (tstatus) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$AuthorRedPackageMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.requestAnimationMaxDelayMillis = p0.readUInt64();
                      }
                   }else {
                      this.canGrabCount = p0.readUInt32();
                   }
                }else {
                   this.price = p0.readUInt32();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.status = i;
                }
             }
          }else {
             this.redPackageId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.redPackageId).equals("")) {
          p0.writeString(1, this.redPackageId);
       }
       LiveRoomSignalMessage$AuthorRedPackageMessage tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       tstatus = this.price;
       if (tstatus != null) {
          p0.writeUInt32(3, tstatus);
       }
       tstatus = this.canGrabCount;
       if (tstatus != null) {
          p0.writeUInt32(4, tstatus);
       }
       tstatus = this.requestAnimationMaxDelayMillis;
       if (tstatus) {
          p0.writeUInt64(5, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
