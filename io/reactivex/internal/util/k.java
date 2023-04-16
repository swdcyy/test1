package io.reactivex.internal.util.k;
import java.lang.Integer;

public final class k	// class@001958
{

    public static int a(int p0){
       return (1 << (Integer.numberOfLeadingZeros((p0 - 1)) - 32));
    }
}
