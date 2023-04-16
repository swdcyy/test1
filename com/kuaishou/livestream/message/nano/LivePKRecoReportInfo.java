package com.kuaishou.livestream.message.nano.LivePKRecoReportInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LivePKRecoRealShow;

public final class LivePKRecoReportInfo extends MessageNano	// class@001206
{
    public int infoType;
    public LivePKRecoRealShow realShow;
    public static LivePKRecoReportInfo[] _emptyArray;

    public void LivePKRecoReportInfo(){
       super();
       this.clear();
    }
    public static LivePKRecoReportInfo[] emptyArray(){
       if (LivePKRecoReportInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePKRecoReportInfo._emptyArray == null) {
             LivePKRecoReportInfo[] livePKRecoRe = new LivePKRecoReportInfo[0];
             LivePKRecoReportInfo._emptyArray = livePKRecoRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePKRecoReportInfo._emptyArray;
    }
    public static LivePKRecoReportInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePKRecoReportInfo().mergeFrom(p0);
    }
    public static LivePKRecoReportInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePKRecoReportInfo(), p0);
    }
    public LivePKRecoReportInfo clear(){
       this.infoType = 0;
       this.realShow = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePKRecoReportInfo tinfoType = this.infoType;
       if (tinfoType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tinfoType);
       }
       tinfoType = this.realShow;
       if (tinfoType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tinfoType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePKRecoReportInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.realShow == null){
                this.realShow = new LivePKRecoRealShow();
             }
             p0.readMessage(this.realShow);
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.infoType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePKRecoReportInfo tinfoType = this.infoType;
       if (tinfoType != null) {
          p0.writeInt32(1, tinfoType);
       }
       tinfoType = this.realShow;
       if (tinfoType != null) {
          p0.writeMessage(2, tinfoType);
       }
       super.writeTo(p0);
       return;
    }
}
