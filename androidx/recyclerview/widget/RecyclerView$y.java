package androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class RecyclerView$y	// class@0008a6
{
    public int a;
    public SparseArray b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public long n;
    public int o;
    public int p;
    public int q;

    public void RecyclerView$y(){
       super();
       this.a = -1;
       this.c = 0;
       this.d = 0;
       this.e = 1;
       this.f = 0;
       this.g = false;
       this.h = false;
       this.i = false;
       this.j = false;
       this.k = false;
       this.l = false;
    }
    public void a(int p0){
       if (this.e & p0) {
          return;
       }
       throw new IllegalStateException("Layout state should be one of "+Integer.toBinaryString(p0)+" but it is "+Integer.toBinaryString(this.e));
    }
    public boolean b(){
       return this.g;
    }
    public int c(){
       int i = (this.h != null)? this.c - this.d: this.f;
       return i;
    }
    public int d(){
       return this.a;
    }
    public boolean e(){
       boolean b = (this.a != -1)? true: false;
       return b;
    }
    public boolean f(){
       return this.j;
    }
    public boolean g(){
       return this.h;
    }
    public void h(RecyclerView$Adapter p0){
       this.e = 1;
       this.f = p0.getItemCount();
       this.h = false;
       this.i = false;
       this.j = false;
    }
    public boolean i(){
       return this.l;
    }
    public boolean j(){
       return this.k;
    }
    public String toString(){
       return "State{mTargetPosition="+this.a+", mData="+this.b+", mItemCount="+this.f+", mIsMeasuring="+this.j+", mPreviousLayoutItemCount="+this.c+", mDeletedInvisibleItemCountSincePreviousLayout="+this.d+", mStructureChanged="+this.g+", mInPreLayout="+this.h+", mRunSimpleAnimations="+this.k+", mRunPredictiveAnimations="+this.l+'}';
    }
}
