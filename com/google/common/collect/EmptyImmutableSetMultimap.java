package com.google.common.collect.EmptyImmutableSetMultimap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableMap;
import java.util.Comparator;
import java.lang.Object;

public class EmptyImmutableSetMultimap extends ImmutableSetMultimap	// class@0017c5
{
    public static final EmptyImmutableSetMultimap INSTANCE;
    public static final long serialVersionUID;

    static {
       EmptyImmutableSetMultimap.INSTANCE = new EmptyImmutableSetMultimap();
    }
    public void EmptyImmutableSetMultimap(){
       super(ImmutableMap.of(), 0, null);
    }
    public final Object readResolve(){
       return EmptyImmutableSetMultimap.INSTANCE;
    }
}
