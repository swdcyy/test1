package com.kuaishou.protobuf.livestream.nano.Network;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class Network extends MessageNano	// class@000d2c
{
    public String bssid;
    public String isp;
    public int type;
    public static Network[] _emptyArray;

    public void Network(){
       super();
       this.clear();
    }
    public static Network[] emptyArray(){
       if (Network._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (Network._emptyArray == null) {
             Network[] networkArray = new Network[0];
             Network._emptyArray = networkArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return Network._emptyArray;
    }
    public static Network parseFrom(CodedInputByteBufferNano p0){
       return new Network().mergeFrom(p0);
    }
    public static Network parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new Network(), p0);
    }
    public Network clear(){
       this.type = 0;
       this.isp = "";
       this.bssid = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       Network ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.isp).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.isp);
       }
       if (!(this.bssid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bssid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public Network mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.bssid = p0.readString();
                }
             }else {
                this.isp = p0.readString();
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 9:
                 case 1:
                   break;
                 default:
             }
             this.type = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       Network ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.isp).equals(str)) {
          p0.writeString(2, this.isp);
       }
       if (!(this.bssid).equals(str)) {
          p0.writeString(3, this.bssid);
       }
       super.writeTo(p0);
       return;
    }
}
