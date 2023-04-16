package com.kuaishou.livestream.message.nano.LiveWebViewMessages$SCLiveWebViewDisplay;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveWebViewMessages$SCLiveWebViewDisplay extends MessageNano	// class@0013d7
{
    public long autoCloseDuration;
    public boolean disableManualClose;
    public long height;
    public float heightRatio;
    public String id;
    public String liveStreamId;
    public String url;
    public int webViewType;
    public static LiveWebViewMessages$SCLiveWebViewDisplay[] _emptyArray;

    public void LiveWebViewMessages$SCLiveWebViewDisplay(){
       super();
       this.clear();
    }
    public static LiveWebViewMessages$SCLiveWebViewDisplay[] emptyArray(){
       if (LiveWebViewMessages$SCLiveWebViewDisplay._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveWebViewMessages$SCLiveWebViewDisplay._emptyArray == null) {
             LiveWebViewMessages$SCLiveWebViewDisplay[] sCLiveWebVie = new LiveWebViewMessages$SCLiveWebViewDisplay[0];
             LiveWebViewMessages$SCLiveWebViewDisplay._emptyArray = sCLiveWebVie;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveWebViewMessages$SCLiveWebViewDisplay._emptyArray;
    }
    public static LiveWebViewMessages$SCLiveWebViewDisplay parseFrom(CodedInputByteBufferNano p0){
       return new LiveWebViewMessages$SCLiveWebViewDisplay().mergeFrom(p0);
    }
    public static LiveWebViewMessages$SCLiveWebViewDisplay parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveWebViewMessages$SCLiveWebViewDisplay(), p0);
    }
    public LiveWebViewMessages$SCLiveWebViewDisplay clear(){
       this.id = "";
       this.liveStreamId = "";
       this.url = "";
       this.height = 0;
       this.autoCloseDuration = 0;
       this.webViewType = 0;
       this.disableManualClose = false;
       this.heightRatio = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.url);
       }
       LiveWebViewMessages$SCLiveWebViewDisplay theight = this.height;
       int i1 = 0;
       if (theight - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, theight);
       }
       theight = this.autoCloseDuration;
       if (theight - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, theight);
       }
       theight = this.webViewType;
       if (theight != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, theight);
       }
       theight = this.disableManualClose;
       if (theight != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, theight);
       }
       if (Float.floatToIntBits(this.heightRatio) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(8, this.heightRatio);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveWebViewMessages$SCLiveWebViewDisplay mergeFrom(CodedInputByteBufferNano p0){
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
                            if (i != 56) {
                               if (i != 69) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.heightRatio = p0.readFloat();
                               }
                            }else {
                               this.disableManualClose = p0.readBool();
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && i != 1) {
                               continue ;
                            }else {
                               this.webViewType = i;
                            }
                         }
                      }else {
                         this.autoCloseDuration = p0.readUInt64();
                      }
                   }else {
                      this.height = p0.readUInt64();
                   }
                }else {
                   this.url = p0.readString();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(3, this.url);
       }
       LiveWebViewMessages$SCLiveWebViewDisplay theight = this.height;
       int i = 0;
       if (theight - i) {
          p0.writeUInt64(4, theight);
       }
       theight = this.autoCloseDuration;
       if (theight - i) {
          p0.writeUInt64(5, theight);
       }
       theight = this.webViewType;
       if (theight != null) {
          p0.writeInt32(6, theight);
       }
       theight = this.disableManualClose;
       if (theight != null) {
          p0.writeBool(7, theight);
       }
       if (Float.floatToIntBits(this.heightRatio) != Float.floatToIntBits(0)) {
          p0.writeFloat(8, this.heightRatio);
       }
       super.writeTo(p0);
       return;
    }
}
