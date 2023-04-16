package com.kuaishou.live.core.show.photoalbum.d;
import erd.o;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import w69.i;
import java.lang.Object;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier$SelectType;
import java.util.Objects;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import java.lang.String;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import fd2.c;

public final class d implements o	// class@000d70
{
    public final LiveEntryCoverSelectSupplier b;
    public final i c;

    public void d(LiveEntryCoverSelectSupplier p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       String str = (p0 == LiveEntryCoverSelectSupplier$SelectType.CAMERA)? "android.permission.CAMERA": "android.permission.WRITE_EXTERNAL_STORAGE";
       return a.h(tb.b, tb.a, str).flatMap(new c(tb, tc, p0));
    }
}
