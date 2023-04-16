package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityNewPendantKdsInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$LiveActivityNewPendantKdsInfo extends MessageNano	// class@0012e1
{
    public String bundleId;
    public String data;
    public int minBundleVer;
    public static LiveStreamMessages$LiveActivityNewPendantKdsInfo[] _emptyArray;

    public void LiveStreamMessages$LiveActivityNewPendantKdsInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityNewPendantKdsInfo[] emptyArray(){
       if (LiveStreamMessages$LiveActivityNewPendantKdsInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityNewPendantKdsInfo._emptyArray == null) {
             LiveStreamMessages$LiveActivityNewPendantKdsInfo[] liveActivity = new LiveStreamMessages$LiveActivityNewPendantKdsInfo[0];
             LiveStreamMessages$LiveActivityNewPendantKdsInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityNewPendantKdsInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityNewPendantKdsInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityNewPendantKdsInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityNewPendantKdsInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityNewPendantKdsInfo(), p0);
    }
    public LiveStreamMessages$LiveActivityNewPendantKdsInfo clear(){
       this.bundleId = "";
       this.data = "";
       this.minBundleVer = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bundleId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.data);
       }
       LiveStreamMessages$LiveActivityNewPendantKdsInfo tminBundleVe = this.minBundleVer;
       if (tminBundleVe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tminBundleVe);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityNewPendantKdsInfo mergeFrom(CodedInputByteBufferNano p0){
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
                   this.minBundleVer = p0.readUInt32();
                }
             }else {
                this.data = p0.readString();
             }
          }else {
             this.bundleId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.bundleId).equals(str)) {
          p0.writeString(1, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(2, this.data);
       }
       LiveStreamMessages$LiveActivityNewPendantKdsInfo tminBundleVe = this.minBundleVer;
       if (tminBundleVe != null) {
          p0.writeUInt32(3, tminBundleVe);
       }
       super.writeTo(p0);
       return;
    }
}
