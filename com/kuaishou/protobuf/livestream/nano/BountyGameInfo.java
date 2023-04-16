package com.kuaishou.protobuf.livestream.nano.BountyGameInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.BountyGameDivisionInfo;
import com.kuaishou.protobuf.livestream.nano.BountyGameResultInfo;
import com.kuaishou.protobuf.livestream.nano.BountyGameInitInfo;

public final class BountyGameInfo extends MessageNano	// class@000c04
{
    public BountyGameDivisionInfo divisionInfo;
    public BountyGameInitInfo initInfo;
    public BountyGameResultInfo resultInfo;
    public static BountyGameInfo[] _emptyArray;

    public void BountyGameInfo(){
       super();
       this.clear();
    }
    public static BountyGameInfo[] emptyArray(){
       if (BountyGameInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (BountyGameInfo._emptyArray == null) {
             BountyGameInfo[] uBountyGameI = new BountyGameInfo[0];
             BountyGameInfo._emptyArray = uBountyGameI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return BountyGameInfo._emptyArray;
    }
    public static BountyGameInfo parseFrom(CodedInputByteBufferNano p0){
       return new BountyGameInfo().mergeFrom(p0);
    }
    public static BountyGameInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new BountyGameInfo(), p0);
    }
    public BountyGameInfo clear(){
       this.initInfo = null;
       this.resultInfo = null;
       this.divisionInfo = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       BountyGameInfo tinitInfo = this.initInfo;
       if (tinitInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tinitInfo);
       }
       tinitInfo = this.resultInfo;
       if (tinitInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tinitInfo);
       }
       tinitInfo = this.divisionInfo;
       if (tinitInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tinitInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public BountyGameInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.divisionInfo == null){
                   this.divisionInfo = new BountyGameDivisionInfo();
                }
                p0.readMessage(this.divisionInfo);
             }else if(this.resultInfo == null){
                this.resultInfo = new BountyGameResultInfo();
             }
             p0.readMessage(this.resultInfo);
          }else if(this.initInfo == null){
             this.initInfo = new BountyGameInitInfo();
          }
          p0.readMessage(this.initInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       BountyGameInfo tinitInfo = this.initInfo;
       if (tinitInfo != null) {
          p0.writeMessage(1, tinitInfo);
       }
       tinitInfo = this.resultInfo;
       if (tinitInfo != null) {
          p0.writeMessage(2, tinitInfo);
       }
       tinitInfo = this.divisionInfo;
       if (tinitInfo != null) {
          p0.writeMessage(3, tinitInfo);
       }
       super.writeTo(p0);
       return;
    }
}
