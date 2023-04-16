package com.kuaishou.webkit.DateSorter;
import android.content.Context;
import java.lang.Object;
import android.webkit.DateSorter;
import java.lang.String;

public class DateSorter	// class@001249
{
    public DateSorter mDateSorter;

    public void DateSorter(Context p0){
       super();
       this.mDateSorter = new DateSorter(p0);
    }
    public long getBoundary(int p0){
       return this.mDateSorter.getBoundary(p0);
    }
    public int getIndex(long p0){
       return this.mDateSorter.getIndex(p0);
    }
    public String getLabel(int p0){
       return this.mDateSorter.getLabel(p0);
    }
}
