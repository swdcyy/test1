package com.kuaishou.protobuf.livestream.nano.GzoneNameplate;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class GzoneNameplate extends MessageNano	// class@000c0d
{
    public long id;
    public String name;
    public UserInfos$PicUrl[] urls;
    public static GzoneNameplate[] _emptyArray;

    public void GzoneNameplate(){
       super();
       this.clear();
    }
    public static GzoneNameplate[] emptyArray(){
       if (GzoneNameplate._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneNameplate._emptyArray == null) {
             GzoneNameplate[] gzoneNamepla = new GzoneNameplate[0];
             GzoneNameplate._emptyArray = gzoneNamepla;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneNameplate._emptyArray;
    }
    public static GzoneNameplate parseFrom(CodedInputByteBufferNano p0){
       return new GzoneNameplate().mergeFrom(p0);
    }
    public static GzoneNameplate parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneNameplate(), p0);
    }
    public GzoneNameplate clear(){
       this.id = 0;
       this.name = "";
       this.urls = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneNameplate tid = this.id;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(1, tid);
       }
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       tid = this.urls;
       if (tid != null && tid.length > 0) {
          int i1 = 0;
          GzoneNameplate turls = this.urls;
          while (i1 < turls.length) {
             object oobject = turls[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneNameplate mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   GzoneNameplate turls = this.urls;
                   int i2 = (turls == null)? 0: turls.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(turls, 0, picUrlArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      picUrlArray[i2] = new UserInfos$PicUrl();
                      p0.readMessage(picUrlArray[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   this.urls = picUrlArray;
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             this.id = p0.readInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneNameplate tid = this.id;
       if (tid) {
          p0.writeInt64(1, tid);
       }
       if (!(this.name).equals("")) {
          p0.writeString(2, this.name);
       }
       tid = this.urls;
       if (tid != null && tid.length > 0) {
          int i = 0;
          GzoneNameplate turls = this.urls;
          while (i < turls.length) {
             object oobject = turls[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
