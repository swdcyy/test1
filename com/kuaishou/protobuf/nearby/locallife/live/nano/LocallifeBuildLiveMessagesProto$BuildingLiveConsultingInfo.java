package com.kuaishou.protobuf.nearby.locallife.live.nano.LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo extends MessageNano	// class@000dfc
{
    public String authorRole;
    public String avatar;
    public String bizType;
    public String bottomText;
    public String buttonText;
    public String reservationUrl;
    public String reservedButton;
    public String reservedText;
    public long serviceCount;
    public int show;
    public int status;
    public String text;
    public long threshold;
    public static LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo[] _emptyArray;

    public void LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo(){
       super();
       this.clear();
    }
    public static LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo[] emptyArray(){
       if (LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo._emptyArray == null) {
             LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo[] uBuildingLiv = new LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo[0];
             LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo._emptyArray = uBuildingLiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo._emptyArray;
    }
    public static LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo parseFrom(CodedInputByteBufferNano p0){
       return new LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo().mergeFrom(p0);
    }
    public static LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo(), p0);
    }
    public LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo clear(){
       this.avatar = "";
       this.buttonText = "";
       this.serviceCount = 0;
       this.text = "";
       this.threshold = 0;
       this.bottomText = "";
       this.reservedButton = "";
       this.reservedText = "";
       this.status = 0;
       this.show = 0;
       this.reservationUrl = "";
       this.bizType = "";
       this.authorRole = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.avatar).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.avatar);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.buttonText);
       }
       LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo tserviceCoun = this.serviceCount;
       if (tserviceCoun) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, tserviceCoun);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.text);
       }
       tserviceCoun = this.threshold;
       if (tserviceCoun) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(5, tserviceCoun);
       }
       if (!(this.bottomText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.bottomText);
       }
       if (!(this.reservedButton).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.reservedButton);
       }
       if (!(this.reservedText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.reservedText);
       }
       LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tstatus);
       }
       tstatus = this.show;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tstatus);
       }
       if (!(this.reservationUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.reservationUrl);
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.bizType);
       }
       if (!(this.authorRole).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.authorRole);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.avatar = p0.readString();
                break;
              case 18:
                this.buttonText = p0.readString();
                break;
              case 24:
                this.serviceCount = p0.readInt64();
                break;
              case '"':
                this.text = p0.readString();
                break;
              case '(':
                this.threshold = p0.readInt64();
                break;
              case '2':
                this.bottomText = p0.readString();
                break;
              case ':':
                this.reservedButton = p0.readString();
                break;
              case 'B':
                this.reservedText = p0.readString();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case 'P':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.show = i;
                }
                break;
              case 'Z':
                this.reservationUrl = p0.readString();
                break;
              case 'b':
                this.bizType = p0.readString();
                break;
              case 'j':
                this.authorRole = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.avatar).equals(str)) {
          p0.writeString(1, this.avatar);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(2, this.buttonText);
       }
       LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo tserviceCoun = this.serviceCount;
       if (tserviceCoun) {
          p0.writeInt64(3, tserviceCoun);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(4, this.text);
       }
       tserviceCoun = this.threshold;
       if (tserviceCoun) {
          p0.writeInt64(5, tserviceCoun);
       }
       if (!(this.bottomText).equals(str)) {
          p0.writeString(6, this.bottomText);
       }
       if (!(this.reservedButton).equals(str)) {
          p0.writeString(7, this.reservedButton);
       }
       if (!(this.reservedText).equals(str)) {
          p0.writeString(8, this.reservedText);
       }
       LocallifeBuildLiveMessagesProto$BuildingLiveConsultingInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(9, tstatus);
       }
       tstatus = this.show;
       if (tstatus != null) {
          p0.writeInt32(10, tstatus);
       }
       if (!(this.reservationUrl).equals(str)) {
          p0.writeString(11, this.reservationUrl);
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(12, this.bizType);
       }
       if (!(this.authorRole).equals(str)) {
          p0.writeString(13, this.authorRole);
       }
       super.writeTo(p0);
       return;
    }
}
