package com.kuaishou.client.log.stat.packages.nano.ClientStat$InvalidRegionEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$UrlRequestStatus;

public final class ClientStat$InvalidRegionEvent extends MessageNano	// class@0007d9
{
    public int errorCode;
    public boolean isFirstRetry;
    public boolean isPullKeyconfigAsync;
    public ClientStat$UrlRequestStatus keyconfigPullStatus;
    public String newRegion;
    public String url;
    public static ClientStat$InvalidRegionEvent[] _emptyArray;

    public void ClientStat$InvalidRegionEvent(){
       super();
       this.clear();
    }
    public static ClientStat$InvalidRegionEvent[] emptyArray(){
       if (ClientStat$InvalidRegionEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$InvalidRegionEvent._emptyArray == null) {
             ClientStat$InvalidRegionEvent[] invalidRegio = new ClientStat$InvalidRegionEvent[0];
             ClientStat$InvalidRegionEvent._emptyArray = invalidRegio;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$InvalidRegionEvent._emptyArray;
    }
    public static ClientStat$InvalidRegionEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$InvalidRegionEvent().mergeFrom(p0);
    }
    public static ClientStat$InvalidRegionEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$InvalidRegionEvent(), p0);
    }
    public ClientStat$InvalidRegionEvent clear(){
       this.errorCode = 0;
       this.url = "";
       this.isFirstRetry = false;
       this.newRegion = "";
       this.keyconfigPullStatus = null;
       this.isPullKeyconfigAsync = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$InvalidRegionEvent terrorCode = this.errorCode;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, terrorCode);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       terrorCode = this.isFirstRetry;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, terrorCode);
       }
       if (!(this.newRegion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.newRegion);
       }
       terrorCode = this.keyconfigPullStatus;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, terrorCode);
       }
       terrorCode = this.isPullKeyconfigAsync;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, terrorCode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$InvalidRegionEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.isPullKeyconfigAsync = p0.readBool();
                         }
                      }else if(this.keyconfigPullStatus == null){
                         this.keyconfigPullStatus = new ClientStat$UrlRequestStatus();
                      }
                      p0.readMessage(this.keyconfigPullStatus);
                   }else {
                      this.newRegion = p0.readString();
                   }
                }else {
                   this.isFirstRetry = p0.readBool();
                }
             }else {
                this.url = p0.readString();
             }
          }else {
             this.errorCode = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$InvalidRegionEvent terrorCode = this.errorCode;
       if (terrorCode != null) {
          p0.writeUInt32(1, terrorCode);
       }
       String str = "";
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       terrorCode = this.isFirstRetry;
       if (terrorCode != null) {
          p0.writeBool(3, terrorCode);
       }
       if (!(this.newRegion).equals(str)) {
          p0.writeString(4, this.newRegion);
       }
       terrorCode = this.keyconfigPullStatus;
       if (terrorCode != null) {
          p0.writeMessage(5, terrorCode);
       }
       terrorCode = this.isPullKeyconfigAsync;
       if (terrorCode != null) {
          p0.writeBool(6, terrorCode);
       }
       super.writeTo(p0);
       return;
    }
}
