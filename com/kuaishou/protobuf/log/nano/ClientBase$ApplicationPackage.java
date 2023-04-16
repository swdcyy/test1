package com.kuaishou.protobuf.log.nano.ClientBase$ApplicationPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$ApplicationPackage extends MessageNano	// class@000dd5
{
    public String name;
    public String packageName;
    public boolean running;
    public boolean system;
    public int versionCode;
    public String versionName;
    public static ClientBase$ApplicationPackage[] _emptyArray;

    public void ClientBase$ApplicationPackage(){
       super();
       this.clear();
    }
    public static ClientBase$ApplicationPackage[] emptyArray(){
       if (ClientBase$ApplicationPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$ApplicationPackage._emptyArray == null) {
             ClientBase$ApplicationPackage[] uApplication = new ClientBase$ApplicationPackage[0];
             ClientBase$ApplicationPackage._emptyArray = uApplication;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$ApplicationPackage._emptyArray;
    }
    public static ClientBase$ApplicationPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$ApplicationPackage().mergeFrom(p0);
    }
    public static ClientBase$ApplicationPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$ApplicationPackage(), p0);
    }
    public ClientBase$ApplicationPackage clear(){
       this.packageName = "";
       this.name = "";
       this.versionName = "";
       this.versionCode = 0;
       this.system = false;
       this.running = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.packageName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.packageName);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       if (!(this.versionName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.versionName);
       }
       ClientBase$ApplicationPackage tversionCode = this.versionCode;
       if (tversionCode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tversionCode);
       }
       tversionCode = this.system;
       if (tversionCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tversionCode);
       }
       tversionCode = this.running;
       if (tversionCode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tversionCode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$ApplicationPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.running = p0.readBool();
                         }
                      }else {
                         this.system = p0.readBool();
                      }
                   }else {
                      this.versionCode = p0.readInt32();
                   }
                }else {
                   this.versionName = p0.readString();
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             this.packageName = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.packageName).equals(str)) {
          p0.writeString(1, this.packageName);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       if (!(this.versionName).equals(str)) {
          p0.writeString(3, this.versionName);
       }
       ClientBase$ApplicationPackage tversionCode = this.versionCode;
       if (tversionCode != null) {
          p0.writeInt32(4, tversionCode);
       }
       tversionCode = this.system;
       if (tversionCode != null) {
          p0.writeBool(5, tversionCode);
       }
       tversionCode = this.running;
       if (tversionCode != null) {
          p0.writeBool(6, tversionCode);
       }
       super.writeTo(p0);
       return;
    }
}
