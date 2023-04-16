package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$PublishPhotoDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$PublishPhotoDetailPackage extends MessageNano	// class@00146f
{
    public boolean isHdPhoto;
    public int photoType;
    public int step;
    public static ClientTaskDetail$PublishPhotoDetailPackage[] _emptyArray;

    public void ClientTaskDetail$PublishPhotoDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$PublishPhotoDetailPackage[] emptyArray(){
       if (ClientTaskDetail$PublishPhotoDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$PublishPhotoDetailPackage._emptyArray == null) {
             ClientTaskDetail$PublishPhotoDetailPackage[] publishPhoto = new ClientTaskDetail$PublishPhotoDetailPackage[0];
             ClientTaskDetail$PublishPhotoDetailPackage._emptyArray = publishPhoto;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$PublishPhotoDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$PublishPhotoDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$PublishPhotoDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$PublishPhotoDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$PublishPhotoDetailPackage(), p0);
    }
    public ClientTaskDetail$PublishPhotoDetailPackage clear(){
       this.step = 0;
       this.photoType = 0;
       this.isHdPhoto = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$PublishPhotoDetailPackage tstep = this.step;
       if (tstep != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tstep);
       }
       tstep = this.photoType;
       if (tstep != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstep);
       }
       tstep = this.isHdPhoto;
       if (tstep != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tstep);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$PublishPhotoDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.isHdPhoto = p0.readBool();
                }
             }else {
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.photoType = i;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.step = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$PublishPhotoDetailPackage tstep = this.step;
       if (tstep != null) {
          p0.writeInt32(1, tstep);
       }
       tstep = this.photoType;
       if (tstep != null) {
          p0.writeInt32(2, tstep);
       }
       tstep = this.isHdPhoto;
       if (tstep != null) {
          p0.writeBool(3, tstep);
       }
       super.writeTo(p0);
       return;
    }
}
