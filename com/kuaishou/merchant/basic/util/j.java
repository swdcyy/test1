package com.kuaishou.merchant.basic.util.j;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.util.Collection;
import ekd.q;
import android.util.SparseArray;
import java.util.Iterator;
import android.util.Pair;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import brd.t;
import com.kuaishou.merchant.basic.util.MerchantRatingHelper$MerchantRatingInternalException;
import java.lang.String;

public final class j implements o	// class@0015df
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final Object apply(Object p0){
       if (q.f(p0)) {
          throw new MerchantRatingHelper$MerchantRatingInternalException("setRatingDrawable, results is empty");
       }
       SparseArray sparseArray = new SparseArray();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          Pair pair = p0.next();
          sparseArray.append(pair.first.intValue(), pair.second);
       }
       return t.just(sparseArray);
    }
}
