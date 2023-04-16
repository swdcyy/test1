package com.kuaishou.livestream.message.nano.SCVoicePartyEnterRoomNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class SCVoicePartyEnterRoomNotice extends MessageNano	// class@00146d
{
    public UserInfos$UserInfo author;
    public int level;
    public String liveStreamId;
    public int source;
    public int subLevel;
    public UserInfos$UserInfo user;
    public LiveAudienceState userState;
    public String voicePartyId;
    public static SCVoicePartyEnterRoomNotice[] _emptyArray;

    public void SCVoicePartyEnterRoomNotice(){
       super();
       this.clear();
    }
    public static SCVoicePartyEnterRoomNotice[] emptyArray(){
       if (SCVoicePartyEnterRoomNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCVoicePartyEnterRoomNotice._emptyArray == null) {
             SCVoicePartyEnterRoomNotice[] sCVoiceParty = new SCVoicePartyEnterRoomNotice[0];
             SCVoicePartyEnterRoomNotice._emptyArray = sCVoiceParty;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCVoicePartyEnterRoomNotice._emptyArray;
    }
    public static SCVoicePartyEnterRoomNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCVoicePartyEnterRoomNotice().mergeFrom(p0);
    }
    public static SCVoicePartyEnterRoomNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCVoicePartyEnterRoomNotice(), p0);
    }
    public SCVoicePartyEnterRoomNotice clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.author = null;
       this.user = null;
       this.source = 0;
       this.userState = null;
       this.level = 0;
       this.subLevel = 0;
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
       SCVoicePartyEnterRoomNotice tauthor = this.author;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tauthor);
       }
       tauthor = this.user;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tauthor);
       }
       tauthor = this.source;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tauthor);
       }
       tauthor = this.userState;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tauthor);
       }
       tauthor = this.level;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tauthor);
       }
       tauthor = this.subLevel;
       if (tauthor != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tauthor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCVoicePartyEnterRoomNotice mergeFrom(CodedInputByteBufferNano p0){
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
                            if (i != 56) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.subLevel = p0.readInt32();
                               }
                            }else {
                               this.level = p0.readInt32();
                            }
                         }else if(this.userState == null){
                            this.userState = new LiveAudienceState();
                         }
                         p0.readMessage(this.userState);
                      }else {
                         this.source = p0.readUInt32();
                      }
                   }else if(this.user == null){
                      this.user = new UserInfos$UserInfo();
                   }
                   p0.readMessage(this.user);
                }else if(this.author == null){
                   this.author = new UserInfos$UserInfo();
                }
                p0.readMessage(this.author);
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
       SCVoicePartyEnterRoomNotice tauthor = this.author;
       if (tauthor != null) {
          p0.writeMessage(3, tauthor);
       }
       tauthor = this.user;
       if (tauthor != null) {
          p0.writeMessage(4, tauthor);
       }
       tauthor = this.source;
       if (tauthor != null) {
          p0.writeUInt32(5, tauthor);
       }
       tauthor = this.userState;
       if (tauthor != null) {
          p0.writeMessage(6, tauthor);
       }
       tauthor = this.level;
       if (tauthor != null) {
          p0.writeInt32(7, tauthor);
       }
       tauthor = this.subLevel;
       if (tauthor != null) {
          p0.writeInt32(8, tauthor);
       }
       super.writeTo(p0);
       return;
    }
}
