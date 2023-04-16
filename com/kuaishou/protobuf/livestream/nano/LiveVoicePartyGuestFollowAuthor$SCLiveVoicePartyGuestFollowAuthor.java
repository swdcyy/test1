package com.kuaishou.protobuf.livestream.nano.LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor extends MessageNano	// class@000d25
{
    public long fromUserId;
    public long serverTimestamp;
    public long toUserId;
    public static LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor[] _emptyArray;

    public void LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor(){
       super();
       this.clear();
    }
    public static LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor[] emptyArray(){
       if (LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor._emptyArray == null) {
             LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor[] sCLiveVoiceP = new LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor[0];
             LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor._emptyArray = sCLiveVoiceP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor._emptyArray;
    }
    public static LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor().mergeFrom(p0);
    }
    public static LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor(), p0);
    }
    public LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor clear(){
       this.fromUserId = 0;
       this.toUserId = 0;
       this.serverTimestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor tfromUserId = this.fromUserId;
       int i1 = 0;
       if (tfromUserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tfromUserId);
       }
       tfromUserId = this.toUserId;
       if (tfromUserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tfromUserId);
       }
       tfromUserId = this.serverTimestamp;
       if (tfromUserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tfromUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.serverTimestamp = p0.readUInt64();
                }
             }else {
                this.toUserId = p0.readUInt64();
             }
          }else {
             this.fromUserId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveVoicePartyGuestFollowAuthor$SCLiveVoicePartyGuestFollowAuthor tfromUserId = this.fromUserId;
       int i = 0;
       if (tfromUserId - i) {
          p0.writeUInt64(1, tfromUserId);
       }
       tfromUserId = this.toUserId;
       if (tfromUserId - i) {
          p0.writeUInt64(2, tfromUserId);
       }
       tfromUserId = this.serverTimestamp;
       if (tfromUserId - i) {
          p0.writeUInt64(3, tfromUserId);
       }
       super.writeTo(p0);
       return;
    }
}
