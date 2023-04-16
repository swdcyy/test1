package com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$DegradableHeadUrlUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$CdnDegradeConfig;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class CnyCdnDegradeProto$DegradableHeadUrlUserInfo extends MessageNano	// class@00148f
{
    public CnyCdnDegradeProto$CdnDegradeConfig cdnDegradeConfig;
    public UserInfos$UserInfo userInfo;
    public static CnyCdnDegradeProto$DegradableHeadUrlUserInfo[] _emptyArray;

    public void CnyCdnDegradeProto$DegradableHeadUrlUserInfo(){
       super();
       this.clear();
    }
    public static CnyCdnDegradeProto$DegradableHeadUrlUserInfo[] emptyArray(){
       if (CnyCdnDegradeProto$DegradableHeadUrlUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CnyCdnDegradeProto$DegradableHeadUrlUserInfo._emptyArray == null) {
             CnyCdnDegradeProto$DegradableHeadUrlUserInfo[] uDegradableH = new CnyCdnDegradeProto$DegradableHeadUrlUserInfo[0];
             CnyCdnDegradeProto$DegradableHeadUrlUserInfo._emptyArray = uDegradableH;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CnyCdnDegradeProto$DegradableHeadUrlUserInfo._emptyArray;
    }
    public static CnyCdnDegradeProto$DegradableHeadUrlUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new CnyCdnDegradeProto$DegradableHeadUrlUserInfo().mergeFrom(p0);
    }
    public static CnyCdnDegradeProto$DegradableHeadUrlUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CnyCdnDegradeProto$DegradableHeadUrlUserInfo(), p0);
    }
    public CnyCdnDegradeProto$DegradableHeadUrlUserInfo clear(){
       this.userInfo = null;
       this.cdnDegradeConfig = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CnyCdnDegradeProto$DegradableHeadUrlUserInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserInfo);
       }
       tuserInfo = this.cdnDegradeConfig;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuserInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CnyCdnDegradeProto$DegradableHeadUrlUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.cdnDegradeConfig == null){
                this.cdnDegradeConfig = new CnyCdnDegradeProto$CdnDegradeConfig();
             }
             p0.readMessage(this.cdnDegradeConfig);
          }else if(this.userInfo == null){
             this.userInfo = new UserInfos$UserInfo();
          }
          p0.readMessage(this.userInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       CnyCdnDegradeProto$DegradableHeadUrlUserInfo tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          p0.writeMessage(1, tuserInfo);
       }
       tuserInfo = this.cdnDegradeConfig;
       if (tuserInfo != null) {
          p0.writeMessage(2, tuserInfo);
       }
       super.writeTo(p0);
       return;
    }
}
