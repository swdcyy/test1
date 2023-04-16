package com.kuaishou.livestream.message.nano.SCSandeagoAuthority;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCSandeagoAuthority extends MessageNano	// class@00145e
{
    public boolean authority;
    public String itemId;
    public String liveStreamId;
    public static SCSandeagoAuthority[] _emptyArray;

    public void SCSandeagoAuthority(){
       super();
       this.clear();
    }
    public static SCSandeagoAuthority[] emptyArray(){
       if (SCSandeagoAuthority._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCSandeagoAuthority._emptyArray == null) {
             SCSandeagoAuthority[] sCSandeagoAu = new SCSandeagoAuthority[0];
             SCSandeagoAuthority._emptyArray = sCSandeagoAu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCSandeagoAuthority._emptyArray;
    }
    public static SCSandeagoAuthority parseFrom(CodedInputByteBufferNano p0){
       return new SCSandeagoAuthority().mergeFrom(p0);
    }
    public static SCSandeagoAuthority parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCSandeagoAuthority(), p0);
    }
    public SCSandeagoAuthority clear(){
       this.liveStreamId = "";
       this.itemId = "";
       this.authority = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.itemId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.itemId);
       }
       SCSandeagoAuthority tauthority = this.authority;
       if (tauthority != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tauthority);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCSandeagoAuthority mergeFrom(CodedInputByteBufferNano p0){
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
                   this.authority = p0.readBool();
                }
             }else {
                this.itemId = p0.readString();
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
       if (!(this.itemId).equals(str)) {
          p0.writeString(2, this.itemId);
       }
       SCSandeagoAuthority tauthority = this.authority;
       if (tauthority != null) {
          p0.writeBool(3, tauthority);
       }
       super.writeTo(p0);
       return;
    }
}
