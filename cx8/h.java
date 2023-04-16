package cx8.h;
import brd.t;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.String;
import okhttp3.MultipartBody$Part;
import java.lang.Long;

public interface abstract h	// class@002017
{

    t a();
    t c(RequestTiming p0);
    t changePrivateOption(String p0,String p1);
    t d(MultipartBody$Part p0,String p1,int p2,int p3);
    t e(MultipartBody$Part p0,MultipartBody$Part p1,Long p2,Long p3,String p4,long p5,boolean p6,String p7);
    t f(int p0,String p1,String p2,String p3,String p4);
    t g(long p0);
    t h(int p0,String p1,String p2,String p3,int p4,String p5);
    t i(String p0);
    t j(String p0,String p1,String p2,int p3,String p4);
}
