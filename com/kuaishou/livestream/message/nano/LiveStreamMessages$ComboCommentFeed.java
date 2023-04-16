package com.kuaishou.livestream.message.nano.LiveStreamMessages$ComboCommentFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$ComboCommentFeed extends MessageNano	// class@0012ca
{
    public int comboCount;
    public String content;
    public String id;
    public long time;
    public static LiveStreamMessages$ComboCommentFeed[] _emptyArray;

    public void LiveStreamMessages$ComboCommentFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$ComboCommentFeed[] emptyArray(){
       if (LiveStreamMessages$ComboCommentFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$ComboCommentFeed._emptyArray == null) {
             LiveStreamMessages$ComboCommentFeed[] uComboCommen = new LiveStreamMessages$ComboCommentFeed[0];
             LiveStreamMessages$ComboCommentFeed._emptyArray = uComboCommen;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$ComboCommentFeed._emptyArray;
    }
    public static LiveStreamMessages$ComboCommentFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$ComboCommentFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$ComboCommentFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$ComboCommentFeed(), p0);
    }
    public LiveStreamMessages$ComboCommentFeed clear(){
       this.id = "";
       this.content = "";
       this.comboCount = 0;
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       LiveStreamMessages$ComboCommentFeed tcomboCount = this.comboCount;
       if (tcomboCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcomboCount);
       }
       tcomboCount = this.time;
       if (tcomboCount) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcomboCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$ComboCommentFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.time = p0.readUInt64();
                   }
                }else {
                   this.comboCount = p0.readUInt32();
                }
             }else {
                this.content = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       LiveStreamMessages$ComboCommentFeed tcomboCount = this.comboCount;
       if (tcomboCount != null) {
          p0.writeUInt32(3, tcomboCount);
       }
       tcomboCount = this.time;
       if (tcomboCount) {
          p0.writeUInt64(4, tcomboCount);
       }
       super.writeTo(p0);
       return;
    }
}
