package com.kuaishou.live.core.show.photoalbum.b;
import io.reactivex.g;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import java.lang.Object;
import brd.v;
import mz6.b;
import android.content.Context;
import java.util.ArrayList;
import mz6.b$d;
import java.util.Collection;
import fd2.a;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class b implements g	// class@000d53
{
    public final LiveEntryCoverSelectSupplier b;

    public void b(LiveEntryCoverSelectSupplier p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b uob = new b(this.b.a);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new b$d(R.string.arg_RES_7f1047dc));
       uArrayList.add(new b$d(R.string.arg_RES_7f1010ff));
       uob.b(uArrayList);
       uob.l(new a(p0));
       uob.q();
    }
}
