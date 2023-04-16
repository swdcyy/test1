package com.yxcorp.gifshow.edit.draft.model.DraftFileGuard$readDraftInfoMap$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.util.List;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileGuard;

public final class DraftFileGuard$readDraftInfoMap$1 extends Lambda implements l	// class@001ae5
{
    public final File $dir;
    public final List $guardDirList;

    public void DraftFileGuard$readDraftInfoMap$1(File p0,List p1){
       this.$dir = p0;
       this.$guardDirList = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftFileGuard$readDraftInfoMap$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return DraftFileGuard.b.k(this.$dir, p0, this.$guardDirList);
    }
}
