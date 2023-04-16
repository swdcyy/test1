package com.kuaishou.livestream.message.nano.Widget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.Widget$LoopInfo;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class Widget extends MessageNano	// class@00148c
{
    public String airBubblesText;
    public String clickUrl;
    public String[] iconUrl;
    public Widget$LoopInfo[] loop;
    public String title;
    public String widgetType;
    public static Widget[] _emptyArray;

    public void Widget(){
       super();
       this.clear();
    }
    public static Widget[] emptyArray(){
       if (Widget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (Widget._emptyArray == null) {
             Widget[] widgetArray = new Widget[0];
             Widget._emptyArray = widgetArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return Widget._emptyArray;
    }
    public static Widget parseFrom(CodedInputByteBufferNano p0){
       return new Widget().mergeFrom(p0);
    }
    public static Widget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new Widget(), p0);
    }
    public Widget clear(){
       this.iconUrl = WireFormatNano.EMPTY_STRING_ARRAY;
       this.clickUrl = "";
       this.title = "";
       this.loop = Widget$LoopInfo.emptyArray();
       this.widgetType = "";
       this.airBubblesText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       Widget ticonUrl = this.iconUrl;
       int i1 = 0;
       if (ticonUrl != null && ticonUrl.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          Widget ticonUrl1 = this.iconUrl;
          while (i2 < ticonUrl1.length) {
             object oobject = ticonUrl1[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       if (!(this.clickUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.clickUrl);
       }
       if (!(this.title).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.title);
       }
       ticonUrl = this.loop;
       if (ticonUrl != null && ticonUrl.length > 0) {
          ticonUrl = this.loop;
          while (i1 < ticonUrl.length) {
             object oobject1 = ticonUrl[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.widgetType).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.widgetType);
       }
       if (!(this.airBubblesText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.airBubblesText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public Widget mergeFrom(CodedInputByteBufferNano p0){
       Widget tloop;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.airBubblesText = p0.readString();
                         }
                      }else {
                         this.widgetType = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tloop = this.loop;
                      i2 = (tloop == null)? 0: tloop.length;
                      i = i + i2;
                      Widget$LoopInfo[] loopInfoArra = new Widget$LoopInfo[i];
                      if (i2) {
                         System.arraycopy(tloop, 0, loopInfoArra, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         loopInfoArra[i2] = new Widget$LoopInfo();
                         p0.readMessage(loopInfoArra[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      loopInfoArra[i2] = new Widget$LoopInfo();
                      p0.readMessage(loopInfoArra[i2]);
                      this.loop = loopInfoArra;
                   }
                }else {
                   this.title = p0.readString();
                }
             }else {
                this.clickUrl = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tloop = this.iconUrl;
             i2 = (tloop == null)? 0: tloop.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(tloop, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.iconUrl = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       Widget ticonUrl = this.iconUrl;
       int i = 0;
       if (ticonUrl != null && ticonUrl.length > 0) {
          int i1 = 0;
          Widget ticonUrl1 = this.iconUrl;
          while (i1 < ticonUrl1.length) {
             object oobject = ticonUrl1[i1];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.clickUrl).equals("")) {
          p0.writeString(2, this.clickUrl);
       }
       if (!(this.title).equals("")) {
          p0.writeString(3, this.title);
       }
       ticonUrl = this.loop;
       if (ticonUrl != null && ticonUrl.length > 0) {
          ticonUrl = this.loop;
          while (i < ticonUrl.length) {
             object oobject1 = ticonUrl[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.widgetType).equals("")) {
          p0.writeString(5, this.widgetType);
       }
       if (!(this.airBubblesText).equals("")) {
          p0.writeString(6, this.airBubblesText);
       }
       super.writeTo(p0);
       return;
    }
}
