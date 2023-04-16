package com.kuaishou.client.log.stat.packages.nano.ClientStat$ImageDisplayStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.System;

public final class ClientStat$ImageDisplayStatEvent extends MessageNano	// class@0007d5
{
    public int businessType;
    public int displayResult;
    public boolean displayStatus;
    public String error;
    public String extraMessage;
    public String feedType;
    public String host;
    public String lastProcedure;
    public String[] multiUrls;
    public String photoId;
    public float ratio;
    public long requestStart;
    public String sessionId;
    public long totalCost;
    public String url;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientStat$ImageDisplayStatEvent[] _emptyArray;

    public void ClientStat$ImageDisplayStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$ImageDisplayStatEvent[] emptyArray(){
       if (ClientStat$ImageDisplayStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$ImageDisplayStatEvent._emptyArray == null) {
             ClientStat$ImageDisplayStatEvent[] imageDisplay = new ClientStat$ImageDisplayStatEvent[0];
             ClientStat$ImageDisplayStatEvent._emptyArray = imageDisplay;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$ImageDisplayStatEvent._emptyArray;
    }
    public static ClientStat$ImageDisplayStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$ImageDisplayStatEvent().mergeFrom(p0);
    }
    public static ClientStat$ImageDisplayStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$ImageDisplayStatEvent(), p0);
    }
    public ClientStat$ImageDisplayStatEvent clear(){
       this.sessionId = "";
       this.photoId = "";
       this.feedType = "";
       this.host = "";
       this.url = "";
       this.multiUrls = WireFormatNano.EMPTY_STRING_ARRAY;
       this.lastProcedure = "";
       this.displayStatus = false;
       this.totalCost = 0;
       this.requestStart = 0;
       this.error = "";
       this.extraMessage = "";
       this.ratio = 0;
       this.businessType = 0;
       this.urlPackage = null;
       this.displayResult = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       int i1 = 1;
       if (!(this.sessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.sessionId);
       }
       if (!(this.photoId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.photoId);
       }
       if (!(this.feedType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.feedType);
       }
       if (!(this.host).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.host);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.url);
       }
       ClientStat$ImageDisplayStatEvent tmultiUrls = this.multiUrls;
       if (tmultiUrls != null && tmultiUrls.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          ClientStat$ImageDisplayStatEvent tmultiUrls1 = this.multiUrls;
          while (i2 < tmultiUrls1.length) {
             object oobject = tmultiUrls1[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       if (!(this.lastProcedure).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.lastProcedure);
       }
       tmultiUrls = this.displayStatus;
       if (tmultiUrls != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tmultiUrls);
       }
       ClientStat$ImageDisplayStatEvent ttotalCost = this.totalCost;
       if (ttotalCost) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, ttotalCost);
       }
       ttotalCost = this.requestStart;
       if (ttotalCost) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, ttotalCost);
       }
       if (!(this.error).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.error);
       }
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.extraMessage);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(13, this.ratio);
       }
       tmultiUrls = this.businessType;
       if (tmultiUrls != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, tmultiUrls);
       }
       tmultiUrls = this.urlPackage;
       if (tmultiUrls != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(15, tmultiUrls);
       }
       tmultiUrls = this.displayResult;
       if (tmultiUrls != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tmultiUrls);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$ImageDisplayStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          ClientStat$ImageDisplayStatEvent imageDisplay = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.sessionId = p0.readString();
                break;
              case 18:
                this.photoId = p0.readString();
                break;
              case 26:
                this.feedType = p0.readString();
                break;
              case '"':
                this.host = p0.readString();
                break;
              case '*':
                this.url = p0.readString();
                break;
              case '2':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 50);
                imageDisplay = this.multiUrls;
                int i1 = (imageDisplay == null)? 0: imageDisplay.length;
                i = i + i1;
                String[] stringArray = new String[i];
                if (i1) {
                   System.arraycopy(imageDisplay, 0, stringArray, 0, i1);
                }
                int i2 = i - 1;
                while (i1 < i2) {
                   stringArray[i1] = p0.readString();
                   p0.readTag();
                   i1 = i1 + 1;
                }
                stringArray[i1] = p0.readString();
                this.multiUrls = stringArray;
                break;
              case ':':
                this.lastProcedure = p0.readString();
                break;
              case '@':
                this.displayStatus = p0.readBool();
                break;
              case 'H':
                this.totalCost = p0.readUInt64();
                break;
              case 'P':
                this.requestStart = p0.readUInt64();
                break;
              case 'Z':
                this.error = p0.readString();
                break;
              case 'b':
                this.extraMessage = p0.readString();
                break;
              case 'm':
                this.ratio = p0.readFloat();
                break;
              case 'p':
                i = p0.readInt32();
                if (i && i != imageDisplay) {
                   continue ;
                }else {
                   this.businessType = i;
                }
                break;
              case 'z':
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case 128:
                i = p0.readInt32();
                if (i && (i != imageDisplay && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.displayResult = i;
                }
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$ImageDisplayStatEvent tmultiUrls1;
       String str = "";
       if (!(this.sessionId).equals(str)) {
          p0.writeString(1, this.sessionId);
       }
       if (!(this.photoId).equals(str)) {
          p0.writeString(2, this.photoId);
       }
       if (!(this.feedType).equals(str)) {
          p0.writeString(3, this.feedType);
       }
       if (!(this.host).equals(str)) {
          p0.writeString(4, this.host);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(5, this.url);
       }
       ClientStat$ImageDisplayStatEvent tmultiUrls = this.multiUrls;
       if (tmultiUrls != null && tmultiUrls.length > 0) {
          int i = 0;
          tmultiUrls1 = this.multiUrls;
          while (i < tmultiUrls1.length) {
             object oobject = tmultiUrls1[i];
             if (oobject != null) {
                p0.writeString(6, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.lastProcedure).equals(str)) {
          p0.writeString(7, this.lastProcedure);
       }
       tmultiUrls = this.displayStatus;
       if (tmultiUrls != null) {
          p0.writeBool(8, tmultiUrls);
       }
       tmultiUrls1 = this.totalCost;
       if (tmultiUrls1) {
          p0.writeUInt64(9, tmultiUrls1);
       }
       tmultiUrls1 = this.requestStart;
       if (tmultiUrls1) {
          p0.writeUInt64(10, tmultiUrls1);
       }
       if (!(this.error).equals(str)) {
          p0.writeString(11, this.error);
       }
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(12, this.extraMessage);
       }
       if (Float.floatToIntBits(this.ratio) != Float.floatToIntBits(0)) {
          p0.writeFloat(13, this.ratio);
       }
       tmultiUrls = this.businessType;
       if (tmultiUrls != null) {
          p0.writeInt32(14, tmultiUrls);
       }
       tmultiUrls = this.urlPackage;
       if (tmultiUrls != null) {
          p0.writeMessage(15, tmultiUrls);
       }
       tmultiUrls = this.displayResult;
       if (tmultiUrls != null) {
          p0.writeInt32(16, tmultiUrls);
       }
       super.writeTo(p0);
       return;
    }
}
