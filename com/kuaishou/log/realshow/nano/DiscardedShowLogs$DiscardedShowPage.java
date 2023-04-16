package com.kuaishou.log.realshow.nano.DiscardedShowLogs$DiscardedShowPage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.DiscardedShowLogs$DiscardedShowFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class DiscardedShowLogs$DiscardedShowPage extends MessageNano	// class@0014a9
{
    public DiscardedShowLogs$DiscardedShowFeed[] feed;
    public long llsid;
    public static DiscardedShowLogs$DiscardedShowPage[] _emptyArray;

    public void DiscardedShowLogs$DiscardedShowPage(){
       super();
       this.clear();
    }
    public static DiscardedShowLogs$DiscardedShowPage[] emptyArray(){
       if (DiscardedShowLogs$DiscardedShowPage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (DiscardedShowLogs$DiscardedShowPage._emptyArray == null) {
             DiscardedShowLogs$DiscardedShowPage[] uDiscardedSh = new DiscardedShowLogs$DiscardedShowPage[0];
             DiscardedShowLogs$DiscardedShowPage._emptyArray = uDiscardedSh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return DiscardedShowLogs$DiscardedShowPage._emptyArray;
    }
    public static DiscardedShowLogs$DiscardedShowPage parseFrom(CodedInputByteBufferNano p0){
       return new DiscardedShowLogs$DiscardedShowPage().mergeFrom(p0);
    }
    public static DiscardedShowLogs$DiscardedShowPage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new DiscardedShowLogs$DiscardedShowPage(), p0);
    }
    public DiscardedShowLogs$DiscardedShowPage clear(){
       this.llsid = 0;
       this.feed = DiscardedShowLogs$DiscardedShowFeed.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       DiscardedShowLogs$DiscardedShowPage tllsid = this.llsid;
       if (tllsid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tllsid);
       }
       tllsid = this.feed;
       if (tllsid != null && tllsid.length > 0) {
          int i1 = 0;
          DiscardedShowLogs$DiscardedShowPage tuDiscardedS = this.feed;
          while (i1 < tuDiscardedS.length) {
             object oobject = tuDiscardedS[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public DiscardedShowLogs$DiscardedShowPage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                DiscardedShowLogs$DiscardedShowPage tuDiscardedS = this.feed;
                int i2 = (tuDiscardedS == null)? 0: tuDiscardedS.length;
                i = i + i2;
                DiscardedShowLogs$DiscardedShowFeed[] uDiscardedSh = new DiscardedShowLogs$DiscardedShowFeed[i];
                if (i2) {
                   System.arraycopy(tuDiscardedS, 0, uDiscardedSh, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uDiscardedSh[i2] = new DiscardedShowLogs$DiscardedShowFeed();
                   p0.readMessage(uDiscardedSh[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uDiscardedSh[i2] = new DiscardedShowLogs$DiscardedShowFeed();
                p0.readMessage(uDiscardedSh[i2]);
                this.feed = uDiscardedSh;
             }
          }else {
             this.llsid = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       DiscardedShowLogs$DiscardedShowPage tllsid = this.llsid;
       if (tllsid) {
          p0.writeUInt64(1, tllsid);
       }
       tllsid = this.feed;
       if (tllsid != null && tllsid.length > 0) {
          int i = 0;
          DiscardedShowLogs$DiscardedShowPage tuDiscardedS = this.feed;
          while (i < tuDiscardedS.length) {
             object oobject = tuDiscardedS[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
