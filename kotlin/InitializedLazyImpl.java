package kotlin.InitializedLazyImpl;
import qrd.p;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class InitializedLazyImpl implements p, Serializable	// class@00180d
{
    public final Object value;

    public void InitializedLazyImpl(Object p0){
       super();
       this.value = p0;
    }
    public Object getValue(){
       return this.value;
    }
    public boolean isInitialized(){
       return true;
    }
    public String toString(){
       return String.valueOf(this.getValue());
    }
}
