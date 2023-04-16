package com.kuaishou.livestream.message.nano.LiveVoicePartyGroupChatStatusUpdate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveVoicePartyGroupChatStatusUpdate extends MessageNano	// class@0013c9
{
    public long groupId;
    public boolean isPrivateRoom;
    public String liveStreamId;
    public int roomType;
    public int status;
    public String tagText;
    public String voicePartyId;
    public static LiveVoicePartyGroupChatStatusUpdate[] _emptyArray;

    public void LiveVoicePartyGroupChatStatusUpdate(){
       super();
       this.clear();
    }
    public static LiveVoicePartyGroupChatStatusUpdate[] emptyArray(){
       if (LiveVoicePartyGroupChatStatusUpdate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyGroupChatStatusUpdate._emptyArray == null) {
             LiveVoicePartyGroupChatStatusUpdate[] liveVoicePar = new LiveVoicePartyGroupChatStatusUpdate[0];
             LiveVoicePartyGroupChatStatusUpdate._emptyArray = liveVoicePar;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyGroupChatStatusUpdate._emptyArray;
    }
    public static LiveVoicePartyGroupChatStatusUpdate parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyGroupChatStatusUpdate().mergeFrom(p0);
    }
    public static LiveVoicePartyGroupChatStatusUpdate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyGroupChatStatusUpdate(), p0);
    }
    public LiveVoicePartyGroupChatStatusUpdate clear(){
       this.liveStreamId = "";
       this.voicePartyId = "";
       this.groupId = 0;
       this.status = 0;
       this.roomType = 0;
       this.isPrivateRoom = false;
       this.tagText = "";
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
       LiveVoicePartyGroupChatStatusUpdate tgroupId = this.groupId;
       if (tgroupId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tgroupId);
       }
       LiveVoicePartyGroupChatStatusUpdate tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tstatus);
       }
       tstatus = this.roomType;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tstatus);
       }
       tstatus = this.isPrivateRoom;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tstatus);
       }
       if (!(this.tagText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.tagText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyGroupChatStatusUpdate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.tagText = p0.readString();
                            }
                         }else {
                            this.isPrivateRoom = p0.readBool();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                            continue ;
                         }else {
                            this.roomType = i;
                         }
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.status = i;
                      }
                   }
                }else {
                   this.groupId = p0.readUInt64();
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
       LiveVoicePartyGroupChatStatusUpdate tgroupId = this.groupId;
       if (tgroupId) {
          p0.writeUInt64(3, tgroupId);
       }
       LiveVoicePartyGroupChatStatusUpdate tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(4, tstatus);
       }
       tstatus = this.roomType;
       if (tstatus != null) {
          p0.writeInt32(5, tstatus);
       }
       tstatus = this.isPrivateRoom;
       if (tstatus != null) {
          p0.writeBool(6, tstatus);
       }
       if (!(this.tagText).equals(str)) {
          p0.writeString(7, this.tagText);
       }
       super.writeTo(p0);
       return;
    }
}
