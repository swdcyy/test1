package com.kuaishou.livestream.message.nano.SCLiveTop1UserChanged;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCLiveTop1UserChanged extends MessageNano	// class@00144a
{
    public String feedMessage;
    public long motionMaterialId;
    public int motionShowType;
    public UserInfos$UserInfo top1User;
    public String topBannerMessage;
    public static SCLiveTop1UserChanged[] _emptyArray;

    public void SCLiveTop1UserChanged(){
       super();
       this.clear();
    }
    public static SCLiveTop1UserChanged[] emptyArray(){
       if (SCLiveTop1UserChanged._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveTop1UserChanged._emptyArray == null) {
             SCLiveTop1UserChanged[] sCLiveTop1Us = new SCLiveTop1UserChanged[0];
             SCLiveTop1UserChanged._emptyArray = sCLiveTop1Us;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveTop1UserChanged._emptyArray;
    }
    public static SCLiveTop1UserChanged parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveTop1UserChanged().mergeFrom(p0);
    }
    public static SCLiveTop1UserChanged parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveTop1UserChanged(), p0);
    }
    public SCLiveTop1UserChanged clear(){
       this.top1User = null;
       this.motionMaterialId = 0;
       this.topBannerMessage = "";
       this.feedMessage = "";
       this.motionShowType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveTop1UserChanged ttop1User = this.top1User;
       if (ttop1User != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, ttop1User);
       }
       ttop1User = this.motionMaterialId;
       if (ttop1User - null) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, ttop1User);
       }
       String str = "";
       if (!(this.topBannerMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.topBannerMessage);
       }
       if (!(this.feedMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.feedMessage);
       }
       ttop1User = this.motionShowType;
       if (ttop1User != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ttop1User);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveTop1UserChanged mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && i != 3))) {
                            continue ;
                         }else {
                            this.motionShowType = i;
                         }
                      }
                   }else {
                      this.feedMessage = p0.readString();
                   }
                }else {
                   this.topBannerMessage = p0.readString();
                }
             }else {
                this.motionMaterialId = p0.readInt64();
             }
          }else if(this.top1User == null){
             this.top1User = new UserInfos$UserInfo();
          }
          p0.readMessage(this.top1User);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveTop1UserChanged ttop1User = this.top1User;
       if (ttop1User != null) {
          p0.writeMessage(1, ttop1User);
       }
       ttop1User = this.motionMaterialId;
       if (ttop1User - null) {
          p0.writeInt64(2, ttop1User);
       }
       String str = "";
       if (!(this.topBannerMessage).equals(str)) {
          p0.writeString(3, this.topBannerMessage);
       }
       if (!(this.feedMessage).equals(str)) {
          p0.writeString(4, this.feedMessage);
       }
       ttop1User = this.motionShowType;
       if (ttop1User != null) {
          p0.writeInt32(5, ttop1User);
       }
       super.writeTo(p0);
       return;
    }
}
