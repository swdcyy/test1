package io.reactivex.internal.functions.Functions$HashSetCallable;
import java.util.concurrent.Callable;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Set;
import java.util.HashSet;

public final class Functions$HashSetCallable extends Enum implements Callable	// class@0011ae
{
    public static final Functions$HashSetCallable[] $VALUES;
    public static final Functions$HashSetCallable INSTANCE;

    static {
       Functions$HashSetCallable hashSetCalla = new Functions$HashSetCallable("INSTANCE", 0);
       Functions$HashSetCallable.INSTANCE = hashSetCalla;
       Functions$HashSetCallable[] hashSetCalla1 = new Functions$HashSetCallable[]{hashSetCalla};
       Functions$HashSetCallable.$VALUES = hashSetCalla1;
    }
    public void Functions$HashSetCallable(String p0,int p1){
       super(p0, p1);
    }
    public static Functions$HashSetCallable valueOf(String p0){
       return Enum.valueOf(Functions$HashSetCallable.class, p0);
    }
    public static Functions$HashSetCallable[] values(){
       return Functions$HashSetCallable.$VALUES.clone();
    }
    public Object call(){
       return this.call();
    }
    public Set call(){
       return new HashSet();
    }
}
