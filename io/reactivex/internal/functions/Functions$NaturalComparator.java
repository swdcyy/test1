package io.reactivex.internal.functions.Functions$NaturalComparator;
import java.util.Comparator;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Comparable;

public final class Functions$NaturalComparator extends Enum implements Comparator	// class@0011af
{
    public static final Functions$NaturalComparator[] $VALUES;
    public static final Functions$NaturalComparator INSTANCE;

    static {
       Functions$NaturalComparator naturalCompa = new Functions$NaturalComparator("INSTANCE", 0);
       Functions$NaturalComparator.INSTANCE = naturalCompa;
       Functions$NaturalComparator[] naturalCompa1 = new Functions$NaturalComparator[]{naturalCompa};
       Functions$NaturalComparator.$VALUES = naturalCompa1;
    }
    public void Functions$NaturalComparator(String p0,int p1){
       super(p0, p1);
    }
    public static Functions$NaturalComparator valueOf(String p0){
       return Enum.valueOf(Functions$NaturalComparator.class, p0);
    }
    public static Functions$NaturalComparator[] values(){
       return Functions$NaturalComparator.$VALUES.clone();
    }
    public int compare(Object p0,Object p1){
       return p0.compareTo(p1);
    }
}
