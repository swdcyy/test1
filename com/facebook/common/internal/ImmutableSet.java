package com.facebook.common.internal.ImmutableSet;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;

public class ImmutableSet extends HashSet	// class@001057
{

    public void ImmutableSet(Set p0){
       super(p0);
    }
    public static ImmutableSet copyOf(Set p0){
       return new ImmutableSet(p0);
    }
    public static ImmutableSet of(Object[] p0){
       HashSet hashSet = new HashSet(p0.length);
       Collections.addAll(hashSet, p0);
       return new ImmutableSet(hashSet);
    }
}
