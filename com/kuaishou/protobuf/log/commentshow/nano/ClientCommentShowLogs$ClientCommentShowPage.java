package com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowPage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.log.commentshow.nano.ClientCommentShowLogs$ClientCommentShowFeed;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientCommentShowLogs$ClientCommentShowPage extends MessageNano	// class@000dd3
{
    public ClientCommentShowLogs$ClientCommentShowFeed[] comment;
    public String expTag;
    public long photoId;
    public long photoUserId;
    public String sPhotoId;
    public String sPhotoUserId;
    public static ClientCommentShowLogs$ClientCommentShowPage[] _emptyArray;

    public void ClientCommentShowLogs$ClientCommentShowPage(){
       super();
       this.clear();
    }
    public static ClientCommentShowLogs$ClientCommentShowPage[] emptyArray(){
       if (ClientCommentShowLogs$ClientCommentShowPage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientCommentShowLogs$ClientCommentShowPage._emptyArray == null) {
             ClientCommentShowLogs$ClientCommentShowPage[] uClientComme = new ClientCommentShowLogs$ClientCommentShowPage[0];
             ClientCommentShowLogs$ClientCommentShowPage._emptyArray = uClientComme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientCommentShowLogs$ClientCommentShowPage._emptyArray;
    }
    public static ClientCommentShowLogs$ClientCommentShowPage parseFrom(CodedInputByteBufferNano p0){
       return new ClientCommentShowLogs$ClientCommentShowPage().mergeFrom(p0);
    }
    public static ClientCommentShowLogs$ClientCommentShowPage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientCommentShowLogs$ClientCommentShowPage(), p0);
    }
    public ClientCommentShowLogs$ClientCommentShowPage clear(){
       this.expTag = "";
       this.photoId = 0;
       this.photoUserId = 0;
       this.comment = ClientCommentShowLogs$ClientCommentShowFeed.emptyArray();
       this.sPhotoId = "";
       this.sPhotoUserId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.expTag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.expTag);
       }
       ClientCommentShowLogs$ClientCommentShowPage tphotoId = this.photoId;
       if (tphotoId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tphotoId);
       }
       tphotoId = this.photoUserId;
       if (tphotoId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tphotoId);
       }
       ClientCommentShowLogs$ClientCommentShowPage tcomment = this.comment;
       if (tcomment != null && tcomment.length > 0) {
          int i1 = 0;
          tphotoId = this.comment;
          while (i1 < tphotoId.length) {
             object oobject = tphotoId[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.sPhotoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.sPhotoId);
       }
       if (!(this.sPhotoUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.sPhotoUserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientCommentShowLogs$ClientCommentShowPage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.sPhotoUserId = p0.readString();
                         }
                      }else {
                         this.sPhotoId = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      ClientCommentShowLogs$ClientCommentShowPage tcomment = this.comment;
                      int i2 = (tcomment == null)? 0: tcomment.length;
                      i = i + i2;
                      ClientCommentShowLogs$ClientCommentShowFeed[] uClientComme = new ClientCommentShowLogs$ClientCommentShowFeed[i];
                      if (i2) {
                         System.arraycopy(tcomment, 0, uClientComme, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         uClientComme[i2] = new ClientCommentShowLogs$ClientCommentShowFeed();
                         p0.readMessage(uClientComme[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      uClientComme[i2] = new ClientCommentShowLogs$ClientCommentShowFeed();
                      p0.readMessage(uClientComme[i2]);
                      this.comment = uClientComme;
                   }
                }else {
                   this.photoUserId = p0.readUInt64();
                }
             }else {
                this.photoId = p0.readUInt64();
             }
          }else {
             this.expTag = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.expTag).equals(str)) {
          p0.writeString(1, this.expTag);
       }
       ClientCommentShowLogs$ClientCommentShowPage tphotoId = this.photoId;
       if (tphotoId) {
          p0.writeUInt64(2, tphotoId);
       }
       tphotoId = this.photoUserId;
       if (tphotoId) {
          p0.writeUInt64(3, tphotoId);
       }
       ClientCommentShowLogs$ClientCommentShowPage tcomment = this.comment;
       if (tcomment != null && tcomment.length > 0) {
          int i = 0;
          tphotoId = this.comment;
          while (i < tphotoId.length) {
             object oobject = tphotoId[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.sPhotoId).equals(str)) {
          p0.writeString(5, this.sPhotoId);
       }
       if (!(this.sPhotoUserId).equals(str)) {
          p0.writeString(6, this.sPhotoUserId);
       }
       super.writeTo(p0);
       return;
    }
}
