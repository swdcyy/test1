package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLivePlusRecruitRankInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLivePlusRecruitRankInfo extends MessageNano	// class@00134d
{
    public String clickUrl;
    public String liveStreamId;
    public boolean needClose;
    public String pendantIcon;
    public String title;
    public int width;
    public static LiveStreamMessages$SCLivePlusRecruitRankInfo[] _emptyArray;

    public void LiveStreamMessages$SCLivePlusRecruitRankInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLivePlusRecruitRankInfo[] emptyArray(){
       if (LiveStreamMessages$SCLivePlusRecruitRankInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLivePlusRecruitRankInfo._emptyArray == null) {
             LiveStreamMessages$SCLivePlusRecruitRankInfo[] sCLivePlusRe = new LiveStreamMessages$SCLivePlusRecruitRankInfo[0];
             LiveStreamMessages$SCLivePlusRecruitRankInfo._emptyArray = sCLivePlusRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLivePlusRecruitRankInfo._emptyArray;
    }
    public static LiveStreamMessages$SCLivePlusRecruitRankInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLivePlusRecruitRankInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLivePlusRecruitRankInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLivePlusRecruitRankInfo(), p0);
    }
    public LiveStreamMessages$SCLivePlusRecruitRankInfo clear(){
       this.liveStreamId = "";
       this.pendantIcon = "";
       this.clickUrl = "";
       this.needClose = false;
       this.width = 0;
       this.title = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.pendantIcon).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.pendantIcon);
       }
       if (!(this.clickUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.clickUrl);
       }
       LiveStreamMessages$SCLivePlusRecruitRankInfo tneedClose = this.needClose;
       if (tneedClose != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tneedClose);
       }
       tneedClose = this.width;
       if (tneedClose != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tneedClose);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.title);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLivePlusRecruitRankInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.title = p0.readString();
                         }
                      }else {
                         this.width = p0.readInt32();
                      }
                   }else {
                      this.needClose = p0.readBool();
                   }
                }else {
                   this.clickUrl = p0.readString();
                }
             }else {
                this.pendantIcon = p0.readString();
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
       if (!(this.pendantIcon).equals(str)) {
          p0.writeString(2, this.pendantIcon);
       }
       if (!(this.clickUrl).equals(str)) {
          p0.writeString(3, this.clickUrl);
       }
       LiveStreamMessages$SCLivePlusRecruitRankInfo tneedClose = this.needClose;
       if (tneedClose != null) {
          p0.writeBool(4, tneedClose);
       }
       tneedClose = this.width;
       if (tneedClose != null) {
          p0.writeInt32(5, tneedClose);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(6, this.title);
       }
       super.writeTo(p0);
       return;
    }
}
