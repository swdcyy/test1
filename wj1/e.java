package wj1.e;
import wj1.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public abstract class e extends d	// class@00454b
{
    public boolean d;
    public boolean e;
    public static final int[][] f;
    public static final int[][] g;

    static {
       int[][] ointArray = new int[][5]{new int[3]{0xff222222,0x33222222,0x222222},new int[3]{0xe6ffb431,0x4dffb431,0xffb431},new int[3]{0xe6fd637e,0x66fd637e,0xfd637e},new int[4]{0xffa44fe3,0xcc5f20ff,0x4d5f20ff,0x5f20ff},new int[4]{0xffa44fe3,0xcc3ad2ff,0x4d3ad2ff,0x3ad2ff}};
       e.f = ointArray;
       int[][] ointArray1 = new int[][5]{new int[3]{0xff222222,0x33222222,0x222222},new int[3]{0xffffb431,0x4dffb431,0xffb431},new int[3]{0xfffd637e,0x66fd637e,0xfd637e},new int[4]{0xffa44fe3,0xcc5f20ff,0x665f20ff,0x5f20ff},new int[4]{0xffa44fe3,0xcc3ad2ff,0x663ad2ff,0x3ad2ff}};
       e.g = ointArray1;
    }
    public void e(){
       super();
    }
    public int[][] n(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e != null) {
          return e.g;
       }
       if (this.d != null) {
          return e.f;
       }
       return super.n();
    }
}
