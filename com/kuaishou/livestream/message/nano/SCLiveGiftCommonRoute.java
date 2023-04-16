package com.kuaishou.livestream.message.nano.SCLiveGiftCommonRoute;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveGiftCommonRoute extends MessageNano	// class@001420
{
    public long executeDeadlineTime;
    public String liveStreamId;
    public boolean needBreakCombo;
    public String routeUrl;
    public static SCLiveGiftCommonRoute[] _emptyArray;

    public void SCLiveGiftCommonRoute(){
       super();
       this.clear();
    }
    public static SCLiveGiftCommonRoute[] emptyArray(){
       if (SCLiveGiftCommonRoute._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveGiftCommonRoute._emptyArray == null) {
             SCLiveGiftCommonRoute[] sCLiveGiftCo = new SCLiveGiftCommonRoute[0];
             SCLiveGiftCommonRoute._emptyArray = sCLiveGiftCo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveGiftCommonRoute._emptyArray;
    }
    public static SCLiveGiftCommonRoute parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveGiftCommonRoute().mergeFrom(p0);
    }
    public static SCLiveGiftCommonRoute parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveGiftCommonRoute(), p0);
    }
    public SCLiveGiftCommonRoute clear(){
       this.routeUrl = "";
       this.executeDeadlineTime = 0;
       this.liveStreamId = "";
       this.needBreakCombo = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.routeUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.routeUrl);
       }
       SCLiveGiftCommonRoute texecuteDead = this.executeDeadlineTime;
       if (texecuteDead) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, texecuteDead);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       SCLiveGiftCommonRoute tneedBreakCo = this.needBreakCombo;
       if (tneedBreakCo != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tneedBreakCo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveGiftCommonRoute mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.needBreakCombo = p0.readBool();
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.executeDeadlineTime = p0.readUInt64();
             }
          }else {
             this.routeUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.routeUrl).equals(str)) {
          p0.writeString(1, this.routeUrl);
       }
       SCLiveGiftCommonRoute texecuteDead = this.executeDeadlineTime;
       if (texecuteDead) {
          p0.writeUInt64(2, texecuteDead);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       SCLiveGiftCommonRoute tneedBreakCo = this.needBreakCombo;
       if (tneedBreakCo != null) {
          p0.writeBool(4, tneedBreakCo);
       }
       super.writeTo(p0);
       return;
    }
}
