package com.kuaishou.livestream.message.nano.LiveRefreshAuthorStatusNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveRefreshAuthorStatusNotice extends MessageNano	// class@001280
{
    public long authorId;
    public boolean expired;
    public LiveCdnNodeView[] headWidgetCdnNodeView;
    public String uniqueKey;
    public static LiveRefreshAuthorStatusNotice[] _emptyArray;

    public void LiveRefreshAuthorStatusNotice(){
       super();
       this.clear();
    }
    public static LiveRefreshAuthorStatusNotice[] emptyArray(){
       if (LiveRefreshAuthorStatusNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRefreshAuthorStatusNotice._emptyArray == null) {
             LiveRefreshAuthorStatusNotice[] liveRefreshA = new LiveRefreshAuthorStatusNotice[0];
             LiveRefreshAuthorStatusNotice._emptyArray = liveRefreshA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRefreshAuthorStatusNotice._emptyArray;
    }
    public static LiveRefreshAuthorStatusNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveRefreshAuthorStatusNotice().mergeFrom(p0);
    }
    public static LiveRefreshAuthorStatusNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRefreshAuthorStatusNotice(), p0);
    }
    public LiveRefreshAuthorStatusNotice clear(){
       this.authorId = 0;
       this.headWidgetCdnNodeView = LiveCdnNodeView.emptyArray();
       this.uniqueKey = "";
       this.expired = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRefreshAuthorStatusNotice tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tauthorId);
       }
       tauthorId = this.headWidgetCdnNodeView;
       if (tauthorId != null && tauthorId.length > 0) {
          int i1 = 0;
          LiveRefreshAuthorStatusNotice theadWidgetC = this.headWidgetCdnNodeView;
          while (i1 < theadWidgetC.length) {
             object oobject = theadWidgetC[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.uniqueKey).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.uniqueKey);
       }
       tauthorId = this.expired;
       if (tauthorId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tauthorId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRefreshAuthorStatusNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.expired = p0.readBool();
                   }
                }else {
                   this.uniqueKey = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveRefreshAuthorStatusNotice theadWidgetC = this.headWidgetCdnNodeView;
                int i2 = (theadWidgetC == null)? 0: theadWidgetC.length;
                i = i + i2;
                LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(theadWidgetC, 0, liveCdnNodeV, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCdnNodeV[i2] = new LiveCdnNodeView();
                   p0.readMessage(liveCdnNodeV[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                this.headWidgetCdnNodeView = liveCdnNodeV;
             }
          }else {
             this.authorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRefreshAuthorStatusNotice tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(1, tauthorId);
       }
       tauthorId = this.headWidgetCdnNodeView;
       if (tauthorId != null && tauthorId.length > 0) {
          int i = 0;
          LiveRefreshAuthorStatusNotice theadWidgetC = this.headWidgetCdnNodeView;
          while (i < theadWidgetC.length) {
             object oobject = theadWidgetC[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.uniqueKey).equals("")) {
          p0.writeString(3, this.uniqueKey);
       }
       tauthorId = this.expired;
       if (tauthorId != null) {
          p0.writeBool(4, tauthorId);
       }
       super.writeTo(p0);
       return;
    }
}
