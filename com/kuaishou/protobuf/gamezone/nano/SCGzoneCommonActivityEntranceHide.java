package com.kuaishou.protobuf.gamezone.nano.SCGzoneCommonActivityEntranceHide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneCommonActivityEntranceHide extends MessageNano	// class@000bd1
{
    public static SCGzoneCommonActivityEntranceHide[] _emptyArray;

    public void SCGzoneCommonActivityEntranceHide(){
       super();
       this.clear();
    }
    public static SCGzoneCommonActivityEntranceHide[] emptyArray(){
       if (SCGzoneCommonActivityEntranceHide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneCommonActivityEntranceHide._emptyArray == null) {
             SCGzoneCommonActivityEntranceHide[] sCGzoneCommo = new SCGzoneCommonActivityEntranceHide[0];
             SCGzoneCommonActivityEntranceHide._emptyArray = sCGzoneCommo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneCommonActivityEntranceHide._emptyArray;
    }
    public static SCGzoneCommonActivityEntranceHide parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneCommonActivityEntranceHide().mergeFrom(p0);
    }
    public static SCGzoneCommonActivityEntranceHide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneCommonActivityEntranceHide(), p0);
    }
    public SCGzoneCommonActivityEntranceHide clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneCommonActivityEntranceHide mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
