package com.beloo.widget.chipslayoutmanager.a$a;
import com.beloo.widget.chipslayoutmanager.a;
import java.lang.Object;
import android.util.SparseArray;

public class a$a	// class@000f06
{
    public SparseArray a;
    public SparseArray b;
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
       this.a = new SparseArray();
       this.b = new SparseArray();
    }
    public SparseArray a(){
       return this.a;
    }
    public SparseArray b(){
       return this.b;
    }
    public int c(){
       return (this.a.size() + this.b.size());
    }
}
