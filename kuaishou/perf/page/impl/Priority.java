package kuaishou.perf.page.impl.Priority;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Priority extends Enum	// class@001bea
{
    public String value;
    public static final Priority[] $VALUES;
    public static final Priority P0;
    public static final Priority P1;
    public static final Priority P2;

    static {
       Priority priority = new Priority("P0", 0, "P0");
       Priority.P0 = priority;
       Priority priority1 = new Priority("P1", 1, "P1");
       Priority.P1 = priority1;
       Priority priority2 = new Priority("P2", 2, "P2");
       Priority.P2 = priority2;
       Priority[] priorityArra = new Priority[]{priority,priority1,priority2};
       Priority.$VALUES = priorityArra;
    }
    public void Priority(String p0,int p1,String p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Priority valueOf(String p0){
       return Enum.valueOf(Priority.class, p0);
    }
    public static Priority[] values(){
       return Priority.$VALUES.clone();
    }
    public String getValue(){
       return this.value;
    }
}
