package com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyEntranceHide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneAccompanyEntranceHide extends MessageNano	// class@000bcb
{
    public static SCGzoneAccompanyEntranceHide[] _emptyArray;

    public void SCGzoneAccompanyEntranceHide(){
       super();
       this.clear();
    }
    public static SCGzoneAccompanyEntranceHide[] emptyArray(){
       if (SCGzoneAccompanyEntranceHide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneAccompanyEntranceHide._emptyArray == null) {
             SCGzoneAccompanyEntranceHide[] sCGzoneAccom = new SCGzoneAccompanyEntranceHide[0];
             SCGzoneAccompanyEntranceHide._emptyArray = sCGzoneAccom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneAccompanyEntranceHide._emptyArray;
    }
    public static SCGzoneAccompanyEntranceHide parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneAccompanyEntranceHide().mergeFrom(p0);
    }
    public static SCGzoneAccompanyEntranceHide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneAccompanyEntranceHide(), p0);
    }
    public SCGzoneAccompanyEntranceHide clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneAccompanyEntranceHide mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
