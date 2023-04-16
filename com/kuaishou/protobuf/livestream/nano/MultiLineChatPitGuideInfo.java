package com.kuaishou.protobuf.livestream.nano.MultiLineChatPitGuideInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class MultiLineChatPitGuideInfo extends MessageNano	// class@000d27
{
    public int inviteeSourceType;
    public String inviteeUserInfo;
    public static MultiLineChatPitGuideInfo[] _emptyArray;

    public void MultiLineChatPitGuideInfo(){
       super();
       this.clear();
    }
    public static MultiLineChatPitGuideInfo[] emptyArray(){
       if (MultiLineChatPitGuideInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MultiLineChatPitGuideInfo._emptyArray == null) {
             MultiLineChatPitGuideInfo[] multiLineCha = new MultiLineChatPitGuideInfo[0];
             MultiLineChatPitGuideInfo._emptyArray = multiLineCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MultiLineChatPitGuideInfo._emptyArray;
    }
    public static MultiLineChatPitGuideInfo parseFrom(CodedInputByteBufferNano p0){
       return new MultiLineChatPitGuideInfo().mergeFrom(p0);
    }
    public static MultiLineChatPitGuideInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MultiLineChatPitGuideInfo(), p0);
    }
    public MultiLineChatPitGuideInfo clear(){
       this.inviteeUserInfo = "";
       this.inviteeSourceType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.inviteeUserInfo).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.inviteeUserInfo);
       }
       MultiLineChatPitGuideInfo tinviteeSour = this.inviteeSourceType;
       if (tinviteeSour != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tinviteeSour);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MultiLineChatPitGuideInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.inviteeSourceType = p0.readUInt32();
             }
          }else {
             this.inviteeUserInfo = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.inviteeUserInfo).equals("")) {
          p0.writeString(1, this.inviteeUserInfo);
       }
       MultiLineChatPitGuideInfo tinviteeSour = this.inviteeSourceType;
       if (tinviteeSour != null) {
          p0.writeUInt32(2, tinviteeSour);
       }
       super.writeTo(p0);
       return;
    }
}
