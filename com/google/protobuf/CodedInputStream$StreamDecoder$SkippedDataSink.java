package com.google.protobuf.CodedInputStream$StreamDecoder$SkippedDataSink;
import com.google.protobuf.CodedInputStream$StreamDecoder$RefillCallback;
import com.google.protobuf.CodedInputStream$StreamDecoder;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream;

public class CodedInputStream$StreamDecoder$SkippedDataSink implements CodedInputStream$StreamDecoder$RefillCallback	// class@0003df
{
    public ByteArrayOutputStream byteArrayStream;
    public int lastPos;
    public final CodedInputStream$StreamDecoder this$0;

    public void CodedInputStream$StreamDecoder$SkippedDataSink(CodedInputStream$StreamDecoder p0){
       this.this$0 = p0;
       super();
       this.lastPos = p0.pos;
    }
    public ByteBuffer getSkippedData(){
       CodedInputStream$StreamDecoder$SkippedDataSink tbyteArraySt = this.byteArrayStream;
       if (tbyteArraySt == null) {
          tbyteArraySt = this.this$0;
          CodedInputStream$StreamDecoder$SkippedDataSink tlastPos = this.lastPos;
          return ByteBuffer.wrap(tbyteArraySt.buffer, tlastPos, (tbyteArraySt.pos - tlastPos));
       }else {
          CodedInputStream$StreamDecoder$SkippedDataSink tthis$0 = this.this$0;
          tbyteArraySt.write(tthis$0.buffer, this.lastPos, tthis$0.pos);
          return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
       }
    }
    public void onRefill(){
       if (this.byteArrayStream == null) {
          this.byteArrayStream = new ByteArrayOutputStream();
       }
       CodedInputStream$StreamDecoder$SkippedDataSink tthis$0 = this.this$0;
       CodedInputStream$StreamDecoder$SkippedDataSink tlastPos = this.lastPos;
       this.byteArrayStream.write(tthis$0.buffer, tlastPos, (tthis$0.pos - tlastPos));
       this.lastPos = 0;
       return;
    }
}
