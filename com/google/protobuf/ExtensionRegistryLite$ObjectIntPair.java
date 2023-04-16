package com.google.protobuf.ExtensionRegistryLite$ObjectIntPair;
import java.lang.Object;
import java.lang.System;

public final class ExtensionRegistryLite$ObjectIntPair	// class@00040c
{
    public final int number;
    public final Object object;

    public void ExtensionRegistryLite$ObjectIntPair(Object p0,int p1){
       super();
       this.object = p0;
       this.number = p1;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof ExtensionRegistryLite$ObjectIntPair) {
          return b;
       }
       if (this.object == p0.object && this.number == p0.number) {
          b = true;
       }
       return b;
    }
    public int hashCode(){
       return ((System.identityHashCode(this.object) * 0xffff) + this.number);
    }
}
