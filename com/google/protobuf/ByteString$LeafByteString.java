package com.google.protobuf.ByteString$LeafByteString;
import com.google.protobuf.ByteString;
import java.util.Iterator;
import com.google.protobuf.ByteString$ByteIterator;
import com.google.protobuf.ByteOutput;

public abstract class ByteString$LeafByteString extends ByteString	// class@0003d2
{

    public void ByteString$LeafByteString(){
       super();
    }
    public abstract boolean equalsRange(ByteString p0,int p1,int p2);
    public final int getTreeDepth(){
       return 0;
    }
    public final boolean isBalanced(){
       return true;
    }
    public Iterator iterator(){
       return super.iterator();
    }
    public void writeToReverse(ByteOutput p0){
       this.writeTo(p0);
    }
}
