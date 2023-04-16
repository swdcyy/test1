package com.yxcorp.gifshow.record.album.a0;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.record.album.LocalAlbumUtils;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.record.album.d1;
import com.yxcorp.gifshow.record.album.w0;

public final class a0 implements o	// class@00170b
{
    public static final a0 b;

    static {
       a0.b = new a0();
    }
    public void a0(){
       super();
    }
    public final Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, null, LocalAlbumUtils.class, "22");
       if (ot != PatchProxyResult.class) {
       }else if(LocalAlbumUtils.u(p0)){
          ot = t.just(p0);
       }else {
          ot = DraftFileManager.E().m0(p0).observeOn(d.a).map(d1.b).flatMap(w0.b);
       }
       return ot;
    }
}
