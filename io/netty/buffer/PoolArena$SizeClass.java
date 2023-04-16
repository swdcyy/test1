package io.netty.buffer.PoolArena$SizeClass;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PoolArena$SizeClass extends Enum	// class@00103d
{
    public static final PoolArena$SizeClass[] $VALUES;
    public static final PoolArena$SizeClass Normal;
    public static final PoolArena$SizeClass Small;
    public static final PoolArena$SizeClass Tiny;

    static {
       PoolArena$SizeClass sizeClass = new PoolArena$SizeClass("Tiny", 0);
       PoolArena$SizeClass.Tiny = sizeClass;
       PoolArena$SizeClass sizeClass1 = new PoolArena$SizeClass("Small", 1);
       PoolArena$SizeClass.Small = sizeClass1;
       PoolArena$SizeClass sizeClass2 = new PoolArena$SizeClass("Normal", 2);
       PoolArena$SizeClass.Normal = sizeClass2;
       PoolArena$SizeClass[] sizeClassArr = new PoolArena$SizeClass[]{sizeClass,sizeClass1,sizeClass2};
       PoolArena$SizeClass.$VALUES = sizeClassArr;
    }
    public void PoolArena$SizeClass(String p0,int p1){
       super(p0, p1);
    }
    public static PoolArena$SizeClass valueOf(String p0){
       return Enum.valueOf(PoolArena$SizeClass.class, p0);
    }
    public static PoolArena$SizeClass[] values(){
       return PoolArena$SizeClass.$VALUES.clone();
    }
}
