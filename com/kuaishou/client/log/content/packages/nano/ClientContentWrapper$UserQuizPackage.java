package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$UserQuizPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$UserQuizPackage extends MessageNano	// class@001340
{
    public String answer;
    public String content;
    public String id;
    public int index;
    public int score;
    public static ClientContentWrapper$UserQuizPackage[] _emptyArray;

    public void ClientContentWrapper$UserQuizPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$UserQuizPackage[] emptyArray(){
       if (ClientContentWrapper$UserQuizPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$UserQuizPackage._emptyArray == null) {
             ClientContentWrapper$UserQuizPackage[] userQuizPack = new ClientContentWrapper$UserQuizPackage[0];
             ClientContentWrapper$UserQuizPackage._emptyArray = userQuizPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$UserQuizPackage._emptyArray;
    }
    public static ClientContentWrapper$UserQuizPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$UserQuizPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$UserQuizPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$UserQuizPackage(), p0);
    }
    public ClientContentWrapper$UserQuizPackage clear(){
       this.id = "";
       this.index = 0;
       this.content = "";
       this.answer = "";
       this.score = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       ClientContentWrapper$UserQuizPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tindex);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.content);
       }
       if (!(this.answer).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.answer);
       }
       tindex = this.score;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tindex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$UserQuizPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.score = p0.readInt32();
                      }
                   }else {
                      this.answer = p0.readString();
                   }
                }else {
                   this.content = p0.readString();
                }
             }else {
                this.index = p0.readInt32();
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
       ClientContentWrapper$UserQuizPackage tindex = this.index;
       if (tindex != null) {
          p0.writeInt32(2, tindex);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(3, this.content);
       }
       if (!(this.answer).equals(str)) {
          p0.writeString(4, this.answer);
       }
       tindex = this.score;
       if (tindex != null) {
          p0.writeInt32(5, tindex);
       }
       super.writeTo(p0);
       return;
    }
}
