package com.google.protobuf.SmallSortedMap$EmptySet;
import com.google.protobuf.SmallSortedMap$EmptySet$1;
import com.google.protobuf.SmallSortedMap$EmptySet$2;
import java.lang.Object;
import java.lang.Iterable;

public class SmallSortedMap$EmptySet	// class@0004ae
{
    public static final Iterable ITERABLE;
    public static final Iterator ITERATOR;

    static {
       SmallSortedMap$EmptySet.ITERATOR = new SmallSortedMap$EmptySet$1();
       SmallSortedMap$EmptySet.ITERABLE = new SmallSortedMap$EmptySet$2();
    }
    public void SmallSortedMap$EmptySet(){
       super();
    }
    public static Iterable iterable(){
       return SmallSortedMap$EmptySet.ITERABLE;
    }
}
