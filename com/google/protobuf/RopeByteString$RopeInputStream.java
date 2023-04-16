package com.google.protobuf.RopeByteString$RopeInputStream;
import java.io.InputStream;
import com.google.protobuf.RopeByteString;
import com.google.protobuf.RopeByteString$PieceIterator;
import com.google.protobuf.ByteString$LeafByteString;
import com.google.protobuf.ByteString;
import com.google.protobuf.RopeByteString$1;
import java.lang.Object;
import java.util.Objects;
import java.lang.IndexOutOfBoundsException;
import java.lang.Math;

public class RopeByteString$RopeInputStream extends InputStream	// class@0004a4
{
    public ByteString$LeafByteString currentPiece;
    public int currentPieceIndex;
    public int currentPieceOffsetInRope;
    public int currentPieceSize;
    public int mark;
    public RopeByteString$PieceIterator pieceIterator;
    public final RopeByteString this$0;

    public void RopeByteString$RopeInputStream(RopeByteString p0){
       this.this$0 = p0;
       super();
       this.initialize();
    }
    public final void advanceIfCurrentPieceFullyRead(){
       if (this.currentPiece != null) {
          RopeByteString$RopeInputStream tcurrentPiec = this.currentPieceSize;
          if (this.currentPieceIndex == tcurrentPiec) {
             this.currentPieceOffsetInRope = this.currentPieceOffsetInRope + tcurrentPiec;
             int i = 0;
             this.currentPieceIndex = i;
             if (this.pieceIterator.hasNext()) {
                ByteString$LeafByteString leafByteStri = this.pieceIterator.next();
                this.currentPiece = leafByteStri;
                this.currentPieceSize = leafByteStri.size();
             }else {
                this.currentPiece = null;
                this.currentPieceSize = i;
             }
          }
       }
       return;
    }
    public int available(){
       return (this.this$0.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex));
    }
    public final void initialize(){
       RopeByteString$PieceIterator pieceIterato = new RopeByteString$PieceIterator(this.this$0, null);
       this.pieceIterator = pieceIterato;
       ByteString$LeafByteString leafByteStri = pieceIterato.next();
       this.currentPiece = leafByteStri;
       this.currentPieceSize = leafByteStri.size();
       this.currentPieceIndex = 0;
       this.currentPieceOffsetInRope = 0;
    }
    public void mark(int p0){
       this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
    }
    public boolean markSupported(){
       return true;
    }
    public int read(){
       this.advanceIfCurrentPieceFullyRead();
       RopeByteString$RopeInputStream tcurrentPiec = this.currentPiece;
       if (tcurrentPiec == null) {
          return -1;
       }
       RopeByteString$RopeInputStream tcurrentPiec1 = this.currentPieceIndex;
       this.currentPieceIndex = tcurrentPiec1 + 1;
       return (tcurrentPiec.byteAt(tcurrentPiec1) & 0x00ff);
    }
    public int read(byte[] p0,int p1,int p2){
       Objects.requireNonNull(p0);
       if (p1 < 0 || (p2 < 0 || p2 > (p0.length - p1))) {
          throw new IndexOutOfBoundsException();
       }
       int i = this.readSkipInternal(p0, p1, p2);
       if (!i) {
          i = -1;
       }
       return i;
    }
    public final int readSkipInternal(byte[] p0,int p1,int p2){
       int i = p2;
       while (i > 0) {
          this.advanceIfCurrentPieceFullyRead();
          if (this.currentPiece == null) {
             break ;
          }else {
             int i1 = this.currentPieceSize - this.currentPieceIndex;
             i1 = Math.min(i1, i);
             if (p0 != null) {
                this.currentPiece.copyTo(p0, this.currentPieceIndex, p1, i1);
                p1 = p1 + i1;
             }
             int i2 = this.currentPieceIndex + i1;
             this.currentPieceIndex = i2;
             i = i - i1;
          }
       }
       return (p2 - i);
    }
    public synchronized void reset(){
       this.initialize();
       this.readSkipInternal(null, 0, this.mark);
    }
    public long skip(long p0){
       if (p0 < 0) {
          throw new IndexOutOfBoundsException();
       }
       int i = 0x7fffffff;
       if (p0 - i > 0) {
          p0 = i;
       }
       return (long)this.readSkipInternal(null, 0, (int)p0);
    }
}
