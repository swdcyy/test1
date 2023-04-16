package com.yxcorp.gifshow.util.l$a;
import androidx.lifecycle.Observer;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.Edge2EdgeHelperKt$adaptEdge2Edge$1$1;
import msd.q;
import com.yxcorp.gifshow.util.l;

public final class l$a implements Observer	// class@001f88
{
    public final Fragment b;

    public void l$a(Fragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       p0 = this.b.requireView();
       a.o(p0, "requireView\(\)");
       l.b(p0, Edge2EdgeHelperKt$adaptEdge2Edge$1$1.INSTANCE);
    }
}
