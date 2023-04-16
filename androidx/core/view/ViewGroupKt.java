package androidx.core.view.ViewGroupKt;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import wsd.m;
import androidx.core.view.ViewGroupKt$a;
import androidx.core.view.ViewGroupKt$descendants$1;
import asd.c;
import msd.p;
import wsd.q;
import java.util.Iterator;
import androidx.core.view.ViewGroupKt$b;

public final class ViewGroupKt	// class@000720
{

    public static final View a(ViewGroup p0,int p1){
       a.p(p0, "$this$get");
       View childAt = p0.getChildAt(p1);
       if (childAt != null) {
          return childAt;
       }
       throw new IndexOutOfBoundsException("Index: "+p1+", Size: "+p0.getChildCount());
    }
    public static final m b(ViewGroup p0){
       a.p(p0, "$this$children");
       return new ViewGroupKt$a(p0);
    }
    public static final m c(ViewGroup p0){
       a.p(p0, "$this$descendants");
       return q.e(new ViewGroupKt$descendants$1(p0, null));
    }
    public static final Iterator d(ViewGroup p0){
       a.p(p0, "$this$iterator");
       return new ViewGroupKt$b(p0);
    }
}
