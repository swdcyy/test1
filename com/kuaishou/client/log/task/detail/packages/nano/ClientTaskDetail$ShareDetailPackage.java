package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ShareDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$ShareDetailPackage extends MessageNano	// class@001480
{
    public long authorId;
    public int liveGuideTriggerRule;
    public long photoId;
    public int platform;
    public String sAuthorId;
    public String sPhotoId;
    public String sharedUrl;
    public int via;
    public static ClientTaskDetail$ShareDetailPackage[] _emptyArray;

    public void ClientTaskDetail$ShareDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$ShareDetailPackage[] emptyArray(){
       if (ClientTaskDetail$ShareDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$ShareDetailPackage._emptyArray == null) {
             ClientTaskDetail$ShareDetailPackage[] shareDetailP = new ClientTaskDetail$ShareDetailPackage[0];
             ClientTaskDetail$ShareDetailPackage._emptyArray = shareDetailP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$ShareDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$ShareDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$ShareDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$ShareDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$ShareDetailPackage(), p0);
    }
    public ClientTaskDetail$ShareDetailPackage clear(){
       this.via = 0;
       this.sharedUrl = "";
       this.platform = 0;
       this.authorId = 0;
       this.photoId = 0;
       this.sAuthorId = "";
       this.sPhotoId = "";
       this.liveGuideTriggerRule = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$ShareDetailPackage tvia = this.via;
       if (tvia != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tvia);
       }
       String str = "";
       if (!(this.sharedUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.sharedUrl);
       }
       tvia = this.platform;
       if (tvia != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tvia);
       }
       ClientTaskDetail$ShareDetailPackage tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthorId);
       }
       tauthorId = this.photoId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tauthorId);
       }
       if (!(this.sAuthorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.sAuthorId);
       }
       if (!(this.sPhotoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.sPhotoId);
       }
       tvia = this.liveGuideTriggerRule;
       if (tvia != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tvia);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$ShareDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != 1 && (i != 2 && i != 3))) {
                                     continue ;
                                  }else {
                                     this.liveGuideTriggerRule = i;
                                  }
                               }
                            }else {
                               this.sPhotoId = p0.readString();
                            }
                         }else {
                            this.sAuthorId = p0.readString();
                         }
                      }else {
                         this.photoId = p0.readUInt64();
                      }
                   }else {
                      this.authorId = p0.readUInt64();
                   }
                }else {
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 8:
                       case 9:
                       case 10:
                       case 11:
                       case 12:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case 1:
                         break;
                       default:
                   }
                   this.platform = i;
                }
             }else {
                this.sharedUrl = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.via = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$ShareDetailPackage tvia = this.via;
       if (tvia != null) {
          p0.writeInt32(1, tvia);
       }
       String str = "";
       if (!(this.sharedUrl).equals(str)) {
          p0.writeString(2, this.sharedUrl);
       }
       tvia = this.platform;
       if (tvia != null) {
          p0.writeInt32(3, tvia);
       }
       ClientTaskDetail$ShareDetailPackage tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(4, tauthorId);
       }
       tauthorId = this.photoId;
       if (tauthorId) {
          p0.writeUInt64(5, tauthorId);
       }
       if (!(this.sAuthorId).equals(str)) {
          p0.writeString(6, this.sAuthorId);
       }
       if (!(this.sPhotoId).equals(str)) {
          p0.writeString(7, this.sPhotoId);
       }
       tvia = this.liveGuideTriggerRule;
       if (tvia != null) {
          p0.writeInt32(8, tvia);
       }
       super.writeTo(p0);
       return;
    }
}
