package com.google.common.collect.AllEqualOrdering;
import java.io.Serializable;
import com.google.common.collect.Ordering;
import java.lang.Object;
import java.lang.Iterable;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.String;

public final class AllEqualOrdering extends Ordering implements Serializable	// class@0017a4
{
    public static final AllEqualOrdering INSTANCE;
    public static final long serialVersionUID;

    static {
       AllEqualOrdering.INSTANCE = new AllEqualOrdering();
    }
    public void AllEqualOrdering(){
       super();
    }
    public int compare(Object p0,Object p1){
       return 0;
    }
    public ImmutableList immutableSortedCopy(Iterable p0){
       return ImmutableList.copyOf(p0);
    }
    public final Object readResolve(){
       return AllEqualOrdering.INSTANCE;
    }
    public Ordering reverse(){
       return this;
    }
    public List sortedCopy(Iterable p0){
       return Lists.c(p0);
    }
    public String toString(){
       return "Ordering.allEqual\(\)";
    }
}
