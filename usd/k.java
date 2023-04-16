package usd.k;
import usd.g;
import usd.i;
import usd.k$a;
import nsd.u;
import java.lang.Comparable;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class k extends i implements g	// class@00261a
{
    public static final k f;
    public static final k$a g;

    static {
       k.g = new k$a(null);
       k.f = new k(1, 0);
    }
    public void k(int p0,int p1){
       super(p0, p1, 1);
    }
    public boolean contains(Comparable p0){
       return this.q(p0.intValue());
    }
    public Comparable d(){
       return this.s();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof k && (!this.isEmpty() || (p0.isEmpty() || (this.l() == p0.l() && this.m() == p0.m()))))? true: false;
       return b;
    }
    public Comparable getStart(){
       return this.t();
    }
    public int hashCode(){
       int i = (this.isEmpty())? -1: (this.l() * 31) + this.m();
       return i;
    }
    public boolean isEmpty(){
       boolean b = (this.l() > this.m())? true: false;
       return b;
    }
    public boolean q(int p0){
       boolean b = (this.l() <= p0 && p0 <= this.m())? true: false;
       return b;
    }
    public Integer s(){
       return Integer.valueOf(this.m());
    }
    public Integer t(){
       return Integer.valueOf(this.l());
    }
    public String toString(){
       return this.l()+".."+this.m();
    }
}
