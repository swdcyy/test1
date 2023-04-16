package okhttp3.logging.HttpLoggingInterceptor$Level;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class HttpLoggingInterceptor$Level extends Enum	// class@001fe2
{
    public static final HttpLoggingInterceptor$Level[] $VALUES;
    public static final HttpLoggingInterceptor$Level BASIC;
    public static final HttpLoggingInterceptor$Level BODY;
    public static final HttpLoggingInterceptor$Level HEADERS;
    public static final HttpLoggingInterceptor$Level NONE;

    static {
       HttpLoggingInterceptor$Level level = new HttpLoggingInterceptor$Level("NONE", 0);
       HttpLoggingInterceptor$Level.NONE = level;
       HttpLoggingInterceptor$Level level1 = new HttpLoggingInterceptor$Level("BASIC", 1);
       HttpLoggingInterceptor$Level.BASIC = level1;
       HttpLoggingInterceptor$Level level2 = new HttpLoggingInterceptor$Level("HEADERS", 2);
       HttpLoggingInterceptor$Level.HEADERS = level2;
       HttpLoggingInterceptor$Level level3 = new HttpLoggingInterceptor$Level("BODY", 3);
       HttpLoggingInterceptor$Level.BODY = level3;
       HttpLoggingInterceptor$Level[] levelArray = new HttpLoggingInterceptor$Level[]{level,level1,level2,level3};
       HttpLoggingInterceptor$Level.$VALUES = levelArray;
    }
    public void HttpLoggingInterceptor$Level(String p0,int p1){
       super(p0, p1);
    }
    public static HttpLoggingInterceptor$Level valueOf(String p0){
       return Enum.valueOf(HttpLoggingInterceptor$Level.class, p0);
    }
    public static HttpLoggingInterceptor$Level[] values(){
       return HttpLoggingInterceptor$Level.$VALUES.clone();
    }
}
