package com.kuaishou.protobuf.gamezone.gameinteractive.nano.AppUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class AppUserInfo extends MessageNano	// class@000ba4
{
    public String areaName;
    public String gameUserId;
    public String header;
    public String roleName;
    public static AppUserInfo[] _emptyArray;

    public void AppUserInfo(){
       super();
       this.clear();
    }
    public static AppUserInfo[] emptyArray(){
       if (AppUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (AppUserInfo._emptyArray == null) {
             AppUserInfo[] uAppUserInfo = new AppUserInfo[0];
             AppUserInfo._emptyArray = uAppUserInfo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return AppUserInfo._emptyArray;
    }
    public static AppUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new AppUserInfo().mergeFrom(p0);
    }
    public static AppUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new AppUserInfo(), p0);
    }
    public AppUserInfo clear(){
       this.gameUserId = "";
       this.areaName = "";
       this.roleName = "";
       this.header = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.gameUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.gameUserId);
       }
       if (!(this.areaName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.areaName);
       }
       if (!(this.roleName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.roleName);
       }
       if (!(this.header).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.header);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public AppUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.header = p0.readString();
                   }
                }else {
                   this.roleName = p0.readString();
                }
             }else {
                this.areaName = p0.readString();
             }
          }else {
             this.gameUserId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.gameUserId).equals(str)) {
          p0.writeString(1, this.gameUserId);
       }
       if (!(this.areaName).equals(str)) {
          p0.writeString(2, this.areaName);
       }
       if (!(this.roleName).equals(str)) {
          p0.writeString(3, this.roleName);
       }
       if (!(this.header).equals(str)) {
          p0.writeString(4, this.header);
       }
       super.writeTo(p0);
       return;
    }
}
