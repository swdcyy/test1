package com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer;
import android.os.Parcelable;
import com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer$a;
import android.os.Parcel;
import java.lang.Integer;
import java.lang.Object;
import java.util.TreeSet;
import java.util.LinkedList;
import java.lang.ClassLoader;
import java.lang.Class;
import java.util.List;
import java.util.Collection;
import java.util.NavigableSet;

public final class CacheParcelableContainer implements Parcelable	// class@000f0e
{
    public NavigableSet b;
    public NavigableSet c;
    public static final Parcelable$Creator CREATOR;

    static {
       CacheParcelableContainer.CREATOR = new CacheParcelableContainer$a();
    }
    public void CacheParcelableContainer(Parcel p0){
       super();
       this.b = new TreeSet();
       this.c = new TreeSet();
       LinkedList linkedList = new LinkedList();
       LinkedList linkedList1 = new LinkedList();
       p0.readList(linkedList, Integer.class.getClassLoader());
       p0.readList(linkedList1, Integer.class.getClassLoader());
       this.b = new TreeSet(linkedList);
       this.c = new TreeSet(linkedList1);
    }
    public void CacheParcelableContainer(NavigableSet p0,NavigableSet p1){
       super();
       this.b = new TreeSet();
       this.c = new TreeSet();
       this.b = p0;
       this.c = p1;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeList(new LinkedList(this.b));
       p0.writeList(new LinkedList(this.c));
    }
}
