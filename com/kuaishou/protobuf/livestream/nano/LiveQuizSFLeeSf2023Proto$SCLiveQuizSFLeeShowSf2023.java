package com.kuaishou.protobuf.livestream.nano.LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonRoute;

public final class LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023 extends MessageNano	// class@000cf9
{
    public LiveCommonRoute commonRoute;
    public int priority;
    public String sfLeeId;
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023[] _emptyArray;

    public void LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023(){
       super();
       this.clear();
    }
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023[] emptyArray(){
       if (LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023._emptyArray == null) {
             LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023[] sCLiveQuizSF = new LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023[0];
             LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023._emptyArray = sCLiveQuizSF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023._emptyArray;
    }
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023().mergeFrom(p0);
    }
    public static LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023(), p0);
    }
    public LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023 clear(){
       this.sfLeeId = "";
       this.priority = 0;
       this.commonRoute = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.sfLeeId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.sfLeeId);
       }
       LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023 tpriority = this.priority;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tpriority);
       }
       tpriority = this.commonRoute;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tpriority);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023 mergeFrom(CodedInputByteBufferNano p0){
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
                }else if(this.commonRoute == null){
                   this.commonRoute = new LiveCommonRoute();
                }
                p0.readMessage(this.commonRoute);
             }else {
                this.priority = p0.readUInt32();
             }
          }else {
             this.sfLeeId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.sfLeeId).equals("")) {
          p0.writeString(1, this.sfLeeId);
       }
       LiveQuizSFLeeSf2023Proto$SCLiveQuizSFLeeShowSf2023 tpriority = this.priority;
       if (tpriority != null) {
          p0.writeUInt32(2, tpriority);
       }
       tpriority = this.commonRoute;
       if (tpriority != null) {
          p0.writeMessage(3, tpriority);
       }
       super.writeTo(p0);
       return;
    }
}
