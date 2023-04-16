package com.kuaishou.livestream.message.nano.SCLiveControlFile;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveControlFile extends MessageNano	// class@001417
{
    public static SCLiveControlFile[] _emptyArray;

    public void SCLiveControlFile(){
       super();
       this.clear();
    }
    public static SCLiveControlFile[] emptyArray(){
       if (SCLiveControlFile._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveControlFile._emptyArray == null) {
             SCLiveControlFile[] sCLiveContro = new SCLiveControlFile[0];
             SCLiveControlFile._emptyArray = sCLiveContro;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveControlFile._emptyArray;
    }
    public static SCLiveControlFile parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveControlFile().mergeFrom(p0);
    }
    public static SCLiveControlFile parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveControlFile(), p0);
    }
    public SCLiveControlFile clear(){
       this.cachedSize = -1;
       return this;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveControlFile mergeFrom(CodedInputByteBufferNano p0){
       int i;
       do {
          i = p0.readTag();
       } while (!i || !WireFormatNano.parseUnknownField(p0, i));
       return this;
    }
}
