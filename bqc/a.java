package bqc.a;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.Object;

public final class a	// class@000462
{
    public static final int a;
    public static final int b;
    public static final int c;
    public static final float d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final a l;

    static {
       a.l = new a();
       a.a = a1.e(8.00f);
       a.b = a1.e(60.00f);
       int i = (PostExperimentUtils.t1())? a1.e(17.00f): a1.e(19.00f);
       a.c = i;
       float f = (PostExperimentUtils.t1())? 0x3f800000: 0x3f44ec4f;
       a.d = f;
       int i1 = a1.e(4.00f);
       a.e = i1;
       i = (int)((float)(a1.h() - (i * 2)) * 0x3e546cf0) + (i1 * 2);
       a.f = i;
       a.g = (int)((float)i * f);
       a.h = (int)(((float)(i - (i1 * 2)) * 0.23f) - (float)i1);
       a.i = (int)(((float)(i - (i1 * 2)) * 0.23f) - (float)(i1 * 2));
       i = (PostExperimentUtils.t1())? a1.e(36.00f): a1.e(18.00f);
       a.j = i;
       a.k = a1.e(3.00f);
    }
    public void a(){
       super();
    }
    public final int a(){
       return a.a;
    }
    public final int b(){
       return a.g;
    }
    public final int c(){
       return a.h;
    }
    public final int d(){
       return a.f;
    }
}
