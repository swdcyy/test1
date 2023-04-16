package kotlin.jvm.KotlinReflectionNotSupportedError;
import java.lang.Error;
import java.lang.String;
import java.lang.Throwable;

public class KotlinReflectionNotSupportedError extends Error	// class@00188a
{

    public void KotlinReflectionNotSupportedError(){
       super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
    public void KotlinReflectionNotSupportedError(String p0){
       super(p0);
    }
    public void KotlinReflectionNotSupportedError(String p0,Throwable p1){
       super(p0, p1);
    }
    public void KotlinReflectionNotSupportedError(Throwable p0){
       super(p0);
    }
}
