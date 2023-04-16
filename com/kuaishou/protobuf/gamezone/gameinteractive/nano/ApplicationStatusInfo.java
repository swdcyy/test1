package com.kuaishou.protobuf.gamezone.gameinteractive.nano.ApplicationStatusInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.gamezone.gameinteractive.nano.CurrentVoicePartyStatus;
import com.kuaishou.protobuf.gamezone.gameinteractive.nano.AppUserInfo;

public final class ApplicationStatusInfo extends MessageNano	// class@000ba5
{
    public String appId;
    public AppUserInfo appUserInfo;
    public CurrentVoicePartyStatus currentVoicePartyStatus;
    public String liveStreamId;
    public boolean needVoiceParty;
    public int status;
    public long timestamp;
    public static ApplicationStatusInfo[] _emptyArray;

    public void ApplicationStatusInfo(){
       super();
       this.clear();
    }
    public static ApplicationStatusInfo[] emptyArray(){
       if (ApplicationStatusInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ApplicationStatusInfo._emptyArray == null) {
             ApplicationStatusInfo[] uApplication = new ApplicationStatusInfo[0];
             ApplicationStatusInfo._emptyArray = uApplication;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ApplicationStatusInfo._emptyArray;
    }
    public static ApplicationStatusInfo parseFrom(CodedInputByteBufferNano p0){
       return new ApplicationStatusInfo().mergeFrom(p0);
    }
    public static ApplicationStatusInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ApplicationStatusInfo(), p0);
    }
    public ApplicationStatusInfo clear(){
       this.liveStreamId = "";
       this.appId = "";
       this.status = 0;
       this.appUserInfo = null;
       this.needVoiceParty = false;
       this.currentVoicePartyStatus = null;
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.appId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.appId);
       }
       ApplicationStatusInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tstatus);
       }
       tstatus = this.appUserInfo;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tstatus);
       }
       tstatus = this.needVoiceParty;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tstatus);
       }
       tstatus = this.currentVoicePartyStatus;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tstatus);
       }
       tstatus = this.timestamp;
       if (tstatus) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ApplicationStatusInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.timestamp = p0.readUInt64();
                            }
                         }else if(this.currentVoicePartyStatus == null){
                            this.currentVoicePartyStatus = new CurrentVoicePartyStatus();
                         }
                         p0.readMessage(this.currentVoicePartyStatus);
                      }else {
                         this.needVoiceParty = p0.readBool();
                      }
                   }else if(this.appUserInfo == null){
                      this.appUserInfo = new AppUserInfo();
                   }
                   p0.readMessage(this.appUserInfo);
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.status = i;
                   }
                }
             }else {
                this.appId = p0.readString();
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
       if (!(this.appId).equals(str)) {
          p0.writeString(2, this.appId);
       }
       ApplicationStatusInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(3, tstatus);
       }
       tstatus = this.appUserInfo;
       if (tstatus != null) {
          p0.writeMessage(4, tstatus);
       }
       tstatus = this.needVoiceParty;
       if (tstatus != null) {
          p0.writeBool(5, tstatus);
       }
       tstatus = this.currentVoicePartyStatus;
       if (tstatus != null) {
          p0.writeMessage(6, tstatus);
       }
       tstatus = this.timestamp;
       if (tstatus) {
          p0.writeUInt64(7, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
