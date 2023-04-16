package fk0.j;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class j	// class@00236a
{
    public String bundleId;
    public MemoryEvent contentAppearedMemory;
    public MemoryEvent endRunMemory;
    public MemoryEvent entryMemory;
    public MemoryEvent initMemory;
    public KrnLogCommonParams krnLogCommonParams;
    public final String loadType;
    public MemoryEvent onPauseMemory;
    public Double sampleRatio;
    public MemoryEvent startRunMemory;

    public void j(){
       super("", null);
    }
    public void j(String p0,String p1){
       a.p(p0, "bundleId");
       super();
       this.bundleId = p0;
       this.loadType = p1;
    }
}
