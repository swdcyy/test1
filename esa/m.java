package esa.m;
import msd.a;
import esa.n;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public final class m implements a	// class@0027cd
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final Object invoke(){
       m tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[]{tb,tb.h};
       return Lists.e(objArray);
    }
}
