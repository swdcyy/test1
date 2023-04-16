package iy1.l;
import java.util.HashMap;
import iy1.l$d;
import java.lang.String;
import iy1.l$c;
import iy1.l$b;
import jy1.b;

public interface abstract l	// class@0029cd
{
    public static final Map a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    public static final l g;
    public static final l h;
    public static final l i;
    public static final l j;

    static {
       l.a = new HashMap();
       l.b = new l$d("temporaryEnhance_districtHourRankStriking");
       l.c = new l$d("temporaryEnhance_districtHourRankNormal");
       l.d = new l$d("temporaryEnhance_districtHourRankStrength");
       l.e = new l$d("temporaryEnhance_popularityRankStrength");
       l.f = new l$d("temporaryEnhance_fansGroupPopularRankStrength");
       l.g = new l$d("temporaryEnhance_districtHourRankMerchant");
       l.h = new l$d("temporaryEnhance_districtDynamicHourRankMerchant");
       l.i = new l$c();
       l.j = new l$b();
    }
    b a();
    String b();
    int getPriority();
}
