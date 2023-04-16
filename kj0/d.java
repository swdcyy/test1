package kj0.d;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import com.google.gson.JsonElement;

public interface abstract d	// class@002d45
{

    Object a(String p0,String p1,Type p2,Object p3);
    JsonElement b(String p0,String p1,JsonElement p2);
    String c(String p0,String p1,String p2);
    int d(String p0,String p1,int p2);
    long e(String p0,String p1,long p2);
    boolean f(String p0,String p1,boolean p2);
    JsonElement g(String p0,JsonElement p1);
    boolean getBoolean(String p0,boolean p1);
    int getInt(String p0,int p1);
    long getLong(String p0,long p1);
    String getString(String p0,String p1);
    Object getValue(String p0,Type p1,Object p2);
}
