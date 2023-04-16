package com.google.protobuf.ByteString$2;
import java.util.Comparator;
import java.lang.Object;
import com.google.protobuf.ByteString;
import com.google.protobuf.ByteString$ByteIterator;
import java.util.Iterator;
import java.lang.Integer;

public final class ByteString$2 implements Comparator	// class@0003cb
{

    public void ByteString$2(){
       super();
    }
    public int compare(ByteString p0,ByteString p1){
       int i;
       ByteString$ByteIterator uByteIterato = p0.iterator();
       ByteString$ByteIterator uByteIterato1 = p1.iterator();
       while (true) {
          if (!uByteIterato.hasNext() || !uByteIterato1.hasNext()) {
             return Integer.compare(p0.size(), p1.size());
          }
          i = Integer.compare(ByteString.toInt(uByteIterato.nextByte()), ByteString.toInt(uByteIterato1.nextByte()));
          if (i) {
             break ;
          }
       }
       return i;
    }
    public int compare(Object p0,Object p1){
       return this.compare(p0, p1);
    }
}
