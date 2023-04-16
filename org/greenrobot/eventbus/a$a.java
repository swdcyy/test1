package org.greenrobot.eventbus.a$a;
import java.lang.ThreadLocal;
import org.greenrobot.eventbus.a;
import java.lang.Object;
import org.greenrobot.eventbus.a$d;

public class a$a extends ThreadLocal	// class@002123
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public Object initialValue(){
       return new a$d();
    }
}
