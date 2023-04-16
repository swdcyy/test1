package com.kwai.video.clipkit.model.nano.ClipkitSdk$ClipKitBackgroundVideo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;

public final class ClipkitSdk$ClipKitBackgroundVideo extends MessageNano	// class@001a95
{
    public long assetId;
    public int blendMode;
    public double duration;
    public String fileName;
    public String fullPath;
    public int height;
    public int renderOrder;
    public boolean restoreAlpha;
    public int type;
    public int width;
    public static ClipkitSdk$ClipKitBackgroundVideo[] _emptyArray;

    public void ClipkitSdk$ClipKitBackgroundVideo(){
       super();
       this.clear();
    }
    public static ClipkitSdk$ClipKitBackgroundVideo[] emptyArray(){
       if (ClipkitSdk$ClipKitBackgroundVideo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClipkitSdk$ClipKitBackgroundVideo._emptyArray == null) {
             ClipkitSdk$ClipKitBackgroundVideo[] uClipKitBack = new ClipkitSdk$ClipKitBackgroundVideo[0];
             ClipkitSdk$ClipKitBackgroundVideo._emptyArray = uClipKitBack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClipkitSdk$ClipKitBackgroundVideo._emptyArray;
    }
    public static ClipkitSdk$ClipKitBackgroundVideo parseFrom(CodedInputByteBufferNano p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipkitSdk$ClipKitBackgroundVideo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ClipkitSdk$ClipKitBackgroundVideo().mergeFrom(p0);
    }
    public static ClipkitSdk$ClipKitBackgroundVideo parseFrom(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ClipkitSdk$ClipKitBackgroundVideo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MessageNano.mergeFrom(new ClipkitSdk$ClipKitBackgroundVideo(), p0);
    }
    public ClipkitSdk$ClipKitBackgroundVideo clear(){
       this.blendMode = 0;
       this.renderOrder = 0;
       this.duration = 0;
       this.width = 0;
       this.height = 0;
       this.restoreAlpha = false;
       this.fileName = "";
       this.fullPath = "";
       this.assetId = 0;
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       Object obj = PatchProxy.apply(null, this, ClipkitSdk$ClipKitBackgroundVideo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = super.computeSerializedSize();
       ClipkitSdk$ClipKitBackgroundVideo tblendMode = this.blendMode;
       if (tblendMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tblendMode);
       }
       tblendMode = this.renderOrder;
       if (tblendMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tblendMode);
       }
       if (Double.doubleToLongBits(this.duration) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(4, this.duration);
       }
       tblendMode = this.width;
       if (tblendMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tblendMode);
       }
       tblendMode = this.height;
       if (tblendMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tblendMode);
       }
       tblendMode = this.restoreAlpha;
       if (tblendMode != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tblendMode);
       }
       String str = "";
       if (!(this.fileName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.fileName);
       }
       if (!(this.fullPath).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.fullPath);
       }
       tblendMode = this.assetId;
       if (tblendMode) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tblendMode);
       }
       tblendMode = this.type;
       if (tblendMode != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tblendMode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClipkitSdk$ClipKitBackgroundVideo mergeFrom(CodedInputByteBufferNano p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipkitSdk$ClipKitBackgroundVideo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 16:
                this.blendMode = p0.readInt32();
                break;
              case 24:
                this.renderOrder = p0.readInt32();
                break;
              case '!':
                this.duration = p0.readDouble();
                break;
              case '(':
                this.width = p0.readInt32();
                break;
              case '0':
                this.height = p0.readInt32();
                break;
              case '8':
                this.restoreAlpha = p0.readBool();
                break;
              case 'B':
                this.fileName = p0.readString();
                break;
              case 'J':
                this.fullPath = p0.readString();
                break;
              case 'P':
                this.assetId = p0.readUInt64();
                break;
              case 'X':
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.type = i;
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
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipkitSdk$ClipKitBackgroundVideo.class, "1")) {
          return;
       }
       ClipkitSdk$ClipKitBackgroundVideo tblendMode = this.blendMode;
       if (tblendMode != null) {
          p0.writeInt32(2, tblendMode);
       }
       tblendMode = this.renderOrder;
       if (tblendMode != null) {
          p0.writeInt32(3, tblendMode);
       }
       if (Double.doubleToLongBits(this.duration) - Double.doubleToLongBits(0)) {
          p0.writeDouble(4, this.duration);
       }
       tblendMode = this.width;
       if (tblendMode != null) {
          p0.writeInt32(5, tblendMode);
       }
       tblendMode = this.height;
       if (tblendMode != null) {
          p0.writeInt32(6, tblendMode);
       }
       tblendMode = this.restoreAlpha;
       if (tblendMode != null) {
          p0.writeBool(7, tblendMode);
       }
       String str = "";
       if (!(this.fileName).equals(str)) {
          p0.writeString(8, this.fileName);
       }
       if (!(this.fullPath).equals(str)) {
          p0.writeString(9, this.fullPath);
       }
       tblendMode = this.assetId;
       if (tblendMode) {
          p0.writeUInt64(10, tblendMode);
       }
       tblendMode = this.type;
       if (tblendMode != null) {
          p0.writeInt32(11, tblendMode);
       }
       super.writeTo(p0);
       return;
    }
}
