package com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$DistrictRankPackage extends MessageNano	// class@001236
{
    public String anchorUserId;
    public int isDistrictrankExpandGiftDialog;
    public String liveStreamId;
    public int rank;
    public int rankType;
    public String text;
    public static ClientContent$DistrictRankPackage[] _emptyArray;

    public void ClientContent$DistrictRankPackage(){
       super();
       this.clear();
    }
    public static ClientContent$DistrictRankPackage[] emptyArray(){
       if (ClientContent$DistrictRankPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$DistrictRankPackage._emptyArray == null) {
             ClientContent$DistrictRankPackage[] uDistrictRan = new ClientContent$DistrictRankPackage[0];
             ClientContent$DistrictRankPackage._emptyArray = uDistrictRan;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$DistrictRankPackage._emptyArray;
    }
    public static ClientContent$DistrictRankPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$DistrictRankPackage().mergeFrom(p0);
    }
    public static ClientContent$DistrictRankPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$DistrictRankPackage(), p0);
    }
    public ClientContent$DistrictRankPackage clear(){
       this.anchorUserId = "";
       this.liveStreamId = "";
       this.rank = 0;
       this.text = "";
       this.isDistrictrankExpandGiftDialog = 0;
       this.rankType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.anchorUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.anchorUserId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       ClientContent$DistrictRankPackage trank = this.rank;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, trank);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.text);
       }
       trank = this.isDistrictrankExpandGiftDialog;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, trank);
       }
       trank = this.rankType;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, trank);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$DistrictRankPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
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
                                case 10:
                                case 1:
                                  break;
                                default:
                            }
                            this.rankType = i;
                         }
                      }else {
                         this.isDistrictrankExpandGiftDialog = p0.readUInt32();
                      }
                   }else {
                      this.text = p0.readString();
                   }
                }else {
                   this.rank = p0.readUInt32();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.anchorUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.anchorUserId).equals(str)) {
          p0.writeString(1, this.anchorUserId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       ClientContent$DistrictRankPackage trank = this.rank;
       if (trank != null) {
          p0.writeUInt32(3, trank);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(4, this.text);
       }
       trank = this.isDistrictrankExpandGiftDialog;
       if (trank != null) {
          p0.writeUInt32(5, trank);
       }
       trank = this.rankType;
       if (trank != null) {
          p0.writeInt32(6, trank);
       }
       super.writeTo(p0);
       return;
    }
}
