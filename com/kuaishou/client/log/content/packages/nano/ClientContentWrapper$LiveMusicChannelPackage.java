package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicChannelPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$LiveMusicChannelPackage extends MessageNano	// class@001321
{
    public String musicChannelId;
    public String musicChannelName;
    public int musicCount;
    public static ClientContentWrapper$LiveMusicChannelPackage[] _emptyArray;

    public void ClientContentWrapper$LiveMusicChannelPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LiveMusicChannelPackage[] emptyArray(){
       if (ClientContentWrapper$LiveMusicChannelPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LiveMusicChannelPackage._emptyArray == null) {
             ClientContentWrapper$LiveMusicChannelPackage[] liveMusicCha = new ClientContentWrapper$LiveMusicChannelPackage[0];
             ClientContentWrapper$LiveMusicChannelPackage._emptyArray = liveMusicCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LiveMusicChannelPackage._emptyArray;
    }
    public static ClientContentWrapper$LiveMusicChannelPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LiveMusicChannelPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LiveMusicChannelPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LiveMusicChannelPackage(), p0);
    }
    public ClientContentWrapper$LiveMusicChannelPackage clear(){
       this.musicChannelId = "";
       this.musicChannelName = "";
       this.musicCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.musicChannelId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.musicChannelId);
       }
       if (!(this.musicChannelName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.musicChannelName);
       }
       ClientContentWrapper$LiveMusicChannelPackage tmusicCount = this.musicCount;
       if (tmusicCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tmusicCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$LiveMusicChannelPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.musicCount = p0.readUInt32();
                }
             }else {
                this.musicChannelName = p0.readString();
             }
          }else {
             this.musicChannelId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.musicChannelId).equals(str)) {
          p0.writeString(1, this.musicChannelId);
       }
       if (!(this.musicChannelName).equals(str)) {
          p0.writeString(2, this.musicChannelName);
       }
       ClientContentWrapper$LiveMusicChannelPackage tmusicCount = this.musicCount;
       if (tmusicCount != null) {
          p0.writeUInt32(3, tmusicCount);
       }
       super.writeTo(p0);
       return;
    }
}
