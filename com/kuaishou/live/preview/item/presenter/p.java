package com.kuaishou.live.preview.item.presenter.p;
import lnc.c3$a;
import java.lang.Object;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;

public final class p implements c3$a	// class@000e3b
{
    public static final p a;

    static {
       p.a = new p();
    }
    public void p(){
       super();
    }
    public final void apply(Object p0){
       p0.setEntryAuthorProfileCnt((p0.getEntryAuthorProfileCnt() + 1));
    }
}
