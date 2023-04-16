package com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeTextInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRampageTimeMessage$LiveRampageTimeTextInfo extends MessageNano	// class@001266
{
    public String closeMsg1;
    public String closeMsg2;
    public String openMsg1;
    public String openMsg2;
    public static LiveRampageTimeMessage$LiveRampageTimeTextInfo[] _emptyArray;

    public void LiveRampageTimeMessage$LiveRampageTimeTextInfo(){
       super();
       this.clear();
    }
    public static LiveRampageTimeMessage$LiveRampageTimeTextInfo[] emptyArray(){
       if (LiveRampageTimeMessage$LiveRampageTimeTextInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRampageTimeMessage$LiveRampageTimeTextInfo._emptyArray == null) {
             LiveRampageTimeMessage$LiveRampageTimeTextInfo[] liveRampageT = new LiveRampageTimeMessage$LiveRampageTimeTextInfo[0];
             LiveRampageTimeMessage$LiveRampageTimeTextInfo._emptyArray = liveRampageT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRampageTimeMessage$LiveRampageTimeTextInfo._emptyArray;
    }
    public static LiveRampageTimeMessage$LiveRampageTimeTextInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRampageTimeMessage$LiveRampageTimeTextInfo().mergeFrom(p0);
    }
    public static LiveRampageTimeMessage$LiveRampageTimeTextInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRampageTimeMessage$LiveRampageTimeTextInfo(), p0);
    }
    public LiveRampageTimeMessage$LiveRampageTimeTextInfo clear(){
       this.openMsg1 = "";
       this.openMsg2 = "";
       this.closeMsg1 = "";
       this.closeMsg2 = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.openMsg1).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.openMsg1);
       }
       if (!(this.openMsg2).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.openMsg2);
       }
       if (!(this.closeMsg1).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.closeMsg1);
       }
       if (!(this.closeMsg2).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.closeMsg2);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRampageTimeMessage$LiveRampageTimeTextInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.closeMsg2 = p0.readString();
                   }
                }else {
                   this.closeMsg1 = p0.readString();
                }
             }else {
                this.openMsg2 = p0.readString();
             }
          }else {
             this.openMsg1 = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.openMsg1).equals(str)) {
          p0.writeString(1, this.openMsg1);
       }
       if (!(this.openMsg2).equals(str)) {
          p0.writeString(2, this.openMsg2);
       }
       if (!(this.closeMsg1).equals(str)) {
          p0.writeString(3, this.closeMsg1);
       }
       if (!(this.closeMsg2).equals(str)) {
          p0.writeString(4, this.closeMsg2);
       }
       super.writeTo(p0);
       return;
    }
}
