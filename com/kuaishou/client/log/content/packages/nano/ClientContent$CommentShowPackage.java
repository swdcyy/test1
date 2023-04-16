package com.kuaishou.client.log.content.packages.nano.ClientContent$CommentShowPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$CommentPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$CommentShowPackage extends MessageNano	// class@00122f
{
    public ClientContent$CommentPackage[] commentPackage;
    public static ClientContent$CommentShowPackage[] _emptyArray;

    public void ClientContent$CommentShowPackage(){
       super();
       this.clear();
    }
    public static ClientContent$CommentShowPackage[] emptyArray(){
       if (ClientContent$CommentShowPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$CommentShowPackage._emptyArray == null) {
             ClientContent$CommentShowPackage[] uCommentShow = new ClientContent$CommentShowPackage[0];
             ClientContent$CommentShowPackage._emptyArray = uCommentShow;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$CommentShowPackage._emptyArray;
    }
    public static ClientContent$CommentShowPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$CommentShowPackage().mergeFrom(p0);
    }
    public static ClientContent$CommentShowPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$CommentShowPackage(), p0);
    }
    public ClientContent$CommentShowPackage clear(){
       this.commentPackage = ClientContent$CommentPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$CommentShowPackage tcommentPack = this.commentPackage;
       if (tcommentPack != null && tcommentPack.length > 0) {
          int i1 = 0;
          ClientContent$CommentShowPackage tcommentPack1 = this.commentPackage;
          while (i1 < tcommentPack1.length) {
             object oobject = tcommentPack1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$CommentShowPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientContent$CommentShowPackage tcommentPack = this.commentPackage;
             int i2 = (tcommentPack == null)? 0: tcommentPack.length;
             i = i + i2;
             ClientContent$CommentPackage[] uCommentPack = new ClientContent$CommentPackage[i];
             if (i2) {
                System.arraycopy(tcommentPack, 0, uCommentPack, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uCommentPack[i2] = new ClientContent$CommentPackage();
                p0.readMessage(uCommentPack[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uCommentPack[i2] = new ClientContent$CommentPackage();
             p0.readMessage(uCommentPack[i2]);
             this.commentPackage = uCommentPack;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$CommentShowPackage tcommentPack = this.commentPackage;
       if (tcommentPack != null && tcommentPack.length > 0) {
          int i = 0;
          ClientContent$CommentShowPackage tcommentPack1 = this.commentPackage;
          while (i < tcommentPack1.length) {
             object oobject = tcommentPack1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
