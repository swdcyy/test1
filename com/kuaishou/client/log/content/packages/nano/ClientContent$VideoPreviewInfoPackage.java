package com.kuaishou.client.log.content.packages.nano.ClientContent$VideoPreviewInfoPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoSegmentPackage;

public final class ClientContent$VideoPreviewInfoPackage extends MessageNano	// class@0012fa
{
    public int player;
    public long prepareDuration;
    public int scene;
    public ClientContent$VideoSegmentPackage videoInfoPackage;
    public static ClientContent$VideoPreviewInfoPackage[] _emptyArray;

    public void ClientContent$VideoPreviewInfoPackage(){
       super();
       this.clear();
    }
    public static ClientContent$VideoPreviewInfoPackage[] emptyArray(){
       if (ClientContent$VideoPreviewInfoPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$VideoPreviewInfoPackage._emptyArray == null) {
             ClientContent$VideoPreviewInfoPackage[] videoPreview = new ClientContent$VideoPreviewInfoPackage[0];
             ClientContent$VideoPreviewInfoPackage._emptyArray = videoPreview;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$VideoPreviewInfoPackage._emptyArray;
    }
    public static ClientContent$VideoPreviewInfoPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$VideoPreviewInfoPackage().mergeFrom(p0);
    }
    public static ClientContent$VideoPreviewInfoPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$VideoPreviewInfoPackage(), p0);
    }
    public ClientContent$VideoPreviewInfoPackage clear(){
       this.scene = 0;
       this.player = 0;
       this.videoInfoPackage = null;
       this.prepareDuration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$VideoPreviewInfoPackage tscene = this.scene;
       if (tscene != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tscene);
       }
       tscene = this.player;
       if (tscene != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tscene);
       }
       tscene = this.videoInfoPackage;
       if (tscene != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tscene);
       }
       tscene = this.prepareDuration;
       if (tscene) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tscene);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$VideoPreviewInfoPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.prepareDuration = p0.readUInt64();
                   }
                }else if(this.videoInfoPackage == null){
                   this.videoInfoPackage = new ClientContent$VideoSegmentPackage();
                }
                p0.readMessage(this.videoInfoPackage);
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.player = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.scene = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$VideoPreviewInfoPackage tscene = this.scene;
       if (tscene != null) {
          p0.writeInt32(1, tscene);
       }
       tscene = this.player;
       if (tscene != null) {
          p0.writeInt32(2, tscene);
       }
       tscene = this.videoInfoPackage;
       if (tscene != null) {
          p0.writeMessage(3, tscene);
       }
       tscene = this.prepareDuration;
       if (tscene) {
          p0.writeUInt64(4, tscene);
       }
       super.writeTo(p0);
       return;
    }
}
