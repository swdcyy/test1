package com.kuaishou.client.log.event.packages.nano.ClientEvent$SearchEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientEvent$SearchEvent extends MessageNano	// class@000761
{
    public String keyword;
    public ClientContent$SearchResultPackage[] searchResultPackage;
    public int source;
    public int type;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientEvent$SearchEvent[] _emptyArray;

    public void ClientEvent$SearchEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$SearchEvent[] emptyArray(){
       if (ClientEvent$SearchEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$SearchEvent._emptyArray == null) {
             ClientEvent$SearchEvent[] searchEventA = new ClientEvent$SearchEvent[0];
             ClientEvent$SearchEvent._emptyArray = searchEventA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$SearchEvent._emptyArray;
    }
    public static ClientEvent$SearchEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$SearchEvent().mergeFrom(p0);
    }
    public static ClientEvent$SearchEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$SearchEvent(), p0);
    }
    public ClientEvent$SearchEvent clear(){
       this.urlPackage = null;
       this.keyword = "";
       this.type = 0;
       this.source = 0;
       this.searchResultPackage = ClientContent$SearchResultPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$SearchEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, turlPackage);
       }
       if (!(this.keyword).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.keyword);
       }
       turlPackage = this.type;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, turlPackage);
       }
       turlPackage = this.source;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, turlPackage);
       }
       turlPackage = this.searchResultPackage;
       if (turlPackage != null && turlPackage.length > 0) {
          int i1 = 0;
          ClientEvent$SearchEvent tsearchResul = this.searchResultPackage;
          while (i1 < tsearchResul.length) {
             object oobject = tsearchResul[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$SearchEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      int i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         ClientEvent$SearchEvent tsearchResul = this.searchResultPackage;
                         int i2 = (tsearchResul == null)? 0: tsearchResul.length;
                         i = i + i2;
                         ClientContent$SearchResultPackage[] searchResult = new ClientContent$SearchResultPackage[i];
                         if (i2) {
                            System.arraycopy(tsearchResul, 0, searchResult, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            searchResult[i2] = new ClientContent$SearchResultPackage();
                            p0.readMessage(searchResult[i2]);
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         searchResult[i2] = new ClientContent$SearchResultPackage();
                         p0.readMessage(searchResult[i2]);
                         this.searchResultPackage = searchResult;
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
                          case 1:
                            break;
                          default:
                      }
                      this.source = i;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.type = i;
                   }
                }
             }else {
                this.keyword = p0.readString();
             }
          }else if(this.urlPackage == null){
             this.urlPackage = new ClientEvent$UrlPackage();
          }
          p0.readMessage(this.urlPackage);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientEvent$SearchEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          p0.writeMessage(1, turlPackage);
       }
       if (!(this.keyword).equals("")) {
          p0.writeString(2, this.keyword);
       }
       turlPackage = this.type;
       if (turlPackage != null) {
          p0.writeInt32(3, turlPackage);
       }
       turlPackage = this.source;
       if (turlPackage != null) {
          p0.writeInt32(4, turlPackage);
       }
       turlPackage = this.searchResultPackage;
       if (turlPackage != null && turlPackage.length > 0) {
          int i = 0;
          ClientEvent$SearchEvent tsearchResul = this.searchResultPackage;
          while (i < tsearchResul.length) {
             object oobject = tsearchResul[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
