package com.kuaishou.protobuf.livestream.nano.Item;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class Item extends MessageNano	// class@000c2a
{
    public String name;
    public int type;
    public static Item[] _emptyArray;

    public void Item(){
       super();
       this.clear();
    }
    public static Item[] emptyArray(){
       if (Item._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (Item._emptyArray == null) {
             Item[] itemArray = new Item[0];
             Item._emptyArray = itemArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return Item._emptyArray;
    }
    public static Item parseFrom(CodedInputByteBufferNano p0){
       return new Item().mergeFrom(p0);
    }
    public static Item parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new Item(), p0);
    }
    public Item clear(){
       this.type = 0;
       this.name = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       Item ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public Item mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       Item ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       if (!(this.name).equals("")) {
          p0.writeString(2, this.name);
       }
       super.writeTo(p0);
       return;
    }
}
