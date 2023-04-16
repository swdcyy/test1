package androidx.recyclerview.widget.ConcatAdapter$Config$a;
import java.lang.Object;
import androidx.recyclerview.widget.ConcatAdapter$Config;
import androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode;

public final class ConcatAdapter$Config$a	// class@00086a
{
    public boolean a;
    public ConcatAdapter$Config$StableIdMode b;

    public void ConcatAdapter$Config$a(){
       super();
       ConcatAdapter$Config c = ConcatAdapter$Config.c;
       this.a = c.a;
       this.b = c.b;
    }
    public ConcatAdapter$Config a(){
       return new ConcatAdapter$Config(this.a, this.b);
    }
    public ConcatAdapter$Config$a b(boolean p0){
       this.a = p0;
       return this;
    }
}
