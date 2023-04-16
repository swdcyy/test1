package com.kuaishou.protobuf.gamezone.nano.GameZoneClickFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class GameZoneClickFeed extends MessageNano	// class@000bc3
{
    public String authorId;
    public String expTag;
    public String feedId;
    public int feedType;
    public static GameZoneClickFeed[] _emptyArray;

    public void GameZoneClickFeed(){
       super();
       this.clear();
    }
    public static GameZoneClickFeed[] emptyArray(){
       if (GameZoneClickFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GameZoneClickFeed._emptyArray == null) {
             GameZoneClickFeed[] gameZoneClic = new GameZoneClickFeed[0];
             GameZoneClickFeed._emptyArray = gameZoneClic;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GameZoneClickFeed._emptyArray;
    }
    public static GameZoneClickFeed parseFrom(CodedInputByteBufferNano p0){
       return new GameZoneClickFeed().mergeFrom(p0);
    }
    public static GameZoneClickFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GameZoneClickFeed(), p0);
    }
    public GameZoneClickFeed clear(){
       this.feedId = "";
       this.authorId = "";
       this.feedType = 0;
       this.expTag = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.feedId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.feedId);
       }
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.authorId);
       }
       GameZoneClickFeed tGameZoneCli = this.feedType;
       if (tGameZoneCli != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tGameZoneCli);
       }
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.expTag);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GameZoneClickFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.expTag = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.feedType = i;
                   }
                }
             }else {
                this.authorId = p0.readString();
             }
          }else {
             this.feedId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.feedId).equals(str)) {
          p0.writeString(1, this.feedId);
       }
       if (!(this.authorId).equals(str)) {
          p0.writeString(2, this.authorId);
       }
       GameZoneClickFeed tGameZoneCli = this.feedType;
       if (tGameZoneCli != null) {
          p0.writeInt32(3, tGameZoneCli);
       }
       if (!(this.expTag).equals(str)) {
          p0.writeString(4, this.expTag);
       }
       super.writeTo(p0);
       return;
    }
}
