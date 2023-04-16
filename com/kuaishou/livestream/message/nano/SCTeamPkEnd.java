package com.kuaishou.livestream.message.nano.SCTeamPkEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCTeamPkEnd extends MessageNano	// class@001462
{
    public int endType;
    public String liveStreamId;
    public String pkId;
    public String pkRoomId;
    public String toastMsg;
    public String voicePartyId;
    public static SCTeamPkEnd[] _emptyArray;

    public void SCTeamPkEnd(){
       super();
       this.clear();
    }
    public static SCTeamPkEnd[] emptyArray(){
       if (SCTeamPkEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCTeamPkEnd._emptyArray == null) {
             SCTeamPkEnd[] sCTeamPkEndA = new SCTeamPkEnd[0];
             SCTeamPkEnd._emptyArray = sCTeamPkEndA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCTeamPkEnd._emptyArray;
    }
    public static SCTeamPkEnd parseFrom(CodedInputByteBufferNano p0){
       return new SCTeamPkEnd().mergeFrom(p0);
    }
    public static SCTeamPkEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCTeamPkEnd(), p0);
    }
    public SCTeamPkEnd clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.pkRoomId = "";
       this.pkId = "";
       this.endType = 0;
       this.toastMsg = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.voicePartyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.voicePartyId);
       }
       if (!(this.pkRoomId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pkRoomId);
       }
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.pkId);
       }
       SCTeamPkEnd tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tendType);
       }
       if (!(this.toastMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.toastMsg);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCTeamPkEnd mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.toastMsg = p0.readString();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.endType = i;
                         }
                      }
                   }else {
                      this.pkId = p0.readString();
                   }
                }else {
                   this.pkRoomId = p0.readString();
                }
             }else {
                this.voicePartyId = p0.readString();
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
       if (!(this.voicePartyId).equals(str)) {
          p0.writeString(2, this.voicePartyId);
       }
       if (!(this.pkRoomId).equals(str)) {
          p0.writeString(3, this.pkRoomId);
       }
       if (!(this.pkId).equals(str)) {
          p0.writeString(4, this.pkId);
       }
       SCTeamPkEnd tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(5, tendType);
       }
       if (!(this.toastMsg).equals(str)) {
          p0.writeString(6, this.toastMsg);
       }
       super.writeTo(p0);
       return;
    }
}
