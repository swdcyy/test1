package com.kuaishou.livestream.message.nano.LiveWishroomMessagesProto$LiveWishLocation;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveWishroomMessagesProto$LiveWishLocation extends MessageNano	// class@0013d9
{
    public String city;
    public double latitude;
    public double longitude;
    public String province;
    public String subLocality;
    public static LiveWishroomMessagesProto$LiveWishLocation[] _emptyArray;

    public void LiveWishroomMessagesProto$LiveWishLocation(){
       super();
       this.clear();
    }
    public static LiveWishroomMessagesProto$LiveWishLocation[] emptyArray(){
       if (LiveWishroomMessagesProto$LiveWishLocation._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveWishroomMessagesProto$LiveWishLocation._emptyArray == null) {
             LiveWishroomMessagesProto$LiveWishLocation[] liveWishLoca = new LiveWishroomMessagesProto$LiveWishLocation[0];
             LiveWishroomMessagesProto$LiveWishLocation._emptyArray = liveWishLoca;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveWishroomMessagesProto$LiveWishLocation._emptyArray;
    }
    public static LiveWishroomMessagesProto$LiveWishLocation parseFrom(CodedInputByteBufferNano p0){
       return new LiveWishroomMessagesProto$LiveWishLocation().mergeFrom(p0);
    }
    public static LiveWishroomMessagesProto$LiveWishLocation parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveWishroomMessagesProto$LiveWishLocation(), p0);
    }
    public LiveWishroomMessagesProto$LiveWishLocation clear(){
       this.latitude = 0;
       this.longitude = 0;
       this.province = "";
       this.city = "";
       this.subLocality = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       double d = 0;
       if (Double.doubleToLongBits(this.latitude) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(1, this.latitude);
       }
       if (Double.doubleToLongBits(this.longitude) - Double.doubleToLongBits(d)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(2, this.longitude);
       }
       String str = "";
       if (!(this.province).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.province);
       }
       if (!(this.city).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.city);
       }
       if (!(this.subLocality).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.subLocality);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveWishroomMessagesProto$LiveWishLocation mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 9) {
             if (i != 17) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.subLocality = p0.readString();
                      }
                   }else {
                      this.city = p0.readString();
                   }
                }else {
                   this.province = p0.readString();
                }
             }else {
                this.longitude = p0.readDouble();
             }
          }else {
             this.latitude = p0.readDouble();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       double d = 0;
       if (Double.doubleToLongBits(this.latitude) - Double.doubleToLongBits(d)) {
          p0.writeDouble(1, this.latitude);
       }
       if (Double.doubleToLongBits(this.longitude) - Double.doubleToLongBits(d)) {
          p0.writeDouble(2, this.longitude);
       }
       String str = "";
       if (!(this.province).equals(str)) {
          p0.writeString(3, this.province);
       }
       if (!(this.city).equals(str)) {
          p0.writeString(4, this.city);
       }
       if (!(this.subLocality).equals(str)) {
          p0.writeString(5, this.subLocality);
       }
       super.writeTo(p0);
       return;
    }
}
