package com.kuaishou.livestream.message.nano.LiveHotspotSimpleInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveHotspotSimpleInfo extends MessageNano	// class@0011c3
{
    public String hotspotId;
    public String rankTitle;
    public static LiveHotspotSimpleInfo[] _emptyArray;

    public void LiveHotspotSimpleInfo(){
       super();
       this.clear();
    }
    public static LiveHotspotSimpleInfo[] emptyArray(){
       if (LiveHotspotSimpleInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveHotspotSimpleInfo._emptyArray == null) {
             LiveHotspotSimpleInfo[] liveHotspotS = new LiveHotspotSimpleInfo[0];
             LiveHotspotSimpleInfo._emptyArray = liveHotspotS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveHotspotSimpleInfo._emptyArray;
    }
    public static LiveHotspotSimpleInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveHotspotSimpleInfo().mergeFrom(p0);
    }
    public static LiveHotspotSimpleInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveHotspotSimpleInfo(), p0);
    }
    public LiveHotspotSimpleInfo clear(){
       this.hotspotId = "";
       this.rankTitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.hotspotId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.hotspotId);
       }
       if (!(this.rankTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.rankTitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveHotspotSimpleInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.rankTitle = p0.readString();
             }
          }else {
             this.hotspotId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.hotspotId).equals(str)) {
          p0.writeString(1, this.hotspotId);
       }
       if (!(this.rankTitle).equals(str)) {
          p0.writeString(2, this.rankTitle);
       }
       super.writeTo(p0);
       return;
    }
}
