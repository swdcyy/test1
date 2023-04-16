package com.kuaishou.socket.nano.SocketMessages$SCXStreamLiveCardInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.SocketMessages$XStreamLiveCardCoverCdnUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;

public final class SocketMessages$SCXStreamLiveCardInfo extends MessageNano	// class@000f4a
{
    public SocketMessages$XStreamLiveCardCoverCdnUrl[] cdnUrls;
    public String contentUrl;
    public String coverUrl;
    public String[] coverUrls;
    public long id;
    public String tag;
    public String title;
    public static SocketMessages$SCXStreamLiveCardInfo[] _emptyArray;

    public void SocketMessages$SCXStreamLiveCardInfo(){
       super();
       this.clear();
    }
    public static SocketMessages$SCXStreamLiveCardInfo[] emptyArray(){
       if (SocketMessages$SCXStreamLiveCardInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SocketMessages$SCXStreamLiveCardInfo._emptyArray == null) {
             SocketMessages$SCXStreamLiveCardInfo[] sCXStreamLiv = new SocketMessages$SCXStreamLiveCardInfo[0];
             SocketMessages$SCXStreamLiveCardInfo._emptyArray = sCXStreamLiv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SocketMessages$SCXStreamLiveCardInfo._emptyArray;
    }
    public static SocketMessages$SCXStreamLiveCardInfo parseFrom(CodedInputByteBufferNano p0){
       return new SocketMessages$SCXStreamLiveCardInfo().mergeFrom(p0);
    }
    public static SocketMessages$SCXStreamLiveCardInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SocketMessages$SCXStreamLiveCardInfo(), p0);
    }
    public SocketMessages$SCXStreamLiveCardInfo clear(){
       this.id = 0;
       this.title = "";
       this.tag = "";
       this.coverUrl = "";
       this.contentUrl = "";
       this.coverUrls = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cdnUrls = SocketMessages$XStreamLiveCardCoverCdnUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SocketMessages$SCXStreamLiveCardInfo tid = this.id;
       int i1 = 1;
       if (tid - null) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(i1, tid);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.tag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.tag);
       }
       if (!(this.coverUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.coverUrl);
       }
       if (!(this.contentUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.contentUrl);
       }
       tid = this.coverUrls;
       int i2 = 0;
       if (tid != null && tid.length > 0) {
          int i3 = 0;
          int i4 = 0;
          int i5 = 0;
          SocketMessages$SCXStreamLiveCardInfo tcoverUrls = this.coverUrls;
          while (i3 < tcoverUrls.length) {
             object oobject = tcoverUrls[i3];
             if (oobject != null) {
                i5 = i5 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i5 * 1);
       }
       tid = this.cdnUrls;
       if (tid != null && tid.length > 0) {
          tid = this.cdnUrls;
          while (i2 < tid.length) {
             object oobject1 = tid[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SocketMessages$SCXStreamLiveCardInfo mergeFrom(CodedInputByteBufferNano p0){
       SocketMessages$SCXStreamLiveCardInfo tcdnUrls;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         int i1 = 50;
                         if (i != i1) {
                            i1 = 58;
                            if (i != i1) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               tcdnUrls = this.cdnUrls;
                               i2 = (tcdnUrls == null)? 0: tcdnUrls.length;
                               i = i + i2;
                               SocketMessages$XStreamLiveCardCoverCdnUrl[] xStreamLiveC = new SocketMessages$XStreamLiveCardCoverCdnUrl[i];
                               if (i2) {
                                  System.arraycopy(tcdnUrls, 0, xStreamLiveC, 0, i2);
                               }
                               i1 = i - 1;
                               while (i2 < i1) {
                                  xStreamLiveC[i2] = new SocketMessages$XStreamLiveCardCoverCdnUrl();
                                  p0.readMessage(xStreamLiveC[i2]);
                                  p0.readTag();
                                  i2 = i2 + 1;
                               }
                               xStreamLiveC[i2] = new SocketMessages$XStreamLiveCardCoverCdnUrl();
                               p0.readMessage(xStreamLiveC[i2]);
                               this.cdnUrls = xStreamLiveC;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tcdnUrls = this.coverUrls;
                            i2 = (tcdnUrls == null)? 0: tcdnUrls.length;
                            i = i + i2;
                            String[] stringArray = new String[i];
                            if (i2) {
                               System.arraycopy(tcdnUrls, 0, stringArray, 0, i2);
                            }
                            i1 = i - 1;
                            while (i2 < i1) {
                               stringArray[i2] = p0.readString();
                               p0.readTag();
                               i2 = i2 + 1;
                            }
                            stringArray[i2] = p0.readString();
                            this.coverUrls = stringArray;
                         }
                      }else {
                         this.contentUrl = p0.readString();
                      }
                   }else {
                      this.coverUrl = p0.readString();
                   }
                }else {
                   this.tag = p0.readString();
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             this.id = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SocketMessages$SCXStreamLiveCardInfo tid = this.id;
       if (tid - null) {
          p0.writeInt64(1, tid);
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.tag).equals(str)) {
          p0.writeString(3, this.tag);
       }
       if (!(this.coverUrl).equals(str)) {
          p0.writeString(4, this.coverUrl);
       }
       if (!(this.contentUrl).equals(str)) {
          p0.writeString(5, this.contentUrl);
       }
       tid = this.coverUrls;
       int i = 0;
       if (tid != null && tid.length > 0) {
          int i1 = 0;
          SocketMessages$SCXStreamLiveCardInfo tcoverUrls = this.coverUrls;
          while (i1 < tcoverUrls.length) {
             object oobject = tcoverUrls[i1];
             if (oobject != null) {
                p0.writeString(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tid = this.cdnUrls;
       if (tid != null && tid.length > 0) {
          tid = this.cdnUrls;
          while (i < tid.length) {
             object oobject1 = tid[i];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
