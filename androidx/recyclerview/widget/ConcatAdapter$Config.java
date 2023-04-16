package androidx.recyclerview.widget.ConcatAdapter$Config;
import androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode;
import java.lang.Object;

public final class ConcatAdapter$Config	// class@00086b
{
    public final boolean a;
    public final ConcatAdapter$Config$StableIdMode b;
    public static final ConcatAdapter$Config c;

    static {
       ConcatAdapter$Config.c = new ConcatAdapter$Config(true, ConcatAdapter$Config$StableIdMode.NO_STABLE_IDS);
    }
    public void ConcatAdapter$Config(boolean p0,ConcatAdapter$Config$StableIdMode p1){
       super();
       this.a = p0;
       this.b = p1;
    }
}
