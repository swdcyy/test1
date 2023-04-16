package androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RecyclerView$Adapter$StateRestorationPolicy extends Enum	// class@00087c
{
    public static final RecyclerView$Adapter$StateRestorationPolicy[] $VALUES;
    public static final RecyclerView$Adapter$StateRestorationPolicy ALLOW;
    public static final RecyclerView$Adapter$StateRestorationPolicy PREVENT;
    public static final RecyclerView$Adapter$StateRestorationPolicy PREVENT_WHEN_EMPTY;

    static {
       RecyclerView$Adapter$StateRestorationPolicy uAdapter$Sta = new RecyclerView$Adapter$StateRestorationPolicy("ALLOW", 0);
       RecyclerView$Adapter$StateRestorationPolicy.ALLOW = uAdapter$Sta;
       RecyclerView$Adapter$StateRestorationPolicy uAdapter$Sta1 = new RecyclerView$Adapter$StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1);
       RecyclerView$Adapter$StateRestorationPolicy.PREVENT_WHEN_EMPTY = uAdapter$Sta1;
       RecyclerView$Adapter$StateRestorationPolicy uAdapter$Sta2 = new RecyclerView$Adapter$StateRestorationPolicy("PREVENT", 2);
       RecyclerView$Adapter$StateRestorationPolicy.PREVENT = uAdapter$Sta2;
       RecyclerView$Adapter$StateRestorationPolicy[] uAdapter$Sta3 = new RecyclerView$Adapter$StateRestorationPolicy[]{uAdapter$Sta,uAdapter$Sta1,uAdapter$Sta2};
       RecyclerView$Adapter$StateRestorationPolicy.$VALUES = uAdapter$Sta3;
    }
    public void RecyclerView$Adapter$StateRestorationPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static RecyclerView$Adapter$StateRestorationPolicy valueOf(String p0){
       return Enum.valueOf(RecyclerView$Adapter$StateRestorationPolicy.class, p0);
    }
    public static RecyclerView$Adapter$StateRestorationPolicy[] values(){
       return RecyclerView$Adapter$StateRestorationPolicy.$VALUES.clone();
    }
}
