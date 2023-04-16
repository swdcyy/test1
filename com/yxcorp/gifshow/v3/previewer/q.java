package com.yxcorp.gifshow.v3.previewer.q;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.List;
import wba.z;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.EditAbilityConfig;
import pwc.a;
import brd.t;

public final class q implements o	// class@001608
{
    public static final q b;

    static {
       q.b = new q();
    }
    public void q(){
       super();
    }
    public final Object apply(Object p0){
       return t.just(a.h(z.x(Workspace$Type.LONG_PICTURE, p0), EditAbilityConfig.photosInMemory(i.g())));
    }
}
