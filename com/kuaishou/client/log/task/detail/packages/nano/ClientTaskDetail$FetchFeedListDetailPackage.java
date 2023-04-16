package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$FetchFeedListDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$FetchFeedListDetailPackage extends MessageNano	// class@001457
{
    public boolean coldStart;
    public long cost;
    public boolean firstPage;
    public String llsid;
    public boolean prefetch;
    public int type;
    public static ClientTaskDetail$FetchFeedListDetailPackage[] _emptyArray;

    public void ClientTaskDetail$FetchFeedListDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$FetchFeedListDetailPackage[] emptyArray(){
       if (ClientTaskDetail$FetchFeedListDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$FetchFeedListDetailPackage._emptyArray == null) {
             ClientTaskDetail$FetchFeedListDetailPackage[] uFetchFeedLi = new ClientTaskDetail$FetchFeedListDetailPackage[0];
             ClientTaskDetail$FetchFeedListDetailPackage._emptyArray = uFetchFeedLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$FetchFeedListDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$FetchFeedListDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$FetchFeedListDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$FetchFeedListDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$FetchFeedListDetailPackage(), p0);
    }
    public ClientTaskDetail$FetchFeedListDetailPackage clear(){
       this.type = 0;
       this.llsid = "";
       this.cost = 0;
       this.coldStart = false;
       this.firstPage = false;
       this.prefetch = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$FetchFeedListDetailPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       if (!(this.llsid).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.llsid);
       }
       ttype = this.cost;
       if (ttype) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttype);
       }
       ttype = this.coldStart;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, ttype);
       }
       ttype = this.firstPage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, ttype);
       }
       ttype = this.prefetch;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$FetchFeedListDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.prefetch = p0.readBool();
                         }
                      }else {
                         this.firstPage = p0.readBool();
                      }
                   }else {
                      this.coldStart = p0.readBool();
                   }
                }else {
                   this.cost = p0.readUInt64();
                }
             }else {
                this.llsid = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$FetchFeedListDetailPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       if (!(this.llsid).equals("")) {
          p0.writeString(2, this.llsid);
       }
       ttype = this.cost;
       if (ttype) {
          p0.writeUInt64(3, ttype);
       }
       ttype = this.coldStart;
       if (ttype != null) {
          p0.writeBool(4, ttype);
       }
       ttype = this.firstPage;
       if (ttype != null) {
          p0.writeBool(5, ttype);
       }
       ttype = this.prefetch;
       if (ttype != null) {
          p0.writeBool(6, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
