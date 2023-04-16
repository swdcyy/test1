package io.reactivex.internal.util.HashMapSupplier;
import java.util.concurrent.Callable;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;

public final class HashMapSupplier extends Enum implements Callable	// class@0014cc
{
    public static final HashMapSupplier[] $VALUES;
    public static final HashMapSupplier INSTANCE;

    static {
       HashMapSupplier hashMapSuppl = new HashMapSupplier("INSTANCE", 0);
       HashMapSupplier.INSTANCE = hashMapSuppl;
       HashMapSupplier[] hashMapSuppl1 = new HashMapSupplier[]{hashMapSuppl};
       HashMapSupplier.$VALUES = hashMapSuppl1;
    }
    public void HashMapSupplier(String p0,int p1){
       super(p0, p1);
    }
    public static Callable asCallable(){
       return HashMapSupplier.INSTANCE;
    }
    public static HashMapSupplier valueOf(String p0){
       return Enum.valueOf(HashMapSupplier.class, p0);
    }
    public static HashMapSupplier[] values(){
       return HashMapSupplier.$VALUES.clone();
    }
    public Object call(){
       return this.call();
    }
    public Map call(){
       return new HashMap();
    }
}
