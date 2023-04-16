package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$OutsideH5PagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$OutsideH5PagePackage extends MessageNano	// class@00133a
{
    public String cc;
    public int cover;
    public String docId;
    public String fid;
    public String redPacketId;
    public int status;
    public static ClientContentWrapper$OutsideH5PagePackage[] _emptyArray;

    public void ClientContentWrapper$OutsideH5PagePackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$OutsideH5PagePackage[] emptyArray(){
       if (ClientContentWrapper$OutsideH5PagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$OutsideH5PagePackage._emptyArray == null) {
             ClientContentWrapper$OutsideH5PagePackage[] outsideH5Pag = new ClientContentWrapper$OutsideH5PagePackage[0];
             ClientContentWrapper$OutsideH5PagePackage._emptyArray = outsideH5Pag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$OutsideH5PagePackage._emptyArray;
    }
    public static ClientContentWrapper$OutsideH5PagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$OutsideH5PagePackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$OutsideH5PagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$OutsideH5PagePackage(), p0);
    }
    public ClientContentWrapper$OutsideH5PagePackage clear(){
       this.fid = "";
       this.cc = "";
       this.cover = 0;
       this.docId = "";
       this.redPacketId = "";
       this.status = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.fid).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.fid);
       }
       if (!(this.cc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.cc);
       }
       ClientContentWrapper$OutsideH5PagePackage tcover = this.cover;
       if (tcover != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tcover);
       }
       if (!(this.docId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.docId);
       }
       if (!(this.redPacketId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.redPacketId);
       }
       tcover = this.status;
       if (tcover != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tcover);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$OutsideH5PagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && (i != 2 && i != 3))) {
                               continue ;
                            }else {
                               this.status = i;
                            }
                         }
                      }else {
                         this.redPacketId = p0.readString();
                      }
                   }else {
                      this.docId = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && i != 1) {
                      continue ;
                   }else {
                      this.cover = i;
                   }
                }
             }else {
                this.cc = p0.readString();
             }
          }else {
             this.fid = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.fid).equals(str)) {
          p0.writeString(1, this.fid);
       }
       if (!(this.cc).equals(str)) {
          p0.writeString(2, this.cc);
       }
       ClientContentWrapper$OutsideH5PagePackage tcover = this.cover;
       if (tcover != null) {
          p0.writeInt32(3, tcover);
       }
       if (!(this.docId).equals(str)) {
          p0.writeString(4, this.docId);
       }
       if (!(this.redPacketId).equals(str)) {
          p0.writeString(5, this.redPacketId);
       }
       tcover = this.status;
       if (tcover != null) {
          p0.writeInt32(6, tcover);
       }
       super.writeTo(p0);
       return;
    }
}
