package com.kuaishou.client.log.event.packages.nano.ClientEvent$ODOTEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public final class ClientEvent$ODOTEvent extends MessageNano	// class@00075d
{
    public Map bizMap;
    public static ClientEvent$ODOTEvent[] _emptyArray;

    public void ClientEvent$ODOTEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$ODOTEvent[] emptyArray(){
       if (ClientEvent$ODOTEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ODOTEvent._emptyArray == null) {
             ClientEvent$ODOTEvent[] oDOTEventArr = new ClientEvent$ODOTEvent[0];
             ClientEvent$ODOTEvent._emptyArray = oDOTEventArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ODOTEvent._emptyArray;
    }
    public static ClientEvent$ODOTEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ODOTEvent().mergeFrom(p0);
    }
    public static ClientEvent$ODOTEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ODOTEvent(), p0);
    }
    public ClientEvent$ODOTEvent clear(){
       this.bizMap = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$ODOTEvent tbizMap = this.bizMap;
       if (tbizMap != null) {
          i = i + InternalNano.computeMapFieldSize(tbizMap, 1, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ODOTEvent mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.bizMap = InternalNano.mergeMapEntry(p0, this.bizMap, mapFactory, 9, 9, null, 10, 18);
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientEvent$ODOTEvent tbizMap = this.bizMap;
       if (tbizMap != null) {
          InternalNano.serializeMapField(p0, tbizMap, 1, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
