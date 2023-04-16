package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkFirstBlood;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$PkFirstBloodUser;

public final class LivePkMessages$SCPkFirstBlood extends MessageNano	// class@001226
{
    public LivePkMessages$PkFirstBloodUser firstBloodUser;
    public String pkId;
    public int showType;
    public static LivePkMessages$SCPkFirstBlood[] _emptyArray;

    public void LivePkMessages$SCPkFirstBlood(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCPkFirstBlood[] emptyArray(){
       if (LivePkMessages$SCPkFirstBlood._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkFirstBlood._emptyArray == null) {
             LivePkMessages$SCPkFirstBlood[] sCPkFirstBlo = new LivePkMessages$SCPkFirstBlood[0];
             LivePkMessages$SCPkFirstBlood._emptyArray = sCPkFirstBlo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkFirstBlood._emptyArray;
    }
    public static LivePkMessages$SCPkFirstBlood parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkFirstBlood().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkFirstBlood parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkFirstBlood(), p0);
    }
    public LivePkMessages$SCPkFirstBlood clear(){
       this.pkId = "";
       this.showType = 0;
       this.firstBloodUser = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$SCPkFirstBlood tshowType = this.showType;
       if (tshowType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tshowType);
       }
       tshowType = this.firstBloodUser;
       if (tshowType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tshowType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkFirstBlood mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.firstBloodUser == null){
                   this.firstBloodUser = new LivePkMessages$PkFirstBloodUser();
                }
                p0.readMessage(this.firstBloodUser);
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.showType = i;
                }
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       LivePkMessages$SCPkFirstBlood tshowType = this.showType;
       if (tshowType != null) {
          p0.writeInt32(2, tshowType);
       }
       tshowType = this.firstBloodUser;
       if (tshowType != null) {
          p0.writeMessage(3, tshowType);
       }
       super.writeTo(p0);
       return;
    }
}
