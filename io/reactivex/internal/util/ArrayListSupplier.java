package io.reactivex.internal.util.ArrayListSupplier;
import java.util.concurrent.Callable;
import erd.o;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.List;
import java.util.ArrayList;

public final class ArrayListSupplier extends Enum implements Callable, o	// class@0014c6
{
    public static final ArrayListSupplier[] $VALUES;
    public static final ArrayListSupplier INSTANCE;

    static {
       ArrayListSupplier uArrayListSu = new ArrayListSupplier("INSTANCE", 0);
       ArrayListSupplier.INSTANCE = uArrayListSu;
       ArrayListSupplier[] uArrayListSu1 = new ArrayListSupplier[]{uArrayListSu};
       ArrayListSupplier.$VALUES = uArrayListSu1;
    }
    public void ArrayListSupplier(String p0,int p1){
       super(p0, p1);
    }
    public static Callable asCallable(){
       return ArrayListSupplier.INSTANCE;
    }
    public static o asFunction(){
       return ArrayListSupplier.INSTANCE;
    }
    public static ArrayListSupplier valueOf(String p0){
       return Enum.valueOf(ArrayListSupplier.class, p0);
    }
    public static ArrayListSupplier[] values(){
       return ArrayListSupplier.$VALUES.clone();
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
    public List apply(Object p0){
       return new ArrayList();
    }
    public Object call(){
       return this.call();
    }
    public List call(){
       return new ArrayList();
    }
}
