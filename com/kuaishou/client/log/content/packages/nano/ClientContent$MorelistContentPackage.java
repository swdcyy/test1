package com.kuaishou.client.log.content.packages.nano.ClientContent$MorelistContentPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MorelistContentPackage extends MessageNano	// class@0012b2
{
    public String authorId;
    public String contentId;
    public int contentSource;
    public int contentType;
    public static ClientContent$MorelistContentPackage[] _emptyArray;

    public void ClientContent$MorelistContentPackage(){
       super();
       this.clear();
    }
    public static ClientContent$MorelistContentPackage[] emptyArray(){
       if (ClientContent$MorelistContentPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MorelistContentPackage._emptyArray == null) {
             ClientContent$MorelistContentPackage[] morelistCont = new ClientContent$MorelistContentPackage[0];
             ClientContent$MorelistContentPackage._emptyArray = morelistCont;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MorelistContentPackage._emptyArray;
    }
    public static ClientContent$MorelistContentPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MorelistContentPackage().mergeFrom(p0);
    }
    public static ClientContent$MorelistContentPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MorelistContentPackage(), p0);
    }
    public ClientContent$MorelistContentPackage clear(){
       this.authorId = "";
       this.contentId = "";
       this.contentType = 0;
       this.contentSource = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.authorId);
       }
       if (!(this.contentId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.contentId);
       }
       ClientContent$MorelistContentPackage tcontentType = this.contentType;
       if (tcontentType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tcontentType);
       }
       tcontentType = this.contentSource;
       if (tcontentType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tcontentType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MorelistContentPackage mergeFrom(CodedInputByteBufferNano p0){
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
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.contentSource = i;
                      }
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 3)) {
                      continue ;
                   }else {
                      this.contentType = i;
                   }
                }
             }else {
                this.contentId = p0.readString();
             }
          }else {
             this.authorId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.authorId).equals(str)) {
          p0.writeString(1, this.authorId);
       }
       if (!(this.contentId).equals(str)) {
          p0.writeString(2, this.contentId);
       }
       ClientContent$MorelistContentPackage tcontentType = this.contentType;
       if (tcontentType != null) {
          p0.writeInt32(3, tcontentType);
       }
       tcontentType = this.contentSource;
       if (tcontentType != null) {
          p0.writeInt32(4, tcontentType);
       }
       super.writeTo(p0);
       return;
    }
}
