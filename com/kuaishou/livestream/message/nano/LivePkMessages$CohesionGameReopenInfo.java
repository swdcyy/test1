package com.kuaishou.livestream.message.nano.LivePkMessages$CohesionGameReopenInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LivePkMessages$GiftView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LivePkMessages$CohesionGameReopenInfo extends MessageNano	// class@001211
{
    public String descTextPrefix;
    public String descTextSpecial;
    public String descTextSuffix;
    public LivePkMessages$GiftView[] gift;
    public String inviteRoute;
    public static LivePkMessages$CohesionGameReopenInfo[] _emptyArray;

    public void LivePkMessages$CohesionGameReopenInfo(){
       super();
       this.clear();
    }
    public static LivePkMessages$CohesionGameReopenInfo[] emptyArray(){
       if (LivePkMessages$CohesionGameReopenInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$CohesionGameReopenInfo._emptyArray == null) {
             LivePkMessages$CohesionGameReopenInfo[] uCohesionGam = new LivePkMessages$CohesionGameReopenInfo[0];
             LivePkMessages$CohesionGameReopenInfo._emptyArray = uCohesionGam;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$CohesionGameReopenInfo._emptyArray;
    }
    public static LivePkMessages$CohesionGameReopenInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$CohesionGameReopenInfo().mergeFrom(p0);
    }
    public static LivePkMessages$CohesionGameReopenInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$CohesionGameReopenInfo(), p0);
    }
    public LivePkMessages$CohesionGameReopenInfo clear(){
       this.gift = LivePkMessages$GiftView.emptyArray();
       this.descTextPrefix = "";
       this.descTextSpecial = "";
       this.descTextSuffix = "";
       this.inviteRoute = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePkMessages$CohesionGameReopenInfo tgift = this.gift;
       if (tgift != null && tgift.length > 0) {
          int i1 = 0;
          LivePkMessages$CohesionGameReopenInfo tgift1 = this.gift;
          while (i1 < tgift1.length) {
             object oobject = tgift1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.descTextPrefix).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.descTextPrefix);
       }
       if (!(this.descTextSpecial).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.descTextSpecial);
       }
       if (!(this.descTextSuffix).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.descTextSuffix);
       }
       if (!(this.inviteRoute).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.inviteRoute);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$CohesionGameReopenInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.inviteRoute = p0.readString();
                      }
                   }else {
                      this.descTextSuffix = p0.readString();
                   }
                }else {
                   this.descTextSpecial = p0.readString();
                }
             }else {
                this.descTextPrefix = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LivePkMessages$CohesionGameReopenInfo tgift = this.gift;
             int i2 = (tgift == null)? 0: tgift.length;
             i = i + i2;
             LivePkMessages$GiftView[] giftViewArra = new LivePkMessages$GiftView[i];
             if (i2) {
                System.arraycopy(tgift, 0, giftViewArra, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                giftViewArra[i2] = new LivePkMessages$GiftView();
                p0.readMessage(giftViewArra[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             giftViewArra[i2] = new LivePkMessages$GiftView();
             p0.readMessage(giftViewArra[i2]);
             this.gift = giftViewArra;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePkMessages$CohesionGameReopenInfo tgift = this.gift;
       if (tgift != null && tgift.length > 0) {
          int i = 0;
          LivePkMessages$CohesionGameReopenInfo tgift1 = this.gift;
          while (i < tgift1.length) {
             object oobject = tgift1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.descTextPrefix).equals(str)) {
          p0.writeString(2, this.descTextPrefix);
       }
       if (!(this.descTextSpecial).equals(str)) {
          p0.writeString(3, this.descTextSpecial);
       }
       if (!(this.descTextSuffix).equals(str)) {
          p0.writeString(4, this.descTextSuffix);
       }
       if (!(this.inviteRoute).equals(str)) {
          p0.writeString(5, this.inviteRoute);
       }
       super.writeTo(p0);
       return;
    }
}
