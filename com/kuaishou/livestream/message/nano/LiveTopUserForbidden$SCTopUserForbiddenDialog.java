package com.kuaishou.livestream.message.nano.LiveTopUserForbidden$SCTopUserForbiddenDialog;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveTopUserForbidden$SCTopUserForbiddenDialog extends MessageNano	// class@0013a4
{
    public int actionType;
    public String button;
    public String desc;
    public String helpRouteUrl;
    public String liveStreamId;
    public String title;
    public long userId;
    public static LiveTopUserForbidden$SCTopUserForbiddenDialog[] _emptyArray;

    public void LiveTopUserForbidden$SCTopUserForbiddenDialog(){
       super();
       this.clear();
    }
    public static LiveTopUserForbidden$SCTopUserForbiddenDialog[] emptyArray(){
       if (LiveTopUserForbidden$SCTopUserForbiddenDialog._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTopUserForbidden$SCTopUserForbiddenDialog._emptyArray == null) {
             LiveTopUserForbidden$SCTopUserForbiddenDialog[] sCTopUserFor = new LiveTopUserForbidden$SCTopUserForbiddenDialog[0];
             LiveTopUserForbidden$SCTopUserForbiddenDialog._emptyArray = sCTopUserFor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTopUserForbidden$SCTopUserForbiddenDialog._emptyArray;
    }
    public static LiveTopUserForbidden$SCTopUserForbiddenDialog parseFrom(CodedInputByteBufferNano p0){
       return new LiveTopUserForbidden$SCTopUserForbiddenDialog().mergeFrom(p0);
    }
    public static LiveTopUserForbidden$SCTopUserForbiddenDialog parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTopUserForbidden$SCTopUserForbiddenDialog(), p0);
    }
    public LiveTopUserForbidden$SCTopUserForbiddenDialog clear(){
       this.liveStreamId = "";
       this.userId = 0;
       this.title = "";
       this.desc = "";
       this.button = "";
       this.helpRouteUrl = "";
       this.actionType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       LiveTopUserForbidden$SCTopUserForbiddenDialog tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tuserId);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.title);
       }
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.desc);
       }
       if (!(this.button).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.button);
       }
       if (!(this.helpRouteUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.helpRouteUrl);
       }
       LiveTopUserForbidden$SCTopUserForbiddenDialog tactionType = this.actionType;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tactionType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTopUserForbidden$SCTopUserForbiddenDialog mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && i != 1) {
                                  continue ;
                               }else {
                                  this.actionType = i;
                               }
                            }
                         }else {
                            this.helpRouteUrl = p0.readString();
                         }
                      }else {
                         this.button = p0.readString();
                      }
                   }else {
                      this.desc = p0.readString();
                   }
                }else {
                   this.title = p0.readString();
                }
             }else {
                this.userId = p0.readInt64();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       LiveTopUserForbidden$SCTopUserForbiddenDialog tuserId = this.userId;
       if (tuserId) {
          p0.writeInt64(2, tuserId);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(3, this.title);
       }
       if (!(this.desc).equals(str)) {
          p0.writeString(4, this.desc);
       }
       if (!(this.button).equals(str)) {
          p0.writeString(5, this.button);
       }
       if (!(this.helpRouteUrl).equals(str)) {
          p0.writeString(6, this.helpRouteUrl);
       }
       LiveTopUserForbidden$SCTopUserForbiddenDialog tactionType = this.actionType;
       if (tactionType != null) {
          p0.writeInt32(7, tactionType);
       }
       super.writeTo(p0);
       return;
    }
}
