package jm8.a;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Class;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class a extends Factory	// class@001b6c
{
    public final Class a;

    public void a(Class p0){
       super();
       this.a = p0;
    }
    public Object newInstance(){
       return this.a.newInstance();
    }
}
