package com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LinkMsg;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAdSocialMessages$LinkMsg extends MessageNano	// class@0010e4
{
    public String desc;
    public int showType;
    public static LiveAdSocialMessages$LinkMsg[] _emptyArray;

    public void LiveAdSocialMessages$LinkMsg(){
       super();
       this.clear();
    }
    public static LiveAdSocialMessages$LinkMsg[] emptyArray(){
       if (LiveAdSocialMessages$LinkMsg._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdSocialMessages$LinkMsg._emptyArray == null) {
             LiveAdSocialMessages$LinkMsg[] linkMsgArray = new LiveAdSocialMessages$LinkMsg[0];
             LiveAdSocialMessages$LinkMsg._emptyArray = linkMsgArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdSocialMessages$LinkMsg._emptyArray;
    }
    public static LiveAdSocialMessages$LinkMsg parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdSocialMessages$LinkMsg().mergeFrom(p0);
    }
    public static LiveAdSocialMessages$LinkMsg parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdSocialMessages$LinkMsg(), p0);
    }
    public LiveAdSocialMessages$LinkMsg clear(){
       this.desc = "";
       this.showType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.desc).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.desc);
       }
       LiveAdSocialMessages$LinkMsg tshowType = this.showType;
       if (tshowType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tshowType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdSocialMessages$LinkMsg mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.showType = i;
                }
             }
          }else {
             this.desc = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.desc).equals("")) {
          p0.writeString(1, this.desc);
       }
       LiveAdSocialMessages$LinkMsg tshowType = this.showType;
       if (tshowType != null) {
          p0.writeInt32(2, tshowType);
       }
       super.writeTo(p0);
       return;
    }
}
