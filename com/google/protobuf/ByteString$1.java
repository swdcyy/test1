package com.google.protobuf.ByteString$1;
import com.google.protobuf.ByteString$AbstractByteIterator;
import com.google.protobuf.ByteString;
import java.util.NoSuchElementException;

public class ByteString$1 extends ByteString$AbstractByteIterator	// class@0003ca
{
    public final int limit;
    public int position;
    public final ByteString this$0;

    public void ByteString$1(ByteString p0){
       this.this$0 = p0;
       super();
       this.position = 0;
       this.limit = p0.size();
    }
    public boolean hasNext(){
       boolean b = (this.position < this.limit)? true: false;
       return b;
    }
    public byte nextByte(){
       ByteString$1 tposition = this.position;
       if (tposition >= this.limit) {
          throw new NoSuchElementException();
       }
       this.position = tposition + 1;
       return this.this$0.internalByteAt(tposition);
    }
}
