package com.google.protobuf.RopeByteString$PieceIterator;
import java.util.Iterator;
import com.google.protobuf.ByteString;
import java.lang.Object;
import com.google.protobuf.RopeByteString;
import java.util.ArrayDeque;
import com.google.protobuf.ByteString$LeafByteString;
import com.google.protobuf.RopeByteString$1;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public final class RopeByteString$PieceIterator implements Iterator	// class@0004a3
{
    public final ArrayDeque breadCrumbs;
    public ByteString$LeafByteString next;

    public void RopeByteString$PieceIterator(ByteString p0){
       super();
       if (p0 instanceof RopeByteString) {
          ArrayDeque uArrayDeque = new ArrayDeque(p0.getTreeDepth());
          this.breadCrumbs = uArrayDeque;
          uArrayDeque.push(p0);
          this.next = this.getLeafByLeft(p0.left);
       }else {
          this.breadCrumbs = null;
          this.next = p0;
       }
       return;
    }
    public void RopeByteString$PieceIterator(ByteString p0,RopeByteString$1 p1){
       super(p0);
    }
    public final ByteString$LeafByteString getLeafByLeft(ByteString p0){
       while (p0 instanceof RopeByteString) {
          this.breadCrumbs.push(p0);
          RopeByteString left = p0.left;
       }
       return p0;
    }
    public final ByteString$LeafByteString getNextNonEmptyLeaf(){
       ByteString$LeafByteString leafByLeft;
       while (true) {
          RopeByteString$PieceIterator tbreadCrumbs = this.breadCrumbs;
          if (tbreadCrumbs == null || tbreadCrumbs.isEmpty()) {
             return null;
          }
          leafByLeft = this.getLeafByLeft(this.breadCrumbs.pop().right);
          if (!leafByLeft.isEmpty()) {
             break ;
          }
       }
       return leafByLeft;
    }
    public boolean hasNext(){
       boolean b = (this.next != null)? true: false;
       return b;
    }
    public ByteString$LeafByteString next(){
       RopeByteString$PieceIterator tnext = this.next;
       if (tnext == null) {
          throw new NoSuchElementException();
       }
       this.next = this.getNextNonEmptyLeaf();
       return tnext;
    }
    public Object next(){
       return this.next();
    }
    public void remove(){
       throw new UnsupportedOperationException();
    }
}
