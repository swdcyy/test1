package com.google.common.util.concurrent.AtomicDouble;
import java.lang.Number;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Double;
import java.io.ObjectInputStream;
import java.lang.String;
import java.io.ObjectOutputStream;

public class AtomicDouble extends Number	// class@00053d
{
    public AtomicLong b;
    public static final long serialVersionUID;

    public void AtomicDouble(){
       super(0);
    }
    public void AtomicDouble(double p0){
       super();
       this.b = new AtomicLong(Double.doubleToRawLongBits(p0));
    }
    public final double addAndGet(double p0){
       long l;
       double d;
       do {
          l = this.b.get();
          d = Double.longBitsToDouble(l) + p0;
       } while (this.b.compareAndSet(l, Double.doubleToRawLongBits(d)));
       return d;
    }
    public final boolean compareAndSet(double p0,double p1){
       return this.b.compareAndSet(Double.doubleToRawLongBits(p0), Double.doubleToRawLongBits(p1));
    }
    public double doubleValue(){
       return this.get();
    }
    public float floatValue(){
       return (float)this.get();
    }
    public final double get(){
       return Double.longBitsToDouble(this.b.get());
    }
    public final double getAndAdd(double p0){
       long l;
       double d;
       double d1;
       do {
          l = this.b.get();
          d = Double.longBitsToDouble(l);
          d1 = d + p0;
       } while (this.b.compareAndSet(l, Double.doubleToRawLongBits(d1)));
       return d;
    }
    public final double getAndSet(double p0){
       return Double.longBitsToDouble(this.b.getAndSet(Double.doubleToRawLongBits(p0)));
    }
    public int intValue(){
       return (int)this.get();
    }
    public final void lazySet(double p0){
       this.b.lazySet(Double.doubleToRawLongBits(p0));
    }
    public long longValue(){
       return (long)this.get();
    }
    public final void readObject(ObjectInputStream p0){
       p0.defaultReadObject();
       this.b = new AtomicLong();
       this.set(p0.readDouble());
    }
    public final void set(double p0){
       this.b.set(Double.doubleToRawLongBits(p0));
    }
    public String toString(){
       return Double.toString(this.get());
    }
    public final boolean weakCompareAndSet(double p0,double p1){
       return this.b.weakCompareAndSet(Double.doubleToRawLongBits(p0), Double.doubleToRawLongBits(p1));
    }
    public final void writeObject(ObjectOutputStream p0){
       p0.defaultWriteObject();
       p0.writeDouble(this.get());
    }
}
