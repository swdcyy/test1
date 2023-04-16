package com.google.protobuf.GeneratedMessageLite$ExtendableMessage$ExtensionWriter;
import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.lang.Object;
import java.util.Iterator;
import com.google.protobuf.FieldSet;
import java.util.Map$Entry;
import com.google.protobuf.GeneratedMessageLite$1;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.MessageLite;
import com.google.protobuf.FieldSet$FieldDescriptorLite;

public class GeneratedMessageLite$ExtendableMessage$ExtensionWriter	// class@000435
{
    public final Iterator iter;
    public final boolean messageSetWireFormat;
    public Map$Entry next;
    public final GeneratedMessageLite$ExtendableMessage this$0;

    public void GeneratedMessageLite$ExtendableMessage$ExtensionWriter(GeneratedMessageLite$ExtendableMessage p0,boolean p1){
       this.this$0 = p0;
       super();
       Iterator iterator = p0.extensions.iterator();
       this.iter = iterator;
       if (iterator.hasNext()) {
          this.next = iterator.next();
       }
       this.messageSetWireFormat = p1;
       return;
    }
    public void GeneratedMessageLite$ExtendableMessage$ExtensionWriter(GeneratedMessageLite$ExtendableMessage p0,boolean p1,GeneratedMessageLite$1 p2){
       super(p0, p1);
    }
    public void writeUntil(int p0,CodedOutputStream p1){
       GeneratedMessageLite$ExtendableMessage$ExtensionWriter tnext = this.next;
       while (tnext != null && tnext.getKey().getNumber() < p0) {
          GeneratedMessageLite$ExtensionDescriptor key = this.next.getKey();
          if (this.messageSetWireFormat != null && (key.getLiteJavaType() == WireFormat$JavaType.MESSAGE && !key.isRepeated())) {
             p1.writeMessageSetExtension(key.getNumber(), this.next.getValue());
          }else {
             FieldSet.writeField(key, this.next.getValue(), p1);
          }
          if (this.iter.hasNext()) {
             this.next = this.iter.next();
          }else {
             this.next = null;
          }
       }
       return;
    }
}
