package com.facebook.common.internal.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;

public class ImmutableList extends ArrayList	// class@001055
{

    public void ImmutableList(int p0){
       super(p0);
    }
    public void ImmutableList(List p0){
       super(p0);
    }
    public static ImmutableList copyOf(List p0){
       return new ImmutableList(p0);
    }
    public static ImmutableList of(Object[] p0){
       ImmutableList immutableLis = new ImmutableList(p0.length);
       Collections.addAll(immutableLis, p0);
       return immutableLis;
    }
}
