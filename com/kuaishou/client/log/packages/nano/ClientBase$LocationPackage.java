package com.kuaishou.client.log.packages.nano.ClientBase$LocationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$LocationPackage extends MessageNano	// class@00077d
{
    public String city;
    public String country;
    public String county;
    public double latitude;
    public double longitude;
    public String province;
    public String street;
    public String unnormalized;
    public int vague;
    public static ClientBase$LocationPackage[] _emptyArray;

    public void ClientBase$LocationPackage(){
       super();
       this.clear();
    }
    public static ClientBase$LocationPackage[] emptyArray(){
       if (ClientBase$LocationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$LocationPackage._emptyArray == null) {
             ClientBase$LocationPackage[] locationPack = new ClientBase$LocationPackage[0];
             ClientBase$LocationPackage._emptyArray = locationPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$LocationPackage._emptyArray;
    }
    public static ClientBase$LocationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$LocationPackage().mergeFrom(p0);
    }
    public static ClientBase$LocationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$LocationPackage(), p0);
    }
    public ClientBase$LocationPackage clear(){
       this.unnormalized = "";
       this.country = "";
       this.province = "";
       this.city = "";
       this.county = "";
       this.street = "";
       this.latitude = 0;
       this.longitude = 0;
       this.vague = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.unnormalized).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.unnormalized);
       }
       if (!(this.country).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.country);
       }
       if (!(this.province).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.province);
       }
       if (!(this.city).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.city);
       }
       if (!(this.county).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.county);
       }
       if (!(this.street).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.street);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.latitude) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(7, this.latitude);
       }
       if (Double.doubleToLongBits(this.longitude) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(8, this.longitude);
       }
       ClientBase$LocationPackage tvague = this.vague;
       if (tvague != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tvague);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$LocationPackage mergeFrom(CodedInputByteBufferNano p0){
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
                            if (i != 57) {
                               if (i != 65) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.vague = p0.readInt32();
                                  }
                               }else {
                                  this.longitude = p0.readDouble();
                               }
                            }else {
                               this.latitude = p0.readDouble();
                            }
                         }else {
                            this.street = p0.readString();
                         }
                      }else {
                         this.county = p0.readString();
                      }
                   }else {
                      this.city = p0.readString();
                   }
                }else {
                   this.province = p0.readString();
                }
             }else {
                this.country = p0.readString();
             }
          }else {
             this.unnormalized = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.unnormalized).equals(str)) {
          p0.writeString(1, this.unnormalized);
       }
       if (!(this.country).equals(str)) {
          p0.writeString(2, this.country);
       }
       if (!(this.province).equals(str)) {
          p0.writeString(3, this.province);
       }
       if (!(this.city).equals(str)) {
          p0.writeString(4, this.city);
       }
       if (!(this.county).equals(str)) {
          p0.writeString(5, this.county);
       }
       if (!(this.street).equals(str)) {
          p0.writeString(6, this.street);
       }
       double d = 0;
       if (Double.doubleToLongBits(this.latitude) - Double.doubleToLongBits(d)) {
          p0.writeDouble(7, this.latitude);
       }
       if (Double.doubleToLongBits(this.longitude) - Double.doubleToLongBits(d)) {
          p0.writeDouble(8, this.longitude);
       }
       ClientBase$LocationPackage tvague = this.vague;
       if (tvague != null) {
          p0.writeInt32(9, tvague);
       }
       super.writeTo(p0);
       return;
    }
}
