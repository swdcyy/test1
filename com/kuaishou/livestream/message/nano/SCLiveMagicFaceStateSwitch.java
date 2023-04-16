package com.kuaishou.livestream.message.nano.SCLiveMagicFaceStateSwitch;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveMagicFaceStateSwitch extends MessageNano	// class@001432
{
    public long magicFaceId;
    public String magicFaceName;
    public int magicFaceState;
    public static SCLiveMagicFaceStateSwitch[] _emptyArray;

    public void SCLiveMagicFaceStateSwitch(){
       super();
       this.clear();
    }
    public static SCLiveMagicFaceStateSwitch[] emptyArray(){
       if (SCLiveMagicFaceStateSwitch._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMagicFaceStateSwitch._emptyArray == null) {
             SCLiveMagicFaceStateSwitch[] sCLiveMagicF = new SCLiveMagicFaceStateSwitch[0];
             SCLiveMagicFaceStateSwitch._emptyArray = sCLiveMagicF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMagicFaceStateSwitch._emptyArray;
    }
    public static SCLiveMagicFaceStateSwitch parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMagicFaceStateSwitch().mergeFrom(p0);
    }
    public static SCLiveMagicFaceStateSwitch parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMagicFaceStateSwitch(), p0);
    }
    public SCLiveMagicFaceStateSwitch clear(){
       this.magicFaceState = 0;
       this.magicFaceId = 0;
       this.magicFaceName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveMagicFaceStateSwitch tmagicFaceSt = this.magicFaceState;
       if (tmagicFaceSt != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmagicFaceSt);
       }
       tmagicFaceSt = this.magicFaceId;
       if (tmagicFaceSt) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tmagicFaceSt);
       }
       if (!(this.magicFaceName).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.magicFaceName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMagicFaceStateSwitch mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.magicFaceName = p0.readString();
                }
             }else {
                this.magicFaceId = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.magicFaceState = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveMagicFaceStateSwitch tmagicFaceSt = this.magicFaceState;
       if (tmagicFaceSt != null) {
          p0.writeInt32(1, tmagicFaceSt);
       }
       tmagicFaceSt = this.magicFaceId;
       if (tmagicFaceSt) {
          p0.writeUInt64(2, tmagicFaceSt);
       }
       if (!(this.magicFaceName).equals("")) {
          p0.writeString(3, this.magicFaceName);
       }
       super.writeTo(p0);
       return;
    }
}
