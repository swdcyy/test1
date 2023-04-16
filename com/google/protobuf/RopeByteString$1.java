package com.google.protobuf.RopeByteString$1;
import com.google.protobuf.ByteString$AbstractByteIterator;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.RopeByteString$PieceIterator;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$ByteIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import com.google.protobuf.ByteString$LeafByteString;

public class RopeByteString$1 extends ByteString$AbstractByteIterator	// class@0004a1
{
    public ByteString$ByteIterator current;
    public final RopeByteString$PieceIterator pieces;
    public final RopeByteString this$0;

    public void RopeByteString$1(RopeByteString p0){
       this.this$0 = p0;
       super();
       this.pieces = new RopeByteString$PieceIterator(p0, null);
       this.current = this.nextPiece();
    }
    public boolean hasNext(){
       boolean b = (this.current != null)? true: false;
       return b;
    }
    public byte nextByte(){
       RopeByteString$1 tcurrent = this.current;
       if (tcurrent == null) {
          throw new NoSuchElementException();
       }
       byte b = tcurrent.nextByte();
       if (!this.current.hasNext()) {
          this.current = this.nextPiece();
       }
       return b;
    }
    public final ByteString$ByteIterator nextPiece(){
       ByteString$ByteIterator uByteIterato = (this.pieces.hasNext())? this.pieces.next().iterator(): null;
       return uByteIterato;
    }
}
