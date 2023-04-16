package com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class StidContainerProto$StidContainer extends MessageNano	// class@000dea
{
    public String stAdId;
    public String stDplinkId;
    public String stKsOrderId;
    public String stPushId;
    public String stRecoId;
    public String stRecoStgyId;
    public String stSsid;
    public static StidContainerProto$StidContainer[] _emptyArray;

    public void StidContainerProto$StidContainer(){
       super();
       this.clear();
    }
    public static StidContainerProto$StidContainer[] emptyArray(){
       if (StidContainerProto$StidContainer._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (StidContainerProto$StidContainer._emptyArray == null) {
             StidContainerProto$StidContainer[] stidContaine = new StidContainerProto$StidContainer[0];
             StidContainerProto$StidContainer._emptyArray = stidContaine;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return StidContainerProto$StidContainer._emptyArray;
    }
    public static StidContainerProto$StidContainer parseFrom(CodedInputByteBufferNano p0){
       return new StidContainerProto$StidContainer().mergeFrom(p0);
    }
    public static StidContainerProto$StidContainer parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new StidContainerProto$StidContainer(), p0);
    }
    public StidContainerProto$StidContainer clear(){
       this.stRecoId = "";
       this.stAdId = "";
       this.stKsOrderId = "";
       this.stSsid = "";
       this.stPushId = "";
       this.stDplinkId = "";
       this.stRecoStgyId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.stRecoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.stRecoId);
       }
       if (!(this.stAdId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.stAdId);
       }
       if (!(this.stKsOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.stKsOrderId);
       }
       if (!(this.stSsid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.stSsid);
       }
       if (!(this.stPushId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.stPushId);
       }
       if (!(this.stDplinkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.stDplinkId);
       }
       if (!(this.stRecoStgyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.stRecoStgyId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public StidContainerProto$StidContainer mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.stRecoStgyId = p0.readString();
                            }
                         }else {
                            this.stDplinkId = p0.readString();
                         }
                      }else {
                         this.stPushId = p0.readString();
                      }
                   }else {
                      this.stSsid = p0.readString();
                   }
                }else {
                   this.stKsOrderId = p0.readString();
                }
             }else {
                this.stAdId = p0.readString();
             }
          }else {
             this.stRecoId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.stRecoId).equals(str)) {
          p0.writeString(1, this.stRecoId);
       }
       if (!(this.stAdId).equals(str)) {
          p0.writeString(2, this.stAdId);
       }
       if (!(this.stKsOrderId).equals(str)) {
          p0.writeString(3, this.stKsOrderId);
       }
       if (!(this.stSsid).equals(str)) {
          p0.writeString(4, this.stSsid);
       }
       if (!(this.stPushId).equals(str)) {
          p0.writeString(5, this.stPushId);
       }
       if (!(this.stDplinkId).equals(str)) {
          p0.writeString(6, this.stDplinkId);
       }
       if (!(this.stRecoStgyId).equals(str)) {
          p0.writeString(7, this.stRecoStgyId);
       }
       super.writeTo(p0);
       return;
    }
}
