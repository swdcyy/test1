package com.google.common.collect.Iterators$EmptyModifiableIterator;
import java.util.Iterator;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.NoSuchElementException;
import qk.g;

public final class Iterators$EmptyModifiableIterator extends Enum implements Iterator	// class@00180d
{
    public static final Iterators$EmptyModifiableIterator[] $VALUES;
    public static final Iterators$EmptyModifiableIterator INSTANCE;

    static {
       Iterators$EmptyModifiableIterator uEmptyModifi = new Iterators$EmptyModifiableIterator("INSTANCE", 0);
       Iterators$EmptyModifiableIterator.INSTANCE = uEmptyModifi;
       Iterators$EmptyModifiableIterator[] uEmptyModifi1 = new Iterators$EmptyModifiableIterator[]{uEmptyModifi};
       Iterators$EmptyModifiableIterator.$VALUES = uEmptyModifi1;
    }
    public void Iterators$EmptyModifiableIterator(String p0,int p1){
       super(p0, p1);
    }
    public static Iterators$EmptyModifiableIterator valueOf(String p0){
       return Enum.valueOf(Iterators$EmptyModifiableIterator.class, p0);
    }
    public static Iterators$EmptyModifiableIterator[] values(){
       return Iterators$EmptyModifiableIterator.$VALUES.clone();
    }
    public boolean hasNext(){
       return false;
    }
    public Object next(){
       throw new NoSuchElementException();
    }
    public void remove(){
       g.c(false);
    }
}
