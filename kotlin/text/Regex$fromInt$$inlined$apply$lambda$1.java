package kotlin.text.Regex$fromInt$$inlined$apply$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Enum;
import java.lang.Boolean;
import zsd.g;

public final class Regex$fromInt$$inlined$apply$lambda$1 extends Lambda implements l	// class@0018f7
{
    public final int $value$inlined;

    public void Regex$fromInt$$inlined$apply$lambda$1(int p0){
       this.$value$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Enum p0){
       boolean b = ((this.$value$inlined & p0.getMask()) == p0.getValue())? true: false;
       return b;
    }
}
