package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveFansGroupPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveFansGroupPackage extends MessageNano	// class@00126e
{
    public String fansUserId;
    public int intimacyLevel;
    public long intimacyScore;
    public int intimacyStatus;
    public int intimacyStatusV2;
    public static ClientContent$LiveFansGroupPackage[] _emptyArray;

    public void ClientContent$LiveFansGroupPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveFansGroupPackage[] emptyArray(){
       if (ClientContent$LiveFansGroupPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveFansGroupPackage._emptyArray == null) {
             ClientContent$LiveFansGroupPackage[] liveFansGrou = new ClientContent$LiveFansGroupPackage[0];
             ClientContent$LiveFansGroupPackage._emptyArray = liveFansGrou;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveFansGroupPackage._emptyArray;
    }
    public static ClientContent$LiveFansGroupPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveFansGroupPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveFansGroupPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveFansGroupPackage(), p0);
    }
    public ClientContent$LiveFansGroupPackage clear(){
       this.fansUserId = "";
       this.intimacyScore = 0;
       this.intimacyLevel = 0;
       this.intimacyStatus = 0;
       this.intimacyStatusV2 = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.fansUserId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.fansUserId);
       }
       ClientContent$LiveFansGroupPackage tintimacySco = this.intimacyScore;
       if (tintimacySco) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tintimacySco);
       }
       tintimacySco = this.intimacyLevel;
       if (tintimacySco != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tintimacySco);
       }
       tintimacySco = this.intimacyStatus;
       if (tintimacySco != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tintimacySco);
       }
       tintimacySco = this.intimacyStatusV2;
       if (tintimacySco != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tintimacySco);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveFansGroupPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && i != 3))) {
                            continue ;
                         }else {
                            this.intimacyStatusV2 = i;
                         }
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.intimacyStatus = i;
                      }
                   }
                }else {
                   this.intimacyLevel = p0.readUInt32();
                }
             }else {
                this.intimacyScore = p0.readUInt64();
             }
          }else {
             this.fansUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.fansUserId).equals("")) {
          p0.writeString(1, this.fansUserId);
       }
       ClientContent$LiveFansGroupPackage tintimacySco = this.intimacyScore;
       if (tintimacySco) {
          p0.writeUInt64(2, tintimacySco);
       }
       tintimacySco = this.intimacyLevel;
       if (tintimacySco != null) {
          p0.writeUInt32(3, tintimacySco);
       }
       tintimacySco = this.intimacyStatus;
       if (tintimacySco != null) {
          p0.writeInt32(4, tintimacySco);
       }
       tintimacySco = this.intimacyStatusV2;
       if (tintimacySco != null) {
          p0.writeInt32(5, tintimacySco);
       }
       super.writeTo(p0);
       return;
    }
}
