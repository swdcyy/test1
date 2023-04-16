package com.smile.gifshow.annotation.plugin.a;
import com.smile.gifshow.annotation.plugin.Factory;
import com.smile.gifshow.annotation.plugin.a$a;
import java.lang.Class;
import java.lang.Float;
import java.lang.Double;
import java.lang.Byte;
import java.lang.Character;
import java.lang.Short;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.ClassLoader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class a extends Factory	// class@000fd6
{
    public final Class a;
    public static final InvocationHandler b;

    static {
       a.b = new a$a();
    }
    public void a(Class p0){
       super();
       this.a = p0;
    }
    public static boolean a(Class p0){
       boolean b = (p0 != Float.TYPE && (p0 != Double.TYPE && (p0 == Float.class || p0 == Double.class)))? true: false;
       return b;
    }
    public static boolean b(Class p0){
       boolean b = (p0 != Byte.TYPE && (p0 != Character.TYPE && (p0 != Short.TYPE && (p0 != Integer.TYPE && (p0 != Long.TYPE && (p0 != Byte.class && (p0 != Character.class && (p0 != Short.class && (p0 == Integer.class || p0 == Long.class)))))))))? true: false;
       return b;
    }
    public Object newInstance(){
       Class[] uClassArray = new Class[]{this.a};
       return Proxy.newProxyInstance(this.a.getClassLoader(), uClassArray, a.b);
    }
}
