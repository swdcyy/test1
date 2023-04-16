package com.kuaishou.livestream.message.nano.LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate extends MessageNano	// class@001122
{
    public String data;
    public String extParams;
    public long scatterMills;
    public String sceneName;
    public int supportType;
    public int updateType;
    public String uuid;
    public static LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate[] _emptyArray;

    public void LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate(){
       super();
       this.clear();
    }
    public static LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate[] emptyArray(){
       if (LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate._emptyArray == null) {
             LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate[] sCLiveLocalL = new LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate[0];
             LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate._emptyArray = sCLiveLocalL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate._emptyArray;
    }
    public static LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate parseFrom(CodedInputByteBufferNano p0){
       return new LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate().mergeFrom(p0);
    }
    public static LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate(), p0);
    }
    public LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate clear(){
       this.updateType = 0;
       this.sceneName = "";
       this.supportType = 0;
       this.data = "";
       this.scatterMills = 0;
       this.extParams = "";
       this.uuid = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate tupdateType = this.updateType;
       if (tupdateType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tupdateType);
       }
       String str = "";
       if (!(this.sceneName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.sceneName);
       }
       tupdateType = this.supportType;
       if (tupdateType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tupdateType);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.data);
       }
       LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate tscatterMill = this.scatterMills;
       if (tscatterMill) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tscatterMill);
       }
       if (!(this.extParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.extParams);
       }
       if (!(this.uuid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.uuid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.uuid = p0.readString();
                            }
                         }else {
                            this.extParams = p0.readString();
                         }
                      }else {
                         this.scatterMills = p0.readUInt64();
                      }
                   }else {
                      this.data = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.supportType = i;
                   }
                }
             }else {
                this.sceneName = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.updateType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate tupdateType = this.updateType;
       if (tupdateType != null) {
          p0.writeInt32(1, tupdateType);
       }
       String str = "";
       if (!(this.sceneName).equals(str)) {
          p0.writeString(2, this.sceneName);
       }
       tupdateType = this.supportType;
       if (tupdateType != null) {
          p0.writeInt32(3, tupdateType);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(4, this.data);
       }
       LiveBsLocalLifeDataUpdateProto$SCLiveLocalLifeDataUpdate tscatterMill = this.scatterMills;
       if (tscatterMill) {
          p0.writeUInt64(5, tscatterMill);
       }
       if (!(this.extParams).equals(str)) {
          p0.writeString(6, this.extParams);
       }
       if (!(this.uuid).equals(str)) {
          p0.writeString(7, this.uuid);
       }
       super.writeTo(p0);
       return;
    }
}
